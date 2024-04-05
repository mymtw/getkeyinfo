package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.cart.CartThankYouGroup;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartThankYouGroupViewHolder$bind$1$1 */
final class CartThankYouGroupViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartThankYouGroup $thankYouGroup;
    public final /* synthetic */ C9390k this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartThankYouGroupViewHolder$bind$1$1(CartThankYouGroup cartThankYouGroup, C9390k kVar) {
        super(1);
        this.$thankYouGroup = cartThankYouGroup;
        this.this$0 = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        CartThankYouGroup cartThankYouGroup = this.$thankYouGroup;
        cartThankYouGroup.setItemsVisible(!cartThankYouGroup.isItemsVisible());
        C9390k kVar = this.this$0;
        CartThankYouGroup cartThankYouGroup2 = this.$thankYouGroup;
        int i = C9390k.f20795i;
        kVar.mo31838g(cartThankYouGroup2);
    }
}
