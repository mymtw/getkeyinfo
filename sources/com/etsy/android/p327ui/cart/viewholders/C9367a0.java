package com.etsy.android.p327ui.cart.viewholders;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.PaymentHeader;
import com.etsy.android.stylekit.views.CollageHeadingTextView;

/* renamed from: com.etsy.android.ui.cart.viewholders.a0 */
public final class C9367a0 extends C9370c {

    /* renamed from: c */
    public final CollageHeadingTextView f20752c = ((CollageHeadingTextView) mo38986f(R.id.txt_title));

    public C9367a0(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_payment_header, viewGroup, false));
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        this.f20752c.setText(((PaymentHeader) cartGroupItem.getData()).getTitle());
    }
}
