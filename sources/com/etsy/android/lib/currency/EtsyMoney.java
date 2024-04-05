package com.etsy.android.lib.currency;

import android.support.p013v4.media.C0072d;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.core.EtsyMoneyException;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17403o;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p486y9.C13888d;

@C17403o(generateAdapter = false)
public final class EtsyMoney implements Serializable {
    public static final int $stable = 8;
    private final BigDecimal _amount;
    private Currency _currency;
    public transient C13888d currentLocale;
    public transient C8632d formatter;
    public transient C8694h logCat;
    private Integer maximumFractionDigits;

    public EtsyMoney(BigDecimal bigDecimal, Currency currency, Integer num) {
        C19383o.m32797g(bigDecimal, "_amount");
        C19383o.m32797g(currency, "_currency");
        this._amount = bigDecimal;
        this._currency = currency;
        this.maximumFractionDigits = num;
        C8630b bVar = C8630b.f18964e;
        if (bVar != null) {
            setLogCat(bVar.f18965a);
            setCurrentLocale(bVar.f18967c);
            setFormatter(bVar.f18966b);
            return;
        }
        C19383o.m32805o("instance");
        throw null;
    }

    public static /* synthetic */ EtsyMoney copy$default(EtsyMoney etsyMoney, BigDecimal bigDecimal, Currency currency, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = etsyMoney._amount;
        }
        if ((i & 2) != 0) {
            currency = etsyMoney._currency;
        }
        if ((i & 4) != 0) {
            num = etsyMoney.maximumFractionDigits;
        }
        return etsyMoney.copy(bigDecimal, currency, num);
    }

    public final int compareTo(EtsyMoney etsyMoney) {
        C19383o.m32797g(etsyMoney, "other");
        if (C19383o.m32792b(this._currency, etsyMoney.getCurrency())) {
            return this._amount.compareTo(etsyMoney.getAmount());
        }
        StringBuilder h = C0072d.m201h("tried to compare an EtsyMoney amount in currency (");
        h.append(this._currency.getCurrencyCode());
        h.append(") with another EtsyMoney in currency (");
        h.append(etsyMoney.getCurrency().getCurrencyCode());
        h.append(')');
        throw new EtsyMoneyException(h.toString());
    }

    public final EtsyMoney constrainAmountToCurrencyFractionalDigits() {
        BigDecimal scale = this._amount.setScale(getCurrency().getDefaultFractionDigits(), 6);
        C19383o.m32796f(scale, "_amount.setScale(\n      …D_HALF_EVEN\n            )");
        return copy$default(this, scale, (Currency) null, (Integer) null, 6, (Object) null);
    }

    public final EtsyMoney copy(BigDecimal bigDecimal, Currency currency, Integer num) {
        C19383o.m32797g(bigDecimal, "_amount");
        C19383o.m32797g(currency, "_currency");
        return new EtsyMoney(bigDecimal, currency, num);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof BigDecimal) {
            if (compareTo((BigDecimal) obj) != 0) {
                return false;
            }
        } else if (obj instanceof Integer) {
            if (compareTo(((Number) obj).intValue()) != 0) {
                return false;
            }
        } else if (!(obj instanceof EtsyMoney)) {
            return false;
        } else {
            EtsyMoney etsyMoney = (EtsyMoney) obj;
            if (compareTo(etsyMoney) != 0 || !C19383o.m32792b(this._currency, etsyMoney.getCurrency())) {
                return false;
            }
        }
        return true;
    }

    public final String format() {
        if (this.currentLocale == null) {
            C8630b bVar = C8630b.f18964e;
            if (bVar != null) {
                setLogCat(bVar.f18965a);
                setCurrentLocale(bVar.f18967c);
                setFormatter(bVar.f18966b);
            } else {
                C19383o.m32805o("instance");
                throw null;
            }
        }
        return format(getCurrentLocale().mo46718b());
    }

    public final String formatAsNonCurrencyWithDefaultCurrencyFractionDigits() {
        C8632d formatter2 = getFormatter();
        BigDecimal bigDecimal = this._amount;
        Currency currency = this._currency;
        Locale b = getCurrentLocale().mo46718b();
        formatter2.getClass();
        C19383o.m32797g(bigDecimal, ResponseConstants.AMOUNT);
        C19383o.m32797g(currency, "currency");
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        NumberFormat instance = NumberFormat.getInstance(b);
        C19383o.m32795e(instance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) instance;
        if (defaultFractionDigits < 0) {
            defaultFractionDigits = 0;
        }
        decimalFormat.setMaximumFractionDigits(defaultFractionDigits);
        decimalFormat.setMinimumFractionDigits(defaultFractionDigits);
        String format = decimalFormat.format(bigDecimal);
        C19383o.m32796f(format, "formatter.format(amount)");
        return format;
    }

    public final BigDecimal getAmount() {
        return this._amount;
    }

    public final Currency getCurrency() {
        return this._currency;
    }

    public final String getCurrencyCode() {
        String currencyCode = this._currency.getCurrencyCode();
        C19383o.m32794d(currencyCode);
        return currencyCode;
    }

    public final String getCurrencySymbol() {
        String symbol = this._currency.getSymbol();
        return symbol == null ? "" : symbol;
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public final C8632d getFormatter() {
        C8632d dVar = this.formatter;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("formatter");
        throw null;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public int hashCode() {
        return this._currency.hashCode() + (this._amount.hashCode() * 31);
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setFormatter(C8632d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.formatter = dVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final EtsyMoney setMaximumFractionDigits(int i) {
        this.maximumFractionDigits = Integer.valueOf(i);
        return this;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("EtsyMoney(_amount=");
        h.append(this._amount);
        h.append(", _currency=");
        h.append(this._currency);
        h.append(", maximumFractionDigits=");
        return C0023f.m109j(h, this.maximumFractionDigits, ')');
    }

    public final EtsyMoney withAmount(String str) {
        return copy$default(this, getFormatter().mo21252b(str, getCurrentLocale().mo46718b()), (Currency) null, (Integer) null, 6, (Object) null);
    }

    public final EtsyMoney withCurrency(String str) {
        Currency currency;
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        try {
            currency = Currency.getInstance(str);
            C19383o.m32796f(currency, "{\n            Currency.g…e(currencyCode)\n        }");
        } catch (Throwable unused) {
            currency = Currency.getInstance("USD");
            C19383o.m32796f(currency, "{\n            Currency.g…Instance(\"USD\")\n        }");
        }
        return copy$default(this, (BigDecimal) null, currency, (Integer) null, 5, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String format(java.util.Locale r7) {
        /*
            r6 = this;
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            com.etsy.android.lib.currency.d r0 = r6.getFormatter()
            java.util.Currency r1 = r6._currency
            r0.getClass()
            java.lang.String r2 = "currency"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            com.etsy.android.lib.currency.FormatterOverrides r2 = r0.f18976b
            java.util.HashMap<java.util.Locale, java.util.Map<java.util.Currency, java.text.NumberFormat>> r2 = r2.f18963b
            boolean r2 = r2.containsKey(r7)
            r3 = 0
            if (r2 == 0) goto L_0x0033
            com.etsy.android.lib.currency.FormatterOverrides r2 = r0.f18976b
            java.util.HashMap<java.util.Locale, java.util.Map<java.util.Currency, java.text.NumberFormat>> r2 = r2.f18963b
            java.lang.Object r2 = r2.get(r7)
            kotlin.jvm.internal.C19383o.m32794d(r2)
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            java.lang.String r4 = r1.getCurrencyCode()
            java.lang.String r5 = "HUF"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            int r3 = r1.getDefaultFractionDigits()
        L_0x0045:
            if (r2 == 0) goto L_0x005e
            com.etsy.android.lib.currency.FormatterOverrides r0 = r0.f18976b
            java.util.HashMap<java.util.Locale, java.util.Map<java.util.Currency, java.text.NumberFormat>> r0 = r0.f18963b
            java.lang.Object r7 = r0.get(r7)
            kotlin.jvm.internal.C19383o.m32794d(r7)
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r7 = r7.get(r1)
            kotlin.jvm.internal.C19383o.m32794d(r7)
            java.text.NumberFormat r7 = (java.text.NumberFormat) r7
            goto L_0x0083
        L_0x005e:
            o.b<java.util.Locale, java.text.NumberFormat> r0 = com.etsy.android.lib.currency.C8632d.f18974c
            boolean r4 = r0.containsKey(r7)
            if (r4 == 0) goto L_0x0071
            r4 = 0
            java.lang.Object r4 = r0.getOrDefault(r7, r4)
            kotlin.jvm.internal.C19383o.m32794d(r4)
            java.text.NumberFormat r4 = (java.text.NumberFormat) r4
            goto L_0x0075
        L_0x0071:
            java.text.NumberFormat r4 = java.text.NumberFormat.getCurrencyInstance(r7)
        L_0x0075:
            r0.put(r7, r4)
            java.lang.Object r7 = r4.clone()
            java.lang.String r0 = "null cannot be cast to non-null type java.text.NumberFormat"
            kotlin.jvm.internal.C19383o.m32795e(r7, r0)
            java.text.NumberFormat r7 = (java.text.NumberFormat) r7
        L_0x0083:
            if (r2 != 0) goto L_0x0088
            r7.setCurrency(r1)
        L_0x0088:
            r7.setMaximumFractionDigits(r3)
            r7.setMinimumFractionDigits(r3)
            java.lang.Integer r0 = r6.maximumFractionDigits
            if (r0 == 0) goto L_0x0099
            int r0 = r0.intValue()
            r7.setMaximumFractionDigits(r0)
        L_0x0099:
            java.math.BigDecimal r0 = r6._amount
            java.lang.String r7 = r7.format(r0)
            java.lang.String r0 = "numberFormatter.format(_amount)"
            kotlin.jvm.internal.C19383o.m32796f(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.currency.EtsyMoney.format(java.util.Locale):java.lang.String");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EtsyMoney(java.math.BigDecimal r1, java.util.Currency r2, java.lang.Integer r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L_0x000b
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            java.lang.String r5 = "ZERO"
            kotlin.jvm.internal.C19383o.m32796f(r1, r5)
        L_0x000b:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0010
            r3 = 0
        L_0x0010:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.currency.EtsyMoney.<init>(java.math.BigDecimal, java.util.Currency, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int compareTo(BigDecimal bigDecimal) {
        C19383o.m32797g(bigDecimal, "other");
        return compareTo(new EtsyMoney(bigDecimal, getCurrency(), (Integer) null));
    }

    public final int compareTo(int i) {
        return compareTo(new BigDecimal(i));
    }
}
