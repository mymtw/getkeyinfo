package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class OnGetOrderDetailsComplete$Companion$invoke$1 implements OnGetOrderDetailsComplete {
    public final /* synthetic */ C19857l<GetOrderResult, C19394m> $getOrderComplete;

    public OnGetOrderDetailsComplete$Companion$invoke$1(C19857l<? super GetOrderResult, C19394m> lVar) {
        this.$getOrderComplete = lVar;
    }

    public void onGetOrderDetailsComplete(GetOrderResult getOrderResult) {
        C19383o.m32797g(getOrderResult, "result");
        this.$getOrderComplete.invoke(getOrderResult);
    }
}
