package com.paypal.pyplcheckout.addressvalidation.response;

import kotlin.jvm.internal.C19383o;

public final class LocaleMetadata {
    private final Address address;

    public LocaleMetadata(Address address2) {
        C19383o.m32797g(address2, "address");
        this.address = address2;
    }

    public static /* synthetic */ LocaleMetadata copy$default(LocaleMetadata localeMetadata, Address address2, int i, Object obj) {
        if ((i & 1) != 0) {
            address2 = localeMetadata.address;
        }
        return localeMetadata.copy(address2);
    }

    public final Address component1() {
        return this.address;
    }

    public final LocaleMetadata copy(Address address2) {
        C19383o.m32797g(address2, "address");
        return new LocaleMetadata(address2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleMetadata) && C19383o.m32792b(this.address, ((LocaleMetadata) obj).address);
    }

    public final Address getAddress() {
        return this.address;
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    public String toString() {
        Address address2 = this.address;
        return "LocaleMetadata(address=" + address2 + ")";
    }
}
