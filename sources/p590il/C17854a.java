package p590il;

import android.animation.ValueAnimator;
import android.view.View;
import p003a2.C0023f;

/* renamed from: il.a */
public final class C17854a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f38769a;

    /* renamed from: b */
    public final /* synthetic */ float f38770b;

    /* renamed from: c */
    public final /* synthetic */ float f38771c;

    /* renamed from: d */
    public final /* synthetic */ float f38772d;

    /* renamed from: e */
    public final /* synthetic */ float f38773e;

    public C17854a(View view, float f, float f2, float f3, float f4) {
        this.f38769a = view;
        this.f38770b = f;
        this.f38771c = f2;
        this.f38772d = f3;
        this.f38773e = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f38769a;
        float f = this.f38770b;
        float f2 = this.f38771c;
        float f3 = this.f38772d;
        float f4 = this.f38773e;
        int i = C17865l.f38790a;
        if (floatValue >= f3) {
            f = floatValue > f4 ? f2 : C0023f.m103b(f2, f, (floatValue - f3) / (f4 - f3), f);
        }
        view.setAlpha(f);
    }
}
