package p306z8;

import java.util.concurrent.Callable;

/* renamed from: z8.f */
public final /* synthetic */ class C8479f implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f18504b;

    /* renamed from: c */
    public final /* synthetic */ Object f18505c;

    public /* synthetic */ C8479f(Object obj, int i) {
        this.f18504b = i;
        this.f18505c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            int r0 = r8.f18504b
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x000f
        L_0x0006:
            java.lang.Object r0 = r8.f18505c
            com.etsy.android.config.ConfigPreferencesHelper r0 = (com.etsy.android.config.ConfigPreferencesHelper) r0
            java.lang.Integer r0 = com.etsy.android.config.ConfigPreferencesHelper.m34849setUpWipeLogsPreference$lambda10$lambda8(r0)
            return r0
        L_0x000f:
            java.lang.Object r0 = r8.f18505c
            com.etsy.android.lib.network.oauth2.OAuth2Repository r0 = (com.etsy.android.lib.network.oauth2.OAuth2Repository) r0
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            com.etsy.android.lib.network.t r1 = r0.f19202a
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r1 = r1.mo30124a()
            r2 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = r1.getRefreshToken()
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            boolean r3 = p628nj.C18263b.m30837c0(r1)
            r4 = 2
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            if (r3 == 0) goto L_0x00c2
            com.etsy.android.lib.network.oauth2.e0 r3 = r0.f19204c     // Catch:{ OAuth2TokenRevokedException -> 0x00c0, HttpException -> 0x0057, Exception -> 0x0040 }
            io.reactivex.internal.operators.single.j r1 = r3.mo30077a(r1)     // Catch:{ OAuth2TokenRevokedException -> 0x00c0, HttpException -> 0x0057, Exception -> 0x0040 }
            java.lang.Object r1 = r1.mo20656d()     // Catch:{ OAuth2TokenRevokedException -> 0x00c0, HttpException -> 0x0057, Exception -> 0x0040 }
            com.etsy.android.lib.network.oauth2.AccessTokens r1 = (com.etsy.android.lib.network.oauth2.AccessTokens) r1     // Catch:{ OAuth2TokenRevokedException -> 0x00c0, HttpException -> 0x0057, Exception -> 0x0040 }
            goto L_0x0076
        L_0x0040:
            r1 = move-exception
            fa.a r3 = r0.f19206e
            java.lang.String r7 = "OAuth2Repository.TokenRefreshError"
            r3.mo45475b(r7, r5)
            com.etsy.android.lib.util.CrashUtil r3 = com.etsy.android.lib.util.CrashUtil.m17307a()
            com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException r5 = new com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException
            java.lang.String r6 = "Token refresh attempt failed."
            r5.<init>(r6, r1)
            r3.mo30457b(r5)
            goto L_0x0075
        L_0x0057:
            r1 = move-exception
            int r3 = r1.code()
            r7 = 418(0x1a2, float:5.86E-43)
            if (r3 != r7) goto L_0x0075
            fa.a r3 = r0.f19206e
            java.lang.String r7 = "OAuth2Repository.DisableOAuth2.refresh"
            r3.mo45475b(r7, r5)
            com.etsy.android.lib.util.CrashUtil r3 = com.etsy.android.lib.util.CrashUtil.m17307a()
            com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException r5 = new com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException
            java.lang.String r6 = "Token refresh got a 418. Disable OAuth2 for Session."
            r5.<init>(r6, r1)
            r3.mo30457b(r5)
        L_0x0075:
            r1 = r2
        L_0x0076:
            com.etsy.android.lib.network.t r3 = r0.f19202a
            if (r1 == 0) goto L_0x007f
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r5 = r1.getOAuth2AccessToken()
            goto L_0x0080
        L_0x007f:
            r5 = r2
        L_0x0080:
            r3.mo30125b(r5)
            com.etsy.android.lib.network.t r3 = r0.f19202a
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r3 = r3.mo30124a()
            if (r3 == 0) goto L_0x0091
            java.util.Set r3 = r3.getCookies()
            if (r3 != 0) goto L_0x0093
        L_0x0091:
            kotlin.collections.EmptySet r3 = kotlin.collections.EmptySet.INSTANCE
        L_0x0093:
            r0.mo30041c(r3)
            if (r1 == 0) goto L_0x009d
            com.etsy.android.lib.network.oauth2.XAuthAccessToken r1 = r1.getXAuthAccessToken()
            goto L_0x009e
        L_0x009d:
            r1 = r2
        L_0x009e:
            r0.mo30042d(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f19211j
            r3 = 0
            r1.set(r3)
            com.etsy.android.lib.network.t r0 = r0.f19202a
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r0 = r0.mo30124a()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = r0.getAccessToken()
            goto L_0x00b5
        L_0x00b4:
            r0 = r2
        L_0x00b5:
            if (r0 == 0) goto L_0x00b8
            return r0
        L_0x00b8:
            com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException r0 = new com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException
            java.lang.String r1 = "Token refresh attempt failed"
            r0.<init>(r1, r2, r4, r2)
            throw r0
        L_0x00c0:
            r0 = move-exception
            throw r0
        L_0x00c2:
            fa.a r0 = r0.f19206e
            java.lang.String r1 = "OAuth2Repository.MissingRefreshToken"
            r0.mo45475b(r1, r5)
            com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException r0 = new com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException
            java.lang.String r1 = "Missing refresh token"
            r0.<init>(r1, r2, r4, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p306z8.C8479f.call():java.lang.Object");
    }
}
