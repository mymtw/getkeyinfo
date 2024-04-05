package com.paypal.android.platform.authsdk.authcommon.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class ProgressSpinnerView$hideProgressSpinner$1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProgressSpinnerView this$0;

    public ProgressSpinnerView$hideProgressSpinner$1(ProgressSpinnerView progressSpinnerView) {
        this.this$0 = progressSpinnerView;
    }

    public void onAnimationEnd(Animator animator) {
        this.this$0.setVisibility(8);
        this.this$0.setClickable(false);
        this.this$0.setFocusable(false);
    }
}
