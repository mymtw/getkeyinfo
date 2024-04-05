package com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.handlers.FaqsPanelClickedHandler */
public final class FaqsPanelClickedHandler {

    /* renamed from: a */
    public final C13573c f22999a;

    public FaqsPanelClickedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22999a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34039a(ListingViewState.C10092d dVar, C13597g.C13676l0 l0Var) {
        C19383o.m32797g(l0Var, "event");
        FaqsPanel faqsPanel = dVar.f22238f.f22803f.f22846d;
        if (faqsPanel != null && faqsPanel.f22979e == l0Var.f30170a) {
            return C13574d.C13575a.f29662a;
        }
        this.f22999a.mo38043a(new C13597g.C13633f(l0Var.f30170a ? "faqs_panel_expanded" : "faqs_panel_collapsed"));
        return C0761x.m1709a1(dVar, new FaqsPanelClickedHandler$handle$1(l0Var));
    }
}
