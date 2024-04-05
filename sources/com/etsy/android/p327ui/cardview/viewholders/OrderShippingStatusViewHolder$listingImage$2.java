package com.etsy.android.p327ui.cardview.viewholders;

import android.widget.ImageView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.OrderShippingStatusViewHolder$listingImage$2 */
public final class OrderShippingStatusViewHolder$listingImage$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ OrderShippingStatusViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderShippingStatusViewHolder$listingImage$2(OrderShippingStatusViewHolder orderShippingStatusViewHolder) {
        super(0);
        this.this$0 = orderShippingStatusViewHolder;
    }

    public final ImageView invoke() {
        return (ImageView) this.this$0.itemView.findViewById(R.id.shipping_status_listing_image);
    }
}
