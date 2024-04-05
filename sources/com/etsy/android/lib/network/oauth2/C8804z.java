package com.etsy.android.lib.network.oauth2;

import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p346fa.C12703a;
import p739dr.C19006f;

/* renamed from: com.etsy.android.lib.network.oauth2.z */
public final class C8804z implements C20000q {

    /* renamed from: b */
    public final C8769s f19353b;

    /* renamed from: c */
    public final C12703a f19354c;

    public C8804z(C8769s sVar, C12703a aVar) {
        C19383o.m32797g(sVar, "oAuth2SigningStrategy");
        C19383o.m32797g(aVar, "grafana");
        this.f19353b = sVar;
        this.f19354c = aVar;
    }

    public final C20018z intercept(C20000q.C20001a aVar) {
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        if (C19457k.m33025c1(uVar.f44342b.mo72965b(), "/etsyapps/v3/public/oauth/", false)) {
            this.f19354c.mo45475b("SigningStrategyInterceptor.OAuth2Path", 0.01d);
            return fVar.mo70453a(uVar);
        }
        this.f19354c.mo45475b("SigningStrategyInterceptor.OAuth2SignInStrategy", 0.01d);
        return fVar.mo70453a(this.f19353b.mo30082a(uVar));
    }
}
