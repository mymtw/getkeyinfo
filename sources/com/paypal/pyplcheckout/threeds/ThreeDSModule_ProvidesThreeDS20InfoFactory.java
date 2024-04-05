package com.paypal.pyplcheckout.threeds;

import dagger.internal.C17555d;
import p568fn.C17782b;

public final class ThreeDSModule_ProvidesThreeDS20InfoFactory implements C17555d<ThreeDs20Info> {
    private final ThreeDSModule module;

    public ThreeDSModule_ProvidesThreeDS20InfoFactory(ThreeDSModule threeDSModule) {
        this.module = threeDSModule;
    }

    public static ThreeDSModule_ProvidesThreeDS20InfoFactory create(ThreeDSModule threeDSModule) {
        return new ThreeDSModule_ProvidesThreeDS20InfoFactory(threeDSModule);
    }

    public static ThreeDs20Info providesThreeDS20Info(ThreeDSModule threeDSModule) {
        ThreeDs20Info providesThreeDS20Info = threeDSModule.providesThreeDS20Info();
        C17782b.m29841G(providesThreeDS20Info);
        return providesThreeDS20Info;
    }

    public ThreeDs20Info get() {
        return providesThreeDS20Info(this.module);
    }
}
