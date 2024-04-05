package com.paypal.checkout.order;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.checkout.order.GetOrderAction", mo70541f = "GetOrderAction.kt", mo70542l = {62, 63}, mo70543m = "getUpgradedAccessToken")
public final class GetOrderAction$getUpgradedAccessToken$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetOrderAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetOrderAction$getUpgradedAccessToken$1(GetOrderAction getOrderAction, C19340c<? super GetOrderAction$getUpgradedAccessToken$1> cVar) {
        super(cVar);
        this.this$0 = getOrderAction;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getUpgradedAccessToken(this);
    }
}
