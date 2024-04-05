package com.paypal.pyplcheckout.animation.sequences;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C19383o;

public final class CheckoutAnimationSequence$cycleIV$animatedCallBack$1 extends Animatable2.AnimationCallback {
    public final /* synthetic */ AnimatedVectorDrawable $animatedVectorDrawable;

    public CheckoutAnimationSequence$cycleIV$animatedCallBack$1(AnimatedVectorDrawable animatedVectorDrawable) {
        this.$animatedVectorDrawable = animatedVectorDrawable;
    }

    public void onAnimationEnd(Drawable drawable) {
        C19383o.m32797g(drawable, "drawable");
        super.onAnimationEnd(drawable);
        this.$animatedVectorDrawable.start();
    }
}
