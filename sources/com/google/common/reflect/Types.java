package com.google.common.reflect;

import com.google.common.base.C15784e;
import com.google.common.base.C15786g;
import com.google.common.base.C15787h;
import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.common.base.C15795m;
import com.google.common.base.Predicates;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.C16170f2;
import com.google.common.collect.C16190k0;
import com.google.common.collect.C16194l0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.ClassUtils;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p003a2.C0023f;

public final class Types {

    /* renamed from: a */
    public static final C16321a f36418a = new C16321a();

    /* renamed from: b */
    public static final C15786g f36419b;

    public enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS {
            @NullableDecl
            public Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            @NullableDecl
            public Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        
        public static final ClassOwnership JVM_BEHAVIOR = null;

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$a */
        public class C16313a<T> {
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$b */
        public static class C16314b extends C16313a<String> {
        }

        /* access modifiers changed from: public */
        static {
            JVM_BEHAVIOR = detectJvmBehavior();
        }

        private static ClassOwnership detectJvmBehavior() {
            new C16314b();
            ParameterizedType parameterizedType = (ParameterizedType) C16314b.class.getGenericSuperclass();
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(C16313a.class) == parameterizedType.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }

        @NullableDecl
        public abstract Class<?> getOwnerType(Class<?> cls);
    }

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = JavaVersion.CURRENT.usedInGenericType(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return C15791j.m25606a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Type type = this.componentType;
            C16321a aVar = Types.f36418a;
            return C0023f.m110k(sb, type instanceof Class ? ((Class) type).getName() : type.toString(), "[]");
        }
    }

