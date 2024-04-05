package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayMerchantInfo */
public final class GooglePayMerchantInfo {

    /* renamed from: a */
    public final String f20556a;

    public GooglePayMerchantInfo(@C17402n(name = "merchantName") String str) {
        C19383o.m32797g(str, "merchantName");
        this.f20556a = str;
    }

    public final GooglePayMerchantInfo copy(@C17402n(name = "merchantName") String str) {
        C19383o.m32797g(str, "merchantName");
        return new GooglePayMerchantInfo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GooglePayMerchantInfo) && C19383o.m32792b(this.f20556a, ((GooglePayMerchantInfo) obj).f20556a);
    }

    public final int hashCode() {
        return this.f20556a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("GooglePayMerchantInfo(merchantName="), this.f20556a, ')');
    }
}
