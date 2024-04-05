package com.paypal.pyplcheckout.p539ab.elmo;

import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoExperiment */
public final class ElmoExperiment {
    private final List<Treatment> treatments;

    public ElmoExperiment(List<Treatment> list) {
        C19383o.m32797g(list, "treatments");
        this.treatments = list;
    }

    public static /* synthetic */ ElmoExperiment copy$default(ElmoExperiment elmoExperiment, List<Treatment> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = elmoExperiment.treatments;
        }
        return elmoExperiment.copy(list);
    }

    public final List<Treatment> component1() {
        return this.treatments;
    }

    public final ElmoExperiment copy(List<Treatment> list) {
        C19383o.m32797g(list, "treatments");
        return new ElmoExperiment(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ElmoExperiment) && C19383o.m32792b(this.treatments, ((ElmoExperiment) obj).treatments);
    }

    public final List<Treatment> getTreatments() {
        return this.treatments;
    }

    public int hashCode() {
        return this.treatments.hashCode();
    }

    public String toString() {
        List<Treatment> list = this.treatments;
        return "ElmoExperiment(treatments=" + list + ")";
    }
}
