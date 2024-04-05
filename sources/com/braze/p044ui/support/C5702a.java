package com.braze.p044ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

/* renamed from: com.braze.ui.support.a */
public final class C5702a {

    /* renamed from: a */
    public static final AccelerateInterpolator f12101a = new AccelerateInterpolator();

    /* renamed from: b */
    public static final DecelerateInterpolator f12102b = new DecelerateInterpolator();

    /* renamed from: a */
    public static final TranslateAnimation m11486a(float f, float f2, long j) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f, 1, f2);
        m11487b(translateAnimation, j, false);
        return translateAnimation;
    }

    /* renamed from: b */
    public static final void m11487b(Animation animation, long j, boolean z) {
        animation.setDuration(j);
        if (z) {
            animation.setInterpolator(f12101a);
        } else {
            animation.setInterpolator(f12102b);
        }
    }
}
