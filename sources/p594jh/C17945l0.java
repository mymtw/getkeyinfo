package p594jh;

import android.os.Build;
import androidx.compose.animation.C0391c;
import java.util.HashSet;

/* renamed from: jh.l0 */
public final class C17945l0 {

    /* renamed from: a */
    public static final HashSet<String> f39130a = new HashSet<>();

    /* renamed from: b */
    public static String f39131b = "goog.exo.core";

    static {
        new StringBuilder(C0391c.m1055a(Build.VERSION.RELEASE, 57));
    }

    /* renamed from: a */
    public static synchronized void m30331a(String str) {
        synchronized (C17945l0.class) {
            if (f39130a.add(str)) {
                String str2 = f39131b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f39131b = sb.toString();
            }
        }
    }
}
