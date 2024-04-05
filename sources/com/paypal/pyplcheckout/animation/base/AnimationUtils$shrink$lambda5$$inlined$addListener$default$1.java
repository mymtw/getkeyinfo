package com.paypal.pyplcheckout.animation.base;

import android.animation.Animator;
import android.view.View;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.animation.base.AnimationUtils$shrink$lambda-5$$inlined$addListener$default$1  reason: invalid class name */
public final class AnimationUtils$shrink$lambda5$$inlined$addListener$default$1 implements Animator.AnimatorListener {
    public final /* synthetic */ C19846a $onComplete$inlined;
    public final /* synthetic */ View $view$inlined;

    public AnimationUtils$shrink$lambda5$$inlined$addListener$default$1(C19846a aVar, View view) {
        this.$onComplete$inlined = aVar;
        this.$view$inlined = view;
    }

    public void onAnimationCancel(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }

    public void onAnimationEnd(Animator animator) {
        C19383o.m32797g(animator, "animator");
        C19846a aVar = this.$onComplete$inlined;
        if (aVar != null) {
            aVar.invoke();
        }
        this.$view$inlined.setVisibility(8);
        this.$view$inlined.setAlpha(1.0f);
    }

    public void onAnimationRepeat(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }

    public void onAnimationStart(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }
}
