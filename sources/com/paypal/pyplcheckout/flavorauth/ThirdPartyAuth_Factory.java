package com.paypal.pyplcheckout.flavorauth;

import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.userprofile.usecase.GetCachedClientIdUseCase;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ThirdPartyAuth_Factory implements C17555d<ThirdPartyAuth> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<FoundationRiskConfig> foundationRiskConfigProvider;
    private final C19011a<GetCachedClientIdUseCase> getCachedClientIdUseCaseProvider;
    private final C19011a<LogoutUseCase> logoutUseCaseProvider;
    private final C19011a<MerchantConfigRepository> merchantConfigRepositoryProvider;
    private final C19011a<NativeAuthAccessTokenUseCase> nativeAuthAccessTokenUseCaseProvider;
    private final C19011a<UpgradeAuthAccessTokenUseCase> upgradeAuthAccessTokenUseCaseProvider;
    private final C19011a<WebBasedAuthAccessTokenUseCase> webBasedAuthAccessTokenUseCaseProvider;

    public ThirdPartyAuth_Factory(C19011a<DebugConfigManager> aVar, C19011a<FoundationRiskConfig> aVar2, C19011a<AbManager> aVar3, C19011a<MerchantConfigRepository> aVar4, C19011a<NativeAuthAccessTokenUseCase> aVar5, C19011a<UpgradeAuthAccessTokenUseCase> aVar6, C19011a<WebBasedAuthAccessTokenUseCase> aVar7, C19011a<LogoutUseCase> aVar8, C19011a<GetCachedClientIdUseCase> aVar9) {
        this.debugConfigManagerProvider = aVar;
        this.foundationRiskConfigProvider = aVar2;
        this.abManagerProvider = aVar3;
        this.merchantConfigRepositoryProvider = aVar4;
        this.nativeAuthAccessTokenUseCaseProvider = aVar5;
        this.upgradeAuthAccessTokenUseCaseProvider = aVar6;
        this.webBasedAuthAccessTokenUseCaseProvider = aVar7;
        this.logoutUseCaseProvider = aVar8;
        this.getCachedClientIdUseCaseProvider = aVar9;
    }

    public static ThirdPartyAuth_Factory create(C19011a<DebugConfigManager> aVar, C19011a<FoundationRiskConfig> aVar2, C19011a<AbManager> aVar3, C19011a<MerchantConfigRepository> aVar4, C19011a<NativeAuthAccessTokenUseCase> aVar5, C19011a<UpgradeAuthAccessTokenUseCase> aVar6, C19011a<WebBasedAuthAccessTokenUseCase> aVar7, C19011a<LogoutUseCase> aVar8, C19011a<GetCachedClientIdUseCase> aVar9) {
        return new ThirdPartyAuth_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static ThirdPartyAuth newInstance(DebugConfigManager debugConfigManager, FoundationRiskConfig foundationRiskConfig, AbManager abManager, MerchantConfigRepository merchantConfigRepository, NativeAuthAccessTokenUseCase nativeAuthAccessTokenUseCase, UpgradeAuthAccessTokenUseCase upgradeAuthAccessTokenUseCase, WebBasedAuthAccessTokenUseCase webBasedAuthAccessTokenUseCase, LogoutUseCase logoutUseCase, GetCachedClientIdUseCase getCachedClientIdUseCase) {
        return new ThirdPartyAuth(debugConfigManager, foundationRiskConfig, abManager, merchantConfigRepository, nativeAuthAccessTokenUseCase, upgradeAuthAccessTokenUseCase, webBasedAuthAccessTokenUseCase, logoutUseCase, getCachedClientIdUseCase);
    }

    public ThirdPartyAuth get() {
        return newInstance(this.debugConfigManagerProvider.get(), this.foundationRiskConfigProvider.get(), this.abManagerProvider.get(), this.merchantConfigRepositoryProvider.get(), this.nativeAuthAccessTokenUseCaseProvider.get(), this.upgradeAuthAccessTokenUseCaseProvider.get(), this.webBasedAuthAccessTokenUseCaseProvider.get(), this.logoutUseCaseProvider.get(), this.getCachedClientIdUseCaseProvider.get());
    }
}
