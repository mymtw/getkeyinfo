package com.etsy.android.lib.requests;

import androidx.compose.animation.C0388a;
import com.etsy.android.lib.currency.C8629a;
import kotlin.jvm.internal.C19383o;
import p486y9.C13888d;

public final class LocaleMetadata {
    public static final int $stable = 8;
    private final C8629a appCurrency;
    private final C13888d currentLocale;

    public LocaleMetadata(C8629a aVar, C13888d dVar) {
        C19383o.m32797g(aVar, "appCurrency");
        C19383o.m32797g(dVar, "currentLocale");
        this.appCurrency = aVar;
        this.currentLocale = dVar;
    }

    public final String getCurrencyCode() {
        return this.appCurrency.mo21246a();
    }

    public final String getLanguageTag() {
        return this.currentLocale.mo46717a();
    }

    public final String getRegionCode() {
        String country = this.currentLocale.mo46719c().getCountry();
        C19383o.m32796f(country, "currentLocale.getSystemLocale().country");
        return country;
    }

    public final String toDetectedLocaleHeaderValue() {
        return toString();
    }

    public String toString() {
        return C0388a.m1049e(new Object[]{getCurrencyCode(), getLanguageTag(), getRegionCode()}, 3, "%s|%s|%s", "format(format, *args)");
    }
}
