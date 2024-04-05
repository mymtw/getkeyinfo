package com.etsy.android.uikit.viewholder;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p407nf.C13113a;

public final class ListingCard3x3ViewHolder$bind$2 extends TrackingOnClickListener {
    public final /* synthetic */ ListingCard $listing;
    public final /* synthetic */ C12004p this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCard3x3ViewHolder$bind$2(C12004p pVar, ListingCard listingCard, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = pVar;
        this.$listing = listingCard;
    }

    public void onViewClick(View view) {
        C13113a aVar = this.this$0.f26747c;
        if (aVar != null) {
            aVar.mo31349e(this.$listing, true, (Bundle) null);
        }
    }
}
