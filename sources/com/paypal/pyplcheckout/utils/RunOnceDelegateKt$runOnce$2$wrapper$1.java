package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

public final class RunOnceDelegateKt$runOnce$2$wrapper$1 extends Lambda implements C19857l<T, C19394m> {
    public final /* synthetic */ C19857l<T, C19394m> $block;
    public final /* synthetic */ RunOnceDelegate $delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$2$wrapper$1(RunOnceDelegate runOnceDelegate, C19857l<? super T, C19394m> lVar) {
        super(1);
        this.$delegate = runOnceDelegate;
        this.$block = lVar;
    }

    public final void invoke(final T t) {
        RunOnceDelegate runOnceDelegate = this.$delegate;
        final C19857l<T, C19394m> lVar = this.$block;
        runOnceDelegate.run(new C19846a<C19394m>() {
            public final void invoke() {
                lVar.invoke(t);
            }
        });
    }
}
