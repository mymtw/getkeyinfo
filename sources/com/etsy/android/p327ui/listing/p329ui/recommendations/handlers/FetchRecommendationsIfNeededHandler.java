package com.etsy.android.p327ui.listing.p329ui.recommendations.handlers;

import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;
import p459ud.C13490k;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.recommendations.handlers.FetchRecommendationsIfNeededHandler */
public final class FetchRecommendationsIfNeededHandler {

    /* renamed from: a */
    public final C13490k f23323a;

    /* renamed from: b */
    public final C13461f f23324b;

    /* renamed from: c */
    public final C13573c f23325c;

    public FetchRecommendationsIfNeededHandler(C13490k kVar, C13461f fVar, C13573c cVar) {
        C19383o.m32797g(kVar, "recommendedListingsRepository");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23323a = kVar;
        this.f23324b = fVar;
        this.f23325c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (((r6 != null ? r6.getSellerTaxonomyId() : null) != null && kotlin.jvm.internal.C19383o.m32792b(r5.f22238f.f22808k, p459ud.C13473a.C13477d.f29499b)) != false) goto L_0x003b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d mo34259a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r5, p466vc.C13597g.C13732t0 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r0 = r5.f22239g
            com.etsy.android.lib.models.apiv3.listing.ListingCard r0 = r0.getListingCard()
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.Integer r0 = r0.getSellerTaxonomyId()
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x009f
            boolean r6 = r6.f30254a
            if (r6 != 0) goto L_0x003b
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r6 = r5.f22239g
            com.etsy.android.lib.models.apiv3.listing.ListingCard r6 = r6.getListingCard()
            if (r6 == 0) goto L_0x0027
            java.lang.Integer r6 = r6.getSellerTaxonomyId()
            goto L_0x0028
        L_0x0027:
            r6 = r1
        L_0x0028:
            if (r6 == 0) goto L_0x0038
            com.etsy.android.ui.listing.ui.f r6 = r5.f22238f
            ud.a r6 = r6.f22808k
            ud.a$d r0 = p459ud.C13473a.C13477d.f29499b
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r0)
            if (r6 == 0) goto L_0x0038
            r6 = 1
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            if (r6 == 0) goto L_0x009f
        L_0x003b:
            long r2 = r5.mo33477f()
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r6 = r5.f22239g
            com.etsy.android.lib.models.apiv3.listing.ListingCard r6 = r6.getListingCard()
            if (r6 == 0) goto L_0x004b
            java.lang.Integer r1 = r6.getSellerTaxonomyId()
        L_0x004b:
            kotlin.jvm.internal.C19383o.m32794d(r1)
            int r6 = r1.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            ud.k r0 = r4.f23323a
            r0.getClass()
            ud.i r0 = r0.f29519a
            tp.s r6 = r0.mo46158a(r2, r6)
            cc.a r0 = new cc.a
            r1 = 4
            r0.<init>(r1)
            r6.getClass()
            io.reactivex.internal.operators.single.j r1 = new io.reactivex.internal.operators.single.j
            r1.<init>(r6, r0)
            cc.b r6 = new cc.b
            r0 = 5
            r6.<init>(r0)
            io.reactivex.internal.operators.single.l r0 = new io.reactivex.internal.operators.single.l
            r0.<init>(r1, r6)
            ua.f r6 = r4.f23324b
            io.reactivex.internal.operators.single.SingleSubscribeOn r6 = androidx.compose.animation.C0472h.m1243e(r6, r0)
            hc.b r0 = new hc.b
            r1 = 2
            r0.<init>(r1)
            io.reactivex.internal.operators.single.j r1 = new io.reactivex.internal.operators.single.j
            r1.<init>(r6, r0)
            com.etsy.android.ui.listing.ui.recommendations.handlers.FetchRecommendationsIfNeededHandler$fetchRecommendations$2 r6 = new com.etsy.android.ui.listing.ui.recommendations.handlers.FetchRecommendationsIfNeededHandler$fetchRecommendations$2
            r6.<init>(r4)
            com.etsy.android.ui.listing.ui.recommendations.handlers.FetchRecommendationsIfNeededHandler$fetchRecommendations$3 r0 = new com.etsy.android.ui.listing.ui.recommendations.handlers.FetchRecommendationsIfNeededHandler$fetchRecommendations$3
            r0.<init>(r4)
            p145io.reactivex.rxkotlin.SubscribersKt.m32500e(r1, r6, r0)
            com.etsy.android.ui.listing.ui.recommendations.handlers.FetchRecommendationsIfNeededHandler$handle$1 r6 = com.etsy.android.p327ui.listing.p329ui.recommendations.handlers.FetchRecommendationsIfNeededHandler$handle$1.INSTANCE
            vc.d$c r5 = androidx.compose.foundation.layout.C0761x.m1709a1(r5, r6)
            goto L_0x00a1
        L_0x009f:
            vc.d$a r5 = p466vc.C13574d.C13575a.f29662a
        L_0x00a1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.recommendations.handlers.FetchRecommendationsIfNeededHandler.mo34259a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$t0):vc.d");
    }
}
