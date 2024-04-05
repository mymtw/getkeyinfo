package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9283h;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartListingViewHolder$bindButtons$1 */
final class CartListingViewHolder$bindButtons$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartGroupItem $item;
    public final /* synthetic */ CartListingViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartListingViewHolder$bindButtons$1(CartGroupItem cartGroupItem, CartListingViewHolder cartListingViewHolder) {
        super(1);
        this.$item = cartGroupItem;
        this.this$0 = cartListingViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        ServerDrivenAction action = this.$item.getAction("remove");
        if (action != null) {
            CartListingViewHolder cartListingViewHolder = this.this$0;
            C9283h hVar = cartListingViewHolder.f20703c;
            View view2 = cartListingViewHolder.itemView;
            C19383o.m32796f(view2, "rootView");
            hVar.mo45937e(view2, action, R.string.toast_removed);
        }
    }
}
