package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvideNetworkRetryInterceptorFactory */
public final class NetworkModule_ProvideNetworkRetryInterceptorFactory implements C17555d<NetworkRetryInterceptor> {
    private final NetworkModule module;

    public NetworkModule_ProvideNetworkRetryInterceptorFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvideNetworkRetryInterceptorFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvideNetworkRetryInterceptorFactory(networkModule);
    }

    public static NetworkRetryInterceptor provideNetworkRetryInterceptor(NetworkModule networkModule) {
        NetworkRetryInterceptor provideNetworkRetryInterceptor = networkModule.provideNetworkRetryInterceptor();
        C17782b.m29841G(provideNetworkRetryInterceptor);
        return provideNetworkRetryInterceptor;
    }

    public NetworkRetryInterceptor get() {
        return provideNetworkRetryInterceptor(this.module);
    }
}
