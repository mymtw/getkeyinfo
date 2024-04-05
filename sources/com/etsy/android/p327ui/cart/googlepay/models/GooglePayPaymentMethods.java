package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayPaymentMethods */
public final class GooglePayPaymentMethods {

    /* renamed from: a */
    public final String f20562a;

    /* renamed from: b */
    public final GooglePayPaymentParameters f20563b;

    /* renamed from: c */
    public final GooglePayTokenizationSpecification f20564c;

    public GooglePayPaymentMethods(@C17402n(name = "type") String str, @C17402n(name = "parameters") GooglePayPaymentParameters googlePayPaymentParameters, @C17402n(name = "tokenizationSpecification") GooglePayTokenizationSpecification googlePayTokenizationSpecification) {
        C19383o.m32797g(str, "type");
        C19383o.m32797g(googlePayPaymentParameters, "parameters");
        this.f20562a = str;
        this.f20563b = googlePayPaymentParameters;
        this.f20564c = googlePayTokenizationSpecification;
    }

    public final GooglePayPaymentMethods copy(@C17402n(name = "type") String str, @C17402n(name = "parameters") GooglePayPaymentParameters googlePayPaymentParameters, @C17402n(name = "tokenizationSpecification") GooglePayTokenizationSpecification googlePayTokenizationSpecification) {
        C19383o.m32797g(str, "type");
        C19383o.m32797g(googlePayPaymentParameters, "parameters");
        return new GooglePayPaymentMethods(str, googlePayPaymentParameters, googlePayTokenizationSpecification);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayPaymentMethods)) {
            return false;
        }
        GooglePayPaymentMethods googlePayPaymentMethods = (GooglePayPaymentMethods) obj;
        return C19383o.m32792b(this.f20562a, googlePayPaymentMethods.f20562a) && C19383o.m32792b(this.f20563b, googlePayPaymentMethods.f20563b) && C19383o.m32792b(this.f20564c, googlePayPaymentMethods.f20564c);
    }

    public final int hashCode() {
        int hashCode = (this.f20563b.hashCode() + (this.f20562a.hashCode() * 31)) * 31;
        GooglePayTokenizationSpecification googlePayTokenizationSpecification = this.f20564c;
        return hashCode + (googlePayTokenizationSpecification == null ? 0 : googlePayTokenizationSpecification.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GooglePayPaymentMethods(type=");
        h.append(this.f20562a);
        h.append(", parameters=");
        h.append(this.f20563b);
        h.append(", tokenizationSpecification=");
        h.append(this.f20564c);
        h.append(')');
        return h.toString();
    }
}
