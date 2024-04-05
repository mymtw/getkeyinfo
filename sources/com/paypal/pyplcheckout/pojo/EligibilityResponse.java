package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class EligibilityResponse {
    @C18417a("data")
    private final EligibilityData data;

    public EligibilityResponse(EligibilityData eligibilityData) {
        this.data = eligibilityData;
    }

    public static /* synthetic */ EligibilityResponse copy$default(EligibilityResponse eligibilityResponse, EligibilityData eligibilityData, int i, Object obj) {
        if ((i & 1) != 0) {
            eligibilityData = eligibilityResponse.data;
        }
        return eligibilityResponse.copy(eligibilityData);
    }

    public final EligibilityData component1() {
        return this.data;
    }

    public final EligibilityResponse copy(EligibilityData eligibilityData) {
        return new EligibilityResponse(eligibilityData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EligibilityResponse) && C19383o.m32792b(this.data, ((EligibilityResponse) obj).data);
    }

    public final EligibilityData getData() {
        return this.data;
    }

    public int hashCode() {
        EligibilityData eligibilityData = this.data;
        if (eligibilityData == null) {
            return 0;
        }
        return eligibilityData.hashCode();
    }

    public String toString() {
        EligibilityData eligibilityData = this.data;
        return "EligibilityResponse(data=" + eligibilityData + ")";
    }
}
