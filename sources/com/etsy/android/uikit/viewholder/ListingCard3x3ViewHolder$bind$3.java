package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.uikit.util.TrackingOnLongClickListener;
import java.util.Map;
import p407nf.C13113a;

public final class ListingCard3x3ViewHolder$bind$3 extends TrackingOnLongClickListener {
    public final /* synthetic */ ListingCard $listing;
    public final /* synthetic */ C12004p this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCard3x3ViewHolder$bind$3(C12004p pVar, ListingCard listingCard, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = pVar;
        this.$listing = listingCard;
    }

    public boolean onViewLongClick(View view) {
        C12004p pVar = this.this$0;
        C13113a aVar = pVar.f26747c;
        if (aVar == null) {
            return false;
        }
        ListingCard listingCard = this.$listing;
        pVar.f26749e.f26764a.mo21333d("listing_card_long_pressed", (Map<? extends AnalyticsProperty, Object>) null);
        aVar.mo31350f(listingCard);
        return true;
    }
}
