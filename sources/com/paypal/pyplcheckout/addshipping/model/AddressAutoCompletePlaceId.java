package com.paypal.pyplcheckout.addshipping.model;

import kotlin.jvm.internal.C19383o;

public final class AddressAutoCompletePlaceId {
    private final Address address;

    public AddressAutoCompletePlaceId(Address address2) {
        C19383o.m32797g(address2, "address");
        this.address = address2;
    }

    public static /* synthetic */ AddressAutoCompletePlaceId copy$default(AddressAutoCompletePlaceId addressAutoCompletePlaceId, Address address2, int i, Object obj) {
        if ((i & 1) != 0) {
            address2 = addressAutoCompletePlaceId.address;
        }
        return addressAutoCompletePlaceId.copy(address2);
    }

    public final Address component1() {
        return this.address;
    }

    public final AddressAutoCompletePlaceId copy(Address address2) {
        C19383o.m32797g(address2, "address");
        return new AddressAutoCompletePlaceId(address2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressAutoCompletePlaceId) && C19383o.m32792b(this.address, ((AddressAutoCompletePlaceId) obj).address);
    }

    public final Address getAddress() {
        return this.address;
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    public String toString() {
        Address address2 = this.address;
        return "AddressAutoCompletePlaceId(address=" + address2 + ")";
    }
}
