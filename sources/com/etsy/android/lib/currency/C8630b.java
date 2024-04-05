package com.etsy.android.lib.currency;

import com.etsy.android.lib.logger.C8694h;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p486y9.C13888d;

/* renamed from: com.etsy.android.lib.currency.b */
public final class C8630b {

    /* renamed from: e */
    public static C8630b f18964e;

    /* renamed from: a */
    public final C8694h f18965a;

    /* renamed from: b */
    public final C8632d f18966b;

    /* renamed from: c */
    public final C13888d f18967c;

    /* renamed from: d */
    public final C8629a f18968d;

    public C8630b(C8694h hVar, C8632d dVar, C13888d dVar2, C8629a aVar) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(dVar, "formatter");
        C19383o.m32797g(dVar2, "currentLocale");
        C19383o.m32797g(aVar, "appCurrency");
        this.f18965a = hVar;
        this.f18966b = dVar;
        this.f18967c = dVar2;
        this.f18968d = aVar;
        f18964e = this;
    }

    /* renamed from: a */
    public final EtsyMoney mo21248a(String str, String str2) {
        BigDecimal b = this.f18966b.mo21252b(str, this.f18967c.mo46718b());
        Currency instance = Currency.getInstance(str2);
        C19383o.m32796f(instance, "getInstance(currency)");
        return new EtsyMoney(b, instance, (Integer) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final EtsyMoney mo21249b(Currency currency, String str, int i) {
        BigDecimal bigDecimal;
        C19383o.m32797g(currency, "currency");
        C19383o.m32797g(str, "fractionalAmount");
        if (C19457k.m33020X0(str)) {
            C8694h hVar = this.f18965a;
            hVar.mo21313g("Empty or null string: [ " + str + " ] passed to EtsyMoney2.withAmount(String), was this intentional?");
            str = "0";
        }
        try {
            bigDecimal = new BigDecimal(str);
        } catch (NumberFormatException unused) {
            bigDecimal = new BigDecimal(0);
        }
        BigDecimal divide = bigDecimal.divide(new BigDecimal(i));
        C19383o.m32796f(divide, "stringToBigDecimal(fract…vide(BigDecimal(divisor))");
        return new EtsyMoney(divide, currency, (Integer) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final EtsyMoney mo21250c() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C19383o.m32796f(bigDecimal, "ZERO");
        Currency instance = Currency.getInstance(this.f18968d.mo21246a());
        C19383o.m32796f(instance, "getInstance(appCurrency.code)");
        return new EtsyMoney(bigDecimal, instance, (Integer) null, 4, (DefaultConstructorMarker) null);
    }
}
