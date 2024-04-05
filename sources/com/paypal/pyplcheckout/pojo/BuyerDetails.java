package com.paypal.pyplcheckout.pojo;

import p650pn.C18417a;

public final class BuyerDetails {
    @C18417a("eligibleToHoldBalance")
    private final boolean eligibleToHoldBalance;

    public BuyerDetails(boolean z) {
        this.eligibleToHoldBalance = z;
    }

    public static /* synthetic */ BuyerDetails copy$default(BuyerDetails buyerDetails, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = buyerDetails.eligibleToHoldBalance;
        }
        return buyerDetails.copy(z);
    }

    public final boolean component1() {
        return this.eligibleToHoldBalance;
    }

    public final BuyerDetails copy(boolean z) {
        return new BuyerDetails(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuyerDetails) && this.eligibleToHoldBalance == ((BuyerDetails) obj).eligibleToHoldBalance;
    }

    public final boolean getEligibleToHoldBalance() {
        return this.eligibleToHoldBalance;
    }

    public int hashCode() {
        boolean z = this.eligibleToHoldBalance;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.eligibleToHoldBalance;
        return "BuyerDetails(eligibleToHoldBalance=" + z + ")";
    }
}
