package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ShippingOption {
    public static final int $stable = 0;
    private final float cost;
    private final float costInUsd;
    private final String currencyCode;
    private final String name;
    private final String optionId;
    private final Integer optionType;
    private final Integer originCountryId;
    private final String originPostalCode;
    private final Integer shippingProfileType;

    public ShippingOption(@C17402n(name = "cost") float f, @C17402n(name = "cost_in_usd") float f2, @C17402n(name = "currency_code") String str, @C17402n(name = "name") String str2, @C17402n(name = "option_id") String str3, @C17402n(name = "option_type") Integer num, @C17402n(name = "origin_country_id") Integer num2, @C17402n(name = "origin_postal_code") String str4, @C17402n(name = "shipping_profile_type") Integer num3) {
        this.cost = f;
        this.costInUsd = f2;
        this.currencyCode = str;
        this.name = str2;
        this.optionId = str3;
        this.optionType = num;
        this.originCountryId = num2;
        this.originPostalCode = str4;
        this.shippingProfileType = num3;
    }

    public static /* synthetic */ ShippingOption copy$default(ShippingOption shippingOption, float f, float f2, String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, int i, Object obj) {
        ShippingOption shippingOption2 = shippingOption;
        int i2 = i;
        return shippingOption.copy((i2 & 1) != 0 ? shippingOption2.cost : f, (i2 & 2) != 0 ? shippingOption2.costInUsd : f2, (i2 & 4) != 0 ? shippingOption2.currencyCode : str, (i2 & 8) != 0 ? shippingOption2.name : str2, (i2 & 16) != 0 ? shippingOption2.optionId : str3, (i2 & 32) != 0 ? shippingOption2.optionType : num, (i2 & 64) != 0 ? shippingOption2.originCountryId : num2, (i2 & 128) != 0 ? shippingOption2.originPostalCode : str4, (i2 & 256) != 0 ? shippingOption2.shippingProfileType : num3);
    }

    public final float component1() {
        return this.cost;
    }

    public final float component2() {
        return this.costInUsd;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.optionId;
    }

    public final Integer component6() {
        return this.optionType;
    }

    public final Integer component7() {
        return this.originCountryId;
    }

    public final String component8() {
        return this.originPostalCode;
    }

    public final Integer component9() {
        return this.shippingProfileType;
    }

    public final ShippingOption copy(@C17402n(name = "cost") float f, @C17402n(name = "cost_in_usd") float f2, @C17402n(name = "currency_code") String str, @C17402n(name = "name") String str2, @C17402n(name = "option_id") String str3, @C17402n(name = "option_type") Integer num, @C17402n(name = "origin_country_id") Integer num2, @C17402n(name = "origin_postal_code") String str4, @C17402n(name = "shipping_profile_type") Integer num3) {
        return new ShippingOption(f, f2, str, str2, str3, num, num2, str4, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingOption)) {
            return false;
        }
        ShippingOption shippingOption = (ShippingOption) obj;
        return C19383o.m32792b(Float.valueOf(this.cost), Float.valueOf(shippingOption.cost)) && C19383o.m32792b(Float.valueOf(this.costInUsd), Float.valueOf(shippingOption.costInUsd)) && C19383o.m32792b(this.currencyCode, shippingOption.currencyCode) && C19383o.m32792b(this.name, shippingOption.name) && C19383o.m32792b(this.optionId, shippingOption.optionId) && C19383o.m32792b(this.optionType, shippingOption.optionType) && C19383o.m32792b(this.originCountryId, shippingOption.originCountryId) && C19383o.m32792b(this.originPostalCode, shippingOption.originPostalCode) && C19383o.m32792b(this.shippingProfileType, shippingOption.shippingProfileType);
    }

    public final float getCost() {
        return this.cost;
    }

    public final float getCostInUsd() {
        return this.costInUsd;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOptionId() {
        return this.optionId;
    }

    public final Integer getOptionType() {
        return this.optionType;
    }

    public final Integer getOriginCountryId() {
        return this.originCountryId;
    }

    public final String getOriginPostalCode() {
        return this.originPostalCode;
    }

    public final Integer getShippingProfileType() {
        return this.shippingProfileType;
    }

    public int hashCode() {
        int c = C0023f.m104c(this.costInUsd, Float.hashCode(this.cost) * 31, 31);
        String str = this.currencyCode;
        int i = 0;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.optionId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.optionType;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.originCountryId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.originPostalCode;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.shippingProfileType;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShippingOption(cost=");
        h.append(this.cost);
        h.append(", costInUsd=");
        h.append(this.costInUsd);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", name=");
        h.append(this.name);
        h.append(", optionId=");
        h.append(this.optionId);
        h.append(", optionType=");
        h.append(this.optionType);
        h.append(", originCountryId=");
        h.append(this.originCountryId);
        h.append(", originPostalCode=");
        h.append(this.originPostalCode);
        h.append(", shippingProfileType=");
        return C0023f.m109j(h, this.shippingProfileType, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShippingOption(float r14, float r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21, java.lang.Integer r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r16
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r17
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r18
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r19
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r20
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r21
        L_0x0033:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r22
        L_0x003b:
            r3 = r13
            r4 = r14
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ShippingOption.<init>(float, float, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
