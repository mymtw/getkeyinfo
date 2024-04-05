package com.etsy.android.p327ui.homescreen.purchaseclaim;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.homescreen.purchaseclaim.PurchaseClaimBody */
public final class PurchaseClaimBody {

    /* renamed from: a */
    public final String f22205a;

    /* renamed from: b */
    public final String f22206b;

    public PurchaseClaimBody(@C17402n(name = "order_claiming_token") String str, @C17402n(name = "order_claiming_signature") String str2) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        C19383o.m32797g(str2, "signature");
        this.f22205a = str;
        this.f22206b = str2;
    }

    public final PurchaseClaimBody copy(@C17402n(name = "order_claiming_token") String str, @C17402n(name = "order_claiming_signature") String str2) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        C19383o.m32797g(str2, "signature");
        return new PurchaseClaimBody(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseClaimBody)) {
            return false;
        }
        PurchaseClaimBody purchaseClaimBody = (PurchaseClaimBody) obj;
        return C19383o.m32792b(this.f22205a, purchaseClaimBody.f22205a) && C19383o.m32792b(this.f22206b, purchaseClaimBody.f22206b);
    }

    public final int hashCode() {
        return this.f22206b.hashCode() + (this.f22205a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PurchaseClaimBody(token=");
        h.append(this.f22205a);
        h.append(", signature=");
        return C0391c.m1057c(h, this.f22206b, ')');
    }
}
