package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class BillingAddressLookupRequest {
    @C18417a("city")
    private final String city;
    @C18417a("country")
    private final String country;
    @C18417a("familyName")
    private final String familyName;
    @C18417a("givenName")
    private final String givenName;
    @C18417a("line1")
    private final String line1;
    @C18417a("line2")
    private final String line2;
    @C18417a("postalCode")
    private final String postalCode;
    @C18417a("state")
    private final String state;

    public BillingAddressLookupRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.givenName = str;
        this.familyName = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.city = str5;
        this.state = str6;
        this.postalCode = str7;
        this.country = str8;
    }

    public static /* synthetic */ BillingAddressLookupRequest copy$default(BillingAddressLookupRequest billingAddressLookupRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        BillingAddressLookupRequest billingAddressLookupRequest2 = billingAddressLookupRequest;
        int i2 = i;
        return billingAddressLookupRequest.copy((i2 & 1) != 0 ? billingAddressLookupRequest2.givenName : str, (i2 & 2) != 0 ? billingAddressLookupRequest2.familyName : str2, (i2 & 4) != 0 ? billingAddressLookupRequest2.line1 : str3, (i2 & 8) != 0 ? billingAddressLookupRequest2.line2 : str4, (i2 & 16) != 0 ? billingAddressLookupRequest2.city : str5, (i2 & 32) != 0 ? billingAddressLookupRequest2.state : str6, (i2 & 64) != 0 ? billingAddressLookupRequest2.postalCode : str7, (i2 & 128) != 0 ? billingAddressLookupRequest2.country : str8);
    }

    public final String component1() {
        return this.givenName;
    }

    public final String component2() {
        return this.familyName;
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
        return this.postalCode;
    }

    public final String component8() {
        return this.country;
    }

    public final BillingAddressLookupRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new BillingAddressLookupRequest(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddressLookupRequest)) {
            return false;
        }
        BillingAddressLookupRequest billingAddressLookupRequest = (BillingAddressLookupRequest) obj;
        return C19383o.m32792b(this.givenName, billingAddressLookupRequest.givenName) && C19383o.m32792b(this.familyName, billingAddressLookupRequest.familyName) && C19383o.m32792b(this.line1, billingAddressLookupRequest.line1) && C19383o.m32792b(this.line2, billingAddressLookupRequest.line2) && C19383o.m32792b(this.city, billingAddressLookupRequest.city) && C19383o.m32792b(this.state, billingAddressLookupRequest.state) && C19383o.m32792b(this.postalCode, billingAddressLookupRequest.postalCode) && C19383o.m32792b(this.country, billingAddressLookupRequest.country);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
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
        String str = this.givenName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.familyName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.line2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.city;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postalCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.givenName;
        String str2 = this.familyName;
        String str3 = this.line1;
        String str4 = this.line2;
        String str5 = this.city;
        String str6 = this.state;
        String str7 = this.postalCode;
        String str8 = this.country;
        StringBuilder f = C0388a.m1050f("BillingAddressLookupRequest(givenName=", str, ", familyName=", str2, ", line1=");
        C0391c.m1061h(f, str3, ", line2=", str4, ", city=");
        C0391c.m1061h(f, str5, ", state=", str6, ", postalCode=");
        return C0073e.m210j(f, str7, ", country=", str8, ")");
    }
}
