package com.etsy.android.p327ui.checkout;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.checkout.PayPalOrderConfirmationResponse */
public final class PayPalOrderConfirmationResponse {

    /* renamed from: a */
    public final boolean f20924a;

    /* renamed from: b */
    public final String f20925b;

    /* renamed from: c */
    public final String f20926c;

    public PayPalOrderConfirmationResponse(@C17402n(name = "success") boolean z, @C17402n(name = "order_id") String str, @C17402n(name = "review_url") String str2) {
        this.f20924a = z;
        this.f20925b = str;
        this.f20926c = str2;
    }

    public final PayPalOrderConfirmationResponse copy(@C17402n(name = "success") boolean z, @C17402n(name = "order_id") String str, @C17402n(name = "review_url") String str2) {
        return new PayPalOrderConfirmationResponse(z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayPalOrderConfirmationResponse)) {
            return false;
        }
        PayPalOrderConfirmationResponse payPalOrderConfirmationResponse = (PayPalOrderConfirmationResponse) obj;
        return this.f20924a == payPalOrderConfirmationResponse.f20924a && C19383o.m32792b(this.f20925b, payPalOrderConfirmationResponse.f20925b) && C19383o.m32792b(this.f20926c, payPalOrderConfirmationResponse.f20926c);
    }

    public final int hashCode() {
        boolean z = this.f20924a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f20925b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20926c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PayPalOrderConfirmationResponse(success=");
        h.append(this.f20924a);
        h.append(", orderId=");
        h.append(this.f20925b);
        h.append(", reviewUrl=");
        return C0391c.m1057c(h, this.f20926c, ')');
    }
}
