package com.paypal.pyplcheckout.eligibility;

import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Native3pEligibilityCheck {
    private final AbManager abManager;

    public interface EligibilityCallback {
        void onFailed();

        void onPassed();
    }

    public Native3pEligibilityCheck(AbManager abManager2) {
        C19383o.m32797g(abManager2, "abManager");
        this.abManager = abManager2;
    }

    public final void is3pNativeEligible(EligibilityCallback eligibilityCallback) {
        C19383o.m32797g(eligibilityCallback, "eligibilityCallback");
        this.abManager.getTreatmentRemote(new ExperimentRequest(ElmoAbExperiment.NXO_3P_SDK_ELIGIBILITY, (String) null, 2, (DefaultConstructorMarker) null), new Native3pEligibilityCheck$is3pNativeEligible$1(eligibilityCallback));
    }
}
