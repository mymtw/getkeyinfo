package com.etsy.android.p327ui.cardview.viewholders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.MessageModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ordershippingstate.OrderShippingStatusCard;
import com.etsy.android.p327ui.cardview.clickhandlers.C9133n;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.OrderShippingStatusViewHolder */
public final class OrderShippingStatusViewHolder extends C12086e<OrderShippingStatusCard> {

    /* renamed from: c */
    public final C8703p f20105c;

    /* renamed from: d */
    public final C9133n f20106d;

    /* renamed from: e */
    public final C19285c f20107e = C19350d.m32677b(new OrderShippingStatusViewHolder$listingImage$2(this));

    /* renamed from: f */
    public final C19285c f20108f = C19350d.m32677b(new OrderShippingStatusViewHolder$statusTitle$2(this));

    /* renamed from: g */
    public final C19285c f20109g = C19350d.m32677b(new OrderShippingStatusViewHolder$statusText$2(this));

    /* renamed from: h */
    public final C19285c f20110h = C19350d.m32677b(new OrderShippingStatusViewHolder$estimatedDeliveryTitle$2(this));

    /* renamed from: i */
    public final C19285c f20111i = C19350d.m32677b(new OrderShippingStatusViewHolder$estimatedDeliveryText$2(this));

    /* renamed from: j */
    public final C19285c f20112j = C19350d.m32677b(new OrderShippingStatusViewHolder$statusMessageText$2(this));

    /* renamed from: k */
    public final C19285c f20113k = C19350d.m32677b(new OrderShippingStatusViewHolder$viewReceiptButton$2(this));

    /* renamed from: l */
    public final C19285c f20114l = C19350d.m32677b(new OrderShippingStatusViewHolder$viewTrackingButton$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderShippingStatusViewHolder(ViewGroup viewGroup, C8703p pVar, C9133n nVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_order_shipping_status, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "viewAnalyticsTracker");
        C19383o.m32797g(nVar, "clickHandler");
        this.f20105c = pVar;
        this.f20106d = nVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C19394m mVar;
        C19394m mVar2;
        OrderShippingStatusCard orderShippingStatusCard = (OrderShippingStatusCard) obj;
        C19383o.m32797g(orderShippingStatusCard, "shippingStatus");
        Map<AnalyticsProperty, ? extends Object> map = orderShippingStatusCard.getTrackingData().f19100a;
        this.f20105c.mo21333d("home_ppmodule_view", map);
        if (!orderShippingStatusCard.getImages().isEmpty()) {
            ImageView imageView = (ImageView) this.f20107e.getValue();
            C19383o.m32796f(imageView, "listingImage");
            C19383o.m32796f(OneShotPreDrawListener.add(imageView, new C9212r0(imageView, orderShippingStatusCard, this)), "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
        }
        ((TextView) this.f20108f.getValue()).setText(orderShippingStatusCard.getMessages().getStatusTitle().getMessage());
        ((TextView) this.f20109g.getValue()).setText(orderShippingStatusCard.getMessages().getStatusText().getMessage());
        MessageModel estimatedDeliveryTitle = orderShippingStatusCard.getMessages().getEstimatedDeliveryTitle();
        C19394m mVar3 = null;
        if (estimatedDeliveryTitle != null) {
            ((TextView) this.f20110h.getValue()).setText(estimatedDeliveryTitle.getMessage());
            ViewExtensions.m12869m((TextView) this.f20110h.getValue());
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            ViewExtensions.m12860d((TextView) this.f20110h.getValue());
        }
        MessageModel estimatedDeliveryText = orderShippingStatusCard.getMessages().getEstimatedDeliveryText();
        if (estimatedDeliveryText != null) {
            ((TextView) this.f20111i.getValue()).setText(estimatedDeliveryText.getMessage());
            ViewExtensions.m12869m((TextView) this.f20111i.getValue());
            mVar2 = C19394m.f43287a;
        } else {
            mVar2 = null;
        }
        if (mVar2 == null) {
            ViewExtensions.m12860d((TextView) this.f20111i.getValue());
        }
        MessageModel statusMessage = orderShippingStatusCard.getMessages().getStatusMessage();
        if (statusMessage != null) {
            ((TextView) this.f20112j.getValue()).setText(statusMessage.getMessage());
            ViewExtensions.m12869m((TextView) this.f20112j.getValue());
            mVar3 = C19394m.f43287a;
        }
        if (mVar3 == null) {
            ViewExtensions.m12860d((TextView) this.f20112j.getValue());
        }
        if (orderShippingStatusCard.getTrackingId() != null) {
            ViewExtensions.m12869m((CollageButton) this.f20114l.getValue());
        } else {
            ViewExtensions.m12860d((CollageButton) this.f20114l.getValue());
        }
        CollageButton collageButton = (CollageButton) this.f20113k.getValue();
        C19383o.m32796f(collageButton, "viewReceiptButton");
        ViewExtensions.m12866j(collageButton, new OrderShippingStatusViewHolder$bind$8(this, orderShippingStatusCard, map));
        CollageButton collageButton2 = (CollageButton) this.f20114l.getValue();
        C19383o.m32796f(collageButton2, "viewTrackingButton");
        ViewExtensions.m12866j(collageButton2, new OrderShippingStatusViewHolder$bind$9(this, orderShippingStatusCard, map));
    }
}
