package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.p327ui.listing.C10156h;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.f */
public final class C10534f {

    /* renamed from: a */
    public final C13573c f23104a;

    /* renamed from: b */
    public final C10156h f23105b;

    public C10534f(C10156h hVar, C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(hVar, "listingViewEligibility");
        this.f23104a = cVar;
        this.f23105b = hVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34118a(C13597g.C13644g3 g3Var) {
        C19383o.m32797g(g3Var, "event");
        this.f23104a.mo38043a(new C13597g.C13633f("listing_reviews_summary_tapped"));
        if (this.f23105b.f22335a.mo21132b(C8592b.C8601i.f18898l)) {
            this.f23104a.mo38043a(new C13597g.C13629e2(g3Var.f30125a, g3Var.f30126b));
        }
        return C13574d.C13575a.f29662a;
    }
}
