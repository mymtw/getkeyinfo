package p395ma;

import p287xp.C8339g;

/* renamed from: ma.c */
public final /* synthetic */ class C13033c implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f28689b;

    /* renamed from: c */
    public final /* synthetic */ Object f28690c;

    public /* synthetic */ C13033c(Object obj, int i) {
        this.f28689b = i;
        this.f28690c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f28689b
            java.lang.String r1 = "it"
            r2 = 0
            r3 = 0
            java.lang.String r4 = "this$0"
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x002c;
                case 2: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x007e
        L_0x000d:
            java.lang.Object r0 = r5.f28690c
            com.etsy.android.ui.navigation.bottom.BottomNavStateRepo r0 = (com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo) r0
            java.lang.Integer r6 = (java.lang.Integer) r6
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)
            com.etsy.android.ui.navigation.bottom.b r0 = new com.etsy.android.ui.navigation.bottom.b
            int r6 = r6.intValue()
            com.etsy.android.ui.you.a r6 = com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo.m18605b(r3, r6)
            r1 = 2131428964(0x7f0b0664, float:1.8479587E38)
            java.lang.String r2 = "menu_bottom_nav_favorites"
            r0.<init>(r1, r6, r2)
            return r0
        L_0x002c:
            java.lang.Object r0 = r5.f28690c
            com.etsy.android.ui.home.recentlyviewedpage.d r0 = (com.etsy.android.p327ui.home.recentlyviewedpage.C10043d) r0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            java.lang.String r1 = "throwable"
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)
            boolean r1 = r6 instanceof retrofit2.HttpException
            if (r1 == 0) goto L_0x0041
            retrofit2.HttpException r6 = (retrofit2.HttpException) r6
            goto L_0x0042
        L_0x0041:
            r6 = r2
        L_0x0042:
            com.etsy.android.ui.home.recentlyviewedpage.g$a r1 = new com.etsy.android.ui.home.recentlyviewedpage.g$a
            if (r6 == 0) goto L_0x004c
            com.squareup.moshi.y r0 = r0.f22099c
            java.lang.String r2 = androidx.compose.foundation.layout.C0761x.m1690R0(r6, r0)
        L_0x004c:
            if (r6 == 0) goto L_0x0052
            int r3 = r6.code()
        L_0x0052:
            r1.<init>(r2, r3, r6)
            return r1
        L_0x0056:
            java.lang.Object r0 = r5.f28690c
            ma.d r0 = (p395ma.C13034d) r0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)
            boolean r1 = r6 instanceof retrofit2.HttpException
            if (r1 == 0) goto L_0x0069
            retrofit2.HttpException r6 = (retrofit2.HttpException) r6
            goto L_0x006a
        L_0x0069:
            r6 = r2
        L_0x006a:
            ma.b$b r1 = new ma.b$b
            if (r6 == 0) goto L_0x0074
            com.squareup.moshi.y r0 = r0.f28692b
            java.lang.String r2 = androidx.compose.foundation.layout.C0761x.m1690R0(r6, r0)
        L_0x0074:
            if (r6 == 0) goto L_0x007a
            int r3 = r6.code()
        L_0x007a:
            r1.<init>(r2, r3, r6)
            return r1
        L_0x007e:
            java.lang.Object r0 = r5.f28690c
            com.etsy.android.ui.shop.BaseShopHomePageRepository r0 = (com.etsy.android.p327ui.shop.BaseShopHomePageRepository) r0
            retrofit2.v r6 = (retrofit2.C20145v) r6
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            java.lang.String r1 = "response"
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)
            boolean r1 = r6.mo74384a()
            if (r1 == 0) goto L_0x00c9
            T r1 = r6.f44615b
            okhttp3.a0 r1 = (okhttp3.C19928a0) r1
            if (r1 == 0) goto L_0x00a2
            byte[] r1 = r1.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.ShopListingsSearchResult> r2 = com.etsy.android.lib.models.apiv3.ShopListingsSearchResult.class
            java.lang.Object r2 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r1, r2)
        L_0x00a2:
            com.etsy.android.lib.models.apiv3.ShopListingsSearchResult r2 = (com.etsy.android.lib.models.apiv3.ShopListingsSearchResult) r2
            if (r2 == 0) goto L_0x00b6
            com.etsy.android.ui.shop.o0$b r0 = new com.etsy.android.ui.shop.o0$b
            java.lang.Integer r6 = p001a0.C0005b.m46k0(r6)
            if (r6 == 0) goto L_0x00b2
            int r3 = r6.intValue()
        L_0x00b2:
            r0.<init>(r2, r3)
            goto L_0x00da
        L_0x00b6:
            com.etsy.android.ui.shop.o0$a r1 = new com.etsy.android.ui.shop.o0$a
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Shop listings search result couldn't be parsed."
            r2.<init>(r3)
            com.squareup.moshi.y r0 = r0.f24595b
            java.lang.String r6 = androidx.compose.foundation.layout.C0761x.m1694T0(r6, r0)
            r1.<init>(r6, r2)
            goto L_0x00d9
        L_0x00c9:
            com.etsy.android.ui.shop.o0$a r1 = new com.etsy.android.ui.shop.o0$a
            retrofit2.HttpException r2 = new retrofit2.HttpException
            r2.<init>(r6)
            com.squareup.moshi.y r0 = r0.f24595b
            java.lang.String r6 = androidx.compose.foundation.layout.C0761x.m1694T0(r6, r0)
            r1.<init>(r6, r2)
        L_0x00d9:
            r0 = r1
        L_0x00da:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p395ma.C13033c.apply(java.lang.Object):java.lang.Object");
    }
}
