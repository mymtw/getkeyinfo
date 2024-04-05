package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import okhttp3.C20009t;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvidesOkHttpClientBuilderFactory */
public final class NetworkModule_ProvidesOkHttpClientBuilderFactory implements C17555d<C20009t.C20010a> {
    private final NetworkModule module;

    public NetworkModule_ProvidesOkHttpClientBuilderFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvidesOkHttpClientBuilderFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvidesOkHttpClientBuilderFactory(networkModule);
    }

    public static C20009t.C20010a providesOkHttpClientBuilder(NetworkModule networkModule) {
        C20009t.C20010a providesOkHttpClientBuilder = networkModule.providesOkHttpClientBuilder();
        C17782b.m29841G(providesOkHttpClientBuilder);
        return providesOkHttpClientBuilder;
    }

    public C20009t.C20010a get() {
        return providesOkHttpClientBuilder(this.module);
    }
}
