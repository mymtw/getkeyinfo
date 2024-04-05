package p425q9;

import p287xp.C8339g;

/* renamed from: q9.b */
public final /* synthetic */ class C13250b implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f29105b;

    public /* synthetic */ C13250b(int i) {
        this.f29105b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.etsy.android.lib.models.apiv3.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.etsy.android.lib.models.apiv3.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.etsy.android.lib.models.apiv3.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.etsy.android.lib.models.apiv3.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.etsy.android.lib.models.apiv3.User} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r4 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r4.mo72841a(), com.etsy.android.lib.models.apiv3.ListingMemberData.class);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f29105b
            r1 = 0
            java.lang.String r2 = "it"
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0065;
                case 2: goto L_0x004c;
                case 3: goto L_0x0041;
                case 4: goto L_0x0034;
                case 5: goto L_0x0014;
                case 6: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x008d
        L_0x000a:
            com.etsy.android.ui.user.inappnotifications.UpdatesFeed r4 = (com.etsy.android.p327ui.user.inappnotifications.UpdatesFeed) r4
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            java.util.ArrayList r4 = p514bk.C14088a.m21782g(r4)
            return r4
        L_0x0014:
            retrofit2.v r4 = (retrofit2.C20145v) r4
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            com.etsy.android.ui.shop.u$b r0 = new com.etsy.android.ui.shop.u$b
            T r4 = r4.f44615b
            okhttp3.a0 r4 = (okhttp3.C19928a0) r4
            if (r4 == 0) goto L_0x002b
            byte[] r4 = r4.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.TranslatedReview> r1 = com.etsy.android.lib.models.apiv3.TranslatedReview.class
            java.lang.Object r1 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r4, r1)
        L_0x002b:
            kotlin.jvm.internal.C19383o.m32794d(r1)
            com.etsy.android.lib.models.apiv3.TranslatedReview r1 = (com.etsy.android.lib.models.apiv3.TranslatedReview) r1
            r0.<init>(r1)
            return r0
        L_0x0034:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            ed.b$c$a r4 = new ed.b$c$a
            r4.<init>()
            return r4
        L_0x0041:
            com.etsy.android.lib.models.apiv3.ListingShippingDetails r4 = (com.etsy.android.lib.models.apiv3.ListingShippingDetails) r4
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            com.etsy.android.ui.core.m$b r0 = new com.etsy.android.ui.core.m$b
            r0.<init>(r4)
            return r0
        L_0x004c:
            pr.d r4 = (p765pr.C20064d) r4
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            retrofit2.v<T> r4 = r4.f44433a
            if (r4 == 0) goto L_0x005a
            T r4 = r4.f44615b
            r1 = r4
            com.etsy.android.lib.models.apiv3.User r1 = (com.etsy.android.lib.models.apiv3.User) r1
        L_0x005a:
            if (r1 == 0) goto L_0x0062
            com.etsy.android.ui.conversation.compose.a$a$b r4 = new com.etsy.android.ui.conversation.compose.a$a$b
            r4.<init>(r1)
            goto L_0x0064
        L_0x0062:
            com.etsy.android.ui.conversation.compose.a$a$a r4 = com.etsy.android.p327ui.conversation.compose.C9452a.C9453a.C9454a.f20957a
        L_0x0064:
            return r4
        L_0x0065:
            retrofit2.v r4 = (retrofit2.C20145v) r4
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            T r4 = r4.f44615b
            okhttp3.a0 r4 = (okhttp3.C19928a0) r4
            if (r4 == 0) goto L_0x007c
            byte[] r4 = r4.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.ListingMemberData> r0 = com.etsy.android.lib.models.apiv3.ListingMemberData.class
            java.util.List r4 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r4, r0)
            if (r4 != 0) goto L_0x007e
        L_0x007c:
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
        L_0x007e:
            return r4
        L_0x007f:
            com.etsy.android.lib.models.loggers.Epoch r4 = (com.etsy.android.lib.models.loggers.Epoch) r4
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            long r0 = r4.getServerTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        L_0x008d:
            java.util.Map r4 = (java.util.Map) r4
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            java.lang.String r0 = "gdpr_tp"
            java.lang.Object r4 = r4.get(r0)
            com.etsy.android.lib.session.PrivacySetting r4 = (com.etsy.android.lib.session.PrivacySetting) r4
            if (r4 == 0) goto L_0x009f
            boolean r4 = r4.f19535c
            goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p425q9.C13250b.apply(java.lang.Object):java.lang.Object");
    }
}
