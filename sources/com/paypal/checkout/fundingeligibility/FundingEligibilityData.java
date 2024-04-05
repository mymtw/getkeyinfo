package com.paypal.checkout.fundingeligibility;

import kotlin.jvm.internal.C19383o;

public final class FundingEligibilityData {
    private final FundingEligibilityItems fundingEligibility;

    public FundingEligibilityData(FundingEligibilityItems fundingEligibilityItems) {
        C19383o.m32797g(fundingEligibilityItems, "fundingEligibility");
        this.fundingEligibility = fundingEligibilityItems;
    }

    public static /* synthetic */ FundingEligibilityData copy$default(FundingEligibilityData fundingEligibilityData, FundingEligibilityItems fundingEligibilityItems, int i, Object obj) {
        if ((i & 1) != 0) {
            fundingEligibilityItems = fundingEligibilityData.fundingEligibility;
        }
        return fundingEligibilityData.copy(fundingEligibilityItems);
    }

    public final FundingEligibilityItems component1() {
        return this.fundingEligibility;
    }

    public final FundingEligibilityData copy(FundingEligibilityItems fundingEligibilityItems) {
        C19383o.m32797g(fundingEligibilityItems, "fundingEligibility");
        return new FundingEligibilityData(fundingEligibilityItems);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FundingEligibilityData) && C19383o.m32792b(this.fundingEligibility, ((FundingEligibilityData) obj).fundingEligibility);
    }

    public final FundingEligibilityItems getFundingEligibility() {
        return this.fundingEligibility;
    }

    public int hashCode() {
        return this.fundingEligibility.hashCode();
    }

    public String toString() {
        FundingEligibilityItems fundingEligibilityItems = this.fundingEligibility;
        return "FundingEligibilityData(fundingEligibility=" + fundingEligibilityItems + ")";
    }
}
