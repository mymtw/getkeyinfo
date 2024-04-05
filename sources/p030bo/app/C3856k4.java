package p030bo.app;

import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.k4 */
public final class C3856k4 {

    /* renamed from: a */
    public static final C3856k4 f8737a = new C3856k4();

    private C3856k4() {
    }

    /* renamed from: a */
    public static final Method m8980a(Class<?> cls, String str, Class<?>... clsArr) {
        C19383o.m32797g(cls, "clazz");
        C19383o.m32797g(str, "methodName");
        C19383o.m32797g(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final Method m8982b(String str, String str2, Class<?>... clsArr) {
        C19383o.m32797g(str, "className");
        C19383o.m32797g(str2, "methodName");
        C19383o.m32797g(clsArr, "parameterTypes");
        try {
            return m8980a(Class.forName(str), str2, (Class<?>[]) (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final Object m8979a(Object obj, Method method, Object... objArr) {
        C19383o.m32797g(method, ResponseConstants.METHOD);
        C19383o.m32797g(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m8981a(String str, String str2, Class<?>... clsArr) {
        C19383o.m32797g(str, "className");
        C19383o.m32797g(str2, "methodName");
        C19383o.m32797g(clsArr, "parameterTypes");
        return m8982b(str, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)) != null;
    }
}
