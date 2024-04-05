package com.paypal.checkout.fundingeligibility;

import com.paypal.pyplcheckout.pojo.Error;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class FundingEligibilityResponse {
    private final FundingEligibilityData data;
    private final List<Error> error;

    public FundingEligibilityResponse(FundingEligibilityData fundingEligibilityData, List<Error> list) {
        this.data = fundingEligibilityData;
        this.error = list;
    }

    public static /* synthetic */ FundingEligibilityResponse copy$default(FundingEligibilityResponse fundingEligibilityResponse, FundingEligibilityData fundingEligibilityData, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            fundingEligibilityData = fundingEligibilityResponse.data;
        }
        if ((i & 2) != 0) {
            list = fundingEligibilityResponse.error;
        }
        return fundingEligibilityResponse.copy(fundingEligibilityData, list);
    }

    public final FundingEligibilityData component1() {
        return this.data;
    }

    public final List<Error> component2() {
        return this.error;
    }

    public final FundingEligibilityResponse copy(FundingEligibilityData fundingEligibilityData, List<Error> list) {
        return new FundingEligibilityResponse(fundingEligibilityData, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingEligibilityResponse)) {
            return false;
        }
        FundingEligibilityResponse fundingEligibilityResponse = (FundingEligibilityResponse) obj;
        return C19383o.m32792b(this.data, fundingEligibilityResponse.data) && C19383o.m32792b(this.error, fundingEligibilityResponse.error);
    }

    public final FundingEligibilityData getData() {
        return this.data;
    }

    public final List<Error> getError() {
        return this.error;
    }

    public int hashCode() {
        FundingEligibilityData fundingEligibilityData = this.data;
        int i = 0;
        int hashCode = (fundingEligibilityData == null ? 0 : fundingEligibilityData.hashCode()) * 31;
        List<Error> list = this.error;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        FundingEligibilityData fundingEligibilityData = this.data;
        List<Error> list = this.error;
        return "FundingEligibilityResponse(data=" + fundingEligibilityData + ", error=" + list + ")";
    }
}
