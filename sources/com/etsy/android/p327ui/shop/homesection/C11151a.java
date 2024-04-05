package com.etsy.android.p327ui.shop.homesection;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.StructuredShopRefunds;
import com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies;
import com.etsy.android.uikit.view.shop.policies.RefundsView;
import com.etsy.android.vespa.viewholders.C12086e;
import p438re.C13356b;
import p460ue.C13497g;

/* renamed from: com.etsy.android.ui.shop.homesection.a */
public final class C11151a extends C12086e<C13497g> {

    /* renamed from: c */
    public final C13356b f24652c;

    /* renamed from: d */
    public RefundsView f24653d = ((RefundsView) mo38986f(R.id.structured_refunds));

    public C11151a(ViewGroup viewGroup, C13356b bVar) {
        super(C0326j.m859c(viewGroup, R.layout.structured_policies_section_refunds, viewGroup, false));
        this.f24652c = bVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13497g gVar = (C13497g) obj;
        StructuredShopRefunds refunds = gVar.f29532e.getRefunds();
        if (refunds != null) {
            this.f24653d.setRefunds(refunds, gVar.f29530c, (ListingLevelReturnPolicies) null, this.f24652c);
        }
    }
}
