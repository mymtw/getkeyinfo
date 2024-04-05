package com.etsy.android.p327ui.cart;

import android.os.Bundle;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenActionParcelable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.ListingSelectQuantityDialogFragment$onViewCreated$adapter$1 */
public final class ListingSelectQuantityDialogFragment$onViewCreated$adapter$1 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ ListingSelectQuantityDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingSelectQuantityDialogFragment$onViewCreated$adapter$1(ListingSelectQuantityDialogFragment listingSelectQuantityDialogFragment) {
        super(1);
        this.this$0 = listingSelectQuantityDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        Bundle bundle = new Bundle();
        ListingSelectQuantityDialogFragment listingSelectQuantityDialogFragment = this.this$0;
        bundle.putInt("cart_action_position", listingSelectQuantityDialogFragment.parentPosition);
        ServerDrivenActionParcelable access$getActionParcelable$p = listingSelectQuantityDialogFragment.actionParcelable;
        if (access$getActionParcelable$p != null) {
            bundle.putParcelable("cart_action", access$getActionParcelable$p);
            bundle.putInt("cart_update_quantity_selected_quantity", i);
            this.this$0.getParentFragmentManager().mo10373Z(bundle, "cart_update_quantity");
            this.this$0.dismiss();
            return;
        }
        C19383o.m32805o("actionParcelable");
        throw null;
    }
}
