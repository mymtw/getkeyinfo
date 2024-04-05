package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDsResolution {
    @C18417a("contingencyContext")
    private final ThreeDSContingencyContext contingencyContext;
    @C18417a("paymentCard")
    private final ThreeDSPaymentCardData paymentCard;
    @C18417a("resolutionName")
    private final String resolutionName;
    @C18417a("type")
    private final String type;

    public ThreeDsResolution(String str, String str2, ThreeDSPaymentCardData threeDSPaymentCardData, ThreeDSContingencyContext threeDSContingencyContext) {
        this.type = str;
        this.resolutionName = str2;
        this.paymentCard = threeDSPaymentCardData;
        this.contingencyContext = threeDSContingencyContext;
    }

    public static /* synthetic */ ThreeDsResolution copy$default(ThreeDsResolution threeDsResolution, String str, String str2, ThreeDSPaymentCardData threeDSPaymentCardData, ThreeDSContingencyContext threeDSContingencyContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threeDsResolution.type;
        }
        if ((i & 2) != 0) {
            str2 = threeDsResolution.resolutionName;
        }
        if ((i & 4) != 0) {
            threeDSPaymentCardData = threeDsResolution.paymentCard;
        }
        if ((i & 8) != 0) {
            threeDSContingencyContext = threeDsResolution.contingencyContext;
        }
        return threeDsResolution.copy(str, str2, threeDSPaymentCardData, threeDSContingencyContext);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.resolutionName;
    }

    public final ThreeDSPaymentCardData component3() {
        return this.paymentCard;
    }

    public final ThreeDSContingencyContext component4() {
        return this.contingencyContext;
    }

    public final ThreeDsResolution copy(String str, String str2, ThreeDSPaymentCardData threeDSPaymentCardData, ThreeDSContingencyContext threeDSContingencyContext) {
        return new ThreeDsResolution(str, str2, threeDSPaymentCardData, threeDSContingencyContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDsResolution)) {
            return false;
        }
        ThreeDsResolution threeDsResolution = (ThreeDsResolution) obj;
        return C19383o.m32792b(this.type, threeDsResolution.type) && C19383o.m32792b(this.resolutionName, threeDsResolution.resolutionName) && C19383o.m32792b(this.paymentCard, threeDsResolution.paymentCard) && C19383o.m32792b(this.contingencyContext, threeDsResolution.contingencyContext);
    }

    public final ThreeDSContingencyContext getContingencyContext() {
        return this.contingencyContext;
    }

    public final ThreeDSPaymentCardData getPaymentCard() {
        return this.paymentCard;
    }

    public final String getResolutionName() {
        return this.resolutionName;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resolutionName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThreeDSPaymentCardData threeDSPaymentCardData = this.paymentCard;
        int hashCode3 = (hashCode2 + (threeDSPaymentCardData == null ? 0 : threeDSPaymentCardData.hashCode())) * 31;
        ThreeDSContingencyContext threeDSContingencyContext = this.contingencyContext;
        if (threeDSContingencyContext != null) {
            i = threeDSContingencyContext.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.resolutionName;
        ThreeDSPaymentCardData threeDSPaymentCardData = this.paymentCard;
        ThreeDSContingencyContext threeDSContingencyContext = this.contingencyContext;
        StringBuilder f = C0388a.m1050f("ThreeDsResolution(type=", str, ", resolutionName=", str2, ", paymentCard=");
        f.append(threeDSPaymentCardData);
        f.append(", contingencyContext=");
        f.append(threeDSContingencyContext);
        f.append(")");
        return f.toString();
    }
}
