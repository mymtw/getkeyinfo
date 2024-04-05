package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayTokenizationParameters */
public final class GooglePayTokenizationParameters {

    /* renamed from: a */
    public final String f20569a;

    /* renamed from: b */
    public final String f20570b;

    public GooglePayTokenizationParameters(@C17402n(name = "protocolVersion") String str, @C17402n(name = "publicKey") String str2) {
        C19383o.m32797g(str, "protocolVersion");
        C19383o.m32797g(str2, "publicKey");
        this.f20569a = str;
        this.f20570b = str2;
    }

    public final GooglePayTokenizationParameters copy(@C17402n(name = "protocolVersion") String str, @C17402n(name = "publicKey") String str2) {
        C19383o.m32797g(str, "protocolVersion");
        C19383o.m32797g(str2, "publicKey");
        return new GooglePayTokenizationParameters(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayTokenizationParameters)) {
            return false;
        }
        GooglePayTokenizationParameters googlePayTokenizationParameters = (GooglePayTokenizationParameters) obj;
        return C19383o.m32792b(this.f20569a, googlePayTokenizationParameters.f20569a) && C19383o.m32792b(this.f20570b, googlePayTokenizationParameters.f20570b);
    }

    public final int hashCode() {
        return this.f20570b.hashCode() + (this.f20569a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GooglePayTokenizationParameters(protocolVersion=");
        h.append(this.f20569a);
        h.append(", publicKey=");
        return C0391c.m1057c(h, this.f20570b, ')');
    }
}
