package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopsSellerPersonalDetails {
    public static final int $stable = 0;
    private final String addressLine1;
    private final String addressLine2;
    private final String city;
    private final String country;
    private final Integer createDate;
    private final String createDateFormatted;
    private final Long detailsId;
    private final String emailAddress;
    private final String firstName;
    private final String formattedString;
    private final Boolean hasContactInfo;
    private final String lastName;
    private final String phoneNumber;
    private final String postalCode;
    private final String state;
    private final String traderDistinction;
    private final Integer updateDate;
    private final String updateDateFormatted;
    private final String vatNumber;

    public ShopsSellerPersonalDetails(@C17402n(name = "details_id") Long l, @C17402n(name = "first_name") String str, @C17402n(name = "last_name") String str2, @C17402n(name = "address_line1") String str3, @C17402n(name = "address_line2") String str4, @C17402n(name = "city") String str5, @C17402n(name = "state") String str6, @C17402n(name = "country") String str7, @C17402n(name = "postal_code") String str8, @C17402n(name = "vat_number") String str9, @C17402n(name = "email_address") String str10, @C17402n(name = "phone_number") String str11, @C17402n(name = "create_date") Integer num, @C17402n(name = "create_date_formatted") String str12, @C17402n(name = "update_date") Integer num2, @C17402n(name = "update_date_formatted") String str13, @C17402n(name = "formatted_string") String str14, @C17402n(name = "has_contact_info") Boolean bool, @C17402n(name = "trader_distinction") String str15) {
        this.detailsId = l;
        this.firstName = str;
        this.lastName = str2;
        this.addressLine1 = str3;
        this.addressLine2 = str4;
        this.city = str5;
        this.state = str6;
        this.country = str7;
        this.postalCode = str8;
        this.vatNumber = str9;
        this.emailAddress = str10;
        this.phoneNumber = str11;
        this.createDate = num;
        this.createDateFormatted = str12;
        this.updateDate = num2;
        this.updateDateFormatted = str13;
        this.formattedString = str14;
        this.hasContactInfo = bool;
        this.traderDistinction = str15;
    }

    public static /* synthetic */ ShopsSellerPersonalDetails copy$default(ShopsSellerPersonalDetails shopsSellerPersonalDetails, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, Integer num2, String str13, String str14, Boolean bool, String str15, int i, Object obj) {
        ShopsSellerPersonalDetails shopsSellerPersonalDetails2 = shopsSellerPersonalDetails;
        int i2 = i;
        return shopsSellerPersonalDetails.copy((i2 & 1) != 0 ? shopsSellerPersonalDetails2.detailsId : l, (i2 & 2) != 0 ? shopsSellerPersonalDetails2.firstName : str, (i2 & 4) != 0 ? shopsSellerPersonalDetails2.lastName : str2, (i2 & 8) != 0 ? shopsSellerPersonalDetails2.addressLine1 : str3, (i2 & 16) != 0 ? shopsSellerPersonalDetails2.addressLine2 : str4, (i2 & 32) != 0 ? shopsSellerPersonalDetails2.city : str5, (i2 & 64) != 0 ? shopsSellerPersonalDetails2.state : str6, (i2 & 128) != 0 ? shopsSellerPersonalDetails2.country : str7, (i2 & 256) != 0 ? shopsSellerPersonalDetails2.postalCode : str8, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shopsSellerPersonalDetails2.vatNumber : str9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shopsSellerPersonalDetails2.emailAddress : str10, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shopsSellerPersonalDetails2.phoneNumber : str11, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shopsSellerPersonalDetails2.createDate : num, (i2 & 8192) != 0 ? shopsSellerPersonalDetails2.createDateFormatted : str12, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shopsSellerPersonalDetails2.updateDate : num2, (i2 & 32768) != 0 ? shopsSellerPersonalDetails2.updateDateFormatted : str13, (i2 & 65536) != 0 ? shopsSellerPersonalDetails2.formattedString : str14, (i2 & 131072) != 0 ? shopsSellerPersonalDetails2.hasContactInfo : bool, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? shopsSellerPersonalDetails2.traderDistinction : str15);
    }

    public final Long component1() {
        return this.detailsId;
    }

    public final String component10() {
        return this.vatNumber;
    }

    public final String component11() {
        return this.emailAddress;
    }

    public final String component12() {
        return this.phoneNumber;
    }

    public final Integer component13() {
        return this.createDate;
    }

    public final String component14() {
        return this.createDateFormatted;
    }

    public final Integer component15() {
        return this.updateDate;
    }

    public final String component16() {
        return this.updateDateFormatted;
    }

    public final String component17() {
        return this.formattedString;
    }

    public final Boolean component18() {
        return this.hasContactInfo;
    }

    public final String component19() {
        return this.traderDistinction;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.addressLine1;
    }

    public final String component5() {
        return this.addressLine2;
    }

    public final String component6() {
        return this.city;
    }

    public final String component7() {
        return this.state;
    }

    public final String component8() {
        return this.country;
    }

    public final String component9() {
        return this.postalCode;
    }

    public final ShopsSellerPersonalDetails copy(@C17402n(name = "details_id") Long l, @C17402n(name = "first_name") String str, @C17402n(name = "last_name") String str2, @C17402n(name = "address_line1") String str3, @C17402n(name = "address_line2") String str4, @C17402n(name = "city") String str5, @C17402n(name = "state") String str6, @C17402n(name = "country") String str7, @C17402n(name = "postal_code") String str8, @C17402n(name = "vat_number") String str9, @C17402n(name = "email_address") String str10, @C17402n(name = "phone_number") String str11, @C17402n(name = "create_date") Integer num, @C17402n(name = "create_date_formatted") String str12, @C17402n(name = "update_date") Integer num2, @C17402n(name = "update_date_formatted") String str13, @C17402n(name = "formatted_string") String str14, @C17402n(name = "has_contact_info") Boolean bool, @C17402n(name = "trader_distinction") String str15) {
        return new ShopsSellerPersonalDetails(l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, num2, str13, str14, bool, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopsSellerPersonalDetails)) {
            return false;
        }
        ShopsSellerPersonalDetails shopsSellerPersonalDetails = (ShopsSellerPersonalDetails) obj;
        return C19383o.m32792b(this.detailsId, shopsSellerPersonalDetails.detailsId) && C19383o.m32792b(this.firstName, shopsSellerPersonalDetails.firstName) && C19383o.m32792b(this.lastName, shopsSellerPersonalDetails.lastName) && C19383o.m32792b(this.addressLine1, shopsSellerPersonalDetails.addressLine1) && C19383o.m32792b(this.addressLine2, shopsSellerPersonalDetails.addressLine2) && C19383o.m32792b(this.city, shopsSellerPersonalDetails.city) && C19383o.m32792b(this.state, shopsSellerPersonalDetails.state) && C19383o.m32792b(this.country, shopsSellerPersonalDetails.country) && C19383o.m32792b(this.postalCode, shopsSellerPersonalDetails.postalCode) && C19383o.m32792b(this.vatNumber, shopsSellerPersonalDetails.vatNumber) && C19383o.m32792b(this.emailAddress, shopsSellerPersonalDetails.emailAddress) && C19383o.m32792b(this.phoneNumber, shopsSellerPersonalDetails.phoneNumber) && C19383o.m32792b(this.createDate, shopsSellerPersonalDetails.createDate) && C19383o.m32792b(this.createDateFormatted, shopsSellerPersonalDetails.createDateFormatted) && C19383o.m32792b(this.updateDate, shopsSellerPersonalDetails.updateDate) && C19383o.m32792b(this.updateDateFormatted, shopsSellerPersonalDetails.updateDateFormatted) && C19383o.m32792b(this.formattedString, shopsSellerPersonalDetails.formattedString) && C19383o.m32792b(this.hasContactInfo, shopsSellerPersonalDetails.hasContactInfo) && C19383o.m32792b(this.traderDistinction, shopsSellerPersonalDetails.traderDistinction);
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final Integer getCreateDate() {
        return this.createDate;
    }

    public final String getCreateDateFormatted() {
        return this.createDateFormatted;
    }

    public final Long getDetailsId() {
        return this.detailsId;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFormattedString() {
        return this.formattedString;
    }

    public final Boolean getHasContactInfo() {
        return this.hasContactInfo;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTraderDistinction() {
        return this.traderDistinction;
    }

    public final Integer getUpdateDate() {
        return this.updateDate;
    }

    public final String getUpdateDateFormatted() {
        return this.updateDateFormatted;
    }

    public final String getVatNumber() {
        return this.vatNumber;
    }

    public int hashCode() {
        Long l = this.detailsId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.firstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.city;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.country;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.postalCode;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.vatNumber;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.emailAddress;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.phoneNumber;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.createDate;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str12 = this.createDateFormatted;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.updateDate;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.updateDateFormatted;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.formattedString;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.hasContactInfo;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str15 = this.traderDistinction;
        if (str15 != null) {
            i = str15.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopsSellerPersonalDetails(detailsId=");
        h.append(this.detailsId);
        h.append(", firstName=");
        h.append(this.firstName);
        h.append(", lastName=");
        h.append(this.lastName);
        h.append(", addressLine1=");
        h.append(this.addressLine1);
        h.append(", addressLine2=");
        h.append(this.addressLine2);
        h.append(", city=");
        h.append(this.city);
        h.append(", state=");
        h.append(this.state);
        h.append(", country=");
        h.append(this.country);
        h.append(", postalCode=");
        h.append(this.postalCode);
        h.append(", vatNumber=");
        h.append(this.vatNumber);
        h.append(", emailAddress=");
        h.append(this.emailAddress);
        h.append(", phoneNumber=");
        h.append(this.phoneNumber);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", createDateFormatted=");
        h.append(this.createDateFormatted);
        h.append(", updateDate=");
        h.append(this.updateDate);
        h.append(", updateDateFormatted=");
        h.append(this.updateDateFormatted);
        h.append(", formattedString=");
        h.append(this.formattedString);
        h.append(", hasContactInfo=");
        h.append(this.hasContactInfo);
        h.append(", traderDistinction=");
        return C0391c.m1057c(h, this.traderDistinction, ')');
    }
}
