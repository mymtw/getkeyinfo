package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.e */
public final class C15483e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C15473a f34755a;

    public C15483e(C15473a aVar) {
        this.f34755a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f34755a.f34789c.setScaleX(floatValue);
        this.f34755a.f34789c.setScaleY(floatValue);
    }
}
