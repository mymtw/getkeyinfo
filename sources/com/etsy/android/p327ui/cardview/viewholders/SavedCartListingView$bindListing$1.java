package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SavedCartListingView$bindListing$1 */
public final class SavedCartListingView$bindListing$1 extends TrackingOnClickListener {
    public final /* synthetic */ C9163b1 $uiModel;
    public final /* synthetic */ SavedCartListingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedCartListingView$bindListing$1(SavedCartListingView savedCartListingView, C9163b1 b1Var, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = savedCartListingView;
        this.$uiModel = b1Var;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.handleViewListing(this.$uiModel.f20153b);
    }
}
