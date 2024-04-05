package p773uq;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.util.Log;

/* renamed from: uq.a */
public final class C20205a {

    /* renamed from: a */
    public static boolean f44794a = Boolean.valueOf(System.getProperty("magnes.debug.mode", Boolean.FALSE.toString())).booleanValue();

    /* renamed from: a */
    public static void m34554a(String str, int i, Class cls) {
        boolean z = f44794a;
        if (!z) {
            return;
        }
        if (i == 0) {
            C0070b.m187j("****MAGNES DEBUGGING MESSAGE**** : ", str, cls.getSimpleName());
        } else if (i == 1) {
            String simpleName = cls.getSimpleName();
            Log.i(simpleName, "****MAGNES DEBUGGING MESSAGE**** : " + str);
        } else if (i == 2) {
            String simpleName2 = cls.getSimpleName();
            Log.w(simpleName2, "****MAGNES DEBUGGING MESSAGE**** : " + str);
        } else if (i == 3 && z) {
            String simpleName3 = cls.getSimpleName();
            Log.e(simpleName3, "****MAGNES DEBUGGING MESSAGE**** : " + str);
        }
    }

    /* renamed from: b */
    public static void m34555b(Throwable th, Class cls) {
        boolean z = f44794a;
        if (z && z) {
            String simpleName = cls.getSimpleName();
            StringBuilder h = C0072d.m201h("****MAGNES DEBUGGING MESSAGE**** : ");
            h.append(th.getMessage());
            Log.e(simpleName, h.toString(), th);
        }
    }
}
