package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.services.api.interceptor.AccessTokenInterceptor;
import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvideAccessTokenInterceptorFactory */
public final class NetworkModule_ProvideAccessTokenInterceptorFactory implements C17555d<AccessTokenInterceptor> {
    private final C19011a<AuthRepository> authRepositoryProvider;
    private final NetworkModule module;

    public NetworkModule_ProvideAccessTokenInterceptorFactory(NetworkModule networkModule, C19011a<AuthRepository> aVar) {
        this.module = networkModule;
        this.authRepositoryProvider = aVar;
    }

    public static NetworkModule_ProvideAccessTokenInterceptorFactory create(NetworkModule networkModule, C19011a<AuthRepository> aVar) {
        return new NetworkModule_ProvideAccessTokenInterceptorFactory(networkModule, aVar);
    }

    public static AccessTokenInterceptor provideAccessTokenInterceptor(NetworkModule networkModule, AuthRepository authRepository) {
        AccessTokenInterceptor provideAccessTokenInterceptor = networkModule.provideAccessTokenInterceptor(authRepository);
        C17782b.m29841G(provideAccessTokenInterceptor);
        return provideAccessTokenInterceptor;
    }

    public AccessTokenInterceptor get() {
        return provideAccessTokenInterceptor(this.module, this.authRepositoryProvider.get());
    }
}
