package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class RunOnceDelegateKt$runOnce$1$wrapper$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19846a<C19394m> $block;
    public final /* synthetic */ RunOnceDelegate $delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$1$wrapper$1(RunOnceDelegate runOnceDelegate, C19846a<C19394m> aVar) {
        super(0);
        this.$delegate = runOnceDelegate;
        this.$block = aVar;
    }

    public final void invoke() {
        this.$delegate.run(this.$block);
    }
}
