package com.paypal.pyplcheckout.addressvalidation.response;

import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class AddressParts {
    private final List<AddressPart> parts;

    public AddressParts(List<AddressPart> list) {
        C19383o.m32797g(list, "parts");
        this.parts = list;
    }

    public static /* synthetic */ AddressParts copy$default(AddressParts addressParts, List<AddressPart> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addressParts.parts;
        }
        return addressParts.copy(list);
    }

    public final List<AddressPart> component1() {
        return this.parts;
    }

    public final AddressParts copy(List<AddressPart> list) {
        C19383o.m32797g(list, "parts");
        return new AddressParts(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressParts) && C19383o.m32792b(this.parts, ((AddressParts) obj).parts);
    }

    public final List<AddressPart> getParts() {
        return this.parts;
    }

    public int hashCode() {
        return this.parts.hashCode();
    }

    public String toString() {
        List<AddressPart> list = this.parts;
        return "AddressParts(parts=" + list + ")";
    }
}
