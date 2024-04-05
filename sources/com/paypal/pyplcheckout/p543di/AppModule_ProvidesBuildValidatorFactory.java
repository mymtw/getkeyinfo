package com.paypal.pyplcheckout.p543di;

import com.paypal.checkout.internal.build.BuildValidator;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesBuildValidatorFactory */
public final class AppModule_ProvidesBuildValidatorFactory implements C17555d<BuildValidator> {
    private final AppModule module;

    public AppModule_ProvidesBuildValidatorFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvidesBuildValidatorFactory create(AppModule appModule) {
        return new AppModule_ProvidesBuildValidatorFactory(appModule);
    }

    public static BuildValidator providesBuildValidator(AppModule appModule) {
        BuildValidator providesBuildValidator = appModule.providesBuildValidator();
        C17782b.m29841G(providesBuildValidator);
        return providesBuildValidator;
    }

    public BuildValidator get() {
        return providesBuildValidator(this.module);
    }
}
