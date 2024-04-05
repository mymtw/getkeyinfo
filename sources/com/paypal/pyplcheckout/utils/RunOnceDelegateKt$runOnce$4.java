package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

public final class RunOnceDelegateKt$runOnce$4 extends Lambda implements C19846a<C19862q<? super T1, ? super T2, ? super T3, ? extends C19394m>> {
    public final /* synthetic */ C19862q<T1, T2, T3, C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$4(C19862q<? super T1, ? super T2, ? super T3, C19394m> qVar) {
        super(0);
        this.$block = qVar;
    }

    public final C19862q<T1, T2, T3, C19394m> invoke() {
        return new RunOnceDelegateKt$runOnce$4$wrapper$1(new RunOnceDelegate(), this.$block);
    }
}
