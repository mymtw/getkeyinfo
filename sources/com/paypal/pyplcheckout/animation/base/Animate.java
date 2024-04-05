package com.paypal.pyplcheckout.animation.base;

import android.animation.Animator;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class Animate {
    private final BaseViewAnimator animator;
    private final List<Animator.AnimatorListener> callbacks;
    private final long delay;
    private final long duration;
    private final Interpolator interpolator;
    private final float pivotX;
    private final float pivotY;
    private final boolean repeat;
    private final int repeatMode;
    private final int repeatTimes;
    private final View target;

    public static final class AnimationComposer {
        private final BaseViewAnimator animator;
        private final List<Animator.AnimatorListener> callbacks = new ArrayList();
        private long delay;
        private long duration = 1000;
        public Interpolator interpolator;
        private float pivotX = Float.MAX_VALUE;
        private float pivotY = Float.MAX_VALUE;
        private boolean repeat;
        private int repeatMode = 1;
        private int repeatTimes;
        public View target;

        public AnimationComposer(BaseViewAnimator baseViewAnimator) {
            C19383o.m32797g(baseViewAnimator, "animator");
            this.animator = baseViewAnimator;
        }

        public final AnimationComposer delay(long j) {
            this.delay = j;
            return this;
        }

        public final AnimationComposer duration(long j) {
            this.duration = j;
            return this;
        }

        public final BaseViewAnimator getAnimator$pyplcheckout_externalThreedsRelease() {
            return this.animator;
        }

        public final List<Animator.AnimatorListener> getCallbacks$pyplcheckout_externalThreedsRelease() {
            return this.callbacks;
        }

        public final long getDelay$pyplcheckout_externalThreedsRelease() {
            return this.delay;
        }

        public final long getDuration$pyplcheckout_externalThreedsRelease() {
            return this.duration;
        }

        public final Interpolator getInterpolator$pyplcheckout_externalThreedsRelease() {
            Interpolator interpolator2 = this.interpolator;
            if (interpolator2 != null) {
                return interpolator2;
            }
            C19383o.m32805o("interpolator");
            throw null;
        }

        public final float getPivotX$pyplcheckout_externalThreedsRelease() {
            return this.pivotX;
        }

        public final float getPivotY$pyplcheckout_externalThreedsRelease() {
            return this.pivotY;
        }

        public final boolean getRepeat$pyplcheckout_externalThreedsRelease() {
            return this.repeat;
        }

        public final int getRepeatMode$pyplcheckout_externalThreedsRelease() {
            return this.repeatMode;
        }

        public final int getRepeatTimes$pyplcheckout_externalThreedsRelease() {
            return this.repeatTimes;
        }

        public final View getTarget$pyplcheckout_externalThreedsRelease() {
            View view = this.target;
            if (view != null) {
                return view;
            }
            C19383o.m32805o("target");
            throw null;
        }

        public final AnimationComposer interpolate(Interpolator interpolator2) {
            C19383o.m32797g(interpolator2, "interpolator");
            setInterpolator$pyplcheckout_externalThreedsRelease(interpolator2);
            return this;
        }

        public final void onCancel(AnimatorCallback animatorCallback) {
            C19383o.m32797g(animatorCallback, "callback");
            this.callbacks.add(new Animate$AnimationComposer$onCancel$1(animatorCallback));
        }

        public final void onEnd(AnimatorCallback animatorCallback) {
            C19383o.m32797g(animatorCallback, "callback");
            this.callbacks.add(new Animate$AnimationComposer$onEnd$1(animatorCallback));
        }

        public final void onRepeat(AnimatorCallback animatorCallback) {
            C19383o.m32797g(animatorCallback, "callback");
            this.callbacks.add(new Animate$AnimationComposer$onRepeat$1(animatorCallback));
        }

        public final AnimationComposer onStart(AnimatorCallback animatorCallback) {
            C19383o.m32797g(animatorCallback, "callback");
            this.callbacks.add(new Animate$AnimationComposer$onStart$1(animatorCallback));
            return this;
        }

        public final AnimationComposer pivot(float f, float f2) {
            this.pivotX = f;
            this.pivotY = f2;
            return this;
        }

        public final AnimationComposer pivotX(float f) {
            this.pivotX = f;
            return this;
        }

        public final AnimationComposer pivotY(float f) {
            this.pivotY = f;
            return this;
        }

        public final AnimateString playOn(View view) {
            C19383o.m32797g(view, "target");
            setTarget$pyplcheckout_externalThreedsRelease(view);
            return new AnimateString(new Animate(this).play(), getTarget$pyplcheckout_externalThreedsRelease());
        }

        public final AnimationComposer repeat(int i) {
            if (i >= -1) {
                this.repeat = i != 0;
                this.repeatTimes = i;
                return this;
            }
            throw new RuntimeException("Can not be less than -1, -1 is infinite loop");
        }

        public final AnimationComposer repeatMode(int i) {
            this.repeatMode = i;
            return this;
        }

        public final void setDelay$pyplcheckout_externalThreedsRelease(long j) {
            this.delay = j;
        }

        public final void setDuration$pyplcheckout_externalThreedsRelease(long j) {
            this.duration = j;
        }

        public final void setInterpolator$pyplcheckout_externalThreedsRelease(Interpolator interpolator2) {
            C19383o.m32797g(interpolator2, "<set-?>");
            this.interpolator = interpolator2;
        }

        public final void setPivotX$pyplcheckout_externalThreedsRelease(float f) {
            this.pivotX = f;
        }

        public final void setPivotY$pyplcheckout_externalThreedsRelease(float f) {
            this.pivotY = f;
        }

        public final void setRepeat$pyplcheckout_externalThreedsRelease(boolean z) {
            this.repeat = z;
        }

        public final void setRepeatMode$pyplcheckout_externalThreedsRelease(int i) {
            this.repeatMode = i;
        }

        public final void setRepeatTimes$pyplcheckout_externalThreedsRelease(int i) {
            this.repeatTimes = i;
        }

        public final void setTarget$pyplcheckout_externalThreedsRelease(View view) {
            C19383o.m32797g(view, "<set-?>");
            this.target = view;
        }

        public final AnimationComposer withListener(Animator.AnimatorListener animatorListener) {
            C19383o.m32797g(animatorListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.callbacks.add(animatorListener);
            return this;
        }
    }

    public interface AnimatorCallback {
        void call(Animator animator);
    }

    public static class EmptyAnimatorListener implements Animator.AnimatorListener {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationEnd(Animator animator, boolean z) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationStart(Animator animator, boolean z) {
        }
    }

    public Animate(AnimationComposer animationComposer) {
        C19383o.m32797g(animationComposer, "animationComposer");
        this.animator = animationComposer.getAnimator$pyplcheckout_externalThreedsRelease();
        this.duration = animationComposer.getDuration$pyplcheckout_externalThreedsRelease();
        this.delay = animationComposer.getDelay$pyplcheckout_externalThreedsRelease();
        this.repeat = animationComposer.getRepeat$pyplcheckout_externalThreedsRelease();
        this.repeatTimes = animationComposer.getRepeatTimes$pyplcheckout_externalThreedsRelease();
        this.repeatMode = animationComposer.getRepeatMode$pyplcheckout_externalThreedsRelease();
        this.interpolator = animationComposer.getInterpolator$pyplcheckout_externalThreedsRelease();
        this.pivotX = animationComposer.getPivotX$pyplcheckout_externalThreedsRelease();
        this.pivotY = animationComposer.getPivotY$pyplcheckout_externalThreedsRelease();
        this.callbacks = animationComposer.getCallbacks$pyplcheckout_externalThreedsRelease();
        this.target = animationComposer.getTarget$pyplcheckout_externalThreedsRelease();
    }

    /* access modifiers changed from: private */
    public final BaseViewAnimator play() {
        this.animator.setTarget(this.target);
        float f = this.pivotX;
        boolean z = true;
        if (f == Float.MAX_VALUE) {
            View view = this.target;
            view.setPivotX(((float) view.getMeasuredWidth()) / 2.0f);
        } else {
            this.target.setPivotX(f);
        }
        float f2 = this.pivotY;
        if (f2 != Float.MAX_VALUE) {
            z = false;
        }
        if (z) {
            View view2 = this.target;
            view2.setPivotY(((float) view2.getMeasuredHeight()) / 2.0f);
        } else {
            this.target.setPivotY(f2);
        }
        this.animator.setDuration(this.duration).setRepeatTimes(this.repeatTimes).setRepeatMode(this.repeatMode).setInterpolator(this.interpolator).setStartDelay(this.delay);
        if (this.callbacks.size() > 0) {
            for (Animator.AnimatorListener addAnimatorListener : this.callbacks) {
                this.animator.addAnimatorListener(addAnimatorListener);
            }
        }
        this.animator.animate();
        return this.animator;
    }

    public final AnimationComposer with(AnimationBehavior animationBehavior) {
        C19383o.m32797g(animationBehavior, "animationBehavior");
        return new AnimationComposer(animationBehavior.getAnimator());
    }

    public static final class AnimateString {
        private final BaseViewAnimator animator;
        private final View target;

        public AnimateString(BaseViewAnimator baseViewAnimator, View view) {
            C19383o.m32797g(baseViewAnimator, "animator");
            C19383o.m32797g(view, "target");
            this.animator = baseViewAnimator;
            this.target = view;
        }

        public final boolean isRunning() {
            return this.animator.isRunning();
        }

        public final boolean isStarted() {
            return this.animator.isStarted();
        }

        public final void stop(boolean z) {
            this.animator.cancel();
            if (z) {
                this.animator.reset(this.target);
            }
        }

        public final void stop() {
            stop(true);
        }
    }

    public final AnimationComposer with(BaseViewAnimator baseViewAnimator) {
        C19383o.m32797g(baseViewAnimator, "animator");
        return new AnimationComposer(baseViewAnimator);
    }
}
