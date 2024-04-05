package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C19931b;
import okhttp3.C19940c0;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p346fa.C12703a;

public final class OAuth2Authenticator implements C19931b {

    /* renamed from: b */
    public final C8793t f19193b;

    /* renamed from: c */
    public final C8769s f19194c;

    /* renamed from: d */
    public final C12703a f19195d;

    public OAuth2Authenticator(C8793t tVar, C8769s sVar, C12703a aVar) {
        C19383o.m32797g(tVar, "oAuth2Repository");
        C19383o.m32797g(sVar, "signingStrategy");
        C19383o.m32797g(aVar, "grafana");
        this.f19193b = tVar;
        this.f19194c = sVar;
        this.f19195d = aVar;
    }

    /* renamed from: c */
    public final C20011u mo30010c(C19940c0 c0Var, C20018z zVar) {
        C19383o.m32797g(zVar, ResponseConstants.RESPONSE);
        if (this.f19193b.mo30039a() == null) {
            this.f19195d.mo45475b("OAuth2Authenticator.InvalidOAuth2Package.eligible", 0.01d);
            return null;
        }
        try {
            String d = this.f19193b.mo30040b().mo20656d();
            C19383o.m32796f(d, UriChallengeConstantKt.ACCESS_TOKEN);
            if (!C19457k.m33020X0(d)) {
                return this.f19194c.mo30082a(zVar.f44362c);
            }
        } catch (Exception e) {
            C15588c1.m25314Y(new OAuth2Authenticator$authenticate$1(e), 1);
        }
        this.f19195d.mo45475b("OAuth2Authenticator.InvalidOAuth2Package", 0.01d);
        return null;
    }
}
