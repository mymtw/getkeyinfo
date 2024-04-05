package com.etsy.android.p327ui.cardview.viewholders;

import android.widget.ImageView;
import androidx.activity.C0114h;
import com.etsy.android.lib.models.apiv3.ordershippingstate.OrderShippingStatusCard;

/* renamed from: com.etsy.android.ui.cardview.viewholders.r0 */
public final class C9212r0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ OrderShippingStatusCard f20340b;

    /* renamed from: c */
    public final /* synthetic */ OrderShippingStatusViewHolder f20341c;

    public C9212r0(ImageView imageView, OrderShippingStatusCard orderShippingStatusCard, OrderShippingStatusViewHolder orderShippingStatusViewHolder) {
        this.f20340b = orderShippingStatusCard;
        this.f20341c = orderShippingStatusViewHolder;
    }

    public final void run() {
        C0114h.m270B0(this.f20341c.itemView.getContext()).load(this.f20340b.getImages().get(0).getSquareImageUrl(((ImageView) this.f20341c.f20107e.getValue()).getMeasuredWidth())).mo16816M((ImageView) this.f20341c.f20107e.getValue());
    }
}
