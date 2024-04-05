package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class PastPurchaseShop {
    public static final int $stable = 0;
    private final String icon;
    private final String shopName;

    public PastPurchaseShop() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public PastPurchaseShop(@C17402n(name = "shop_name") String str, @C17402n(name = "icon_url_fullxfull") String str2) {
        this.shopName = str;
        this.icon = str2;
    }

    public static /* synthetic */ PastPurchaseShop copy$default(PastPurchaseShop pastPurchaseShop, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pastPurchaseShop.shopName;
        }
        if ((i & 2) != 0) {
            str2 = pastPurchaseShop.icon;
        }
        return pastPurchaseShop.copy(str, str2);
    }

    public final String component1() {
        return this.shopName;
    }

    public final String component2() {
        return this.icon;
    }

    public final PastPurchaseShop copy(@C17402n(name = "shop_name") String str, @C17402n(name = "icon_url_fullxfull") String str2) {
        return new PastPurchaseShop(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseShop)) {
            return false;
        }
        PastPurchaseShop pastPurchaseShop = (PastPurchaseShop) obj;
        return C19383o.m32792b(this.shopName, pastPurchaseShop.shopName) && C19383o.m32792b(this.icon, pastPurchaseShop.icon);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public int hashCode() {
        String str = this.shopName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseShop(shopName=");
        h.append(this.shopName);
        h.append(", icon=");
        return C0391c.m1057c(h, this.icon, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PastPurchaseShop(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