    public enum JavaVersion {
        JAVA6 {
            public Type usedInGenericType(Type type) {
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }

            public GenericArrayType newArrayType(Type type) {
                return new GenericArrayTypeImpl(type);
            }
        },
        JAVA7 {
            public Type newArrayType(Type type) {
                if (!(type instanceof Class)) {
                    return new GenericArrayTypeImpl(type);
                }
                C16321a aVar = Types.f36418a;
                return Array.newInstance((Class) type, 0).getClass();
            }

            public Type usedInGenericType(Type type) {
                type.getClass();
                return type;
            }
        },
        JAVA8 {
            public Type newArrayType(Type type) {
                return JavaVersion.JAVA7.newArrayType(type);
            }

            public String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }

            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA7.usedInGenericType(type);
            }
        },
        JAVA9 {
            public boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            public Type newArrayType(Type type) {
                return JavaVersion.JAVA8.newArrayType(type);
            }

            public String typeName(Type type) {
                return JavaVersion.JAVA8.typeName(type);
            }

            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA8.usedInGenericType(type);
            }
        };
        
        public static final JavaVersion CURRENT = null;

        /* renamed from: com.google.common.reflect.Types$JavaVersion$a */
        public static class C16319a extends C16330c<Map.Entry<String, int[][]>> {
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$b */
        public static class C16320b extends C16330c<int[]> {
        }

        public boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        public abstract Type newArrayType(Type type);

        public String typeName(Type type) {
            C16321a aVar = Types.f36418a;
            return type instanceof Class ? ((Class) type).getName() : type.toString();
        }

        public final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
            ImmutableList.C15953a builder = ImmutableList.builder();
            for (Type usedInGenericType : typeArr) {
                builder.mo56633b(usedInGenericType(usedInGenericType));
            }
            return builder.mo56664e();
        }

        public abstract Type usedInGenericType(Type type);
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;
        @NullableDecl
        private final Type ownerType;
        private final Class<?> rawType;

        public ParameterizedTypeImpl(@NullableDecl Type type, Class<?> cls, Type[] typeArr) {
            cls.getClass();
            C15794l.m25613g(typeArr.length == cls.getTypeParameters().length);
            Types.m26430b(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && C15791j.m25606a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        public Type[] getActualTypeArguments() {
            ImmutableList<Type> immutableList = this.argumentsList;
            C16321a aVar = Types.f36418a;
            return (Type[]) immutableList.toArray(new Type[immutableList.size()]);
        }

        public Type getOwnerType() {
            return this.ownerType;
        }

        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null) {
                JavaVersion javaVersion = JavaVersion.CURRENT;
                if (javaVersion.jdkTypeDuplicatesOwnerName()) {
                    sb.append(javaVersion.typeName(this.ownerType));
                    sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                }
            }
            sb.append(this.rawType.getName());
            sb.append('<');
            C15786g gVar = Types.f36419b;
            ImmutableList<Type> immutableList = this.argumentsList;
            C16321a aVar = Types.f36418a;
            immutableList.getClass();
            sb.append(gVar.mo55780a(new C16194l0(immutableList, aVar)));
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.m26430b(typeArr, "lower bound for wildcard");
            Types.m26430b(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.CURRENT;
            this.lowerBounds = javaVersion.usedInGenericType(typeArr);
            this.upperBounds = javaVersion.usedInGenericType(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        public Type[] getLowerBounds() {
            ImmutableList<Type> immutableList = this.lowerBounds;
            C16321a aVar = Types.f36418a;
            return (Type[]) immutableList.toArray(new Type[immutableList.size()]);
        }

        public Type[] getUpperBounds() {
            ImmutableList<Type> immutableList = this.upperBounds;
            C16321a aVar = Types.f36418a;
            return (Type[]) immutableList.toArray(new Type[immutableList.size()]);
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            C16170f2<Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                sb.append(" super ");
                sb.append(JavaVersion.CURRENT.typeName(it.next()));
            }
            ImmutableList<Type> immutableList = this.upperBounds;
            C16321a aVar = Types.f36418a;
            C15795m<Object> f = Predicates.m25587f(Predicates.m25585d(Object.class));
            immutableList.getClass();
            Iterator<Object> it2 = new C16190k0(immutableList, f).iterator();
            while (true) {
                AbstractIterator abstractIterator = (AbstractIterator) it2;
                if (!abstractIterator.hasNext()) {
                    return sb.toString();
                }
                sb.append(" extends ");
                sb.append(JavaVersion.CURRENT.typeName((Type) abstractIterator.next()));
            }
        }
    }

    /* renamed from: com.google.common.reflect.Types$a */
    public static class C16321a implements C15784e<Type, String> {
        public final Object apply(Object obj) {
            return JavaVersion.CURRENT.typeName((Type) obj);
        }
    }

    /* renamed from: com.google.common.reflect.Types$b */
    public static class C16322b extends C16342k {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f36420b;

        public C16322b(AtomicReference atomicReference) {
            this.f36420b = atomicReference;
        }

        /* renamed from: b */
        public final void mo58251b(Class<?> cls) {
            this.f36420b.set(cls.getComponentType());
        }

        /* renamed from: c */
        public final void mo58247c(GenericArrayType genericArrayType) {
            this.f36420b.set(genericArrayType.getGenericComponentType());
        }

        /* renamed from: e */
        public final void mo58249e(TypeVariable<?> typeVariable) {
            this.f36420b.set(Types.m26429a(typeVariable.getBounds()));
        }

        /* renamed from: f */
        public final void mo58250f(WildcardType wildcardType) {
            this.f36420b.set(Types.m26429a(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: com.google.common.reflect.Types$c */
    public static final class C16323c<X> {

        /* renamed from: a */
        public static final boolean f36421a;

        static {
            Class<C16323c> cls = C16323c.class;
            f36421a = !cls.getTypeParameters()[0].equals(Types.m26433e(cls, "X", new Type[0]));
        }
    }

    /* renamed from: com.google.common.reflect.Types$d */
    public static final class C16324d<D extends GenericDeclaration> {

        /* renamed from: a */
        public final D f36422a;

        /* renamed from: b */
        public final String f36423b;

        /* renamed from: c */
        public final ImmutableList<Type> f36424c;

        public C16324d(D d, String str, Type[] typeArr) {
            Types.m26430b(typeArr, "bound for type variable");
            d.getClass();
            this.f36422a = d;
            str.getClass();
            this.f36423b = str;
            this.f36424c = ImmutableList.copyOf((E[]) typeArr);
        }

        public final boolean equals(Object obj) {
            if (C16323c.f36421a) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C16325e)) {
                    return false;
                }
                C16324d<?> dVar = ((C16325e) Proxy.getInvocationHandler(obj)).f36426a;
                return this.f36423b.equals(dVar.f36423b) && this.f36422a.equals(dVar.f36422a) && this.f36424c.equals(dVar.f36424c);
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f36423b.equals(typeVariable.getName()) && this.f36422a.equals(typeVariable.getGenericDeclaration());
            }
        }

        public final int hashCode() {
            return this.f36422a.hashCode() ^ this.f36423b.hashCode();
        }

        public final String toString() {
            return this.f36423b;
        }
    }

    /* renamed from: com.google.common.reflect.Types$e */
    public static final class C16325e implements InvocationHandler {

        /* renamed from: b */
        public static final ImmutableMap<String, Method> f36425b;

        /* renamed from: a */
        public final C16324d<?> f36426a;

        static {
            Class<C16324d> cls = C16324d.class;
            ImmutableMap.C15958b builder = ImmutableMap.builder();
            for (Method method : cls.getMethods()) {
                if (method.getDeclaringClass().equals(cls)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.mo56613b(method.getName(), method);
                }
            }
            f36425b = builder.mo56612a();
        }

        public C16325e(C16324d<?> dVar) {
            this.f36426a = dVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f36425b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.f36426a, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    static {
        C15787h hVar = new C15787h(", ");
        f36419b = new C15786g(hVar, hVar);
    }

    /* renamed from: a */
    public static Type m26429a(Type[] typeArr) {
        for (Type c : typeArr) {
            Type c2 = m26431c(c);
            if (c2 != null) {
                if (c2 instanceof Class) {
                    Class cls = (Class) c2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new WildcardTypeImpl(new Type[0], new Type[]{c2});
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m26430b(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                C15794l.m25611e(cls2, "Primitive type '%s' used as %s", str, !cls2.isPrimitive());
            }
        }
    }

    @NullableDecl
    /* renamed from: c */
    public static Type m26431c(Type type) {
        type.getClass();
        AtomicReference atomicReference = new AtomicReference();
        new C16322b(atomicReference).mo58307a(type);
        return (Type) atomicReference.get();
    }

    /* renamed from: d */
    public static Type m26432d(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.CURRENT.newArrayType(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        C15794l.m25614h(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return new WildcardTypeImpl(new Type[]{m26432d(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        C15794l.m25614h(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return new WildcardTypeImpl(new Type[0], new Type[]{m26432d(upperBounds[0])});
    }

    /* renamed from: e */
    public static <D extends GenericDeclaration> TypeVariable<D> m26433e(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        C16324d dVar = new C16324d(d, str, typeArr);
        Class<TypeVariable> cls = TypeVariable.class;
        C16325e eVar = new C16325e(dVar);
        C15794l.m25612f(cls, "%s is not an interface", cls.isInterface());
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, eVar));
    }

    /* renamed from: f */
    public static ParameterizedType m26434f(@NullableDecl Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
        }
        typeArr.getClass();
        C15794l.m25612f(cls, "Owner type for unenclosed %s", cls.getEnclosingClass() != null);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }
}
