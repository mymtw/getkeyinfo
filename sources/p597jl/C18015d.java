package p597jl;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: jl.d */
public final class C18015d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f39413a;

    /* renamed from: b */
    public final /* synthetic */ float f39414b;

    /* renamed from: c */
    public final /* synthetic */ float f39415c;

    /* renamed from: d */
    public final /* synthetic */ float f39416d = 0.0f;

    /* renamed from: e */
    public final /* synthetic */ float f39417e;

    public C18015d(View view, float f, float f2, float f3) {
        this.f39413a = view;
        this.f39414b = f;
        this.f39415c = f2;
        this.f39417e = f3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f39413a.setAlpha(C18035v.m30473c(this.f39414b, this.f39415c, this.f39416d, this.f39417e, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
