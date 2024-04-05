package com.paypal.pyplcheckout.animation.base;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;

public abstract class BaseViewAnimator {
    private AnimatorSet animatorSet = new AnimatorSet();
    private long duration = 1000;
    private int repeatMode = 1;
    private int repeatTimes;

    public final BaseViewAnimator addAnimatorListener(Animator.AnimatorListener animatorListener) {
        C19383o.m32797g(animatorListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.animatorSet.addListener(animatorListener);
        return this;
    }

    public final void animate() {
        start();
    }

    public final void cancel() {
        this.animatorSet.cancel();
    }

    public final AnimatorSet getAnimatorAgent() {
        return this.animatorSet;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getStartDelay() {
        return this.animatorSet.getStartDelay();
    }

    public final boolean isRunning() {
        return this.animatorSet.isRunning();
    }

    public final boolean isStarted() {
        return this.animatorSet.isStarted();
    }

    public abstract void prepare(View view);

    public final void removeAllListener() {
        this.animatorSet.removeAllListeners();
    }

    public final void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animatorSet.removeListener(animatorListener);
    }

    public final void reset(View view) {
        C19383o.m32797g(view, "target");
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
    }

    public final void restart() {
        AnimatorSet clone = this.animatorSet.clone();
        C19383o.m32796f(clone, "animatorSet.clone()");
        this.animatorSet = clone;
        start();
    }

    /* renamed from: setDuration  reason: collision with other method in class */
    public final void m35203setDuration(long j) {
        this.duration = j;
    }

    public final BaseViewAnimator setInterpolator(Interpolator interpolator) {
        C19383o.m32797g(interpolator, "interpolator");
        this.animatorSet.setInterpolator(interpolator);
        return this;
    }

    public final BaseViewAnimator setRepeatMode(int i) {
        this.repeatMode = i;
        return this;
    }

    public final BaseViewAnimator setRepeatTimes(int i) {
        this.repeatTimes = i;
        return this;
    }

    public final BaseViewAnimator setStartDelay(long j) {
        getAnimatorAgent().setStartDelay(j);
        return this;
    }

    public final BaseViewAnimator setTarget(View view) {
        C19383o.m32797g(view, "target");
        reset(view);
        prepare(view);
        return this;
    }

    public final void start() {
        Iterator<Animator> it = this.animatorSet.getChildAnimations().iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (next instanceof ValueAnimator) {
                ValueAnimator valueAnimator = (ValueAnimator) next;
                valueAnimator.setRepeatCount(this.repeatTimes);
                valueAnimator.setRepeatMode(this.repeatMode);
            }
        }
        this.animatorSet.setDuration(this.duration);
        this.animatorSet.start();
    }

    public final BaseViewAnimator setDuration(long j) {
        this.duration = j;
        return this;
    }
}
