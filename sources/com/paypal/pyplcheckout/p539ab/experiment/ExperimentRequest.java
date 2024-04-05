package com.paypal.pyplcheckout.p539ab.experiment;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.pyplcheckout.ab.experiment.ExperimentRequest */
public final class ExperimentRequest {
    private final Experiment experiment;
    private final String treatmentId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExperimentRequest(Experiment experiment2) {
        this(experiment2, (String) null, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(experiment2, "experiment");
    }

    public ExperimentRequest(Experiment experiment2, String str) {
        C19383o.m32797g(experiment2, "experiment");
        this.experiment = experiment2;
        this.treatmentId = str;
    }

    public static /* synthetic */ ExperimentRequest copy$default(ExperimentRequest experimentRequest, Experiment experiment2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            experiment2 = experimentRequest.experiment;
        }
        if ((i & 2) != 0) {
            str = experimentRequest.treatmentId;
        }
        return experimentRequest.copy(experiment2, str);
    }

    public final Experiment component1() {
        return this.experiment;
    }

    public final String component2() {
        return this.treatmentId;
    }

    public final ExperimentRequest copy(Experiment experiment2, String str) {
        C19383o.m32797g(experiment2, "experiment");
        return new ExperimentRequest(experiment2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExperimentRequest)) {
            return false;
        }
        ExperimentRequest experimentRequest = (ExperimentRequest) obj;
        return C19383o.m32792b(this.experiment, experimentRequest.experiment) && C19383o.m32792b(this.treatmentId, experimentRequest.treatmentId);
    }

    public final Experiment getExperiment() {
        return this.experiment;
    }

    public final String getTreatmentId() {
        return this.treatmentId;
    }

    public int hashCode() {
        int hashCode = this.experiment.hashCode() * 31;
        String str = this.treatmentId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        Experiment experiment2 = this.experiment;
        String str = this.treatmentId;
        return "ExperimentRequest(experiment=" + experiment2 + ", treatmentId=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExperimentRequest(Experiment experiment2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(experiment2, (i & 2) != 0 ? null : str);
    }
}
