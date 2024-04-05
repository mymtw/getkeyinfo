package p002a1;

import android.os.Build;

/* renamed from: a1.a */
public final class C0006a {
    /* renamed from: a */
    public static boolean m80a() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            if (!(!"REL".equals(str) && str.compareTo("S") >= 0)) {
                return false;
            }
        }
        return true;
    }
}
