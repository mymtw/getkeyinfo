package com.etsy.android.p327ui.listing.p329ui.panels.overview;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.overview.a */
public final class C10517a {

    /* renamed from: a */
    public final C13573c f23066a;

    public C10517a(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23066a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo34101a(ListingViewState.C10092d dVar) {
        this.f23066a.mo38043a(new C13597g.C13633f("item_overview_visible"));
        return C0761x.m1709a1(dVar, LogOverviewPanelVisibleHandler$handle$1.INSTANCE);
    }
}
