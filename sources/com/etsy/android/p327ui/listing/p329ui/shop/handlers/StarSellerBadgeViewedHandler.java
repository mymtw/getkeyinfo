package com.etsy.android.p327ui.listing.p329ui.shop.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.shop.handlers.StarSellerBadgeViewedHandler */
public final class StarSellerBadgeViewedHandler {

    /* renamed from: a */
    public final C13573c f23377a;

    public StarSellerBadgeViewedHandler(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23377a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34286a(ListingViewState.C10092d dVar) {
        C10644a.C10645a aVar;
        C13574d dVar2;
        C10644a aVar2 = dVar.f22238f.f22799b.f22850a;
        if (!(aVar2 == null || (aVar = aVar2.f23397h) == null)) {
            if (aVar.f23404g || !C18263b.m30839d0(aVar.f23403f)) {
                dVar2 = C13574d.C13575a.f29662a;
            } else {
                this.f23377a.mo38043a(new C13597g.C13633f(aVar.f23403f));
                dVar2 = C0761x.m1709a1(dVar, new StarSellerBadgeViewedHandler$handle$1$1(aVar));
            }
            if (dVar2 != null) {
                return dVar2;
            }
        }
        return C13574d.C13575a.f29662a;
    }
}
