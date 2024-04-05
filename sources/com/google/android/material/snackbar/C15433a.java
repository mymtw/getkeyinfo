package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.a */
public final class C15433a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f34671a;

    public C15433a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f34671a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34671a.f34654c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
