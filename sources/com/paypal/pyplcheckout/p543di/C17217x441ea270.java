package com.paypal.pyplcheckout.p543di;

import dagger.internal.C17555d;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesIsDebug$pyplcheckout_externalThreedsReleaseFactory */
public final class C17217x441ea270 implements C17555d<Boolean> {
    private final AppModule module;

    public C17217x441ea270(AppModule appModule) {
        this.module = appModule;
    }

    public static C17217x441ea270 create(AppModule appModule) {
        return new C17217x441ea270(appModule);
    }

    public static boolean providesIsDebug$pyplcheckout_externalThreedsRelease(AppModule appModule) {
        return appModule.providesIsDebug$pyplcheckout_externalThreedsRelease();
    }

    public Boolean get() {
        return Boolean.valueOf(providesIsDebug$pyplcheckout_externalThreedsRelease(this.module));
    }
}
