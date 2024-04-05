package com.etsy.android.p327ui.favorites;

import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12741o;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.favorites.v */
public final class C9897v implements C12729e {

    /* renamed from: a */
    public final C12741o f21829a;

    /* renamed from: b */
    public final C13265p f21830b;

    /* renamed from: c */
    public final C9833d f21831c;

    /* renamed from: d */
    public final C9792b f21832d;

    public C9897v(C12741o oVar, C13265p pVar, C9833d dVar, C9792b bVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(dVar, "collectionKeyGenerator");
        C19383o.m32797g(bVar, "collectionHeaderEligibility");
        this.f21829a = oVar;
        this.f21830b = pVar;
        this.f21831c = dVar;
        this.f21832d = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p350fe.C12731g mo30554a(p350fe.C12730f r13) {
        /*
            r12 = this;
            android.net.Uri r0 = r13.f28049b
            java.lang.String r2 = r13.f28050c
            android.os.Bundle r7 = r13.f28051d
            fe.o r13 = r12.f21829a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SEARCH
            java.lang.String r1 = r1.getEntityName()
            boolean r13 = r13.mo45509b(r0, r1)
            if (r13 == 0) goto L_0x0027
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
            goto L_0x00e4
        L_0x0027:
            fe.o r13 = r12.f21829a
            java.lang.String r1 = "tab"
            r13.getClass()
            java.lang.String r13 = r0.getQueryParameter(r1)
            boolean r13 = p628nj.C18263b.m30839d0(r13)
            r3 = 0
            r4 = 1
            if (r13 == 0) goto L_0x00b1
            fe.o r13 = r12.f21829a
            r13.getClass()
            java.lang.String r13 = r0.getQueryParameter(r1)
            if (r13 == 0) goto L_0x0074
            int r1 = r13.hashCode()
            r5 = 100526016(0x5fde7c0, float:2.3877137E-35)
            if (r1 == r5) goto L_0x006f
            r5 = 109413437(0x685843d, float:5.0223346E-35)
            if (r1 == r5) goto L_0x0064
            r4 = 888645718(0x34f7a856, float:4.6129816E-7)
            if (r1 == r4) goto L_0x0059
            goto L_0x0074
        L_0x0059:
            java.lang.String r1 = "searches"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x0062
            goto L_0x0074
        L_0x0062:
            r3 = 2
            goto L_0x0074
        L_0x0064:
            java.lang.String r1 = "shops"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            r5 = r4
            goto L_0x0075
        L_0x006f:
            java.lang.String r1 = "items"
            r13.equals(r1)
        L_0x0074:
            r5 = r3
        L_0x0075:
            if (r5 != 0) goto L_0x009f
            com.etsy.android.ui.favorites.d r1 = r12.f21831c
            q9.p r3 = r12.f21830b
            r4 = 0
            fe.o r13 = r12.f21829a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r5 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PEOPLE
            java.lang.String r5 = r5.getEntityName()
            java.lang.String r6 = r13.mo45510e(r0, r5)
            r13 = 0
            r8 = 1
            com.etsy.android.ui.favorites.b r0 = r12.f21832d
            boolean r9 = r0.mo32787a()
            r10 = 0
            r11 = 292(0x124, float:4.09E-43)
            r5 = r7
            r7 = r13
            com.etsy.android.ui.navigation.keys.FragmentNavigationKey r13 = com.etsy.android.p327ui.favorites.C9833d.m18091a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            fe.g$b r0 = new fe.g$b
            r0.<init>(r13)
            goto L_0x00e4
        L_0x009f:
            com.etsy.android.ui.navigation.keys.fragmentkeys.FavoritesTabKey r13 = new com.etsy.android.ui.navigation.keys.fragmentkeys.FavoritesTabKey
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 22
            r9 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            fe.g$b r0 = new fe.g$b
            r0.<init>(r13)
            goto L_0x00e4
        L_0x00b1:
            fe.o r13 = r12.f21829a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PEOPLE
            java.lang.String r1 = r1.getEntityName()
            java.lang.String r13 = r13.mo45510e(r0, r1)
            if (r13 == 0) goto L_0x00c5
            int r1 = r13.length()
            if (r1 != 0) goto L_0x00c6
        L_0x00c5:
            r3 = r4
        L_0x00c6:
            if (r3 == 0) goto L_0x00d4
            fe.g$a r13 = new fe.g$a
            java.lang.String r1 = "Invalid user id "
            java.lang.String r0 = android.support.p013v4.media.C0073e.m206f(r1, r0)
            r13.<init>(r0)
            goto L_0x00e3
        L_0x00d4:
            com.etsy.android.ui.navigation.keys.fragmentkeys.UserProfileKey r0 = new com.etsy.android.ui.navigation.keys.fragmentkeys.UserProfileKey
            com.etsy.android.lib.models.datatypes.EtsyId r1 = new com.etsy.android.lib.models.datatypes.EtsyId
            r1.<init>((java.lang.String) r13)
            r0.<init>(r2, r1, r7)
            fe.g$b r13 = new fe.g$b
            r13.<init>(r0)
        L_0x00e3:
            r0 = r13
        L_0x00e4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.C9897v.mo30554a(fe.f):fe.g");
    }
}
