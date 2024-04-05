package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesBuildVersionFactory */
public final class AppModule_ProvidesBuildVersionFactory implements C17555d<AndroidSDKVersionProvider> {
    private final AppModule module;

    public AppModule_ProvidesBuildVersionFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvidesBuildVersionFactory create(AppModule appModule) {
        return new AppModule_ProvidesBuildVersionFactory(appModule);
    }

    public static AndroidSDKVersionProvider providesBuildVersion(AppModule appModule) {
        AndroidSDKVersionProvider providesBuildVersion = appModule.providesBuildVersion();
        C17782b.m29841G(providesBuildVersion);
        return providesBuildVersion;
    }

    public AndroidSDKVersionProvider get() {
        return providesBuildVersion(this.module);
    }
}
