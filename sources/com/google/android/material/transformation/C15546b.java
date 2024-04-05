package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* renamed from: com.google.android.material.transformation.b */
public final class C15546b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ CircularRevealWidget f34943a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f34944b;

    public C15546b(CircularRevealWidget circularRevealWidget, Drawable drawable) {
        this.f34943a = circularRevealWidget;
        this.f34944b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f34943a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f34943a.setCircularRevealOverlayDrawable(this.f34944b);
    }
}
