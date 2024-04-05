package com.etsy.android.p327ui.cart.viewholders;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.p327ui.cart.clicklisteners.C9285j;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartReceiptViewHolder$bind$1 */
final class CartReceiptViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartReceipt $cartReceipt;
    public final /* synthetic */ CartReceiptViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartReceiptViewHolder$bind$1(CartReceiptViewHolder cartReceiptViewHolder, CartReceipt cartReceipt) {
        super(1);
        this.this$0 = cartReceiptViewHolder;
        this.$cartReceipt = cartReceipt;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9285j jVar = this.this$0.f20728c;
        if (jVar != null) {
            C12788a.m20424c(jVar.mo45889a().getActivity(), new ReceiptKey(C19421p.m32935c0(jVar.mo45889a().getActivity()), Long.valueOf(this.$cartReceipt.getReceiptId().getIdAsLong()), (Long) null, false, (Bundle) null));
        }
    }
}
