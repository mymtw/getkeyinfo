package com.etsy.android.p327ui.cart.viewholders;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.PaymentAppliedCoupon;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.cart.viewholders.y */
public final class C9414y extends C9370c {

    /* renamed from: c */
    public final TextView f20881c = ((TextView) mo38986f(R.id.txt_coupon_code));

    /* renamed from: d */
    public final TextView f20882d = ((TextView) mo38986f(R.id.txt_description));

    /* renamed from: e */
    public final TextView f20883e = ((TextView) mo38986f(R.id.txt_price_discount));

    /* renamed from: f */
    public final Button f20884f = ((Button) mo38986f(R.id.button_remove));

    /* renamed from: g */
    public final C9282g f20885g;

    /* renamed from: com.etsy.android.ui.cart.viewholders.y$a */
    public class C9415a extends TrackingOnClickListener {

        /* renamed from: b */
        public final /* synthetic */ CartGroupItem f20886b;

        public C9415a(CartGroupItem cartGroupItem) {
            this.f20886b = cartGroupItem;
        }

        public final void onViewClick(View view) {
            ServerDrivenAction action;
            if (C9414y.this.f20885g != null && (action = this.f20886b.getAction(ServerDrivenAction.TYPE_DELETE_COUPON)) != null) {
                C9414y yVar = C9414y.this;
                yVar.f20885g.mo45936d(yVar.itemView, action);
            }
        }
    }

    public C9414y(ViewGroup viewGroup, C9282g gVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_applied_coupon, viewGroup, false));
        this.f20885g = gVar;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        PaymentAppliedCoupon paymentAppliedCoupon = (PaymentAppliedCoupon) cartGroupItem.getData();
        this.f20881c.setText(paymentAppliedCoupon.getCouponCode());
        String description = paymentAppliedCoupon.getDescription();
        this.f20882d.setText(TextUtils.isEmpty(description) ? "" : description.trim());
        this.f20883e.setText(paymentAppliedCoupon.getDiscountAmountString());
        this.f20884f.setOnClickListener(new C9415a(cartGroupItem));
    }
}
