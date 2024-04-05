package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;

/* renamed from: com.google.android.material.snackbar.c */
public final class C15435c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f34673a;

    public C15435c(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f34673a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.f34649n;
        this.f34673a.f34654c.setTranslationY((float) intValue);
    }
}
