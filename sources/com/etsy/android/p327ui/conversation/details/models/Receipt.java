package com.etsy.android.p327ui.conversation.details.models;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.conversation.details.models.Receipt */
public final class Receipt {

    /* renamed from: a */
    public final long f21213a;

    /* renamed from: b */
    public final long f21214b;

    /* renamed from: c */
    public final long f21215c;

    /* renamed from: d */
    public final String f21216d;

    public Receipt(@C17402n(name = "receipt_id") long j, @C17402n(name = "seller_user_id") long j2, @C17402n(name = "buyer_user_id") long j3, @C17402n(name = "help_url") String str) {
        this.f21213a = j;
        this.f21214b = j2;
        this.f21215c = j3;
        this.f21216d = str;
    }

    public final Receipt copy(@C17402n(name = "receipt_id") long j, @C17402n(name = "seller_user_id") long j2, @C17402n(name = "buyer_user_id") long j3, @C17402n(name = "help_url") String str) {
        return new Receipt(j, j2, j3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Receipt)) {
            return false;
        }
        Receipt receipt = (Receipt) obj;
        return this.f21213a == receipt.f21213a && this.f21214b == receipt.f21214b && this.f21215c == receipt.f21215c && C19383o.m32792b(this.f21216d, receipt.f21216d);
    }

    public final int hashCode() {
        int b = C0071c.m190b(this.f21215c, C0071c.m190b(this.f21214b, Long.hashCode(this.f21213a) * 31, 31), 31);
        String str = this.f21216d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Receipt(receiptId=");
        h.append(this.f21213a);
        h.append(", sellerUserId=");
        h.append(this.f21214b);
        h.append(", buyerUserId=");
        h.append(this.f21215c);
        h.append(", helpUrl=");
        return C0391c.m1057c(h, this.f21216d, ')');
    }
}
