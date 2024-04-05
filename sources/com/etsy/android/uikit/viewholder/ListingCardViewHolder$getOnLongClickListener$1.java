package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.uikit.util.TrackingOnLongClickListener;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public final class ListingCardViewHolder$getOnLongClickListener$1 extends TrackingOnLongClickListener {
    public final /* synthetic */ ListingCard $listing;
    public final /* synthetic */ ListingCardViewHolder this$0;

    public ListingCardViewHolder$getOnLongClickListener$1(ListingCardViewHolder listingCardViewHolder, ListingCard listingCard) {
        this.this$0 = listingCardViewHolder;
        this.$listing = listingCard;
    }

    public boolean onViewLongClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.f26725u.f26764a.mo21333d("listing_card_long_pressed", (Map<? extends AnalyticsProperty, Object>) null);
        this.this$0.f26724t.mo31350f(this.$listing);
        return true;
    }
}
