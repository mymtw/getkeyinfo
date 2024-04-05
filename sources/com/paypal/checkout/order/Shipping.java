package com.paypal.checkout.order;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Shipping {
    private final Address address;
    private final List<Options> options;

    public static final class Builder {
        private Address address;
        private List<Options> options;

        public final Builder address(Address address2) {
            this.address = address2;
            return this;
        }

        public final Shipping build() {
            return new Shipping(this.address, this.options);
        }

        public final Builder options(List<Options> list) {
            this.options = list;
            return this;
        }
    }

    public Shipping() {
        this((Address) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public Shipping(Address address2, List<Options> list) {
        this.address = address2;
        this.options = list;
    }

    public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address2, List<Options> list, int i, Object obj) {
        if ((i & 1) != 0) {
            address2 = shipping.address;
        }
        if ((i & 2) != 0) {
            list = shipping.options;
        }
        return shipping.copy(address2, list);
    }

    public final Address component1() {
        return this.address;
    }

    public final List<Options> component2() {
        return this.options;
    }

    public final Shipping copy(Address address2, List<Options> list) {
        return new Shipping(address2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shipping)) {
            return false;
        }
        Shipping shipping = (Shipping) obj;
        return C19383o.m32792b(this.address, shipping.address) && C19383o.m32792b(this.options, shipping.options);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final List<Options> getOptions() {
        return this.options;
    }

    public int hashCode() {
        Address address2 = this.address;
        int i = 0;
        int hashCode = (address2 == null ? 0 : address2.hashCode()) * 31;
        List<Options> list = this.options;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Address address2 = this.address;
        List<Options> list = this.options;
        return "Shipping(address=" + address2 + ", options=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Shipping(Address address2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : address2, (i & 2) != 0 ? null : list);
    }
}
