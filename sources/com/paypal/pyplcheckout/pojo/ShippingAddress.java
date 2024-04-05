package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class ShippingAddress {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("addressId")
    private String addressId;
    @C18417a("city")
    private String city;
    @C18417a("country")
    private String country;
    @C18417a("fullAddress")
    private String fullAddress;
    @C18417a("isDefault")
    private boolean isDefault;
    @C18417a("isDisabled")
    private boolean isDisabled;
    @C18417a("isInvalid")
    private boolean isInvalid;
    @C18417a("isPrimary")
    private boolean isPrimary;
    @C18417a("isSelected")
    private boolean isSelected;
    @C18417a("line1")
    private String line1;
    @C18417a("line2")
    private String line2;
    @C18417a("name")
    private Name name;
    @C18417a("postalCode")
    private String postalCode;
    @C18417a("state")
    private String state;

    public ShippingAddress(String str, Name name2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, String str8, Map<String, Object> map, boolean z5) {
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        Map<String, Object> map2 = map;
        C19383o.m32797g(str, "addressId");
        C19383o.m32797g(name2, "name");
        C19383o.m32797g(str2, "line1");
        C19383o.m32797g(str9, "line2");
        C19383o.m32797g(str10, "city");
        C19383o.m32797g(str11, "state");
        C19383o.m32797g(str12, "country");
        C19383o.m32797g(str13, "postalCode");
        C19383o.m32797g(str14, "fullAddress");
        C19383o.m32797g(map2, "additionalProperties");
        this.addressId = str;
        this.name = name2;
        this.line1 = str2;
        this.line2 = str9;
        this.city = str10;
        this.state = str11;
        this.country = str12;
        this.postalCode = str13;
        this.isDisabled = z;
        this.isDefault = z2;
        this.isPrimary = z3;
        this.isSelected = z4;
        this.fullAddress = str14;
        this.additionalProperties = map2;
        this.isInvalid = z5;
    }

    public static /* synthetic */ ShippingAddress copy$default(ShippingAddress shippingAddress, String str, Name name2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, String str8, Map map, boolean z5, int i, Object obj) {
        ShippingAddress shippingAddress2 = shippingAddress;
        int i2 = i;
        return shippingAddress.copy((i2 & 1) != 0 ? shippingAddress2.addressId : str, (i2 & 2) != 0 ? shippingAddress2.name : name2, (i2 & 4) != 0 ? shippingAddress2.line1 : str2, (i2 & 8) != 0 ? shippingAddress2.line2 : str3, (i2 & 16) != 0 ? shippingAddress2.city : str4, (i2 & 32) != 0 ? shippingAddress2.state : str5, (i2 & 64) != 0 ? shippingAddress2.country : str6, (i2 & 128) != 0 ? shippingAddress2.postalCode : str7, (i2 & 256) != 0 ? shippingAddress2.isDisabled : z, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shippingAddress2.isDefault : z2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shippingAddress2.isPrimary : z3, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shippingAddress2.isSelected : z4, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shippingAddress2.fullAddress : str8, (i2 & 8192) != 0 ? shippingAddress2.additionalProperties : map, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shippingAddress2.isInvalid : z5);
    }

    public final String component1() {
        return this.addressId;
    }

    public final boolean component10() {
        return this.isDefault;
    }

    public final boolean component11() {
        return this.isPrimary;
    }

    public final boolean component12() {
        return this.isSelected;
    }

    public final String component13() {
        return this.fullAddress;
    }

    public final Map<String, Object> component14() {
        return this.additionalProperties;
    }

    public final boolean component15() {
        return this.isInvalid;
    }

    public final Name component2() {
        return this.name;
    }

    public final String component3() {
        return this.line1;
    }

    public final String component4() {
        return this.line2;
    }

    public final String component5() {
        return this.city;
    }

    public final String component6() {
        return this.state;
    }

    public final String component7() {
        return this.country;
    }

    public final String component8() {
        return this.postalCode;
    }

    public final boolean component9() {
        return this.isDisabled;
    }

    public final ShippingAddress copy(String str, Name name2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, String str8, Map<String, Object> map, boolean z5) {
        String str9 = str;
        C19383o.m32797g(str9, "addressId");
        Name name3 = name2;
        C19383o.m32797g(name3, "name");
        String str10 = str2;
        C19383o.m32797g(str10, "line1");
        String str11 = str3;
        C19383o.m32797g(str11, "line2");
        String str12 = str4;
        C19383o.m32797g(str12, "city");
        String str13 = str5;
        C19383o.m32797g(str13, "state");
        String str14 = str6;
        C19383o.m32797g(str14, "country");
        String str15 = str7;
        C19383o.m32797g(str15, "postalCode");
        String str16 = str8;
        C19383o.m32797g(str16, "fullAddress");
        Map<String, Object> map2 = map;
        C19383o.m32797g(map2, "additionalProperties");
        return new ShippingAddress(str9, name3, str10, str11, str12, str13, str14, str15, z, z2, z3, z4, str16, map2, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        return C19383o.m32792b(this.addressId, ((ShippingAddress) obj).addressId);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
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

    public final Name getName() {
        return this.name;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.addressId});
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final boolean isInvalid() {
        return this.isInvalid;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAdditionalProperty(String str, Object obj) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(obj, "value");
        this.additionalProperties.put(str, obj);
    }

    public final void setAddressId(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.addressId = str;
    }

    public final void setCity(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.city = str;
    }

    public final void setCountry(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.country = str;
    }

    public final void setDefault(boolean z) {
        this.isDefault = z;
    }

    public final void setDisabled(boolean z) {
        this.isDisabled = z;
    }

    public final void setFullAddress(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.fullAddress = str;
    }

    public final void setInvalid(boolean z) {
        this.isInvalid = z;
    }

    public final void setLine1(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.line1 = str;
    }

    public final void setLine2(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.line2 = str;
    }

    public final void setName(Name name2) {
        C19383o.m32797g(name2, "<set-?>");
        this.name = name2;
    }

    public final void setPostalCode(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.postalCode = str;
    }

    public final void setPrimary(boolean z) {
        this.isPrimary = z;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setState(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.state = str;
    }

    public String toString() {
        String str = this.addressId;
        Name name2 = this.name;
        String str2 = this.line1;
        String str3 = this.line2;
        String str4 = this.city;
        String str5 = this.state;
        String str6 = this.country;
        String str7 = this.postalCode;
        boolean z = this.isDisabled;
        boolean z2 = this.isDefault;
        boolean z3 = this.isPrimary;
        boolean z4 = this.isSelected;
        String str8 = this.fullAddress;
        Map<String, Object> map = this.additionalProperties;
        boolean z5 = this.isInvalid;
        StringBuilder sb = new StringBuilder();
        sb.append("ShippingAddress(addressId=");
        sb.append(str);
        sb.append(", name=");
        sb.append(name2);
        sb.append(", line1=");
        C0391c.m1061h(sb, str2, ", line2=", str3, ", city=");
        C0391c.m1061h(sb, str4, ", state=", str5, ", country=");
        C0391c.m1061h(sb, str6, ", postalCode=", str7, ", isDisabled=");
        sb.append(z);
        sb.append(", isDefault=");
        sb.append(z2);
        sb.append(", isPrimary=");
        sb.append(z3);
        sb.append(", isSelected=");
        sb.append(z4);
        sb.append(", fullAddress=");
        sb.append(str8);
        sb.append(", additionalProperties=");
        sb.append(map);
        sb.append(", isInvalid=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingAddress(String str, Name name2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, String str8, Map map, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, name2, str2, str3, str4, str5, str6, str7, z, z2, z3, z4, str8, (i & 8192) != 0 ? new HashMap() : map, z5);
    }
}
