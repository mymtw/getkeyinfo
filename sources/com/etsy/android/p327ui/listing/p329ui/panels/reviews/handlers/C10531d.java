package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.d */
public final class C10531d {

    /* renamed from: a */
    public final C8623e f23102a;

    public C10531d(C8623e eVar) {
        C19383o.m32797g(eVar, "configMap");
        this.f23102a = eVar;
    }

    /* renamed from: a */
    public final C13574d mo34117a(ListingViewState listingViewState, C13597g.C13623d3 d3Var) {
        C19383o.m32797g(d3Var, "event");
        if (!(!d3Var.f30098a.isEmpty())) {
            return C13574d.C13575a.f29662a;
        }
        ListingReviewNavigationKey.C10703a aVar = ListingReviewNavigationKey.Companion;
        boolean b = this.f23102a.mo21132b(C8592b.f18847y1);
        String b2 = listingViewState.mo33467b();
        List<ReviewImage> list = d3Var.f30098a;
        int i = d3Var.f30099b;
        aVar.getClass();
        return new C13574d.C13576b.C13585i(ListingReviewNavigationKey.C10703a.m18610a(b, b2, list, i));
    }
}
