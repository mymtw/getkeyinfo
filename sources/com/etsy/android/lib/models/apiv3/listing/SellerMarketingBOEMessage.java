package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class SellerMarketingBOEMessage {
    public static final int $stable = 8;
    private final String description;
    private final String disclaimer;
    private final FormattedMoney discountDescription;
    private final Money discountedPrice;
    private final Boolean hasFreeShipping;
    private final Boolean hasMinimumCondition;
    private final SellerMarketingPromotion promoData;
    private final String sellerDescription;

    public SellerMarketingBOEMessage() {
        this((String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (FormattedMoney) null, (Money) null, (SellerMarketingPromotion) null, 255, (DefaultConstructorMarker) null);
    }

    public SellerMarketingBOEMessage(@C17402n(name = "description") String str, @C17402n(name = "seller_description") String str2, @C17402n(name = "disclaimer") String str3, @C17402n(name = "has_minimum_condition") Boolean bool, @C17402n(name = "has_free_shipping") Boolean bool2, @C17402n(name = "discount_description") FormattedMoney formattedMoney, @C17402n(name = "discounted_price") Money money, @C17402n(name = "promo_data") SellerMarketingPromotion sellerMarketingPromotion) {
        this.description = str;
        this.sellerDescription = str2;
        this.disclaimer = str3;
        this.hasMinimumCondition = bool;
        this.hasFreeShipping = bool2;
        this.discountDescription = formattedMoney;
        this.discountedPrice = money;
        this.promoData = sellerMarketingPromotion;
    }

    public static /* synthetic */ SellerMarketingBOEMessage copy$default(SellerMarketingBOEMessage sellerMarketingBOEMessage, String str, String str2, String str3, Boolean bool, Boolean bool2, FormattedMoney formattedMoney, Money money, SellerMarketingPromotion sellerMarketingPromotion, int i, Object obj) {
        SellerMarketingBOEMessage sellerMarketingBOEMessage2 = sellerMarketingBOEMessage;
        int i2 = i;
        return sellerMarketingBOEMessage.copy((i2 & 1) != 0 ? sellerMarketingBOEMessage2.description : str, (i2 & 2) != 0 ? sellerMarketingBOEMessage2.sellerDescription : str2, (i2 & 4) != 0 ? sellerMarketingBOEMessage2.disclaimer : str3, (i2 & 8) != 0 ? sellerMarketingBOEMessage2.hasMinimumCondition : bool, (i2 & 16) != 0 ? sellerMarketingBOEMessage2.hasFreeShipping : bool2, (i2 & 32) != 0 ? sellerMarketingBOEMessage2.discountDescription : formattedMoney, (i2 & 64) != 0 ? sellerMarketingBOEMessage2.discountedPrice : money, (i2 & 128) != 0 ? sellerMarketingBOEMessage2.promoData : sellerMarketingPromotion);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.sellerDescription;
    }

    public final String component3() {
        return this.disclaimer;
    }

    public final Boolean component4() {
        return this.hasMinimumCondition;
    }

    public final Boolean component5() {
        return this.hasFreeShipping;
    }

    public final FormattedMoney component6() {
        return this.discountDescription;
    }

    public final Money component7() {
        return this.discountedPrice;
    }

    public final SellerMarketingPromotion component8() {
        return this.promoData;
    }

    public final SellerMarketingBOEMessage copy(@C17402n(name = "description") String str, @C17402n(name = "seller_description") String str2, @C17402n(name = "disclaimer") String str3, @C17402n(name = "has_minimum_condition") Boolean bool, @C17402n(name = "has_free_shipping") Boolean bool2, @C17402n(name = "discount_description") FormattedMoney formattedMoney, @C17402n(name = "discounted_price") Money money, @C17402n(name = "promo_data") SellerMarketingPromotion sellerMarketingPromotion) {
        return new SellerMarketingBOEMessage(str, str2, str3, bool, bool2, formattedMoney, money, sellerMarketingPromotion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerMarketingBOEMessage)) {
            return false;
        }
        SellerMarketingBOEMessage sellerMarketingBOEMessage = (SellerMarketingBOEMessage) obj;
        return C19383o.m32792b(this.description, sellerMarketingBOEMessage.description) && C19383o.m32792b(this.sellerDescription, sellerMarketingBOEMessage.sellerDescription) && C19383o.m32792b(this.disclaimer, sellerMarketingBOEMessage.disclaimer) && C19383o.m32792b(this.hasMinimumCondition, sellerMarketingBOEMessage.hasMinimumCondition) && C19383o.m32792b(this.hasFreeShipping, sellerMarketingBOEMessage.hasFreeShipping) && C19383o.m32792b(this.discountDescription, sellerMarketingBOEMessage.discountDescription) && C19383o.m32792b(this.discountedPrice, sellerMarketingBOEMessage.discountedPrice) && C19383o.m32792b(this.promoData, sellerMarketingBOEMessage.promoData);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final FormattedMoney getDiscountDescription() {
        return this.discountDescription;
    }

    public final Money getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final Boolean getHasFreeShipping() {
        return this.hasFreeShipping;
    }

    public final Boolean getHasMinimumCondition() {
        return this.hasMinimumCondition;
    }

    public final SellerMarketingPromotion getPromoData() {
        return this.promoData;
    }

    public final String getSellerDescription() {
        return this.sellerDescription;
    }

    public int hashCode() {
        String str = this.description;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sellerDescription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclaimer;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hasMinimumCondition;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasFreeShipping;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FormattedMoney formattedMoney = this.discountDescription;
        int hashCode6 = (hashCode5 + (formattedMoney == null ? 0 : formattedMoney.hashCode())) * 31;
        Money money = this.discountedPrice;
        int hashCode7 = (hashCode6 + (money == null ? 0 : money.hashCode())) * 31;
        SellerMarketingPromotion sellerMarketingPromotion = this.promoData;
        if (sellerMarketingPromotion != null) {
            i = sellerMarketingPromotion.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SellerMarketingBOEMessage(description=");
        h.append(this.description);
        h.append(", sellerDescription=");
        h.append(this.sellerDescription);
        h.append(", disclaimer=");
        h.append(this.disclaimer);
        h.append(", hasMinimumCondition=");
        h.append(this.hasMinimumCondition);
        h.append(", hasFreeShipping=");
        h.append(this.hasFreeShipping);
        h.append(", discountDescription=");
        h.append(this.discountDescription);
        h.append(", discountedPrice=");
        h.append(this.discountedPrice);
        h.append(", promoData=");
        h.append(this.promoData);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SellerMarketingBOEMessage(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Boolean r13, java.lang.Boolean r14, com.etsy.android.lib.models.apiv3.listing.FormattedMoney r15, com.etsy.android.lib.models.apiv3.listing.Money r16, com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotion r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.etsy.android.lib.models.apiv3.listing.FormattedMoney, com.etsy.android.lib.models.apiv3.listing.Money, com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotion, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
