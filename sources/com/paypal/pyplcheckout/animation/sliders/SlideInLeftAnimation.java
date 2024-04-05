package com.paypal.pyplcheckout.animation.sliders;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.paypal.pyplcheckout.animation.base.BaseViewAnimator;
import kotlin.jvm.internal.C19383o;

public final class SlideInLeftAnimation extends BaseViewAnimator {
    public void prepare(View view) {
        C19383o.m32797g(view, "target");
        ViewParent parent = view.getParent();
        if (parent != null) {
            int width = ((ViewGroup) parent).getWidth() - view.getLeft();
            getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(view, "translationX", new float[]{-((float) width), 0.0f})});
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
