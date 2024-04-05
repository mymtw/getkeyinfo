package com.paypal.checkout.fundingeligibility;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class FundingEligibilityRequestFactory_Factory implements C17555d<FundingEligibilityRequestFactory> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;

    public FundingEligibilityRequestFactory_Factory(C19011a<DebugConfigManager> aVar) {
        this.debugConfigManagerProvider = aVar;
    }

    public static FundingEligibilityRequestFactory_Factory create(C19011a<DebugConfigManager> aVar) {
        return new FundingEligibilityRequestFactory_Factory(aVar);
    }

    public static FundingEligibilityRequestFactory newInstance(DebugConfigManager debugConfigManager) {
        return new FundingEligibilityRequestFactory(debugConfigManager);
    }

    public FundingEligibilityRequestFactory get() {
        return newInstance(this.debugConfigManagerProvider.get());
    }
}
