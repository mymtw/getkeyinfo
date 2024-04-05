package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class InventoryProductOfferingWholesaleDecorator {
    public static final int $stable = 0;
    private final Integer minimumQuantity;
    private final Long productOfferingId;
    private final Money retailPrice;
    private final Long shopId;

    public InventoryProductOfferingWholesaleDecorator(@C17402n(name = "shop_id") Long l, @C17402n(name = "product_offering_id") Long l2, @C17402n(name = "minimum_quantity") Integer num, @C17402n(name = "retail_price") Money money) {
        this.shopId = l;
        this.productOfferingId = l2;
        this.minimumQuantity = num;
        this.retailPrice = money;
    }

    public static /* synthetic */ InventoryProductOfferingWholesaleDecorator copy$default(InventoryProductOfferingWholesaleDecorator inventoryProductOfferingWholesaleDecorator, Long l, Long l2, Integer num, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            l = inventoryProductOfferingWholesaleDecorator.shopId;
        }
        if ((i & 2) != 0) {
            l2 = inventoryProductOfferingWholesaleDecorator.productOfferingId;
        }
        if ((i & 4) != 0) {
            num = inventoryProductOfferingWholesaleDecorator.minimumQuantity;
        }
        if ((i & 8) != 0) {
            money = inventoryProductOfferingWholesaleDecorator.retailPrice;
        }
        return inventoryProductOfferingWholesaleDecorator.copy(l, l2, num, money);
    }

    public final Long component1() {
        return this.shopId;
    }

    public final Long component2() {
        return this.productOfferingId;
    }

    public final Integer component3() {
        return this.minimumQuantity;
    }

    public final Money component4() {
        return this.retailPrice;
    }

    public final InventoryProductOfferingWholesaleDecorator copy(@C17402n(name = "shop_id") Long l, @C17402n(name = "product_offering_id") Long l2, @C17402n(name = "minimum_quantity") Integer num, @C17402n(name = "retail_price") Money money) {
        return new InventoryProductOfferingWholesaleDecorator(l, l2, num, money);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InventoryProductOfferingWholesaleDecorator)) {
            return false;
        }
        InventoryProductOfferingWholesaleDecorator inventoryProductOfferingWholesaleDecorator = (InventoryProductOfferingWholesaleDecorator) obj;
        return C19383o.m32792b(this.shopId, inventoryProductOfferingWholesaleDecorator.shopId) && C19383o.m32792b(this.productOfferingId, inventoryProductOfferingWholesaleDecorator.productOfferingId) && C19383o.m32792b(this.minimumQuantity, inventoryProductOfferingWholesaleDecorator.minimumQuantity) && C19383o.m32792b(this.retailPrice, inventoryProductOfferingWholesaleDecorator.retailPrice);
    }

    public final Integer getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public final Long getProductOfferingId() {
        return this.productOfferingId;
    }

    public final Money getRetailPrice() {
        return this.retailPrice;
    }

    public final Long getShopId() {
        return this.shopId;
    }

    public int hashCode() {
        Long l = this.shopId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.productOfferingId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.minimumQuantity;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Money money = this.retailPrice;
        if (money != null) {
            i = money.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InventoryProductOfferingWholesaleDecorator(shopId=");
        h.append(this.shopId);
        h.append(", productOfferingId=");
        h.append(this.productOfferingId);
        h.append(", minimumQuantity=");
        h.append(this.minimumQuantity);
        h.append(", retailPrice=");
        h.append(this.retailPrice);
        h.append(')');
        return h.toString();
    }
}
