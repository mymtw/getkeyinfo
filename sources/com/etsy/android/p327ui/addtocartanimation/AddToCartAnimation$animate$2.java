package com.etsy.android.p327ui.addtocartanimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p457ub.C13465b;

/* renamed from: com.etsy.android.ui.addtocartanimation.AddToCartAnimation$animate$2 */
public final class AddToCartAnimation$animate$2 extends AnimatorListenerAdapter {
    public final /* synthetic */ AnimatorSet $animatorSet;
    public final /* synthetic */ ValueAnimator $colorAnimation;
    public final /* synthetic */ C13465b this$0;

    public AddToCartAnimation$animate$2(C13465b bVar, AnimatorSet animatorSet, ValueAnimator valueAnimator) {
        this.this$0 = bVar;
        this.$animatorSet = animatorSet;
        this.$colorAnimation = valueAnimator;
    }

    public void onAnimationEnd(Animator animator) {
        C19383o.m32797g(animator, ResponseConstants.ANIMATION);
        super.onAnimationEnd(animator);
        this.this$0.f29484a.setVisibility(8);
        this.$animatorSet.removeAllListeners();
        this.$colorAnimation.removeAllUpdateListeners();
    }
}
