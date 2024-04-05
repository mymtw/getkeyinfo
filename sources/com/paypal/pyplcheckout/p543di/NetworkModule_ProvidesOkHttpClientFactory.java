package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import okhttp3.C20009t;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvidesOkHttpClientFactory */
public final class NetworkModule_ProvidesOkHttpClientFactory implements C17555d<C20009t> {
    private final NetworkModule module;

    public NetworkModule_ProvidesOkHttpClientFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvidesOkHttpClientFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvidesOkHttpClientFactory(networkModule);
    }

    public static C20009t providesOkHttpClient(NetworkModule networkModule) {
        C20009t providesOkHttpClient = networkModule.providesOkHttpClient();
        C17782b.m29841G(providesOkHttpClient);
        return providesOkHttpClient;
    }

    public C20009t get() {
        return providesOkHttpClient(this.module);
    }
}
