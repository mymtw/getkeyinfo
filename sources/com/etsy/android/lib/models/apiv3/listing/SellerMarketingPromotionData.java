package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class SellerMarketingPromotionData {
    public static final int $stable = 0;
    private final String discountDesc;
    private final Integer discountedAmt;
    private final Money discountedMoney;
    private final String discountedPrice;
    private final Boolean hasMinimum;

    /* renamed from: id */
    private final Long f19145id;
    private final Integer minOrderAmt;
    private final Integer minOrderItems;
    private final Money minOrderMoney;
    private final Integer minSetItems;
    private final Money newOriginalPrice;
    private final Integer percentageDiscount;
    private final Money savingsMoney;
    private final String sellerDesc;
    private final Integer type;

    public SellerMarketingPromotionData(@C17402n(name = "id") Long l, @C17402n(name = "type") Integer num, @C17402n(name = "has_minimum") Boolean bool, @C17402n(name = "seller_desc") String str, @C17402n(name = "discount_desc") String str2, @C17402n(name = "discounted_price") String str3, @C17402n(name = "percentage_discount") Integer num2, @C17402n(name = "min_order_items") Integer num3, @C17402n(name = "min_set_items") Integer num4, @C17402n(name = "discounted_amt") Integer num5, @C17402n(name = "min_order_amt") Integer num6, @C17402n(name = "discounted_money") Money money, @C17402n(name = "new_original_price") Money money2, @C17402n(name = "min_order_money") Money money3, @C17402n(name = "savings_money") Money money4) {
        this.f19145id = l;
        this.type = num;
        this.hasMinimum = bool;
        this.sellerDesc = str;
        this.discountDesc = str2;
        this.discountedPrice = str3;
        this.percentageDiscount = num2;
        this.minOrderItems = num3;
        this.minSetItems = num4;
        this.discountedAmt = num5;
        this.minOrderAmt = num6;
        this.discountedMoney = money;
        this.newOriginalPrice = money2;
        this.minOrderMoney = money3;
        this.savingsMoney = money4;
    }

    public static /* synthetic */ SellerMarketingPromotionData copy$default(SellerMarketingPromotionData sellerMarketingPromotionData, Long l, Integer num, Boolean bool, String str, String str2, String str3, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Money money, Money money2, Money money3, Money money4, int i, Object obj) {
        SellerMarketingPromotionData sellerMarketingPromotionData2 = sellerMarketingPromotionData;
        int i2 = i;
        return sellerMarketingPromotionData.copy((i2 & 1) != 0 ? sellerMarketingPromotionData2.f19145id : l, (i2 & 2) != 0 ? sellerMarketingPromotionData2.type : num, (i2 & 4) != 0 ? sellerMarketingPromotionData2.hasMinimum : bool, (i2 & 8) != 0 ? sellerMarketingPromotionData2.sellerDesc : str, (i2 & 16) != 0 ? sellerMarketingPromotionData2.discountDesc : str2, (i2 & 32) != 0 ? sellerMarketingPromotionData2.discountedPrice : str3, (i2 & 64) != 0 ? sellerMarketingPromotionData2.percentageDiscount : num2, (i2 & 128) != 0 ? sellerMarketingPromotionData2.minOrderItems : num3, (i2 & 256) != 0 ? sellerMarketingPromotionData2.minSetItems : num4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? sellerMarketingPromotionData2.discountedAmt : num5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? sellerMarketingPromotionData2.minOrderAmt : num6, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? sellerMarketingPromotionData2.discountedMoney : money, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? sellerMarketingPromotionData2.newOriginalPrice : money2, (i2 & 8192) != 0 ? sellerMarketingPromotionData2.minOrderMoney : money3, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? sellerMarketingPromotionData2.savingsMoney : money4);
    }

    public final Long component1() {
        return this.f19145id;
    }

    public final Integer component10() {
        return this.discountedAmt;
    }

    public final Integer component11() {
        return this.minOrderAmt;
    }

    public final Money component12() {
        return this.discountedMoney;
    }

    public final Money component13() {
        return this.newOriginalPrice;
    }

    public final Money component14() {
        return this.minOrderMoney;
    }

    public final Money component15() {
        return this.savingsMoney;
    }

    public final Integer component2() {
        return this.type;
    }

    public final Boolean component3() {
        return this.hasMinimum;
    }

    public final String component4() {
        return this.sellerDesc;
    }

    public final String component5() {
        return this.discountDesc;
    }

    public final String component6() {
        return this.discountedPrice;
    }

    public final Integer component7() {
        return this.percentageDiscount;
    }

    public final Integer component8() {
        return this.minOrderItems;
    }

    public final Integer component9() {
        return this.minSetItems;
    }

    public final SellerMarketingPromotionData copy(@C17402n(name = "id") Long l, @C17402n(name = "type") Integer num, @C17402n(name = "has_minimum") Boolean bool, @C17402n(name = "seller_desc") String str, @C17402n(name = "discount_desc") String str2, @C17402n(name = "discounted_price") String str3, @C17402n(name = "percentage_discount") Integer num2, @C17402n(name = "min_order_items") Integer num3, @C17402n(name = "min_set_items") Integer num4, @C17402n(name = "discounted_amt") Integer num5, @C17402n(name = "min_order_amt") Integer num6, @C17402n(name = "discounted_money") Money money, @C17402n(name = "new_original_price") Money money2, @C17402n(name = "min_order_money") Money money3, @C17402n(name = "savings_money") Money money4) {
        return new SellerMarketingPromotionData(l, num, bool, str, str2, str3, num2, num3, num4, num5, num6, money, money2, money3, money4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerMarketingPromotionData)) {
            return false;
        }
        SellerMarketingPromotionData sellerMarketingPromotionData = (SellerMarketingPromotionData) obj;
        return C19383o.m32792b(this.f19145id, sellerMarketingPromotionData.f19145id) && C19383o.m32792b(this.type, sellerMarketingPromotionData.type) && C19383o.m32792b(this.hasMinimum, sellerMarketingPromotionData.hasMinimum) && C19383o.m32792b(this.sellerDesc, sellerMarketingPromotionData.sellerDesc) && C19383o.m32792b(this.discountDesc, sellerMarketingPromotionData.discountDesc) && C19383o.m32792b(this.discountedPrice, sellerMarketingPromotionData.discountedPrice) && C19383o.m32792b(this.percentageDiscount, sellerMarketingPromotionData.percentageDiscount) && C19383o.m32792b(this.minOrderItems, sellerMarketingPromotionData.minOrderItems) && C19383o.m32792b(this.minSetItems, sellerMarketingPromotionData.minSetItems) && C19383o.m32792b(this.discountedAmt, sellerMarketingPromotionData.discountedAmt) && C19383o.m32792b(this.minOrderAmt, sellerMarketingPromotionData.minOrderAmt) && C19383o.m32792b(this.discountedMoney, sellerMarketingPromotionData.discountedMoney) && C19383o.m32792b(this.newOriginalPrice, sellerMarketingPromotionData.newOriginalPrice) && C19383o.m32792b(this.minOrderMoney, sellerMarketingPromotionData.minOrderMoney) && C19383o.m32792b(this.savingsMoney, sellerMarketingPromotionData.savingsMoney);
    }

    public final String getDiscountDesc() {
        return this.discountDesc;
    }

    public final Integer getDiscountedAmt() {
        return this.discountedAmt;
    }

    public final Money getDiscountedMoney() {
        return this.discountedMoney;
    }

    public final String getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final Boolean getHasMinimum() {
        return this.hasMinimum;
    }

    public final Long getId() {
        return this.f19145id;
    }

    public final Integer getMinOrderAmt() {
        return this.minOrderAmt;
    }

    public final Integer getMinOrderItems() {
        return this.minOrderItems;
    }

    public final Money getMinOrderMoney() {
        return this.minOrderMoney;
    }

    public final Integer getMinSetItems() {
        return this.minSetItems;
    }

    public final Money getNewOriginalPrice() {
        return this.newOriginalPrice;
    }

    public final Integer getPercentageDiscount() {
        return this.percentageDiscount;
    }

    public final Money getSavingsMoney() {
        return this.savingsMoney;
    }

    public final String getSellerDesc() {
        return this.sellerDesc;
    }

    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Long l = this.f19145id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasMinimum;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.sellerDesc;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discountDesc;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountedPrice;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.percentageDiscount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minOrderItems;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minSetItems;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.discountedAmt;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.minOrderAmt;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Money money = this.discountedMoney;
        int hashCode12 = (hashCode11 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.newOriginalPrice;
        int hashCode13 = (hashCode12 + (money2 == null ? 0 : money2.hashCode())) * 31;
        Money money3 = this.minOrderMoney;
        int hashCode14 = (hashCode13 + (money3 == null ? 0 : money3.hashCode())) * 31;
        Money money4 = this.savingsMoney;
        if (money4 != null) {
            i = money4.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SellerMarketingPromotionData(id=");
        h.append(this.f19145id);
        h.append(", type=");
        h.append(this.type);
        h.append(", hasMinimum=");
        h.append(this.hasMinimum);
        h.append(", sellerDesc=");
        h.append(this.sellerDesc);
        h.append(", discountDesc=");
        h.append(this.discountDesc);
        h.append(", discountedPrice=");
        h.append(this.discountedPrice);
        h.append(", percentageDiscount=");
        h.append(this.percentageDiscount);
        h.append(", minOrderItems=");
        h.append(this.minOrderItems);
        h.append(", minSetItems=");
        h.append(this.minSetItems);
        h.append(", discountedAmt=");
        h.append(this.discountedAmt);
        h.append(", minOrderAmt=");
        h.append(this.minOrderAmt);
        h.append(", discountedMoney=");
        h.append(this.discountedMoney);
        h.append(", newOriginalPrice=");
        h.append(this.newOriginalPrice);
        h.append(", minOrderMoney=");
        h.append(this.minOrderMoney);
        h.append(", savingsMoney=");
        h.append(this.savingsMoney);
        h.append(')');
        return h.toString();
    }
}
