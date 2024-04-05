package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.ordershippingstate.OrderShippingStatusCard;
import com.etsy.android.p327ui.cardview.clickhandlers.C9130m;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.OrderShippingStatusViewHolder$bind$8 */
final class OrderShippingStatusViewHolder$bind$8 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ OrderShippingStatusCard $shippingStatus;
    public final /* synthetic */ Map<AnalyticsProperty, Object> $trackingParams;
    public final /* synthetic */ OrderShippingStatusViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderShippingStatusViewHolder$bind$8(OrderShippingStatusViewHolder orderShippingStatusViewHolder, OrderShippingStatusCard orderShippingStatusCard, Map<AnalyticsProperty, ? extends Object> map) {
        super(1);
        this.this$0 = orderShippingStatusViewHolder;
        this.$shippingStatus = orderShippingStatusCard;
        this.$trackingParams = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f20106d.mo31328c(new C9130m.C9131a(this.$shippingStatus.getReceiptId(), this.$trackingParams));
    }
}
