package com.etsy.android.lib.network.oauth2;

import android.net.Uri;
import androidx.compose.foundation.layout.C0761x;
import com.appboy.Constants;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.util.CrashUtil;
import com.facebook.login.CustomTabLoginMethodHandler;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.ClassUtils;
import p145io.reactivex.internal.operators.single.C19198c;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p346fa.C12703a;
import p402n9.C13083c;
import p409o9.C13138q;
import p425q9.C13260k;

/* renamed from: com.etsy.android.lib.network.oauth2.e */
public final class C8752e implements C8761k {

    /* renamed from: a */
    public final C8795v f19234a;

    /* renamed from: b */
    public final C8618c f19235b;

    /* renamed from: c */
    public final C8750d f19236c;

    /* renamed from: d */
    public final C12703a f19237d;

    /* renamed from: e */
    public final C8809t f19238e;

    /* renamed from: f */
    public final C13138q f19239f;

    /* renamed from: g */
    public C8794u f19240g;

    /* renamed from: h */
    public String f19241h;

    public C8752e(C8795v vVar, C8618c cVar, C8750d dVar, C12703a aVar, C8809t tVar, C13138q qVar) {
        C19383o.m32797g(vVar, "pkceUtil");
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(dVar, "authCodeExchangeStrategy");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(tVar, "oAuth2TokenStore");
        C19383o.m32797g(qVar, "installInfo");
        this.f19234a = vVar;
        this.f19235b = cVar;
        this.f19236c = dVar;
        this.f19237d = aVar;
        this.f19238e = tVar;
        this.f19239f = qVar;
    }

    /* renamed from: a */
    public final String mo30074a(String str, boolean z) {
        this.f19234a.getClass();
        this.f19240g = C8795v.m17187a();
        String f = this.f19235b.mo21136f(C8592b.f18819p0);
        C19383o.m32796f(f, "configMap.getStringValue…gKeys.HTTP_HOST_ETSY_WEB)");
        Uri.Builder appendQueryParameter = Uri.parse(f).buildUpon().appendPath(CustomTabLoginMethodHandler.OAUTH_DIALOG).appendPath("etsyapps").appendPath("connect").appendQueryParameter("features", "api.oauth2.consent_page:on").appendQueryParameter("response_type", ResponseConstants.CODE).appendQueryParameter("client_id", C0761x.m1697V()).appendQueryParameter("redirect_uri", "etsy://oauth2").appendQueryParameter("state", "csrf_token");
        C8794u uVar = this.f19240g;
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("code_challenge", uVar != null ? uVar.f19347b : null).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("initial_state", "email-first").appendQueryParameter("scope", "address_r address_w billing_r cart_r cart_w email_r favorites_r favorites_w feedback_r listings_d listings_r listings_w profile_r profile_w recommend_r recommend_w shops_r shops_w transactions_r transactions_w").appendQueryParameter("service_name", "v2_etsyapps").appendQueryParameter("device_udid", this.f19239f.f28895a).appendQueryParameter("email", str).appendQueryParameter("initial_state", "email-first").appendQueryParameter("show_magic_link", "true");
        if (z) {
            appendQueryParameter2.appendQueryParameter("dark_mode", "true");
        }
        String uri = appendQueryParameter2.build().toString();
        C19383o.m32796f(uri, "parse(host).buildUpon()\n…)\n            .toString()");
        return uri;
    }

    /* renamed from: b */
    public final boolean mo30075b(String str) {
        C19383o.m32797g(str, "url");
        Uri parse = Uri.parse(str);
        C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return C19383o.m32792b(parse.getScheme(), "etsy") && C19383o.m32792b(parse.getHost(), "oauth2");
    }

    /* renamed from: c */
    public final C19198c mo30076c(String str) {
        String str2;
        C19383o.m32797g(str, "redirectUrl");
        Uri parse = Uri.parse(str);
        C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        if (C19383o.m32792b(parse.getScheme(), "etsy") && C19383o.m32792b(parse.getHost(), "oauth2")) {
            String queryParameter = parse.getQueryParameter(ResponseConstants.CODE);
            if (queryParameter != null) {
                this.f19241h = queryParameter;
            } else {
                CrashUtil a = CrashUtil.m17307a();
                a.mo30457b(new OAuth2AuthenticationException("Authorization code was null for redirect url " + str + ClassUtils.PACKAGE_SEPARATOR_CHAR, (Throwable) null, 2, (DefaultConstructorMarker) null));
                this.f19237d.mo45474a("oauth2_android_error.auth_code_not_found_in_redirect");
            }
        }
        String str3 = this.f19241h;
        if (str3 != null) {
            C8794u uVar = this.f19240g;
            if (uVar == null || (str2 = uVar.f19346a) == null) {
                throw new OAuth2AuthenticationException("No PKCE verifier available. Did you call getAuthorizationRequestUrl() first?.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            }
            C8071s<OAuth2AccessTokenPayload> a2 = this.f19236c.mo30073a(str3, str2);
            C13260k kVar = new C13260k(1);
            a2.getClass();
            return new C19198c(new C19208j(a2, kVar), new C13083c(this, 1));
        }
        throw new OAuth2AuthenticationException("No authorization code available. Did you call retrieveAuthorizationCode(redirectUrl) first?", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
