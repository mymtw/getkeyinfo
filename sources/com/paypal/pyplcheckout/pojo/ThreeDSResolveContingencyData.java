package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSResolveContingencyData {
    @C18417a("resolveThreeDsContingency")
    private final CheckoutSession resolveThreeDsContingency;

    public ThreeDSResolveContingencyData(CheckoutSession checkoutSession) {
        this.resolveThreeDsContingency = checkoutSession;
    }

    public static /* synthetic */ ThreeDSResolveContingencyData copy$default(ThreeDSResolveContingencyData threeDSResolveContingencyData, CheckoutSession checkoutSession, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutSession = threeDSResolveContingencyData.resolveThreeDsContingency;
        }
        return threeDSResolveContingencyData.copy(checkoutSession);
    }

    public final CheckoutSession component1() {
        return this.resolveThreeDsContingency;
    }

    public final ThreeDSResolveContingencyData copy(CheckoutSession checkoutSession) {
        return new ThreeDSResolveContingencyData(checkoutSession);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDSResolveContingencyData) && C19383o.m32792b(this.resolveThreeDsContingency, ((ThreeDSResolveContingencyData) obj).resolveThreeDsContingency);
    }

    public final CheckoutSession getResolveThreeDsContingency() {
        return this.resolveThreeDsContingency;
    }

    public int hashCode() {
        CheckoutSession checkoutSession = this.resolveThreeDsContingency;
        if (checkoutSession == null) {
            return 0;
        }
        return checkoutSession.hashCode();
    }

    public String toString() {
        CheckoutSession checkoutSession = this.resolveThreeDsContingency;
        return "ThreeDSResolveContingencyData(resolveThreeDsContingency=" + checkoutSession + ")";
    }
}
