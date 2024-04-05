package com.google.common.reflect;

import com.google.common.base.C15794l;
import com.google.common.base.C15795m;
import com.google.common.base.C15803r;
import com.google.common.collect.C16164e0;
import com.google.common.collect.C16170f2;
import com.google.common.collect.C16221t;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Ordering;
import com.google.common.primitives.C16299a;
import com.google.common.reflect.C16327b;
import com.google.common.reflect.C16333f;
import com.google.common.reflect.Types;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class TypeToken<T> extends C16330c<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient C16333f f36405b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient C16333f f36406c;
    /* access modifiers changed from: private */
    public final Type runtimeType;

    public final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl

        /* renamed from: c */
        public transient ImmutableSet<TypeToken<? super T>> f36407c;

        public ClassSet() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        public TypeToken<T>.TypeSet classes() {
            return this;
        }

        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf(new C16340i(C16307e.f36416b).mo58253b(TypeToken.this.mo58211e()));
        }

        public /* synthetic */ ClassSet(TypeToken typeToken, C16303a aVar) {
            this();
        }

        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f36407c;
            if (immutableSet != null) {
                return immutableSet;
            }
            C16221t a = C16221t.m26253c(new C16340i(C16307e.f36415a).mo58253b(ImmutableList.m25827of(TypeToken.this))).mo57721a(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD);
            ImmutableSet<TypeToken<? super T>> copyOf = ImmutableSet.copyOf(a.f36323b.mo55650or(a));
            this.f36407c = copyOf;
            return copyOf;
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public SimpleTypeToken(Type type) {
            super(type, (C16303a) null);
        }
    }

    public enum TypeFilter implements C15795m<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            public boolean apply(TypeToken<?> typeToken) {
                return !(typeToken.runtimeType instanceof TypeVariable) && !(typeToken.runtimeType instanceof WildcardType);
            }
        },
        INTERFACE_ONLY {
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$a */
    public class C16303a extends C16327b.C16329b<T> {
        public C16303a(Method method) {
            super(method);
        }

        /* renamed from: a */
        public final TypeToken<T> mo58245a() {
            return TypeToken.this;
        }

        public final String toString() {
            return TypeToken.this + "." + super.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$b */
    public class C16304b extends C16327b.C16328a<T> {
        public C16304b(Constructor constructor) {
            super(constructor);
        }

        /* renamed from: a */
        public final TypeToken<T> mo58245a() {
            return TypeToken.this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.google.common.reflect.TypeToken r1 = com.google.common.reflect.TypeToken.this
                r0.append(r1)
                java.lang.String r1 = "("
                r0.append(r1)
                com.google.common.base.h r1 = new com.google.common.base.h
                java.lang.String r2 = ", "
                r1.<init>((java.lang.String) r2)
                com.google.common.reflect.TypeToken r2 = com.google.common.reflect.TypeToken.this
                com.google.common.reflect.f r2 = com.google.common.reflect.TypeToken.access$100(r2)
                java.lang.reflect.Constructor<?> r3 = r9.f36429d
                java.lang.reflect.Type[] r3 = r3.getGenericParameterTypes()
                int r4 = r3.length
                r5 = 0
                if (r4 <= 0) goto L_0x0076
                java.lang.reflect.Constructor<?> r4 = r9.f36429d
                java.lang.Class r4 = r4.getDeclaringClass()
                java.lang.reflect.Constructor r6 = r4.getEnclosingConstructor()
                r7 = 1
                if (r6 == 0) goto L_0x0034
                goto L_0x0054
            L_0x0034:
                java.lang.reflect.Method r6 = r4.getEnclosingMethod()
                if (r6 == 0) goto L_0x0044
                int r4 = r6.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
                r4 = r4 ^ r7
                goto L_0x0057
            L_0x0044:
                java.lang.Class r6 = r4.getEnclosingClass()
                if (r6 == 0) goto L_0x0056
                int r4 = r4.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
                if (r4 != 0) goto L_0x0056
            L_0x0054:
                r4 = r7
                goto L_0x0057
            L_0x0056:
                r4 = r5
            L_0x0057:
                if (r4 == 0) goto L_0x0076
                java.lang.reflect.Constructor<?> r4 = r9.f36429d
                java.lang.Class[] r4 = r4.getParameterTypes()
                int r6 = r3.length
                int r8 = r4.length
                if (r6 != r8) goto L_0x0076
                r4 = r4[r5]
                java.lang.Class r6 = r9.getDeclaringClass()
                java.lang.Class r6 = r6.getEnclosingClass()
                if (r4 != r6) goto L_0x0076
                int r4 = r3.length
                java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r3, r7, r4)
                java.lang.reflect.Type[] r3 = (java.lang.reflect.Type[]) r3
            L_0x0076:
                r2.getClass()
            L_0x0079:
                int r4 = r3.length
                if (r5 >= r4) goto L_0x0087
                r4 = r3[r5]
                java.lang.reflect.Type r4 = r2.mo58297b(r4)
                r3[r5] = r4
                int r5 = r5 + 1
                goto L_0x0079
            L_0x0087:
                java.util.List r2 = java.util.Arrays.asList(r3)
                java.lang.String r1 = r1.mo55780a(r2)
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.reflect.TypeToken.C16304b.toString():java.lang.String");
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$c */
    public class C16305c extends C16342k {
        public C16305c() {
        }

        /* renamed from: c */
        public final void mo58247c(GenericArrayType genericArrayType) {
            mo58307a(genericArrayType.getGenericComponentType());
        }

        /* renamed from: d */
        public final void mo58248d(ParameterizedType parameterizedType) {
            mo58307a(parameterizedType.getActualTypeArguments());
            mo58307a(parameterizedType.getOwnerType());
        }

        /* renamed from: e */
        public final void mo58249e(TypeVariable<?> typeVariable) {
            throw new IllegalArgumentException(TypeToken.this.runtimeType + "contains a type variable and is not safe for the operation");
        }

        /* renamed from: f */
        public final void mo58250f(WildcardType wildcardType) {
            mo58307a(wildcardType.getLowerBounds());
            mo58307a(wildcardType.getUpperBounds());
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$d */
    public class C16306d extends C16342k {

        /* renamed from: b */
        public final /* synthetic */ ImmutableSet.C15974a f36414b;

        public C16306d(ImmutableSet.C15974a aVar) {
            this.f36414b = aVar;
        }

        /* renamed from: b */
        public final void mo58251b(Class<?> cls) {
            this.f36414b.mo56784d(cls);
        }

        /* renamed from: c */
        public final void mo58247c(GenericArrayType genericArrayType) {
            ImmutableSet.C15974a aVar = this.f36414b;
            Class<? super Object> rawType = TypeToken.m26400of(genericArrayType.getGenericComponentType()).getRawType();
            Types.C16321a aVar2 = Types.f36418a;
            aVar.mo56784d(Array.newInstance(rawType, 0).getClass());
        }

        /* renamed from: d */
        public final void mo58248d(ParameterizedType parameterizedType) {
            this.f36414b.mo56784d((Class) parameterizedType.getRawType());
        }

        /* renamed from: e */
        public final void mo58249e(TypeVariable<?> typeVariable) {
            mo58307a(typeVariable.getBounds());
        }

        /* renamed from: f */
        public final void mo58250f(WildcardType wildcardType) {
            mo58307a(wildcardType.getUpperBounds());
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$e */
    public static abstract class C16307e<K> {

        /* renamed from: a */
        public static final C16308a f36415a = new C16308a();

        /* renamed from: b */
        public static final C16309b f36416b = new C16309b();

        /* renamed from: com.google.common.reflect.TypeToken$e$a */
        public static class C16308a extends C16307e<TypeToken<?>> {
            /* renamed from: c */
            public final Iterable mo58254c(Object obj) {
                return ((TypeToken) obj).getGenericInterfaces();
            }

            /* renamed from: d */
            public final Class mo58255d(Object obj) {
                return ((TypeToken) obj).getRawType();
            }

            @NullableDecl
            /* renamed from: e */
            public final Object mo58256e(Object obj) {
                return ((TypeToken) obj).getGenericSuperclass();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$e$b */
        public static class C16309b extends C16307e<Class<?>> {
            /* renamed from: c */
            public final Iterable mo58254c(Object obj) {
                return Arrays.asList(((Class) obj).getInterfaces());
            }

            /* renamed from: d */
            public final Class mo58255d(Object obj) {
                return (Class) obj;
            }

            @NullableDecl
            /* renamed from: e */
            public final Object mo58256e(Object obj) {
                return ((Class) obj).getSuperclass();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$e$c */
        public static class C16310c<K> extends C16307e<K> {

            /* renamed from: c */
            public final C16307e<K> f36417c;

            public C16310c(C16307e<K> eVar) {
                this.f36417c = eVar;
            }

            /* renamed from: d */
            public final Class<?> mo58255d(K k) {
                return this.f36417c.mo58255d(k);
            }

            /* renamed from: e */
            public final K mo58256e(K k) {
                return this.f36417c.mo58256e(k);
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final int mo58252a(Object obj, HashMap hashMap) {
            Integer num = (Integer) hashMap.get(obj);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = mo58255d(obj).isInterface();
            for (Object a : mo58254c(obj)) {
                isInterface = Math.max(isInterface, mo58252a(a, hashMap));
            }
            Object e = mo58256e(obj);
            if (e != null) {
                isInterface = Math.max(isInterface, mo58252a(e, hashMap));
            }
            int i = isInterface + 1;
            hashMap.put(obj, Integer.valueOf(i));
            return i;
        }

        /* renamed from: b */
        public ImmutableList mo58253b(ImmutableCollection immutableCollection) {
            HashMap hashMap = new HashMap();
            for (Object a : immutableCollection) {
                mo58252a(a, hashMap);
            }
            return new C16341j(hashMap, Ordering.natural().reverse()).immutableSortedCopy(hashMap.keySet());
        }

        /* renamed from: c */
        public abstract Iterable<? extends K> mo58254c(K k);

        /* renamed from: d */
        public abstract Class<?> mo58255d(K k);

        @NullableDecl
        /* renamed from: e */
        public abstract K mo58256e(K k);
    }

    public TypeToken() {
        Type capture = capture();
        this.runtimeType = capture;
        C15794l.m25622p(capture, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(capture instanceof TypeVariable));
    }

    /* renamed from: a */
    public static ImmutableList m26395a(Type[] typeArr) {
        ImmutableList.C15953a builder = ImmutableList.builder();
        for (Type of : typeArr) {
            TypeToken<?> of2 = m26400of(of);
            if (of2.getRawType().isInterface()) {
                builder.mo56633b(of2);
            }
        }
        return builder.mo56664e();
    }

    public static C16333f access$000(TypeToken typeToken) {
        C16333f fVar = typeToken.f36406c;
        if (fVar != null) {
            return fVar;
        }
        Type type = typeToken.runtimeType;
        C16333f fVar2 = new C16333f();
        type.getClass();
        C16333f.C16334a aVar = new C16333f.C16334a();
        aVar.mo58307a(type);
        C16333f d = fVar2.mo58299d(ImmutableMap.copyOf(aVar.f36434b));
        typeToken.f36406c = d;
        return d;
    }

    public static C16333f access$100(TypeToken typeToken) {
        C16333f fVar = typeToken.f36405b;
        if (fVar != null) {
            return fVar;
        }
        Type a = C16333f.C16337d.f36437b.mo58305a(typeToken.runtimeType);
        C16333f fVar2 = new C16333f();
        a.getClass();
        C16333f.C16334a aVar = new C16333f.C16334a();
        aVar.mo58307a(a);
        C16333f d = fVar2.mo58299d(ImmutableMap.copyOf(aVar.f36434b));
        typeToken.f36405b = d;
        return d;
    }

    /* renamed from: b */
    public static Type m26396b(Type type, TypeVariable typeVariable) {
        return type instanceof WildcardType ? m26397c(typeVariable, (WildcardType) type) : m26398d(type);
    }

    /* renamed from: c */
    public static WildcardType m26397c(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        boolean z;
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            int length = bounds.length;
            int i = 0;
            while (true) {
                z = true;
                if (i >= length) {
                    z = !true;
                    break;
                } else if (m26400of(bounds[i]).isSubtypeOf(type)) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                arrayList.add(m26398d(type));
            }
        }
        return new Types.WildcardTypeImpl(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    /* renamed from: d */
    public static Type m26398d(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return type instanceof GenericArrayType ? Types.m26432d(m26398d(((GenericArrayType) type).getGenericComponentType())) : type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = m26396b(actualTypeArguments[i], typeParameters[i]);
        }
        return Types.m26434f(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    /* renamed from: of */
    public static <T> TypeToken<T> m26399of(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return m26400of(Types.m26432d(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? m26400of((Type) Types.m26434f(type, cls, typeParameters)) : m26399of(cls);
    }

    public final C16327b<T, T> constructor(Constructor<?> constructor) {
        C15794l.m25611e(constructor, "%s not declared by %s", getRawType(), constructor.getDeclaringClass() == getRawType());
        return new C16304b(constructor);
    }

    /* renamed from: e */
    public final ImmutableSet<Class<? super T>> mo58211e() {
        ImmutableSet.C15974a builder = ImmutableSet.builder();
        new C16306d(builder).mo58307a(this.runtimeType);
        return builder.mo56786f();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    /* renamed from: f */
    public final TypeToken<? super T> mo58213f(Class<? super T> cls, Type[] typeArr) {
        for (Type of : typeArr) {
            TypeToken<?> of2 = m26400of(of);
            if (of2.isSubtypeOf((Type) cls)) {
                return of2.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* renamed from: g */
    public final TypeToken<?> mo58214g(Type type) {
        C16333f fVar = this.f36406c;
        if (fVar == null) {
            Type type2 = this.runtimeType;
            C16333f fVar2 = new C16333f();
            type2.getClass();
            C16333f.C16334a aVar = new C16333f.C16334a();
            aVar.mo58307a(type2);
            fVar = fVar2.mo58299d(ImmutableMap.copyOf(aVar.f36434b));
            this.f36406c = fVar;
        }
        TypeToken<?> of = m26400of(fVar.mo58297b(type));
        of.f36406c = this.f36406c;
        of.f36405b = this.f36405b;
        return of;
    }

    @NullableDecl
    public final TypeToken<?> getComponentType() {
        Type c = Types.m26431c(this.runtimeType);
        if (c == null) {
            return null;
        }
        return m26400of(c);
    }

    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return m26395a(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return m26395a(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.C15953a builder = ImmutableList.builder();
        for (Type g : getRawType().getGenericInterfaces()) {
            builder.mo56633b(mo58214g(g));
        }
        return builder.mo56664e();
    }

    @NullableDecl
    public final TypeToken<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            TypeToken<?> of = m26400of(((TypeVariable) type).getBounds()[0]);
            if (of.getRawType().isInterface()) {
                return null;
            }
            return of;
        } else if (type instanceof WildcardType) {
            TypeToken<?> of2 = m26400of(((WildcardType) type).getUpperBounds()[0]);
            if (of2.getRawType().isInterface()) {
                return null;
            }
            return of2;
        } else {
            Type genericSuperclass = getRawType().getGenericSuperclass();
            if (genericSuperclass == null) {
                return null;
            }
            return mo58214g(genericSuperclass);
        }
    }

    public final Class<? super T> getRawType() {
        return (Class) mo58211e().iterator().next();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (getRawType().getTypeParameters().length != 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.reflect.TypeToken<? extends T> getSubtype(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.TypeVariable
            r0 = r0 ^ 1
            java.lang.String r1 = "Cannot get subtype of type variable <%s>"
            com.google.common.base.C15794l.m25612f(r4, r1, r0)
            java.lang.reflect.Type r0 = r4.runtimeType
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L_0x0040
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getLowerBounds()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0026
            r1 = 0
            r0 = r0[r1]
            com.google.common.reflect.TypeToken r0 = m26400of((java.lang.reflect.Type) r0)
            com.google.common.reflect.TypeToken r5 = r0.getSubtype(r5)
            return r5
        L_0x0026:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " isn't a subclass of "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0040:
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L_0x005f
            com.google.common.reflect.TypeToken r0 = r4.getComponentType()
            java.lang.Class r5 = r5.getComponentType()
            com.google.common.reflect.TypeToken r5 = r0.getSubtype(r5)
            java.lang.reflect.Type r5 = r5.runtimeType
            com.google.common.reflect.Types$JavaVersion r0 = com.google.common.reflect.Types.JavaVersion.JAVA7
            java.lang.reflect.Type r5 = r0.newArrayType(r5)
            com.google.common.reflect.TypeToken r5 = m26400of((java.lang.reflect.Type) r5)
            return r5
        L_0x005f:
            java.lang.Class r0 = r4.getRawType()
            boolean r0 = r0.isAssignableFrom(r5)
            java.lang.String r1 = "%s isn't a subclass of %s"
            com.google.common.base.C15794l.m25611e(r5, r1, r4, r0)
            java.lang.reflect.Type r0 = r4.runtimeType
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0085
            java.lang.reflect.TypeVariable[] r0 = r5.getTypeParameters()
            int r0 = r0.length
            if (r0 == 0) goto L_0x00b2
            java.lang.Class r0 = r4.getRawType()
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            int r0 = r0.length
            if (r0 == 0) goto L_0x0085
            goto L_0x00b2
        L_0x0085:
            com.google.common.reflect.TypeToken r5 = toGenericType(r5)
            java.lang.Class r0 = r4.getRawType()
            com.google.common.reflect.TypeToken r0 = r5.getSupertype(r0)
            java.lang.reflect.Type r0 = r0.runtimeType
            com.google.common.reflect.f r1 = new com.google.common.reflect.f
            r1.<init>()
            java.lang.reflect.Type r2 = r4.runtimeType
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.getClass()
            r2.getClass()
            com.google.common.reflect.C16333f.m26445a(r0, r2, r3)
            com.google.common.reflect.f r0 = r1.mo58299d(r3)
            java.lang.reflect.Type r5 = r5.runtimeType
            java.lang.reflect.Type r5 = r0.mo58297b(r5)
        L_0x00b2:
            com.google.common.reflect.TypeToken r5 = m26400of((java.lang.reflect.Type) r5)
            boolean r0 = r5.isSubtypeOf((com.google.common.reflect.TypeToken<?>) r4)
            java.lang.String r1 = "%s does not appear to be a subtype of %s"
            com.google.common.base.C15794l.m25611e(r5, r1, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.reflect.TypeToken.getSubtype(java.lang.Class):com.google.common.reflect.TypeToken");
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        C15794l.m25611e(cls, "%s is not a super class of %s", this, mo58223h(cls));
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return mo58213f(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return mo58213f(cls, ((WildcardType) type).getUpperBounds());
        }
        if (!cls.isArray()) {
            return mo58214g(toGenericType(cls).runtimeType);
        }
        TypeToken<?> componentType = getComponentType();
        if (componentType != null) {
            return m26400of(Types.JavaVersion.JAVA7.newArrayType(componentType.getSupertype(cls.getComponentType()).runtimeType));
        }
        throw new NullPointerException(C15803r.m25628a("%s isn't a super type of %s", cls, this));
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    /* renamed from: h */
    public final boolean mo58223h(Class<?> cls) {
        C16170f2 it = mo58211e().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom((Class) it.next())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final C16327b<T, Object> method(Method method) {
        C15794l.m25611e(method, "%s not declared by %s", this, mo58223h(method.getDeclaringClass()));
        return new C16303a(method);
    }

    @CanIgnoreReturnValue
    public final TypeToken<T> rejectTypeVariables() {
        new C16305c().mo58307a(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        type.getClass();
        C16333f fVar = this.f36405b;
        if (fVar == null) {
            Type a = C16333f.C16337d.f36437b.mo58305a(this.runtimeType);
            C16333f fVar2 = new C16333f();
            a.getClass();
            C16333f.C16334a aVar = new C16333f.C16334a();
            aVar.mo58307a(a);
            fVar = fVar2.mo58299d(ImmutableMap.copyOf(aVar.f36434b));
            this.f36405b = fVar;
        }
        return m26400of(fVar.mo58297b(type));
    }

    public String toString() {
        Type type = this.runtimeType;
        Types.C16321a aVar = Types.f36418a;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public final TypeToken<T> unwrap() {
        Map<Class<?>, Class<?>> map = C16299a.f36404b;
        if (!map.keySet().contains(this.runtimeType)) {
            return this;
        }
        Class cls = (Class) this.runtimeType;
        cls.getClass();
        Class cls2 = map.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return m26399of(cls);
    }

    public final <X> TypeToken<T> where(C16331d<X> dVar, TypeToken<X> typeToken) {
        new C16333f.C16335b();
        throw null;
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? m26399of(C16299a.m26394a((Class) this.runtimeType)) : this;
    }

    public Object writeReplace() {
        return m26400of(new C16333f().mo58297b(this.runtimeType));
    }

    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        public final transient TypeToken<T>.TypeSet f36408c;
        @MonotonicNonNullDecl

        /* renamed from: d */
        public transient ImmutableSet<TypeToken<? super T>> f36409d;

        /* renamed from: com.google.common.reflect.TypeToken$InterfaceSet$a */
        public class C16300a implements C15795m<Class<?>> {
            public final boolean apply(Object obj) {
                return ((Class) obj).isInterface();
            }
        }

        public InterfaceSet(TypeToken<T>.TypeSet typeSet) {
            super();
            this.f36408c = typeSet;
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        public TypeToken<T>.TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        public Set<Class<? super T>> rawTypes() {
            C16221t a = C16221t.m26253c(C16307e.f36416b.mo58253b(TypeToken.this.mo58211e())).mo57721a(new C16300a());
            return ImmutableSet.copyOf(a.f36323b.mo55650or(a));
        }

        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f36409d;
            if (immutableSet != null) {
                return immutableSet;
            }
            C16221t a = C16221t.m26253c(this.f36408c).mo57721a(TypeFilter.INTERFACE_ONLY);
            ImmutableSet<TypeToken<? super T>> copyOf = ImmutableSet.copyOf(a.f36323b.mo55650or(a));
            this.f36409d = copyOf;
            return copyOf;
        }
    }

    public class TypeSet extends C16164e0<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl

        /* renamed from: b */
        public transient ImmutableSet<TypeToken<? super T>> f36410b;

        public TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new ClassSet(TypeToken.this, (C16303a) null);
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new InterfaceSet(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf(C16307e.f36416b.mo58253b(TypeToken.this.mo58211e()));
        }

        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f36410b;
            if (immutableSet != null) {
                return immutableSet;
            }
            C16221t a = C16221t.m26253c(C16307e.f36415a.mo58253b(ImmutableList.m25827of(TypeToken.this))).mo57721a(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD);
            ImmutableSet<TypeToken<? super T>> copyOf = ImmutableSet.copyOf(a.f36323b.mo55650or(a));
            this.f36410b = copyOf;
            return copyOf;
        }
    }

    /* renamed from: of */
    public static TypeToken<?> m26400of(Type type) {
        return new SimpleTypeToken(type);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016f, code lost:
        if (r5 != false) goto L_0x0171;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0186 A[LOOP:3: B:49:0x00e9->B:78:0x0186, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isSubtypeOf(java.lang.reflect.Type r13) {
        /*
            r12 = this;
            r13.getClass()
            boolean r0 = r13 instanceof java.lang.reflect.WildcardType
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            java.lang.reflect.WildcardType r13 = (java.lang.reflect.WildcardType) r13
            java.lang.reflect.Type[] r13 = r13.getLowerBounds()
            java.lang.reflect.Type r0 = r12.runtimeType
            com.google.common.reflect.TypeToken r0 = m26400of((java.lang.reflect.Type) r0)
            int r3 = r13.length
        L_0x0016:
            if (r1 >= r3) goto L_0x0024
            r4 = r13[r1]
            boolean r4 = r0.isSubtypeOf((java.lang.reflect.Type) r4)
            if (r4 != r2) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0024:
            r2 = r2 ^ r2
        L_0x0025:
            return r2
        L_0x0026:
            java.lang.reflect.Type r0 = r12.runtimeType
            boolean r3 = r0 instanceof java.lang.reflect.WildcardType
            if (r3 == 0) goto L_0x0047
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            int r3 = r0.length
        L_0x0033:
            if (r1 >= r3) goto L_0x0045
            r4 = r0[r1]
            com.google.common.reflect.TypeToken r4 = m26400of((java.lang.reflect.Type) r4)
            boolean r4 = r4.isSubtypeOf((java.lang.reflect.Type) r13)
            if (r4 != r2) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0045:
            r2 = r2 ^ r2
        L_0x0046:
            return r2
        L_0x0047:
            boolean r3 = r0 instanceof java.lang.reflect.TypeVariable
            if (r3 == 0) goto L_0x0074
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0072
            java.lang.reflect.Type r0 = r12.runtimeType
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type[] r0 = r0.getBounds()
            int r3 = r0.length
            r4 = r1
        L_0x005b:
            if (r4 >= r3) goto L_0x006e
            r5 = r0[r4]
            com.google.common.reflect.TypeToken r5 = m26400of((java.lang.reflect.Type) r5)
            boolean r5 = r5.isSubtypeOf((java.lang.reflect.Type) r13)
            if (r5 != r2) goto L_0x006b
            r13 = r2
            goto L_0x0070
        L_0x006b:
            int r4 = r4 + 1
            goto L_0x005b
        L_0x006e:
            r13 = r2 ^ r2
        L_0x0070:
            if (r13 == 0) goto L_0x0073
        L_0x0072:
            r1 = r2
        L_0x0073:
            return r1
        L_0x0074:
            boolean r3 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r3 == 0) goto L_0x00bf
            com.google.common.reflect.TypeToken r13 = m26400of((java.lang.reflect.Type) r13)
            java.lang.reflect.Type r0 = r12.runtimeType
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r2 = r13.runtimeType
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L_0x00a6
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r13 = r2.isArray()
            if (r13 != 0) goto L_0x0095
            java.lang.Class<java.lang.Object[]> r13 = java.lang.Object[].class
            boolean r1 = r2.isAssignableFrom(r13)
            goto L_0x00be
        L_0x0095:
            java.lang.reflect.Type r13 = r0.getGenericComponentType()
            com.google.common.reflect.TypeToken r13 = m26400of((java.lang.reflect.Type) r13)
            java.lang.Class r0 = r2.getComponentType()
            boolean r1 = r13.isSubtypeOf((java.lang.reflect.Type) r0)
            goto L_0x00be
        L_0x00a6:
            boolean r2 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r2 == 0) goto L_0x00be
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            com.google.common.reflect.TypeToken r0 = m26400of((java.lang.reflect.Type) r0)
            java.lang.reflect.Type r13 = r13.runtimeType
            java.lang.reflect.GenericArrayType r13 = (java.lang.reflect.GenericArrayType) r13
            java.lang.reflect.Type r13 = r13.getGenericComponentType()
            boolean r1 = r0.isSubtypeOf((java.lang.reflect.Type) r13)
        L_0x00be:
            return r1
        L_0x00bf:
            boolean r4 = r13 instanceof java.lang.Class
            if (r4 == 0) goto L_0x00ca
            java.lang.Class r13 = (java.lang.Class) r13
            boolean r13 = r12.mo58223h(r13)
            return r13
        L_0x00ca:
            boolean r4 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x01e4
            java.lang.reflect.ParameterizedType r13 = (java.lang.reflect.ParameterizedType) r13
            com.google.common.reflect.TypeToken r0 = m26400of((java.lang.reflect.Type) r13)
            java.lang.Class r0 = r0.getRawType()
            boolean r3 = r12.mo58223h(r0)
            if (r3 != 0) goto L_0x00e0
            goto L_0x01e3
        L_0x00e0:
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            java.lang.reflect.Type[] r3 = r13.getActualTypeArguments()
            r4 = r1
        L_0x00e9:
            int r5 = r0.length
            if (r4 >= r5) goto L_0x018a
            com.google.common.reflect.f r5 = r12.f36406c
            if (r5 != 0) goto L_0x0112
            java.lang.reflect.Type r5 = r12.runtimeType
            com.google.common.reflect.f r6 = new com.google.common.reflect.f
            r6.<init>()
            r5.getClass()
            com.google.common.reflect.f$a r7 = new com.google.common.reflect.f$a
            r7.<init>()
            java.lang.reflect.Type[] r8 = new java.lang.reflect.Type[r2]
            r8[r1] = r5
            r7.mo58307a(r8)
            java.util.HashMap r5 = r7.f36434b
            com.google.common.collect.ImmutableMap r5 = com.google.common.collect.ImmutableMap.copyOf(r5)
            com.google.common.reflect.f r5 = r6.mo58299d(r5)
            r12.f36406c = r5
        L_0x0112:
            r6 = r0[r4]
            java.lang.reflect.Type r5 = r5.mo58297b(r6)
            com.google.common.reflect.TypeToken r5 = m26400of((java.lang.reflect.Type) r5)
            r6 = r3[r4]
            r7 = r0[r4]
            java.lang.reflect.Type r8 = r5.runtimeType
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x0129
            goto L_0x0171
        L_0x0129:
            boolean r8 = r6 instanceof java.lang.reflect.WildcardType
            if (r8 == 0) goto L_0x0175
            java.lang.reflect.WildcardType r6 = (java.lang.reflect.WildcardType) r6
            java.lang.reflect.WildcardType r6 = m26397c(r7, r6)
            java.lang.reflect.Type[] r7 = r6.getUpperBounds()
            java.lang.reflect.Type r8 = r5.runtimeType
            com.google.common.reflect.TypeToken r8 = m26400of((java.lang.reflect.Type) r8)
            int r9 = r7.length
            r10 = r1
        L_0x013f:
            if (r10 >= r9) goto L_0x014e
            r11 = r7[r10]
            boolean r11 = r8.isSubtypeOf((java.lang.reflect.Type) r11)
            if (r11 != 0) goto L_0x014b
            r7 = r1
            goto L_0x0150
        L_0x014b:
            int r10 = r10 + 1
            goto L_0x013f
        L_0x014e:
            r7 = 0
            r7 = r7 ^ r2
        L_0x0150:
            if (r7 == 0) goto L_0x0173
            java.lang.reflect.Type[] r6 = r6.getLowerBounds()
            java.lang.reflect.Type r5 = r5.runtimeType
            int r7 = r6.length
            r8 = r1
        L_0x015a:
            if (r8 >= r7) goto L_0x016d
            r9 = r6[r8]
            com.google.common.reflect.TypeToken r9 = m26400of((java.lang.reflect.Type) r9)
            boolean r9 = r9.isSubtypeOf((java.lang.reflect.Type) r5)
            if (r9 != 0) goto L_0x016a
            r5 = r1
            goto L_0x016f
        L_0x016a:
            int r8 = r8 + 1
            goto L_0x015a
        L_0x016d:
            r5 = 0
            r5 = r5 ^ r2
        L_0x016f:
            if (r5 == 0) goto L_0x0173
        L_0x0171:
            r5 = r2
            goto L_0x0183
        L_0x0173:
            r5 = r1
            goto L_0x0183
        L_0x0175:
            java.lang.reflect.Type r5 = r5.runtimeType
            java.lang.reflect.Type r5 = m26398d(r5)
            java.lang.reflect.Type r6 = m26398d(r6)
            boolean r5 = r5.equals(r6)
        L_0x0183:
            if (r5 != 0) goto L_0x0186
            goto L_0x01e3
        L_0x0186:
            int r4 = r4 + 1
            goto L_0x00e9
        L_0x018a:
            java.lang.reflect.Type r0 = r13.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x01e2
            java.lang.reflect.Type r0 = r13.getOwnerType()
            if (r0 == 0) goto L_0x01e2
            java.lang.reflect.Type r13 = r13.getOwnerType()
            com.google.common.reflect.TypeToken$TypeSet r0 = r12.getTypes()
            java.util.Iterator r0 = r0.iterator()
        L_0x01ac:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01df
            java.lang.Object r3 = r0.next()
            com.google.common.reflect.TypeToken r3 = (com.google.common.reflect.TypeToken) r3
            java.lang.reflect.Type r3 = r3.runtimeType
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x01c5
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getOwnerType()
            goto L_0x01d1
        L_0x01c5:
            boolean r4 = r3 instanceof java.lang.Class
            if (r4 == 0) goto L_0x01d0
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Class r3 = r3.getEnclosingClass()
            goto L_0x01d1
        L_0x01d0:
            r3 = 0
        L_0x01d1:
            if (r3 == 0) goto L_0x01ac
            com.google.common.reflect.TypeToken r3 = m26400of((java.lang.reflect.Type) r3)
            boolean r3 = r3.isSubtypeOf((java.lang.reflect.Type) r13)
            if (r3 == 0) goto L_0x01ac
            r13 = r2
            goto L_0x01e0
        L_0x01df:
            r13 = r1
        L_0x01e0:
            if (r13 == 0) goto L_0x01e3
        L_0x01e2:
            r1 = r2
        L_0x01e3:
            return r1
        L_0x01e4:
            boolean r2 = r13 instanceof java.lang.reflect.GenericArrayType
            if (r2 == 0) goto L_0x021c
            java.lang.reflect.GenericArrayType r13 = (java.lang.reflect.GenericArrayType) r13
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0208
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 != 0) goto L_0x01f7
            goto L_0x021c
        L_0x01f7:
            java.lang.Class r0 = r0.getComponentType()
            com.google.common.reflect.TypeToken r0 = m26399of(r0)
            java.lang.reflect.Type r13 = r13.getGenericComponentType()
            boolean r1 = r0.isSubtypeOf((java.lang.reflect.Type) r13)
            goto L_0x021c
        L_0x0208:
            if (r3 == 0) goto L_0x021c
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            com.google.common.reflect.TypeToken r0 = m26400of((java.lang.reflect.Type) r0)
            java.lang.reflect.Type r13 = r13.getGenericComponentType()
            boolean r1 = r0.isSubtypeOf((java.lang.reflect.Type) r13)
        L_0x021c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.reflect.TypeToken.isSubtypeOf(java.lang.reflect.Type):boolean");
    }

    public final boolean isSupertypeOf(Type type) {
        return m26400of(type).isSubtypeOf(getType());
    }

    public final <X> TypeToken<T> where(C16331d<X> dVar, Class<X> cls) {
        return where(dVar, m26399of(cls));
    }

    public TypeToken(Class<?> cls) {
        Type capture = super.capture();
        if (capture instanceof Class) {
            this.runtimeType = capture;
            return;
        }
        C16333f fVar = new C16333f();
        cls.getClass();
        C16333f.C16334a aVar = new C16333f.C16334a();
        aVar.mo58307a(cls);
        this.runtimeType = fVar.mo58299d(ImmutableMap.copyOf(aVar.f36434b)).mo58297b(capture);
    }

    public TypeToken(Type type, C16303a aVar) {
        type.getClass();
        this.runtimeType = type;
    }
}
