package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class EligibilityData {
    @C18417a("mobileSDKEligibility")
    private final MobileSdkEligibility mobileSDKEligibility;

    public EligibilityData(MobileSdkEligibility mobileSdkEligibility) {
        this.mobileSDKEligibility = mobileSdkEligibility;
    }

    public static /* synthetic */ EligibilityData copy$default(EligibilityData eligibilityData, MobileSdkEligibility mobileSdkEligibility, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileSdkEligibility = eligibilityData.mobileSDKEligibility;
        }
        return eligibilityData.copy(mobileSdkEligibility);
    }

    public final MobileSdkEligibility component1() {
        return this.mobileSDKEligibility;
    }

    public final EligibilityData copy(MobileSdkEligibility mobileSdkEligibility) {
        return new EligibilityData(mobileSdkEligibility);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EligibilityData) && C19383o.m32792b(this.mobileSDKEligibility, ((EligibilityData) obj).mobileSDKEligibility);
    }

    public final MobileSdkEligibility getMobileSDKEligibility() {
        return this.mobileSDKEligibility;
    }

    public int hashCode() {
        MobileSdkEligibility mobileSdkEligibility = this.mobileSDKEligibility;
        if (mobileSdkEligibility == null) {
            return 0;
        }
        return mobileSdkEligibility.hashCode();
    }

    public String toString() {
        MobileSdkEligibility mobileSdkEligibility = this.mobileSDKEligibility;
        return "EligibilityData(mobileSDKEligibility=" + mobileSdkEligibility + ")";
    }
}
