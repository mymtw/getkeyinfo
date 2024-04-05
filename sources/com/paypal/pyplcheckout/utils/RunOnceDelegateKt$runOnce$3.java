package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class RunOnceDelegateKt$runOnce$3 extends Lambda implements C19846a<C19861p<? super T1, ? super T2, ? extends C19394m>> {
    public final /* synthetic */ C19861p<T1, T2, C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$3(C19861p<? super T1, ? super T2, C19394m> pVar) {
        super(0);
        this.$block = pVar;
    }

    public final C19861p<T1, T2, C19394m> invoke() {
        return new RunOnceDelegateKt$runOnce$3$wrapper$1(new RunOnceDelegate(), this.$block);
    }
}
