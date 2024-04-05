package com.paypal.pyplcheckout.p543di;

import com.paypal.pyplcheckout.common.instrumentation.InstrumentationSession;
import dagger.internal.C17555d;
import p568fn.C17782b;

/* renamed from: com.paypal.pyplcheckout.di.AppModule_ProvidesInstrumentationSession$pyplcheckout_externalThreedsReleaseFactory */
public final class C17215x7ea269c9 implements C17555d<InstrumentationSession> {
    private final AppModule module;

    public C17215x7ea269c9(AppModule appModule) {
        this.module = appModule;
    }

    public static C17215x7ea269c9 create(AppModule appModule) {
        return new C17215x7ea269c9(appModule);
    }

    /* renamed from: providesInstrumentationSession$pyplcheckout_externalThreedsRelease */
    public static InstrumentationSession m28755xbc1aba2f(AppModule appModule) {
        InstrumentationSession providesInstrumentationSession$pyplcheckout_externalThreedsRelease = appModule.mo64217xbc1aba2f();
        C17782b.m29841G(providesInstrumentationSession$pyplcheckout_externalThreedsRelease);
        return providesInstrumentationSession$pyplcheckout_externalThreedsRelease;
    }

    public InstrumentationSession get() {
        return m28755xbc1aba2f(this.module);
    }
}
