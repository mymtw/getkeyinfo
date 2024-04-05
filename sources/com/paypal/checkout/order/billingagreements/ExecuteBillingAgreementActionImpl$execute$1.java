package com.paypal.checkout.order.billingagreements;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl", mo70541f = "ExecuteBillingAgreementActionImpl.kt", mo70542l = {38, 43}, mo70543m = "execute")
public final class ExecuteBillingAgreementActionImpl$execute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ExecuteBillingAgreementActionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExecuteBillingAgreementActionImpl$execute$1(ExecuteBillingAgreementActionImpl executeBillingAgreementActionImpl, C19340c<? super ExecuteBillingAgreementActionImpl$execute$1> cVar) {
        super(cVar);
        this.this$0 = executeBillingAgreementActionImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(this);
    }
}
