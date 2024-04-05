package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class InventoryProductOffering {
    public static final int $stable = 0;
    private final Money basePrice;
    private final Integer channel;
    private final Money discountAmount;
    private final long offeringId;
    private final Integer percentageDiscount;
    private final Money price;
    private final long productId;
    private final Integer quantity;
    private final String state;
    private final Float unitPrice;
    private final String unitPriceString;
    private final String unitPriceStringPlus;
    private final InventoryProductOfferingWholesaleDecorator wholesaleDecorator;

    public InventoryProductOffering(@C17402n(name = "channel") Integer num, @C17402n(name = "offering_id") long j, @C17402n(name = "percentage_discount") Integer num2, @C17402n(name = "price") Money money, @C17402n(name = "product_id") long j2, @C17402n(name = "quantity") Integer num3, @C17402n(name = "state") String str, @C17402n(name = "unit_price") Float f, @C17402n(name = "unit_price_string") String str2, @C17402n(name = "unit_price_string_plus") String str3, @C17402n(name = "base_price") Money money2, @C17402n(name = "discount_amount") Money money3, @C17402n(name = "wholesale_decorator") InventoryProductOfferingWholesaleDecorator inventoryProductOfferingWholesaleDecorator) {
        C19383o.m32797g(money, ResponseConstants.PRICE);
        this.channel = num;
        this.offeringId = j;
        this.percentageDiscount = num2;
        this.price = money;
        this.productId = j2;
        this.quantity = num3;
        this.state = str;
        this.unitPrice = f;
        this.unitPriceString = str2;
        this.unitPriceStringPlus = str3;
        this.basePrice = money2;
        this.discountAmount = money3;
        this.wholesaleDecorator = inventoryProductOfferingWholesaleDecorator;
    }

    public static /* synthetic */ InventoryProductOffering copy$default(InventoryProductOffering inventoryProductOffering, Integer num, long j, Integer num2, Money money, long j2, Integer num3, String str, Float f, String str2, String str3, Money money2, Money money3, InventoryProductOfferingWholesaleDecorator inventoryProductOfferingWholesaleDecorator, int i, Object obj) {
        InventoryProductOffering inventoryProductOffering2 = inventoryProductOffering;
        int i2 = i;
        return inventoryProductOffering.copy((i2 & 1) != 0 ? inventoryProductOffering2.channel : num, (i2 & 2) != 0 ? inventoryProductOffering2.offeringId : j, (i2 & 4) != 0 ? inventoryProductOffering2.percentageDiscount : num2, (i2 & 8) != 0 ? inventoryProductOffering2.price : money, (i2 & 16) != 0 ? inventoryProductOffering2.productId : j2, (i2 & 32) != 0 ? inventoryProductOffering2.quantity : num3, (i2 & 64) != 0 ? inventoryProductOffering2.state : str, (i2 & 128) != 0 ? inventoryProductOffering2.unitPrice : f, (i2 & 256) != 0 ? inventoryProductOffering2.unitPriceString : str2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? inventoryProductOffering2.unitPriceStringPlus : str3, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? inventoryProductOffering2.basePrice : money2, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? inventoryProductOffering2.discountAmount : money3, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? inventoryProductOffering2.wholesaleDecorator : inventoryProductOfferingWholesaleDecorator);
    }

    public final Integer component1() {
        return this.channel;
    }

    public final String component10() {
        return this.unitPriceStringPlus;
    }

    public final Money component11() {
        return this.basePrice;
    }

    public final Money component12() {
        return this.discountAmount;
    }

    public final InventoryProductOfferingWholesaleDecorator component13() {
        return this.wholesaleDecorator;
    }

    public final long component2() {
        return this.offeringId;
    }

    public final Integer component3() {
        return this.percentageDiscount;
    }

    public final Money component4() {
        return this.price;
    }

    public final long component5() {
        return this.productId;
    }

    public final Integer component6() {
        return this.quantity;
    }

    public final String component7() {
        return this.state;
    }

    public final Float component8() {
        return this.unitPrice;
    }

    public final String component9() {
        return this.unitPriceString;
    }

    public final InventoryProductOffering copy(@C17402n(name = "channel") Integer num, @C17402n(name = "offering_id") long j, @C17402n(name = "percentage_discount") Integer num2, @C17402n(name = "price") Money money, @C17402n(name = "product_id") long j2, @C17402n(name = "quantity") Integer num3, @C17402n(name = "state") String str, @C17402n(name = "unit_price") Float f, @C17402n(name = "unit_price_string") String str2, @C17402n(name = "unit_price_string_plus") String str3, @C17402n(name = "base_price") Money money2, @C17402n(name = "discount_amount") Money money3, @C17402n(name = "wholesale_decorator") InventoryProductOfferingWholesaleDecorator inventoryProductOfferingWholesaleDecorator) {
        Money money4 = money;
        C19383o.m32797g(money4, ResponseConstants.PRICE);
        return new InventoryProductOffering(num, j, num2, money4, j2, num3, str, f, str2, str3, money2, money3, inventoryProductOfferingWholesaleDecorator);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InventoryProductOffering)) {
            return false;
        }
        InventoryProductOffering inventoryProductOffering = (InventoryProductOffering) obj;
        return C19383o.m32792b(this.channel, inventoryProductOffering.channel) && this.offeringId == inventoryProductOffering.offeringId && C19383o.m32792b(this.percentageDiscount, inventoryProductOffering.percentageDiscount) && C19383o.m32792b(this.price, inventoryProductOffering.price) && this.productId == inventoryProductOffering.productId && C19383o.m32792b(this.quantity, inventoryProductOffering.quantity) && C19383o.m32792b(this.state, inventoryProductOffering.state) && C19383o.m32792b(this.unitPrice, inventoryProductOffering.unitPrice) && C19383o.m32792b(this.unitPriceString, inventoryProductOffering.unitPriceString) && C19383o.m32792b(this.unitPriceStringPlus, inventoryProductOffering.unitPriceStringPlus) && C19383o.m32792b(this.basePrice, inventoryProductOffering.basePrice) && C19383o.m32792b(this.discountAmount, inventoryProductOffering.discountAmount) && C19383o.m32792b(this.wholesaleDecorator, inventoryProductOffering.wholesaleDecorator);
    }

    public final Money getBasePrice() {
        return this.basePrice;
    }

    public final Integer getChannel() {
        return this.channel;
    }

    public final Money getDiscountAmount() {
        return this.discountAmount;
    }

    public final long getOfferingId() {
        return this.offeringId;
    }

    public final Integer getPercentageDiscount() {
        return this.percentageDiscount;
    }

    public final Money getPrice() {
        return this.price;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getState() {
        return this.state;
    }

    public final Float getUnitPrice() {
        return this.unitPrice;
    }

    public final String getUnitPriceString() {
        return this.unitPriceString;
    }

    public final String getUnitPriceStringPlus() {
        return this.unitPriceStringPlus;
    }

    public final InventoryProductOfferingWholesaleDecorator getWholesaleDecorator() {
        return this.wholesaleDecorator;
    }

    public int hashCode() {
        Integer num = this.channel;
        int i = 0;
        int b = C0071c.m190b(this.offeringId, (num == null ? 0 : num.hashCode()) * 31, 31);
        Integer num2 = this.percentageDiscount;
        int b2 = C0071c.m190b(this.productId, (this.price.hashCode() + ((b + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31, 31);
        Integer num3 = this.quantity;
        int hashCode = (b2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.state;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.unitPrice;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.unitPriceString;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unitPriceStringPlus;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Money money = this.basePrice;
        int hashCode6 = (hashCode5 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.discountAmount;
        int hashCode7 = (hashCode6 + (money2 == null ? 0 : money2.hashCode())) * 31;
        InventoryProductOfferingWholesaleDecorator inventoryProductOfferingWholesaleDecorator = this.wholesaleDecorator;
        if (inventoryProductOfferingWholesaleDecorator != null) {
            i = inventoryProductOfferingWholesaleDecorator.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InventoryProductOffering(channel=");
        h.append(this.channel);
        h.append(", offeringId=");
        h.append(this.offeringId);
        h.append(", percentageDiscount=");
        h.append(this.percentageDiscount);
        h.append(", price=");
        h.append(this.price);
        h.append(", productId=");
        h.append(this.productId);
        h.append(", quantity=");
        h.append(this.quantity);
        h.append(", state=");
        h.append(this.state);
        h.append(", unitPrice=");
        h.append(this.unitPrice);
        h.append(", unitPriceString=");
        h.append(this.unitPriceString);
        h.append(", unitPriceStringPlus=");
        h.append(this.unitPriceStringPlus);
        h.append(", basePrice=");
        h.append(this.basePrice);
        h.append(", discountAmount=");
        h.append(this.discountAmount);
        h.append(", wholesaleDecorator=");
        h.append(this.wholesaleDecorator);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InventoryProductOffering(java.lang.Integer r20, long r21, java.lang.Integer r23, com.etsy.android.lib.models.apiv3.listing.Money r24, long r25, java.lang.Integer r27, java.lang.String r28, java.lang.Float r29, java.lang.String r30, java.lang.String r31, com.etsy.android.lib.models.apiv3.listing.Money r32, com.etsy.android.lib.models.apiv3.listing.Money r33, com.etsy.android.lib.models.apiv3.listing.InventoryProductOfferingWholesaleDecorator r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r20
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r23
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r27
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r12 = r2
            goto L_0x0023
        L_0x0021:
            r12 = r28
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r13 = r2
            goto L_0x002b
        L_0x0029:
            r13 = r29
        L_0x002b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0031
            r14 = r2
            goto L_0x0033
        L_0x0031:
            r14 = r30
        L_0x0033:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0039
            r15 = r2
            goto L_0x003b
        L_0x0039:
            r15 = r31
        L_0x003b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0042
            r16 = r2
            goto L_0x0044
        L_0x0042:
            r16 = r32
        L_0x0044:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x004b
            r17 = r2
            goto L_0x004d
        L_0x004b:
            r17 = r33
        L_0x004d:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0054
            r18 = r2
            goto L_0x0056
        L_0x0054:
            r18 = r34
        L_0x0056:
            r3 = r19
            r5 = r21
            r8 = r24
            r9 = r25
            r3.<init>(r4, r5, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering.<init>(java.lang.Integer, long, java.lang.Integer, com.etsy.android.lib.models.apiv3.listing.Money, long, java.lang.Integer, java.lang.String, java.lang.Float, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.Money, com.etsy.android.lib.models.apiv3.listing.Money, com.etsy.android.lib.models.apiv3.listing.InventoryProductOfferingWholesaleDecorator, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
