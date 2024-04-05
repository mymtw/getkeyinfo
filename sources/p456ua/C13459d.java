package p456ua;

import p287xp.C8339g;

/* renamed from: ua.d */
public final /* synthetic */ class C13459d implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f29480b;

    /* renamed from: c */
    public final /* synthetic */ Object f29481c;

    public /* synthetic */ C13459d(Object obj, int i) {
        this.f29480b = i;
        this.f29481c = obj;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v8, types: [retrofit2.HttpException] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f29480b
            java.lang.String r1 = "response"
            r2 = 0
            java.lang.String r3 = "this$0"
            switch(r0) {
                case 0: goto L_0x0108;
                case 1: goto L_0x00bc;
                case 2: goto L_0x0095;
                case 3: goto L_0x008a;
                case 4: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0119
        L_0x000c:
            java.lang.Object r0 = r4.f29481c
            com.etsy.android.ui.home.landingpage.c r0 = (com.etsy.android.p327ui.home.landingpage.C10021c) r0
            retrofit2.v r5 = (retrofit2.C20145v) r5
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)
            boolean r1 = r5.mo74384a()
            if (r1 == 0) goto L_0x0079
            T r0 = r5.f44615b
            okhttp3.a0 r0 = (okhttp3.C19928a0) r0
            if (r0 == 0) goto L_0x002f
            byte[] r0 = r0.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.cardviewelement.Page> r1 = com.etsy.android.lib.models.cardviewelement.Page.class
            java.lang.Object r0 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r0, r1)
            goto L_0x0030
        L_0x002f:
            r0 = r2
        L_0x0030:
            com.etsy.android.lib.models.cardviewelement.Page r0 = (com.etsy.android.lib.models.cardviewelement.Page) r0
            r1 = 1
            if (r0 == 0) goto L_0x0044
            java.util.List r3 = r0.getListSections()
            if (r3 == 0) goto L_0x0044
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            if (r3 != r1) goto L_0x0044
            r3 = r1
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 == 0) goto L_0x0076
            java.util.List r0 = r0.getListSections()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = kotlin.collections.C19327t.m32638T0(r0)
            com.etsy.android.lib.models.cardviewelement.ListSection r0 = (com.etsy.android.lib.models.cardviewelement.ListSection) r0
            if (r0 == 0) goto L_0x0059
            java.util.List r2 = r0.getItems()
        L_0x0059:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.lib.models.apiv3.ListingCard>"
            kotlin.jvm.internal.C19383o.m32795e(r2, r0)
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0073
            com.etsy.android.ui.home.landingpage.a$c r0 = new com.etsy.android.ui.home.landingpage.a$c
            java.lang.Integer r1 = p001a0.C0005b.m46k0(r5)
            java.lang.String r5 = p001a0.C0005b.m48l0(r5)
            r0.<init>(r5, r2, r1)
            goto L_0x0089
        L_0x0073:
            com.etsy.android.ui.home.landingpage.a$a r0 = com.etsy.android.p327ui.home.landingpage.C10013a.C10014a.f22055a
            goto L_0x0089
        L_0x0076:
            com.etsy.android.ui.home.landingpage.a$a r0 = com.etsy.android.p327ui.home.landingpage.C10013a.C10014a.f22055a
            goto L_0x0089
        L_0x0079:
            com.etsy.android.ui.home.landingpage.a$b r1 = new com.etsy.android.ui.home.landingpage.a$b
            com.squareup.moshi.y r0 = r0.f22070b
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1692S0(r5, r0)
            okhttp3.z r5 = r5.f44614a
            int r5 = r5.f44365f
            r1.<init>(r0, r5, r2)
            r0 = r1
        L_0x0089:
            return r0
        L_0x008a:
            java.lang.Object r0 = r4.f29481c
            com.etsy.android.ui.core.CollectionFragment r0 = (com.etsy.android.p327ui.core.CollectionFragment) r0
            java.util.List r5 = (java.util.List) r5
            com.etsy.android.lib.models.cardviewelement.Page r5 = r0.mapListingCardUiModelsToPage(r5)
            return r5
        L_0x0095:
            java.lang.Object r0 = r4.f29481c
            cc.c r0 = (p321cc.C8569c) r0
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            java.lang.String r1 = "throwable"
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)
            boolean r1 = r5 instanceof retrofit2.HttpException
            if (r1 == 0) goto L_0x00aa
            r2 = r5
            retrofit2.HttpException r2 = (retrofit2.HttpException) r2
        L_0x00aa:
            cc.c$b$a r5 = new cc.c$b$a
            if (r2 == 0) goto L_0x00b3
            com.squareup.moshi.y r0 = r0.f18659b
            androidx.compose.foundation.layout.C0761x.m1690R0(r2, r0)
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            r2.code()
        L_0x00b8:
            r5.<init>()
            return r5
        L_0x00bc:
            java.lang.Object r0 = r4.f29481c
            com.etsy.android.ui.cart.x r0 = (com.etsy.android.p327ui.cart.C9420x) r0
            retrofit2.v r5 = (retrofit2.C20145v) r5
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)
            boolean r1 = r5.mo74384a()
            if (r1 == 0) goto L_0x00f6
            T r5 = r5.f44615b
            okhttp3.a0 r5 = (okhttp3.C19928a0) r5
            if (r5 == 0) goto L_0x00de
            byte[] r5 = r5.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.cart.CartPage> r0 = com.etsy.android.lib.models.apiv3.cart.CartPage.class
            java.lang.Object r2 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r5, r0)
        L_0x00de:
            com.etsy.android.lib.models.apiv3.cart.CartPage r2 = (com.etsy.android.lib.models.apiv3.cart.CartPage) r2
            if (r2 == 0) goto L_0x00e8
            com.etsy.android.ui.cart.n$b r5 = new com.etsy.android.ui.cart.n$b
            r5.<init>(r2)
            goto L_0x0107
        L_0x00e8:
            com.etsy.android.ui.cart.n$a r5 = new com.etsy.android.ui.cart.n$a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "CartPage failed to parse."
            r0.<init>(r1)
            r1 = 2
            r5.<init>((java.lang.RuntimeException) r0, (int) r1)
            goto L_0x0107
        L_0x00f6:
            com.etsy.android.ui.cart.n$a r1 = new com.etsy.android.ui.cart.n$a
            retrofit2.HttpException r2 = new retrofit2.HttpException
            r2.<init>(r5)
            com.squareup.moshi.y r0 = r0.f20900d
            java.lang.String r5 = androidx.compose.foundation.layout.C0761x.m1694T0(r5, r0)
            r1.<init>((java.lang.String) r5, (java.lang.Throwable) r2)
            r5 = r1
        L_0x0107:
            return r5
        L_0x0108:
            java.lang.Object r0 = r4.f29481c
            tp.r r0 = (p248tp.C8066r) r0
            tp.r r5 = (p248tp.C8066r) r5
            java.lang.String r1 = "$scheduler"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.lang.String r1 = "it"
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)
            return r0
        L_0x0119:
            java.lang.Object r0 = r4.f29481c
            com.etsy.android.ui.shop.n r0 = (com.etsy.android.p327ui.shop.C11179n) r0
            retrofit2.v r5 = (retrofit2.C20145v) r5
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)
            boolean r1 = r5.mo74384a()
            if (r1 == 0) goto L_0x0146
            com.etsy.android.ui.shop.o$b r0 = new com.etsy.android.ui.shop.o$b
            T r5 = r5.f44615b
            okhttp3.a0 r5 = (okhttp3.C19928a0) r5
            if (r5 == 0) goto L_0x013d
            byte[] r5 = r5.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.ShopHomeMemberData> r1 = com.etsy.android.lib.models.apiv3.ShopHomeMemberData.class
            java.lang.Object r2 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r5, r1)
        L_0x013d:
            kotlin.jvm.internal.C19383o.m32794d(r2)
            com.etsy.android.lib.models.apiv3.ShopHomeMemberData r2 = (com.etsy.android.lib.models.apiv3.ShopHomeMemberData) r2
            r0.<init>(r2)
            goto L_0x0155
        L_0x0146:
            okhttp3.z r1 = r5.f44614a
            int r1 = r1.f44365f
            com.squareup.moshi.y r0 = r0.f24723b
            java.lang.String r5 = androidx.compose.foundation.layout.C0761x.m1692S0(r5, r0)
            com.etsy.android.ui.shop.o$a r0 = new com.etsy.android.ui.shop.o$a
            r0.<init>(r5, r1, r2)
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p456ua.C13459d.apply(java.lang.Object):java.lang.Object");
    }
}
