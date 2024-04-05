package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ReceiptUserReview {
    public static final int $stable = 0;
    private final Integer rating;

    public ReceiptUserReview() {
        this((Integer) null, 1, (DefaultConstructorMarker) null);
    }

    public ReceiptUserReview(@C17402n(name = "rating") Integer num) {
        this.rating = num;
    }

    public static /* synthetic */ ReceiptUserReview copy$default(ReceiptUserReview receiptUserReview, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = receiptUserReview.rating;
        }
        return receiptUserReview.copy(num);
    }

    public final Integer component1() {
        return this.rating;
    }

    public final ReceiptUserReview copy(@C17402n(name = "rating") Integer num) {
        return new ReceiptUserReview(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiptUserReview) && C19383o.m32792b(this.rating, ((ReceiptUserReview) obj).rating);
    }

    public final Integer getRating() {
        return this.rating;
    }

    public int hashCode() {
        Integer num = this.rating;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return C0023f.m109j(C0072d.m201h("ReceiptUserReview(rating="), this.rating, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReceiptUserReview(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
