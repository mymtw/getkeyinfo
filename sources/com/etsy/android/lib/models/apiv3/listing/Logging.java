package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class Logging {
    public static final int $stable = 0;
    private final String sellerCurrency;
    private final String sellerCurrencyPrice;
    private final Integer sellerCurrencyPriceInt;

    public Logging(@C17402n(name = "seller_currency") String str, @C17402n(name = "seller_currency_price") String str2, @C17402n(name = "seller_currency_price_int") Integer num) {
        this.sellerCurrency = str;
        this.sellerCurrencyPrice = str2;
        this.sellerCurrencyPriceInt = num;
    }

    public static /* synthetic */ Logging copy$default(Logging logging, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logging.sellerCurrency;
        }
        if ((i & 2) != 0) {
            str2 = logging.sellerCurrencyPrice;
        }
        if ((i & 4) != 0) {
            num = logging.sellerCurrencyPriceInt;
        }
        return logging.copy(str, str2, num);
    }

    public final String component1() {
        return this.sellerCurrency;
    }

    public final String component2() {
        return this.sellerCurrencyPrice;
    }

    public final Integer component3() {
        return this.sellerCurrencyPriceInt;
    }

    public final Logging copy(@C17402n(name = "seller_currency") String str, @C17402n(name = "seller_currency_price") String str2, @C17402n(name = "seller_currency_price_int") Integer num) {
        return new Logging(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Logging)) {
            return false;
        }
        Logging logging = (Logging) obj;
        return C19383o.m32792b(this.sellerCurrency, logging.sellerCurrency) && C19383o.m32792b(this.sellerCurrencyPrice, logging.sellerCurrencyPrice) && C19383o.m32792b(this.sellerCurrencyPriceInt, logging.sellerCurrencyPriceInt);
    }

    public final String getSellerCurrency() {
        return this.sellerCurrency;
    }

    public final String getSellerCurrencyPrice() {
        return this.sellerCurrencyPrice;
    }

    public final Integer getSellerCurrencyPriceInt() {
        return this.sellerCurrencyPriceInt;
    }

    public int hashCode() {
        String str = this.sellerCurrency;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sellerCurrencyPrice;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sellerCurrencyPriceInt;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Logging(sellerCurrency=");
        h.append(this.sellerCurrency);
        h.append(", sellerCurrencyPrice=");
        h.append(this.sellerCurrencyPrice);
        h.append(", sellerCurrencyPriceInt=");
        return C0023f.m109j(h, this.sellerCurrencyPriceInt, ')');
    }
}
