package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class PaymentIcon {
    public static final int $stable = 0;
    private final Boolean isPaypal;

    public PaymentIcon(@C17402n(name = "is_paypal") Boolean bool) {
        this.isPaypal = bool;
    }

    public static /* synthetic */ PaymentIcon copy$default(PaymentIcon paymentIcon, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = paymentIcon.isPaypal;
        }
        return paymentIcon.copy(bool);
    }

    public final Boolean component1() {
        return this.isPaypal;
    }

    public final PaymentIcon copy(@C17402n(name = "is_paypal") Boolean bool) {
        return new PaymentIcon(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentIcon) && C19383o.m32792b(this.isPaypal, ((PaymentIcon) obj).isPaypal);
    }

    public int hashCode() {
        Boolean bool = this.isPaypal;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isPaypal() {
        return this.isPaypal;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PaymentIcon(isPaypal=");
        h.append(this.isPaypal);
        h.append(')');
        return h.toString();
    }
}
