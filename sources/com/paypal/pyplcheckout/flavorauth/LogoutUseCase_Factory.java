package com.paypal.pyplcheckout.flavorauth;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class LogoutUseCase_Factory implements C17555d<LogoutUseCase> {
    private final C19011a<PartnerAuthenticationProviderFactory> partnerAuthenticationProviderFactoryProvider;

    public LogoutUseCase_Factory(C19011a<PartnerAuthenticationProviderFactory> aVar) {
        this.partnerAuthenticationProviderFactoryProvider = aVar;
    }

    public static LogoutUseCase_Factory create(C19011a<PartnerAuthenticationProviderFactory> aVar) {
        return new LogoutUseCase_Factory(aVar);
    }

    public static LogoutUseCase newInstance(PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory) {
        return new LogoutUseCase(partnerAuthenticationProviderFactory);
    }

    public LogoutUseCase get() {
        return newInstance(this.partnerAuthenticationProviderFactoryProvider.get());
    }
}
