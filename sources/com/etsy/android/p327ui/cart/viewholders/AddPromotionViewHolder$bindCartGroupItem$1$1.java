package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p423pf.C13236g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.AddPromotionViewHolder$bindCartGroupItem$1$1 */
public final class AddPromotionViewHolder$bindCartGroupItem$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ServerDrivenAction $action;
    public final /* synthetic */ AddPromotionViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPromotionViewHolder$bindCartGroupItem$1$1(AddPromotionViewHolder addPromotionViewHolder, ServerDrivenAction serverDrivenAction) {
        super(1);
        this.this$0 = addPromotionViewHolder;
        this.$action = serverDrivenAction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        AddPromotionViewHolder addPromotionViewHolder = this.this$0;
        C9282g gVar = addPromotionViewHolder.f20684c;
        View view2 = addPromotionViewHolder.itemView;
        C19383o.m32796f(view2, "itemView");
        ServerDrivenAction serverDrivenAction = this.$action;
        C19383o.m32796f(serverDrivenAction, ResponseConstants.ACTION);
        gVar.getClass();
        gVar.f20499e.showAddShopCouponDialog(C13236g.C13237a.m20892a(view2), serverDrivenAction);
    }
}
