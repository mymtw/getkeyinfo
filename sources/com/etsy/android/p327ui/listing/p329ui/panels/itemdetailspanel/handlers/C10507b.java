package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.b */
public final class C10507b {

    /* renamed from: a */
    public final C10156h f23056a;

    public C10507b(C10156h hVar) {
        C19383o.m32797g(hVar, "listingViewEligibility");
        this.f23056a = hVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo34092a(C13597g.C13731t tVar, ListingViewState.C10092d dVar) {
        C19383o.m32797g(tVar, "event");
        return C0761x.m1709a1(dVar, new ContentMachineTranslationLoadingHandler$handle$1(dVar, this, tVar));
    }
}
