package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayPaymentParameters */
public final class GooglePayPaymentParameters {

    /* renamed from: a */
    public final List<String> f20565a;

    /* renamed from: b */
    public final List<String> f20566b;

    /* renamed from: c */
    public final boolean f20567c;

    /* renamed from: d */
    public final GooglePayBillingAddressParameters f20568d;

    public GooglePayPaymentParameters(@C17402n(name = "allowedAuthMethods") List<String> list, @C17402n(name = "allowedCardNetworks") List<String> list2, @C17402n(name = "billingAddressRequired") boolean z, @C17402n(name = "billingAddressParameters") GooglePayBillingAddressParameters googlePayBillingAddressParameters) {
        C19383o.m32797g(list, "allowedAuthMethods");
        C19383o.m32797g(list2, "allowedCardNetworks");
        C19383o.m32797g(googlePayBillingAddressParameters, "billingAddressParameters");
        this.f20565a = list;
        this.f20566b = list2;
        this.f20567c = z;
        this.f20568d = googlePayBillingAddressParameters;
    }

    public final GooglePayPaymentParameters copy(@C17402n(name = "allowedAuthMethods") List<String> list, @C17402n(name = "allowedCardNetworks") List<String> list2, @C17402n(name = "billingAddressRequired") boolean z, @C17402n(name = "billingAddressParameters") GooglePayBillingAddressParameters googlePayBillingAddressParameters) {
        C19383o.m32797g(list, "allowedAuthMethods");
        C19383o.m32797g(list2, "allowedCardNetworks");
        C19383o.m32797g(googlePayBillingAddressParameters, "billingAddressParameters");
        return new GooglePayPaymentParameters(list, list2, z, googlePayBillingAddressParameters);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayPaymentParameters)) {
            return false;
        }
        GooglePayPaymentParameters googlePayPaymentParameters = (GooglePayPaymentParameters) obj;
        return C19383o.m32792b(this.f20565a, googlePayPaymentParameters.f20565a) && C19383o.m32792b(this.f20566b, googlePayPaymentParameters.f20566b) && this.f20567c == googlePayPaymentParameters.f20567c && C19383o.m32792b(this.f20568d, googlePayPaymentParameters.f20568d);
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f20566b, this.f20565a.hashCode() * 31, 31);
        boolean z = this.f20567c;
        if (z) {
            z = true;
        }
        return this.f20568d.hashCode() + ((g + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GooglePayPaymentParameters(allowedAuthMethods=");
        h.append(this.f20565a);
        h.append(", allowedCardNetworks=");
        h.append(this.f20566b);
        h.append(", billingAddressRequired=");
        h.append(this.f20567c);
        h.append(", billingAddressParameters=");
        h.append(this.f20568d);
        h.append(')');
        return h.toString();
    }
}
