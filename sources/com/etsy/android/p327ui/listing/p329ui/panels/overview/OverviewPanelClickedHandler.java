package com.etsy.android.p327ui.listing.p329ui.panels.overview;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.overview.OverviewPanelClickedHandler */
public final class OverviewPanelClickedHandler {

    /* renamed from: a */
    public final C13573c f23061a;

    public OverviewPanelClickedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23061a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34096a(ListingViewState.C10092d dVar, C13597g.C13706p2 p2Var) {
        C19383o.m32797g(p2Var, "event");
        C10518b bVar = dVar.f22238f.f22803f.f22843a;
        if (bVar != null && bVar.f23068b == p2Var.f30219a) {
            return C13574d.C13575a.f29662a;
        }
        this.f23061a.mo38043a(new C13597g.C13633f(p2Var.f30219a ? "item_overview_panel_expanded" : "item_overview_panel_collapsed"));
        return C0761x.m1709a1(dVar, new OverviewPanelClickedHandler$handle$1(p2Var));
    }
}
