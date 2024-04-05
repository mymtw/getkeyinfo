package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class OrderActions$getOrderDetails$2 extends Lambda implements C19857l<GetOrderResult, C19394m> {
    public final /* synthetic */ C19857l<GetOrderResult, C19394m> $onComplete;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderActions$getOrderDetails$2(C19857l<? super GetOrderResult, C19394m> lVar) {
        super(1);
        this.$onComplete = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GetOrderResult) obj);
        return C19394m.f43287a;
    }

    public final void invoke(GetOrderResult getOrderResult) {
        C19383o.m32797g(getOrderResult, "it");
        this.$onComplete.invoke(getOrderResult);
    }
}
