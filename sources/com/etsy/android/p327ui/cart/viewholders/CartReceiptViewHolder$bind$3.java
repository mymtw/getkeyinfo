package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.p327ui.cart.clicklisteners.C9285j;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartReceiptViewHolder$bind$3 */
final class CartReceiptViewHolder$bind$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartReceipt $cartReceipt;
    public final /* synthetic */ CartReceiptViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartReceiptViewHolder$bind$3(CartReceipt cartReceipt, CartReceiptViewHolder cartReceiptViewHolder) {
        super(1);
        this.$cartReceipt = cartReceipt;
        this.this$0 = cartReceiptViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9285j jVar;
        C9285j jVar2;
        if (!(this.$cartReceipt.getListingSocialShare() == null || (jVar2 = this.this$0.f20728c) == null)) {
            CartReceipt cartReceipt = this.$cartReceipt;
            if (cartReceipt.getListingSocialShare() != null) {
                C1993m.m4365Z(jVar2.mo45889a().getActivity(), cartReceipt.getListingSocialShare().getUrl());
            }
        }
        if (this.$cartReceipt.getShopSocialShare() != null && (jVar = this.this$0.f20728c) != null) {
            CartReceipt cartReceipt2 = this.$cartReceipt;
            if (cartReceipt2.getShopSocialShare() != null) {
                C1993m.m4365Z(jVar.mo45889a().getActivity(), cartReceipt2.getShopSocialShare().getShareUrl());
            }
        }
    }
}
