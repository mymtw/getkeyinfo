package com.etsy.android.p327ui.user;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.AddToCartResponse */
public final class AddToCartResponse {

    /* renamed from: a */
    public Integer f24990a;

    /* renamed from: b */
    public final Recommendations f24991b;

    public AddToCartResponse(@C17402n(name = "cart_count") Integer num, @C17402n(name = "post_add_to_cart_recs") Recommendations recommendations) {
        this.f24990a = num;
        this.f24991b = recommendations;
    }

    public final AddToCartResponse copy(@C17402n(name = "cart_count") Integer num, @C17402n(name = "post_add_to_cart_recs") Recommendations recommendations) {
        return new AddToCartResponse(num, recommendations);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartResponse)) {
            return false;
        }
        AddToCartResponse addToCartResponse = (AddToCartResponse) obj;
        return C19383o.m32792b(this.f24990a, addToCartResponse.f24990a) && C19383o.m32792b(this.f24991b, addToCartResponse.f24991b);
    }

    public final int hashCode() {
        Integer num = this.f24990a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Recommendations recommendations = this.f24991b;
        if (recommendations != null) {
            i = recommendations.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AddToCartResponse(cartCount=");
        h.append(this.f24990a);
        h.append(", recommendations=");
        h.append(this.f24991b);
        h.append(')');
        return h.toString();
    }
}
