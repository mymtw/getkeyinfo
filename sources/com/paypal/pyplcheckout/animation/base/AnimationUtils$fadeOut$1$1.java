package com.paypal.pyplcheckout.animation.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.C19394m;
import p753kq.C19846a;

public final class AnimationUtils$fadeOut$1$1 extends AnimatorListenerAdapter {
    public final /* synthetic */ C19846a<C19394m> $onComplete;
    public final /* synthetic */ View $view;

    public AnimationUtils$fadeOut$1$1(View view, C19846a<C19394m> aVar) {
        this.$view = view;
        this.$onComplete = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        AnimationUtils.INSTANCE.setAsFading(this.$view, false);
        C19846a<C19394m> aVar = this.$onComplete;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onAnimationStart(Animator animator) {
        AnimationUtils.INSTANCE.setAsFading(this.$view, true);
    }
}
