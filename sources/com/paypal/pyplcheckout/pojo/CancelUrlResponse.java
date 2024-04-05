package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class CancelUrlResponse {
    @C18417a("data")
    private final CheckoutSessionData data;
    @C18417a("extensions")
    private final Extensions extensions;

    public CancelUrlResponse(CheckoutSessionData checkoutSessionData, Extensions extensions2) {
        this.data = checkoutSessionData;
        this.extensions = extensions2;
    }

    public static /* synthetic */ CancelUrlResponse copy$default(CancelUrlResponse cancelUrlResponse, CheckoutSessionData checkoutSessionData, Extensions extensions2, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutSessionData = cancelUrlResponse.data;
        }
        if ((i & 2) != 0) {
            extensions2 = cancelUrlResponse.extensions;
        }
        return cancelUrlResponse.copy(checkoutSessionData, extensions2);
    }

    public final CheckoutSessionData component1() {
        return this.data;
    }

    public final Extensions component2() {
        return this.extensions;
    }

    public final CancelUrlResponse copy(CheckoutSessionData checkoutSessionData, Extensions extensions2) {
        return new CancelUrlResponse(checkoutSessionData, extensions2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelUrlResponse)) {
            return false;
        }
        CancelUrlResponse cancelUrlResponse = (CancelUrlResponse) obj;
        return C19383o.m32792b(this.data, cancelUrlResponse.data) && C19383o.m32792b(this.extensions, cancelUrlResponse.extensions);
    }

    public final CheckoutSessionData getData() {
        return this.data;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        CheckoutSessionData checkoutSessionData = this.data;
        int i = 0;
        int hashCode = (checkoutSessionData == null ? 0 : checkoutSessionData.hashCode()) * 31;
        Extensions extensions2 = this.extensions;
        if (extensions2 != null) {
            i = extensions2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        CheckoutSessionData checkoutSessionData = this.data;
        Extensions extensions2 = this.extensions;
        return "CancelUrlResponse(data=" + checkoutSessionData + ", extensions=" + extensions2 + ")";
    }
}
