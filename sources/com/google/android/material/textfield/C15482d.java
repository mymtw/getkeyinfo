package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.d */
public final class C15482d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C15473a f34754a;

    public C15482d(C15473a aVar) {
        this.f34754a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34754a.f34789c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
