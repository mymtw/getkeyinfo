package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ValidateAddressData {
    @C18417a("validateAddress")
    private final ValidateAddress validateAddress;

    public ValidateAddressData(ValidateAddress validateAddress2) {
        C19383o.m32797g(validateAddress2, "validateAddress");
        this.validateAddress = validateAddress2;
    }

    public static /* synthetic */ ValidateAddressData copy$default(ValidateAddressData validateAddressData, ValidateAddress validateAddress2, int i, Object obj) {
        if ((i & 1) != 0) {
            validateAddress2 = validateAddressData.validateAddress;
        }
        return validateAddressData.copy(validateAddress2);
    }

    public final ValidateAddress component1() {
        return this.validateAddress;
    }

    public final ValidateAddressData copy(ValidateAddress validateAddress2) {
        C19383o.m32797g(validateAddress2, "validateAddress");
        return new ValidateAddressData(validateAddress2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidateAddressData) && C19383o.m32792b(this.validateAddress, ((ValidateAddressData) obj).validateAddress);
    }

    public final ValidateAddress getValidateAddress() {
        return this.validateAddress;
    }

    public int hashCode() {
        return this.validateAddress.hashCode();
    }

    public String toString() {
        ValidateAddress validateAddress2 = this.validateAddress;
        return "ValidateAddressData(validateAddress=" + validateAddress2 + ")";
    }
}
