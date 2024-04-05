package com.paypal.pyplcheckout.threeds;

import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

public final class ThreeDSModule_ProvidesThreeDS20Factory implements C17555d<ThreeDS20> {
    private final ThreeDSModule module;
    private final C19011a<ThreeDs20Info> threeDs20InfoProvider;

    public ThreeDSModule_ProvidesThreeDS20Factory(ThreeDSModule threeDSModule, C19011a<ThreeDs20Info> aVar) {
        this.module = threeDSModule;
        this.threeDs20InfoProvider = aVar;
    }

    public static ThreeDSModule_ProvidesThreeDS20Factory create(ThreeDSModule threeDSModule, C19011a<ThreeDs20Info> aVar) {
        return new ThreeDSModule_ProvidesThreeDS20Factory(threeDSModule, aVar);
    }

    public static ThreeDS20 providesThreeDS20(ThreeDSModule threeDSModule, ThreeDs20Info threeDs20Info) {
        ThreeDS20 providesThreeDS20 = threeDSModule.providesThreeDS20(threeDs20Info);
        C17782b.m29841G(providesThreeDS20);
        return providesThreeDS20;
    }

    public ThreeDS20 get() {
        return providesThreeDS20(this.module, this.threeDs20InfoProvider.get());
    }
}
