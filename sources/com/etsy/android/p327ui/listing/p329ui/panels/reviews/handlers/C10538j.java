package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.j */
public final class C10538j {

    /* renamed from: a */
    public final C13573c f23110a;

    public C10538j(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23110a = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r4 = r4.getOwner();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d mo34122a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r25, p466vc.C13597g.C13744u5 r26) {
        /*
            r24 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r2 = r24
            vc.c r3 = r2.f23110a
            vc.g$f r4 = new vc.g$f
            java.lang.String r5 = "listing_see_all_reviews_tapped"
            r4.<init>(r5)
            r3.mo38043a(r4)
            long r7 = r25.mo33477f()
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r3 = r0.f22239g
            java.lang.String r9 = r3.getTitle()
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r3 = r0.f22239g
            com.etsy.android.lib.models.apiv3.listing.ListingCard r3 = r3.getListingCard()
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = r3.getUrl()
            if (r3 != 0) goto L_0x0031
        L_0x002f:
            java.lang.String r3 = ""
        L_0x0031:
            r10 = r3
            java.lang.Long r3 = r25.mo33484l()
            com.etsy.android.lib.models.apiv3.listing.Shop r4 = r25.mo33483k()
            r5 = 0
            if (r4 == 0) goto L_0x0049
            com.etsy.android.lib.models.apiv3.listing.User r4 = r4.getOwner()
            if (r4 == 0) goto L_0x0049
            java.lang.Long r4 = r4.getUserId()
            r13 = r4
            goto L_0x004a
        L_0x0049:
            r13 = r5
        L_0x004a:
            com.etsy.android.lib.models.apiv3.listing.Shop r4 = r25.mo33483k()
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r25.mo33483k()
            if (r6 == 0) goto L_0x005a
            java.lang.String r6 = r6.getName()
            r14 = r6
            goto L_0x005b
        L_0x005a:
            r14 = r5
        L_0x005b:
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r25.mo33483k()
            if (r6 == 0) goto L_0x006d
            com.etsy.android.lib.models.apiv3.listing.User r6 = r6.getOwner()
            if (r6 == 0) goto L_0x006d
            java.lang.String r6 = r6.getLoginName()
            r15 = r6
            goto L_0x006e
        L_0x006d:
            r15 = r5
        L_0x006e:
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r25.mo33483k()
            if (r6 == 0) goto L_0x0081
            com.etsy.android.lib.models.apiv3.listing.User r6 = r6.getOwner()
            if (r6 == 0) goto L_0x0081
            java.lang.String r6 = r6.getDisplayName()
            r16 = r6
            goto L_0x0083
        L_0x0081:
            r16 = r5
        L_0x0083:
            if (r3 == 0) goto L_0x00be
            if (r4 == 0) goto L_0x00be
            com.etsy.android.feedback.ItemReviewsFragment$ItemReviewsUiData r4 = new com.etsy.android.feedback.ItemReviewsFragment$ItemReviewsUiData
            r6 = r4
            long r11 = r3.longValue()
            com.etsy.android.ui.listing.ui.panels.reviews.a r3 = r1.f30269b
            com.etsy.android.lib.models.apiv3.listing.Reviews r3 = r3.f23084b
            int r17 = r3.getTotalListingReviewsCount()
            com.etsy.android.ui.listing.ui.panels.reviews.a r3 = r1.f30269b
            com.etsy.android.lib.models.apiv3.listing.Reviews r3 = r3.f23084b
            java.util.List r18 = r3.getListingReviewImages()
            r19 = 0
            com.etsy.android.ui.listing.ui.panels.reviews.a r1 = r1.f30269b
            com.etsy.android.lib.models.apiv3.listing.Reviews r1 = r1.f23084b
            java.util.List r1 = r1.getListingReviewVideos()
            boolean r20 = kotlinx.coroutines.C19543e0.m33306Y(r1)
            r21 = 1
            r22 = 1024(0x400, float:1.435E-42)
            r23 = 0
            r6.<init>(r7, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.etsy.android.ui.navigation.keys.fragmentkeys.ItemReviewsKey r5 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ItemReviewsKey
            java.lang.String r0 = r25.mo33467b()
            r5.<init>(r0, r4)
        L_0x00be:
            if (r5 == 0) goto L_0x00c6
            vc.d$b$i r0 = new vc.d$b$i
            r0.<init>(r5)
            goto L_0x00c8
        L_0x00c6:
            vc.d$a r0 = p466vc.C13574d.C13575a.f29662a
        L_0x00c8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10538j.mo34122a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$u5):vc.d");
    }
}
