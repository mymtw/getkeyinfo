package com.paypal.pyplcheckout.animation.base;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.paypal.pyplcheckout.animation.base.b */
public final /* synthetic */ class C17195b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f37708a;

    public /* synthetic */ C17195b(View view) {
        this.f37708a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnimationUtils.m35201shrink$lambda5$lambda3(this.f37708a, valueAnimator);
    }
}
