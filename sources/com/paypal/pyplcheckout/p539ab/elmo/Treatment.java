package com.paypal.pyplcheckout.p539ab.elmo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.Treatment */
public final class Treatment {
    private final String experimentId;
    private final String experimentName;
    private final Map<String, String> factors;
    private final String treatmentId;
    private final String treatmentName;
    private final String version;

    public Treatment(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        C19383o.m32797g(str, "experimentId");
        C19383o.m32797g(str2, "experimentName");
        C19383o.m32797g(str3, "treatmentId");
        C19383o.m32797g(str4, "treatmentName");
        C19383o.m32797g(str5, ResponseConstants.VERSION);
        C19383o.m32797g(map, "factors");
        this.experimentId = str;
        this.experimentName = str2;
        this.treatmentId = str3;
        this.treatmentName = str4;
        this.version = str5;
        this.factors = map;
    }

    public static /* synthetic */ Treatment copy$default(Treatment treatment, String str, String str2, String str3, String str4, String str5, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = treatment.experimentId;
        }
        if ((i & 2) != 0) {
            str2 = treatment.experimentName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = treatment.treatmentId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = treatment.treatmentName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = treatment.version;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            map = treatment.factors;
        }
        return treatment.copy(str, str6, str7, str8, str9, map);
    }

    public final String component1() {
        return this.experimentId;
    }

    public final String component2() {
        return this.experimentName;
    }

    public final String component3() {
        return this.treatmentId;
    }

    public final String component4() {
        return this.treatmentName;
    }

    public final String component5() {
        return this.version;
    }

    public final Map<String, String> component6() {
        return this.factors;
    }

    public final Treatment copy(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        C19383o.m32797g(str, "experimentId");
        C19383o.m32797g(str2, "experimentName");
        C19383o.m32797g(str3, "treatmentId");
        C19383o.m32797g(str4, "treatmentName");
        C19383o.m32797g(str5, ResponseConstants.VERSION);
        C19383o.m32797g(map, "factors");
        return new Treatment(str, str2, str3, str4, str5, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Treatment)) {
            return false;
        }
        Treatment treatment = (Treatment) obj;
        return C19383o.m32792b(this.experimentId, treatment.experimentId) && C19383o.m32792b(this.experimentName, treatment.experimentName) && C19383o.m32792b(this.treatmentId, treatment.treatmentId) && C19383o.m32792b(this.treatmentName, treatment.treatmentName) && C19383o.m32792b(this.version, treatment.version) && C19383o.m32792b(this.factors, treatment.factors);
    }

    public final String getExperimentId() {
        return this.experimentId;
    }

    public final String getExperimentName() {
        return this.experimentName;
    }

    public final Map<String, String> getFactors() {
        return this.factors;
    }

    public final String getTreatmentId() {
        return this.treatmentId;
    }

    public final String getTreatmentName() {
        return this.treatmentName;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.factors.hashCode() + C0023f.m105e(this.version, C0023f.m105e(this.treatmentName, C0023f.m105e(this.treatmentId, C0023f.m105e(this.experimentName, this.experimentId.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.experimentId;
        String str2 = this.experimentName;
        String str3 = this.treatmentId;
        String str4 = this.treatmentName;
        String str5 = this.version;
        Map<String, String> map = this.factors;
        StringBuilder f = C0388a.m1050f("Treatment(experimentId=", str, ", experimentName=", str2, ", treatmentId=");
        C0391c.m1061h(f, str3, ", treatmentName=", str4, ", version=");
        f.append(str5);
        f.append(", factors=");
        f.append(map);
        f.append(")");
        return f.toString();
    }
}
