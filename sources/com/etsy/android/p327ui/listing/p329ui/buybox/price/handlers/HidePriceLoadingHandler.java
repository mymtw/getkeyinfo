package com.etsy.android.p327ui.listing.p329ui.buybox.price.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import p375jd.C12971a;
import p375jd.C12974d;
import p466vc.C13574d;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.price.handlers.HidePriceLoadingHandler */
public final class HidePriceLoadingHandler {
    /* renamed from: a */
    public static C13574d.C13594c m18351a(ListingViewState.C10092d dVar) {
        C10423j jVar = dVar.f22238f.f22802e.f22818c;
        C12974d dVar2 = null;
        C12971a aVar = jVar instanceof C12971a ? (C12971a) jVar : null;
        C12971a b = aVar != null ? C12971a.m20653b(aVar, (C10563f) null, false, 7) : null;
        C10423j jVar2 = dVar.f22238f.f22802e.f22818c;
        C12974d dVar3 = jVar2 instanceof C12974d ? (C12974d) jVar2 : null;
        if (dVar3 != null) {
            dVar2 = C12974d.m20657b(dVar3, (C10563f) null, false, 31);
        }
        return C0761x.m1709a1(dVar, new HidePriceLoadingHandler$handle$1(b, dVar2));
    }
}
