package com.etsy.android.extensions;

import android.view.View;
import android.view.animation.Animation;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class ViewExtensions$fadeToGone$1$2 implements Animation.AnimationListener {
    public final /* synthetic */ View $this_apply;

    public ViewExtensions$fadeToGone$1$2(View view) {
        this.$this_apply = view;
    }

    public void onAnimationEnd(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
        this.$this_apply.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
    }

    public void onAnimationStart(Animation animation) {
        C19383o.m32797g(animation, ResponseConstants.ANIMATION);
    }
}
