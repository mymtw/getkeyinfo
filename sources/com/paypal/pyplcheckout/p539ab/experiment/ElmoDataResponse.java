package com.paypal.pyplcheckout.p539ab.experiment;

import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.ab.experiment.ElmoDataResponse */
public final class ElmoDataResponse extends DataResponse {
    private final Map<String, String> extras;
    private final String treatmentName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ElmoDataResponse(String str, Map<String, String> map) {
        super(str);
        C19383o.m32797g(str, "treatmentName");
        this.treatmentName = str;
        this.extras = map;
    }

    public static /* synthetic */ ElmoDataResponse copy$default(ElmoDataResponse elmoDataResponse, String str, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = elmoDataResponse.getTreatmentName();
        }
        if ((i & 2) != 0) {
            map = elmoDataResponse.extras;
        }
        return elmoDataResponse.copy(str, map);
    }

    public final String component1() {
        return getTreatmentName();
    }

    public final Map<String, String> component2() {
        return this.extras;
    }

    public final ElmoDataResponse copy(String str, Map<String, String> map) {
        C19383o.m32797g(str, "treatmentName");
        return new ElmoDataResponse(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElmoDataResponse)) {
            return false;
        }
        ElmoDataResponse elmoDataResponse = (ElmoDataResponse) obj;
        return C19383o.m32792b(getTreatmentName(), elmoDataResponse.getTreatmentName()) && C19383o.m32792b(this.extras, elmoDataResponse.extras);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public String getTreatmentName() {
        return this.treatmentName;
    }

    public int hashCode() {
        int hashCode = getTreatmentName().hashCode() * 31;
        Map<String, String> map = this.extras;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        String treatmentName2 = getTreatmentName();
        Map<String, String> map = this.extras;
        return "ElmoDataResponse(treatmentName=" + treatmentName2 + ", extras=" + map + ")";
    }
}
