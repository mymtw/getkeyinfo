package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.data.api.OkHttpClientFactory;
import com.paypal.pyplcheckout.services.api.interceptor.AccessTokenInterceptor;
import dagger.internal.C17555d;
import okhttp3.C20009t;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvidesAuthenticatedOkHttpClientFactory */
public final class NetworkModule_ProvidesAuthenticatedOkHttpClientFactory implements C17555d<C20009t> {
    private final C19011a<AccessTokenInterceptor> accessTokenInterceptorProvider;
    private final NetworkModule module;
    private final C19011a<OkHttpClientFactory> okHttpClientFactoryProvider;

    public NetworkModule_ProvidesAuthenticatedOkHttpClientFactory(NetworkModule networkModule, C19011a<OkHttpClientFactory> aVar, C19011a<AccessTokenInterceptor> aVar2) {
        this.module = networkModule;
        this.okHttpClientFactoryProvider = aVar;
        this.accessTokenInterceptorProvider = aVar2;
    }

    public static NetworkModule_ProvidesAuthenticatedOkHttpClientFactory create(NetworkModule networkModule, C19011a<OkHttpClientFactory> aVar, C19011a<AccessTokenInterceptor> aVar2) {
        return new NetworkModule_ProvidesAuthenticatedOkHttpClientFactory(networkModule, aVar, aVar2);
    }

    public static C20009t providesAuthenticatedOkHttpClient(NetworkModule networkModule, OkHttpClientFactory okHttpClientFactory, AccessTokenInterceptor accessTokenInterceptor) {
        C20009t providesAuthenticatedOkHttpClient = networkModule.providesAuthenticatedOkHttpClient(okHttpClientFactory, accessTokenInterceptor);
        C17782b.m29841G(providesAuthenticatedOkHttpClient);
        return providesAuthenticatedOkHttpClient;
    }

    public C20009t get() {
        return providesAuthenticatedOkHttpClient(this.module, this.okHttpClientFactoryProvider.get(), this.accessTokenInterceptorProvider.get());
    }
}
