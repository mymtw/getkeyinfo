package com.paypal.checkout.paymentbutton;

import kotlin.C19394m;
import p753kq.C19846a;
import p753kq.C19861p;

public final class PaymentButtonContainerViewState$Companion$invoke$1 implements PaymentButtonContainerViewState {
    public final /* synthetic */ C19861p<FundingEligibilityState, Exception, C19394m> $onFinish;
    public final /* synthetic */ C19846a<C19394m> $onLoading;

    public PaymentButtonContainerViewState$Companion$invoke$1(C19846a<C19394m> aVar, C19861p<? super FundingEligibilityState, ? super Exception, C19394m> pVar) {
        this.$onLoading = aVar;
        this.$onFinish = pVar;
    }

    public void onFinish(FundingEligibilityState fundingEligibilityState, Exception exc) {
        this.$onFinish.invoke(fundingEligibilityState, exc);
    }

    public void onLoading() {
        this.$onLoading.invoke();
    }
}
