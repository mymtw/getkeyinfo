package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class BillingAddress {
    @C18417a("addressId")
    private final String addressId;
    @C18417a("city")
    private final String city;
    @C18417a("country")
    private final String country;
    @C18417a("fullAddress")
    private final String fullAddress;
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

    public BillingAddress() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 511, (DefaultConstructorMarker) null);
    }

    public BillingAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        this.addressId = str;
        this.line1 = str2;
        this.line2 = str3;
        this.city = str4;
        this.state = str5;
        this.postalCode = str6;
        this.country = str7;
        this.fullAddress = str8;
        this.isSelected = bool;
    }

    public static /* synthetic */ BillingAddress copy$default(BillingAddress billingAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, int i, Object obj) {
        BillingAddress billingAddress2 = billingAddress;
        int i2 = i;
        return billingAddress.copy((i2 & 1) != 0 ? billingAddress2.addressId : str, (i2 & 2) != 0 ? billingAddress2.line1 : str2, (i2 & 4) != 0 ? billingAddress2.line2 : str3, (i2 & 8) != 0 ? billingAddress2.city : str4, (i2 & 16) != 0 ? billingAddress2.state : str5, (i2 & 32) != 0 ? billingAddress2.postalCode : str6, (i2 & 64) != 0 ? billingAddress2.country : str7, (i2 & 128) != 0 ? billingAddress2.fullAddress : str8, (i2 & 256) != 0 ? billingAddress2.isSelected : bool);
    }

    public final String component1() {
        return this.addressId;
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
        return this.country;
    }

    public final String component8() {
        return this.fullAddress;
    }

    public final Boolean component9() {
        return this.isSelected;
    }

    public final BillingAddress copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        return new BillingAddress(str, str2, str3, str4, str5, str6, str7, str8, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) obj;
        return C19383o.m32792b(this.addressId, billingAddress.addressId) && C19383o.m32792b(this.line1, billingAddress.line1) && C19383o.m32792b(this.line2, billingAddress.line2) && C19383o.m32792b(this.city, billingAddress.city) && C19383o.m32792b(this.state, billingAddress.state) && C19383o.m32792b(this.postalCode, billingAddress.postalCode) && C19383o.m32792b(this.country, billingAddress.country) && C19383o.m32792b(this.fullAddress, billingAddress.fullAddress) && C19383o.m32792b(this.isSelected, billingAddress.isSelected);
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
        String str7 = this.country;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fullAddress;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.isSelected;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode8 + i;
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
        String str7 = this.country;
        String str8 = this.fullAddress;
        Boolean bool = this.isSelected;
        StringBuilder f = C0388a.m1050f("BillingAddress(addressId=", str, ", line1=", str2, ", line2=");
        C0391c.m1061h(f, str3, ", city=", str4, ", state=");
        C0391c.m1061h(f, str5, ", postalCode=", str6, ", country=");
        C0391c.m1061h(f, str7, ", fullAddress=", str8, ", isSelected=");
        f.append(bool);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BillingAddress(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.BillingAddress.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
