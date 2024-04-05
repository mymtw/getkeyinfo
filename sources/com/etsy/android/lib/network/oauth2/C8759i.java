package com.etsy.android.lib.network.oauth2;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.oauth2.signin.CodeAndState;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleFlatMap;
import p248tp.C8071s;
import p425q9.C13262m;

/* renamed from: com.etsy.android.lib.network.oauth2.i */
public final class C8759i {

    /* renamed from: a */
    public final C8756g f19257a;

    /* renamed from: b */
    public final C8750d f19258b;

    /* renamed from: c */
    public final C8794u f19259c = C8795v.m17187a();

    public C8759i(C8756g gVar, C8750d dVar, C8795v vVar) {
        C19383o.m32797g(gVar, "externalIdentityProviderEndpoint");
        C19383o.m32797g(dVar, "authCodeExchangeStrategy");
        C19383o.m32797g(vVar, "pkceUtil");
        this.f19257a = gVar;
        this.f19258b = dVar;
    }

    /* renamed from: a */
    public final SingleFlatMap mo30079a(ExternalIdentityProvider externalIdentityProvider, String str, String str2) {
        C19383o.m32797g(externalIdentityProvider, "provider");
        C19383o.m32797g(str, "email");
        C19383o.m32797g(str2, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        LinkedHashMap t0 = C19294b0.m32563t0(new Pair("email", str), new Pair("grant_type", "authorization_code"), new Pair("response_type", ResponseConstants.CODE), new Pair("client_id", C0761x.m1697V()), new Pair("scope", "address_r address_w billing_r cart_r cart_w email_r favorites_r favorites_w feedback_r listings_d listings_r listings_w profile_r profile_w recommend_r recommend_w shops_r shops_w transactions_r transactions_w"), new Pair("redirect_uri", "etsy://oauth2"), new Pair("code_challenge", this.f19259c.f19347b), new Pair("code_challenge_method", "S256"), new Pair("external_identity_provider", externalIdentityProvider.getProviderName()), new Pair("state", UUID.randomUUID().toString()), new Pair("features", "api.oauth2.consent_page:on"));
        if (externalIdentityProvider == ExternalIdentityProvider.FACEBOOK) {
            t0.put("external_access_token", str2);
        } else {
            t0.put("external_id_token", str2);
        }
        C8071s<CodeAndState> a = this.f19257a.mo30078a(t0);
        C13262m mVar = new C13262m(1);
        a.getClass();
        return new SingleFlatMap(new C19208j(a, mVar), new C8758h(this, 0));
    }
}
