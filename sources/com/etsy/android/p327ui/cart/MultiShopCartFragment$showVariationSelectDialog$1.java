package com.etsy.android.p327ui.cart;

import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.cart.bottomsheets.SelectVariationWorkflow;
import com.etsy.android.vespa.PositionList;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$showVariationSelectDialog$1 */
public final class MultiShopCartFragment$showVariationSelectDialog$1 extends Lambda implements C19857l<SelectVariationWorkflow.C9245a, C19394m> {
    public final /* synthetic */ FragmentActivity $activityRef;
    public final /* synthetic */ PositionList $positions;
    public final /* synthetic */ MultiShopCartFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiShopCartFragment$showVariationSelectDialog$1(MultiShopCartFragment multiShopCartFragment, PositionList positionList, FragmentActivity fragmentActivity) {
        super(1);
        this.this$0 = multiShopCartFragment;
        this.$positions = positionList;
        this.$activityRef = fragmentActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SelectVariationWorkflow.C9245a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(SelectVariationWorkflow.C9245a aVar) {
        C19383o.m32797g(aVar, "result");
        if (aVar instanceof SelectVariationWorkflow.C9245a.C9247b) {
            this.this$0.performAction(this.$positions, ((SelectVariationWorkflow.C9245a.C9247b) aVar).f20429a);
            return;
        }
        C8901g0.m17337c(this.$activityRef, ((SelectVariationWorkflow.C9245a.C9246a) aVar).f20428a);
    }
}
