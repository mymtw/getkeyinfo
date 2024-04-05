package com.etsy.android.p327ui.cart.saveforlater.models.p328ui.card;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.saveforlater.C9361f;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.jvm.internal.C19383o;
import p308ac.C8497a;

/* renamed from: com.etsy.android.ui.cart.saveforlater.models.ui.card.SflCardViewHolder */
public final class SflCardViewHolder extends C9361f {

    /* renamed from: b */
    public final TextView f20670b;

    /* renamed from: c */
    public final TextView f20671c;

    /* renamed from: d */
    public final TextView f20672d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SflCardViewHolder(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.item_sfl_card, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.alert_sfl_unavailable);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.alert_sfl_unavailable)");
        CollageAlert collageAlert = (CollageAlert) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_sfl_listing_title);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.text_sfl_listing_title)");
        this.f20670b = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.text_sfl_from_shop_name);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.….text_sfl_from_shop_name)");
        this.f20671c = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.text_sfl_variation1_name);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…text_sfl_variation1_name)");
        TextView textView = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.text_sfl_variation2_name);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.…text_sfl_variation2_name)");
        TextView textView2 = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.text_sfl_quantity);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.text_sfl_quantity)");
        TextView textView3 = (TextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.text_sfl_unit_price);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.id.text_sfl_unit_price)");
        TextView textView4 = (TextView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.text_sfl_original_price);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.….text_sfl_original_price)");
        TextView textView5 = (TextView) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.text_sfl_discount_message);
        C19383o.m32796f(findViewById9, "itemView.findViewById(R.…ext_sfl_discount_message)");
        TextView textView6 = (TextView) findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.text_sfl_plus_shipping);
        C19383o.m32796f(findViewById10, "itemView.findViewById(R.id.text_sfl_plus_shipping)");
        this.f20672d = (TextView) findViewById10;
        View findViewById11 = this.itemView.findViewById(R.id.btn_sfl_move_to_favorites);
        C19383o.m32796f(findViewById11, "itemView.findViewById(R.…tn_sfl_move_to_favorites)");
        Button button = (Button) findViewById11;
        View findViewById12 = this.itemView.findViewById(R.id.btn_sfl_remove);
        C19383o.m32796f(findViewById12, "itemView.findViewById(R.id.btn_sfl_remove)");
        Button button2 = (Button) findViewById12;
    }

    /* renamed from: e */
    public final void mo21074e(C8497a aVar) {
        if (aVar instanceof C9362a) {
            C9362a aVar2 = (C9362a) aVar;
            this.f20670b.setText(aVar2.f20674b);
            ViewExtensions.m12870n(this.f20672d, new SflCardViewHolder$bind$1(aVar));
            this.f20671c.setText(aVar2.f20675c);
            return;
        }
        throw new IllegalStateException();
    }
}
