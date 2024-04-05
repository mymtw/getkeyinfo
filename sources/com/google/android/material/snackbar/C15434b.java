package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.b */
public final class C15434b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f34672a;

    public C15434b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f34672a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f34672a.f34654c.setScaleX(floatValue);
        this.f34672a.f34654c.setScaleY(floatValue);
    }
}
