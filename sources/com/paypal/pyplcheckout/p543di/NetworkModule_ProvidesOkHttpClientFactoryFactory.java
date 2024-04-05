package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.data.api.OkHttpClientFactory;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import dagger.internal.C17555d;
import okhttp3.C20009t;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvidesOkHttpClientFactoryFactory */
public final class NetworkModule_ProvidesOkHttpClientFactoryFactory implements C17555d<OkHttpClientFactory> {
    private final C19011a<C20009t.C20010a> builderProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final NetworkModule module;
    private final C19011a<NetworkRetryInterceptor> networkRetryInterceptorProvider;

    public NetworkModule_ProvidesOkHttpClientFactoryFactory(NetworkModule networkModule, C19011a<C20009t.C20010a> aVar, C19011a<NetworkRetryInterceptor> aVar2, C19011a<DebugConfigManager> aVar3) {
        this.module = networkModule;
        this.builderProvider = aVar;
        this.networkRetryInterceptorProvider = aVar2;
        this.debugConfigManagerProvider = aVar3;
    }

    public static NetworkModule_ProvidesOkHttpClientFactoryFactory create(NetworkModule networkModule, C19011a<C20009t.C20010a> aVar, C19011a<NetworkRetryInterceptor> aVar2, C19011a<DebugConfigManager> aVar3) {
        return new NetworkModule_ProvidesOkHttpClientFactoryFactory(networkModule, aVar, aVar2, aVar3);
    }

    public static OkHttpClientFactory providesOkHttpClientFactory(NetworkModule networkModule, C20009t.C20010a aVar, NetworkRetryInterceptor networkRetryInterceptor, DebugConfigManager debugConfigManager) {
        OkHttpClientFactory providesOkHttpClientFactory = networkModule.providesOkHttpClientFactory(aVar, networkRetryInterceptor, debugConfigManager);
        C17782b.m29841G(providesOkHttpClientFactory);
        return providesOkHttpClientFactory;
    }

    public OkHttpClientFactory get() {
        return providesOkHttpClientFactory(this.module, this.builderProvider.get(), this.networkRetryInterceptorProvider.get(), this.debugConfigManagerProvider.get());
    }
}
