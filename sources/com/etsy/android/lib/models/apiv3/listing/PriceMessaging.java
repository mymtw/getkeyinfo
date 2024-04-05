package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class PriceMessaging {
    public static final int $stable = 0;
    private final Boolean hasTransparentPricing;
    private final Boolean isVatInclusive;
    private final String shippingCostsMessage;
    private final String transparentPriceMessage;
    private final String vatInclusiveMessage;

    public PriceMessaging() {
        this((Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public PriceMessaging(@C17402n(name = "has_transparent_pricing") Boolean bool, @C17402n(name = "is_vat_inclusive") Boolean bool2, @C17402n(name = "shipping_costs_message") String str, @C17402n(name = "transparent_price_message") String str2, @C17402n(name = "vat_inclusive_message") String str3) {
        this.hasTransparentPricing = bool;
        this.isVatInclusive = bool2;
        this.shippingCostsMessage = str;
        this.transparentPriceMessage = str2;
        this.vatInclusiveMessage = str3;
    }

    public static /* synthetic */ PriceMessaging copy$default(PriceMessaging priceMessaging, Boolean bool, Boolean bool2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = priceMessaging.hasTransparentPricing;
        }
        if ((i & 2) != 0) {
            bool2 = priceMessaging.isVatInclusive;
        }
        Boolean bool3 = bool2;
        if ((i & 4) != 0) {
            str = priceMessaging.shippingCostsMessage;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = priceMessaging.transparentPriceMessage;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = priceMessaging.vatInclusiveMessage;
        }
        return priceMessaging.copy(bool, bool3, str4, str5, str3);
    }

    public final Boolean component1() {
        return this.hasTransparentPricing;
    }

    public final Boolean component2() {
        return this.isVatInclusive;
    }

    public final String component3() {
        return this.shippingCostsMessage;
    }

    public final String component4() {
        return this.transparentPriceMessage;
    }

    public final String component5() {
        return this.vatInclusiveMessage;
    }

    public final PriceMessaging copy(@C17402n(name = "has_transparent_pricing") Boolean bool, @C17402n(name = "is_vat_inclusive") Boolean bool2, @C17402n(name = "shipping_costs_message") String str, @C17402n(name = "transparent_price_message") String str2, @C17402n(name = "vat_inclusive_message") String str3) {
        return new PriceMessaging(bool, bool2, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceMessaging)) {
            return false;
        }
        PriceMessaging priceMessaging = (PriceMessaging) obj;
        return C19383o.m32792b(this.hasTransparentPricing, priceMessaging.hasTransparentPricing) && C19383o.m32792b(this.isVatInclusive, priceMessaging.isVatInclusive) && C19383o.m32792b(this.shippingCostsMessage, priceMessaging.shippingCostsMessage) && C19383o.m32792b(this.transparentPriceMessage, priceMessaging.transparentPriceMessage) && C19383o.m32792b(this.vatInclusiveMessage, priceMessaging.vatInclusiveMessage);
    }

    public final Boolean getHasTransparentPricing() {
        return this.hasTransparentPricing;
    }

    public final String getShippingCostsMessage() {
        return this.shippingCostsMessage;
    }

    public final String getTransparentPriceMessage() {
        return this.transparentPriceMessage;
    }

    public final String getVatInclusiveMessage() {
        return this.vatInclusiveMessage;
    }

    public int hashCode() {
        Boolean bool = this.hasTransparentPricing;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isVatInclusive;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.shippingCostsMessage;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transparentPriceMessage;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vatInclusiveMessage;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public final Boolean isVatInclusive() {
        return this.isVatInclusive;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PriceMessaging(hasTransparentPricing=");
        h.append(this.hasTransparentPricing);
        h.append(", isVatInclusive=");
        h.append(this.isVatInclusive);
        h.append(", shippingCostsMessage=");
        h.append(this.shippingCostsMessage);
        h.append(", transparentPriceMessage=");
        h.append(this.transparentPriceMessage);
        h.append(", vatInclusiveMessage=");
        return C0391c.m1057c(h, this.vatInclusiveMessage, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PriceMessaging(java.lang.Boolean r5, java.lang.Boolean r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.PriceMessaging.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
