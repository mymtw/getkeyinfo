package p618lp;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17404p;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lp.a */
public final class C18215a {

    /* renamed from: a */
    public static final Set<Annotation> f39926a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f39927b = new Type[0];

    /* renamed from: c */
    public static final Class<?> f39928c = DefaultConstructorMarker.class;

    /* renamed from: d */
    public static final Class<? extends Annotation> f39929d;

    /* renamed from: e */
    public static final Map<Class<?>, Class<?>> f39930e;

    /* renamed from: lp.a$a */
    public static final class C18216a implements GenericArrayType {

        /* renamed from: b */
        public final Type f39931b;

        public C18216a(Type type) {
            this.f39931b = C18215a.m30722a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C17387a0.m29124b(this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.f39931b;
        }

        public final int hashCode() {
            return this.f39931b.hashCode();
        }

        public final String toString() {
            return C18215a.m30733l(this.f39931b) + "[]";
        }
    }

    /* renamed from: lp.a$b */
    public static final class C18217b implements ParameterizedType {

        /* renamed from: b */
        public final Type f39932b;

        /* renamed from: c */
        public final Type f39933c;

        /* renamed from: d */
        public final Type[] f39934d;

        public C18217b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C17387a0.m29125c(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f39932b = type == null ? null : C18215a.m30722a(type);
            this.f39933c = C18215a.m30722a(type2);
            this.f39934d = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f39934d;
                if (i < typeArr2.length) {
                    Type type3 = typeArr2[i];
                    type3.getClass();
                    C18215a.m30723b(type3);
                    Type[] typeArr3 = this.f39934d;
                    typeArr3[i] = C18215a.m30722a(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C17387a0.m29124b(this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f39934d.clone();
        }

        public final Type getOwnerType() {
            return this.f39932b;
        }

        public final Type getRawType() {
            return this.f39933c;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f39934d) ^ this.f39933c.hashCode();
            Type type = this.f39932b;
            Set<Annotation> set = C18215a.f39926a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f39934d.length + 1) * 30);
            sb.append(C18215a.m30733l(this.f39933c));
            if (this.f39934d.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C18215a.m30733l(this.f39934d[0]));
            for (int i = 1; i < this.f39934d.length; i++) {
                sb.append(", ");
                sb.append(C18215a.m30733l(this.f39934d[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: lp.a$c */
    public static final class C18218c implements WildcardType {

        /* renamed from: b */
        public final Type f39935b;

        /* renamed from: c */
        public final Type f39936c;

        public C18218c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                C18215a.m30723b(type);
                if (typeArr[0] == cls) {
                    this.f39936c = C18215a.m30722a(typeArr2[0]);
                    this.f39935b = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Type type2 = typeArr[0];
                type2.getClass();
                C18215a.m30723b(type2);
                this.f39936c = null;
                this.f39935b = C18215a.m30722a(typeArr[0]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C17387a0.m29124b(this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f39936c;
            if (type == null) {
                return C18215a.f39927b;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f39935b};
        }

        public final int hashCode() {
            Type type = this.f39936c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f39935b.hashCode() + 31);
        }

        public final String toString() {
            if (this.f39936c != null) {
                StringBuilder h = C0072d.m201h("? super ");
                h.append(C18215a.m30733l(this.f39936c));
                return h.toString();
            } else if (this.f39935b == Object.class) {
                return "?";
            } else {
                StringBuilder h2 = C0072d.m201h("? extends ");
                h2.append(C18215a.m30733l(this.f39935b));
                return h2.toString();
            }
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f39929d = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f39930e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static Type m30722a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C18216a(m30722a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C18217b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C18217b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof C18216a ? type : new C18216a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType) || (type instanceof C18218c)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C18218c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    public static void m30723b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: c */
    public static Type m30724c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m30724c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m30724c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: d */
    public static boolean m30725d(Annotation[] annotationArr) {
        for (Annotation annotationType : annotationArr) {
            if (annotationType.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m30726e(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: f */
    public static Set<? extends Annotation> m30727f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C17404p.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f39926a;
    }

    /* renamed from: g */
    public static JsonDataException m30728g(String str, String str2, JsonReader jsonReader) {
        String str3;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static Type m30729h(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m30730i(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10, java.util.LinkedHashSet r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004e
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 != 0) goto L_0x0021
            goto L_0x004a
        L_0x0021:
            java.lang.reflect.Type r2 = m30724c(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x004a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
        L_0x002d:
            int r3 = r10.length
            if (r1 >= r3) goto L_0x0044
            r3 = r10[r1]
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0041
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004b
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0044:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x004a:
            r10 = r0
        L_0x004b:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004e:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m30730i(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            lp.a$a r0 = new lp.a$a
            r0.<init>(r8)
        L_0x006b:
            return r0
        L_0x006c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0083
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m30730i(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            lp.a$a r10 = new lp.a$a
            r10.<init>(r8)
        L_0x0082:
            return r10
        L_0x0083:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c4
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m30730i(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0096
            r0 = r2
            goto L_0x0097
        L_0x0096:
            r0 = r1
        L_0x0097:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x009c:
            if (r1 >= r5) goto L_0x00b7
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m30730i(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b4
            if (r0 != 0) goto L_0x00b2
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r2
        L_0x00b2:
            r4[r1] = r6
        L_0x00b4:
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b7:
            if (r0 == 0) goto L_0x00c3
            lp.a$b r8 = new lp.a$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x00c3:
            return r10
        L_0x00c4:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0120
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00fb
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m30730i(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x0120
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00ea
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ef
        L_0x00ea:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ef:
            lp.a$c r9 = new lp.a$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00fb:
            int r0 = r3.length
            if (r0 != r2) goto L_0x0120
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m30730i(r8, r9, r0, r11)
            r9 = r3[r1]
            if (r8 == r9) goto L_0x0120
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0113
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0118
        L_0x0113:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0118:
            lp.a$c r9 = new lp.a$c
            java.lang.reflect.Type[] r10 = f39927b
            r9.<init>(r8, r10)
            return r9
        L_0x0120:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p618lp.C18215a.m30730i(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.LinkedHashSet):java.lang.reflect.Type");
    }

    /* renamed from: j */
    public static void m30731j(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: k */
    public static String m30732k(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: l */
    public static String m30733l(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: m */
    public static JsonDataException m30734m(String str, String str2, JsonReader jsonReader) {
        String str3;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }
}
