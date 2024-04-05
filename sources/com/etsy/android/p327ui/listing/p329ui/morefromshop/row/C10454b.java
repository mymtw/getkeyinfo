package com.etsy.android.p327ui.listing.p329ui.morefromshop.row;

import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.morefromshop.row.b */
public final class C10454b {

    /* renamed from: a */
    public final C13573c f22953a;

    public C10454b(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22953a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34003a(C13597g.C13615c2 c2Var) {
        C19383o.m32797g(c2Var, "event");
        this.f22953a.mo38043a(new C13597g.C13633f("more_from_shop_listing_item_click", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(c2Var.f30088a)))));
        this.f22953a.mo38043a(new C13597g.C13685m2(c2Var.f30088a));
        return C13574d.C13575a.f29662a;
    }
}
