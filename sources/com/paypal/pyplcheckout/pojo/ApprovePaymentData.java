package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ApprovePaymentData {
    @C18417a("approveMemberPayment")
    private final ApprovePayment approvePayment;

    public ApprovePaymentData(ApprovePayment approvePayment2) {
        this.approvePayment = approvePayment2;
    }

    public static /* synthetic */ ApprovePaymentData copy$default(ApprovePaymentData approvePaymentData, ApprovePayment approvePayment2, int i, Object obj) {
        if ((i & 1) != 0) {
            approvePayment2 = approvePaymentData.approvePayment;
        }
        return approvePaymentData.copy(approvePayment2);
    }

    public final ApprovePayment component1() {
        return this.approvePayment;
    }

    public final ApprovePaymentData copy(ApprovePayment approvePayment2) {
        return new ApprovePaymentData(approvePayment2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApprovePaymentData) && C19383o.m32792b(this.approvePayment, ((ApprovePaymentData) obj).approvePayment);
    }

    public final ApprovePayment getApprovePayment() {
        return this.approvePayment;
    }

    public int hashCode() {
        ApprovePayment approvePayment2 = this.approvePayment;
        if (approvePayment2 == null) {
            return 0;
        }
        return approvePayment2.hashCode();
    }

    public String toString() {
        ApprovePayment approvePayment2 = this.approvePayment;
        return "ApprovePaymentData(approvePayment=" + approvePayment2 + ")";
    }
}
