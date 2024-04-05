package com.etsy.android.lib.currency;

import com.etsy.android.lib.logger.C8694h;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;
import p003a2.C0023f;
import p193o.C7494b;

/* renamed from: com.etsy.android.lib.currency.d */
public final class C8632d {

    /* renamed from: c */
    public static final C7494b<Locale, NumberFormat> f18974c = new C7494b<>();

    /* renamed from: a */
    public final C8694h f18975a;

    /* renamed from: b */
    public final FormatterOverrides f18976b;

    public C8632d(C8694h hVar, FormatterOverrides formatterOverrides) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(formatterOverrides, "formatterOverrides");
        this.f18975a = hVar;
        this.f18976b = formatterOverrides;
    }

    /* renamed from: a */
    public final BigDecimal mo21251a(String str, Locale locale) throws ParseException {
        try {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            C19383o.m32796f(currencyInstance, "getCurrencyInstance(locale)");
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i > length) {
                    break;
                }
                boolean z2 = C19383o.m32799i(str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            return new BigDecimal(currencyInstance.parse(str.subSequence(i, length + 1).toString()).toString());
        } catch (ParseException unused) {
            C8694h hVar = this.f18975a;
            StringBuilder l = C0023f.m111l("couldn't parse String (", str, ") as Locale (");
            l.append(locale.getDisplayName());
            l.append(") formatted currency amount");
            hVar.mo21312f(l.toString());
            NumberFormat instance = NumberFormat.getInstance(locale);
            C19383o.m32796f(instance, "getInstance(locale)");
            int length2 = str.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length2) {
                boolean z4 = C19383o.m32799i(str.charAt(!z3 ? i2 : length2), 32) <= 0;
                if (!z3) {
                    if (!z4) {
                        z3 = true;
                    } else {
                        i2++;
                    }
                } else if (!z4) {
                    break;
                } else {
                    length2--;
                }
            }
            return new BigDecimal(instance.parse(new Regex("[^0-9,.]").replace((CharSequence) str.subSequence(i2, length2 + 1).toString(), "")).toString());
        }
    }

    /* renamed from: b */
    public final BigDecimal mo21252b(String str, Locale locale) {
        if (str == null) {
            str = "0";
        }
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException e) {
            C8694h hVar = this.f18975a;
            hVar.mo21309d("couldn't parse String (" + str + ") as a BigDecimal", e);
            try {
                return mo21251a(str, locale);
            } catch (ParseException e2) {
                C8694h hVar2 = this.f18975a;
                StringBuilder l = C0023f.m111l("couldn't parse String (", str, ") as Locale (");
                l.append(locale.getDisplayName());
                l.append(") formatted (non currency) amount");
                hVar2.mo21309d(l.toString(), e2);
                this.f18975a.mo21313g("parseWithFallbackToLocale() returning default value of 0, which is probably not what we want");
                return new BigDecimal(0);
            }
        }
    }
}
