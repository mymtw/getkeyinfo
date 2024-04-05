package com.etsy.android.lib.network.oauth2;

import p287xp.C8339g;

/* renamed from: com.etsy.android.lib.network.oauth2.h */
public final /* synthetic */ class C8758h implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19255b;

    /* renamed from: c */
    public final /* synthetic */ Object f19256c;

    public /* synthetic */ C8758h(Object obj, int i) {
        this.f19255b = i;
        this.f19256c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f19255b
            java.lang.String r1 = "it"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "response"
            java.lang.String r5 = "this$0"
            switch(r0) {
                case 0: goto L_0x0118;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00a1;
                case 3: goto L_0x007b;
                case 4: goto L_0x003d;
                case 5: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x013e
        L_0x000f:
            java.lang.Object r0 = r6.f19256c
            zd.e r0 = (p499zd.C13957e) r0
            com.etsy.android.lib.network.oauth2.AccessTokens r7 = (com.etsy.android.lib.network.oauth2.AccessTokens) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)
            com.etsy.android.lib.logger.h r1 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Token get! "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.mo21310e(r2)
            r0.mo46778c(r7)
            com.etsy.android.lib.session.c r7 = r0.f30683h
            tp.s r7 = r7.mo30408a()
            return r7
        L_0x003d:
            java.lang.Object r0 = r6.f19256c
            com.etsy.android.ui.home.tabs.j r0 = (com.etsy.android.p327ui.home.tabs.C10060j) r0
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            boolean r1 = r7.mo74384a()
            if (r1 == 0) goto L_0x0069
            com.etsy.android.ui.home.tabs.k$b r0 = new com.etsy.android.ui.home.tabs.k$b
            T r7 = r7.f44615b
            okhttp3.a0 r7 = (okhttp3.C19928a0) r7
            if (r7 == 0) goto L_0x0063
            byte[] r7 = r7.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.homescreen.HomeTab> r1 = com.etsy.android.lib.models.homescreen.HomeTab.class
            java.util.List r7 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r7, r1)
            if (r7 != 0) goto L_0x0065
        L_0x0063:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.INSTANCE
        L_0x0065:
            r0.<init>(r7)
            goto L_0x007a
        L_0x0069:
            com.etsy.android.ui.home.tabs.k$a r1 = new com.etsy.android.ui.home.tabs.k$a
            retrofit2.HttpException r2 = new retrofit2.HttpException
            r2.<init>(r7)
            com.squareup.moshi.y r0 = r0.f22177b
            java.lang.String r7 = androidx.compose.foundation.layout.C0761x.m1694T0(r7, r0)
            r1.<init>(r7, r2)
            r0 = r1
        L_0x007a:
            return r0
        L_0x007b:
            java.lang.Object r0 = r6.f19256c
            com.etsy.android.ui.home.recentlyviewedpage.d r0 = (com.etsy.android.p327ui.home.recentlyviewedpage.C10043d) r0
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            boolean r1 = r7.mo74384a()
            if (r1 == 0) goto L_0x0090
            com.etsy.android.ui.home.recentlyviewedpage.g$b r7 = com.etsy.android.p327ui.home.recentlyviewedpage.C10046g.C10048b.f22111a
            goto L_0x00a0
        L_0x0090:
            com.etsy.android.ui.home.recentlyviewedpage.g$a r1 = new com.etsy.android.ui.home.recentlyviewedpage.g$a
            com.squareup.moshi.y r0 = r0.f22099c
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1692S0(r7, r0)
            okhttp3.z r7 = r7.f44614a
            int r7 = r7.f44365f
            r1.<init>(r0, r7, r3)
            r7 = r1
        L_0x00a0:
            return r7
        L_0x00a1:
            java.lang.Object r0 = r6.f19256c
            com.etsy.android.shophome.m r0 = (com.etsy.android.shophome.C9005m) r0
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)
            boolean r1 = r7 instanceof retrofit2.HttpException
            if (r1 == 0) goto L_0x00b4
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            goto L_0x00b5
        L_0x00b4:
            r7 = r3
        L_0x00b5:
            com.etsy.android.shophome.n$a r1 = new com.etsy.android.shophome.n$a
            if (r7 == 0) goto L_0x00bf
            com.squareup.moshi.y r0 = r0.f19874b
            java.lang.String r3 = androidx.compose.foundation.layout.C0761x.m1690R0(r7, r0)
        L_0x00bf:
            if (r7 == 0) goto L_0x00c6
            int r0 = r7.code()
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            r1.<init>(r3, r0, r7)
            return r1
        L_0x00cb:
            java.lang.Object r0 = r6.f19256c
            ma.d r0 = (p395ma.C13034d) r0
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            boolean r1 = r7.mo74384a()
            if (r1 == 0) goto L_0x0107
            T r7 = r7.f44615b
            okhttp3.a0 r7 = (okhttp3.C19928a0) r7
            if (r7 == 0) goto L_0x00ef
            byte[] r7 = r7.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.Payment> r0 = com.etsy.android.lib.models.Payment.class
            java.util.List r7 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r7, r0)
            if (r7 != 0) goto L_0x00f1
        L_0x00ef:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.INSTANCE
        L_0x00f1:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0104
            ma.b$c r0 = new ma.b$c
            java.lang.Object r7 = kotlin.collections.C19327t.m32638T0(r7)
            com.etsy.android.lib.models.Payment r7 = (com.etsy.android.lib.models.Payment) r7
            r0.<init>(r7)
            goto L_0x0117
        L_0x0104:
            ma.b$a r0 = p395ma.C13029b.C13030a.f28684a
            goto L_0x0117
        L_0x0107:
            ma.b$b r1 = new ma.b$b
            com.squareup.moshi.y r0 = r0.f28692b
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1692S0(r7, r0)
            okhttp3.z r7 = r7.f44614a
            int r7 = r7.f44365f
            r1.<init>(r0, r7, r3)
            r0 = r1
        L_0x0117:
            return r0
        L_0x0118:
            java.lang.Object r0 = r6.f19256c
            com.etsy.android.lib.network.oauth2.i r0 = (com.etsy.android.lib.network.oauth2.C8759i) r0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            java.lang.String r1 = "authCode"
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)
            com.etsy.android.lib.network.oauth2.d r1 = r0.f19258b
            com.etsy.android.lib.network.oauth2.u r0 = r0.f19259c
            java.lang.String r0 = r0.f19346a
            tp.s r7 = r1.mo30073a(r7, r0)
            n9.f r0 = new n9.f
            r0.<init>(r2)
            r7.getClass()
            io.reactivex.internal.operators.single.j r1 = new io.reactivex.internal.operators.single.j
            r1.<init>(r7, r0)
            return r1
        L_0x013e:
            java.lang.Object r0 = r6.f19256c
            com.etsy.android.ui.shop.BaseShopHomePageRepository r0 = (com.etsy.android.p327ui.shop.BaseShopHomePageRepository) r0
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            boolean r1 = r7.mo74384a()
            if (r1 == 0) goto L_0x017d
            T r1 = r7.f44615b
            okhttp3.a0 r1 = (okhttp3.C19928a0) r1
            if (r1 == 0) goto L_0x0160
            byte[] r1 = r1.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.ShopHomePage> r2 = com.etsy.android.lib.models.apiv3.ShopHomePage.class
            java.lang.Object r3 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r1, r2)
        L_0x0160:
            com.etsy.android.lib.models.apiv3.ShopHomePage r3 = (com.etsy.android.lib.models.apiv3.ShopHomePage) r3
            if (r3 == 0) goto L_0x016a
            com.etsy.android.ui.shop.k0$b r7 = new com.etsy.android.ui.shop.k0$b
            r7.<init>(r3)
            goto L_0x018e
        L_0x016a:
            com.etsy.android.ui.shop.k0$a r1 = new com.etsy.android.ui.shop.k0$a
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Shop home page model couldn't be parsed."
            r2.<init>(r3)
            com.squareup.moshi.y r0 = r0.f24595b
            java.lang.String r7 = androidx.compose.foundation.layout.C0761x.m1694T0(r7, r0)
            r1.<init>(r7, r2)
            goto L_0x018d
        L_0x017d:
            com.etsy.android.ui.shop.k0$a r1 = new com.etsy.android.ui.shop.k0$a
            retrofit2.HttpException r2 = new retrofit2.HttpException
            r2.<init>(r7)
            com.squareup.moshi.y r0 = r0.f24595b
            java.lang.String r7 = androidx.compose.foundation.layout.C0761x.m1694T0(r7, r0)
            r1.<init>(r7, r2)
        L_0x018d:
            r7 = r1
        L_0x018e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.network.oauth2.C8758h.apply(java.lang.Object):java.lang.Object");
    }
}
