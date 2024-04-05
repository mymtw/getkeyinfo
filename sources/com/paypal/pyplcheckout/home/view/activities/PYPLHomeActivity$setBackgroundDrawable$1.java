package com.paypal.pyplcheckout.home.view.activities;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class PYPLHomeActivity$setBackgroundDrawable$1 implements Animation.AnimationListener {
    public final /* synthetic */ Drawable $swirl;
    public final /* synthetic */ PYPLHomeActivity this$0;

    public PYPLHomeActivity$setBackgroundDrawable$1(PYPLHomeActivity pYPLHomeActivity, Drawable drawable) {
        this.this$0 = pYPLHomeActivity;
        this.$swirl = drawable;
    }

    public void onAnimationEnd(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
    }

    public void onAnimationRepeat(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
    }

    public void onAnimationStart(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
        LinearLayout access$getHomeBgdMaskLayout$p = this.this$0.homeBgdMaskLayout;
        if (access$getHomeBgdMaskLayout$p != null) {
            access$getHomeBgdMaskLayout$p.setBackground(this.$swirl);
        } else {
            C19383o.m32805o("homeBgdMaskLayout");
            throw null;
        }
    }
}
