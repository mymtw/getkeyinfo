package com.reddit.indicatorfastscroll;

import android.animation.StateListAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C19383o;

public final class FastScrollerThumbView$$special$$inlined$doOnPreDraw$1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ StateListAnimator $animator$inlined;
    public final /* synthetic */ ViewTreeObserver $vto;
    public final /* synthetic */ View receiver$0;

    public FastScrollerThumbView$$special$$inlined$doOnPreDraw$1(View view, ViewTreeObserver viewTreeObserver, StateListAnimator stateListAnimator) {
        this.receiver$0 = view;
        this.$vto = viewTreeObserver;
        this.$animator$inlined = stateListAnimator;
    }

    public boolean onPreDraw() {
        this.$animator$inlined.jumpToCurrentState();
        ViewTreeObserver viewTreeObserver = this.$vto;
        C19383o.m32793c(viewTreeObserver, "vto");
        if (viewTreeObserver.isAlive()) {
            this.$vto.removeOnPreDrawListener(this);
            return true;
        }
        this.receiver$0.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
