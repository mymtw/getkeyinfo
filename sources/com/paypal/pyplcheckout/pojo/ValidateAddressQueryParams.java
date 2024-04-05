package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ValidateAddressQueryParams {
    @C18417a("city")
    private final String city;
    @C18417a("countryCode")
    private final String countryCode;
    @C18417a("line1")
    private final String line1;
    @C18417a("line2")
    private final String line2;
    @C18417a("postalCode")
    private final String postalCode;
    @C18417a("state")
    private final String state;

    public ValidateAddressQueryParams(String str, String str2, String str3, String str4, String str5, String str6) {
        this.line1 = str;
        this.line2 = str2;
        this.city = str3;
        this.state = str4;
        this.postalCode = str5;
        this.countryCode = str6;
    }

    public static /* synthetic */ ValidateAddressQueryParams copy$default(ValidateAddressQueryParams validateAddressQueryParams, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateAddressQueryParams.line1;
        }
        if ((i & 2) != 0) {
            str2 = validateAddressQueryParams.line2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = validateAddressQueryParams.city;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = validateAddressQueryParams.state;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = validateAddressQueryParams.postalCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = validateAddressQueryParams.countryCode;
        }
        return validateAddressQueryParams.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.line1;
    }

    public final String component2() {
        return this.line2;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.postalCode;
    }

    public final String component6() {
        return this.countryCode;
    }

    public final ValidateAddressQueryParams copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ValidateAddressQueryParams(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateAddressQueryParams)) {
            return false;
        }
        ValidateAddressQueryParams validateAddressQueryParams = (ValidateAddressQueryParams) obj;
        return C19383o.m32792b(this.line1, validateAddressQueryParams.line1) && C19383o.m32792b(this.line2, validateAddressQueryParams.line2) && C19383o.m32792b(this.city, validateAddressQueryParams.city) && C19383o.m32792b(this.state, validateAddressQueryParams.state) && C19383o.m32792b(this.postalCode, validateAddressQueryParams.postalCode) && C19383o.m32792b(this.countryCode, validateAddressQueryParams.countryCode);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
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
        String str = this.line1;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.line2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countryCode;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.line1;
        String str2 = this.line2;
        String str3 = this.city;
        String str4 = this.state;
        String str5 = this.postalCode;
        String str6 = this.countryCode;
        StringBuilder f = C0388a.m1050f("ValidateAddressQueryParams(line1=", str, ", line2=", str2, ", city=");
        C0391c.m1061h(f, str3, ", state=", str4, ", postalCode=");
        return C0073e.m210j(f, str5, ", countryCode=", str6, ")");
    }
}
