package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.optional.handlers.PersonalizationOptionalToggledHandler */
public final class PersonalizationOptionalToggledHandler {

    /* renamed from: a */
    public final C13573c f22590a;

    public PersonalizationOptionalToggledHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22590a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo33650a(ListingViewState.C10092d dVar) {
        C10423j jVar = dVar.f22238f.f22802e.f22829n;
        String str = null;
        C10279a aVar = jVar instanceof C10279a ? (C10279a) jVar : null;
        if (aVar == null) {
            return C13574d.C13575a.f29662a;
        }
        boolean z = !aVar.f22585a;
        this.f22590a.mo38043a(new C13597g.C13633f(z ? "listing_optional_personalization_expanded" : "listing_optional_personalization_collapsed"));
        if (z) {
            str = aVar.f22589e;
        }
        return C0761x.m1709a1(dVar, new PersonalizationOptionalToggledHandler$handle$1$1(aVar, z, str));
    }
}
