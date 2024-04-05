package com.paypal.pyplcheckout.flavorauth;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ClearAccessTokenUseCase_Factory implements C17555d<ClearAccessTokenUseCase> {
    private final C19011a<PartnerAuthenticationProviderFactory> getPartnerAuthenticationProvider;

    public ClearAccessTokenUseCase_Factory(C19011a<PartnerAuthenticationProviderFactory> aVar) {
        this.getPartnerAuthenticationProvider = aVar;
    }

    public static ClearAccessTokenUseCase_Factory create(C19011a<PartnerAuthenticationProviderFactory> aVar) {
        return new ClearAccessTokenUseCase_Factory(aVar);
    }

    public static ClearAccessTokenUseCase newInstance(PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory) {
        return new ClearAccessTokenUseCase(partnerAuthenticationProviderFactory);
    }

    public ClearAccessTokenUseCase get() {
        return newInstance(this.getPartnerAuthenticationProvider.get());
    }
}
