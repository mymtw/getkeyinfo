package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public final class ListingCardViewHolder$bindMenuIcon$1 extends TrackingOnClickListener {
    public final /* synthetic */ ListingCardUiModel $uiModel;
    public final /* synthetic */ ListingCardViewHolder this$0;

    public ListingCardViewHolder$bindMenuIcon$1(ListingCardViewHolder listingCardViewHolder, ListingCardUiModel listingCardUiModel) {
        this.this$0 = listingCardViewHolder;
        this.$uiModel = listingCardUiModel;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.f26725u.f26764a.mo21333d("listing_card_menu_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        this.this$0.f26724t.mo31350f(this.$uiModel);
    }
}
