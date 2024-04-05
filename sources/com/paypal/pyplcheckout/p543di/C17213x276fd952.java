package com.paypal.pyplcheckout.p543di;

import android.content.Context;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeSdk;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.utils.AmplitudeUtils;
import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesAmplitudeInitializer$pyplcheckout_externalThreedsReleaseFactory */
public final class C17213x276fd952 implements C17555d<AmplitudeSdk> {
    private final C19011a<AmplitudeUtils> amplitudeUtilsProvider;
    private final C19011a<Context> contextProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final AppModule module;

    public C17213x276fd952(AppModule appModule, C19011a<DebugConfigManager> aVar, C19011a<AmplitudeUtils> aVar2, C19011a<Context> aVar3) {
        this.module = appModule;
        this.debugConfigManagerProvider = aVar;
        this.amplitudeUtilsProvider = aVar2;
        this.contextProvider = aVar3;
    }

    public static C17213x276fd952 create(AppModule appModule, C19011a<DebugConfigManager> aVar, C19011a<AmplitudeUtils> aVar2, C19011a<Context> aVar3) {
        return new C17213x276fd952(appModule, aVar, aVar2, aVar3);
    }

    public static AmplitudeSdk providesAmplitudeInitializer$pyplcheckout_externalThreedsRelease(AppModule appModule, DebugConfigManager debugConfigManager, AmplitudeUtils amplitudeUtils, Context context) {
        AmplitudeSdk providesAmplitudeInitializer$pyplcheckout_externalThreedsRelease = appModule.providesAmplitudeInitializer$pyplcheckout_externalThreedsRelease(debugConfigManager, amplitudeUtils, context);
        C17782b.m29841G(providesAmplitudeInitializer$pyplcheckout_externalThreedsRelease);
        return providesAmplitudeInitializer$pyplcheckout_externalThreedsRelease;
    }

    public AmplitudeSdk get() {
        return providesAmplitudeInitializer$pyplcheckout_externalThreedsRelease(this.module, this.debugConfigManagerProvider.get(), this.amplitudeUtilsProvider.get(), this.contextProvider.get());
    }
}
