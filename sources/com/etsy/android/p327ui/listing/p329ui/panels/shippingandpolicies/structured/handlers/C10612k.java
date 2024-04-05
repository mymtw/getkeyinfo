package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.handlers.k */
public final class C10612k {

    /* renamed from: a */
    public final C13573c f23263a;

    public C10612k(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23263a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13576b.C13585i mo34212a(ListingViewState listingViewState, C13597g.C13604a5 a5Var) {
        C19383o.m32797g(a5Var, "event");
        this.f23263a.mo38043a(new C13597g.C13633f("trader_distinction_link_clicked"));
        return new C13574d.C13576b.C13585i(new GenericHelpKey(listingViewState.mo33467b(), a5Var.f30075a));
    }
}
