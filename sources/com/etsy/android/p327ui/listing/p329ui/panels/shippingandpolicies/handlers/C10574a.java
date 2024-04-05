package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.a */
public final class C10574a {

    /* renamed from: a */
    public final C11786n f23177a;

    /* renamed from: b */
    public final C13573c f23178b;

    public C10574a(C13573c cVar, C11786n nVar) {
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23177a = nVar;
        this.f23178b = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo34184a(ListingViewState.C10092d dVar) {
        this.f23178b.mo38043a(new C13597g.C13633f("shipping_cost_retreival_error"));
        return C0761x.m1709a1(dVar, new FetchShippingDetailsFailedHandler$handle$1(this));
    }
}
