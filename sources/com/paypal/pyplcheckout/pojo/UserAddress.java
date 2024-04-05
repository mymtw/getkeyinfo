package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;

public final class UserAddress {
    private final String addressId;
    private final String city;
    private final String country;
    private final String fullAddress;
    private final Boolean isDefaultBilling;
    private final Boolean isDefaultShipping;
    private final Boolean isPrimary;
    private final Boolean isSelected;
    private final String line1;
    private final String line2;
    private final String postalCode;
    private final String state;
    private final String type;

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.addressId = str;
        this.line1 = str2;
        this.line2 = str3;
        this.city = str4;
        this.state = str5;
        this.postalCode = str6;
        this.fullAddress = str7;
        this.country = str8;
        this.type = str9;
        this.isPrimary = bool;
        this.isDefaultBilling = bool2;
        this.isDefaultShipping = bool3;
        this.isSelected = bool4;
    }

    public static /* synthetic */ UserAddress copy$default(UserAddress userAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        UserAddress userAddress2 = userAddress;
        int i2 = i;
        return userAddress.copy((i2 & 1) != 0 ? userAddress2.addressId : str, (i2 & 2) != 0 ? userAddress2.line1 : str2, (i2 & 4) != 0 ? userAddress2.line2 : str3, (i2 & 8) != 0 ? userAddress2.city : str4, (i2 & 16) != 0 ? userAddress2.state : str5, (i2 & 32) != 0 ? userAddress2.postalCode : str6, (i2 & 64) != 0 ? userAddress2.fullAddress : str7, (i2 & 128) != 0 ? userAddress2.country : str8, (i2 & 256) != 0 ? userAddress2.type : str9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? userAddress2.isPrimary : bool, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? userAddress2.isDefaultBilling : bool2, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? userAddress2.isDefaultShipping : bool3, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? userAddress2.isSelected : bool4);
    }

    public final String component1() {
        return this.addressId;
    }

    public final Boolean component10() {
        return this.isPrimary;
    }

    public final Boolean component11() {
        return this.isDefaultBilling;
    }

    public final Boolean component12() {
        return this.isDefaultShipping;
    }

    public final Boolean component13() {
        return this.isSelected;
    }

    public final String component2() {
        return this.line1;
    }

    public final String component3() {
        return this.line2;
    }

    public final String component4() {
        return this.city;
    }

    public final String component5() {
        return this.state;
    }

    public final String component6() {
        return this.postalCode;
    }

    public final String component7() {
        return this.fullAddress;
    }

    public final String component8() {
        return this.country;
    }

    public final String component9() {
        return this.type;
    }

    public final UserAddress copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, bool, bool2, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddress)) {
            return false;
        }
        UserAddress userAddress = (UserAddress) obj;
        return C19383o.m32792b(this.addressId, userAddress.addressId) && C19383o.m32792b(this.line1, userAddress.line1) && C19383o.m32792b(this.line2, userAddress.line2) && C19383o.m32792b(this.city, userAddress.city) && C19383o.m32792b(this.state, userAddress.state) && C19383o.m32792b(this.postalCode, userAddress.postalCode) && C19383o.m32792b(this.fullAddress, userAddress.fullAddress) && C19383o.m32792b(this.country, userAddress.country) && C19383o.m32792b(this.type, userAddress.type) && C19383o.m32792b(this.isPrimary, userAddress.isPrimary) && C19383o.m32792b(this.isDefaultBilling, userAddress.isDefaultBilling) && C19383o.m32792b(this.isDefaultShipping, userAddress.isDefaultShipping) && C19383o.m32792b(this.isSelected, userAddress.isSelected);
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

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.addressId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.line1;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line2;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postalCode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fullAddress;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.type;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.isPrimary;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefaultBilling;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDefaultShipping;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isSelected;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return hashCode12 + i;
    }

    public final Boolean isDefaultBilling() {
        return this.isDefaultBilling;
    }

    public final Boolean isDefaultShipping() {
        return this.isDefaultShipping;
    }

    public final Boolean isPrimary() {
        return this.isPrimary;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.addressId;
        String str2 = this.line1;
        String str3 = this.line2;
        String str4 = this.city;
        String str5 = this.state;
        String str6 = this.postalCode;
        String str7 = this.fullAddress;
        String str8 = this.country;
        String str9 = this.type;
        Boolean bool = this.isPrimary;
        Boolean bool2 = this.isDefaultBilling;
        Boolean bool3 = this.isDefaultShipping;
        Boolean bool4 = this.isSelected;
        StringBuilder f = C0388a.m1050f("UserAddress(addressId=", str, ", line1=", str2, ", line2=");
        C0391c.m1061h(f, str3, ", city=", str4, ", state=");
        C0391c.m1061h(f, str5, ", postalCode=", str6, ", fullAddress=");
        C0391c.m1061h(f, str7, ", country=", str8, ", type=");
        f.append(str9);
        f.append(", isPrimary=");
        f.append(bool);
        f.append(", isDefaultBilling=");
        f.append(bool2);
        f.append(", isDefaultShipping=");
        f.append(bool3);
        f.append(", isSelected=");
        f.append(bool4);
        f.append(")");
        return f.toString();
    }
}
