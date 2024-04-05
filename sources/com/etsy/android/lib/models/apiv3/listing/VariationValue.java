package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class VariationValue {
    public static final int $stable = 0;
    private final Money convertedPrice;
    private final Boolean isAvailable;
    private final Long listingVariationId;
    private final Money price;
    private final Money priceDiff;
    private final String rawValue;
    private final String value;
    private final Long valueId;

    public VariationValue() {
        this((Long) null, (Long) null, (String) null, (String) null, (Boolean) null, (Money) null, (Money) null, (Money) null, 255, (DefaultConstructorMarker) null);
    }

    public VariationValue(@C17402n(name = "listing_variation_id") Long l, @C17402n(name = "value_id") Long l2, @C17402n(name = "value") String str, @C17402n(name = "raw_value") String str2, @C17402n(name = "is_available") Boolean bool, @C17402n(name = "price_diff") Money money, @C17402n(name = "price") Money money2, @C17402n(name = "converted_price") Money money3) {
        this.listingVariationId = l;
        this.valueId = l2;
        this.value = str;
        this.rawValue = str2;
        this.isAvailable = bool;
        this.priceDiff = money;
        this.price = money2;
        this.convertedPrice = money3;
    }

    public static /* synthetic */ VariationValue copy$default(VariationValue variationValue, Long l, Long l2, String str, String str2, Boolean bool, Money money, Money money2, Money money3, int i, Object obj) {
        VariationValue variationValue2 = variationValue;
        int i2 = i;
        return variationValue.copy((i2 & 1) != 0 ? variationValue2.listingVariationId : l, (i2 & 2) != 0 ? variationValue2.valueId : l2, (i2 & 4) != 0 ? variationValue2.value : str, (i2 & 8) != 0 ? variationValue2.rawValue : str2, (i2 & 16) != 0 ? variationValue2.isAvailable : bool, (i2 & 32) != 0 ? variationValue2.priceDiff : money, (i2 & 64) != 0 ? variationValue2.price : money2, (i2 & 128) != 0 ? variationValue2.convertedPrice : money3);
    }

    public final Long component1() {
        return this.listingVariationId;
    }

    public final Long component2() {
        return this.valueId;
    }

    public final String component3() {
        return this.value;
    }

    public final String component4() {
        return this.rawValue;
    }

    public final Boolean component5() {
        return this.isAvailable;
    }

    public final Money component6() {
        return this.priceDiff;
    }

    public final Money component7() {
        return this.price;
    }

    public final Money component8() {
        return this.convertedPrice;
    }

    public final VariationValue copy(@C17402n(name = "listing_variation_id") Long l, @C17402n(name = "value_id") Long l2, @C17402n(name = "value") String str, @C17402n(name = "raw_value") String str2, @C17402n(name = "is_available") Boolean bool, @C17402n(name = "price_diff") Money money, @C17402n(name = "price") Money money2, @C17402n(name = "converted_price") Money money3) {
        return new VariationValue(l, l2, str, str2, bool, money, money2, money3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariationValue)) {
            return false;
        }
        VariationValue variationValue = (VariationValue) obj;
        return C19383o.m32792b(this.listingVariationId, variationValue.listingVariationId) && C19383o.m32792b(this.valueId, variationValue.valueId) && C19383o.m32792b(this.value, variationValue.value) && C19383o.m32792b(this.rawValue, variationValue.rawValue) && C19383o.m32792b(this.isAvailable, variationValue.isAvailable) && C19383o.m32792b(this.priceDiff, variationValue.priceDiff) && C19383o.m32792b(this.price, variationValue.price) && C19383o.m32792b(this.convertedPrice, variationValue.convertedPrice);
    }

    public final Money getConvertedPrice() {
        return this.convertedPrice;
    }

    public final Long getListingVariationId() {
        return this.listingVariationId;
    }

    public final Money getPrice() {
        return this.price;
    }

    public final Money getPriceDiff() {
        return this.priceDiff;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public final String getValue() {
        return this.value;
    }

    public final Long getValueId() {
        return this.valueId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = (r0 = r0.asEtsyMoney()).getAmount();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasPriceDifference() {
        /*
            r3 = this;
            com.etsy.android.lib.models.apiv3.listing.Money r0 = r3.priceDiff
            r1 = 0
            if (r0 == 0) goto L_0x001e
            com.etsy.android.lib.currency.EtsyMoney r0 = r0.asEtsyMoney()
            if (r0 == 0) goto L_0x001e
            java.math.BigDecimal r0 = r0.getAmount()
            if (r0 == 0) goto L_0x001e
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r1)
            int r0 = r0.compareTo(r2)
            r2 = 1
            if (r0 != r2) goto L_0x001e
            r1 = r2
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.VariationValue.hasPriceDifference():boolean");
    }

    public int hashCode() {
        Long l = this.listingVariationId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.valueId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.value;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rawValue;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAvailable;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Money money = this.priceDiff;
        int hashCode6 = (hashCode5 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.price;
        int hashCode7 = (hashCode6 + (money2 == null ? 0 : money2.hashCode())) * 31;
        Money money3 = this.convertedPrice;
        if (money3 != null) {
            i = money3.hashCode();
        }
        return hashCode7 + i;
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r1 = this;
            java.lang.String r0 = r1.value
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.VariationValue.toString():java.lang.String");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VariationValue(java.lang.Long r10, java.lang.Long r11, java.lang.String r12, java.lang.String r13, java.lang.Boolean r14, com.etsy.android.lib.models.apiv3.listing.Money r15, com.etsy.android.lib.models.apiv3.listing.Money r16, com.etsy.android.lib.models.apiv3.listing.Money r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.VariationValue.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, com.etsy.android.lib.models.apiv3.listing.Money, com.etsy.android.lib.models.apiv3.listing.Money, com.etsy.android.lib.models.apiv3.listing.Money, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
