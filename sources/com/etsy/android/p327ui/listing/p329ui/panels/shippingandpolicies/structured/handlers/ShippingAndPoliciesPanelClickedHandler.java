package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.handlers.ShippingAndPoliciesPanelClickedHandler */
public final class ShippingAndPoliciesPanelClickedHandler {

    /* renamed from: a */
    public final C13573c f23255a;

    public ShippingAndPoliciesPanelClickedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23255a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34200a(ListingViewState.C10092d dVar, C13597g.C13728s3 s3Var) {
        C19383o.m32797g(s3Var, "event");
        C10590a aVar = dVar.f22238f.f22803f.f22845c;
        if (aVar != null && aVar.f23225a == s3Var.f30248a) {
            return C13574d.C13575a.f29662a;
        }
        this.f23255a.mo38043a(new C13597g.C13633f(s3Var.f30248a ? "shipping_and_policies_panel_expanded" : "shipping_and_policies_panel_collapsed"));
        return C0761x.m1709a1(dVar, new ShippingAndPoliciesPanelClickedHandler$handle$1(s3Var));
    }
}
