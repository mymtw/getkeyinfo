package com.etsy.android.p327ui.listing.p329ui.footer;

import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReportListingKey;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p425q9.C13265p;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.footer.b */
public final class C10418b {

    /* renamed from: a */
    public final C13265p f22858a;

    /* renamed from: b */
    public final C13573c f22859b;

    public C10418b(C13265p pVar, C13573c cVar) {
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22858a = pVar;
        this.f22859b = cVar;
    }

    /* renamed from: a */
    public final C13574d mo33960a(ListingViewState listingViewState, C13597g.C13602a3 a3Var) {
        C19383o.m32797g(a3Var, "event");
        this.f22859b.mo38043a(new C13597g.C13633f("report_listing_tapped", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.LISTING_ID, a3Var.f30072a))));
        if (this.f22858a.mo45960e()) {
            String str = a3Var.f30072a;
            String str2 = a3Var.f30073b;
            if (str2 == null) {
                str2 = "";
            }
            return new C13574d.C13576b.C13585i(new ReportListingKey(listingViewState.mo33467b(), str, str2));
        }
        this.f22859b.mo38043a(new C13597g.C13652h4(a3Var.f30072a, a3Var.f30073b));
        return C13574d.C13575a.f29662a;
    }
}
