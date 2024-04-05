package p456ua;

import p287xp.C8339g;

/* renamed from: ua.c */
public final /* synthetic */ class C13458c implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f29478b;

    /* renamed from: c */
    public final /* synthetic */ Object f29479c;

    public /* synthetic */ C13458c(Object obj, int i) {
        this.f29478b = i;
        this.f29479c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f29478b
            r1 = 0
            java.lang.String r2 = "response"
            r3 = 0
            java.lang.String r4 = "it"
            java.lang.String r5 = "this$0"
            switch(r0) {
                case 0: goto L_0x017d;
                case 1: goto L_0x0155;
                case 2: goto L_0x0119;
                case 3: goto L_0x00d6;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00a3;
                case 6: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x018c
        L_0x000f:
            java.lang.Object r0 = r6.f29479c
            com.etsy.android.ui.user.privacy.b r0 = (com.etsy.android.p327ui.user.privacy.C11622b) r0
            java.util.Map r7 = (java.util.Map) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            tq.a r0 = r0.f25729g
            r0.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x002d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r4 = "gdpr_p"
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r2.getValue()
            com.etsy.android.lib.session.PrivacySetting r3 = (com.etsy.android.lib.session.PrivacySetting) r3
            int r3 = r3.f19534b
            r4 = 3
            if (r3 != r4) goto L_0x0052
            r3 = 1
            goto L_0x0053
        L_0x0052:
            r3 = r1
        L_0x0053:
            if (r3 != 0) goto L_0x002d
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r0.put(r3, r2)
            goto L_0x002d
        L_0x0061:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r1 = r0.size()
            r7.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0072:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0095
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            pa.f$c r2 = new pa.f$c
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            com.etsy.android.lib.session.PrivacySetting r1 = (com.etsy.android.lib.session.PrivacySetting) r1
            boolean r1 = r1.f19535c
            r2.<init>(r3, r1)
            r7.add(r2)
            goto L_0x0072
        L_0x0095:
            java.util.List r7 = kotlin.collections.C19327t.m32660p1(r7)
            pa.b r0 = new pa.b
            r0.<init>()
            java.util.List r7 = kotlin.collections.C19327t.m32656l1(r7, r0)
            return r7
        L_0x00a3:
            java.lang.Object r0 = r6.f29479c
            com.etsy.android.ui.home.landingpage.c r0 = (com.etsy.android.p327ui.home.landingpage.C10021c) r0
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            boolean r2 = r7 instanceof retrofit2.HttpException
            if (r2 == 0) goto L_0x00b6
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            goto L_0x00b7
        L_0x00b6:
            r7 = r3
        L_0x00b7:
            com.etsy.android.ui.home.landingpage.b$b r2 = new com.etsy.android.ui.home.landingpage.b$b
            if (r7 == 0) goto L_0x00c1
            com.squareup.moshi.y r0 = r0.f22070b
            java.lang.String r3 = androidx.compose.foundation.layout.C0761x.m1690R0(r7, r0)
        L_0x00c1:
            if (r7 == 0) goto L_0x00c7
            int r1 = r7.code()
        L_0x00c7:
            r2.<init>(r3, r1, r7)
            return r2
        L_0x00cb:
            java.lang.Object r0 = r6.f29479c
            com.etsy.android.ui.core.CollectionFragment r0 = (com.etsy.android.p327ui.core.CollectionFragment) r0
            com.etsy.android.lib.models.apiv3.ListingCard r7 = (com.etsy.android.lib.models.apiv3.ListingCard) r7
            com.etsy.android.uikit.viewholder.ListingCardUiModel r7 = r0.mapListingCardToListingCardUiModel(r7)
            return r7
        L_0x00d6:
            java.lang.Object r0 = r6.f29479c
            cc.c r0 = (p321cc.C8569c) r0
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r2)
            T r2 = r7.f44615b
            okhttp3.a0 r2 = (okhttp3.C19928a0) r2
            boolean r4 = r7.mo74384a()
            if (r4 == 0) goto L_0x0109
            if (r2 == 0) goto L_0x0109
            T r7 = r7.f44615b
            okhttp3.a0 r7 = (okhttp3.C19928a0) r7
            if (r7 == 0) goto L_0x00fe
            byte[] r7 = r7.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.ReceiptReviewV3> r0 = com.etsy.android.lib.models.ReceiptReviewV3.class
            java.lang.Object r3 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r7, r0)
        L_0x00fe:
            com.etsy.android.lib.models.ReceiptReviewV3 r3 = (com.etsy.android.lib.models.ReceiptReviewV3) r3
            cc.c$b$b r7 = new cc.c$b$b
            kotlin.jvm.internal.C19383o.m32794d(r3)
            r7.<init>(r3)
            goto L_0x0118
        L_0x0109:
            cc.c$b$a r2 = new cc.c$b$a
            com.squareup.moshi.y r0 = r0.f18659b
            androidx.compose.foundation.layout.C0761x.m1692S0(r7, r0)
            okhttp3.z r7 = r7.f44614a
            int r7 = r7.f44365f
            r2.<init>(r1)
            r7 = r2
        L_0x0118:
            return r7
        L_0x0119:
            java.lang.Object r0 = r6.f29479c
            com.etsy.android.ui.cart.x r0 = (com.etsy.android.p327ui.cart.C9420x) r0
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r2)
            boolean r1 = r7.mo74384a()
            if (r1 == 0) goto L_0x0143
            com.etsy.android.ui.cart.i$b r0 = new com.etsy.android.ui.cart.i$b
            T r7 = r7.f44615b
            okhttp3.a0 r7 = (okhttp3.C19928a0) r7
            if (r7 == 0) goto L_0x013d
            byte[] r7 = r7.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.cart.CartGroupItem> r1 = com.etsy.android.lib.models.apiv3.cart.CartGroupItem.class
            java.lang.Object r3 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r7, r1)
        L_0x013d:
            com.etsy.android.lib.models.apiv3.cart.CartGroupItem r3 = (com.etsy.android.lib.models.apiv3.cart.CartGroupItem) r3
            r0.<init>(r3)
            goto L_0x0154
        L_0x0143:
            com.etsy.android.ui.cart.i$a r1 = new com.etsy.android.ui.cart.i$a
            retrofit2.HttpException r2 = new retrofit2.HttpException
            r2.<init>(r7)
            com.squareup.moshi.y r0 = r0.f20900d
            java.lang.String r7 = androidx.compose.foundation.layout.C0761x.m1694T0(r7, r0)
            r1.<init>(r7, r2)
            r0 = r1
        L_0x0154:
            return r0
        L_0x0155:
            java.lang.Object r0 = r6.f29479c
            com.etsy.android.search.savedsearch.f r0 = (com.etsy.android.search.savedsearch.C8982f) r0
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            boolean r2 = r7 instanceof retrofit2.HttpException
            if (r2 == 0) goto L_0x0168
            retrofit2.HttpException r7 = (retrofit2.HttpException) r7
            goto L_0x0169
        L_0x0168:
            r7 = r3
        L_0x0169:
            com.etsy.android.search.savedsearch.d$a r2 = new com.etsy.android.search.savedsearch.d$a
            if (r7 == 0) goto L_0x0173
            com.squareup.moshi.y r0 = r0.f19823b
            java.lang.String r3 = androidx.compose.foundation.layout.C0761x.m1690R0(r7, r0)
        L_0x0173:
            if (r7 == 0) goto L_0x0179
            int r1 = r7.code()
        L_0x0179:
            r2.<init>(r3, r1, r7)
            return r2
        L_0x017d:
            java.lang.Object r0 = r6.f29479c
            tp.r r0 = (p248tp.C8066r) r0
            java.util.concurrent.Callable r7 = (java.util.concurrent.Callable) r7
            java.lang.String r1 = "$scheduler"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            return r0
        L_0x018c:
            java.lang.Object r0 = r6.f29479c
            gf.e r0 = (p357gf.C12796e) r0
            retrofit2.v r7 = (retrofit2.C20145v) r7
            kotlin.jvm.internal.C19383o.m32797g(r0, r5)
            kotlin.jvm.internal.C19383o.m32797g(r7, r4)
            boolean r0 = r7.mo74384a()
            if (r0 == 0) goto L_0x01b9
            T r0 = r7.f44615b
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01aa
            com.etsy.android.uikit.viewholder.u$a$b r7 = new com.etsy.android.uikit.viewholder.u$a$b
            r7.<init>(r0)
            goto L_0x01c8
        L_0x01aa:
            com.etsy.android.uikit.viewholder.u$a$a r0 = new com.etsy.android.uikit.viewholder.u$a$a
            okhttp3.z r7 = r7.f44614a
            java.lang.String r7 = r7.f44364e
            java.lang.String r1 = "response.message()"
            kotlin.jvm.internal.C19383o.m32796f(r7, r1)
            r0.<init>(r7)
            goto L_0x01c7
        L_0x01b9:
            com.etsy.android.uikit.viewholder.u$a$a r0 = new com.etsy.android.uikit.viewholder.u$a$a
            okhttp3.z r7 = r7.f44614a
            java.lang.String r7 = r7.f44364e
            java.lang.String r1 = "it.message()"
            kotlin.jvm.internal.C19383o.m32796f(r7, r1)
            r0.<init>(r7)
        L_0x01c7:
            r7 = r0
        L_0x01c8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p456ua.C13458c.apply(java.lang.Object):java.lang.Object");
    }
}
