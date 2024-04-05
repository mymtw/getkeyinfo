package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ValidateAddressResponse {
    @C18417a("data")
    private final ValidateAddressData data;
    @C18417a("errors")
    private final List<ValidateAddressError> errors;
    @C18417a("extensions")
    private final Extensions extensions;

    public ValidateAddressResponse(ValidateAddressData validateAddressData, List<ValidateAddressError> list, Extensions extensions2) {
        this.data = validateAddressData;
        this.errors = list;
        this.extensions = extensions2;
    }

    public static /* synthetic */ ValidateAddressResponse copy$default(ValidateAddressResponse validateAddressResponse, ValidateAddressData validateAddressData, List<ValidateAddressError> list, Extensions extensions2, int i, Object obj) {
        if ((i & 1) != 0) {
            validateAddressData = validateAddressResponse.data;
        }
        if ((i & 2) != 0) {
            list = validateAddressResponse.errors;
        }
        if ((i & 4) != 0) {
            extensions2 = validateAddressResponse.extensions;
        }
        return validateAddressResponse.copy(validateAddressData, list, extensions2);
    }

    public final ValidateAddressData component1() {
        return this.data;
    }

    public final List<ValidateAddressError> component2() {
        return this.errors;
    }

    public final Extensions component3() {
        return this.extensions;
    }

    public final ValidateAddressResponse copy(ValidateAddressData validateAddressData, List<ValidateAddressError> list, Extensions extensions2) {
        return new ValidateAddressResponse(validateAddressData, list, extensions2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateAddressResponse)) {
            return false;
        }
        ValidateAddressResponse validateAddressResponse = (ValidateAddressResponse) obj;
        return C19383o.m32792b(this.data, validateAddressResponse.data) && C19383o.m32792b(this.errors, validateAddressResponse.errors) && C19383o.m32792b(this.extensions, validateAddressResponse.extensions);
    }

    public final ValidateAddressData getData() {
        return this.data;
    }

    public final List<ValidateAddressError> getErrors() {
        return this.errors;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        ValidateAddressData validateAddressData = this.data;
        int i = 0;
        int hashCode = (validateAddressData == null ? 0 : validateAddressData.hashCode()) * 31;
        List<ValidateAddressError> list = this.errors;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Extensions extensions2 = this.extensions;
        if (extensions2 != null) {
            i = extensions2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        ValidateAddressData validateAddressData = this.data;
        List<ValidateAddressError> list = this.errors;
        Extensions extensions2 = this.extensions;
        return "ValidateAddressResponse(data=" + validateAddressData + ", errors=" + list + ", extensions=" + extensions2 + ")";
    }
}
