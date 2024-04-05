package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.i */
public final class C15495i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C15486h f34782a;

    public C15495i(C15486h hVar) {
        this.f34782a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34782a.f34789c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
