package com.etsy.android.p327ui.cart.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.PaymentAddCoupon;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.AddPromotionViewHolder */
public final class AddPromotionViewHolder extends C9370c {

    /* renamed from: c */
    public final C9282g f20684c;

    /* renamed from: d */
    public final Button f20685d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPromotionViewHolder(ViewGroup viewGroup, C9282g gVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_msco_add_promotion, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(gVar, "mClickHandler");
        this.f20684c = gVar;
        View findViewById = this.itemView.findViewById(R.id.coupon_button);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.coupon_button)");
        this.f20685d = (Button) findViewById;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        String str;
        C19383o.m32797g(cartGroupItem, "item");
        PaymentAddCoupon paymentAddCoupon = (PaymentAddCoupon) cartGroupItem.getData();
        Button button = this.f20685d;
        if (paymentAddCoupon == null || (str = paymentAddCoupon.getLabel()) == null) {
            str = this.itemView.getResources().getString(R.string.coupon_code_hint);
        }
        button.setText(str);
        ServerDrivenAction action = cartGroupItem.getAction(ServerDrivenAction.TYPE_APPLY_COUPON);
        if (action != null) {
            ViewExtensions.m12866j(this.f20685d, new AddPromotionViewHolder$bindCartGroupItem$1$1(this, action));
        }
    }
}
