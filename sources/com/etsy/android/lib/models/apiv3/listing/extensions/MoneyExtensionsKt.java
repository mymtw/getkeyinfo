package com.etsy.android.lib.models.apiv3.listing.extensions;

import com.etsy.android.lib.models.apiv3.Money;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;

public final class MoneyExtensionsKt {
    public static final Money convertToV2(com.etsy.android.lib.models.apiv3.listing.Money money) {
        C19383o.m32797g(money, "<this>");
        Money money2 = new Money();
        money2.setAmount(StringEscapeUtils.unescapeHtml4(money.get_amount()));
        money2.setDivisor(money.getDivisor());
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(money.getCurrencyCode());
        String str = "";
        if (unescapeHtml4 == null) {
            unescapeHtml4 = str;
        }
        money2.setCurrencyCode(unescapeHtml4);
        String unescapeHtml42 = StringEscapeUtils.unescapeHtml4(money.getCurrencyFormattedRaw());
        if (unescapeHtml42 == null) {
            unescapeHtml42 = str;
        }
        money2.setCurrencyFormattedRaw(unescapeHtml42);
        String unescapeHtml43 = StringEscapeUtils.unescapeHtml4(money.getCurrencyFormattedLong());
        if (unescapeHtml43 == null) {
            unescapeHtml43 = str;
        }
        money2.setCurrencyFormattedLong(unescapeHtml43);
        String unescapeHtml44 = StringEscapeUtils.unescapeHtml4(money.getCurrencyFormattedShort());
        if (unescapeHtml44 != null) {
            str = unescapeHtml44;
        }
        money2.setCurrencyFormattedShort(str);
        return money2;
    }
}
