package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import okhttp3.C20011u;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvidesRequestBuilderFactory */
public final class NetworkModule_ProvidesRequestBuilderFactory implements C17555d<C20011u.C20012a> {
    private final NetworkModule module;

    public NetworkModule_ProvidesRequestBuilderFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvidesRequestBuilderFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvidesRequestBuilderFactory(networkModule);
    }

    public static C20011u.C20012a providesRequestBuilder(NetworkModule networkModule) {
        C20011u.C20012a providesRequestBuilder = networkModule.providesRequestBuilder();
        C17782b.m29841G(providesRequestBuilder);
        return providesRequestBuilder;
    }

    public C20011u.C20012a get() {
        return providesRequestBuilder(this.module);
    }
}
