package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class RunOnceDelegateKt$runOnce$3$wrapper$1 extends Lambda implements C19861p<T1, T2, C19394m> {
    public final /* synthetic */ C19861p<T1, T2, C19394m> $block;
    public final /* synthetic */ RunOnceDelegate $delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$3$wrapper$1(RunOnceDelegate runOnceDelegate, C19861p<? super T1, ? super T2, C19394m> pVar) {
        super(2);
        this.$delegate = runOnceDelegate;
        this.$block = pVar;
    }

    public final void invoke(final T1 t1, final T2 t2) {
        RunOnceDelegate runOnceDelegate = this.$delegate;
        final C19861p<T1, T2, C19394m> pVar = this.$block;
        runOnceDelegate.run(new C19846a<C19394m>() {
            public final void invoke() {
                pVar.invoke(t1, t2);
            }
        });
    }
}
