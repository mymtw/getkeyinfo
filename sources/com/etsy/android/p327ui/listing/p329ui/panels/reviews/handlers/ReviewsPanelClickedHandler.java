package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.C10521a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.ReviewsPanelClickedHandler */
public final class ReviewsPanelClickedHandler {

    /* renamed from: a */
    public final C13573c f23096a;

    public ReviewsPanelClickedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23096a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34110a(ListingViewState.C10092d dVar, C13597g.C13637f3 f3Var) {
        C19383o.m32797g(f3Var, "event");
        C10521a aVar = dVar.f22238f.f22803f.f22847e;
        if (aVar != null && aVar.f23094l == f3Var.f30117a) {
            return C13574d.C13575a.f29662a;
        }
        this.f23096a.mo38043a(new C13597g.C13633f(f3Var.f30117a ? "reviews_panel_expanded" : "reviews_panel_collapsed"));
        return C0761x.m1709a1(dVar, new ReviewsPanelClickedHandler$handle$1(f3Var));
    }
}
