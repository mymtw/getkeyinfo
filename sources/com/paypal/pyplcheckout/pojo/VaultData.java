package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class VaultData {
    @C18417a("approvalSessionID")
    private final String approvalSessionID;
    @C18417a("approvalTokenID")
    private final String approvalTokenID;

    public VaultData(String str, String str2) {
        C19383o.m32797g(str, "approvalSessionID");
        C19383o.m32797g(str2, "approvalTokenID");
        this.approvalSessionID = str;
        this.approvalTokenID = str2;
    }

    public static /* synthetic */ VaultData copy$default(VaultData vaultData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vaultData.approvalSessionID;
        }
        if ((i & 2) != 0) {
            str2 = vaultData.approvalTokenID;
        }
        return vaultData.copy(str, str2);
    }

    public final String component1() {
        return this.approvalSessionID;
    }

    public final String component2() {
        return this.approvalTokenID;
    }

    public final VaultData copy(String str, String str2) {
        C19383o.m32797g(str, "approvalSessionID");
        C19383o.m32797g(str2, "approvalTokenID");
        return new VaultData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultData)) {
            return false;
        }
        VaultData vaultData = (VaultData) obj;
        return C19383o.m32792b(this.approvalSessionID, vaultData.approvalSessionID) && C19383o.m32792b(this.approvalTokenID, vaultData.approvalTokenID);
    }

    public final String getApprovalSessionID() {
        return this.approvalSessionID;
    }

    public final String getApprovalTokenID() {
        return this.approvalTokenID;
    }

    public int hashCode() {
        return this.approvalTokenID.hashCode() + (this.approvalSessionID.hashCode() * 31);
    }

    public String toString() {
        return C0048b.m164c("VaultData(approvalSessionID=", this.approvalSessionID, ", approvalTokenID=", this.approvalTokenID, ")");
    }
}
