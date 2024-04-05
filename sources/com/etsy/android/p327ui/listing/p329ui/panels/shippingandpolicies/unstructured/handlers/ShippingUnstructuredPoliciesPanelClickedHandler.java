package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.handlers.ShippingUnstructuredPoliciesPanelClickedHandler */
public final class ShippingUnstructuredPoliciesPanelClickedHandler {

    /* renamed from: a */
    public final C13573c f23306a;

    public ShippingUnstructuredPoliciesPanelClickedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23306a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34218a(ListingViewState.C10092d dVar, C13597g.C13749v3 v3Var) {
        C19383o.m32797g(v3Var, "event");
        C10615a aVar = dVar.f22238f.f22803f.f22844b;
        if (aVar != null && aVar.f23286a == v3Var.f30277a) {
            return C13574d.C13575a.f29662a;
        }
        this.f23306a.mo38043a(new C13597g.C13633f(v3Var.f30277a ? "shipping_and_policies_panel_expanded" : "shipping_and_policies_panel_collapsed"));
        return C0761x.m1709a1(dVar, new ShippingUnstructuredPoliciesPanelClickedHandler$handle$1(v3Var));
    }
}
