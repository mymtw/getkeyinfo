package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import p597jl.C18017f;
import p597jl.C18026m;
import p597jl.C18028o;
import p597jl.C18036w;

public final class MaterialElevationScale extends C18026m<C18028o> {
    private static final float DEFAULT_SCALE = 0.85f;
    private final boolean growing;

    public MaterialElevationScale(boolean z) {
        super(createPrimaryAnimatorProvider(z), createSecondaryAnimatorProvider());
        this.growing = z;
    }

    private static C18028o createPrimaryAnimatorProvider(boolean z) {
        C18028o oVar = new C18028o(z);
        oVar.f39439a = DEFAULT_SCALE;
        oVar.f39440b = DEFAULT_SCALE;
        return oVar;
    }

    private static C18036w createSecondaryAnimatorProvider() {
        return new C18017f();
    }

    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(C18036w wVar) {
        super.addAdditionalAnimatorProvider(wVar);
    }

    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public /* bridge */ /* synthetic */ C18036w getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isGrowing() {
        return this.growing;
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
