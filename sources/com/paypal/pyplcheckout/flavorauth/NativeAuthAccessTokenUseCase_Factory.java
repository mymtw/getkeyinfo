package com.paypal.pyplcheckout.flavorauth;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class NativeAuthAccessTokenUseCase_Factory implements C17555d<NativeAuthAccessTokenUseCase> {
    private final C19011a<PartnerAuthenticationProviderFactory> providePartnerAuthenticationProvider;
    private final C19011a<ThirdPartyAuthPresenter> thirdPartyAuthPresenterProvider;

    public NativeAuthAccessTokenUseCase_Factory(C19011a<PartnerAuthenticationProviderFactory> aVar, C19011a<ThirdPartyAuthPresenter> aVar2) {
        this.providePartnerAuthenticationProvider = aVar;
        this.thirdPartyAuthPresenterProvider = aVar2;
    }

    public static NativeAuthAccessTokenUseCase_Factory create(C19011a<PartnerAuthenticationProviderFactory> aVar, C19011a<ThirdPartyAuthPresenter> aVar2) {
        return new NativeAuthAccessTokenUseCase_Factory(aVar, aVar2);
    }

    public static NativeAuthAccessTokenUseCase newInstance(PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory, ThirdPartyAuthPresenter thirdPartyAuthPresenter) {
        return new NativeAuthAccessTokenUseCase(partnerAuthenticationProviderFactory, thirdPartyAuthPresenter);
    }

    public NativeAuthAccessTokenUseCase get() {
        return newInstance(this.providePartnerAuthenticationProvider.get(), this.thirdPartyAuthPresenterProvider.get());
    }
}
