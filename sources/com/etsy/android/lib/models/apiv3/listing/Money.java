package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.io.Serializable;
import java.util.Currency;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;

@C17403o(generateAdapter = true)
public final class Money implements Serializable {
    public static final int $stable = 0;
    private final String _amount;
    private final String currencyCode;
    private final String currencyFormattedLong;
    private final String currencyFormattedRaw;
    private final String currencyFormattedShort;
    private final int divisor;

    public Money(@C17402n(name = "amount") String str, @C17402n(name = "currency_code") String str2, @C17402n(name = "currency_formatted_long") String str3, @C17402n(name = "currency_formatted_raw") String str4, @C17402n(name = "currency_formatted_short") String str5, @C17402n(name = "divisor") int i) {
        this._amount = str;
        this.currencyCode = str2;
        this.currencyFormattedLong = str3;
        this.currencyFormattedRaw = str4;
        this.currencyFormattedShort = str5;
        this.divisor = i;
    }

    public static /* synthetic */ Money copy$default(Money money, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = money._amount;
        }
        if ((i2 & 2) != 0) {
            str2 = money.currencyCode;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = money.currencyFormattedLong;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = money.currencyFormattedRaw;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = money.currencyFormattedShort;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = money.divisor;
        }
        return money.copy(str, str6, str7, str8, str9, i);
    }

    public static /* synthetic */ void get_amount$annotations() {
    }

    public final EtsyMoney asEtsyMoney() {
        C8630b bVar = C8630b.f18964e;
        if (bVar != null) {
            Currency instance = Currency.getInstance(StringEscapeUtils.unescapeHtml4(this.currencyCode));
            C19383o.m32796f(instance, "getInstance(currencyCode.unescapeHtml4())");
            String str = this._amount;
            if (str == null) {
                str = "";
            }
            return bVar.mo21249b(instance, str, this.divisor);
        }
        C19383o.m32805o("instance");
        throw null;
    }

    public final String component1() {
        return this._amount;
    }

    public final String component2() {
        return this.currencyCode;
    }

    public final String component3() {
        return this.currencyFormattedLong;
    }

    public final String component4() {
        return this.currencyFormattedRaw;
    }

    public final String component5() {
        return this.currencyFormattedShort;
    }

    public final int component6() {
        return this.divisor;
    }

    public final Money copy(@C17402n(name = "amount") String str, @C17402n(name = "currency_code") String str2, @C17402n(name = "currency_formatted_long") String str3, @C17402n(name = "currency_formatted_raw") String str4, @C17402n(name = "currency_formatted_short") String str5, @C17402n(name = "divisor") int i) {
        return new Money(str, str2, str3, str4, str5, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        return C19383o.m32792b(this._amount, money._amount) && C19383o.m32792b(this.currencyCode, money.currencyCode) && C19383o.m32792b(this.currencyFormattedLong, money.currencyFormattedLong) && C19383o.m32792b(this.currencyFormattedRaw, money.currencyFormattedRaw) && C19383o.m32792b(this.currencyFormattedShort, money.currencyFormattedShort) && this.divisor == money.divisor;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getCurrencyFormattedLong() {
        return this.currencyFormattedLong;
    }

    public final String getCurrencyFormattedRaw() {
        return this.currencyFormattedRaw;
    }

    public final String getCurrencyFormattedShort() {
        return this.currencyFormattedShort;
    }

    public final int getDivisor() {
        return this.divisor;
    }

    public final String get_amount() {
        return this._amount;
    }

    public int hashCode() {
        String str = this._amount;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyFormattedLong;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyFormattedRaw;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencyFormattedShort;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return Integer.hashCode(this.divisor) + ((hashCode4 + i) * 31);
    }

    public String toString() {
        return asEtsyMoney().format();
    }
}
