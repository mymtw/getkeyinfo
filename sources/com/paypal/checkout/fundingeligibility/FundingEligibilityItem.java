package com.paypal.checkout.fundingeligibility;

import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class FundingEligibilityItem {
    private final boolean eligible;
    private final List<String> reasons;

    public FundingEligibilityItem(boolean z, List<String> list) {
        C19383o.m32797g(list, "reasons");
        this.eligible = z;
        this.reasons = list;
    }

    public static /* synthetic */ FundingEligibilityItem copy$default(FundingEligibilityItem fundingEligibilityItem, boolean z, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fundingEligibilityItem.eligible;
        }
        if ((i & 2) != 0) {
            list = fundingEligibilityItem.reasons;
        }
        return fundingEligibilityItem.copy(z, list);
    }

    public final boolean component1() {
        return this.eligible;
    }

    public final List<String> component2() {
        return this.reasons;
    }

    public final FundingEligibilityItem copy(boolean z, List<String> list) {
        C19383o.m32797g(list, "reasons");
        return new FundingEligibilityItem(z, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingEligibilityItem)) {
            return false;
        }
        FundingEligibilityItem fundingEligibilityItem = (FundingEligibilityItem) obj;
        return this.eligible == fundingEligibilityItem.eligible && C19383o.m32792b(this.reasons, fundingEligibilityItem.reasons);
    }

    public final boolean getEligible() {
        return this.eligible;
    }

    public final List<String> getReasons() {
        return this.reasons;
    }

    public int hashCode() {
        boolean z = this.eligible;
        if (z) {
            z = true;
        }
        return this.reasons.hashCode() + ((z ? 1 : 0) * true);
    }

    public String toString() {
        boolean z = this.eligible;
        List<String> list = this.reasons;
        return "FundingEligibilityItem(eligible=" + z + ", reasons=" + list + ")";
    }
}
