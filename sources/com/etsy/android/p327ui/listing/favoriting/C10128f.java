package com.etsy.android.p327ui.listing.favoriting;

import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.favoriting.f */
public final class C10128f {

    /* renamed from: a */
    public final C13573c f22290a;

    public C10128f(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22290a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13576b mo33528a(C13597g.C13683m0 m0Var) {
        C19383o.m32797g(m0Var, "event");
        if (m0Var.f30178a && m0Var.f30181d.hasCollections()) {
            return new C13574d.C13576b.C13592p(m0Var.f30181d);
        }
        if (m0Var.f30182e) {
            this.f22290a.mo38043a(new C13597g.C13640g(m0Var.f30179b, !m0Var.f30178a));
        }
        return new C13574d.C13576b.C13578b(m0Var.f30181d, m0Var.f30180c);
    }
}
