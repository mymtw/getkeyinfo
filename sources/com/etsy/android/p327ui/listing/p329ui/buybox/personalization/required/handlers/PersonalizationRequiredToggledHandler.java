package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.required.handlers.PersonalizationRequiredToggledHandler */
public final class PersonalizationRequiredToggledHandler {

    /* renamed from: a */
    public final C13573c f22604a;

    public PersonalizationRequiredToggledHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22604a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo33659a(ListingViewState.C10092d dVar) {
        C10423j jVar = dVar.f22238f.f22802e.f22829n;
        C10285a aVar = jVar instanceof C10285a ? (C10285a) jVar : null;
        if (aVar == null) {
            return C13574d.C13575a.f29662a;
        }
        this.f22604a.mo38043a(new C13597g.C13633f(aVar.f22599a ? "listing_required_personalization_collapsed" : "listing_required_personalization_expanded"));
        return C0761x.m1709a1(dVar, new PersonalizationRequiredToggledHandler$handle$1$1(aVar));
    }
}
