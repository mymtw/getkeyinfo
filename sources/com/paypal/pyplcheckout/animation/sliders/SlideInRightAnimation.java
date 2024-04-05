package com.paypal.pyplcheckout.animation.sliders;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10269e;
import com.paypal.pyplcheckout.animation.base.BaseViewAnimator;
import kotlin.jvm.internal.C19383o;

public final class SlideInRightAnimation extends BaseViewAnimator {
    /* access modifiers changed from: private */
    /* renamed from: prepare$lambda-0  reason: not valid java name */
    public static final void m35210prepare$lambda0(View view, ValueAnimator valueAnimator) {
        C19383o.m32797g(view, "$target");
        view.requestLayout();
    }

    public void prepare(View view) {
        C19383o.m32797g(view, "target");
        ViewParent parent = view.getParent();
        if (parent != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{(float) (((ViewGroup) parent).getWidth() - view.getLeft()), 0.0f});
            ofFloat.addUpdateListener(new C10269e(view, 1));
            getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}), ofFloat});
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
