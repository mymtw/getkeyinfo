package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.push.registration.C8837j;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;

/* renamed from: com.etsy.android.lib.network.oauth2.a */
public final class C8744a {

    /* renamed from: a */
    public final C8809t f19219a;

    /* renamed from: b */
    public final C13265p f19220b;

    /* renamed from: c */
    public final C8837j f19221c;

    /* renamed from: d */
    public final C8591a f19222d;

    public C8744a(C8809t tVar, C13265p pVar, C8837j jVar, C8591a aVar) {
        C19383o.m32797g(tVar, "tokensPersistence");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(jVar, "pushRegistration");
        C19383o.m32797g(aVar, "etsyConfig");
        this.f19219a = tVar;
        this.f19220b = pVar;
        this.f19221c = jVar;
        this.f19222d = aVar;
    }

    /* renamed from: a */
    public final void mo30070a(AccessTokens accessTokens) {
        C19383o.m32797g(accessTokens, "tokens");
        this.f19219a.mo30125b(accessTokens.getOAuth2AccessToken());
        this.f19220b.f29137c.mo45945b(accessTokens.getXAuthAccessToken().getUserId(), new XAuthAccessToken(accessTokens.getXAuthAccessToken().getXAuthToken(), accessTokens.getXAuthAccessToken().getXAuthTokenSecret(), accessTokens.getXAuthAccessToken().getUserId()));
        this.f19220b.mo45961f(true);
        this.f19221c.mo30209c();
        this.f19222d.mo21107e(EtsyApplication.get());
    }
}
