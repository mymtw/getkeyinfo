package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.PromotionViewHolder$bindCartGroupItem$1 */
public final class PromotionViewHolder$bindCartGroupItem$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ServerDrivenAction $action;
    public final /* synthetic */ PromotionViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromotionViewHolder$bindCartGroupItem$1(PromotionViewHolder promotionViewHolder, ServerDrivenAction serverDrivenAction) {
        super(1);
        this.this$0 = promotionViewHolder;
        this.$action = serverDrivenAction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        PromotionViewHolder promotionViewHolder = this.this$0;
        C9282g gVar = promotionViewHolder.f20744c;
        View view2 = promotionViewHolder.itemView;
        C19383o.m32796f(view2, "rootView");
        gVar.mo45936d(view2, this.$action);
    }
}
