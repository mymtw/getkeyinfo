package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SavedCartListingView$bind$5 */
public final class SavedCartListingView$bind$5 extends TrackingOnClickListener {
    public final /* synthetic */ SavedCart $cart;
    public final /* synthetic */ SavedCartListingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedCartListingView$bind$5(SavedCartListingView savedCartListingView, SavedCart savedCart, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = savedCartListingView;
        this.$cart = savedCart;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.handleRemove(this.$cart);
    }
}
