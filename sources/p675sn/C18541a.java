package p675sn;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: sn.a */
public class C18541a<T> {
    public final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    public C18541a() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = C$Gson$Types.m27701f(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    private static AssertionError buildUnexpectedTypeError(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> name : clsArr) {
            sb.append(name.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type2.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type2.toString());
        sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        return new AssertionError(sb.toString());
    }

    public static C18541a<?> get(Type type2) {
        return new C18541a<>(type2);
    }

    public static C18541a<?> getArray(Type type2) {
        return new C18541a<>(C$Gson$Types.m27696a(type2));
    }

    public static C18541a<?> getParameterized(Type type2, Type... typeArr) {
        return new C18541a<>(C$Gson$Types.m27703h(type2, typeArr));
    }

    public static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C$Gson$Types.m27697b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private static boolean matches(Type type2, Type type3, Map<String, Type> map) {
        return type3.equals(type2) || ((type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName())));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18541a) && C$Gson$Types.m27699d(this.type, ((C18541a) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return C$Gson$Types.m27705j(this.type);
    }

    public static <T> C18541a<T> get(Class<T> cls) {
        return new C18541a<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(C$Gson$Types.m27701f(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return isAssignableFrom(type2, (ParameterizedType) type3, new HashMap());
        }
        if (!(type3 instanceof GenericArrayType)) {
            throw buildUnexpectedTypeError(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
        } else if (!this.rawType.isAssignableFrom(C$Gson$Types.m27701f(type2)) || !isAssignableFrom(type2, (GenericArrayType) this.type)) {
            return false;
        } else {
            return true;
        }
    }

    public C18541a(Type type2) {
        type2.getClass();
        Type b = C$Gson$Types.m27697b(type2);
        this.type = b;
        this.rawType = C$Gson$Types.m27701f(b);
        this.hashCode = b.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(C18541a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }

    private static boolean isAssignableFrom(Type type2, GenericArrayType genericArrayType) {
        Class<?> cls;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            cls = ((GenericArrayType) type2).getGenericComponentType();
        } else {
            boolean z = type2 instanceof Class;
            cls = type2;
            if (z) {
                Class<?> cls2 = (Class) type2;
                while (cls2.isArray()) {
                    cls2 = cls2.getComponentType();
                }
                cls = cls2;
            }
        }
        return isAssignableFrom(cls, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean isAssignableFrom(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type2 == null) {
            return false;
        }
        if (parameterizedType.equals(type2)) {
            return true;
        }
        Class<?> f = C$Gson$Types.m27701f(type2);
        ParameterizedType parameterizedType2 = null;
        if (type2 instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type2;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = f.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type3 = actualTypeArguments[i];
                TypeVariable typeVariable = typeParameters[i];
                while (type3 instanceof TypeVariable) {
                    type3 = map.get(((TypeVariable) type3).getName());
                }
                map.put(typeVariable.getName(), type3);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type isAssignableFrom : f.getGenericInterfaces()) {
            if (isAssignableFrom(isAssignableFrom, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(f.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }
}
