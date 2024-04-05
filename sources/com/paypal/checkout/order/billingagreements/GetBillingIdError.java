package com.paypal.checkout.order.billingagreements;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class GetBillingIdError {
    @C18417a("name")
    private final String errorName;
    @C18417a("message")
    private final String message;

    public GetBillingIdError(String str, String str2) {
        this.errorName = str;
        this.message = str2;
    }

    public static /* synthetic */ GetBillingIdError copy$default(GetBillingIdError getBillingIdError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBillingIdError.errorName;
        }
        if ((i & 2) != 0) {
            str2 = getBillingIdError.message;
        }
        return getBillingIdError.copy(str, str2);
    }

    public final String component1() {
        return this.errorName;
    }

    public final String component2() {
        return this.message;
    }

    public final GetBillingIdError copy(String str, String str2) {
        return new GetBillingIdError(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetBillingIdError)) {
            return false;
        }
        GetBillingIdError getBillingIdError = (GetBillingIdError) obj;
        return C19383o.m32792b(this.errorName, getBillingIdError.errorName) && C19383o.m32792b(this.message, getBillingIdError.message);
    }

    public final String getErrorName() {
        return this.errorName;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.errorName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return C0048b.m164c("GetBillingIdError(errorName=", this.errorName, ", message=", this.message, ")");
    }
}
