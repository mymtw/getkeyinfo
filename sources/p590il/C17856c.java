package p590il;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: il.c */
public final class C17856c implements C17866m {
    /* renamed from: c */
    public static ValueAnimator m29979c(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C17854a(view, f, f2, f3, f4));
        ofFloat.addListener(new C17855b(f5, view));
        return ofFloat;
    }

    /* renamed from: a */
    public final Animator mo69085a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m29979c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }

    /* renamed from: b */
    public final Animator mo69086b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m29979c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }
}
