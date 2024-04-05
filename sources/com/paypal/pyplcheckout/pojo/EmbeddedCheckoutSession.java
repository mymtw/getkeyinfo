package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class EmbeddedCheckoutSession {
    @C18417a("addShippingAddress")
    private final CheckoutSession checkoutSession;

    public EmbeddedCheckoutSession(CheckoutSession checkoutSession2) {
        C19383o.m32797g(checkoutSession2, "checkoutSession");
        this.checkoutSession = checkoutSession2;
    }

    public static /* synthetic */ EmbeddedCheckoutSession copy$default(EmbeddedCheckoutSession embeddedCheckoutSession, CheckoutSession checkoutSession2, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutSession2 = embeddedCheckoutSession.checkoutSession;
        }
        return embeddedCheckoutSession.copy(checkoutSession2);
    }

    public final CheckoutSession component1() {
        return this.checkoutSession;
    }

    public final EmbeddedCheckoutSession copy(CheckoutSession checkoutSession2) {
        C19383o.m32797g(checkoutSession2, "checkoutSession");
        return new EmbeddedCheckoutSession(checkoutSession2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmbeddedCheckoutSession) && C19383o.m32792b(this.checkoutSession, ((EmbeddedCheckoutSession) obj).checkoutSession);
    }

    public final CheckoutSession getCheckoutSession() {
        return this.checkoutSession;
    }

    public int hashCode() {
        return this.checkoutSession.hashCode();
    }

    public String toString() {
        CheckoutSession checkoutSession2 = this.checkoutSession;
        return "EmbeddedCheckoutSession(checkoutSession=" + checkoutSession2 + ")";
    }
}
