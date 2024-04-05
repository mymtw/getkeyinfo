package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ValidateAddress {
    @C18417a("success")
    private final Boolean success;

    public ValidateAddress(Boolean bool) {
        this.success = bool;
    }

    public static /* synthetic */ ValidateAddress copy$default(ValidateAddress validateAddress, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = validateAddress.success;
        }
        return validateAddress.copy(bool);
    }

    public final Boolean component1() {
        return this.success;
    }

    public final ValidateAddress copy(Boolean bool) {
        return new ValidateAddress(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidateAddress) && C19383o.m32792b(this.success, ((ValidateAddress) obj).success);
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        Boolean bool = this.success;
        return "ValidateAddress(success=" + bool + ")";
    }
}
