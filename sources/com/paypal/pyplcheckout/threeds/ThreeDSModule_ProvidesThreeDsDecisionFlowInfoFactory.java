package com.paypal.pyplcheckout.threeds;

import dagger.internal.C17555d;
import p568fn.C17782b;

public final class ThreeDSModule_ProvidesThreeDsDecisionFlowInfoFactory implements C17555d<ThreeDsDecisionFlowInfo> {
    private final ThreeDSModule module;

    public ThreeDSModule_ProvidesThreeDsDecisionFlowInfoFactory(ThreeDSModule threeDSModule) {
        this.module = threeDSModule;
    }

    public static ThreeDSModule_ProvidesThreeDsDecisionFlowInfoFactory create(ThreeDSModule threeDSModule) {
        return new ThreeDSModule_ProvidesThreeDsDecisionFlowInfoFactory(threeDSModule);
    }

    public static ThreeDsDecisionFlowInfo providesThreeDsDecisionFlowInfo(ThreeDSModule threeDSModule) {
        ThreeDsDecisionFlowInfo providesThreeDsDecisionFlowInfo = threeDSModule.providesThreeDsDecisionFlowInfo();
        C17782b.m29841G(providesThreeDsDecisionFlowInfo);
        return providesThreeDsDecisionFlowInfo;
    }

    public ThreeDsDecisionFlowInfo get() {
        return providesThreeDsDecisionFlowInfo(this.module);
    }
}
