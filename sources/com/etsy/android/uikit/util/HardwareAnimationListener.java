package com.etsy.android.uikit.util;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;

public class HardwareAnimationListener implements Animation.AnimationListener {
    private final View mAnimationView;
    private int mOriginalLayerType;

    public HardwareAnimationListener(View view) {
        this.mAnimationView = view;
    }

    public boolean isValidOs() {
        return true;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.mAnimationView != null && isValidOs()) {
            this.mAnimationView.setLayerType(this.mOriginalLayerType, (Paint) null);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        if (this.mAnimationView != null && isValidOs()) {
            this.mOriginalLayerType = this.mAnimationView.getLayerType();
            this.mAnimationView.setLayerType(2, (Paint) null);
        }
    }
}
