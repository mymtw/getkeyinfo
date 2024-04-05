package com.etsy.android.p327ui.listing.handlers;

import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.handlers.o */
public final class C10177o {
    /* renamed from: a */
    public static C13574d m18279a(ListingViewState.C10092d dVar, C13597g.C13664j2 j2Var) {
        C19383o.m32797g(j2Var, "event");
        if (j2Var.f30157a) {
            return C13574d.C13575a.f29662a;
        }
        return new C13574d.C13576b.C13577a("listing_displayed_to_user", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.REFERRER, dVar.mo33467b()), new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(dVar.mo33477f()))));
    }
}
