package com.paypal.pyplcheckout.utils;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

public final class RunOnceDelegateKt$runOnce$2 extends Lambda implements C19846a<C19857l<? super T, ? extends C19394m>> {
    public final /* synthetic */ C19857l<T, C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunOnceDelegateKt$runOnce$2(C19857l<? super T, C19394m> lVar) {
        super(0);
        this.$block = lVar;
    }

    public final C19857l<T, C19394m> invoke() {
        return new RunOnceDelegateKt$runOnce$2$wrapper$1(new RunOnceDelegate(), this.$block);
    }
}
