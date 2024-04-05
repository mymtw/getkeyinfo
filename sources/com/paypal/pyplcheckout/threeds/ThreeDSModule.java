package com.paypal.pyplcheckout.threeds;

import kotlin.jvm.internal.C19383o;

public final class ThreeDSModule {
    public final ThreeDS20 providesThreeDS20(ThreeDs20Info threeDs20Info) {
        C19383o.m32797g(threeDs20Info, "threeDs20Info");
        return new ThreeDS20(threeDs20Info);
    }

    public final ThreeDs20Info providesThreeDS20Info() {
        return new ThreeDs20Info();
    }

    public final ThreeDsDecisionFlowInfo providesThreeDsDecisionFlowInfo() {
        return new ThreeDsDecisionFlowInfo();
    }
}
