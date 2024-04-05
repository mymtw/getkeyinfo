package com.etsy.android.p327ui.cardview.viewholders;

import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.OrderShippingStatusViewHolder$viewReceiptButton$2 */
public final class OrderShippingStatusViewHolder$viewReceiptButton$2 extends Lambda implements C19846a<CollageButton> {
    public final /* synthetic */ OrderShippingStatusViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderShippingStatusViewHolder$viewReceiptButton$2(OrderShippingStatusViewHolder orderShippingStatusViewHolder) {
        super(0);
        this.this$0 = orderShippingStatusViewHolder;
    }

    public final CollageButton invoke() {
        return (CollageButton) this.this$0.itemView.findViewById(R.id.order_shipping_status_receipt_cta);
    }
}
