package com.paypal.openid;

import android.text.TextUtils;
import androidx.compose.foundation.layout.C0761x;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p568fn.C17782b;
import p684to.C18572e;

/* renamed from: com.paypal.openid.f */
public final class C17156f {

    /* renamed from: j */
    public static final HashSet f37611j = new HashSet(Arrays.asList(new String[]{"token_type", AccessToken.ACCESS_TOKEN_KEY, AccessToken.EXPIRES_IN_KEY, "refresh_token", AuthenticationToken.AUTHENTICATION_TOKEN_KEY, "scope", "risk_visitor_id"}));

    /* renamed from: a */
    public final C17154e f37612a;

    /* renamed from: b */
    public final String f37613b;

    /* renamed from: c */
    public final String f37614c;

    /* renamed from: d */
    public final Long f37615d;

    /* renamed from: e */
    public final String f37616e;

    /* renamed from: f */
    public final String f37617f;

    /* renamed from: g */
    public final String f37618g;

    /* renamed from: h */
    public final String f37619h;

    /* renamed from: i */
    public final Map<String, String> f37620i;

    /* renamed from: com.paypal.openid.f$a */
    public static final class C17157a {

        /* renamed from: a */
        public C17154e f37621a;

        /* renamed from: b */
        public String f37622b;

        /* renamed from: c */
        public String f37623c;

        /* renamed from: d */
        public Long f37624d;

        /* renamed from: e */
        public String f37625e;

        /* renamed from: f */
        public String f37626f;

        /* renamed from: g */
        public String f37627g;

        /* renamed from: h */
        public String f37628h;

        /* renamed from: i */
        public Map<String, String> f37629i;

        public C17157a(C17154e eVar) {
            if (eVar != null) {
                this.f37621a = eVar;
                this.f37629i = Collections.emptyMap();
                return;
            }
            throw new NullPointerException("request cannot be null");
        }

        /* renamed from: a */
        public final void mo62558a(JSONObject jSONObject) {
            Long l;
            String b = C17158g.m28620b("token_type", jSONObject);
            C17782b.m29834C(b, "token type must not be empty if defined");
            this.f37622b = b;
            String c = C17158g.m28621c(AccessToken.ACCESS_TOKEN_KEY, jSONObject);
            if (c != null) {
                C17782b.m29834C(c, "access token cannot be empty if specified");
            }
            this.f37623c = c;
            if (jSONObject.has("expires_at")) {
                this.f37624d = Long.valueOf(jSONObject.getLong("expires_at"));
            }
            if (jSONObject.has(AccessToken.EXPIRES_IN_KEY)) {
                Long valueOf = Long.valueOf(jSONObject.getLong(AccessToken.EXPIRES_IN_KEY));
                if (valueOf == null) {
                    l = null;
                } else {
                    l = Long.valueOf(TimeUnit.SECONDS.toMillis(valueOf.longValue()) + System.currentTimeMillis());
                }
                this.f37624d = l;
            }
            String c2 = C17158g.m28621c("refresh_token", jSONObject);
            if (c2 != null) {
                C17782b.m29834C(c2, "refresh token must not be empty if defined");
            }
            this.f37626f = c2;
            String c3 = C17158g.m28621c(AuthenticationToken.AUTHENTICATION_TOKEN_KEY, jSONObject);
            if (c3 != null) {
                C17782b.m29834C(c3, "id token must not be empty if defined");
            }
            this.f37625e = c3;
            mo62559b(C17158g.m28621c("scope", jSONObject));
            String c4 = C17158g.m28621c("risk_visitor_id", jSONObject);
            if (c4 != null) {
                C17782b.m29834C(c4, "risk visitor id must not be empty if defined");
            }
            this.f37628h = c4;
            HashSet hashSet = C17156f.f37611j;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!hashSet.contains(next)) {
                    linkedHashMap.put(next, jSONObject.get(next).toString());
                }
            }
            this.f37629i = C18572e.m31324a(linkedHashMap, C17156f.f37611j);
        }

        /* renamed from: b */
        public final void mo62559b(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f37627g = null;
                return;
            }
            String[] split = str.split(" +");
            if (split == null) {
                split = new String[0];
            }
            this.f37627g = C0761x.m1741r0(Arrays.asList(split));
        }
    }

    public C17156f(C17154e eVar, String str, String str2, Long l, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.f37612a = eVar;
        this.f37613b = str;
        this.f37614c = str2;
        this.f37615d = l;
        this.f37616e = str3;
        this.f37617f = str4;
        this.f37618g = str5;
        this.f37619h = str6;
        this.f37620i = map;
    }
}
