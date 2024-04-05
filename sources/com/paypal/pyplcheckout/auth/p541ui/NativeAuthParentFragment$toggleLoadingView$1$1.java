package com.paypal.pyplcheckout.auth.p541ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment$toggleLoadingView$1$1 */
public final class NativeAuthParentFragment$toggleLoadingView$1$1 extends AnimatorListenerAdapter {
    public final /* synthetic */ View $this_apply;

    public NativeAuthParentFragment$toggleLoadingView$1$1(View view) {
        this.$this_apply = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.$this_apply.setVisibility(8);
        this.$this_apply.setClickable(false);
        this.$this_apply.setFocusable(false);
    }
}
