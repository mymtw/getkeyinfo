package com.paypal.pyplcheckout.p539ab.experiment;

import kotlin.jvm.internal.C19383o;
import org.apache.commons.cli.HelpFormatter;
import p010a9.C0048b;

/* renamed from: com.paypal.pyplcheckout.ab.experiment.ExternalExperimentData */
public final class ExternalExperimentData {
    private final String experimentName;
    private final String key;
    private final String treatmentName;

    public ExternalExperimentData(String str, String str2) {
        C19383o.m32797g(str, "experimentName");
        C19383o.m32797g(str2, "treatmentName");
        this.experimentName = str;
        this.treatmentName = str2;
        this.key = C0048b.m163a(str, HelpFormatter.DEFAULT_OPT_PREFIX, str2);
    }

    public static /* synthetic */ ExternalExperimentData copy$default(ExternalExperimentData externalExperimentData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalExperimentData.experimentName;
        }
        if ((i & 2) != 0) {
            str2 = externalExperimentData.treatmentName;
        }
        return externalExperimentData.copy(str, str2);
    }

    public final String component1() {
        return this.experimentName;
    }

    public final String component2() {
        return this.treatmentName;
    }

    public final ExternalExperimentData copy(String str, String str2) {
        C19383o.m32797g(str, "experimentName");
        C19383o.m32797g(str2, "treatmentName");
        return new ExternalExperimentData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalExperimentData)) {
            return false;
        }
        ExternalExperimentData externalExperimentData = (ExternalExperimentData) obj;
        return C19383o.m32792b(this.experimentName, externalExperimentData.experimentName) && C19383o.m32792b(this.treatmentName, externalExperimentData.treatmentName);
    }

    public final String getExperimentName() {
        return this.experimentName;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTreatmentName() {
        return this.treatmentName;
    }

    public int hashCode() {
        return this.treatmentName.hashCode() + (this.experimentName.hashCode() * 31);
    }

    public String toString() {
        return C0048b.m164c("ExternalExperimentData(experimentName=", this.experimentName, ", treatmentName=", this.treatmentName, ")");
    }
}
