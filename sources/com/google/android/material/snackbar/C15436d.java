package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;

/* renamed from: com.google.android.material.snackbar.d */
public final class C15436d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f34674a;

    public C15436d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f34674a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.f34649n;
        this.f34674a.f34654c.setTranslationY((float) intValue);
    }
}
