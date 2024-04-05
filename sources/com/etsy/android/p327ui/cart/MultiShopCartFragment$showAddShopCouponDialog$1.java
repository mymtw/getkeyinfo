package com.etsy.android.p327ui.cart;

import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$showAddShopCouponDialog$1 */
public final class MultiShopCartFragment$showAddShopCouponDialog$1 extends Lambda implements C19857l<CartPage, C19394m> {
    public final /* synthetic */ ServerDrivenAction $action;
    public final /* synthetic */ int $cartGroupPosition;
    public final /* synthetic */ MultiShopCartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiShopCartFragment$showAddShopCouponDialog$1(MultiShopCartFragment multiShopCartFragment, int i, ServerDrivenAction serverDrivenAction) {
        super(1);
        this.this$0 = multiShopCartFragment;
        this.$cartGroupPosition = i;
        this.$action = serverDrivenAction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CartPage) obj);
        return C19394m.f43287a;
    }

    public final void invoke(CartPage cartPage) {
        this.this$0.handlePerformActionWithToastSuccess(this.$cartGroupPosition, this.$action, cartPage, -1);
    }
}
