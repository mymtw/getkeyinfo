package p597jl;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: jl.i */
public final class C18020i implements C18036w {
    /* renamed from: c */
    public static ValueAnimator m30450c(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C18018g(view, f, f2, f3, f4));
        ofFloat.addListener(new C18019h(f5, view));
        return ofFloat;
    }

    /* renamed from: a */
    public final Animator mo69584a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m30450c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }

    /* renamed from: b */
    public final Animator mo69585b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m30450c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }
}
