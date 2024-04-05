package com.etsy.android.lib.currency;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class EtsyMoneyJson {

    /* renamed from: a */
    public final String f18959a;

    /* renamed from: b */
    public final String f18960b;

    /* renamed from: c */
    public final int f18961c;

    public EtsyMoneyJson(@C17402n(name = "amount") String str, @C17402n(name = "currency_code") String str2, @C17402n(name = "divisor") int i) {
        C19383o.m32797g(str, "_amount");
        C19383o.m32797g(str2, AppsFlyerProperties.CURRENCY_CODE);
        this.f18959a = str;
        this.f18960b = str2;
        this.f18961c = i;
    }

    public final EtsyMoneyJson copy(@C17402n(name = "amount") String str, @C17402n(name = "currency_code") String str2, @C17402n(name = "divisor") int i) {
        C19383o.m32797g(str, "_amount");
        C19383o.m32797g(str2, AppsFlyerProperties.CURRENCY_CODE);
        return new EtsyMoneyJson(str, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EtsyMoneyJson)) {
            return false;
        }
        EtsyMoneyJson etsyMoneyJson = (EtsyMoneyJson) obj;
        return C19383o.m32792b(this.f18959a, etsyMoneyJson.f18959a) && C19383o.m32792b(this.f18960b, etsyMoneyJson.f18960b) && this.f18961c == etsyMoneyJson.f18961c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18961c) + C0023f.m105e(this.f18960b, this.f18959a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("EtsyMoneyJson(_amount=");
        h.append(this.f18959a);
        h.append(", currencyCode=");
        h.append(this.f18960b);
        h.append(", divisor=");
        return C0073e.m208h(h, this.f18961c, ')');
    }
}
