package p186n2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: n2.c0 */
public class C7389c0 extends C7387b0 {

    /* renamed from: K */
    public static boolean f16511K = true;

    @SuppressLint({"NewApi"})
    /* renamed from: p */
    public void mo19740p(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo19740p(i, view);
        } else if (f16511K) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f16511K = false;
            }
        }
    }
}
