package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.review.ReviewFlowCardOrderType */
public final class ReviewFlowCardOrderType {

    /* renamed from: a */
    public ReviewFlowCardType f25987a;

    /* renamed from: b */
    public int f25988b;

    public ReviewFlowCardOrderType(@C17402n(name = "card_type") ReviewFlowCardType reviewFlowCardType, @C17402n(name = "unique_id") int i) {
        C19383o.m32797g(reviewFlowCardType, "cardType");
        this.f25987a = reviewFlowCardType;
        this.f25988b = i;
    }

    public final ReviewFlowCardOrderType copy(@C17402n(name = "card_type") ReviewFlowCardType reviewFlowCardType, @C17402n(name = "unique_id") int i) {
        C19383o.m32797g(reviewFlowCardType, "cardType");
        return new ReviewFlowCardOrderType(reviewFlowCardType, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFlowCardOrderType)) {
            return false;
        }
        ReviewFlowCardOrderType reviewFlowCardOrderType = (ReviewFlowCardOrderType) obj;
        return this.f25987a == reviewFlowCardOrderType.f25987a && this.f25988b == reviewFlowCardOrderType.f25988b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25988b) + (this.f25987a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewFlowCardOrderType(cardType=");
        h.append(this.f25987a);
        h.append(", id=");
        return C0073e.m208h(h, this.f25988b, ')');
    }
}
