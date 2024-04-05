package com.etsy.android.p327ui.cart.viewholders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.TotalsLineItem;

/* renamed from: com.etsy.android.ui.cart.viewholders.e0 */
public final class C9375e0 extends C9370c {

    /* renamed from: c */
    public final TextView f20764c;

    /* renamed from: d */
    public final TextView f20765d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9375e0(ViewGroup viewGroup, int i) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(i != R.id.view_type_discount_total_line_item ? i != R.id.view_type_grand_total_line_item ? R.layout.list_item_msco_totals_line_item : R.layout.list_item_msco_totals_line_grand_item : R.layout.list_item_msco_totals_line_discount_item, viewGroup, false));
        this.f20764c = (TextView) mo38986f(R.id.txt_title);
        this.f20765d = (TextView) mo38986f(R.id.txt_value);
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        TotalsLineItem totalsLineItem = (TotalsLineItem) cartGroupItem.getData();
        this.f20764c.setText(totalsLineItem.getTitle());
        if (totalsLineItem.getFormattedMoney() != null) {
            this.f20765d.setText(totalsLineItem.getFormattedMoney().toString());
        } else if (totalsLineItem.getMoney() != null) {
            this.f20765d.setText(totalsLineItem.getMoney().toString());
        } else {
            this.f20765d.setText("");
        }
    }
}
