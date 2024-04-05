package p284x4;

import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: x4.e */
public final class C8320e {
    /* renamed from: a */
    public static C8318c m16615a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof C8318c) {
                    return (C8318c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                m16616b(cls, e);
                throw null;
            } catch (IllegalAccessException e2) {
                m16616b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m16616b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m16616b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: b */
    public static void m16616b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
