package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesFeatureFlagManager$pyplcheckout_externalThreedsReleaseFactory */
public final class C17214x3e3e4966 implements C17555d<FeatureFlagManager> {
    private final AppModule module;

    public C17214x3e3e4966(AppModule appModule) {
        this.module = appModule;
    }

    public static C17214x3e3e4966 create(AppModule appModule) {
        return new C17214x3e3e4966(appModule);
    }

    public static FeatureFlagManager providesFeatureFlagManager$pyplcheckout_externalThreedsRelease(AppModule appModule) {
        FeatureFlagManager providesFeatureFlagManager$pyplcheckout_externalThreedsRelease = appModule.providesFeatureFlagManager$pyplcheckout_externalThreedsRelease();
        C17782b.m29841G(providesFeatureFlagManager$pyplcheckout_externalThreedsRelease);
        return providesFeatureFlagManager$pyplcheckout_externalThreedsRelease;
    }

    public FeatureFlagManager get() {
        return providesFeatureFlagManager$pyplcheckout_externalThreedsRelease(this.module);
    }
}
