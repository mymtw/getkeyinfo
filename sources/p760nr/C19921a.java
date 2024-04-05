package p760nr;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: nr.a */
public final class C19921a {
    /* renamed from: a */
    public static <T> T m34065a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C19921a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
