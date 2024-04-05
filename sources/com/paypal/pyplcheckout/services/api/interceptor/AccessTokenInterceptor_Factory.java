package com.paypal.pyplcheckout.services.api.interceptor;

import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AccessTokenInterceptor_Factory implements C17555d<AccessTokenInterceptor> {
    private final C19011a<AuthRepository> authRepositoryProvider;

    public AccessTokenInterceptor_Factory(C19011a<AuthRepository> aVar) {
        this.authRepositoryProvider = aVar;
    }

    public static AccessTokenInterceptor_Factory create(C19011a<AuthRepository> aVar) {
        return new AccessTokenInterceptor_Factory(aVar);
    }

    public static AccessTokenInterceptor newInstance(AuthRepository authRepository) {
        return new AccessTokenInterceptor(authRepository);
    }

    public AccessTokenInterceptor get() {
        return newInstance(this.authRepositoryProvider.get());
    }
}
