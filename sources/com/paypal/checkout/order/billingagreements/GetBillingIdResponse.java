package com.paypal.checkout.order.billingagreements;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class GetBillingIdResponse {
    @C18417a("id")
    private final String billingId;
    @C18417a("state")
    private final String state;

    public GetBillingIdResponse(String str, String str2) {
        C19383o.m32797g(str, "billingId");
        C19383o.m32797g(str2, "state");
        this.billingId = str;
        this.state = str2;
    }

    public static /* synthetic */ GetBillingIdResponse copy$default(GetBillingIdResponse getBillingIdResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBillingIdResponse.billingId;
        }
        if ((i & 2) != 0) {
            str2 = getBillingIdResponse.state;
        }
        return getBillingIdResponse.copy(str, str2);
    }

    public final String component1() {
        return this.billingId;
    }

    public final String component2() {
        return this.state;
    }

    public final GetBillingIdResponse copy(String str, String str2) {
        C19383o.m32797g(str, "billingId");
        C19383o.m32797g(str2, "state");
        return new GetBillingIdResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetBillingIdResponse)) {
            return false;
        }
        GetBillingIdResponse getBillingIdResponse = (GetBillingIdResponse) obj;
        return C19383o.m32792b(this.billingId, getBillingIdResponse.billingId) && C19383o.m32792b(this.state, getBillingIdResponse.state);
    }

    public final String getBillingId() {
        return this.billingId;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode() + (this.billingId.hashCode() * 31);
    }

    public String toString() {
        return C0048b.m164c("GetBillingIdResponse(billingId=", this.billingId, ", state=", this.state, ")");
    }
}
