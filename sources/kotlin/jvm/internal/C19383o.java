package kotlin.jvm.internal;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0388a;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;
import p010a9.C0048b;

/* renamed from: kotlin.jvm.internal.o */
public final class C19383o {

    /* renamed from: kotlin.jvm.internal.o$a */
    public static class C19384a {
    }

    /* renamed from: a */
    public static boolean m32791a(Float f) {
        return f != null && f.floatValue() == 0.0f;
    }

    /* renamed from: b */
    public static boolean m32792b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static void m32793c(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(C0326j.m864i(str, " must not be null"));
            m32801k(C19383o.class.getName(), illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: d */
    public static void m32794d(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            m32801k(C19383o.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public static void m32795e(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            m32801k(C19383o.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static void m32796f(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(C0326j.m864i(str, " must not be null"));
            m32801k(C19383o.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: g */
    public static void m32797g(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(m32800j(str));
            m32801k(C19383o.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: h */
    public static void m32798h(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m32800j(str));
            m32801k(C19383o.class.getName(), illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    /* renamed from: i */
    public static int m32799i(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: j */
    public static String m32800j(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        StringBuilder f = C0388a.m1050f("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        f.append(str);
        return f.toString();
    }

    /* renamed from: k */
    public static void m32801k(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* renamed from: l */
    public static String m32802l(Object obj, String str) {
        return str + obj;
    }

    /* renamed from: m */
    public static void m32803m() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        m32801k(C19383o.class.getName(), kotlinNullPointerException);
        throw kotlinNullPointerException;
    }

    /* renamed from: n */
    public static void m32804n() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: o */
    public static void m32805o(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(C0048b.m163a("lateinit property ", str, " has not been initialized"));
        m32801k(C19383o.class.getName(), uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }
}
