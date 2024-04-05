package com.etsy.android.p327ui.listing.p329ui.listingpromotion;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.listingpromotion.ListingPromotionViewHolder$bind$2 */
public final class ListingPromotionViewHolder$bind$2 extends TrackingOnClickListener {
    public final /* synthetic */ C10423j $uiModel;
    public final /* synthetic */ ListingPromotionViewHolder this$0;

    public ListingPromotionViewHolder$bind$2(ListingPromotionViewHolder listingPromotionViewHolder, C10423j jVar) {
        this.this$0 = listingPromotionViewHolder;
        this.$uiModel = jVar;
    }

    public void onViewClick(View view) {
        C13573c cVar = this.this$0.f22914b;
        C10423j jVar = this.$uiModel;
        cVar.mo38043a(new C13597g.C13692n2(((C10447a) jVar).f22917a, Long.valueOf(((C10447a) jVar).f22919c), ShopHomeConfig.ITEMS_SEARCH));
    }
}
