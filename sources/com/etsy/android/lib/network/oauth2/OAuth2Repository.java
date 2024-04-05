package com.etsy.android.lib.network.oauth2;

import android.webkit.CookieManager;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.C8809t;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p145io.reactivex.internal.operators.single.C19206h;
import p145io.reactivex.internal.operators.single.C19210k;
import p145io.reactivex.subjects.SingleSubject;
import p248tp.C8071s;
import p306z8.C8479f;
import p340ea.C12673n;
import p346fa.C12703a;
import p425q9.C13252d;
import p634np.C18289a;

public final class OAuth2Repository implements C8793t {

    /* renamed from: a */
    public final C8809t f19202a;

    /* renamed from: b */
    public final C8749c0 f19203b;

    /* renamed from: c */
    public final C8753e0 f19204c;

    /* renamed from: d */
    public final C18289a<C13252d> f19205d;

    /* renamed from: e */
    public final C12703a f19206e;

    /* renamed from: f */
    public final C12673n f19207f;

    /* renamed from: g */
    public final C8618c f19208g;

    /* renamed from: h */
    public final AtomicBoolean f19209h = new AtomicBoolean();

    /* renamed from: i */
    public SingleSubject<String> f19210i = new SingleSubject<>();

    /* renamed from: j */
    public final AtomicBoolean f19211j = new AtomicBoolean();

    /* renamed from: k */
    public C8071s<String> f19212k;

    public static final class OAuth2TokenException extends RuntimeException {
        public static final int $stable = 0;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OAuth2TokenException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OAuth2TokenException(String str, Throwable th) {
            super(str, th);
            C19383o.m32797g(str, "message");
        }
    }

    public OAuth2Repository(C8809t tVar, C8749c0 c0Var, C8753e0 e0Var, C18289a<C13252d> aVar, C12703a aVar2, C12673n nVar, C8618c cVar) {
        C19383o.m32797g(tVar, "oAuth2TokenStore");
        C19383o.m32797g(c0Var, "tokenExchangeStrategy");
        C19383o.m32797g(e0Var, "tokenRefreshStrategy");
        C19383o.m32797g(aVar, "etsyAuthManager");
        C19383o.m32797g(aVar2, "grafana");
        C19383o.m32797g(nVar, "logger");
        C19383o.m32797g(cVar, "configMap");
        this.f19202a = tVar;
        this.f19203b = c0Var;
        this.f19204c = e0Var;
        this.f19205d = aVar;
        this.f19206e = aVar2;
        this.f19207f = nVar;
        this.f19208g = cVar;
        C19210k kVar = C19210k.f42943b;
        C19383o.m32796f(kVar, "never()");
        this.f19212k = kVar;
    }

    /* renamed from: a */
    public final OAuth2AccessToken mo30039a() {
        return this.f19202a.mo30124a();
    }

    /* renamed from: b */
    public final C8071s<String> mo30040b() {
        if (this.f19211j.compareAndSet(false, true)) {
            this.f19212k = new C19206h(new C8479f(this, 1));
        }
        return this.f19212k;
    }

    /* renamed from: c */
    public final void mo30041c(Set<String> set) {
        String f = this.f19208g.mo21136f(C8592b.f18819p0);
        C19383o.m32796f(f, "configMap.getStringValue…gKeys.HTTP_HOST_ETSY_WEB)");
        CookieManager instance = CookieManager.getInstance();
        if (instance != null) {
            instance.setAcceptCookie(true);
            for (String cookie : set) {
                instance.setCookie(f, cookie);
            }
        }
    }

