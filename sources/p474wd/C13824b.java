package p474wd;

import android.animation.ValueAnimator;
import android.graphics.drawable.ShapeDrawable;
import kotlin.jvm.internal.C19383o;

/* renamed from: wd.b */
public final /* synthetic */ class C13824b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ShapeDrawable f30436a;

    public /* synthetic */ C13824b(ShapeDrawable shapeDrawable) {
        this.f30436a = shapeDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ShapeDrawable shapeDrawable = this.f30436a;
        C19383o.m32797g(shapeDrawable, "$circle");
        C19383o.m32797g(valueAnimator, "animator");
        float f = (float) 40;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C19383o.m32795e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        shapeDrawable.setIntrinsicHeight((int) (((Float) animatedValue).floatValue() * f));
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        C19383o.m32795e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        shapeDrawable.setIntrinsicWidth((int) (((Float) animatedValue2).floatValue() * f));
    }
}
