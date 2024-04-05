package com.paypal.pyplcheckout.p539ab;

import com.paypal.pyplcheckout.p539ab.experiment.DataResponse;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentCallback;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import java.util.Map;

/* renamed from: com.paypal.pyplcheckout.ab.Ab */
public interface C17172Ab {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.paypal.pyplcheckout.ab.Ab$Companion */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final C17172Ab empty() {
            return new Ab$Companion$empty$1();
        }
    }

    /* renamed from: com.paypal.pyplcheckout.ab.Ab$Type */
    public enum Type {
        ELMO,
        AMPLITUDE
    }

    Map<String, DataResponse> getCache();

    ExperimentResponse getTreatment(ExperimentRequest experimentRequest) throws Exception;

    void getTreatmentRemote(ExperimentRequest experimentRequest, ExperimentCallback experimentCallback) throws Exception;

    void setCache(Map<String, ? extends DataResponse> map);

    void setup(String str) throws Exception;
}
