package com.paypal.pyplcheckout.animation.sliders;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.paypal.pyplcheckout.animation.base.BaseViewAnimator;
import kotlin.jvm.internal.C19383o;

public final class SlideOutLeftAnimation extends BaseViewAnimator {
    public void prepare(View view) {
        C19383o.m32797g(view, "target");
        getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, -((float) view.getRight())})});
    }
}
