package com.etsy.android.p327ui.listing.p329ui.listingimages.handlers;

import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.listingimages.handlers.f */
public final class C10434f {

    /* renamed from: a */
    public final C13573c f22907a;

    public C10434f(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22907a = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.etsy.android.lib.models.apiv3.listing.ShopReview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.etsy.android.lib.models.apiv3.listing.ShopReview] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d mo33980a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r11, p466vc.C13597g.C13684m1 r12) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            vc.c r0 = r10.f22907a
            vc.g$f r1 = new vc.g$f
            java.lang.String r2 = "listing_photo_clicked"
            r1.<init>(r2)
            r0.mo38043a(r1)
            com.etsy.android.ui.listing.ui.f r0 = r11.f22238f
            rd.a r0 = r0.f22801d
            r1 = 0
            if (r0 == 0) goto L_0x001c
            java.util.List<com.etsy.android.lib.models.apiv3.listing.ListingImage> r0 = r0.f29277a
            r9 = r0
            goto L_0x001d
        L_0x001c:
            r9 = r1
        L_0x001d:
            boolean r0 = kotlinx.coroutines.C19543e0.m33306Y(r9)
            if (r0 == 0) goto L_0x00e2
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r0 = r11.f22239g
            com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r4 = r0.getSingleListingCheckout()
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r0 = r11.f22239g
            com.etsy.android.lib.models.apiv3.listing.Listing r0 = r0.getListing()
            java.lang.String r0 = r0.getState()
            java.lang.String r2 = "active"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
            if (r0 == 0) goto L_0x0096
            if (r4 == 0) goto L_0x0048
            java.lang.Boolean r0 = r4.isExpressCheckoutEligible()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 == 0) goto L_0x0096
            com.etsy.android.ui.core.listinggallery.e r0 = new com.etsy.android.ui.core.listinggallery.e
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r3 = r11.f22239g
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r5 = r11.f22241i
            java.lang.String r6 = r11.mo33478g()
            com.etsy.android.ui.listing.a r2 = r11.f22236d
            java.lang.String r7 = r2.f22247a
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r2 = r11.f22239g
            com.etsy.android.lib.models.apiv3.listing.Reviews r2 = r2.getReviews()
            if (r2 == 0) goto L_0x0065
            com.etsy.android.lib.models.apiv3.listing.ShopReview r1 = r2.getFeaturedListingReview()
        L_0x0065:
            r8 = r1
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            kotlin.c<com.etsy.android.uikit.nav.transactions.TransactionDataRepository> r1 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.f26402b
            com.etsy.android.uikit.nav.transactions.TransactionDataRepository r1 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.C11867a.m19552a()
            int r0 = r1.mo38343b(r0)
            com.etsy.android.ui.navigation.keys.fragmentkeys.ListingImageGalleryKey r9 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ListingImageGalleryKey
            java.lang.String r2 = r11.mo33467b()
            int r3 = r12.f30183a
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r1 = r11.f22239g
            java.lang.String r4 = r1.getVisuallySimilarApiPath()
            com.etsy.android.uikit.adapter.ListingVideoPosition r5 = r12.f30184b
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            com.etsy.android.ui.listing.ui.f r11 = r11.f22238f
            rd.a r11 = r11.f22801d
            boolean r8 = r11.mo46039c()
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00dc
        L_0x0096:
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r0 = r11.f22239g
            com.etsy.android.lib.models.apiv3.listing.Reviews r0 = r0.getReviews()
            if (r0 == 0) goto L_0x00a3
            com.etsy.android.lib.models.apiv3.listing.ShopReview r0 = r0.getFeaturedListingReview()
            goto L_0x00a4
        L_0x00a3:
            r0 = r1
        L_0x00a4:
            if (r0 == 0) goto L_0x00bd
            com.etsy.android.ui.core.listinggallery.e r1 = new com.etsy.android.ui.core.listinggallery.e
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r2 = r11.f22239g
            r3 = 30
            r1.<init>(r2, r0, r9, r3)
            kotlin.c<com.etsy.android.uikit.nav.transactions.TransactionDataRepository> r0 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.f26402b
            com.etsy.android.uikit.nav.transactions.TransactionDataRepository r0 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.C11867a.m19552a()
            int r0 = r0.mo38343b(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x00bd:
            r8 = r1
            com.etsy.android.ui.navigation.keys.fragmentkeys.ListingImageGalleryKey r0 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ListingImageGalleryKey
            java.lang.String r3 = r11.mo33467b()
            int r4 = r12.f30183a
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r1 = r11.f22239g
            java.lang.String r5 = r1.getVisuallySimilarApiPath()
            com.etsy.android.uikit.adapter.ListingVideoPosition r6 = r12.f30184b
            r7 = 0
            com.etsy.android.ui.listing.ui.f r11 = r11.f22238f
            rd.a r11 = r11.f22801d
            boolean r9 = r11.mo46039c()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r9 = r0
        L_0x00dc:
            vc.d$b$i r11 = new vc.d$b$i
            r11.<init>(r9)
            goto L_0x00e4
        L_0x00e2:
            vc.d$a r11 = p466vc.C13574d.C13575a.f29662a
        L_0x00e4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10434f.mo33980a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$m1):vc.d");
    }
}
