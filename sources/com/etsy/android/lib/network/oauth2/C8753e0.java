package com.etsy.android.lib.network.oauth2;

import androidx.compose.foundation.layout.C0761x;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;

/* renamed from: com.etsy.android.lib.network.oauth2.e0 */
public final class C8753e0 {

    /* renamed from: a */
    public final C8798x f19242a;

    public C8753e0(C8798x xVar) {
        C19383o.m32797g(xVar, "refreshOAuthTokenEndpoint");
        this.f19242a = xVar;
    }

    /* renamed from: a */
    public final C19208j mo30077a(String str) {
        C19383o.m32797g(str, "refreshToken");
        C8798x xVar = this.f19242a;
        String V = C0761x.m1697V();
        C19383o.m32796f(V, "getApiKey()");
        C8071s<OAuth2AccessTokenPayload> a = xVar.mo30117a("api.oauth2.access_token_endpoint:on,api.oauth2.access_token_endpoint.etsy_apps_service:on,api.oauth2.access_token_endpoint.open_api_service:on", "refresh_token", V, str, "address_r address_w billing_r cart_r cart_w email_r favorites_r favorites_w feedback_r listings_d listings_r listings_w profile_r profile_w recommend_r recommend_w shops_r shops_w transactions_r transactions_w");
        C8751d0 d0Var = new C8751d0(0);
        a.getClass();
        return new C19208j(a, d0Var);
    }
}
