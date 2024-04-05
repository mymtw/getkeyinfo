package com.paypal.pyplcheckout.p543di;

import com.google.gson.C16708i;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.NetworkModule_ProvidesGsonFactory */
public final class NetworkModule_ProvidesGsonFactory implements C17555d<C16708i> {
    private final NetworkModule module;

    public NetworkModule_ProvidesGsonFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_ProvidesGsonFactory create(NetworkModule networkModule) {
        return new NetworkModule_ProvidesGsonFactory(networkModule);
    }

    public static C16708i providesGson(NetworkModule networkModule) {
        C16708i providesGson = networkModule.providesGson();
        C17782b.m29841G(providesGson);
        return providesGson;
    }

    public C16708i get() {
        return providesGson(this.module);
    }
}
