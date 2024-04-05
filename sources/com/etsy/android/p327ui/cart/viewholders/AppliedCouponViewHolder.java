package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.AppliedCoupon;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cart.viewholders.AppliedCouponViewHolder */
public final class AppliedCouponViewHolder extends C9370c {

    /* renamed from: c */
    public final C9282g f20686c;

    /* renamed from: d */
    public final TextView f20687d;

    /* renamed from: e */
    public final TextView f20688e;

    /* renamed from: f */
    public final ImageButton f20689f;

    public AppliedCouponViewHolder(ViewGroup viewGroup, C9282g gVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.item_cart_applied_coupon, viewGroup, false));
        this.f20686c = gVar;
        View findViewById = this.itemView.findViewById(R.id.coupon_label_text_view);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.coupon_label_text_view)");
        this.f20687d = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.coupon_error_text_view);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.coupon_error_text_view)");
        this.f20688e = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.coupon_remove_button);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.coupon_remove_button)");
        this.f20689f = (ImageButton) findViewById3;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
        BaseModel data = cartGroupItem.getData();
        C19383o.m32795e(data, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.AppliedCoupon");
        AppliedCoupon appliedCoupon = (AppliedCoupon) data;
        this.f20687d.setText(appliedCoupon.getLabel());
        this.f20688e.setText(appliedCoupon.getError());
        TextView textView = this.f20688e;
        int i = 0;
        if (!(appliedCoupon.getError().length() > 0)) {
            i = 8;
        }
        textView.setVisibility(i);
        ViewExtensions.m12866j(this.f20689f, new AppliedCouponViewHolder$bindCartGroupItem$1(cartGroupItem, this));
    }
}
