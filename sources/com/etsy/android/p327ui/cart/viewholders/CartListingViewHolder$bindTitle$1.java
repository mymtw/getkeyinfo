package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.cart.CartListing;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.viewholders.CartListingViewHolder$bindTitle$1 */
final class CartListingViewHolder$bindTitle$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CartListing $listing;
    public final /* synthetic */ CartListingViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartListingViewHolder$bindTitle$1(CartListingViewHolder cartListingViewHolder, CartListing cartListing) {
        super(1);
        this.this$0 = cartListingViewHolder;
        this.$listing = cartListing;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f20703c.mo31624f(this.$listing);
        C8672b bVar = this.this$0.f20704d;
        if (bVar != null) {
            bVar.mo21333d("cart_card_image_or_title_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }
}
