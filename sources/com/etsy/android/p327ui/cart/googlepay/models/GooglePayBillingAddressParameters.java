package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayBillingAddressParameters */
public final class GooglePayBillingAddressParameters {

    /* renamed from: a */
    public final String f20551a;

    public GooglePayBillingAddressParameters(@C17402n(name = "format") String str) {
        C19383o.m32797g(str, ResponseConstants.FORMAT);
        this.f20551a = str;
    }

    public final GooglePayBillingAddressParameters copy(@C17402n(name = "format") String str) {
        C19383o.m32797g(str, ResponseConstants.FORMAT);
        return new GooglePayBillingAddressParameters(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GooglePayBillingAddressParameters) && C19383o.m32792b(this.f20551a, ((GooglePayBillingAddressParameters) obj).f20551a);
    }

    public final int hashCode() {
        return this.f20551a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("GooglePayBillingAddressParameters(format="), this.f20551a, ')');
    }
}
