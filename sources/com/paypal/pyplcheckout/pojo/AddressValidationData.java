package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddressValidationData {
    @C18417a("addressValidation")
    private final AddressValidation addressValidation;

    public AddressValidationData(AddressValidation addressValidation2) {
        this.addressValidation = addressValidation2;
    }

    public static /* synthetic */ AddressValidationData copy$default(AddressValidationData addressValidationData, AddressValidation addressValidation2, int i, Object obj) {
        if ((i & 1) != 0) {
            addressValidation2 = addressValidationData.addressValidation;
        }
        return addressValidationData.copy(addressValidation2);
    }

    public final AddressValidation component1() {
        return this.addressValidation;
    }

    public final AddressValidationData copy(AddressValidation addressValidation2) {
        return new AddressValidationData(addressValidation2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressValidationData) && C19383o.m32792b(this.addressValidation, ((AddressValidationData) obj).addressValidation);
    }

    public final AddressValidation getAddressValidation() {
        return this.addressValidation;
    }

    public int hashCode() {
        AddressValidation addressValidation2 = this.addressValidation;
        if (addressValidation2 == null) {
            return 0;
        }
        return addressValidation2.hashCode();
    }

    public String toString() {
        AddressValidation addressValidation2 = this.addressValidation;
        return "AddressValidationData(addressValidation=" + addressValidation2 + ")";
    }
}
