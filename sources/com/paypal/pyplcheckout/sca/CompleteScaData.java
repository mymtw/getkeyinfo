package com.paypal.pyplcheckout.sca;

import com.paypal.pyplcheckout.pojo.CheckoutSession;
import kotlin.jvm.internal.C19383o;

public final class CompleteScaData {
    private final CheckoutSession completeStrongCustomerAuthentication;

    public CompleteScaData(CheckoutSession checkoutSession) {
        C19383o.m32797g(checkoutSession, "completeStrongCustomerAuthentication");
        this.completeStrongCustomerAuthentication = checkoutSession;
    }

    public static /* synthetic */ CompleteScaData copy$default(CompleteScaData completeScaData, CheckoutSession checkoutSession, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutSession = completeScaData.completeStrongCustomerAuthentication;
        }
        return completeScaData.copy(checkoutSession);
    }

    public final CheckoutSession component1() {
        return this.completeStrongCustomerAuthentication;
    }

    public final CompleteScaData copy(CheckoutSession checkoutSession) {
        C19383o.m32797g(checkoutSession, "completeStrongCustomerAuthentication");
        return new CompleteScaData(checkoutSession);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompleteScaData) && C19383o.m32792b(this.completeStrongCustomerAuthentication, ((CompleteScaData) obj).completeStrongCustomerAuthentication);
    }

    public final CheckoutSession getCompleteStrongCustomerAuthentication() {
        return this.completeStrongCustomerAuthentication;
    }

    public int hashCode() {
        return this.completeStrongCustomerAuthentication.hashCode();
    }

    public String toString() {
        CheckoutSession checkoutSession = this.completeStrongCustomerAuthentication;
        return "CompleteScaData(completeStrongCustomerAuthentication=" + checkoutSession + ")";
    }
}
