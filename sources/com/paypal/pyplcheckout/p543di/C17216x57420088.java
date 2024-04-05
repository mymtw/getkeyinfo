package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesIs1P$pyplcheckout_externalThreedsReleaseFactory */
public final class C17216x57420088 implements C17555d<Boolean> {
    private final AppModule module;

    public C17216x57420088(AppModule appModule) {
        this.module = appModule;
    }

    public static C17216x57420088 create(AppModule appModule) {
        return new C17216x57420088(appModule);
    }

    public static boolean providesIs1P$pyplcheckout_externalThreedsRelease(AppModule appModule) {
        return appModule.providesIs1P$pyplcheckout_externalThreedsRelease();
    }

    public Boolean get() {
        return Boolean.valueOf(providesIs1P$pyplcheckout_externalThreedsRelease(this.module));
    }
}
