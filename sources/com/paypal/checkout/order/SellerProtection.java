package com.paypal.checkout.order;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class SellerProtection {
    @C18417a("dispute_categories")
    private final List<DisputeCategory> disputeCategories;
    private final SellerProtectionStatus status;

    public SellerProtection(SellerProtectionStatus sellerProtectionStatus, List<? extends DisputeCategory> list) {
        C19383o.m32797g(sellerProtectionStatus, ResponseConstants.STATUS);
        C19383o.m32797g(list, "disputeCategories");
        this.status = sellerProtectionStatus;
        this.disputeCategories = list;
    }

    public static /* synthetic */ SellerProtection copy$default(SellerProtection sellerProtection, SellerProtectionStatus sellerProtectionStatus, List<DisputeCategory> list, int i, Object obj) {
        if ((i & 1) != 0) {
            sellerProtectionStatus = sellerProtection.status;
        }
        if ((i & 2) != 0) {
            list = sellerProtection.disputeCategories;
        }
        return sellerProtection.copy(sellerProtectionStatus, list);
    }

    public final SellerProtectionStatus component1() {
        return this.status;
    }

    public final List<DisputeCategory> component2() {
        return this.disputeCategories;
    }

    public final SellerProtection copy(SellerProtectionStatus sellerProtectionStatus, List<? extends DisputeCategory> list) {
        C19383o.m32797g(sellerProtectionStatus, ResponseConstants.STATUS);
        C19383o.m32797g(list, "disputeCategories");
        return new SellerProtection(sellerProtectionStatus, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerProtection)) {
            return false;
        }
        SellerProtection sellerProtection = (SellerProtection) obj;
        return this.status == sellerProtection.status && C19383o.m32792b(this.disputeCategories, sellerProtection.disputeCategories);
    }

    public final List<DisputeCategory> getDisputeCategories() {
        return this.disputeCategories;
    }

    public final SellerProtectionStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.disputeCategories.hashCode() + (this.status.hashCode() * 31);
    }

    public String toString() {
        SellerProtectionStatus sellerProtectionStatus = this.status;
        List<DisputeCategory> list = this.disputeCategories;
        return "SellerProtection(status=" + sellerProtectionStatus + ", disputeCategories=" + list + ")";
    }
}
