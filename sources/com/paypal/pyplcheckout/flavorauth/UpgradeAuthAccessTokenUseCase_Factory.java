package com.paypal.pyplcheckout.flavorauth;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class UpgradeAuthAccessTokenUseCase_Factory implements C17555d<UpgradeAuthAccessTokenUseCase> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<PartnerAuthenticationProviderFactory> partnerAuthenticationProviderUseCaseProvider;

    public UpgradeAuthAccessTokenUseCase_Factory(C19011a<DebugConfigManager> aVar, C19011a<PartnerAuthenticationProviderFactory> aVar2) {
        this.debugConfigManagerProvider = aVar;
        this.partnerAuthenticationProviderUseCaseProvider = aVar2;
    }

    public static UpgradeAuthAccessTokenUseCase_Factory create(C19011a<DebugConfigManager> aVar, C19011a<PartnerAuthenticationProviderFactory> aVar2) {
        return new UpgradeAuthAccessTokenUseCase_Factory(aVar, aVar2);
    }

    public static UpgradeAuthAccessTokenUseCase newInstance(DebugConfigManager debugConfigManager, PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory) {
        return new UpgradeAuthAccessTokenUseCase(debugConfigManager, partnerAuthenticationProviderFactory);
    }

    public UpgradeAuthAccessTokenUseCase get() {
        return newInstance(this.debugConfigManagerProvider.get(), this.partnerAuthenticationProviderUseCaseProvider.get());
    }
}
