package com.paypal.openid;

import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.login.LoginFragment;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p684to.C18569b;

/* renamed from: com.paypal.openid.b */
public final class C17149b {

    /* renamed from: j */
    public static final Set<String> f37563j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"token_type", "state", ResponseConstants.CODE, AccessToken.ACCESS_TOKEN_KEY, AccessToken.EXPIRES_IN_KEY, AuthenticationToken.AUTHENTICATION_TOKEN_KEY, "scope"})));

    /* renamed from: a */
    public final C18569b f37564a;

    /* renamed from: b */
    public final String f37565b;

    /* renamed from: c */
    public final String f37566c;

    /* renamed from: d */
    public final String f37567d;

    /* renamed from: e */
    public final String f37568e;

    /* renamed from: f */
    public final Long f37569f;

    /* renamed from: g */
    public final String f37570g;

    /* renamed from: h */
    public final String f37571h;

    /* renamed from: i */
    public final Map<String, String> f37572i;

    public C17149b(C18569b bVar, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map map) {
        this.f37564a = bVar;
        this.f37565b = str;
        this.f37566c = str2;
        this.f37567d = str3;
        this.f37568e = str4;
        this.f37569f = l;
        this.f37570g = str5;
        this.f37571h = str6;
        this.f37572i = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0050, code lost:
        r0 = r0.split(" +");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.paypal.openid.C17149b m28607a(org.json.JSONObject r11) {
        /*
            java.lang.String r0 = "request"
            boolean r1 = r11.has(r0)
            if (r1 == 0) goto L_0x008a
            org.json.JSONObject r0 = r11.getJSONObject(r0)
            to.b r2 = p684to.C18569b.m31320a(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r0 = "token_type"
            java.lang.String r4 = com.paypal.openid.C17158g.m28621c(r0, r11)
            java.lang.String r0 = "tokenType must not be empty"
            p568fn.C17782b.m29842H(r0, r4)
            java.lang.String r0 = "access_token"
            java.lang.String r6 = com.paypal.openid.C17158g.m28621c(r0, r11)
            java.lang.String r0 = "accessToken must not be empty"
            p568fn.C17782b.m29842H(r0, r6)
            java.lang.String r0 = "code"
            java.lang.String r5 = com.paypal.openid.C17158g.m28621c(r0, r11)
            java.lang.String r0 = "authorizationCode must not be empty"
            p568fn.C17782b.m29842H(r0, r5)
            java.lang.String r0 = "id_token"
            java.lang.String r8 = com.paypal.openid.C17158g.m28621c(r0, r11)
            java.lang.String r0 = "idToken cannot be empty"
            p568fn.C17782b.m29842H(r0, r8)
            java.lang.String r0 = "scope"
            java.lang.String r0 = com.paypal.openid.C17158g.m28621c(r0, r11)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r1 == 0) goto L_0x0050
        L_0x004e:
            r9 = r3
            goto L_0x0062
        L_0x0050:
            java.lang.String r1 = " +"
            java.lang.String[] r0 = r0.split(r1)
            if (r0 != 0) goto L_0x0059
            goto L_0x004e
        L_0x0059:
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1741r0(r0)
            r9 = r0
        L_0x0062:
            java.lang.String r0 = "state"
            java.lang.String r3 = com.paypal.openid.C17158g.m28621c(r0, r11)
            java.lang.String r0 = "state must not be empty"
            p568fn.C17782b.m29842H(r0, r3)
            java.lang.String r0 = "expires_at"
            java.lang.Long r7 = com.paypal.openid.C17158g.m28619a(r0, r11)
            java.lang.String r0 = "additional_parameters"
            java.util.LinkedHashMap r11 = com.paypal.openid.C17158g.m28623e(r0, r11)
            java.util.Set<java.lang.String> r0 = f37563j
            java.util.Map r11 = p684to.C18572e.m31324a(r11, r0)
            com.paypal.openid.b r0 = new com.paypal.openid.b
            java.util.Map r10 = java.util.Collections.unmodifiableMap(r11)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x008a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "authorization request not provided and not found in JSON"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.openid.C17149b.m28607a(org.json.JSONObject):com.paypal.openid.b");
    }

    /* renamed from: b */
    public final JSONObject mo62551b() {
        JSONObject jSONObject = new JSONObject();
        C17158g.m28630l(jSONObject, LoginFragment.EXTRA_REQUEST, this.f37564a.mo70073b());
        C17158g.m28632n("state", this.f37565b, jSONObject);
        C17158g.m28632n("token_type", this.f37566c, jSONObject);
        C17158g.m28632n(ResponseConstants.CODE, this.f37567d, jSONObject);
        C17158g.m28632n(AccessToken.ACCESS_TOKEN_KEY, this.f37568e, jSONObject);
        C17158g.m28631m(this.f37569f, "expires_at", jSONObject);
        C17158g.m28632n(AuthenticationToken.AUTHENTICATION_TOKEN_KEY, this.f37570g, jSONObject);
        C17158g.m28632n("scope", this.f37571h, jSONObject);
        C17158g.m28630l(jSONObject, "additional_parameters", C17158g.m28626h(this.f37572i));
        return jSONObject;
    }
}
