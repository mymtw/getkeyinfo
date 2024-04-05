package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddressValidation {
    @C18417a("addressLine1")
    private final String addressLine1;
    @C18417a("addressLine2")
    private final String addressLine2;
    @C18417a("adminArea1")
    private final String adminArea1;
    @C18417a("adminArea2")
    private final String adminArea2;
    @C18417a("badFields")
    private final Address badFields;
    @C18417a("city")
    private final String city;
    @C18417a("country")
    private final String country;
    @C18417a("countryCode")
    private final String countryCode;
    @C18417a("formattedAddress")
    private final List<String> formattedAddress;
    @C18417a("isReformatted")
    private final Boolean isReformatted;
    @C18417a("isValidAddress")
    private final Boolean isValidAddress;
    @C18417a("line1")
    private final String line1;
    @C18417a("line2")
    private final String line2;
    @C18417a("mailability")
    private final String mailability;
    @C18417a("postalCode")
    private final String postalCode;
    @C18417a("state")
    private final String state;

    public AddressValidation(Boolean bool, Boolean bool2, Address address, String str, List<String> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.isValidAddress = bool;
        this.isReformatted = bool2;
        this.badFields = address;
        this.mailability = str;
        this.formattedAddress = list;
        this.line1 = str2;
        this.line2 = str3;
        this.city = str4;
        this.state = str5;
        this.postalCode = str6;
        this.country = str7;
        this.addressLine1 = str8;
        this.addressLine2 = str9;
        this.adminArea1 = str10;
        this.adminArea2 = str11;
        this.countryCode = str12;
    }

    public static /* synthetic */ AddressValidation copy$default(AddressValidation addressValidation, Boolean bool, Boolean bool2, Address address, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        AddressValidation addressValidation2 = addressValidation;
        int i2 = i;
        return addressValidation.copy((i2 & 1) != 0 ? addressValidation2.isValidAddress : bool, (i2 & 2) != 0 ? addressValidation2.isReformatted : bool2, (i2 & 4) != 0 ? addressValidation2.badFields : address, (i2 & 8) != 0 ? addressValidation2.mailability : str, (i2 & 16) != 0 ? addressValidation2.formattedAddress : list, (i2 & 32) != 0 ? addressValidation2.line1 : str2, (i2 & 64) != 0 ? addressValidation2.line2 : str3, (i2 & 128) != 0 ? addressValidation2.city : str4, (i2 & 256) != 0 ? addressValidation2.state : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? addressValidation2.postalCode : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? addressValidation2.country : str7, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? addressValidation2.addressLine1 : str8, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? addressValidation2.addressLine2 : str9, (i2 & 8192) != 0 ? addressValidation2.adminArea1 : str10, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? addressValidation2.adminArea2 : str11, (i2 & 32768) != 0 ? addressValidation2.countryCode : str12);
    }

    public final Boolean component1() {
        return this.isValidAddress;
    }

    public final String component10() {
        return this.postalCode;
    }

    public final String component11() {
        return this.country;
    }

    public final String component12() {
        return this.addressLine1;
    }

    public final String component13() {
        return this.addressLine2;
    }

    public final String component14() {
        return this.adminArea1;
    }

    public final String component15() {
        return this.adminArea2;
    }

    public final String component16() {
        return this.countryCode;
    }

    public final Boolean component2() {
        return this.isReformatted;
    }

    public final Address component3() {
        return this.badFields;
    }

    public final String component4() {
        return this.mailability;
    }

    public final List<String> component5() {
        return this.formattedAddress;
    }

    public final String component6() {
        return this.line1;
    }

    public final String component7() {
        return this.line2;
    }

    public final String component8() {
        return this.city;
    }

    public final String component9() {
        return this.state;
    }

    public final AddressValidation copy(Boolean bool, Boolean bool2, Address address, String str, List<String> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return new AddressValidation(bool, bool2, address, str, list, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressValidation)) {
            return false;
        }
        AddressValidation addressValidation = (AddressValidation) obj;
        return C19383o.m32792b(this.isValidAddress, addressValidation.isValidAddress) && C19383o.m32792b(this.isReformatted, addressValidation.isReformatted) && C19383o.m32792b(this.badFields, addressValidation.badFields) && C19383o.m32792b(this.mailability, addressValidation.mailability) && C19383o.m32792b(this.formattedAddress, addressValidation.formattedAddress) && C19383o.m32792b(this.line1, addressValidation.line1) && C19383o.m32792b(this.line2, addressValidation.line2) && C19383o.m32792b(this.city, addressValidation.city) && C19383o.m32792b(this.state, addressValidation.state) && C19383o.m32792b(this.postalCode, addressValidation.postalCode) && C19383o.m32792b(this.country, addressValidation.country) && C19383o.m32792b(this.addressLine1, addressValidation.addressLine1) && C19383o.m32792b(this.addressLine2, addressValidation.addressLine2) && C19383o.m32792b(this.adminArea1, addressValidation.adminArea1) && C19383o.m32792b(this.adminArea2, addressValidation.adminArea2) && C19383o.m32792b(this.countryCode, addressValidation.countryCode);
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

    public final Address getBadFields() {
        return this.badFields;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<String> getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getMailability() {
        return this.mailability;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        Boolean bool = this.isValidAddress;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isReformatted;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Address address = this.badFields;
        int hashCode3 = (hashCode2 + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.mailability;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.formattedAddress;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.line1;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line2;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postalCode;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.country;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressLine1;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressLine2;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.adminArea1;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.adminArea2;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.countryCode;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode15 + i;
    }

    public final Boolean isReformatted() {
        return this.isReformatted;
    }

    public final Boolean isValidAddress() {
        return this.isValidAddress;
    }

    public String toString() {
        Boolean bool = this.isValidAddress;
        Boolean bool2 = this.isReformatted;
        Address address = this.badFields;
        String str = this.mailability;
        List<String> list = this.formattedAddress;
        String str2 = this.line1;
        String str3 = this.line2;
        String str4 = this.city;
        String str5 = this.state;
        String str6 = this.postalCode;
        String str7 = this.country;
        String str8 = this.addressLine1;
        String str9 = this.addressLine2;
        String str10 = this.adminArea1;
        String str11 = this.adminArea2;
        String str12 = this.countryCode;
        StringBuilder sb = new StringBuilder();
        sb.append("AddressValidation(isValidAddress=");
        sb.append(bool);
        sb.append(", isReformatted=");
        sb.append(bool2);
        sb.append(", badFields=");
        sb.append(address);
        sb.append(", mailability=");
        sb.append(str);
        sb.append(", formattedAddress=");
        sb.append(list);
        sb.append(", line1=");
        sb.append(str2);
        sb.append(", line2=");
        C0391c.m1061h(sb, str3, ", city=", str4, ", state=");
        C0391c.m1061h(sb, str5, ", postalCode=", str6, ", country=");
        C0391c.m1061h(sb, str7, ", addressLine1=", str8, ", addressLine2=");
        C0391c.m1061h(sb, str9, ", adminArea1=", str10, ", adminArea2=");
        return C0073e.m210j(sb, str11, ", countryCode=", str12, ")");
    }
}
