package com.etsy.android.p327ui.listing.p329ui.shop.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.shop.handlers.StarSellerBadgeTappedHandler */
public final class StarSellerBadgeTappedHandler {

    /* renamed from: a */
    public final C13573c f23376a;

    public StarSellerBadgeTappedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23376a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34283a(ListingViewState.C10092d dVar) {
        C10644a.C10645a aVar;
        C10644a aVar2 = dVar.f22238f.f22799b.f22850a;
        if (aVar2 == null || (aVar = aVar2.f23397h) == null) {
            return C13574d.C13575a.f29662a;
        }
        String str = aVar.f23402e;
        if (str != null) {
            this.f23376a.mo38043a(new C13597g.C13633f(str));
        }
        return C0761x.m1709a1(dVar, new StarSellerBadgeTappedHandler$handle$1$2(aVar));
    }
}
