package p518bp;

import android.animation.ValueAnimator;
import android.view.View;
import com.paypal.pyplcheckout.animation.sliders.SlideOutRightAnimation;

/* renamed from: bp.a */
public final /* synthetic */ class C14142a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f31158a;

    public /* synthetic */ C14142a(View view) {
        this.f31158a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SlideOutRightAnimation.m35211prepare$lambda0(this.f31158a, valueAnimator);
    }
}
