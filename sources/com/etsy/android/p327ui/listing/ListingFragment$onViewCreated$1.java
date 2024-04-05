package com.etsy.android.p327ui.listing;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p466vc.C13558a;

/* renamed from: com.etsy.android.ui.listing.ListingFragment$onViewCreated$1 */
public final class ListingFragment$onViewCreated$1 extends TrackingOnClickListener {
    public final /* synthetic */ long $listingId;
    public final /* synthetic */ ListingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFragment$onViewCreated$1(ListingFragment listingFragment, long j, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = listingFragment;
        this.$listingId = j;
    }

    public void onViewClick(View view) {
        this.this$0.getViewModel().mo33464b(new C13558a.C13561c(this.$listingId));
    }
}
