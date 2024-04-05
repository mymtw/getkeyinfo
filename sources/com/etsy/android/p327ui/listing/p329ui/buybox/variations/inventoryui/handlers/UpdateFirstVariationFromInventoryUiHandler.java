package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.UpdateFirstVariationFromInventoryUiHandler */
public final class UpdateFirstVariationFromInventoryUiHandler {
    /* renamed from: a */
    public static C13574d m18385a(ListingViewState.C10092d dVar, C13597g.C13625d5 d5Var) {
        C19383o.m32797g(d5Var, "event");
        C10423j jVar = dVar.f22238f.f22802e.f22823h;
        C10334a aVar = jVar instanceof C10334a ? (C10334a) jVar : null;
        return aVar != null ? C0761x.m1709a1(dVar, new UpdateFirstVariationFromInventoryUiHandler$handle$1$1(d5Var, aVar)) : C13574d.C13575a.f29662a;
    }
}
