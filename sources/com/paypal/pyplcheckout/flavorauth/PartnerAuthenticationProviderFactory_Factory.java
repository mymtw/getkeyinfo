package com.paypal.pyplcheckout.flavorauth;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class PartnerAuthenticationProviderFactory_Factory implements C17555d<PartnerAuthenticationProviderFactory> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<FoundationRiskConfig> foundationRiskConfigProvider;
    private final C19011a<ThirdPartyAuthPresenter> thirdPartyAuthPresenterProvider;
    private final C19011a<ThirdPartyTrackingDelegate> thirdPartyTrackingDelegateProvider;

    public PartnerAuthenticationProviderFactory_Factory(C19011a<DebugConfigManager> aVar, C19011a<FoundationRiskConfig> aVar2, C19011a<ThirdPartyAuthPresenter> aVar3, C19011a<ThirdPartyTrackingDelegate> aVar4) {
        this.debugConfigManagerProvider = aVar;
        this.foundationRiskConfigProvider = aVar2;
        this.thirdPartyAuthPresenterProvider = aVar3;
        this.thirdPartyTrackingDelegateProvider = aVar4;
    }

    public static PartnerAuthenticationProviderFactory_Factory create(C19011a<DebugConfigManager> aVar, C19011a<FoundationRiskConfig> aVar2, C19011a<ThirdPartyAuthPresenter> aVar3, C19011a<ThirdPartyTrackingDelegate> aVar4) {
        return new PartnerAuthenticationProviderFactory_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static PartnerAuthenticationProviderFactory newInstance(DebugConfigManager debugConfigManager, FoundationRiskConfig foundationRiskConfig, ThirdPartyAuthPresenter thirdPartyAuthPresenter, ThirdPartyTrackingDelegate thirdPartyTrackingDelegate) {
        return new PartnerAuthenticationProviderFactory(debugConfigManager, foundationRiskConfig, thirdPartyAuthPresenter, thirdPartyTrackingDelegate);
    }

    public PartnerAuthenticationProviderFactory get() {
        return newInstance(this.debugConfigManagerProvider.get(), this.foundationRiskConfigProvider.get(), this.thirdPartyAuthPresenterProvider.get(), this.thirdPartyTrackingDelegateProvider.get());
    }
}
