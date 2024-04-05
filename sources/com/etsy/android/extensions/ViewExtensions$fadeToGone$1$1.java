package com.etsy.android.extensions;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class ViewExtensions$fadeToGone$1$1 implements Animation.AnimationListener {
    public final /* synthetic */ int $duration;
    public final /* synthetic */ Interpolator $interpolator;
    public final /* synthetic */ View $this_apply;

    public ViewExtensions$fadeToGone$1$1(View view, int i, Interpolator interpolator) {
        this.$this_apply = view;
        this.$duration = i;
        this.$interpolator = interpolator;
    }

    public void onAnimationEnd(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
        View view = this.$this_apply;
        int i = this.$duration;
        Interpolator interpolator = this.$interpolator;
        C19383o.m32797g(interpolator, "interpolator");
        if (view != null && view.getVisibility() != 8) {
            Animation animation2 = view.getAnimation();
            boolean z = false;
            if (animation2 != null && !animation2.hasEnded()) {
                z = true;
            }
            if (z) {
                view.getAnimation().setAnimationListener(new ViewExtensions$fadeToGone$1$1(view, i, interpolator));
                return;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(view.getAlpha(), 0.0f);
            alphaAnimation.setInterpolator(interpolator);
            alphaAnimation.setDuration((long) i);
            alphaAnimation.setAnimationListener(new ViewExtensions$fadeToGone$1$2(view));
            view.startAnimation(alphaAnimation);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
    }

    public void onAnimationStart(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
    }
}
