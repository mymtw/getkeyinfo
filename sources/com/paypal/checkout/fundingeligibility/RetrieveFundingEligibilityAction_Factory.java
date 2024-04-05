package com.paypal.checkout.fundingeligibility;

import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class RetrieveFundingEligibilityAction_Factory implements C17555d<RetrieveFundingEligibilityAction> {
    private final C19011a<FundingEligibilityRequestFactory> fundingEligibilityRequestFactoryProvider;
    private final C19011a<CoroutineDispatcher> ioDispatcherProvider;
    private final C19011a<C20009t> okHttpClientProvider;

    public RetrieveFundingEligibilityAction_Factory(C19011a<FundingEligibilityRequestFactory> aVar, C19011a<C20009t> aVar2, C19011a<CoroutineDispatcher> aVar3) {
        this.fundingEligibilityRequestFactoryProvider = aVar;
        this.okHttpClientProvider = aVar2;
        this.ioDispatcherProvider = aVar3;
    }

    public static RetrieveFundingEligibilityAction_Factory create(C19011a<FundingEligibilityRequestFactory> aVar, C19011a<C20009t> aVar2, C19011a<CoroutineDispatcher> aVar3) {
        return new RetrieveFundingEligibilityAction_Factory(aVar, aVar2, aVar3);
    }

    public static RetrieveFundingEligibilityAction newInstance(FundingEligibilityRequestFactory fundingEligibilityRequestFactory, C20009t tVar, CoroutineDispatcher coroutineDispatcher) {
        return new RetrieveFundingEligibilityAction(fundingEligibilityRequestFactory, tVar, coroutineDispatcher);
    }

    public RetrieveFundingEligibilityAction get() {
        return newInstance(this.fundingEligibilityRequestFactoryProvider.get(), this.okHttpClientProvider.get(), this.ioDispatcherProvider.get());
    }
}
