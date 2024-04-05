package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19863r;

public final class RunOnceDelegateKt$runOnce$5$wrapper$1 extends Lambda implements C19863r<T1, T2, T3, T4, C19394m> {
    public final /* synthetic */ C19863r<T1, T2, T3, T4, C19394m> $block;
    public final /* synthetic */ RunOnceDelegate $delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$5$wrapper$1(RunOnceDelegate runOnceDelegate, C19863r<? super T1, ? super T2, ? super T3, ? super T4, C19394m> rVar) {
        super(4);
        this.$delegate = runOnceDelegate;
        this.$block = rVar;
    }

    public final void invoke(T1 t1, T2 t2, T3 t3, T4 t4) {
        RunOnceDelegate runOnceDelegate = this.$delegate;
        final C19863r<T1, T2, T3, T4, C19394m> rVar = this.$block;
        final T1 t12 = t1;
        final T2 t22 = t2;
        final T3 t32 = t3;
        final T4 t42 = t4;
        runOnceDelegate.run(new C19846a<C19394m>() {
            public final void invoke() {
                rVar.invoke(t12, t22, t32, t42);
            }
        });
    }
}
