package com.paypal.pyplcheckout.animation.base;

import android.animation.Animator;
import com.paypal.pyplcheckout.animation.base.Animate;

public final class Animate$AnimationComposer$onStart$1 extends Animate.EmptyAnimatorListener {
    public final /* synthetic */ Animate.AnimatorCallback $callback;

    public Animate$AnimationComposer$onStart$1(Animate.AnimatorCallback animatorCallback) {
        this.$callback = animatorCallback;
    }

    public void onAnimationStart(Animator animator) {
        if (animator != null) {
            this.$callback.call(animator);
        }
    }
}
