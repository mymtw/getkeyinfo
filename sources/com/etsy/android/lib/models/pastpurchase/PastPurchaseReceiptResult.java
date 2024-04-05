package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class PastPurchaseReceiptResult {
    public static final int $stable = 8;
    private final int count;
    private final List<PastPurchaseReceipt> receipts;

    public PastPurchaseReceiptResult(@C17402n(name = "count") int i, @C17402n(name = "results") List<PastPurchaseReceipt> list) {
        this.count = i;
        this.receipts = list;
    }

    public static /* synthetic */ PastPurchaseReceiptResult copy$default(PastPurchaseReceiptResult pastPurchaseReceiptResult, int i, List<PastPurchaseReceipt> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pastPurchaseReceiptResult.count;
        }
        if ((i2 & 2) != 0) {
            list = pastPurchaseReceiptResult.receipts;
        }
        return pastPurchaseReceiptResult.copy(i, list);
    }

    public final int component1() {
        return this.count;
    }

    public final List<PastPurchaseReceipt> component2() {
        return this.receipts;
    }

    public final PastPurchaseReceiptResult copy(@C17402n(name = "count") int i, @C17402n(name = "results") List<PastPurchaseReceipt> list) {
        return new PastPurchaseReceiptResult(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPurchaseReceiptResult)) {
            return false;
        }
        PastPurchaseReceiptResult pastPurchaseReceiptResult = (PastPurchaseReceiptResult) obj;
        return this.count == pastPurchaseReceiptResult.count && C19383o.m32792b(this.receipts, pastPurchaseReceiptResult.receipts);
    }

    public final int getCount() {
        return this.count;
    }

    public final List<PastPurchaseReceipt> getReceipts() {
        return this.receipts;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        List<PastPurchaseReceipt> list = this.receipts;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PastPurchaseReceiptResult(count=");
        h.append(this.count);
        h.append(", receipts=");
        return C0070b.m186i(h, this.receipts, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PastPurchaseReceiptResult(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }
}
