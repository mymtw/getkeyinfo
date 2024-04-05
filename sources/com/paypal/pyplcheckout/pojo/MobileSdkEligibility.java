package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class MobileSdkEligibility {
    @C18417a("paypal")
    private final Eligibility paypal;
    @C18417a("venmo")
    private final Eligibility venmo;

    public MobileSdkEligibility(Eligibility eligibility, Eligibility eligibility2) {
        this.paypal = eligibility;
        this.venmo = eligibility2;
    }

    public static /* synthetic */ MobileSdkEligibility copy$default(MobileSdkEligibility mobileSdkEligibility, Eligibility eligibility, Eligibility eligibility2, int i, Object obj) {
        if ((i & 1) != 0) {
            eligibility = mobileSdkEligibility.paypal;
        }
        if ((i & 2) != 0) {
            eligibility2 = mobileSdkEligibility.venmo;
        }
        return mobileSdkEligibility.copy(eligibility, eligibility2);
    }

    public final Eligibility component1() {
        return this.paypal;
    }

    public final Eligibility component2() {
        return this.venmo;
    }

    public final MobileSdkEligibility copy(Eligibility eligibility, Eligibility eligibility2) {
        return new MobileSdkEligibility(eligibility, eligibility2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileSdkEligibility)) {
            return false;
        }
        MobileSdkEligibility mobileSdkEligibility = (MobileSdkEligibility) obj;
        return C19383o.m32792b(this.paypal, mobileSdkEligibility.paypal) && C19383o.m32792b(this.venmo, mobileSdkEligibility.venmo);
    }

    public final Eligibility getPaypal() {
        return this.paypal;
    }

    public final Eligibility getVenmo() {
        return this.venmo;
    }

    public int hashCode() {
        Eligibility eligibility = this.paypal;
        int i = 0;
        int hashCode = (eligibility == null ? 0 : eligibility.hashCode()) * 31;
        Eligibility eligibility2 = this.venmo;
        if (eligibility2 != null) {
            i = eligibility2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Eligibility eligibility = this.paypal;
        Eligibility eligibility2 = this.venmo;
        return "MobileSdkEligibility(paypal=" + eligibility + ", venmo=" + eligibility2 + ")";
    }
}
