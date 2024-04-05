package com.paypal.pyplcheckout.animation.base;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import kotlin.C19394m;
import p753kq.C19846a;

public final class AnimationUtils$expand$expandAnimation$2$1 implements Animation.AnimationListener {
    public final /* synthetic */ long $delay;
    public final /* synthetic */ long $duration;
    public final /* synthetic */ boolean $fadeInAfterExpand;
    public final /* synthetic */ Interpolator $interpolator;
    public final /* synthetic */ C19846a<C19394m> $onComplete;
    public final /* synthetic */ View $view;

    public AnimationUtils$expand$expandAnimation$2$1(boolean z, View view, Interpolator interpolator, long j, long j2, C19846a<C19394m> aVar) {
        this.$fadeInAfterExpand = z;
        this.$view = view;
        this.$interpolator = interpolator;
        this.$duration = j;
        this.$delay = j2;
        this.$onComplete = aVar;
    }

    public void onAnimationEnd(Animation animation) {
        C19846a<C19394m> aVar = this.$onComplete;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        if (this.$fadeInAfterExpand) {
            ViewPropertyAnimator animate = this.$view.animate();
            Interpolator interpolator = this.$interpolator;
            long j = this.$duration;
            long j2 = this.$delay;
            animate.alpha(1.0f);
            animate.setInterpolator(interpolator);
            animate.setDuration(j * ((long) 2));
            animate.setStartDelay(j2);
            animate.start();
        }
    }
}
