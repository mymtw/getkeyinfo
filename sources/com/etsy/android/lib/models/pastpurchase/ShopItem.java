package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopItem {
    public static final int $stable = 0;
    private final String iconUrlFullxfull;
    private final Integer shopId;
    private final String shopName;

    public ShopItem(@C17402n(name = "shop_id") Integer num, @C17402n(name = "icon_url_fullxfull") String str, @C17402n(name = "shop_name") String str2) {
        this.shopId = num;
        this.iconUrlFullxfull = str;
        this.shopName = str2;
    }

    public static /* synthetic */ ShopItem copy$default(ShopItem shopItem, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shopItem.shopId;
        }
        if ((i & 2) != 0) {
            str = shopItem.iconUrlFullxfull;
        }
        if ((i & 4) != 0) {
            str2 = shopItem.shopName;
        }
        return shopItem.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.shopId;
    }

    public final String component2() {
        return this.iconUrlFullxfull;
    }

    public final String component3() {
        return this.shopName;
    }

    public final ShopItem copy(@C17402n(name = "shop_id") Integer num, @C17402n(name = "icon_url_fullxfull") String str, @C17402n(name = "shop_name") String str2) {
        return new ShopItem(num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopItem)) {
            return false;
        }
        ShopItem shopItem = (ShopItem) obj;
        return C19383o.m32792b(this.shopId, shopItem.shopId) && C19383o.m32792b(this.iconUrlFullxfull, shopItem.iconUrlFullxfull) && C19383o.m32792b(this.shopName, shopItem.shopName);
    }

    public final String getIconUrlFullxfull() {
        return this.iconUrlFullxfull;
    }

    public final Integer getShopId() {
        return this.shopId;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public int hashCode() {
        Integer num = this.shopId;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.iconUrlFullxfull;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shopName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopItem(shopId=");
        h.append(this.shopId);
        h.append(", iconUrlFullxfull=");
        h.append(this.iconUrlFullxfull);
        h.append(", shopName=");
        return C0391c.m1057c(h, this.shopName, ')');
    }
}
