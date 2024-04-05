package com.paypal.pyplcheckout.utils;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class AnimationsDelegate {
    private volatile AnimationType currentAnimation;
    private final AtomicBoolean isAnimating = new AtomicBoolean(false);
    private final WeakReference<View> view;

    public enum AnimationType {
        EXPAND,
        SHRINK
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            iArr[AnimationType.EXPAND.ordinal()] = 1;
            iArr[AnimationType.SHRINK.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnimationsDelegate(View view2) {
        C19383o.m32797g(view2, "target");
        this.view = new WeakReference<>(view2);
    }

    private final void animateIfPossible(AnimationType animationType) {
        C2887s f0;
        Lifecycle lifecycle;
        View view2 = this.view.get();
        Lifecycle.State state = null;
        if (!(view2 == null || (f0 = C15588c1.m25325f0(view2)) == null || (lifecycle = f0.getLifecycle()) == null)) {
            state = lifecycle.mo10734b();
        }
        boolean z = false;
        if (state != null && state.isAtLeast(Lifecycle.State.STARTED)) {
            z = true;
        }
        if (z) {
            runAnimationOnce(animationType);
        } else {
            updateFinalViewVisibility(animationType);
        }
    }

    /* access modifiers changed from: private */
    public final void onAnimationFinished() {
        this.isAnimating.set(false);
        this.currentAnimation = null;
    }

    private final void runAnimationOnce(AnimationType animationType) {
        View view2 = this.view.get();
        if (view2 != null) {
            if (this.isAnimating.compareAndSet(false, true)) {
                this.currentAnimation = animationType;
                int i = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
                if (i == 1) {
                    AnimationUtils.expand$default(AnimationUtils.INSTANCE, view2, 0, 0, (Interpolator) null, false, new AnimationsDelegate$runAnimationOnce$1(this), 30, (Object) null);
                } else if (i == 2) {
                    AnimationUtils.shrink$default(AnimationUtils.INSTANCE, view2, 0, 0, (Interpolator) null, false, new AnimationsDelegate$runAnimationOnce$2(this), 30, (Object) null);
                }
            } else {
                updateVisibilityIfNeeded(animationType);
            }
        }
    }

    private final void updateFinalViewVisibility(AnimationType animationType) {
        int i;
        View view2 = this.view.get();
        if (view2 != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 8;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            view2.setVisibility(i);
        }
    }

    private final synchronized void updateVisibilityIfNeeded(AnimationType animationType) {
        if (animationType != this.currentAnimation) {
            updateFinalViewVisibility(animationType);
            this.isAnimating.set(false);
            this.currentAnimation = null;
        }
    }

    public final synchronized void expand() {
        animateIfPossible(AnimationType.EXPAND);
    }

    public final synchronized void shrink() {
        animateIfPossible(AnimationType.SHRINK);
    }
}
