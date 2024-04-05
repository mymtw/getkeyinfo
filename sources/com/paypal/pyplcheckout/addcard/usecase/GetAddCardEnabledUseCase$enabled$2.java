package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class GetAddCardEnabledUseCase$enabled$2 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ GetAddCardEnabledUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAddCardEnabledUseCase$enabled$2(GetAddCardEnabledUseCase getAddCardEnabledUseCase) {
        super(0);
        this.this$0 = getAddCardEnabledUseCase;
    }

    public final Boolean invoke() {
        boolean z = false;
        FeatureResponse isEnabled$default = FeatureFlagManager.isEnabled$default(Feature.ADD_CARD, false, 2, (Object) null);
        if (C19383o.m32792b(isEnabled$default, FeatureResponse.Enabled.INSTANCE)) {
            boolean access$isAddCardSupported = this.this$0.isAddCardSupported();
            if (access$isAddCardSupported) {
                ExperimentResponse treatment = this.this$0.abManager.getTreatment(new ExperimentRequest(ElmoAbExperiment.NATIVE_ADD_CARD_EXPERIMENT, (String) null, 2, (DefaultConstructorMarker) null));
                if (treatment instanceof ExperimentResponse.Success) {
                    z = C19383o.m32792b(((ExperimentResponse.Success) treatment).getResponse().getTreatmentName(), ElmoTreatment.NATIVE_ADD_CARD_EXPERIMENT_TRMT.getTreatmentName());
                } else if (!(treatment instanceof ExperimentResponse.Failure) && !(treatment instanceof ExperimentResponse.Disable)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (access$isAddCardSupported) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!C19383o.m32792b(isEnabled$default, FeatureResponse.Disabled.INSTANCE)) {
            if (C19383o.m32792b(isEnabled$default, FeatureResponse.EnableOverride.INSTANCE)) {
                z = true;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Boolean.valueOf(z);
    }
}
