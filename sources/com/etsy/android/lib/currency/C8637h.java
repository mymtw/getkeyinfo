package com.etsy.android.lib.currency;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.etsy.android.C6332c;
import com.etsy.android.lib.logger.C8694h;
import com.jakewharton.rxrelay2.C17038b;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p425q9.C13259j;
import p486y9.C13888d;
import p486y9.C13891g;
import p496za.C13943a;

/* renamed from: com.etsy.android.lib.currency.h */
public final class C8637h implements C8629a {

    /* renamed from: a */
    public final C13888d f18982a;

    /* renamed from: b */
    public final C13259j f18983b;

    /* renamed from: c */
    public final C8694h f18984c;

    /* renamed from: d */
    public final C12703a f18985d;

    /* renamed from: e */
    public final SharedPreferences f18986e;

    /* renamed from: f */
    public final Currency f18987f;

    /* renamed from: g */
    public Currency f18988g;

    public C8637h(C13888d dVar, C13259j jVar, C8694h hVar, C12703a aVar, C13891g gVar, C13943a aVar2) {
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(jVar, "localBroadcaster");
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(gVar, "localeUpdateStream");
        C19383o.m32797g(aVar2, "preferencesProvider");
        this.f18982a = dVar;
        this.f18983b = jVar;
        this.f18984c = hVar;
        this.f18985d = aVar;
        this.f18986e = aVar2.mo46761a();
        Currency instance = Currency.getInstance(Locale.US);
        C19383o.m32796f(instance, "getInstance(Locale.US)");
        this.f18987f = instance;
        C17038b<String> bVar = gVar.f30560a;
        C19383o.m32795e(bVar, "null cannot be cast to non-null type io.reactivex.Observable<kotlin.String>");
        bVar.mo20637g(new C6332c(this, 1));
        C19383o.m32796f(instance.toString(), "fallBackUSD.toString()");
    }

    /* renamed from: a */
    public final String mo21246a() {
        if (this.f18988g == null) {
            mo21255d();
        }
        Currency currency = this.f18988g;
        if (currency == null) {
            currency = mo21253b() != null ? mo21253b() : this.f18987f;
        }
        return String.valueOf(currency);
    }

    /* renamed from: b */
    public final Currency mo21253b() {
        try {
            return Currency.getInstance(this.f18982a.mo46719c());
        } catch (IllegalArgumentException unused) {
            C8694h hVar = this.f18984c;
            StringBuilder h = C0072d.m201h("invalid currency for locale ");
            h.append(this.f18982a.mo46719c());
            h.append(" in deviceCurrency");
            hVar.mo21306a(h.toString());
            C12703a aVar = this.f18985d;
            StringBuilder h2 = C0072d.m201h("currency.invalid_device_currency_for_locale_");
            h2.append(this.f18982a.mo46719c());
            aVar.mo45474a(h2.toString());
            return null;
        }
    }

    /* renamed from: c */
    public final void mo21254c(String str) {
        C19383o.m32797g(str, "codeString");
        try {
            Currency instance = Currency.getInstance(str);
            String str2 = null;
            String currencyCode = instance != null ? instance.getCurrencyCode() : null;
            Currency currency = this.f18988g;
            if (currency != null) {
                str2 = currency.getCurrencyCode();
            }
            if (!C19383o.m32792b(currencyCode, str2) && instance != null) {
                this.f18986e.edit().putString("etsyUserCurrencyPref", instance.getCurrencyCode()).apply();
                mo21255d();
                this.f18983b.f29126a.mo20709c(new Intent("com.etsy.android.CURRENCY_UPDATED"));
            }
        } catch (IllegalArgumentException unused) {
            C8694h hVar = this.f18984c;
            hVar.mo21306a("invalid currency: " + str + " attempted to be set in setUserCurrency()");
            C12703a aVar = this.f18985d;
            aVar.mo45474a("currency.invalid_user_currency_set_" + str);
        }
    }

    public final void clear() {
        this.f18986e.edit().remove("etsyUserCurrencyPref").apply();
        this.f18988g = null;
        this.f18983b.f29126a.mo20709c(new Intent("com.etsy.android.CURRENCY_UPDATED"));
    }

    /* renamed from: d */
    public final void mo21255d() {
        Currency currency = null;
        String string = this.f18986e.getString("etsyUserCurrencyPref", (String) null);
        if (string != null) {
            try {
                currency = Currency.getInstance(string);
            } catch (IllegalArgumentException unused) {
                C8694h hVar = this.f18984c;
                hVar.mo21306a("invalid currency: " + string + " attempted to be read from prefs.getString(PREFERENCE_USER_CURRENCY_CODE)");
                C12703a aVar = this.f18985d;
                aVar.mo45474a("currency.invalid_shop_currency_read_" + string);
            }
            this.f18988g = currency;
        }
    }
}
