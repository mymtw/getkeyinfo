package p457ub;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.C19383o;

/* renamed from: ub.a */
public final /* synthetic */ class C13464a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C13465b f29483a;

    public /* synthetic */ C13464a(C13465b bVar) {
        this.f29483a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C13465b bVar = this.f29483a;
        C19383o.m32797g(bVar, "this$0");
        C19383o.m32797g(valueAnimator, "animator");
        Drawable background = bVar.f29484a.getBackground();
        C19383o.m32795e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C19383o.m32795e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ((GradientDrawable) background).setColor(((Integer) animatedValue).intValue());
    }
}
