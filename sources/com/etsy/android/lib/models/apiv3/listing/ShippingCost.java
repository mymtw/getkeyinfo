package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShippingCost {
    public static final int $stable = 0;
    private final String currency;
    private final String currencySymbol;
    private final String price;

    public ShippingCost(@C17402n(name = "currency") String str, @C17402n(name = "currency_symbol") String str2, @C17402n(name = "price") String str3) {
        this.currency = str;
        this.currencySymbol = str2;
        this.price = str3;
    }

    public static /* synthetic */ ShippingCost copy$default(ShippingCost shippingCost, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingCost.currency;
        }
        if ((i & 2) != 0) {
            str2 = shippingCost.currencySymbol;
        }
        if ((i & 4) != 0) {
            str3 = shippingCost.price;
        }
        return shippingCost.copy(str, str2, str3);
    }

    public final String component1() {
        return this.currency;
    }

    public final String component2() {
        return this.currencySymbol;
    }

    public final String component3() {
        return this.price;
    }

    public final ShippingCost copy(@C17402n(name = "currency") String str, @C17402n(name = "currency_symbol") String str2, @C17402n(name = "price") String str3) {
        return new ShippingCost(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingCost)) {
            return false;
        }
        ShippingCost shippingCost = (ShippingCost) obj;
        return C19383o.m32792b(this.currency, shippingCost.currency) && C19383o.m32792b(this.currencySymbol, shippingCost.currencySymbol) && C19383o.m32792b(this.price, shippingCost.price);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getPrice() {
        return this.price;
    }

    public int hashCode() {
        String str = this.currency;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencySymbol;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.price;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShippingCost(currency=");
        h.append(this.currency);
        h.append(", currencySymbol=");
        h.append(this.currencySymbol);
        h.append(", price=");
        return C0391c.m1057c(h, this.price, ')');
    }
}
