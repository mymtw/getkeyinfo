package com.paypal.checkout.fundingeligibility;

import com.paypal.checkout.config.PaymentButtonIntent;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;

public final class RetrieveFundingEligibilityAction {
    private final FundingEligibilityRequestFactory fundingEligibilityRequestFactory;
    private final CoroutineDispatcher ioDispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    private final String tag = "RetrieveFundingEligibilityAction";

    public RetrieveFundingEligibilityAction(FundingEligibilityRequestFactory fundingEligibilityRequestFactory2, C20009t tVar, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(fundingEligibilityRequestFactory2, "fundingEligibilityRequestFactory");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(coroutineDispatcher, "ioDispatcher");
        this.fundingEligibilityRequestFactory = fundingEligibilityRequestFactory2;
        this.okHttpClient = tVar;
        this.ioDispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final void logResult(FundingEligibilityResponse fundingEligibilityResponse) {
        PEnums.Outcome outcome = validate(fundingEligibilityResponse) ? PEnums.Outcome.SUCCESS : PEnums.Outcome.FAILED;
        String str = this.tag;
        C19383o.m32796f(str, "tag");
        PLog.m28728dR(str, "response: " + fundingEligibilityResponse);
        PLog.transition$default(PEnums.TransitionName.FUNDING_ELIGIBILITY_EXECUTED, outcome, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
    }

    /* access modifiers changed from: private */
    public final boolean validate(FundingEligibilityResponse fundingEligibilityResponse) {
        return (fundingEligibilityResponse == null ? null : fundingEligibilityResponse.getData()) != null && fundingEligibilityResponse.getError() == null;
    }

    public final Object retrieve(PaymentButtonIntent paymentButtonIntent, C19340c<? super FundingEligibilityResponse> cVar) {
        return retrieve(1, paymentButtonIntent, cVar);
    }

    /* access modifiers changed from: private */
    public final Object retrieve(int i, PaymentButtonIntent paymentButtonIntent, C19340c<? super FundingEligibilityResponse> cVar) {
        return C19697g.m33471i(cVar, this.ioDispatcher, new RetrieveFundingEligibilityAction$retrieve$3(this, this.fundingEligibilityRequestFactory.create(paymentButtonIntent), i, paymentButtonIntent, (C19340c<? super RetrieveFundingEligibilityAction$retrieve$3>) null));
    }
}
