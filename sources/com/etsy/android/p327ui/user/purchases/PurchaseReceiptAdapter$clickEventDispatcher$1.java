package com.etsy.android.p327ui.user.purchases;

import com.etsy.android.util.C12059p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.purchases.PurchaseReceiptAdapter$clickEventDispatcher$1 */
public final class PurchaseReceiptAdapter$clickEventDispatcher$1 extends Lambda implements C19857l<C11633d, C19394m> {
    public final /* synthetic */ PurchaseReceiptAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseReceiptAdapter$clickEventDispatcher$1(PurchaseReceiptAdapter purchaseReceiptAdapter) {
        super(1);
        this.this$0 = purchaseReceiptAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11633d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11633d dVar) {
        C19383o.m32797g(dVar, "event");
        this.this$0.f25736e.setValue(new C12059p(dVar));
    }
}
