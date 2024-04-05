package com.paypal.pyplcheckout.p539ab;

import com.paypal.pyplcheckout.p539ab.experiment.DataResponse;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentCallback;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.ab.Ab$Companion$empty$1 */
public final class Ab$Companion$empty$1 implements C17172Ab {
    private Map<String, ? extends DataResponse> cache;

    public Map<String, DataResponse> getCache() {
        return this.cache;
    }

    public void getTreatmentRemote(ExperimentRequest experimentRequest, ExperimentCallback experimentCallback) {
        C19383o.m32797g(experimentRequest, "experimentRequest");
        C19383o.m32797g(experimentCallback, "callback");
    }

    public void setCache(Map<String, ? extends DataResponse> map) {
        this.cache = map;
    }

    public void setup(String str) {
        C19383o.m32797g(str, "uuid");
    }

    public ExperimentResponse.Success getTreatment(ExperimentRequest experimentRequest) {
        C19383o.m32797g(experimentRequest, "experimentRequest");
        return new ExperimentResponse.Success(new DataResponse(""));
    }
}
