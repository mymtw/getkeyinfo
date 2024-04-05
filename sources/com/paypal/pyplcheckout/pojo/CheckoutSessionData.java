package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class CheckoutSessionData {
    @C18417a("checkoutSession")
    private final CheckoutSession checkoutSession;

    public CheckoutSessionData(CheckoutSession checkoutSession2) {
        this.checkoutSession = checkoutSession2;
    }

    public static /* synthetic */ CheckoutSessionData copy$default(CheckoutSessionData checkoutSessionData, CheckoutSession checkoutSession2, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutSession2 = checkoutSessionData.checkoutSession;
        }
        return checkoutSessionData.copy(checkoutSession2);
    }

    public final CheckoutSession component1() {
        return this.checkoutSession;
    }

    public final CheckoutSessionData copy(CheckoutSession checkoutSession2) {
        return new CheckoutSessionData(checkoutSession2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutSessionData) && C19383o.m32792b(this.checkoutSession, ((CheckoutSessionData) obj).checkoutSession);
    }

    public final CheckoutSession getCheckoutSession() {
        return this.checkoutSession;
    }

    public int hashCode() {
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null) {
            return 0;
        }
        return checkoutSession2.hashCode();
    }

    public String toString() {
        CheckoutSession checkoutSession2 = this.checkoutSession;
        return "CheckoutSessionData(checkoutSession=" + checkoutSession2 + ")";
    }
}
