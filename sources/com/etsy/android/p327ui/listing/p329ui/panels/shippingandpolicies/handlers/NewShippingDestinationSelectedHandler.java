package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.NewShippingDestinationSelectedHandler */
public final class NewShippingDestinationSelectedHandler {

    /* renamed from: a */
    public final C13573c f23176a;

    public NewShippingDestinationSelectedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23176a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo34176a(ListingViewState.C10092d dVar, C13597g.C13650h2 h2Var) {
        C19383o.m32797g(h2Var, "event");
        return C0761x.m1709a1(dVar, new NewShippingDestinationSelectedHandler$handle$1(dVar, h2Var, this));
    }
}
