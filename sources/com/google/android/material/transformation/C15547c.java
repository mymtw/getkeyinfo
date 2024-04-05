package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* renamed from: com.google.android.material.transformation.c */
public final class C15547c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ CircularRevealWidget f34945a;

    public C15547c(CircularRevealWidget circularRevealWidget) {
        this.f34945a = circularRevealWidget;
    }

    public final void onAnimationEnd(Animator animator) {
        CircularRevealWidget.C15248a revealInfo = this.f34945a.getRevealInfo();
        revealInfo.f34200c = Float.MAX_VALUE;
        this.f34945a.setRevealInfo(revealInfo);
    }
}
