package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19863r;

public final class RunOnceDelegateKt$runOnce$5 extends Lambda implements C19846a<C19863r<? super T1, ? super T2, ? super T3, ? super T4, ? extends C19394m>> {
    public final /* synthetic */ C19863r<T1, T2, T3, T4, C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$5(C19863r<? super T1, ? super T2, ? super T3, ? super T4, C19394m> rVar) {
        super(0);
        this.$block = rVar;
    }

    public final C19863r<T1, T2, T3, T4, C19394m> invoke() {
        return new RunOnceDelegateKt$runOnce$5$wrapper$1(new RunOnceDelegate(), this.$block);
    }
}
