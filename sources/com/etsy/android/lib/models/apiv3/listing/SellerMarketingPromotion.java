package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class SellerMarketingPromotion {
    public static final int $stable = 0;
    private final Long created;
    private final String currencyCode;
    private final String description;
    private final Long end;
    private final Integer fixedItemsInSetDiscount;
    private final Integer fixedOrderDiscount;

    /* renamed from: id */
    private final Long f19144id;
    private final Integer itemsInSetDiscountPct;
    private final Integer minNumItemsFromSet;
    private final Integer minNumOrderItems;
    private final Integer minOrderPrice;
    private final Integer orderDiscountPct;
    private final Integer shippingDiscountPct;
    private final Long start;
    private final Integer type;
    private final Long updated;
    private final Long venueId;

    public SellerMarketingPromotion() {
        this((Long) null, (String) null, (String) null, (Long) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, (Long) null, (Long) null, 131071, (DefaultConstructorMarker) null);
    }

    public SellerMarketingPromotion(@C17402n(name = "created") Long l, @C17402n(name = "currency_code") String str, @C17402n(name = "description") String str2, @C17402n(name = "end") Long l2, @C17402n(name = "fixed_items_in_set_discount") Integer num, @C17402n(name = "fixed_order_discount") Integer num2, @C17402n(name = "id") Long l3, @C17402n(name = "items_in_set_discount_pct") Integer num3, @C17402n(name = "min_num_items_from_set") Integer num4, @C17402n(name = "min_num_order_items") Integer num5, @C17402n(name = "min_order_price") Integer num6, @C17402n(name = "order_discount_pct") Integer num7, @C17402n(name = "shipping_discount_pct") Integer num8, @C17402n(name = "start") Long l4, @C17402n(name = "type") Integer num9, @C17402n(name = "updated") Long l5, @C17402n(name = "venue_id") Long l6) {
        this.created = l;
        this.currencyCode = str;
        this.description = str2;
        this.end = l2;
        this.fixedItemsInSetDiscount = num;
        this.fixedOrderDiscount = num2;
        this.f19144id = l3;
        this.itemsInSetDiscountPct = num3;
        this.minNumItemsFromSet = num4;
        this.minNumOrderItems = num5;
        this.minOrderPrice = num6;
        this.orderDiscountPct = num7;
        this.shippingDiscountPct = num8;
        this.start = l4;
        this.type = num9;
        this.updated = l5;
        this.venueId = l6;
    }

    public static /* synthetic */ SellerMarketingPromotion copy$default(SellerMarketingPromotion sellerMarketingPromotion, Long l, String str, String str2, Long l2, Integer num, Integer num2, Long l3, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l4, Integer num9, Long l5, Long l6, int i, Object obj) {
        SellerMarketingPromotion sellerMarketingPromotion2 = sellerMarketingPromotion;
        int i2 = i;
        return sellerMarketingPromotion.copy((i2 & 1) != 0 ? sellerMarketingPromotion2.created : l, (i2 & 2) != 0 ? sellerMarketingPromotion2.currencyCode : str, (i2 & 4) != 0 ? sellerMarketingPromotion2.description : str2, (i2 & 8) != 0 ? sellerMarketingPromotion2.end : l2, (i2 & 16) != 0 ? sellerMarketingPromotion2.fixedItemsInSetDiscount : num, (i2 & 32) != 0 ? sellerMarketingPromotion2.fixedOrderDiscount : num2, (i2 & 64) != 0 ? sellerMarketingPromotion2.f19144id : l3, (i2 & 128) != 0 ? sellerMarketingPromotion2.itemsInSetDiscountPct : num3, (i2 & 256) != 0 ? sellerMarketingPromotion2.minNumItemsFromSet : num4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? sellerMarketingPromotion2.minNumOrderItems : num5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? sellerMarketingPromotion2.minOrderPrice : num6, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? sellerMarketingPromotion2.orderDiscountPct : num7, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? sellerMarketingPromotion2.shippingDiscountPct : num8, (i2 & 8192) != 0 ? sellerMarketingPromotion2.start : l4, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? sellerMarketingPromotion2.type : num9, (i2 & 32768) != 0 ? sellerMarketingPromotion2.updated : l5, (i2 & 65536) != 0 ? sellerMarketingPromotion2.venueId : l6);
    }

    public final Long component1() {
        return this.created;
    }

    public final Integer component10() {
        return this.minNumOrderItems;
    }

    public final Integer component11() {
        return this.minOrderPrice;
    }

    public final Integer component12() {
        return this.orderDiscountPct;
    }

    public final Integer component13() {
        return this.shippingDiscountPct;
    }

    public final Long component14() {
        return this.start;
    }

    public final Integer component15() {
        return this.type;
    }

    public final Long component16() {
        return this.updated;
    }

    public final Long component17() {
        return this.venueId;
    }

    public final String component2() {
        return this.currencyCode;
    }

    public final String component3() {
        return this.description;
    }

    public final Long component4() {
        return this.end;
    }

    public final Integer component5() {
        return this.fixedItemsInSetDiscount;
    }

    public final Integer component6() {
        return this.fixedOrderDiscount;
    }

    public final Long component7() {
        return this.f19144id;
    }

    public final Integer component8() {
        return this.itemsInSetDiscountPct;
    }

    public final Integer component9() {
        return this.minNumItemsFromSet;
    }

    public final SellerMarketingPromotion copy(@C17402n(name = "created") Long l, @C17402n(name = "currency_code") String str, @C17402n(name = "description") String str2, @C17402n(name = "end") Long l2, @C17402n(name = "fixed_items_in_set_discount") Integer num, @C17402n(name = "fixed_order_discount") Integer num2, @C17402n(name = "id") Long l3, @C17402n(name = "items_in_set_discount_pct") Integer num3, @C17402n(name = "min_num_items_from_set") Integer num4, @C17402n(name = "min_num_order_items") Integer num5, @C17402n(name = "min_order_price") Integer num6, @C17402n(name = "order_discount_pct") Integer num7, @C17402n(name = "shipping_discount_pct") Integer num8, @C17402n(name = "start") Long l4, @C17402n(name = "type") Integer num9, @C17402n(name = "updated") Long l5, @C17402n(name = "venue_id") Long l6) {
        return new SellerMarketingPromotion(l, str, str2, l2, num, num2, l3, num3, num4, num5, num6, num7, num8, l4, num9, l5, l6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerMarketingPromotion)) {
            return false;
        }
        SellerMarketingPromotion sellerMarketingPromotion = (SellerMarketingPromotion) obj;
        return C19383o.m32792b(this.created, sellerMarketingPromotion.created) && C19383o.m32792b(this.currencyCode, sellerMarketingPromotion.currencyCode) && C19383o.m32792b(this.description, sellerMarketingPromotion.description) && C19383o.m32792b(this.end, sellerMarketingPromotion.end) && C19383o.m32792b(this.fixedItemsInSetDiscount, sellerMarketingPromotion.fixedItemsInSetDiscount) && C19383o.m32792b(this.fixedOrderDiscount, sellerMarketingPromotion.fixedOrderDiscount) && C19383o.m32792b(this.f19144id, sellerMarketingPromotion.f19144id) && C19383o.m32792b(this.itemsInSetDiscountPct, sellerMarketingPromotion.itemsInSetDiscountPct) && C19383o.m32792b(this.minNumItemsFromSet, sellerMarketingPromotion.minNumItemsFromSet) && C19383o.m32792b(this.minNumOrderItems, sellerMarketingPromotion.minNumOrderItems) && C19383o.m32792b(this.minOrderPrice, sellerMarketingPromotion.minOrderPrice) && C19383o.m32792b(this.orderDiscountPct, sellerMarketingPromotion.orderDiscountPct) && C19383o.m32792b(this.shippingDiscountPct, sellerMarketingPromotion.shippingDiscountPct) && C19383o.m32792b(this.start, sellerMarketingPromotion.start) && C19383o.m32792b(this.type, sellerMarketingPromotion.type) && C19383o.m32792b(this.updated, sellerMarketingPromotion.updated) && C19383o.m32792b(this.venueId, sellerMarketingPromotion.venueId);
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final Integer getFixedItemsInSetDiscount() {
        return this.fixedItemsInSetDiscount;
    }

    public final Integer getFixedOrderDiscount() {
        return this.fixedOrderDiscount;
    }

    public final Long getId() {
        return this.f19144id;
    }

    public final Integer getItemsInSetDiscountPct() {
        return this.itemsInSetDiscountPct;
    }

    public final Integer getMinNumItemsFromSet() {
        return this.minNumItemsFromSet;
    }

    public final Integer getMinNumOrderItems() {
        return this.minNumOrderItems;
    }

    public final Integer getMinOrderPrice() {
        return this.minOrderPrice;
    }

    public final Integer getOrderDiscountPct() {
        return this.orderDiscountPct;
    }

    public final Integer getShippingDiscountPct() {
        return this.shippingDiscountPct;
    }

    public final Long getStart() {
        return this.start;
    }

    public final Integer getType() {
        return this.type;
    }

    public final Long getUpdated() {
        return this.updated;
    }

    public final Long getVenueId() {
        return this.venueId;
    }

    public int hashCode() {
        Long l = this.created;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.currencyCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.end;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.fixedItemsInSetDiscount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fixedOrderDiscount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l3 = this.f19144id;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num3 = this.itemsInSetDiscountPct;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minNumItemsFromSet;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.minNumOrderItems;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.minOrderPrice;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.orderDiscountPct;
        int hashCode12 = (hashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.shippingDiscountPct;
        int hashCode13 = (hashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Long l4 = this.start;
        int hashCode14 = (hashCode13 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num9 = this.type;
        int hashCode15 = (hashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Long l5 = this.updated;
        int hashCode16 = (hashCode15 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.venueId;
        if (l6 != null) {
            i = l6.hashCode();
        }
        return hashCode16 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SellerMarketingPromotion(created=");
        h.append(this.created);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", description=");
        h.append(this.description);
        h.append(", end=");
        h.append(this.end);
        h.append(", fixedItemsInSetDiscount=");
        h.append(this.fixedItemsInSetDiscount);
        h.append(", fixedOrderDiscount=");
        h.append(this.fixedOrderDiscount);
        h.append(", id=");
        h.append(this.f19144id);
        h.append(", itemsInSetDiscountPct=");
        h.append(this.itemsInSetDiscountPct);
        h.append(", minNumItemsFromSet=");
        h.append(this.minNumItemsFromSet);
        h.append(", minNumOrderItems=");
        h.append(this.minNumOrderItems);
        h.append(", minOrderPrice=");
        h.append(this.minOrderPrice);
        h.append(", orderDiscountPct=");
        h.append(this.orderDiscountPct);
        h.append(", shippingDiscountPct=");
        h.append(this.shippingDiscountPct);
        h.append(", start=");
        h.append(this.start);
        h.append(", type=");
        h.append(this.type);
        h.append(", updated=");
        h.append(this.updated);
        h.append(", venueId=");
        h.append(this.venueId);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SellerMarketingPromotion(java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Long r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Long r32, java.lang.Integer r33, java.lang.Long r34, java.lang.Long r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r23
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r24
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r25
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r26
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r27
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r28
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r29
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r30
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r31
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r32
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r33
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r34
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r35
        L_0x0090:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotion.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
