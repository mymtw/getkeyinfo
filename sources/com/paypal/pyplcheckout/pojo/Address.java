package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class Address {
    @C18417a("addressId")
    private final String addressId;
    @C18417a("city")
    private final String city;
    @C18417a("country")
    private final String country;
    @C18417a("fullAddress")
    private final String fullAddress;
    @C18417a("isPrimary")
    private final Boolean isPrimary;
    @C18417a("isSelected")
    private final Boolean isSelected;
    @C18417a("line1")
    private final String line1;
    @C18417a("line2")
    private final String line2;
    @C18417a("postalCode")
    private final String postalCode;
    @C18417a("state")
    private final String state;

    public Address(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2) {
        this.isPrimary = bool;
        this.fullAddress = str;
        this.addressId = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.city = str5;
        this.state = str6;
        this.postalCode = str7;
        this.country = str8;
        this.isSelected = bool2;
    }

    public static /* synthetic */ Address copy$default(Address address, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2, int i, Object obj) {
        Address address2 = address;
        int i2 = i;
        return address.copy((i2 & 1) != 0 ? address2.isPrimary : bool, (i2 & 2) != 0 ? address2.fullAddress : str, (i2 & 4) != 0 ? address2.addressId : str2, (i2 & 8) != 0 ? address2.line1 : str3, (i2 & 16) != 0 ? address2.line2 : str4, (i2 & 32) != 0 ? address2.city : str5, (i2 & 64) != 0 ? address2.state : str6, (i2 & 128) != 0 ? address2.postalCode : str7, (i2 & 256) != 0 ? address2.country : str8, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? address2.isSelected : bool2);
    }

    public final Boolean component1() {
        return this.isPrimary;
    }

    public final Boolean component10() {
        return this.isSelected;
    }

    public final String component2() {
        return this.fullAddress;
    }

    public final String component3() {
        return this.addressId;
    }

    public final String component4() {
        return this.line1;
    }

    public final String component5() {
        return this.line2;
    }

    public final String component6() {
        return this.city;
    }

    public final String component7() {
        return this.state;
    }

    public final String component8() {
        return this.postalCode;
    }

    public final String component9() {
        return this.country;
    }

    public final Address copy(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2) {
        return new Address(bool, str, str2, str3, str4, str5, str6, str7, str8, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return C19383o.m32792b(this.isPrimary, address.isPrimary) && C19383o.m32792b(this.fullAddress, address.fullAddress) && C19383o.m32792b(this.addressId, address.addressId) && C19383o.m32792b(this.line1, address.line1) && C19383o.m32792b(this.line2, address.line2) && C19383o.m32792b(this.city, address.city) && C19383o.m32792b(this.state, address.state) && C19383o.m32792b(this.postalCode, address.postalCode) && C19383o.m32792b(this.country, address.country) && C19383o.m32792b(this.isSelected, address.isSelected);
    }

    public final String getAddressId() {
        return this.addressId;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        Boolean bool = this.isPrimary;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.fullAddress;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line1;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.line2;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.city;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postalCode;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.isSelected;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode9 + i;
    }

    public final Boolean isPrimary() {
        return this.isPrimary;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        Boolean bool = this.isPrimary;
        String str = this.fullAddress;
        String str2 = this.addressId;
        String str3 = this.line1;
        String str4 = this.line2;
        String str5 = this.city;
        String str6 = this.state;
        String str7 = this.postalCode;
        String str8 = this.country;
        Boolean bool2 = this.isSelected;
        StringBuilder sb = new StringBuilder();
        sb.append("Address(isPrimary=");
        sb.append(bool);
        sb.append(", fullAddress=");
        sb.append(str);
        sb.append(", addressId=");
        C0391c.m1061h(sb, str2, ", line1=", str3, ", line2=");
        C0391c.m1061h(sb, str4, ", city=", str5, ", state=");
        C0391c.m1061h(sb, str6, ", postalCode=", str7, ", country=");
        sb.append(str8);
        sb.append(", isSelected=");
        sb.append(bool2);
        sb.append(")");
        return sb.toString();
    }
}
