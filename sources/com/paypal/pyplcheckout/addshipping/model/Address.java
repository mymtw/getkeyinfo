package com.paypal.pyplcheckout.addshipping.model;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;

public final class Address {
    private final String city;
    private final String fullAddress;
    private final String postalCode;
    private final String state;

    public Address(String str, String str2, String str3, String str4) {
        this.fullAddress = str;
        this.state = str2;
        this.postalCode = str3;
        this.city = str4;
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.fullAddress;
        }
        if ((i & 2) != 0) {
            str2 = address.state;
        }
        if ((i & 4) != 0) {
            str3 = address.postalCode;
        }
        if ((i & 8) != 0) {
            str4 = address.city;
        }
        return address.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.fullAddress;
    }

    public final String component2() {
        return this.state;
    }

    public final String component3() {
        return this.postalCode;
    }

    public final String component4() {
        return this.city;
    }

    public final Address copy(String str, String str2, String str3, String str4) {
        return new Address(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return C19383o.m32792b(this.fullAddress, address.fullAddress) && C19383o.m32792b(this.state, address.state) && C19383o.m32792b(this.postalCode, address.postalCode) && C19383o.m32792b(this.city, address.city);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.fullAddress;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.fullAddress;
        String str2 = this.state;
        return C0073e.m210j(C0388a.m1050f("Address(fullAddress=", str, ", state=", str2, ", postalCode="), this.postalCode, ", city=", this.city, ")");
    }
}
