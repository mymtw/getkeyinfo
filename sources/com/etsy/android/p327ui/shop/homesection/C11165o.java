package com.etsy.android.p327ui.shop.homesection;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.StructuredShopShipping;
import com.etsy.android.uikit.view.shop.policies.StructuredShopShippingView;
import com.etsy.android.vespa.viewholders.C12086e;
import p460ue.C13497g;

/* renamed from: com.etsy.android.ui.shop.homesection.o */
public final class C11165o extends C12086e<C13497g> {

    /* renamed from: c */
    public StructuredShopShippingView f24689c = ((StructuredShopShippingView) mo38986f(R.id.structured_shipping));

    public C11165o(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.structured_policies_section_shipping, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        StructuredShopShipping shipping = ((C13497g) obj).f29532e.getShipping();
        if (shipping != null) {
            this.f24689c.setStructuredShopShipping(shipping, true);
        }
    }
}
