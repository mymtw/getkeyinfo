package com.paypal.checkout.order;

import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class OrderActions$executeBillingAgreement$2 extends Lambda implements C19857l<ExecuteBillingAgreementResult, C19394m> {
    public final /* synthetic */ C19857l<ExecuteBillingAgreementResult, C19394m> $onComplete;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderActions$executeBillingAgreement$2(C19857l<? super ExecuteBillingAgreementResult, C19394m> lVar) {
        super(1);
        this.$onComplete = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ExecuteBillingAgreementResult) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ExecuteBillingAgreementResult executeBillingAgreementResult) {
        C19383o.m32797g(executeBillingAgreementResult, "it");
        this.$onComplete.invoke(executeBillingAgreementResult);
    }
}
