package com.etsy.android.p327ui.shop.homesection;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.StructuredShopPayments;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPaymentsView;
import com.etsy.android.vespa.viewholders.C12086e;
import p438re.C13356b;
import p460ue.C13497g;

/* renamed from: com.etsy.android.ui.shop.homesection.l */
public final class C11162l extends C12086e<C13497g> {

    /* renamed from: c */
    public final C13356b f24678c;

    /* renamed from: d */
    public StructuredShopPaymentsView f24679d = ((StructuredShopPaymentsView) mo38986f(R.id.structured_payments));

    public C11162l(ViewGroup viewGroup, C13356b bVar) {
        super(C0326j.m859c(viewGroup, R.layout.structured_policies_section_payments, viewGroup, false));
        this.f24678c = bVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        StructuredShopPayments payments = ((C13497g) obj).f29532e.getPayments();
        if (payments != null) {
            this.f24679d.setStructuredShopPayments(payments, this.f24678c);
        }
    }
}
