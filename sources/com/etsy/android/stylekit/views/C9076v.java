package com.etsy.android.stylekit.views;

import android.animation.ValueAnimator;

/* renamed from: com.etsy.android.stylekit.views.v */
public final /* synthetic */ class C9076v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ LoadingIndicatorDrawable f19962a;

    public /* synthetic */ C9076v(LoadingIndicatorDrawable loadingIndicatorDrawable) {
        this.f19962a = loadingIndicatorDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LoadingIndicatorDrawable.m34906angleValueAnimator$lambda4$lambda3(this.f19962a, valueAnimator);
    }
}
