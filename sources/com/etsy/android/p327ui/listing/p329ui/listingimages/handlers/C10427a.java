package com.etsy.android.p327ui.listing.p329ui.listingimages.handlers;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.pushoptin.ConversationPushOptInBottomSheetKey;
import kotlin.jvm.internal.C19383o;
import p336dc.C12646d;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.listingimages.handlers.a */
public final class C10427a {

    /* renamed from: a */
    public final C12646d f22903a;

    public C10427a(C13573c cVar, C12646d dVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(dVar, "optInEligibility");
        this.f22903a = dVar;
    }

    /* renamed from: a */
    public final C13574d mo33979a(ListingViewState.C10092d dVar, C13597g.C13745v vVar) {
        C19383o.m32797g(vVar, "event");
        if (!this.f22903a.mo45425a()) {
            return C13574d.C13575a.f29662a;
        }
        this.f22903a.mo45426b();
        return new C13574d.C13576b.C13585i(new ConversationPushOptInBottomSheetKey(dVar.mo33467b(), ResponseConstants.LISTING));
    }
}
