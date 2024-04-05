package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import p253u3.C8139f;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesAmplitudeClientFactory */
public final class AppModule_ProvidesAmplitudeClientFactory implements C17555d<C8139f> {
    private final AppModule module;

    public AppModule_ProvidesAmplitudeClientFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvidesAmplitudeClientFactory create(AppModule appModule) {
        return new AppModule_ProvidesAmplitudeClientFactory(appModule);
    }

    public static C8139f providesAmplitudeClient(AppModule appModule) {
        C8139f providesAmplitudeClient = appModule.providesAmplitudeClient();
        C17782b.m29841G(providesAmplitudeClient);
        return providesAmplitudeClient;
    }

    public C8139f get() {
        return providesAmplitudeClient(this.module);
    }
}
