package com.paypal.checkout.fundingeligibility;

import kotlin.jvm.internal.C19383o;

public final class FundingEligibilityItems {
    private final FundingEligibilityItem credit;
    private final FundingEligibilityItem paylater;
    private final FundingEligibilityItem paypal;

    public FundingEligibilityItems(FundingEligibilityItem fundingEligibilityItem, FundingEligibilityItem fundingEligibilityItem2, FundingEligibilityItem fundingEligibilityItem3) {
        C19383o.m32797g(fundingEligibilityItem, "paypal");
        C19383o.m32797g(fundingEligibilityItem2, "credit");
        C19383o.m32797g(fundingEligibilityItem3, "paylater");
        this.paypal = fundingEligibilityItem;
        this.credit = fundingEligibilityItem2;
        this.paylater = fundingEligibilityItem3;
    }

    public static /* synthetic */ FundingEligibilityItems copy$default(FundingEligibilityItems fundingEligibilityItems, FundingEligibilityItem fundingEligibilityItem, FundingEligibilityItem fundingEligibilityItem2, FundingEligibilityItem fundingEligibilityItem3, int i, Object obj) {
        if ((i & 1) != 0) {
            fundingEligibilityItem = fundingEligibilityItems.paypal;
        }
        if ((i & 2) != 0) {
            fundingEligibilityItem2 = fundingEligibilityItems.credit;
        }
        if ((i & 4) != 0) {
            fundingEligibilityItem3 = fundingEligibilityItems.paylater;
        }
        return fundingEligibilityItems.copy(fundingEligibilityItem, fundingEligibilityItem2, fundingEligibilityItem3);
    }

    public final FundingEligibilityItem component1() {
        return this.paypal;
    }

    public final FundingEligibilityItem component2() {
        return this.credit;
    }

    public final FundingEligibilityItem component3() {
        return this.paylater;
    }

    public final FundingEligibilityItems copy(FundingEligibilityItem fundingEligibilityItem, FundingEligibilityItem fundingEligibilityItem2, FundingEligibilityItem fundingEligibilityItem3) {
        C19383o.m32797g(fundingEligibilityItem, "paypal");
        C19383o.m32797g(fundingEligibilityItem2, "credit");
        C19383o.m32797g(fundingEligibilityItem3, "paylater");
        return new FundingEligibilityItems(fundingEligibilityItem, fundingEligibilityItem2, fundingEligibilityItem3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingEligibilityItems)) {
            return false;
        }
        FundingEligibilityItems fundingEligibilityItems = (FundingEligibilityItems) obj;
        return C19383o.m32792b(this.paypal, fundingEligibilityItems.paypal) && C19383o.m32792b(this.credit, fundingEligibilityItems.credit) && C19383o.m32792b(this.paylater, fundingEligibilityItems.paylater);
    }

    public final FundingEligibilityItem getCredit() {
        return this.credit;
    }

    public final FundingEligibilityItem getPaylater() {
        return this.paylater;
    }

    public final FundingEligibilityItem getPaypal() {
        return this.paypal;
    }

    public int hashCode() {
        int hashCode = this.credit.hashCode();
        return this.paylater.hashCode() + ((hashCode + (this.paypal.hashCode() * 31)) * 31);
    }

    public String toString() {
        FundingEligibilityItem fundingEligibilityItem = this.paypal;
        FundingEligibilityItem fundingEligibilityItem2 = this.credit;
        FundingEligibilityItem fundingEligibilityItem3 = this.paylater;
        return "FundingEligibilityItems(paypal=" + fundingEligibilityItem + ", credit=" + fundingEligibilityItem2 + ", paylater=" + fundingEligibilityItem3 + ")";
    }
}
