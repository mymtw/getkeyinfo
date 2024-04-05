package com.etsy.android.p327ui.shop.homesection;

import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.SellerDetails;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.C9717d;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.vespa.viewholders.C12086e;
import p460ue.C13495e;

/* renamed from: com.etsy.android.ui.shop.homesection.j */
public final class C11160j extends C12086e<C13495e> {

    /* renamed from: f */
    public static final /* synthetic */ int f24671f = 0;

    /* renamed from: c */
    public final ViewGroup f24672c = ((ViewGroup) this.itemView.findViewById(R.id.root_view));

    /* renamed from: d */
    public final TextView f24673d = ((TextView) this.itemView.findViewById(R.id.body_text_view));

    /* renamed from: e */
    public final TextView f24674e = ((TextView) this.itemView.findViewById(R.id.view_more_text_view));

    public C11160j(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_section_content_text, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13495e eVar = (C13495e) obj;
        SellerDetails sellerDetails = eVar.f29526b;
        if (sellerDetails != null) {
            String traderDistinction = sellerDetails.getTraderDistinction();
            if (C8885d0.m17324h(traderDistinction)) {
                this.f24673d.setText(Html.fromHtml(traderDistinction, 63));
                EtsyLinkify.m19609c(this.f24673d, true, new C9717d(this, 1));
                this.f24673d.setVisibility(0);
            } else {
                this.f24673d.setVisibility(8);
            }
            SpannableString spannableString = new SpannableString(this.f24674e.getText());
            spannableString.setSpan(new C11159i(this, eVar), 0, spannableString.length(), 33);
            this.f24674e.setText(spannableString);
            this.f24674e.setMovementMethod(LinkMovementMethod.getInstance());
            this.f24674e.setVisibility(0);
            ViewGroup viewGroup = this.f24672c;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), this.f24672c.getPaddingTop(), this.f24672c.getPaddingRight(), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_8));
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
    }
}
