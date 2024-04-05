package com.etsy.android.p327ui.favorites;

import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12741o;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.favorites.n */
public final class C9862n implements C12729e {

    /* renamed from: a */
    public final C12741o f21765a;

    /* renamed from: b */
    public final C13265p f21766b;

    /* renamed from: c */
    public final C9859l f21767c;

    /* renamed from: d */
    public final C9833d f21768d;

    /* renamed from: e */
    public final C9792b f21769e;

    public C9862n(C12741o oVar, C13265p pVar, C9859l lVar, C9833d dVar, C9792b bVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(lVar, "favoriteTabsSelectedState");
        C19383o.m32797g(dVar, "collectionKeyGenerator");
        C19383o.m32797g(bVar, "collectionHeaderEligibility");
        this.f21765a = oVar;
        this.f21766b = pVar;
        this.f21767c = lVar;
        this.f21768d = dVar;
        this.f21769e = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d9, code lost:
        if (r13.equals(com.etsy.android.lib.models.ResponseConstants.ITEMS) != false) goto L_0x00dd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p350fe.C12731g mo30554a(p350fe.C12730f r13) {
        /*
            r12 = this;
            android.net.Uri r0 = r13.f28049b
            java.lang.String r2 = r13.f28050c
            android.os.Bundle r7 = r13.f28051d
            fe.o r1 = r12.f21765a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SEARCH
            java.lang.String r3 = r3.getEntityName()
            boolean r1 = r1.mo45509b(r0, r3)
            if (r1 == 0) goto L_0x0027
            com.etsy.android.ui.navigation.keys.fragmentkeys.SearchContainerKey r13 = new com.etsy.android.ui.navigation.keys.fragmentkeys.SearchContainerKey
            r3 = 0
            r4 = 0
            r6 = 6
            r0 = 0
            r1 = r13
            r5 = r7
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            fe.g$b r0 = new fe.g$b
            r0.<init>(r13)
            goto L_0x0129
        L_0x0027:
            fe.o r1 = r12.f21765a
            android.net.Uri r13 = r13.f28049b
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PEOPLE
            java.lang.String r4 = r3.getEntityName()
            boolean r13 = r1.mo45509b(r13, r4)
            r1 = 0
            if (r13 == 0) goto L_0x008f
            fe.o r13 = r12.f21765a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITES
            java.lang.String r1 = r1.getEntityName()
            java.lang.String r13 = r13.mo45510e(r0, r1)
            boolean r1 = p628nj.C18263b.m30839d0(r13)
            if (r1 == 0) goto L_0x0072
            com.etsy.android.ui.favorites.d r1 = r12.f21768d
            q9.p r4 = r12.f21766b
            r5 = 0
            fe.o r6 = r12.f21765a
            java.lang.String r3 = r3.getEntityName()
            java.lang.String r6 = r6.mo45510e(r0, r3)
            r8 = 1
            com.etsy.android.ui.favorites.b r0 = r12.f21769e
            boolean r9 = r0.mo32787a()
            r10 = 0
            r11 = 260(0x104, float:3.64E-43)
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r13
            com.etsy.android.ui.navigation.keys.FragmentNavigationKey r13 = com.etsy.android.p327ui.favorites.C9833d.m18091a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            fe.g$b r0 = new fe.g$b
            r0.<init>(r13)
            goto L_0x0129
        L_0x0072:
            com.etsy.android.ui.favorites.l r13 = r12.f21767c
            io.reactivex.subjects.a<com.etsy.android.ui.favorites.s> r13 = r13.f21763a
            com.etsy.android.ui.favorites.s$a r0 = com.etsy.android.p327ui.favorites.C9876s.C9877a.f21802a
            r13.onNext(r0)
            com.etsy.android.ui.navigation.keys.fragmentkeys.FavoritesTabKey r13 = new com.etsy.android.ui.navigation.keys.fragmentkeys.FavoritesTabKey
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 22
            r9 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            fe.g$b r0 = new fe.g$b
            r0.<init>(r13)
            goto L_0x0129
        L_0x008f:
            fe.o r13 = r12.f21765a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITES
            java.lang.String r3 = r3.getEntityName()
            java.lang.String r13 = r13.mo45510e(r0, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            r4 = 1
            if (r13 == 0) goto L_0x00dd
            int r5 = r13.hashCode()
            r6 = 100526016(0x5fde7c0, float:2.3877137E-35)
            if (r5 == r6) goto L_0x00d3
            r1 = 109413437(0x685843d, float:5.0223346E-35)
            if (r5 == r1) goto L_0x00c5
            r1 = 888645718(0x34f7a856, float:4.6129816E-7)
            if (r5 == r1) goto L_0x00b7
            goto L_0x00dc
        L_0x00b7:
            java.lang.String r1 = "searches"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00c0
            goto L_0x00dc
        L_0x00c0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L_0x00dd
        L_0x00c5:
            java.lang.String r1 = "shops"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00ce
            goto L_0x00dc
        L_0x00ce:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L_0x00dd
        L_0x00d3:
            java.lang.String r5 = "items"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r1 = 0
        L_0x00dd:
            if (r1 != 0) goto L_0x00ec
            fe.g$a r13 = new fe.g$a
            java.lang.String r1 = "Invalid tab provided "
            java.lang.String r0 = android.support.p013v4.media.C0073e.m206f(r1, r0)
            r13.<init>(r0)
            r0 = r13
            goto L_0x0129
        L_0x00ec:
            int r13 = r1.intValue()
            if (r13 == 0) goto L_0x010b
            if (r13 == r4) goto L_0x0101
            if (r13 == r3) goto L_0x00f7
            goto L_0x0114
        L_0x00f7:
            com.etsy.android.ui.favorites.l r13 = r12.f21767c
            io.reactivex.subjects.a<com.etsy.android.ui.favorites.s> r13 = r13.f21763a
            com.etsy.android.ui.favorites.s$b r0 = com.etsy.android.p327ui.favorites.C9876s.C9878b.f21803a
            r13.onNext(r0)
            goto L_0x0114
        L_0x0101:
            com.etsy.android.ui.favorites.l r13 = r12.f21767c
            io.reactivex.subjects.a<com.etsy.android.ui.favorites.s> r13 = r13.f21763a
            com.etsy.android.ui.favorites.s$c r0 = com.etsy.android.p327ui.favorites.C9876s.C9879c.f21804a
            r13.onNext(r0)
            goto L_0x0114
        L_0x010b:
            com.etsy.android.ui.favorites.l r13 = r12.f21767c
            io.reactivex.subjects.a<com.etsy.android.ui.favorites.s> r13 = r13.f21763a
            com.etsy.android.ui.favorites.s$a r0 = com.etsy.android.p327ui.favorites.C9876s.C9877a.f21802a
            r13.onNext(r0)
        L_0x0114:
            com.etsy.android.ui.navigation.keys.fragmentkeys.FavoritesTabKey r13 = new com.etsy.android.ui.navigation.keys.fragmentkeys.FavoritesTabKey
            r3 = 0
            r4 = 0
            int r5 = r1.intValue()
            r6 = 0
            r8 = 22
            r9 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            fe.g$b r0 = new fe.g$b
            r0.<init>(r13)
        L_0x0129:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.C9862n.mo30554a(fe.f):fe.g");
    }
}
