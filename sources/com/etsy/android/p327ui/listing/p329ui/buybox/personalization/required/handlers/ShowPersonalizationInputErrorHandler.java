package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.required.handlers.ShowPersonalizationInputErrorHandler */
public final class ShowPersonalizationInputErrorHandler {

    /* renamed from: a */
    public final C13573c f22605a;

    public ShowPersonalizationInputErrorHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22605a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo33662a(ListingViewState.C10092d dVar, C13597g.C13775z3 z3Var) {
        C19383o.m32797g(z3Var, "event");
        this.f22605a.mo38043a(new C13597g.C13633f("personalization_validation_failed", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.FAILURE_REASON, "personalization text missing"))));
        C10423j jVar = dVar.f22238f.f22802e.f22829n;
        return jVar instanceof C10285a ? C0761x.m1709a1(dVar, new ShowPersonalizationInputErrorHandler$handle$1(jVar, z3Var)) : jVar instanceof C10279a ? C0761x.m1709a1(dVar, new ShowPersonalizationInputErrorHandler$handle$2(jVar, z3Var)) : C13574d.C13575a.f29662a;
    }
}
