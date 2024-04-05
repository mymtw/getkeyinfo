package com.paypal.pyplcheckout.crypto;

import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NativePayWithCryptoCheck {
    private final AbManager abManager;
    private final boolean is1P;

    public NativePayWithCryptoCheck(AbManager abManager2, boolean z) {
        C19383o.m32797g(abManager2, "abManager");
        this.abManager = abManager2;
        this.is1P = z;
    }

    private final boolean check1PExperiment() {
        ExperimentResponse treatment = this.abManager.getTreatment(new ExperimentRequest(ElmoAbExperiment.NXO_1P_PAY_WITH_CRYPTO, (String) null, 2, (DefaultConstructorMarker) null));
        if (treatment instanceof ExperimentResponse.Success) {
            return C19383o.m32792b(ElmoTreatment.NXO_1P_PAY_WITH_CRYPTO_TRMT.getTreatmentName(), ((ExperimentResponse.Success) treatment).getResponse().getTreatmentName());
        }
        return false;
    }

    private final boolean check3PExperiment() {
        ExperimentResponse treatment = this.abManager.getTreatment(new ExperimentRequest(ElmoAbExperiment.NXO_3P_PAY_WITH_CRYPTO, (String) null, 2, (DefaultConstructorMarker) null));
        if (treatment instanceof ExperimentResponse.Success) {
            return C19383o.m32792b(ElmoTreatment.NXO_3P_PAY_WITH_CRYPTO_TRMT.getTreatmentName(), ((ExperimentResponse.Success) treatment).getResponse().getTreatmentName());
        }
        return false;
    }

    public final boolean isPayWithCryptoEligible() {
        return this.is1P ? check1PExperiment() : check3PExperiment();
    }
}
