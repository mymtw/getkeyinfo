package com.paypal.pyplcheckout.p539ab.elmo;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoData */
public final class ElmoData {
    private final ElmoExperiment elmoExperiment;

    public ElmoData(ElmoExperiment elmoExperiment2) {
        C19383o.m32797g(elmoExperiment2, "elmoExperiment");
        this.elmoExperiment = elmoExperiment2;
    }

    public static /* synthetic */ ElmoData copy$default(ElmoData elmoData, ElmoExperiment elmoExperiment2, int i, Object obj) {
        if ((i & 1) != 0) {
            elmoExperiment2 = elmoData.elmoExperiment;
        }
        return elmoData.copy(elmoExperiment2);
    }

    public final ElmoExperiment component1() {
        return this.elmoExperiment;
    }

    public final ElmoData copy(ElmoExperiment elmoExperiment2) {
        C19383o.m32797g(elmoExperiment2, "elmoExperiment");
        return new ElmoData(elmoExperiment2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ElmoData) && C19383o.m32792b(this.elmoExperiment, ((ElmoData) obj).elmoExperiment);
    }

    public final ElmoExperiment getElmoExperiment() {
        return this.elmoExperiment;
    }

    public int hashCode() {
        return this.elmoExperiment.hashCode();
    }

    public String toString() {
        ElmoExperiment elmoExperiment2 = this.elmoExperiment;
        return "ElmoData(elmoExperiment=" + elmoExperiment2 + ")";
    }
}
