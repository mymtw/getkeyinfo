package p186n2;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: n2.w */
public final class C7437w {

    /* renamed from: a */
    public static boolean f16622a = true;

    /* renamed from: a */
    public static void m14371a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f16622a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f16622a = false;
            }
        }
    }
}
