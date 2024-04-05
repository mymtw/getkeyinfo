package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.ItemDetailsPanelClickedHandler */
public final class ItemDetailsPanelClickedHandler {

    /* renamed from: a */
    public final C13573c f23054a;

    public ItemDetailsPanelClickedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23054a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34081a(ListingViewState.C10092d dVar, C13597g.C13712q1 q1Var) {
        C19383o.m32797g(q1Var, "event");
        boolean z = dVar.f22238f.f22803f.f22848f.f23023o;
        boolean z2 = q1Var.f30226a;
        if (z == z2) {
            return C13574d.C13575a.f29662a;
        }
        this.f23054a.mo38043a(new C13597g.C13633f(z2 ? "item_details_panel_expanded" : "item_details_panel_collapsed"));
        return C0761x.m1709a1(dVar, new ItemDetailsPanelClickedHandler$handle$1(q1Var));
    }
}
