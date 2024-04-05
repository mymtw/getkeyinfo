package com.paypal.pyplcheckout.p543di;

import android.os.Handler;
import android.os.Looper;
import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesMainHandlerFactory */
public final class AppModule_ProvidesMainHandlerFactory implements C17555d<Handler> {
    private final C19011a<Looper> looperProvider;
    private final AppModule module;

    public AppModule_ProvidesMainHandlerFactory(AppModule appModule, C19011a<Looper> aVar) {
        this.module = appModule;
        this.looperProvider = aVar;
    }

    public static AppModule_ProvidesMainHandlerFactory create(AppModule appModule, C19011a<Looper> aVar) {
        return new AppModule_ProvidesMainHandlerFactory(appModule, aVar);
    }

    public static Handler providesMainHandler(AppModule appModule, Looper looper) {
        Handler providesMainHandler = appModule.providesMainHandler(looper);
        C17782b.m29841G(providesMainHandler);
        return providesMainHandler;
    }

    public Handler get() {
        return providesMainHandler(this.module, this.looperProvider.get());
    }
}
