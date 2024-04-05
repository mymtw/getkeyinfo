package com.paypal.checkout.order;

import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class OnExecuteBillingAgreementComplete$Companion$invoke$1 implements OnExecuteBillingAgreementComplete {
    public final /* synthetic */ C19857l<ExecuteBillingAgreementResult, C19394m> $executeBillingAgreementComplete;

    public OnExecuteBillingAgreementComplete$Companion$invoke$1(C19857l<? super ExecuteBillingAgreementResult, C19394m> lVar) {
        this.$executeBillingAgreementComplete = lVar;
    }

    public void onExecuteBillingAgreementComplete(ExecuteBillingAgreementResult executeBillingAgreementResult) {
        C19383o.m32797g(executeBillingAgreementResult, "result");
        this.$executeBillingAgreementComplete.invoke(executeBillingAgreementResult);
    }
}
