package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p650pn.C18417a;

public final class NewShippingAddressRequest {
    @C18417a("city")
    private final String city;
    @C18417a("countryCode")
    private final String countryCode;
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

    public NewShippingAddressRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C0048b.m167f(str, "givenName", str2, "familyName", str3, "line1");
        this.givenName = str;
        this.familyName = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.city = str5;
        this.state = str6;
        this.postalCode = str7;
        this.countryCode = str8;
    }

    public static /* synthetic */ NewShippingAddressRequest copy$default(NewShippingAddressRequest newShippingAddressRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        NewShippingAddressRequest newShippingAddressRequest2 = newShippingAddressRequest;
        int i2 = i;
        return newShippingAddressRequest.copy((i2 & 1) != 0 ? newShippingAddressRequest2.givenName : str, (i2 & 2) != 0 ? newShippingAddressRequest2.familyName : str2, (i2 & 4) != 0 ? newShippingAddressRequest2.line1 : str3, (i2 & 8) != 0 ? newShippingAddressRequest2.line2 : str4, (i2 & 16) != 0 ? newShippingAddressRequest2.city : str5, (i2 & 32) != 0 ? newShippingAddressRequest2.state : str6, (i2 & 64) != 0 ? newShippingAddressRequest2.postalCode : str7, (i2 & 128) != 0 ? newShippingAddressRequest2.countryCode : str8);
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
        return this.countryCode;
    }

    public final NewShippingAddressRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C19383o.m32797g(str, "givenName");
        C19383o.m32797g(str2, "familyName");
        C19383o.m32797g(str3, "line1");
        return new NewShippingAddressRequest(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewShippingAddressRequest)) {
            return false;
        }
        NewShippingAddressRequest newShippingAddressRequest = (NewShippingAddressRequest) obj;
        return C19383o.m32792b(this.givenName, newShippingAddressRequest.givenName) && C19383o.m32792b(this.familyName, newShippingAddressRequest.familyName) && C19383o.m32792b(this.line1, newShippingAddressRequest.line1) && C19383o.m32792b(this.line2, newShippingAddressRequest.line2) && C19383o.m32792b(this.city, newShippingAddressRequest.city) && C19383o.m32792b(this.state, newShippingAddressRequest.state) && C19383o.m32792b(this.postalCode, newShippingAddressRequest.postalCode) && C19383o.m32792b(this.countryCode, newShippingAddressRequest.countryCode);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
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
        int e = C0023f.m105e(this.line1, C0023f.m105e(this.familyName, this.givenName.hashCode() * 31, 31), 31);
        String str = this.line2;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.city;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postalCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countryCode;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.givenName;
        String str2 = this.familyName;
        String str3 = this.line1;
        String str4 = this.line2;
        String str5 = this.city;
        String str6 = this.state;
        String str7 = this.postalCode;
        String str8 = this.countryCode;
        StringBuilder f = C0388a.m1050f("NewShippingAddressRequest(givenName=", str, ", familyName=", str2, ", line1=");
        C0391c.m1061h(f, str3, ", line2=", str4, ", city=");
        C0391c.m1061h(f, str5, ", state=", str6, ", postalCode=");
        return C0073e.m210j(f, str7, ", countryCode=", str8, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NewShippingAddressRequest(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r16
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r17
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r19
        L_0x0023:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r20
        L_0x002b:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.NewShippingAddressRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