    /* renamed from: d */
    public final void mo30042d(XAuthAccessToken xAuthAccessToken) {
        if (xAuthAccessToken != null) {
            this.f19205d.get().mo45945b(xAuthAccessToken.getUserId(), xAuthAccessToken);
        } else {
            this.f19205d.get().mo45944a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p145io.reactivex.subjects.SingleSubject getAccessToken() {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.f19209h
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0101
            com.etsy.android.lib.network.t r0 = r15.f19202a
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r0 = r0.mo30124a()
            r3 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.getAccessToken()
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            boolean r4 = p628nj.C18263b.m30837c0(r0)
            if (r4 == 0) goto L_0x0026
            io.reactivex.subjects.SingleSubject<java.lang.String> r1 = r15.f19210i
            r1.onSuccess(r0)
            goto L_0x0101
        L_0x0026:
            q9.p r0 = p628nj.C18263b.f40057V
            q9.d r0 = r0.f29137c
            r0.getClass()
            q9.p r0 = p628nj.C18263b.f40057V
            q9.d r0 = r0.f29137c
            com.etsy.android.lib.network.oauth2.XAuthAccessToken r0 = r0.f29107a
            r4 = 2
            if (r0 == 0) goto L_0x00f9
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            com.etsy.android.lib.network.oauth2.c0 r7 = r15.f19203b     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            java.lang.String r11 = androidx.compose.foundation.layout.C0761x.m1697V()     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            java.lang.String r8 = "getApiKey()"
            kotlin.jvm.internal.C19383o.m32796f(r11, r8)     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            java.lang.String r12 = r0.getXAuthToken()     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            java.lang.String r0 = "legacyToken"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            com.etsy.android.lib.network.oauth2.b0 r8 = r7.f19231a     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            java.lang.String r9 = "api.oauth2.access_token_endpoint:on,api.oauth2.access_token_endpoint.etsy_apps_service:on,api.oauth2.access_token_endpoint.open_api_service:on"
            java.lang.String r10 = "token_exchange"
            java.lang.String r13 = "etsy://oauth2"
            java.lang.String r14 = "address_r address_w billing_r cart_r cart_w email_r favorites_r favorites_w feedback_r listings_d listings_r listings_w profile_r profile_w recommend_r recommend_w shops_r shops_w transactions_r transactions_w"
            tp.s r0 = r8.mo30071a(r9, r10, r11, r12, r13, r14)     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            q9.k r7 = new q9.k     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            r7.<init>(r4)     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            r0.getClass()     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            io.reactivex.internal.operators.single.j r8 = new io.reactivex.internal.operators.single.j     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            r8.<init>(r0, r7)     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            java.lang.Object r0 = r8.mo20656d()     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            com.etsy.android.lib.network.oauth2.AccessTokens r0 = (com.etsy.android.lib.network.oauth2.AccessTokens) r0     // Catch:{ HttpException -> 0x0082, Exception -> 0x0071 }
            goto L_0x00a1
        L_0x0071:
            r0 = move-exception
            fa.a r7 = r15.f19206e
            java.lang.String r8 = "OAuth2Repository.TokenExchangeError"
            r7.mo45475b(r8, r5)
            com.etsy.android.lib.network.oauth2.OAuth2Repository$performTokenExchange$newTokenPackage$1 r5 = new com.etsy.android.lib.network.oauth2.OAuth2Repository$performTokenExchange$newTokenPackage$1
            r5.<init>(r15, r0)
            com.google.android.play.core.assetpacks.C15588c1.m25314Y(r5, r2)
            goto L_0x00a0
        L_0x0082:
            r0 = move-exception
            int r2 = r0.code()
            r7 = 418(0x1a2, float:5.86E-43)
            if (r2 != r7) goto L_0x00a0
            fa.a r2 = r15.f19206e
            java.lang.String r7 = "OAuth2Repository.DisableOAuth2.exchange"
            r2.mo45475b(r7, r5)
            com.etsy.android.lib.util.CrashUtil r2 = com.etsy.android.lib.util.CrashUtil.m17307a()
            com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException r5 = new com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException
            java.lang.String r6 = "Token exchange got a 418. Disable OAuth2 for Session."
            r5.<init>(r6, r0)
            r2.mo30457b(r5)
        L_0x00a0:
            r0 = r3
        L_0x00a1:
            com.etsy.android.lib.network.t r2 = r15.f19202a
            if (r0 == 0) goto L_0x00aa
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r5 = r0.getOAuth2AccessToken()
            goto L_0x00ab
        L_0x00aa:
            r5 = r3
        L_0x00ab:
            r2.mo30125b(r5)
            com.etsy.android.lib.network.t r2 = r15.f19202a
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r2 = r2.mo30124a()
            if (r2 == 0) goto L_0x00bc
            java.util.Set r2 = r2.getCookies()
            if (r2 != 0) goto L_0x00be
        L_0x00bc:
            kotlin.collections.EmptySet r2 = kotlin.collections.EmptySet.INSTANCE
        L_0x00be:
            r15.mo30041c(r2)
            if (r0 == 0) goto L_0x00cc
            com.etsy.android.lib.network.oauth2.XAuthAccessToken r0 = r0.getXAuthAccessToken()
            if (r0 == 0) goto L_0x00cc
            r15.mo30042d(r0)
        L_0x00cc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.f19209h
            r0.set(r1)
            com.etsy.android.lib.network.t r0 = r15.f19202a
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r0 = r0.mo30124a()
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = r0.getAccessToken()
            goto L_0x00df
        L_0x00de:
            r0 = r3
        L_0x00df:
            if (r0 == 0) goto L_0x00e9
            io.reactivex.subjects.SingleSubject<java.lang.String> r1 = r15.f19210i
            r1.onSuccess(r0)
            kotlin.m r0 = kotlin.C19394m.f43287a
            goto L_0x00ea
        L_0x00e9:
            r0 = r3
        L_0x00ea:
            if (r0 != 0) goto L_0x0101
            io.reactivex.subjects.SingleSubject<java.lang.String> r0 = r15.f19210i
            com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException r1 = new com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException
            java.lang.String r2 = "Token exchange attempt failed"
            r1.<init>(r2, r3, r4, r3)
            r0.onError(r1)
            goto L_0x0101
        L_0x00f9:
            com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException r0 = new com.etsy.android.lib.network.oauth2.OAuth2Repository$OAuth2TokenException
            java.lang.String r1 = "User is not signed in"
            r0.<init>(r1, r3, r4, r3)
            throw r0
        L_0x0101:
            io.reactivex.subjects.SingleSubject<java.lang.String> r0 = r15.f19210i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.network.oauth2.OAuth2Repository.getAccessToken():io.reactivex.subjects.SingleSubject");
    }
}
