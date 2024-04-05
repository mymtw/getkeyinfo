package com.paypal.pyplcheckout.animation.sliders;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.paypal.pyplcheckout.animation.base.BaseViewAnimator;
import kotlin.jvm.internal.C19383o;
import p518bp.C14142a;

public final class SlideOutRightAnimation extends BaseViewAnimator {
    /* access modifiers changed from: private */
    /* renamed from: prepare$lambda-0  reason: not valid java name */
    public static final void m35211prepare$lambda0(View view, ValueAnimator valueAnimator) {
        C19383o.m32797g(view, "$target");
        view.requestLayout();
    }

    public void prepare(View view) {
        C19383o.m32797g(view, "target");
        ViewParent parent = view.getParent();
        if (parent != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, (float) (((ViewGroup) parent).getWidth() - view.getLeft())});
            ofFloat.addUpdateListener(new C14142a(view));
            getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}), ofFloat});
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
