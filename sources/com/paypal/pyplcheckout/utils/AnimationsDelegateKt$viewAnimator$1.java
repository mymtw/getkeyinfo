package com.paypal.pyplcheckout.utils;

import android.view.View;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class AnimationsDelegateKt$viewAnimator$1 extends Lambda implements C19846a<AnimationsDelegate> {
    public final /* synthetic */ C19846a<View> $viewProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimationsDelegateKt$viewAnimator$1(C19846a<? extends View> aVar) {
        super(0);
        this.$viewProducer = aVar;
    }

    public final AnimationsDelegate invoke() {
        return new AnimationsDelegate(this.$viewProducer.invoke());
    }
}
