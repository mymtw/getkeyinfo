package com.paypal.checkout.order;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Address {
    @C18417a("address_line_1")
    private final String addressLine1;
    @C18417a("address_line_2")
    private final String addressLine2;
    @C18417a("admin_area_1")
    private final String adminArea1;
    @C18417a("admin_area_2")
    private final String adminArea2;
    @C18417a("country_code")
    private final String countryCode;
    @C18417a("postal_code")
    private final String postalCode;

    public static final class Builder {
        private String addressLine1;
        private String addressLine2;
        private String adminArea1;
        private String adminArea2;
        private String countryCode;
        private String postalCode;

        public final Builder addressLine1(String str) {
            this.addressLine1 = str;
            return this;
        }

        public final Builder addressLine2(String str) {
            this.addressLine2 = str;
            return this;
        }

        public final Builder adminArea1(String str) {
            this.adminArea1 = str;
            return this;
        }

        public final Builder adminArea2(String str) {
            this.adminArea2 = str;
            return this;
        }

        public final Address build() {
            String str = this.addressLine1;
            String str2 = this.addressLine2;
            String str3 = this.adminArea1;
            String str4 = this.adminArea2;
            String str5 = this.postalCode;
            String str6 = this.countryCode;
            if (str6 != null) {
                return new Address(str, str2, str3, str4, str5, str6);
            }
            C19383o.m32805o("countryCode");
            throw null;
        }

        public final Builder countryCode(String str) {
            C19383o.m32797g(str, "countryCode");
            this.countryCode = str;
            return this;
        }

        public final Builder postalCode(String str) {
            this.postalCode = str;
            return this;
        }
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        C19383o.m32797g(str6, "countryCode");
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.adminArea1 = str3;
        this.adminArea2 = str4;
        this.postalCode = str5;
        this.countryCode = str6;
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.addressLine1;
        }
        if ((i & 2) != 0) {
            str2 = address.addressLine2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = address.adminArea1;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = address.adminArea2;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = address.postalCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = address.countryCode;
        }
        return address.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.addressLine1;
    }

    public final String component2() {
        return this.addressLine2;
    }

    public final String component3() {
        return this.adminArea1;
    }

    public final String component4() {
        return this.adminArea2;
    }

    public final String component5() {
        return this.postalCode;
    }

    public final String component6() {
        return this.countryCode;
    }

    public final Address copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C19383o.m32797g(str6, "countryCode");
        return new Address(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return C19383o.m32792b(this.addressLine1, address.addressLine1) && C19383o.m32792b(this.addressLine2, address.addressLine2) && C19383o.m32792b(this.adminArea1, address.adminArea1) && C19383o.m32792b(this.adminArea2, address.adminArea2) && C19383o.m32792b(this.postalCode, address.postalCode) && C19383o.m32792b(this.countryCode, address.countryCode);
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAdminArea1() {
        return this.adminArea1;
    }

    public final String getAdminArea2() {
        return this.adminArea2;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public int hashCode() {
        String str = this.addressLine1;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adminArea1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adminArea2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return this.countryCode.hashCode() + ((hashCode4 + i) * 31);
    }

    public String toString() {
        String str = this.addressLine1;
        String str2 = this.addressLine2;
        String str3 = this.adminArea1;
        String str4 = this.adminArea2;
        String str5 = this.postalCode;
        String str6 = this.countryCode;
        StringBuilder f = C0388a.m1050f("Address(addressLine1=", str, ", addressLine2=", str2, ", adminArea1=");
        C0391c.m1061h(f, str3, ", adminArea2=", str4, ", postalCode=");
        return C0073e.m210j(f, str5, ", countryCode=", str6, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6);
    }
}
