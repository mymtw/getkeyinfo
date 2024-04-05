package com.paypal.pyplcheckout.eligibility;

import com.paypal.pyplcheckout.eligibility.Native3pEligibilityCheck;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentCallback;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import kotlin.jvm.internal.C19383o;

public final class Native3pEligibilityCheck$is3pNativeEligible$1 implements ExperimentCallback {
    public final /* synthetic */ Native3pEligibilityCheck.EligibilityCallback $eligibilityCallback;

    public Native3pEligibilityCheck$is3pNativeEligible$1(Native3pEligibilityCheck.EligibilityCallback eligibilityCallback) {
        this.$eligibilityCallback = eligibilityCallback;
    }

    public void onResponse(ExperimentResponse experimentResponse) {
        C19383o.m32797g(experimentResponse, "experimentResponse");
        if (experimentResponse instanceof ExperimentResponse.Success) {
            if (C19383o.m32792b(ElmoTreatment.NXO_3P_SDK_ELIGIBILITY_CTRL.getTreatmentName(), ((ExperimentResponse.Success) experimentResponse).getResponse().getTreatmentName())) {
                this.$eligibilityCallback.onPassed();
            } else {
                this.$eligibilityCallback.onFailed();
            }
        } else if (experimentResponse instanceof ExperimentResponse.Failure) {
            this.$eligibilityCallback.onPassed();
        } else if (experimentResponse instanceof ExperimentResponse.Disable) {
            this.$eligibilityCallback.onPassed();
        }
    }
}
