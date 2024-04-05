package com.paypal.pyplcheckout.p543di;

import android.os.Looper;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesMainLooperFactory */
public final class AppModule_ProvidesMainLooperFactory implements C17555d<Looper> {
    private final AppModule module;

    public AppModule_ProvidesMainLooperFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvidesMainLooperFactory create(AppModule appModule) {
        return new AppModule_ProvidesMainLooperFactory(appModule);
    }

    public static Looper providesMainLooper(AppModule appModule) {
        Looper providesMainLooper = appModule.providesMainLooper();
        C17782b.m29841G(providesMainLooper);
        return providesMainLooper;
    }

    public Looper get() {
        return providesMainLooper(this.module);
    }
}
