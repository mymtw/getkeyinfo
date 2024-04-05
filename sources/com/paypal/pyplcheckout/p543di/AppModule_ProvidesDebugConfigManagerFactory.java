package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesDebugConfigManagerFactory */
public final class AppModule_ProvidesDebugConfigManagerFactory implements C17555d<DebugConfigManager> {
    private final AppModule module;

    public AppModule_ProvidesDebugConfigManagerFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvidesDebugConfigManagerFactory create(AppModule appModule) {
        return new AppModule_ProvidesDebugConfigManagerFactory(appModule);
    }

    public static DebugConfigManager providesDebugConfigManager(AppModule appModule) {
        DebugConfigManager providesDebugConfigManager = appModule.providesDebugConfigManager();
        C17782b.m29841G(providesDebugConfigManager);
        return providesDebugConfigManager;
    }

    public DebugConfigManager get() {
        return providesDebugConfigManager(this.module);
    }
}
