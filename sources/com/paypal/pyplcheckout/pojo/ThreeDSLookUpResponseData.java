package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSLookUpResponseData {
    @C18417a("threeDSLookUp")
    private final ThreeDSLookUp threeDSLookUp;

    public ThreeDSLookUpResponseData(ThreeDSLookUp threeDSLookUp2) {
        this.threeDSLookUp = threeDSLookUp2;
    }

    public static /* synthetic */ ThreeDSLookUpResponseData copy$default(ThreeDSLookUpResponseData threeDSLookUpResponseData, ThreeDSLookUp threeDSLookUp2, int i, Object obj) {
        if ((i & 1) != 0) {
            threeDSLookUp2 = threeDSLookUpResponseData.threeDSLookUp;
        }
        return threeDSLookUpResponseData.copy(threeDSLookUp2);
    }

    public final ThreeDSLookUp component1() {
        return this.threeDSLookUp;
    }

    public final ThreeDSLookUpResponseData copy(ThreeDSLookUp threeDSLookUp2) {
        return new ThreeDSLookUpResponseData(threeDSLookUp2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDSLookUpResponseData) && C19383o.m32792b(this.threeDSLookUp, ((ThreeDSLookUpResponseData) obj).threeDSLookUp);
    }

    public final ThreeDSLookUp getThreeDSLookUp() {
        return this.threeDSLookUp;
    }

    public int hashCode() {
        ThreeDSLookUp threeDSLookUp2 = this.threeDSLookUp;
        if (threeDSLookUp2 == null) {
            return 0;
        }
        return threeDSLookUp2.hashCode();
    }

    public String toString() {
        ThreeDSLookUp threeDSLookUp2 = this.threeDSLookUp;
        return "ThreeDSLookUpResponseData(threeDSLookUp=" + threeDSLookUp2 + ")";
    }
}
