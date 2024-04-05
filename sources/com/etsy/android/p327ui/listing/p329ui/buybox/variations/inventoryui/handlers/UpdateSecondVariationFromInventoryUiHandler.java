package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.UpdateSecondVariationFromInventoryUiHandler */
public final class UpdateSecondVariationFromInventoryUiHandler {
    /* renamed from: a */
    public static C13574d m18386a(ListingViewState.C10092d dVar, C13597g.C13660i5 i5Var) {
        C19383o.m32797g(i5Var, "event");
        C10423j jVar = dVar.f22238f.f22802e.f22824i;
        C10336b bVar = jVar instanceof C10336b ? (C10336b) jVar : null;
        return bVar != null ? C0761x.m1709a1(dVar, new UpdateSecondVariationFromInventoryUiHandler$handle$1$1(i5Var, bVar)) : C13574d.C13575a.f29662a;
    }
}
