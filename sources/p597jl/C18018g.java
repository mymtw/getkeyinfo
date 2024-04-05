package p597jl;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: jl.g */
public final class C18018g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f39421a;

    /* renamed from: b */
    public final /* synthetic */ float f39422b;

    /* renamed from: c */
    public final /* synthetic */ float f39423c;

    /* renamed from: d */
    public final /* synthetic */ float f39424d;

    /* renamed from: e */
    public final /* synthetic */ float f39425e;

    public C18018g(View view, float f, float f2, float f3, float f4) {
        this.f39421a = view;
        this.f39422b = f;
        this.f39423c = f2;
        this.f39424d = f3;
        this.f39425e = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f39421a.setAlpha(C18035v.m30473c(this.f39422b, this.f39423c, this.f39424d, this.f39425e, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false));
    }
}
