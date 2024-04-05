package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesPyplCheckoutUtilsFactory */
public final class AppModule_ProvidesPyplCheckoutUtilsFactory implements C17555d<PYPLCheckoutUtils> {
    private final AppModule module;

    public AppModule_ProvidesPyplCheckoutUtilsFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvidesPyplCheckoutUtilsFactory create(AppModule appModule) {
        return new AppModule_ProvidesPyplCheckoutUtilsFactory(appModule);
    }

    public static PYPLCheckoutUtils providesPyplCheckoutUtils(AppModule appModule) {
        PYPLCheckoutUtils providesPyplCheckoutUtils = appModule.providesPyplCheckoutUtils();
        C17782b.m29841G(providesPyplCheckoutUtils);
        return providesPyplCheckoutUtils;
    }

    public PYPLCheckoutUtils get() {
        return providesPyplCheckoutUtils(this.module);
    }
}
