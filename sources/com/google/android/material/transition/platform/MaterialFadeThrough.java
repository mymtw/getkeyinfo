package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import p597jl.C18020i;
import p597jl.C18026m;
import p597jl.C18028o;
import p597jl.C18036w;

public final class MaterialFadeThrough extends C18026m<C18020i> {
    private static final float DEFAULT_START_SCALE = 0.92f;
    private static final int DEFAULT_THEMED_DURATION_ATTR = 2130969653;
    private static final int DEFAULT_THEMED_EASING_ATTR = 2130969663;

    public MaterialFadeThrough() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static C18020i createPrimaryAnimatorProvider() {
        return new C18020i();
    }

    private static C18036w createSecondaryAnimatorProvider() {
        C18028o oVar = new C18028o(true);
        oVar.f39442d = false;
        oVar.f39440b = DEFAULT_START_SCALE;
        return oVar;
    }

    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(C18036w wVar) {
        super.addAdditionalAnimatorProvider(wVar);
    }

    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    public /* bridge */ /* synthetic */ C18036w getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
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
