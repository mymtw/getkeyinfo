package com.etsy.android.p327ui.listing.favoriting;

import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.favoriting.b */
public final class C10124b {

    /* renamed from: a */
    public final C13265p f22285a;

    /* renamed from: b */
    public final C13573c f22286b;

    public C10124b(C13265p pVar, C13573c cVar) {
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22285a = pVar;
        this.f22286b = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33524a(ListingViewState.C10092d dVar, C13597g.C13647h hVar) {
        C19383o.m32797g(hVar, "event");
        long idAsLongDeprecated = this.f22285a.mo45958c().getIdAsLongDeprecated();
        Long l = dVar.mo33484l();
        if (l != null && idAsLongDeprecated == l.longValue()) {
            this.f22286b.mo38043a(C13597g.C13690n0.f30192a);
        } else if (!this.f22285a.mo45960e()) {
            this.f22286b.mo38043a(new C13597g.C13638f4(hVar.f30130a));
        } else {
            this.f22286b.mo38043a(new C13597g.C13683m0(hVar.f30130a, hVar.f30132c, hVar.f30133d, hVar.f30131b, hVar.f30134e));
        }
        return C13574d.C13575a.f29662a;
    }
}
