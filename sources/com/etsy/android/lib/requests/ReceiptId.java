package com.etsy.android.lib.requests;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ReceiptId {
    public static final int $stable = 0;

    /* renamed from: id */
    private final String f19476id;

    public ReceiptId(@C17402n(name = "receipt_id") String str) {
        C19383o.m32797g(str, "id");
        this.f19476id = str;
    }

    public static /* synthetic */ ReceiptId copy$default(ReceiptId receiptId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receiptId.f19476id;
        }
        return receiptId.copy(str);
    }

    public final String component1() {
        return this.f19476id;
    }

    public final ReceiptId copy(@C17402n(name = "receipt_id") String str) {
        C19383o.m32797g(str, "id");
        return new ReceiptId(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiptId) && C19383o.m32792b(this.f19476id, ((ReceiptId) obj).f19476id);
    }

    public final String getId() {
        return this.f19476id;
    }

    public int hashCode() {
        return this.f19476id.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("ReceiptId(id="), this.f19476id, ')');
    }
}
