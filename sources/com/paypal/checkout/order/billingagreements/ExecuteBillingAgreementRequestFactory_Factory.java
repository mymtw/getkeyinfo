package com.paypal.checkout.order.billingagreements;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import okhttp3.C20011u;
import p740eq.C19011a;

public final class ExecuteBillingAgreementRequestFactory_Factory implements C17555d<ExecuteBillingAgreementRequestFactory> {
    private final C19011a<DebugConfigManager> configManagerProvider;
    private final C19011a<C20011u.C20012a> requestBuilderProvider;

    public ExecuteBillingAgreementRequestFactory_Factory(C19011a<DebugConfigManager> aVar, C19011a<C20011u.C20012a> aVar2) {
        this.configManagerProvider = aVar;
        this.requestBuilderProvider = aVar2;
    }

    public static ExecuteBillingAgreementRequestFactory_Factory create(C19011a<DebugConfigManager> aVar, C19011a<C20011u.C20012a> aVar2) {
        return new ExecuteBillingAgreementRequestFactory_Factory(aVar, aVar2);
    }

    public static ExecuteBillingAgreementRequestFactory newInstance(DebugConfigManager debugConfigManager, C20011u.C20012a aVar) {
        return new ExecuteBillingAgreementRequestFactory(debugConfigManager, aVar);
    }

    public ExecuteBillingAgreementRequestFactory get() {
        return newInstance(this.configManagerProvider.get(), this.requestBuilderProvider.get());
    }
}
