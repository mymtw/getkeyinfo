package com.etsy.android.lib.network.oauth2;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import kotlin.jvm.internal.C19383o;
import p248tp.C8071s;

/* renamed from: com.etsy.android.lib.network.oauth2.d */
public final class C8750d {

    /* renamed from: a */
    public final C8748c f19232a;

    public C8750d(C8748c cVar) {
        C19383o.m32797g(cVar, "authCodeExchangeEndpoint");
        this.f19232a = cVar;
    }

    /* renamed from: a */
    public final C8071s<OAuth2AccessTokenPayload> mo30073a(String str, String str2) {
        C19383o.m32797g(str, "authCode");
        C19383o.m32797g(str2, ConstantsKt.CODE_VERIFIER);
        C8748c cVar = this.f19232a;
        String V = C0761x.m1697V();
        C19383o.m32796f(V, "getApiKey()");
        return cVar.mo30072a("api.oauth2.access_token_endpoint:on,api.oauth2.access_token_endpoint.etsy_apps_service:on,api.oauth2.access_token_endpoint.open_api_service:on", "authorization_code", V, str, "etsy://oauth2", "address_r address_w billing_r cart_r cart_w email_r favorites_r favorites_w feedback_r listings_d listings_r listings_w profile_r profile_w recommend_r recommend_w shops_r shops_w transactions_r transactions_w", str2);
    }
}
