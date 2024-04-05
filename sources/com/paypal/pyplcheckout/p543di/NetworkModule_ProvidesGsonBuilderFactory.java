package com.paypal.pyplcheckout.p543di;

import com.google.gson.C16796j;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvidesGsonBuilderFactory */
public final class NetworkModule_ProvidesGsonBuilderFactory implements C17555d<C16796j> {
    private final NetworkModule module;

    public NetworkModule_ProvidesGsonBuilderFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvidesGsonBuilderFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvidesGsonBuilderFactory(networkModule);
    }

    public static C16796j providesGsonBuilder(NetworkModule networkModule) {
        C16796j providesGsonBuilder = networkModule.providesGsonBuilder();
        C17782b.m29841G(providesGsonBuilder);
        return providesGsonBuilder;
    }

    public C16796j get() {
        return providesGsonBuilder(this.module);
    }
}
