package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class RunOnceDelegateKt$runOnce$1 extends Lambda implements C19846a<C19846a<? extends C19394m>> {
    public final /* synthetic */ C19846a<C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$1(C19846a<C19394m> aVar) {
        super(0);
        this.$block = aVar;
    }

    public final C19846a<C19394m> invoke() {
        return new RunOnceDelegateKt$runOnce$1$wrapper$1(new RunOnceDelegate(), this.$block);
    }
}
