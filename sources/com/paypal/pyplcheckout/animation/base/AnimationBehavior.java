package com.paypal.pyplcheckout.animation.base;

import com.paypal.pyplcheckout.animation.fading.FadeInAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeInDownAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeInLeftAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeInRightAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeInUpAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeOutAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeOutDownAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeOutLeftAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeOutRightAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeOutUpAnimation;
import com.paypal.pyplcheckout.animation.sliders.SlideInDownAnimation;
import com.paypal.pyplcheckout.animation.sliders.SlideInLeftAnimation;
import com.paypal.pyplcheckout.animation.sliders.SlideInRightAnimation;
import com.paypal.pyplcheckout.animation.sliders.SlideInUpAnimation;
import com.paypal.pyplcheckout.animation.sliders.SlideOutDownAnimation;
import com.paypal.pyplcheckout.animation.sliders.SlideOutLeftAnimation;
import com.paypal.pyplcheckout.animation.sliders.SlideOutRightAnimation;
import com.paypal.pyplcheckout.animation.sliders.SlideOutUpAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class AnimationBehavior {
    private final Class<?> animatorClazz;

    public enum Behavior {
        FADE_IN,
        FADE_IN_DOWN,
        FADE_IN_UP,
        FADE_IN_LEFT,
        FADE_IN_RIGHT,
        FADE_OUT,
        FADE_OUT_DOWN,
        FADE_OUT_UP,
        FADE_OUT_LEFT,
        FADE_OUT_RIGHT,
        SLIDE_IN_DOWN,
        SLIDE_IN_UP,
        SLIDE_IN_LEFT,
        SLIDE_IN_RIGHT,
        SLIDE_OUT_DOWN,
        SLIDE_OUT_UP,
        SLIDE_OUT_LEFT,
        SLIDE_OUT_RIGHT
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Behavior.values().length];
            iArr[Behavior.FADE_IN.ordinal()] = 1;
            iArr[Behavior.FADE_IN_DOWN.ordinal()] = 2;
            iArr[Behavior.FADE_IN_UP.ordinal()] = 3;
            iArr[Behavior.FADE_IN_LEFT.ordinal()] = 4;
            iArr[Behavior.FADE_IN_RIGHT.ordinal()] = 5;
            iArr[Behavior.FADE_OUT.ordinal()] = 6;
            iArr[Behavior.FADE_OUT_DOWN.ordinal()] = 7;
            iArr[Behavior.FADE_OUT_UP.ordinal()] = 8;
            iArr[Behavior.FADE_OUT_LEFT.ordinal()] = 9;
            iArr[Behavior.FADE_OUT_RIGHT.ordinal()] = 10;
            iArr[Behavior.SLIDE_IN_DOWN.ordinal()] = 11;
            iArr[Behavior.SLIDE_IN_UP.ordinal()] = 12;
            iArr[Behavior.SLIDE_IN_LEFT.ordinal()] = 13;
            iArr[Behavior.SLIDE_IN_RIGHT.ordinal()] = 14;
            iArr[Behavior.SLIDE_OUT_DOWN.ordinal()] = 15;
            iArr[Behavior.SLIDE_OUT_UP.ordinal()] = 16;
            iArr[Behavior.SLIDE_OUT_LEFT.ordinal()] = 17;
            iArr[Behavior.SLIDE_OUT_RIGHT.ordinal()] = 18;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnimationBehavior(Behavior behavior) {
        C19383o.m32797g(behavior, "animationBehavior");
        this.animatorClazz = getAnimatorClass(behavior);
    }

    private final Class<?> getAnimatorClass(Behavior behavior) {
        switch (WhenMappings.$EnumSwitchMapping$0[behavior.ordinal()]) {
            case 1:
                return FadeInAnimation.class;
            case 2:
                return FadeInDownAnimation.class;
            case 3:
                return FadeInUpAnimation.class;
            case 4:
                return FadeInLeftAnimation.class;
            case 5:
                return FadeInRightAnimation.class;
            case 6:
                return FadeOutAnimation.class;
            case 7:
                return FadeOutDownAnimation.class;
            case 8:
                return FadeOutUpAnimation.class;
            case 9:
                return FadeOutLeftAnimation.class;
            case 10:
                return FadeOutRightAnimation.class;
            case 11:
                return SlideInDownAnimation.class;
            case 12:
                return SlideInUpAnimation.class;
            case 13:
                return SlideInLeftAnimation.class;
            case 14:
                return SlideInRightAnimation.class;
            case 15:
                return SlideOutDownAnimation.class;
            case 16:
                return SlideOutUpAnimation.class;
            case 17:
                return SlideOutLeftAnimation.class;
            case 18:
                return SlideOutRightAnimation.class;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final BaseViewAnimator getAnimator() {
        try {
            Object newInstance = this.animatorClazz.newInstance();
            if (newInstance != null) {
                return (BaseViewAnimator) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.animation.base.BaseViewAnimator");
        } catch (Exception unused) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
