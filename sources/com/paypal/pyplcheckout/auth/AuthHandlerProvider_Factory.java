package com.paypal.pyplcheckout.auth;

import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AuthHandlerProvider_Factory implements C17555d<AuthHandlerProvider> {
    private final C19011a<AuthRepository> authRepositoryProvider;
    private final C19011a<PYPLCheckoutUtils> pyplCheckoutUtilsProvider;
    private final C19011a<Repository> repositoryProvider;

    public AuthHandlerProvider_Factory(C19011a<Repository> aVar, C19011a<AuthRepository> aVar2, C19011a<PYPLCheckoutUtils> aVar3) {
        this.repositoryProvider = aVar;
        this.authRepositoryProvider = aVar2;
        this.pyplCheckoutUtilsProvider = aVar3;
    }

    public static AuthHandlerProvider_Factory create(C19011a<Repository> aVar, C19011a<AuthRepository> aVar2, C19011a<PYPLCheckoutUtils> aVar3) {
        return new AuthHandlerProvider_Factory(aVar, aVar2, aVar3);
    }

    public static AuthHandlerProvider newInstance(Repository repository, AuthRepository authRepository, PYPLCheckoutUtils pYPLCheckoutUtils) {
        return new AuthHandlerProvider(repository, authRepository, pYPLCheckoutUtils);
    }

    public AuthHandlerProvider get() {
        return newInstance(this.repositoryProvider.get(), this.authRepositoryProvider.get(), this.pyplCheckoutUtilsProvider.get());
    }
}
