package p492yf;

import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

/* renamed from: yf.i */
public final class C13938i {
    static {
        new C13938i();
    }

    /* renamed from: a */
    public static final Class<?> m21464a(String str) {
        Class<C13938i> cls = C13938i.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final Method m21465b(Class<?> cls, String str, Class<?>... clsArr) {
        Class<C13938i> cls2 = C13938i.class;
        if (C13080a.m20762b(cls2)) {
            return null;
        }
        try {
            C19383o.m32797g(cls, "clazz");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            C13080a.m20761a(cls2, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final Object m21466c(Class cls, Object obj, Method method, Object... objArr) {
        Class<C13938i> cls2 = C13938i.class;
        if (C13080a.m20762b(cls2)) {
            return null;
        }
        try {
            C19383o.m32797g(cls, "clazz");
            C19383o.m32797g(method, ResponseConstants.METHOD);
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            C13080a.m20761a(cls2, th);
            return null;
        }
    }
}
