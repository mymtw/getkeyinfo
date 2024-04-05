package com.paypal.pyplcheckout.data.api;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import dagger.internal.C17555d;
import okhttp3.C20009t;
import p740eq.C19011a;

public final class OkHttpClientFactory_Factory implements C17555d<OkHttpClientFactory> {
    private final C19011a<C20009t.C20010a> builderProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<NetworkRetryInterceptor> networkRetryInterceptorProvider;

    public OkHttpClientFactory_Factory(C19011a<C20009t.C20010a> aVar, C19011a<NetworkRetryInterceptor> aVar2, C19011a<DebugConfigManager> aVar3) {
        this.builderProvider = aVar;
        this.networkRetryInterceptorProvider = aVar2;
        this.debugConfigManagerProvider = aVar3;
    }

    public static OkHttpClientFactory_Factory create(C19011a<C20009t.C20010a> aVar, C19011a<NetworkRetryInterceptor> aVar2, C19011a<DebugConfigManager> aVar3) {
        return new OkHttpClientFactory_Factory(aVar, aVar2, aVar3);
    }

    public static OkHttpClientFactory newInstance(C20009t.C20010a aVar, NetworkRetryInterceptor networkRetryInterceptor, DebugConfigManager debugConfigManager) {
        return new OkHttpClientFactory(aVar, networkRetryInterceptor, debugConfigManager);
    }

    public OkHttpClientFactory get() {
        return newInstance(this.builderProvider.get(), this.networkRetryInterceptorProvider.get(), this.debugConfigManagerProvider.get());
    }
}
