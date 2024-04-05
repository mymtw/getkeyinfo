package com.etsy.android.p327ui.cart.viewholders;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.RightAlignedVariation;
import com.etsy.android.lib.models.apiv3.cart.ShippingDetails;
import com.etsy.android.p327ui.cart.clicklisteners.C9292o;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cart.viewholders.k0 */
public final class C9391k0 extends C9370c {

    /* renamed from: c */
    public final C9292o f20802c;

    /* renamed from: d */
    public final TextView f20803d;

    /* renamed from: e */
    public final TextView f20804e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9391k0(ViewGroup viewGroup, C9292o oVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_msco_shipping_details_variant, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(oVar, "clickHandler");
        this.f20802c = oVar;
        View f = mo38986f(R.id.txt_free_shipping);
        C19383o.m32795e(f, "null cannot be cast to non-null type android.widget.TextView");
        this.f20803d = (TextView) f;
        View f2 = mo38986f(R.id.txt_estimated_delivery);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.TextView");
        this.f20804e = (TextView) f2;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
        ShippingDetails shippingDetails = (ShippingDetails) cartGroupItem.getData();
        FormattedMoney formattedMoney = null;
        String estimatedDeliveryDatePrimaryText = shippingDetails != null ? shippingDetails.getEstimatedDeliveryDatePrimaryText() : null;
        if (C18263b.m30837c0(estimatedDeliveryDatePrimaryText)) {
            this.itemView.getLayoutParams().height = -2;
            ViewExtensions.m12869m(this.f20804e);
            this.f20804e.setText(Html.fromHtml(estimatedDeliveryDatePrimaryText));
            boolean z = shippingDetails.getShippingOptions().size() > 1;
            TextView textView = this.f20804e;
            C9389j0 j0Var = new C9389j0(this, z);
            C19383o.m32797g(textView, "textView");
            EtsyLinkify.m19608b(textView, true, true, j0Var);
            RightAlignedVariation rightAlignedVariation = shippingDetails.getRightAlignedVariation();
            if (rightAlignedVariation != null) {
                formattedMoney = rightAlignedVariation.getFormattedMoney();
            }
            if (formattedMoney != null) {
                this.f20803d.setText(formattedMoney.toString());
                this.f20803d.setVisibility(0);
                return;
            }
            this.f20803d.setVisibility(8);
            return;
        }
        this.itemView.getLayoutParams().height = 0;
        ViewExtensions.m12860d(this.f20804e);
        ViewExtensions.m12860d(this.f20803d);
    }
}
