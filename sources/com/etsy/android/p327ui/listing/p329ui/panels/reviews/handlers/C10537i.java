package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import com.etsy.android.p327ui.listing.C10156h;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.i */
public final class C10537i {

    /* renamed from: a */
    public final C13573c f23108a;

    /* renamed from: b */
    public final C10156h f23109b;

    public C10537i(C10156h hVar, C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(hVar, "listingViewEligibility");
        this.f23108a = cVar;
        this.f23109b = hVar;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.ItemReviewsKey] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r4 = r4.getOwner();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d mo34121a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r23, p466vc.C13597g.C13737t5 r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            vc.c r3 = r0.f23108a
            vc.g$f r4 = new vc.g$f
            java.lang.String r5 = "listing_see_all_reviews_tapped"
            r4.<init>(r5)
            r3.mo38043a(r4)
            long r7 = r23.mo33477f()
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r3 = r1.f22239g
            java.lang.String r9 = r3.getTitle()
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r3 = r1.f22239g
            com.etsy.android.lib.models.apiv3.listing.ListingCard r3 = r3.getListingCard()
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = r3.getUrl()
            if (r3 != 0) goto L_0x0031
        L_0x002f:
            java.lang.String r3 = ""
        L_0x0031:
            r10 = r3
            java.lang.Long r3 = r23.mo33484l()
            com.etsy.android.lib.models.apiv3.listing.Shop r4 = r23.mo33483k()
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
            com.etsy.android.lib.models.apiv3.listing.Shop r4 = r23.mo33483k()
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r23.mo33483k()
            if (r6 == 0) goto L_0x005a
            java.lang.String r6 = r6.getName()
            r14 = r6
            goto L_0x005b
        L_0x005a:
            r14 = r5
        L_0x005b:
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r23.mo33483k()
            if (r6 == 0) goto L_0x006d
            com.etsy.android.lib.models.apiv3.listing.User r6 = r6.getOwner()
            if (r6 == 0) goto L_0x006d
            java.lang.String r6 = r6.getLoginName()
            r15 = r6
            goto L_0x006e
        L_0x006d:
            r15 = r5
        L_0x006e:
            com.etsy.android.lib.models.apiv3.listing.Shop r6 = r23.mo33483k()
            if (r6 == 0) goto L_0x0081
            com.etsy.android.lib.models.apiv3.listing.User r6 = r6.getOwner()
            if (r6 == 0) goto L_0x0081
            java.lang.String r6 = r6.getDisplayName()
            r16 = r6
            goto L_0x0083
        L_0x0081:
            r16 = r5
        L_0x0083:
            if (r3 == 0) goto L_0x00fd
            if (r4 == 0) goto L_0x00fd
            com.etsy.android.lib.models.apiv3.listing.Reviews$ReviewType r4 = r2.f30259a
            com.etsy.android.lib.models.apiv3.listing.Reviews$ReviewType r6 = com.etsy.android.lib.models.apiv3.listing.Reviews.ReviewType.SHOP
            if (r4 != r6) goto L_0x00ca
            com.etsy.android.ui.listing.h r4 = r0.f23109b
            com.etsy.android.lib.config.e r4 = r4.f22335a
            com.etsy.android.lib.config.EtsyConfigKey r6 = com.etsy.android.lib.config.C8592b.C8601i.f18898l
            boolean r4 = r4.mo21132b(r6)
            if (r4 == 0) goto L_0x00a8
            vc.c r1 = r0.f23108a
            vc.g$e2 r3 = new vc.g$e2
            com.etsy.android.lib.models.apiv3.listing.Reviews$ReviewType r4 = r2.f30259a
            com.etsy.android.ui.listing.ui.panels.reviews.a r2 = r2.f30260b
            r3.<init>(r4, r2)
            r1.mo38043a(r3)
            goto L_0x00fd
        L_0x00a8:
            com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey r5 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey
            java.lang.String r7 = r23.mo33467b()
            com.etsy.android.lib.models.datatypes.EtsyId r8 = new com.etsy.android.lib.models.datatypes.EtsyId
            long r1 = r3.longValue()
            r8.<init>((long) r1)
            com.etsy.android.ui.shop.ShopHomeConfig r9 = com.etsy.android.p327ui.shop.ShopHomeConfig.REVIEWS
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1016(0x3f8, float:1.424E-42)
            r18 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00fd
        L_0x00ca:
            com.etsy.android.ui.listing.ui.panels.reviews.a r4 = r2.f30260b
            com.etsy.android.lib.models.apiv3.listing.Reviews r4 = r4.f23084b
            int r17 = r4.getTotalListingReviewsCount()
            com.etsy.android.ui.listing.ui.panels.reviews.a r4 = r2.f30260b
            com.etsy.android.lib.models.apiv3.listing.Reviews r4 = r4.f23084b
            java.util.List r18 = r4.getListingReviewImages()
            com.etsy.android.ui.listing.ui.panels.reviews.a r2 = r2.f30260b
            com.etsy.android.lib.models.apiv3.listing.Reviews r2 = r2.f23084b
            java.util.List r2 = r2.getListingReviewVideos()
            boolean r20 = kotlinx.coroutines.C19543e0.m33306Y(r2)
            com.etsy.android.feedback.ItemReviewsFragment$ItemReviewsUiData r2 = new com.etsy.android.feedback.ItemReviewsFragment$ItemReviewsUiData
            long r11 = r3.longValue()
            r19 = 0
            r21 = 0
            r6 = r2
            r6.<init>(r7, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.etsy.android.ui.navigation.keys.fragmentkeys.ItemReviewsKey r5 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ItemReviewsKey
            java.lang.String r1 = r23.mo33467b()
            r5.<init>(r1, r2)
        L_0x00fd:
            if (r5 == 0) goto L_0x0105
            vc.d$b$i r1 = new vc.d$b$i
            r1.<init>(r5)
            goto L_0x0107
        L_0x0105:
            vc.d$a r1 = p466vc.C13574d.C13575a.f29662a
        L_0x0107:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10537i.mo34121a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$t5):vc.d");
    }
}
