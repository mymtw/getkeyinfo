package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import p003a2.C0015b;
import p597jl.C18020i;
import p597jl.C18026m;
import p597jl.C18028o;
import p597jl.C18031r;
import p597jl.C18036w;

public final class MaterialSharedAxis extends C18026m<C18036w> {
    private static final int DEFAULT_THEMED_DURATION_ATTR = 2130969653;
    private static final int DEFAULT_THEMED_EASING_ATTR = 2130969663;

    /* renamed from: X */
    public static final int f34999X = 0;

    /* renamed from: Y */
    public static final int f35000Y = 1;

    /* renamed from: Z */
    public static final int f35001Z = 2;
    private final int axis;
    private final boolean forward;

    public MaterialSharedAxis(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), createSecondaryAnimatorProvider());
        this.axis = i;
        this.forward = z;
    }

    private static C18036w createPrimaryAnimatorProvider(int i, boolean z) {
        if (i == 0) {
            return new C18031r(z ? 8388613 : 8388611);
        } else if (i == 1) {
            return new C18031r(z ? 80 : 48);
        } else if (i == 2) {
            return new C18028o(z);
        } else {
            throw new IllegalArgumentException(C0015b.m88g("Invalid axis: ", i));
        }
    }

    private static C18036w createSecondaryAnimatorProvider() {
        return new C18020i();
    }

    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(C18036w wVar) {
        super.addAdditionalAnimatorProvider(wVar);
    }

    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.axis;
    }

    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    public /* bridge */ /* synthetic */ C18036w getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    public /* bridge */ /* synthetic */ C18036w getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.forward;
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(C18036w wVar) {
        return super.removeAdditionalAnimatorProvider(wVar);
    }

    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(C18036w wVar) {
        super.setSecondaryAnimatorProvider(wVar);
    }
}
