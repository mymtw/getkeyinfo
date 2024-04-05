package com.paypal.pyplcheckout.extensions;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import kotlin.C19394m;
import p753kq.C19846a;

public final class ViewExtensionsKt$runOnFinish$1 implements Animator.AnimatorListener {
    public final /* synthetic */ C19846a<C19394m> $onFinish;
    public final /* synthetic */ ViewPropertyAnimator $this_runOnFinish;

    public ViewExtensionsKt$runOnFinish$1(ViewPropertyAnimator viewPropertyAnimator, C19846a<C19394m> aVar) {
        this.$this_runOnFinish = viewPropertyAnimator;
        this.$onFinish = aVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.$this_runOnFinish.setListener((Animator.AnimatorListener) null);
        this.$onFinish.invoke();
    }

    public void onAnimationEnd(Animator animator) {
        this.$this_runOnFinish.setListener((Animator.AnimatorListener) null);
        this.$onFinish.invoke();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
