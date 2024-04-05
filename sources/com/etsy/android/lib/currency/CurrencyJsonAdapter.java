package com.etsy.android.lib.currency;

import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.C17401m;
import com.squareup.moshi.C17418z;
import java.util.Currency;
import kotlin.jvm.internal.C19383o;

public final class CurrencyJsonAdapter {
    public static final int $stable = 0;

    @C17401m
    @CurrencyCode
    public final Currency currencyFromJson(String str) {
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        Currency instance = Currency.getInstance(str);
        C19383o.m32796f(instance, "getInstance(currencyCode)");
        return instance;
    }

    @C17418z
    public final String currencyToJson(@CurrencyCode Currency currency) {
        C19383o.m32797g(currency, "currency");
        String currencyCode = currency.getCurrencyCode();
        C19383o.m32796f(currencyCode, "currency.currencyCode");
        return currencyCode;
    }
}
