package p176m2;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m2.a */
public final class C7312a {

    /* renamed from: a */
    public static long f16204a;

    /* renamed from: b */
    public static Method f16205b;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m14027a() {
        try {
            if (f16205b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f16205b == null) {
                f16204a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f16205b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f16205b.invoke((Object) null, new Object[]{Long.valueOf(f16204a)})).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
