package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class BillingAddressRequest {
    @C18417a("city")
    private final String city;
    @C18417a("country")
    private String country;
    @C18417a("countryCode")
    private String countryCode;
    @C18417a("fullAddress")
    private String fullAddress;
    @C18417a("line1")
    private final String line1;
    @C18417a("line2")
    private final String line2;
    @C18417a("postalCode")
    private final String postalCode;
    @C18417a("state")
    private final String state;

    public BillingAddressRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str;
        C0391c.m1060g(str9, "line1", str3, "city", str4, "state", str5, "postalCode");
        this.line1 = str9;
        this.line2 = str2;
        this.city = str3;
        this.state = str4;
        this.postalCode = str5;
        this.countryCode = str6;
        this.fullAddress = str7;
        this.country = str8;
    }

    public static /* synthetic */ BillingAddressRequest copy$default(BillingAddressRequest billingAddressRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        BillingAddressRequest billingAddressRequest2 = billingAddressRequest;
        int i2 = i;
        return billingAddressRequest.copy((i2 & 1) != 0 ? billingAddressRequest2.line1 : str, (i2 & 2) != 0 ? billingAddressRequest2.line2 : str2, (i2 & 4) != 0 ? billingAddressRequest2.city : str3, (i2 & 8) != 0 ? billingAddressRequest2.state : str4, (i2 & 16) != 0 ? billingAddressRequest2.postalCode : str5, (i2 & 32) != 0 ? billingAddressRequest2.countryCode : str6, (i2 & 64) != 0 ? billingAddressRequest2.fullAddress : str7, (i2 & 128) != 0 ? billingAddressRequest2.country : str8);
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

    public final String component7() {
        return this.fullAddress;
    }

    public final String component8() {
        return this.country;
    }

    public final BillingAddressRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C19383o.m32797g(str, "line1");
        C19383o.m32797g(str3, "city");
        C19383o.m32797g(str4, "state");
        C19383o.m32797g(str5, "postalCode");
        return new BillingAddressRequest(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddressRequest)) {
            return false;
        }
        BillingAddressRequest billingAddressRequest = (BillingAddressRequest) obj;
        return C19383o.m32792b(this.line1, billingAddressRequest.line1) && C19383o.m32792b(this.line2, billingAddressRequest.line2) && C19383o.m32792b(this.city, billingAddressRequest.city) && C19383o.m32792b(this.state, billingAddressRequest.state) && C19383o.m32792b(this.postalCode, billingAddressRequest.postalCode) && C19383o.m32792b(this.countryCode, billingAddressRequest.countryCode) && C19383o.m32792b(this.fullAddress, billingAddressRequest.fullAddress) && C19383o.m32792b(this.country, billingAddressRequest.country);
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
        int hashCode = this.line1.hashCode() * 31;
        String str = this.line2;
        int i = 0;
        int e = C0023f.m105e(this.postalCode, C0023f.m105e(this.state, C0023f.m105e(this.city, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        String str2 = this.countryCode;
        int hashCode2 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullAddress;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.country;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setFullAddress(String str) {
        this.fullAddress = str;
    }

    public String toString() {
        String str = this.line1;
        String str2 = this.line2;
        String str3 = this.city;
        String str4 = this.state;
        String str5 = this.postalCode;
        String str6 = this.countryCode;
        String str7 = this.fullAddress;
        String str8 = this.country;
        StringBuilder f = C0388a.m1050f("BillingAddressRequest(line1=", str, ", line2=", str2, ", city=");
        C0391c.m1061h(f, str3, ", state=", str4, ", postalCode=");
        C0391c.m1061h(f, str5, ", countryCode=", str6, ", fullAddress=");
        return C0073e.m210j(f, str7, ", country=", str8, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BillingAddressRequest(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r18
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r19
        L_0x0013:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r20
        L_0x001b:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.BillingAddressRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
