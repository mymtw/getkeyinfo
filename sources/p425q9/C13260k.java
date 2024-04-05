package p425q9;

import p287xp.C8339g;

/* renamed from: q9.k */
public final /* synthetic */ class C13260k implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f29127b;

    public /* synthetic */ C13260k(int i) {
        this.f29127b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r41) {
        /*
            r40 = this;
            r0 = r40
            int r1 = r0.f29127b
            r2 = 0
            r3 = 0
            java.lang.String r4 = "it"
            switch(r1) {
                case 0: goto L_0x0307;
                case 1: goto L_0x02fb;
                case 2: goto L_0x02ef;
                case 3: goto L_0x003a;
                case 4: goto L_0x0030;
                case 5: goto L_0x001c;
                case 6: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0310
        L_0x000d:
            r1 = r41
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r3 = "throwable"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            com.etsy.android.ui.favorites.add.a0$a r1 = new com.etsy.android.ui.favorites.add.a0$a
            r1.<init>(r2)
            return r1
        L_0x001c:
            r1 = r41
            java.util.List r1 = (java.util.List) r1
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            com.etsy.android.lib.models.apiv3.CheckableListingCollection r2 = com.etsy.android.lib.models.apiv3.CheckableListingCollection.newCreateListSyntheticItem()
            java.lang.String r4 = "newCreateListSyntheticItem()"
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)
            r1.add(r3, r2)
            return r1
        L_0x0030:
            r1 = r41
            com.etsy.android.search.AutoSuggestVariant r1 = (com.etsy.android.search.AutoSuggestVariant) r1
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            java.lang.String r1 = r1.f19774a
            return r1
        L_0x003a:
            r1 = r41
            com.etsy.android.lib.selfuser.SelfUser r1 = (com.etsy.android.lib.selfuser.SelfUser) r1
            java.lang.String r4 = "selfUser"
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            com.etsy.android.lib.selfuser.c$b r4 = new com.etsy.android.lib.selfuser.c$b
            long r5 = r1.f19477a
            com.etsy.android.lib.models.datatypes.EtsyId r8 = new com.etsy.android.lib.models.datatypes.EtsyId
            r8.<init>((long) r5)
            java.lang.String r9 = r1.f19478b
            java.lang.String r10 = r1.f19481e
            java.lang.Integer r5 = r1.f19479c
            if (r5 == 0) goto L_0x005a
            int r5 = r5.intValue()
            r11 = r5
            goto L_0x005b
        L_0x005a:
            r11 = r3
        L_0x005b:
            java.lang.Integer r5 = r1.f19480d
            if (r5 == 0) goto L_0x0065
            int r5 = r5.intValue()
            r12 = r5
            goto L_0x0066
        L_0x0065:
            r12 = r3
        L_0x0066:
            java.lang.Integer r5 = r1.f19482f
            if (r5 == 0) goto L_0x0070
            int r5 = r5.intValue()
            r13 = r5
            goto L_0x0071
        L_0x0070:
            r13 = r3
        L_0x0071:
            java.util.List<com.etsy.android.lib.selfuser.SelfUserShop> r5 = r1.f19484h
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x01d2
            java.util.ArrayList r7 = new java.util.ArrayList
            int r14 = kotlin.collections.C19322o.m32624F0(r5)
            r7.<init>(r14)
            java.util.Iterator r5 = r5.iterator()
        L_0x0084:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x01c4
            java.lang.Object r14 = r5.next()
            com.etsy.android.lib.selfuser.SelfUserShop r14 = (com.etsy.android.lib.selfuser.SelfUserShop) r14
            long r2 = r14.f19514a
            com.etsy.android.lib.models.datatypes.EtsyId r15 = new com.etsy.android.lib.models.datatypes.EtsyId
            r15.<init>((long) r2)
            long r2 = r1.f19477a
            com.etsy.android.lib.models.datatypes.EtsyId r0 = new com.etsy.android.lib.models.datatypes.EtsyId
            r0.<init>((long) r2)
            java.lang.Integer r2 = r14.f19517d
            if (r2 == 0) goto L_0x00a9
            int r2 = r2.intValue()
            r20 = r2
            goto L_0x00ab
        L_0x00a9:
            r20 = 0
        L_0x00ab:
            java.lang.Boolean r2 = r14.f19521h
            if (r2 == 0) goto L_0x00b6
            boolean r2 = r2.booleanValue()
            r21 = r2
            goto L_0x00b8
        L_0x00b6:
            r21 = 0
        L_0x00b8:
            java.lang.String r2 = r14.f19516c
            java.lang.String r3 = r14.f19515b
            if (r3 != 0) goto L_0x00c1
            r23 = r6
            goto L_0x00c3
        L_0x00c1:
            r23 = r3
        L_0x00c3:
            java.lang.String r3 = r14.f19519f
            r33 = r5
            java.lang.String r5 = r14.f19520g
            if (r5 != 0) goto L_0x00ce
            r25 = r6
            goto L_0x00d0
        L_0x00ce:
            r25 = r5
        L_0x00d0:
            java.lang.String r5 = r14.f19518e
            if (r5 == 0) goto L_0x00de
            r34 = r6
            com.etsy.android.lib.models.apiv3.ShopIcon r6 = new com.etsy.android.lib.models.apiv3.ShopIcon
            r6.<init>(r5)
            r26 = r6
            goto L_0x00e2
        L_0x00de:
            r34 = r6
            r26 = 0
        L_0x00e2:
            java.lang.Integer r5 = r14.f19524k
            if (r5 == 0) goto L_0x00ed
            int r5 = r5.intValue()
            r27 = r5
            goto L_0x00ef
        L_0x00ed:
            r27 = 0
        L_0x00ef:
            java.lang.Double r5 = r14.f19523j
            if (r5 == 0) goto L_0x00f8
            double r5 = r5.doubleValue()
            goto L_0x00fa
        L_0x00f8:
            r5 = 0
        L_0x00fa:
            r28 = r5
            java.util.List<com.etsy.android.lib.selfuser.SelfUserListingDetails> r5 = r14.f19526m
            java.lang.String r6 = "<this>"
            if (r5 == 0) goto L_0x014d
            r35 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r36 = r13
            int r13 = kotlin.collections.C19322o.m32624F0(r5)
            r4.<init>(r13)
            java.util.Iterator r5 = r5.iterator()
        L_0x0113:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x0146
            java.lang.Object r13 = r5.next()
            com.etsy.android.lib.selfuser.SelfUserListingDetails r13 = (com.etsy.android.lib.selfuser.SelfUserListingDetails) r13
            kotlin.jvm.internal.C19383o.m32797g(r13, r6)
            r17 = r5
            com.etsy.android.lib.models.Listing r5 = new com.etsy.android.lib.models.Listing
            r37 = r11
            r38 = r12
            long r11 = r13.f19492a
            r39 = r10
            com.etsy.android.lib.models.datatypes.EtsyId r10 = new com.etsy.android.lib.models.datatypes.EtsyId
            r10.<init>((long) r11)
            com.etsy.android.lib.selfuser.SelfUserListingImage r11 = r13.f19493b
            java.lang.String r11 = r11.f19494a
            r5.<init>(r10, r11)
            r4.add(r5)
            r5 = r17
            r11 = r37
            r12 = r38
            r10 = r39
            goto L_0x0113
        L_0x0146:
            r39 = r10
            r37 = r11
            r38 = r12
            goto L_0x0159
        L_0x014d:
            r35 = r4
            r39 = r10
            r37 = r11
            r38 = r12
            r36 = r13
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
        L_0x0159:
            r30 = r4
            java.util.List<com.etsy.android.lib.selfuser.SelfUserListingDetails> r4 = r14.f19525l
            if (r4 == 0) goto L_0x0196
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = kotlin.collections.C19322o.m32624F0(r4)
            r5.<init>(r10)
            java.util.Iterator r4 = r4.iterator()
        L_0x016c:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0193
            java.lang.Object r10 = r4.next()
            com.etsy.android.lib.selfuser.SelfUserListingDetails r10 = (com.etsy.android.lib.selfuser.SelfUserListingDetails) r10
            kotlin.jvm.internal.C19383o.m32797g(r10, r6)
            com.etsy.android.lib.models.Listing r11 = new com.etsy.android.lib.models.Listing
            long r12 = r10.f19492a
            r17 = r4
            com.etsy.android.lib.models.datatypes.EtsyId r4 = new com.etsy.android.lib.models.datatypes.EtsyId
            r4.<init>((long) r12)
            com.etsy.android.lib.selfuser.SelfUserListingImage r10 = r10.f19493b
            java.lang.String r10 = r10.f19494a
            r11.<init>(r4, r10)
            r5.add(r11)
            r4 = r17
            goto L_0x016c
        L_0x0193:
            r31 = r5
            goto L_0x019a
        L_0x0196:
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
            r31 = r4
        L_0x019a:
            java.util.List<java.lang.String> r4 = r14.f19522i
            com.etsy.android.lib.models.Shop r5 = new com.etsy.android.lib.models.Shop
            r17 = r5
            r18 = r15
            r19 = r0
            r22 = r2
            r24 = r3
            r32 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32)
            r7.add(r5)
            r0 = r40
            r5 = r33
            r6 = r34
            r4 = r35
            r13 = r36
            r11 = r37
            r12 = r38
            r10 = r39
            r2 = 0
            r3 = 0
            goto L_0x0084
        L_0x01c4:
            r35 = r4
            r34 = r6
            r39 = r10
            r37 = r11
            r38 = r12
            r36 = r13
            r14 = r7
            goto L_0x01e1
        L_0x01d2:
            r35 = r4
            r34 = r6
            r39 = r10
            r37 = r11
            r38 = r12
            r36 = r13
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r14 = r0
        L_0x01e1:
            com.etsy.android.lib.selfuser.SelfUserProfile r0 = r1.f19483g
            if (r0 == 0) goto L_0x0260
            java.lang.String r2 = r0.f19498a
            java.lang.String r3 = r0.f19499b
            if (r3 != 0) goto L_0x01ee
            r19 = r34
            goto L_0x01f0
        L_0x01ee:
            r19 = r3
        L_0x01f0:
            java.lang.String r3 = r0.f19500c
            if (r3 != 0) goto L_0x01f7
            r20 = r34
            goto L_0x01f9
        L_0x01f7:
            r20 = r3
        L_0x01f9:
            java.lang.String r3 = r0.f19501d
            if (r3 != 0) goto L_0x0200
            r21 = r34
            goto L_0x0202
        L_0x0200:
            r21 = r3
        L_0x0202:
            java.lang.String r3 = r0.f19502e
            if (r3 != 0) goto L_0x0209
            r22 = r34
            goto L_0x020b
        L_0x0209:
            r22 = r3
        L_0x020b:
            java.lang.String r3 = r0.f19503f
            if (r3 != 0) goto L_0x0212
            r23 = r34
            goto L_0x0214
        L_0x0212:
            r23 = r3
        L_0x0214:
            java.lang.String r3 = r0.f19504g
            com.etsy.android.lib.selfuser.SelfUserProfileCountry r4 = r0.f19505h
            if (r4 == 0) goto L_0x0244
            com.etsy.android.lib.models.Country r5 = new com.etsy.android.lib.models.Country
            int r6 = r4.f19511b
            java.lang.String r7 = r4.f19510a
            java.lang.String r10 = r4.f19512c
            if (r10 != 0) goto L_0x0227
            r27 = r34
            goto L_0x0229
        L_0x0227:
            r27 = r10
        L_0x0229:
            java.lang.String r4 = r4.f19513d
            if (r4 != 0) goto L_0x0230
            r28 = r34
            goto L_0x0232
        L_0x0230:
            r28 = r4
        L_0x0232:
            r29 = 0
            r30 = 16
            r31 = 0
            r24 = r5
            r25 = r6
            r26 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r25 = r5
            goto L_0x0246
        L_0x0244:
            r25 = 0
        L_0x0246:
            java.lang.Integer r0 = r0.f19506i
            if (r0 == 0) goto L_0x0251
            int r0 = r0.intValue()
            r26 = r0
            goto L_0x0253
        L_0x0251:
            r26 = 0
        L_0x0253:
            com.etsy.android.lib.models.UserProfile r0 = new com.etsy.android.lib.models.UserProfile
            r17 = r0
            r18 = r2
            r24 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r15 = r0
            goto L_0x0261
        L_0x0260:
            r15 = 0
        L_0x0261:
            java.util.List<com.etsy.android.lib.selfuser.SelfUserListing> r0 = r1.f19486j
            if (r0 == 0) goto L_0x0297
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0272:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0294
            java.lang.Object r3 = r0.next()
            com.etsy.android.lib.selfuser.SelfUserListing r3 = (com.etsy.android.lib.selfuser.SelfUserListing) r3
            com.etsy.android.lib.models.FavoriteListing r4 = new com.etsy.android.lib.models.FavoriteListing
            long r5 = r3.f19490a
            com.etsy.android.lib.models.datatypes.EtsyId r7 = new com.etsy.android.lib.models.datatypes.EtsyId
            r7.<init>((long) r5)
            com.etsy.android.lib.selfuser.SelfUserListingDetails r3 = r3.f19491b
            com.etsy.android.lib.selfuser.SelfUserListingImage r3 = r3.f19493b
            java.lang.String r3 = r3.f19494a
            r4.<init>(r7, r3)
            r2.add(r4)
            goto L_0x0272
        L_0x0294:
            r16 = r2
            goto L_0x029b
        L_0x0297:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r16 = r0
        L_0x029b:
            java.util.List<com.etsy.android.lib.selfuser.SelfUserAddress> r0 = r1.f19485i
            if (r0 == 0) goto L_0x02d7
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x02ac:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02d4
            java.lang.Object r3 = r0.next()
            com.etsy.android.lib.selfuser.SelfUserAddress r3 = (com.etsy.android.lib.selfuser.SelfUserAddress) r3
            com.etsy.android.lib.models.UserAddress r4 = new com.etsy.android.lib.models.UserAddress
            long r5 = r1.f19477a
            com.etsy.android.lib.models.datatypes.EtsyId r7 = new com.etsy.android.lib.models.datatypes.EtsyId
            r7.<init>((long) r5)
            int r5 = r3.f19488b
            long r5 = (long) r5
            com.etsy.android.lib.models.datatypes.EtsyId r10 = new com.etsy.android.lib.models.datatypes.EtsyId
            r10.<init>((long) r5)
            java.lang.String r5 = r3.f19487a
            boolean r3 = r3.f19489c
            r4.<init>(r7, r10, r5, r3)
            r2.add(r4)
            goto L_0x02ac
        L_0x02d4:
            r17 = r2
            goto L_0x02db
        L_0x02d7:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r17 = r0
        L_0x02db:
            com.etsy.android.lib.models.User r0 = new com.etsy.android.lib.models.User
            r7 = r0
            r10 = r39
            r11 = r37
            r12 = r38
            r13 = r36
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r35
            r1.<init>(r0)
            return r1
        L_0x02ef:
            r0 = r41
            com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload r0 = (com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload) r0
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            com.etsy.android.lib.network.oauth2.AccessTokens r0 = kotlin.jvm.internal.C19382n.m32708F0(r0)
            return r0
        L_0x02fb:
            r0 = r41
            com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload r0 = (com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload) r0
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            com.etsy.android.lib.network.oauth2.AccessTokens r0 = kotlin.jvm.internal.C19382n.m32708F0(r0)
            return r0
        L_0x0307:
            r0 = r41
            y9.c r0 = (p486y9.C13887c) r0
            com.etsy.android.lib.config.a r0 = r0.f30553a
            com.etsy.android.lib.config.e r0 = r0.f18706f
            return r0
        L_0x0310:
            r0 = r41
            retrofit2.v r0 = (retrofit2.C20145v) r0
            kotlin.jvm.internal.C19383o.m32797g(r0, r4)
            com.etsy.android.ui.user.addresses.z$c r1 = new com.etsy.android.ui.user.addresses.z$c
            T r0 = r0.f44615b
            okhttp3.a0 r0 = (okhttp3.C19928a0) r0
            if (r0 == 0) goto L_0x032b
            byte[] r0 = r0.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.Country> r2 = com.etsy.android.lib.models.Country.class
            java.util.List r0 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r0, r2)
            if (r0 != 0) goto L_0x032d
        L_0x032b:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
        L_0x032d:
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p425q9.C13260k.apply(java.lang.Object):java.lang.Object");
    }
}
