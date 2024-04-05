package com.etsy.android.p327ui.listing.p329ui.productwarninginfo;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.productwarninginfo.ProductWarningInfoAnalyticsHandler */
public final class ProductWarningInfoAnalyticsHandler {

    /* renamed from: a */
    public final C13573c f23307a;

    public ProductWarningInfoAnalyticsHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23307a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34222a(ListingViewState.C10092d dVar) {
        C10621a aVar = dVar.f22238f.f22809l;
        if (aVar != null ? aVar.f23312c : true) {
            return C13574d.C13575a.f29662a;
        }
        this.f23307a.mo38043a(new C13597g.C13633f("product_warning_info_seen", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.REFERRER, dVar.mo33467b()), new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(dVar.mo33477f())))));
        return C0761x.m1709a1(dVar, ProductWarningInfoAnalyticsHandler$handle$1.INSTANCE);
    }
}
