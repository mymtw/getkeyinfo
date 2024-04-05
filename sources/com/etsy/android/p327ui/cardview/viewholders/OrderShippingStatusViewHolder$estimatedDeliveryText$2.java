package com.etsy.android.p327ui.cardview.viewholders;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.OrderShippingStatusViewHolder$estimatedDeliveryText$2 */
public final class OrderShippingStatusViewHolder$estimatedDeliveryText$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ OrderShippingStatusViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderShippingStatusViewHolder$estimatedDeliveryText$2(OrderShippingStatusViewHolder orderShippingStatusViewHolder) {
        super(0);
        this.this$0 = orderShippingStatusViewHolder;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.itemView.findViewById(R.id.estimated_delivery_text);
    }
}
