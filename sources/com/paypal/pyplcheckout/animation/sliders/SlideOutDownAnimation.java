package com.paypal.pyplcheckout.animation.sliders;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.paypal.pyplcheckout.animation.base.BaseViewAnimator;
import kotlin.jvm.internal.C19383o;

public final class SlideOutDownAnimation extends BaseViewAnimator {
    public void prepare(View view) {
        C19383o.m32797g(view, "target");
        ViewParent parent = view.getParent();
        if (parent != null) {
            int height = ((ViewGroup) parent).getHeight() - view.getTop();
            getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) height})});
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
