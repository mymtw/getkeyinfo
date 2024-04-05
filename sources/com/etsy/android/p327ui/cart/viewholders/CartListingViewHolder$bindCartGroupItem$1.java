package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartListingViewHolder$bindCartGroupItem$1 */
public final class CartListingViewHolder$bindCartGroupItem$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartListingViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartListingViewHolder$bindCartGroupItem$1(CartListingViewHolder cartListingViewHolder) {
        super(1);
        this.this$0 = cartListingViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19383o.m32797g(view, "it");
        view.setEnabled(!this.this$0.f20705e);
        if (this.this$0.f20705e) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }
}
