package com.etsy.android.p327ui.user.purchases;

import android.view.View;
import com.etsy.android.p327ui.user.purchases.C11633d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.purchases.PurchasesReceiptView$setReceiptClickListeners$1 */
public final class PurchasesReceiptView$setReceiptClickListeners$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11628a $dispatcher;
    public final /* synthetic */ long $receiptId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasesReceiptView$setReceiptClickListeners$1(C11628a aVar, long j) {
        super(1);
        this.$dispatcher = aVar;
        this.$receiptId = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$dispatcher.mo37713a(new C11633d.C11637d(this.$receiptId));
    }
}
