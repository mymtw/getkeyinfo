package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.cart.CartListing;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartListingViewHolder$bindImage$1 */
public final class CartListingViewHolder$bindImage$1 extends TrackingOnClickListener {
    public final /* synthetic */ CartListing $listing;
    public final /* synthetic */ CartListingViewHolder this$0;

    public CartListingViewHolder$bindImage$1(CartListingViewHolder cartListingViewHolder, CartListing cartListing) {
        this.this$0 = cartListingViewHolder;
        this.$listing = cartListing;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.f20703c.mo31624f(this.$listing);
        C8672b bVar = this.this$0.f20704d;
        if (bVar != null) {
            bVar.mo21333d("cart_card_image_or_title_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }
}
