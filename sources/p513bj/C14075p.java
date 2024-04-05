package p513bj;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.animation.C0391c;
import java.net.UnknownHostException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

@SuppressLint({"InlinedApi"})
/* renamed from: bj.p */
public final class C14075p {
    @Pure
    /* renamed from: a */
    public static String m21689a(String str, Throwable th) {
        String str2;
        boolean z;
        if (th == null) {
            str2 = null;
        } else {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    z = true;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            str2 = z ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = str2.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(C0391c.m1055a(replace, valueOf.length() + 4));
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace);
        sb.append(10);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m21690b(String str) {
        if (C14049b0.f30913a >= 18) {
            Trace.beginSection(str);
        }
    }

    @Pure
    /* renamed from: c */
    public static void m21691c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: d */
    public static void m21692d(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    /* renamed from: e */
    public static void m21693e(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    /* renamed from: f */
    public static void m21694f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* renamed from: g */
    public static void m21695g(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: h */
    public static void m21696h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: i */
    public static void m21697i(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    @Pure
    /* renamed from: j */
    public static void m21698j(String str, String str2, Throwable th) {
        Log.e(str, m21689a(str2, th));
    }

    /* renamed from: k */
    public static void m21699k() {
        if (C14049b0.f30913a >= 18) {
            Trace.endSection();
        }
    }

    @Pure
    /* renamed from: l */
    public static void m21700l(String str, String str2, Throwable th) {
        Log.w(str, m21689a(str2, th));
    }
}
