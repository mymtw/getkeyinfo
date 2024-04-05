package p474wd;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import kotlin.jvm.internal.C19383o;

/* renamed from: wd.a */
public final /* synthetic */ class C13823a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ShapeDrawable f30435a;

    public /* synthetic */ C13823a(ShapeDrawable shapeDrawable) {
        this.f30435a = shapeDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ShapeDrawable shapeDrawable = this.f30435a;
        C19383o.m32797g(shapeDrawable, "$circle");
        C19383o.m32797g(valueAnimator, "animator");
        Paint paint = shapeDrawable.getPaint();
        Object animatedValue = valueAnimator.getAnimatedValue();
        C19383o.m32795e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        paint.setStrokeWidth(((Float) animatedValue).floatValue());
    }
}
