package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import p597jl.C18017f;
import p597jl.C18026m;
import p597jl.C18028o;
import p597jl.C18036w;
import p629nk.C18268a;

public final class MaterialFade extends C18026m<C18017f> {
    private static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    private static final float DEFAULT_START_SCALE = 0.8f;
    private static final int DEFAULT_THEMED_EASING_ATTR = 2130969662;
    private static final int DEFAULT_THEMED_INCOMING_DURATION_ATTR = 2130969658;
    private static final int DEFAULT_THEMED_OUTGOING_DURATION_ATTR = 2130969657;

    public MaterialFade() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    private static C18017f createPrimaryAnimatorProvider() {
        C18017f fVar = new C18017f();
        fVar.f39420a = DEFAULT_FADE_END_THRESHOLD_ENTER;
        return fVar;
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

    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return C18268a.f40091a;
    }

    public int getDurationThemeAttrResId(boolean z) {
        return z ? DEFAULT_THEMED_INCOMING_DURATION_ATTR : DEFAULT_THEMED_OUTGOING_DURATION_ATTR;
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
