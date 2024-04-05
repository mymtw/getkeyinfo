package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.handlers.SeeMoreSellerDetailsClickedHandler */
public final class SeeMoreSellerDetailsClickedHandler {

    /* renamed from: a */
    public final C13573c f23254a;

    public SeeMoreSellerDetailsClickedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23254a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo34197a(ListingViewState.C10092d dVar, C13597g.C13693n3 n3Var) {
        C19383o.m32797g(n3Var, "event");
        this.f23254a.mo38043a(new C13597g.C13633f("trader_distinction_see_details_clicked"));
        return C0761x.m1709a1(dVar, new SeeMoreSellerDetailsClickedHandler$handle$1(n3Var));
    }
}
