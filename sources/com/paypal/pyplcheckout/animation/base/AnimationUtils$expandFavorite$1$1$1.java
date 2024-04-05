package com.paypal.pyplcheckout.animation.base;

import android.view.View;
import com.paypal.pyplcheckout.C17165R;
import kotlin.jvm.internal.C19383o;
import p186n2.C7418m;

public final class AnimationUtils$expandFavorite$1$1$1 implements C7418m.C7422d {
    public final /* synthetic */ View $parent;

    /* renamed from: $v */
    public final /* synthetic */ View f37703$v;

    public AnimationUtils$expandFavorite$1$1$1(View view, View view2) {
        this.$parent = view;
        this.f37703$v = view2;
    }

    public void onTransitionCancel(C7418m mVar) {
        C19383o.m32797g(mVar, "transition");
    }

    public void onTransitionEnd(C7418m mVar) {
        C19383o.m32797g(mVar, "transition");
        AnimationUtils.INSTANCE.shrinkFavorite(this.f37703$v, this.$parent);
    }

    public void onTransitionPause(C7418m mVar) {
        C19383o.m32797g(mVar, "transition");
    }

    public void onTransitionResume(C7418m mVar) {
        C19383o.m32797g(mVar, "transition");
    }

    public void onTransitionStart(C7418m mVar) {
        C19383o.m32797g(mVar, "transition");
        AnimationUtils.INSTANCE.fixPaddingChangeBackground(C17165R.C17166drawable.ic_preferred_bg_orange_border, this.$parent);
    }
}
