package p186n2;

import android.annotation.SuppressLint;
import android.view.View;
import p388lb.C13006a;

/* renamed from: n2.z */
public class C7442z extends C13006a {

    /* renamed from: G */
    public static boolean f16626G = true;

    @SuppressLint({"NewApi"})
    /* renamed from: q */
    public float mo19746q(View view) {
        if (f16626G) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f16626G = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: r */
    public void mo19747r(float f, View view) {
        if (f16626G) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f16626G = false;
            }
        }
        view.setAlpha(f);
    }
}
