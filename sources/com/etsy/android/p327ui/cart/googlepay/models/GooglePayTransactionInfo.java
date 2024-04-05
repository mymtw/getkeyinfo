package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayTransactionInfo */
public final class GooglePayTransactionInfo {

    /* renamed from: a */
    public final String f20573a;

    /* renamed from: b */
    public final String f20574b;

    /* renamed from: c */
    public final String f20575c;

    public GooglePayTransactionInfo(@C17402n(name = "totalPrice") String str, @C17402n(name = "totalPriceStatus") String str2, @C17402n(name = "currencyCode") String str3) {
        C0048b.m167f(str, "totalPrice", str2, "totalPriceStatus", str3, AppsFlyerProperties.CURRENCY_CODE);
        this.f20573a = str;
        this.f20574b = str2;
        this.f20575c = str3;
    }

    public final GooglePayTransactionInfo copy(@C17402n(name = "totalPrice") String str, @C17402n(name = "totalPriceStatus") String str2, @C17402n(name = "currencyCode") String str3) {
        C19383o.m32797g(str, "totalPrice");
        C19383o.m32797g(str2, "totalPriceStatus");
        C19383o.m32797g(str3, AppsFlyerProperties.CURRENCY_CODE);
        return new GooglePayTransactionInfo(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayTransactionInfo)) {
            return false;
        }
        GooglePayTransactionInfo googlePayTransactionInfo = (GooglePayTransactionInfo) obj;
        return C19383o.m32792b(this.f20573a, googlePayTransactionInfo.f20573a) && C19383o.m32792b(this.f20574b, googlePayTransactionInfo.f20574b) && C19383o.m32792b(this.f20575c, googlePayTransactionInfo.f20575c);
    }

    public final int hashCode() {
        return this.f20575c.hashCode() + C0023f.m105e(this.f20574b, this.f20573a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GooglePayTransactionInfo(totalPrice=");
        h.append(this.f20573a);
        h.append(", totalPriceStatus=");
        h.append(this.f20574b);
        h.append(", currencyCode=");
        return C0391c.m1057c(h, this.f20575c, ')');
    }
}
