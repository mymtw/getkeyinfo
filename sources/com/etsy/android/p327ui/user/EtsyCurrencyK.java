package com.etsy.android.p327ui.user;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.currency.CurrencyCode;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.text.Collator;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.EtsyCurrencyK */
public final class EtsyCurrencyK implements Comparable<EtsyCurrencyK> {

    /* renamed from: b */
    public final Currency f24994b;

    /* renamed from: c */
    public final String f24995c;

    /* renamed from: d */
    public final int f24996d;

    /* renamed from: e */
    public final transient Collator f24997e = Collator.getInstance(Locale.getDefault());

    public EtsyCurrencyK(@CurrencyCode @C17402n(name = "code") Currency currency, @C17402n(name = "name") String str, @C17402n(name = "number_precision") int i) {
        C19383o.m32797g(currency, "currency");
        C19383o.m32797g(str, "name");
        this.f24994b = currency;
        this.f24995c = str;
        this.f24996d = i;
    }

    public final int compareTo(Object obj) {
        EtsyCurrencyK etsyCurrencyK = (EtsyCurrencyK) obj;
        C19383o.m32797g(etsyCurrencyK, "other");
        return this.f24997e.compare(this.f24995c, etsyCurrencyK.f24995c);
    }

    public final EtsyCurrencyK copy(@CurrencyCode @C17402n(name = "code") Currency currency, @C17402n(name = "name") String str, @C17402n(name = "number_precision") int i) {
        C19383o.m32797g(currency, "currency");
        C19383o.m32797g(str, "name");
        return new EtsyCurrencyK(currency, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EtsyCurrencyK)) {
            return false;
        }
        EtsyCurrencyK etsyCurrencyK = (EtsyCurrencyK) obj;
        return C19383o.m32792b(this.f24994b, etsyCurrencyK.f24994b) && C19383o.m32792b(this.f24995c, etsyCurrencyK.f24995c) && this.f24996d == etsyCurrencyK.f24996d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24996d) + C0023f.m105e(this.f24995c, this.f24994b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Name: ");
        h.append(this.f24995c);
        h.append(" Symbol: ");
        h.append(this.f24994b.getSymbol());
        h.append(" Code: ");
        h.append(this.f24994b.getCurrencyCode());
        return h.toString();
    }
}
