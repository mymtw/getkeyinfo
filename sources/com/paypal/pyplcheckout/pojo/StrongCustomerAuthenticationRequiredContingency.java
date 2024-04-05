package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class StrongCustomerAuthenticationRequiredContingency {
    @C18417a("contextId")
    private final String contextId;

    public StrongCustomerAuthenticationRequiredContingency(String str) {
        C19383o.m32797g(str, "contextId");
        this.contextId = str;
    }

    public static /* synthetic */ StrongCustomerAuthenticationRequiredContingency copy$default(StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequiredContingency, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strongCustomerAuthenticationRequiredContingency.contextId;
        }
        return strongCustomerAuthenticationRequiredContingency.copy(str);
    }

    public final String component1() {
        return this.contextId;
    }

    public final StrongCustomerAuthenticationRequiredContingency copy(String str) {
        C19383o.m32797g(str, "contextId");
        return new StrongCustomerAuthenticationRequiredContingency(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StrongCustomerAuthenticationRequiredContingency) && C19383o.m32792b(this.contextId, ((StrongCustomerAuthenticationRequiredContingency) obj).contextId);
    }

    public final String getContextId() {
        return this.contextId;
    }

    public int hashCode() {
        return this.contextId.hashCode();
    }

    public String toString() {
        return C0048b.m163a("StrongCustomerAuthenticationRequiredContingency(contextId=", this.contextId, ")");
    }
}
