package com.paypal.pyplcheckout.animation.sliders;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.paypal.pyplcheckout.animation.base.BaseViewAnimator;
import kotlin.jvm.internal.C19383o;

public final class SlideInDownAnimation extends BaseViewAnimator {
    public void prepare(View view) {
        C19383o.m32797g(view, "target");
        int height = view.getHeight() + view.getTop();
        getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(view, "translationY", new float[]{-((float) height), 0.0f})});
    }
}
