package p597jl;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: jl.f */
public final class C18017f implements C18036w {

    /* renamed from: a */
    public float f39420a = 1.0f;

    /* renamed from: c */
    public static ValueAnimator m30447c(View view, float f, float f2, float f3, float f4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C18015d(view, f, f2, f3));
        ofFloat.addListener(new C18016e(f4, view));
        return ofFloat;
    }

    /* renamed from: a */
    public final Animator mo69584a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m30447c(view, alpha, 0.0f, 1.0f, alpha);
    }

    /* renamed from: b */
    public final Animator mo69585b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m30447c(view, 0.0f, alpha, this.f39420a, alpha);
    }
}
