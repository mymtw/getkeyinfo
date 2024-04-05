package com.etsy.android.uikit.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

public class HardwareAnimatorListener extends AnimatorListenerAdapter {
    private View mAnimationView;
    private int mOriginalLayerType;

    public HardwareAnimatorListener(View view) {
        this.mAnimationView = view;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        View view = this.mAnimationView;
        if (view != null) {
            view.setLayerType(this.mOriginalLayerType, (Paint) null);
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        View view = this.mAnimationView;
        if (view != null) {
            this.mOriginalLayerType = view.getLayerType();
            this.mAnimationView.setLayerType(2, (Paint) null);
        }
    }
}
