package com.paypal.pyplcheckout.pojo;

import androidx.appcompat.widget.C0326j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddressValidationResponse {
    @C18417a("data")
    private final AddressValidationData data;
    @C18417a("errors")
    private final List<Error> errors;
    @C18417a("extensions")
    private final Extensions extensions;

    public AddressValidationResponse(AddressValidationData addressValidationData, Extensions extensions2, List<Error> list) {
        this.data = addressValidationData;
        this.extensions = extensions2;
        this.errors = list;
    }

    public static /* synthetic */ AddressValidationResponse copy$default(AddressValidationResponse addressValidationResponse, AddressValidationData addressValidationData, Extensions extensions2, List<Error> list, int i, Object obj) {
        if ((i & 1) != 0) {
            addressValidationData = addressValidationResponse.data;
        }
        if ((i & 2) != 0) {
            extensions2 = addressValidationResponse.extensions;
        }
        if ((i & 4) != 0) {
            list = addressValidationResponse.errors;
        }
        return addressValidationResponse.copy(addressValidationData, extensions2, list);
    }

    public final AddressValidationData component1() {
        return this.data;
    }

    public final Extensions component2() {
        return this.extensions;
    }

    public final List<Error> component3() {
        return this.errors;
    }

    public final AddressValidationResponse copy(AddressValidationData addressValidationData, Extensions extensions2, List<Error> list) {
        return new AddressValidationResponse(addressValidationData, extensions2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressValidationResponse)) {
            return false;
        }
        AddressValidationResponse addressValidationResponse = (AddressValidationResponse) obj;
        return C19383o.m32792b(this.data, addressValidationResponse.data) && C19383o.m32792b(this.extensions, addressValidationResponse.extensions) && C19383o.m32792b(this.errors, addressValidationResponse.errors);
    }

    public final AddressValidationData getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final Extensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        AddressValidationData addressValidationData = this.data;
        int i = 0;
        int hashCode = (addressValidationData == null ? 0 : addressValidationData.hashCode()) * 31;
        Extensions extensions2 = this.extensions;
        int hashCode2 = (hashCode + (extensions2 == null ? 0 : extensions2.hashCode())) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        AddressValidationData addressValidationData = this.data;
        Extensions extensions2 = this.extensions;
        List<Error> list = this.errors;
        StringBuilder sb = new StringBuilder();
        sb.append("AddressValidationResponse(data=");
        sb.append(addressValidationData);
        sb.append(", extensions=");
        sb.append(extensions2);
        sb.append(", errors=");
        return C0326j.m865j(sb, list, ")");
    }
}
