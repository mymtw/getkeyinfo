package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayTokenizationSpecification */
public final class GooglePayTokenizationSpecification {

    /* renamed from: a */
    public final String f20571a;

    /* renamed from: b */
    public final GooglePayTokenizationParameters f20572b;

    public GooglePayTokenizationSpecification(@C17402n(name = "type") String str, @C17402n(name = "parameters") GooglePayTokenizationParameters googlePayTokenizationParameters) {
        C19383o.m32797g(str, "type");
        C19383o.m32797g(googlePayTokenizationParameters, "parameters");
        this.f20571a = str;
        this.f20572b = googlePayTokenizationParameters;
    }

    public final GooglePayTokenizationSpecification copy(@C17402n(name = "type") String str, @C17402n(name = "parameters") GooglePayTokenizationParameters googlePayTokenizationParameters) {
        C19383o.m32797g(str, "type");
        C19383o.m32797g(googlePayTokenizationParameters, "parameters");
        return new GooglePayTokenizationSpecification(str, googlePayTokenizationParameters);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayTokenizationSpecification)) {
            return false;
        }
        GooglePayTokenizationSpecification googlePayTokenizationSpecification = (GooglePayTokenizationSpecification) obj;
        return C19383o.m32792b(this.f20571a, googlePayTokenizationSpecification.f20571a) && C19383o.m32792b(this.f20572b, googlePayTokenizationSpecification.f20572b);
    }

    public final int hashCode() {
        return this.f20572b.hashCode() + (this.f20571a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GooglePayTokenizationSpecification(type=");
        h.append(this.f20571a);
        h.append(", parameters=");
        h.append(this.f20572b);
        h.append(')');
        return h.toString();
    }
}
