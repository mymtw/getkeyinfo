package com.etsy.android.p327ui.shop.homesection;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopPolicy;
import com.etsy.android.lib.models.apiv3.StructuredShopRefunds;
import com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.view.shop.policies.RefundsView;
import com.etsy.android.vespa.viewholders.C12086e;
import p438re.C13356b;
import p460ue.C13497g;

/* renamed from: com.etsy.android.ui.shop.homesection.k */
public final class C11161k extends C12086e<C13497g> {

    /* renamed from: c */
    public final C13356b f24675c;

    /* renamed from: d */
    public final C11143e1 f24676d;

    /* renamed from: e */
    public final RefundsView f24677e;

    public C11161k(ViewGroup viewGroup, C13356b bVar, C11192q0 q0Var) {
        super(C0326j.m859c(viewGroup, R.layout.structured_policies_section_refunds, viewGroup, false));
        this.f24675c = bVar;
        this.f24676d = q0Var;
        RefundsView refundsView = (RefundsView) mo38986f(R.id.structured_refunds);
        this.f24677e = refundsView;
        refundsView.hideConditions();
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13497g gVar = (C13497g) obj;
        StructuredShopRefunds refunds = gVar.f29532e.getRefunds();
        if (refunds != null) {
            this.f24677e.setRefunds(refunds, gVar.f29530c, (ListingLevelReturnPolicies) null, this.f24675c);
            this.f24677e.hideConditions();
        }
        ShopPolicy shopPolicy = gVar.f29529b;
        if (shopPolicy != null) {
            this.f24677e.setUnstructuredReturnText(((C11192q0) this.f24676d).mo36861a(shopPolicy.getRefundPolicy(), shopPolicy.getRefundPolicyTranslated()).trim());
        }
    }
}
