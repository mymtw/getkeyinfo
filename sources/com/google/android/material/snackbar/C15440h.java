package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p558el.C17714a;
import p558el.C17716c;
import p629nk.C18268a;

/* renamed from: com.google.android.material.snackbar.h */
public final class C15440h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ BaseTransientBottomBar f34678b;

    public C15440h(BaseTransientBottomBar baseTransientBottomBar) {
        this.f34678b = baseTransientBottomBar;
    }

    public final void run() {
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.f34678b.f34654c;
        if (snackbarBaseLayout != null) {
            if (snackbarBaseLayout.getParent() != null) {
                this.f34678b.f34654c.setVisibility(0);
            }
            if (this.f34678b.f34654c.getAnimationMode() == 1) {
                BaseTransientBottomBar baseTransientBottomBar = this.f34678b;
                baseTransientBottomBar.getClass();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(C18268a.f40091a);
                ofFloat.addUpdateListener(new C15433a(baseTransientBottomBar));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat2.setInterpolator(C18268a.f40094d);
                ofFloat2.addUpdateListener(new C15434b(baseTransientBottomBar));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setDuration(150);
                animatorSet.addListener(new C17714a(baseTransientBottomBar));
                animatorSet.start();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = this.f34678b;
            int height = baseTransientBottomBar2.f34654c.getHeight();
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.f34654c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            baseTransientBottomBar2.f34654c.setTranslationY((float) height);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(C18268a.f40092b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new C17716c(baseTransientBottomBar2));
            valueAnimator.addUpdateListener(new C15435c(baseTransientBottomBar2, height));
            valueAnimator.start();
        }
    }
}
