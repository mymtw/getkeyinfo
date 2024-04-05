package com.etsy.android.p327ui.listing.favoriting;

import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.favoriting.k */
public final class C10135k {

    /* renamed from: a */
    public final C13573c f22294a;

    public C10135k(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22294a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33530a(C13597g.C13671k2 k2Var) {
        C19383o.m32797g(k2Var, "event");
        LinkedHashMap t0 = C19294b0.m32563t0(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(k2Var.f30164a)));
        if (C18263b.m30839d0(k2Var.f30165b)) {
            t0.put(PredefinedAnalyticsProperty.CONTENT_SOURCE, k2Var.f30165b);
        }
        this.f22294a.mo38043a(new C13597g.C13633f("favorite_item", t0));
        this.f22294a.mo38043a(new C13597g.C13773z1(k2Var.f30164a, true));
        return C13574d.C13575a.f29662a;
    }
}
