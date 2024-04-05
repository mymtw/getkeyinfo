package p629nk;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import p003a2.C0023f;

/* renamed from: nk.a */
public final class C18268a {

    /* renamed from: a */
    public static final LinearInterpolator f40091a = new LinearInterpolator();

    /* renamed from: b */
    public static final FastOutSlowInInterpolator f40092b = new FastOutSlowInInterpolator();

    /* renamed from: c */
    public static final FastOutLinearInInterpolator f40093c = new FastOutLinearInInterpolator();

    /* renamed from: d */
    public static final LinearOutSlowInInterpolator f40094d = new LinearOutSlowInInterpolator();

    /* renamed from: e */
    public static final DecelerateInterpolator f40095e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m30884a(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : C0023f.m103b(f2, f, (f5 - f3) / (f4 - f3), f);
    }
}
