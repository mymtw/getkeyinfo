package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.AppliedCouponViewHolder$bindCartGroupItem$1 */
public final class AppliedCouponViewHolder$bindCartGroupItem$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartGroupItem $item;
    public final /* synthetic */ AppliedCouponViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppliedCouponViewHolder$bindCartGroupItem$1(CartGroupItem cartGroupItem, AppliedCouponViewHolder appliedCouponViewHolder) {
        super(1);
        this.$item = cartGroupItem;
        this.this$0 = appliedCouponViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.this$0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(android.view.View r4) {
        /*
            r3 = this;
            com.etsy.android.lib.models.apiv3.cart.CartGroupItem r4 = r3.$item
            java.lang.String r0 = "remove_etsy_coupon"
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r4 = r4.getAction(r0)
            if (r4 == 0) goto L_0x001a
            com.etsy.android.ui.cart.viewholders.AppliedCouponViewHolder r0 = r3.this$0
            com.etsy.android.ui.cart.clicklisteners.g r1 = r0.f20686c
            if (r1 == 0) goto L_0x001a
            android.view.View r0 = r0.itemView
            java.lang.String r2 = "rootView"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)
            r1.mo45936d(r0, r4)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.viewholders.AppliedCouponViewHolder$bindCartGroupItem$1.invoke(android.view.View):void");
    }
}
