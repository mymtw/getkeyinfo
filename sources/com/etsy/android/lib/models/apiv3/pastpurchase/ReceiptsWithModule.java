package com.etsy.android.lib.models.apiv3.pastpurchase;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ReceiptsWithModule {
    public static final int $stable = 8;
    private final ModulePlacement modulePlacement;
    private final List<PastPurchaseReceiptV3> receipts;

    public ReceiptsWithModule(@C17402n(name = "receipts") List<PastPurchaseReceiptV3> list, @C17402n(name = "module_placement") ModulePlacement modulePlacement2) {
        C19383o.m32797g(list, "receipts");
        this.receipts = list;
        this.modulePlacement = modulePlacement2;
    }

    public static /* synthetic */ ReceiptsWithModule copy$default(ReceiptsWithModule receiptsWithModule, List<PastPurchaseReceiptV3> list, ModulePlacement modulePlacement2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = receiptsWithModule.receipts;
        }
        if ((i & 2) != 0) {
            modulePlacement2 = receiptsWithModule.modulePlacement;
        }
        return receiptsWithModule.copy(list, modulePlacement2);
    }

    public final List<PastPurchaseReceiptV3> component1() {
        return this.receipts;
    }

    public final ModulePlacement component2() {
        return this.modulePlacement;
    }

    public final ReceiptsWithModule copy(@C17402n(name = "receipts") List<PastPurchaseReceiptV3> list, @C17402n(name = "module_placement") ModulePlacement modulePlacement2) {
        C19383o.m32797g(list, "receipts");
        return new ReceiptsWithModule(list, modulePlacement2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptsWithModule)) {
            return false;
        }
        ReceiptsWithModule receiptsWithModule = (ReceiptsWithModule) obj;
        return C19383o.m32792b(this.receipts, receiptsWithModule.receipts) && C19383o.m32792b(this.modulePlacement, receiptsWithModule.modulePlacement);
    }

    public final ModulePlacement getModulePlacement() {
        return this.modulePlacement;
    }

    public final List<PastPurchaseReceiptV3> getReceipts() {
        return this.receipts;
    }

    public int hashCode() {
        int hashCode = this.receipts.hashCode() * 31;
        ModulePlacement modulePlacement2 = this.modulePlacement;
        return hashCode + (modulePlacement2 == null ? 0 : modulePlacement2.hashCode());
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ReceiptsWithModule(receipts=");
        h.append(this.receipts);
        h.append(", modulePlacement=");
        h.append(this.modulePlacement);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReceiptsWithModule(List list, ModulePlacement modulePlacement2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : modulePlacement2);
    }
}
