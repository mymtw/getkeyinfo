package com.paypal.pyplcheckout.flavorauth;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class WebBasedAuthAccessTokenUseCase_Factory implements C17555d<WebBasedAuthAccessTokenUseCase> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<FoundationRiskConfig> foundationRiskConfigProvider;

    public WebBasedAuthAccessTokenUseCase_Factory(C19011a<DebugConfigManager> aVar, C19011a<FoundationRiskConfig> aVar2) {
        this.debugConfigManagerProvider = aVar;
        this.foundationRiskConfigProvider = aVar2;
    }

    public static WebBasedAuthAccessTokenUseCase_Factory create(C19011a<DebugConfigManager> aVar, C19011a<FoundationRiskConfig> aVar2) {
        return new WebBasedAuthAccessTokenUseCase_Factory(aVar, aVar2);
    }

    public static WebBasedAuthAccessTokenUseCase newInstance(DebugConfigManager debugConfigManager, FoundationRiskConfig foundationRiskConfig) {
        return new WebBasedAuthAccessTokenUseCase(debugConfigManager, foundationRiskConfig);
    }

    public WebBasedAuthAccessTokenUseCase get() {
        return newInstance(this.debugConfigManagerProvider.get(), this.foundationRiskConfigProvider.get());
    }
}
