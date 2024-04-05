package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p618lp.C18215a;

final class ClassJsonAdapter<T> extends JsonAdapter<T> {
    public static final JsonAdapter.C17360e FACTORY = new C17353a();
    private final C17398j<T> classFactory;
    private final C17354b<?>[] fieldsArray;
    private final JsonReader.C17362b options;

    /* renamed from: com.squareup.moshi.ClassJsonAdapter$a */
    public class C17353a implements JsonAdapter.C17360e {
        /* renamed from: a */
        public static void m29082a(Type type, Class cls) {
            Class<?> c = C17387a0.m29125c(type);
            if (cls.isAssignableFrom(c)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + c.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        public final JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
            C17398j jVar;
            C17402n nVar;
            Type type2 = type;
            Class<Object> cls = Object.class;
            if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                return null;
            }
            Class<?> c = C17387a0.m29125c(type);
            if (c.isInterface() || c.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C18215a.m30726e(c)) {
                m29082a(type2, List.class);
                m29082a(type2, Set.class);
                m29082a(type2, Map.class);
                m29082a(type2, Collection.class);
                String str = "Platform " + c;
                if (type2 instanceof ParameterizedType) {
                    str = str + " in " + type2;
                }
                throw new IllegalArgumentException(C0326j.m864i(str, " requires explicit JsonAdapter to be registered"));
            } else if (c.isAnonymousClass()) {
                throw new IllegalArgumentException(C0326j.m862g(c, C0072d.m201h("Cannot serialize anonymous class ")));
            } else if (c.isLocalClass()) {
                throw new IllegalArgumentException(C0326j.m862g(c, C0072d.m201h("Cannot serialize local class ")));
            } else if (c.getEnclosingClass() != null && !Modifier.isStatic(c.getModifiers())) {
                throw new IllegalArgumentException(C0326j.m862g(c, C0072d.m201h("Cannot serialize non-static nested class ")));
            } else if (!Modifier.isAbstract(c.getModifiers())) {
                Class<? extends Annotation> cls2 = C18215a.f39929d;
                int i = 0;
                if (!(cls2 != null && c.isAnnotationPresent(cls2))) {
                    try {
                        Constructor<?> declaredConstructor = c.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        jVar = new C17394f(declaredConstructor, c);
                    } catch (NoSuchMethodException unused) {
                        try {
                            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls3.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            jVar = new C17395g(cls3.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), c);
                        } catch (IllegalAccessException unused2) {
                            throw new AssertionError();
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                            try {
                                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                                declaredMethod.setAccessible(true);
                                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{cls})).intValue();
                                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                                declaredMethod2.setAccessible(true);
                                jVar = new C17396h(declaredMethod2, c, intValue);
                            } catch (IllegalAccessException unused4) {
                                throw new AssertionError();
                            } catch (InvocationTargetException e) {
                                C18215a.m30731j(e);
                                throw null;
                            } catch (NoSuchMethodException unused5) {
                                try {
                                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                                    declaredMethod3.setAccessible(true);
                                    jVar = new C17397i(declaredMethod3, c);
                                } catch (Exception unused6) {
                                    throw new IllegalArgumentException(C0326j.m862g(c, C0072d.m201h("cannot construct instances of ")));
                                }
                            }
                        }
                    }
                    TreeMap treeMap = new TreeMap();
                    while (type2 != cls) {
                        Class<?> c2 = C17387a0.m29125c(type2);
                        boolean e2 = C18215a.m30726e(c2);
                        Field[] declaredFields = c2.getDeclaredFields();
                        int length = declaredFields.length;
                        int i2 = i;
                        while (i < length) {
                            Field field = declaredFields[i];
                            int modifiers = field.getModifiers();
                            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !e2)) {
                                i2 = 1;
                            }
                            if (i2 != 0 && ((nVar = (C17402n) field.getAnnotation(C17402n.class)) == null || !nVar.ignore())) {
                                Type i3 = C18215a.m30730i(type2, c2, field.getGenericType(), new LinkedHashSet());
                                Set<? extends Annotation> f = C18215a.m30727f(field.getAnnotations());
                                String name = field.getName();
                                JsonAdapter<T> c3 = yVar.mo68558c(i3, f, name);
                                field.setAccessible(true);
                                if (nVar != null) {
                                    String name2 = nVar.name();
                                    if (!"\u0000".equals(name2)) {
                                        name = name2;
                                    }
                                }
                                C17354b bVar = (C17354b) treeMap.put(name, new C17354b(name, field, c3));
                                if (bVar != null) {
                                    StringBuilder h = C0072d.m201h("Conflicting fields:\n    ");
                                    h.append(bVar.f37884b);
                                    h.append("\n    ");
                                    h.append(field);
                                    throw new IllegalArgumentException(h.toString());
                                }
                            } else {
                                C17414y yVar2 = yVar;
                            }
                            i++;
                            i2 = 0;
                        }
                        C17414y yVar3 = yVar;
                        Class<?> c4 = C17387a0.m29125c(type2);
                        type2 = C18215a.m30730i(type2, c4, c4.getGenericSuperclass(), new LinkedHashSet());
                        i = 0;
                    }
                    return new ClassJsonAdapter(jVar, treeMap).nullSafe();
                }
                throw new IllegalArgumentException(C0326j.m863h(c, C0072d.m201h("Cannot serialize Kotlin type "), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact."));
            } else {
                throw new IllegalArgumentException(C0326j.m862g(c, C0072d.m201h("Cannot serialize abstract class ")));
            }
        }
    }

    /* renamed from: com.squareup.moshi.ClassJsonAdapter$b */
    public static class C17354b<T> {

        /* renamed from: a */
        public final String f37883a;

        /* renamed from: b */
        public final Field f37884b;

        /* renamed from: c */
        public final JsonAdapter<T> f37885c;

        public C17354b(String str, Field field, JsonAdapter<T> jsonAdapter) {
            this.f37883a = str;
            this.f37884b = field;
            this.f37885c = jsonAdapter;
        }
    }

    public ClassJsonAdapter(C17398j<T> jVar, Map<String, C17354b<?>> map) {
        this.classFactory = jVar;
        this.fieldsArray = (C17354b[]) map.values().toArray(new C17354b[map.size()]);
        this.options = JsonReader.C17362b.m29110a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    public final T fromJson(JsonReader jsonReader) throws IOException {
        try {
            T a = this.classFactory.mo68490a();
            try {
                jsonReader.mo68410b();
                while (jsonReader.mo68414f()) {
                    int Q = jsonReader.mo68406Q(this.options);
                    if (Q == -1) {
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                    } else {
                        C17354b<?> bVar = this.fieldsArray[Q];
                        bVar.f37884b.set(a, bVar.f37885c.fromJson(jsonReader));
                    }
                }
                jsonReader.mo68413e();
                return a;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            C18215a.m30731j(e2);
            throw null;
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public final void toJson(C17412w wVar, T t) throws IOException {
        try {
            wVar.mo68522b();
            for (C17354b<?> bVar : this.fieldsArray) {
                wVar.mo68529h(bVar.f37883a);
                bVar.f37885c.toJson(wVar, bVar.f37884b.get(t));
            }
            wVar.mo68526f();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("JsonAdapter(");
        h.append(this.classFactory);
        h.append(")");
        return h.toString();
    }
}
