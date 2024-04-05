package com.paypal.pyplcheckout.animation.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import kotlin.jvm.internal.C19383o;

public final class AnimationUtils$shrinkFavorite$1$1 extends AnimatorListenerAdapter {
    public final /* synthetic */ View $parent;
    public final /* synthetic */ float $prevTranslationX;

    /* renamed from: $v */
    public final /* synthetic */ View f37704$v;

    public AnimationUtils$shrinkFavorite$1$1(View view, View view2, float f) {
        this.f37704$v = view;
        this.$parent = view2;
        this.$prevTranslationX = f;
    }

    public void onAnimationEnd(Animator animator) {
        C19383o.m32797g(animator, ResponseConstants.ANIMATION);
        super.onAnimationEnd(animator);
        this.f37704$v.setVisibility(8);
        AnimationUtils.INSTANCE.fixPaddingChangeBackground(C17165R.C17166drawable.ic_preferred_bg_white, this.$parent);
        this.f37704$v.setTranslationX(this.$prevTranslationX);
    }
}
