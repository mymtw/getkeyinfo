package p470w9;

import p287xp.C8339g;

/* renamed from: w9.a */
public final /* synthetic */ class C13793a implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f30356b;

    public /* synthetic */ C13793a(int i) {
        this.f30356b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r5 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r5.mo72841a(), com.etsy.android.lib.models.Country.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f30356b
            java.lang.String r1 = "it"
            r2 = 0
            java.lang.String r3 = "response"
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x004a;
                case 2: goto L_0x0039;
                case 3: goto L_0x0021;
                case 4: goto L_0x0014;
                case 5: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0082
        L_0x000c:
            retrofit2.v r5 = (retrofit2.C20145v) r5
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)
            com.etsy.android.ui.user.addresses.z$d r5 = com.etsy.android.p327ui.user.addresses.C11463z.C11467d.f25314a
            return r5
        L_0x0014:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            com.etsy.android.ui.user.r$a$a r5 = new com.etsy.android.ui.user.r$a$a
            r5.<init>()
            return r5
        L_0x0021:
            retrofit2.v r5 = (retrofit2.C20145v) r5
            kotlin.jvm.internal.C19383o.m32797g(r5, r1)
            T r5 = r5.f44615b
            okhttp3.a0 r5 = (okhttp3.C19928a0) r5
            if (r5 == 0) goto L_0x0036
            byte[] r5 = r5.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.Collection> r0 = com.etsy.android.lib.models.apiv3.Collection.class
            java.lang.Object r2 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r5, r0)
        L_0x0036:
            com.etsy.android.lib.models.apiv3.Collection r2 = (com.etsy.android.lib.models.apiv3.Collection) r2
            return r2
        L_0x0039:
            qa.c r5 = (p426qa.C13277c) r5
            java.lang.String r0 = "notificationData"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            com.etsy.android.ui.conversation.details.k r0 = new com.etsy.android.ui.conversation.details.k
            java.lang.String r1 = r5.f29182b
            java.lang.String r5 = r5.f29183c
            r0.<init>(r1, r5)
            return r0
        L_0x004a:
            retrofit2.v r5 = (retrofit2.C20145v) r5
            kotlin.jvm.internal.C19383o.m32797g(r5, r3)
            boolean r0 = r5.mo74384a()
            if (r0 == 0) goto L_0x0061
            T r0 = r5.f44615b
            if (r0 == 0) goto L_0x0061
            cc.c$a$b r5 = new cc.c$a$b
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r0 = (com.etsy.android.lib.models.apiv3.listing.ListingFetch) r0
            r5.<init>(r0)
            goto L_0x0067
        L_0x0061:
            cc.c$a$a r0 = new cc.c$a$a
            r0.<init>(r5, r2)
            r5 = r0
        L_0x0067:
            return r5
        L_0x0068:
            retrofit2.v r5 = (retrofit2.C20145v) r5
            kotlin.jvm.internal.C19383o.m32797g(r5, r3)
            T r5 = r5.f44615b
            okhttp3.a0 r5 = (okhttp3.C19928a0) r5
            if (r5 == 0) goto L_0x007f
            byte[] r5 = r5.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.Country> r0 = com.etsy.android.lib.models.Country.class
            java.util.List r5 = com.etsy.android.lib.models.MoshiModelFactory.createListFromByteArray(r5, r0)
            if (r5 != 0) goto L_0x0081
        L_0x007f:
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
        L_0x0081:
            return r5
        L_0x0082:
            retrofit2.v r5 = (retrofit2.C20145v) r5
            java.lang.String r0 = "responseBody"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            okhttp3.z r0 = r5.f44614a
            int r0 = r0.f44365f
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 != r1) goto L_0x0092
            return r5
        L_0x0092:
            com.etsy.android.ui.util.DeleteFavoriteResponseNotEmpty r5 = new com.etsy.android.ui.util.DeleteFavoriteResponseNotEmpty
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p470w9.C13793a.apply(java.lang.Object):java.lang.Object");
    }
}
