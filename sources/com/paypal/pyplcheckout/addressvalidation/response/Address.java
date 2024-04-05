package com.paypal.pyplcheckout.addressvalidation.response;

import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class Address {
    private final List<AddressParts> portableLayout;

    public Address(List<AddressParts> list) {
        C19383o.m32797g(list, "portableLayout");
        this.portableLayout = list;
    }

    public static /* synthetic */ Address copy$default(Address address, List<AddressParts> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = address.portableLayout;
        }
        return address.copy(list);
    }

    public final List<AddressParts> component1() {
        return this.portableLayout;
    }

    public final Address copy(List<AddressParts> list) {
        C19383o.m32797g(list, "portableLayout");
        return new Address(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Address) && C19383o.m32792b(this.portableLayout, ((Address) obj).portableLayout);
    }

    public final List<AddressParts> getPortableLayout() {
        return this.portableLayout;
    }

    public int hashCode() {
        return this.portableLayout.hashCode();
    }

    public String toString() {
        List<AddressParts> list = this.portableLayout;
        return "Address(portableLayout=" + list + ")";
    }
}
