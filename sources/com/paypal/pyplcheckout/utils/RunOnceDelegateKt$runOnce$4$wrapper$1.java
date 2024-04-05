package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

public final class RunOnceDelegateKt$runOnce$4$wrapper$1 extends Lambda implements C19862q<T1, T2, T3, C19394m> {
    public final /* synthetic */ C19862q<T1, T2, T3, C19394m> $block;
    public final /* synthetic */ RunOnceDelegate $delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$4$wrapper$1(RunOnceDelegate runOnceDelegate, C19862q<? super T1, ? super T2, ? super T3, C19394m> qVar) {
        super(3);
        this.$delegate = runOnceDelegate;
        this.$block = qVar;
    }

    public final void invoke(final T1 t1, final T2 t2, final T3 t3) {
        RunOnceDelegate runOnceDelegate = this.$delegate;
        final C19862q<T1, T2, T3, C19394m> qVar = this.$block;
        runOnceDelegate.run(new C19846a<C19394m>() {
            public final void invoke() {
                qVar.invoke(t1, t2, t3);
            }
        });
    }
}
