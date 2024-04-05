package p684to;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.QueryReformulation;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.openid.C17153d;
import com.paypal.openid.C17158g;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p568fn.C17782b;
import p708wo.C18756b;

/* renamed from: to.b */
public final class C18569b {

    /* renamed from: p */
    public static final Set<String> f40874p = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"client_id", "code_challenge", "code_challenge_method", QueryReformulation.DISPLAY, "login_hint", ResponseConstants.PROMPT, "redirect_uri", "response_mode", "response_type", "scope", "state"})));

    /* renamed from: a */
    public final C17153d f40875a;

    /* renamed from: b */
    public final String f40876b;

    /* renamed from: c */
    public final String f40877c;

    /* renamed from: d */
    public final String f40878d;

    /* renamed from: e */
    public final String f40879e;

    /* renamed from: f */
    public final String f40880f;

    /* renamed from: g */
    public final String f40881g;

    /* renamed from: h */
    public final Uri f40882h;

    /* renamed from: i */
    public final String f40883i;

    /* renamed from: j */
    public final String f40884j;

    /* renamed from: k */
    public final String f40885k;

    /* renamed from: l */
    public final String f40886l;

    /* renamed from: m */
    public final String f40887m;

    /* renamed from: n */
    public final String f40888n;

    /* renamed from: o */
    public final Map<String, String> f40889o;

    public C18569b() {
        throw null;
    }

    public C18569b(C17153d dVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map map) {
        this.f40875a = dVar;
        this.f40877c = str;
        this.f40881g = str2;
        this.f40882h = uri;
        this.f40876b = str3;
        this.f40889o = map;
        this.f40878d = str4;
        this.f40879e = str5;
        this.f40880f = str6;
        this.f40883i = str7;
        this.f40884j = str8;
        this.f40885k = str9;
        this.f40886l = str10;
        this.f40887m = str11;
        this.f40888n = str12;
    }

    /* renamed from: a */
    public static C18569b m31320a(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null) {
            C17153d a = C17153d.m28612a(jSONObject2.getJSONObject("configuration"));
            String b = C17158g.m28620b("clientId", jSONObject2);
            String b2 = C17158g.m28620b("responseType", jSONObject2);
            Uri f = C17158g.m28624f("redirectUri", jSONObject2);
            String c = C17158g.m28621c("nonce", jSONObject2);
            new HashMap();
            C17782b.m29834C(b, "client ID cannot be null or empty");
            C17782b.m29834C(b2, "expected response type cannot be null or empty");
            if (f != null) {
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                String encodeToString = Base64.encodeToString(bArr, 11);
                if (encodeToString != null) {
                    C17782b.m29834C(encodeToString, "state cannot be empty if defined");
                }
                String c2 = C17158g.m28621c(QueryReformulation.DISPLAY, jSONObject2);
                if (c2 != null) {
                    C17782b.m29834C(c2, "display must be null or not empty");
                }
                String c3 = C17158g.m28621c("login_hint", jSONObject2);
                if (c3 != null) {
                    C17782b.m29834C(c3, "login hint must be null or not empty");
                }
                String c4 = C17158g.m28621c(ResponseConstants.PROMPT, jSONObject2);
                if (c4 != null) {
                    C17782b.m29834C(c4, "prompt must be null or non-empty");
                }
                String c5 = C17158g.m28621c("state", jSONObject2);
                if (c5 != null) {
                    C17782b.m29834C(c5, "state cannot be empty if defined");
                }
                String c6 = C17158g.m28621c(ConstantsKt.CODE_VERIFIER, jSONObject2);
                if (c6 != null) {
                    C18570c.m31323a(c6);
                    str = c6;
                } else {
                    str = null;
                }
                String c7 = C17158g.m28621c("codeVerifierChallenge", jSONObject2);
                String c8 = C17158g.m28621c("codeVerifierChallengeMethod", jSONObject2);
                String c9 = C17158g.m28621c("responseMode", jSONObject2);
                C17782b.m29842H("responseMode must not be empty", c9);
                Map a2 = C18572e.m31324a(C17158g.m28623e("additionalParameters", jSONObject2), f40874p);
                if (jSONObject2.has("scope")) {
                    List asList = Arrays.asList(TextUtils.split(C17158g.m28620b("scope", jSONObject2), " "));
                    str2 = c9;
                    LinkedHashSet linkedHashSet = new LinkedHashSet(asList.size());
                    linkedHashSet.addAll(asList);
                    str3 = C0761x.m1741r0(linkedHashSet);
                } else {
                    str2 = c9;
                    str3 = null;
                }
                return new C18569b(a, b, b2, f, c, c2, c3, c4, str3, c5, str, c7, c8, str2, Collections.unmodifiableMap(new HashMap(a2)));
            }
            throw new NullPointerException("redirect URI cannot be null or empty");
        }
        throw new NullPointerException("json cannot be null");
    }

    /* renamed from: b */
    public final JSONObject mo70073b() {
        JSONObject jSONObject = new JSONObject();
        C17158g.m28630l(jSONObject, "configuration", this.f40875a.mo62555b());
        C17158g.m28628j("clientId", this.f40877c, jSONObject);
        C17158g.m28628j("responseType", this.f40881g, jSONObject);
        C17158g.m28628j("redirectUri", this.f40882h.toString(), jSONObject);
        C17158g.m28628j("nonce", this.f40876b, jSONObject);
        C17158g.m28632n(QueryReformulation.DISPLAY, this.f40878d, jSONObject);
        C17158g.m28632n("login_hint", this.f40879e, jSONObject);
        C17158g.m28632n("scope", this.f40883i, jSONObject);
        C17158g.m28632n(ResponseConstants.PROMPT, this.f40880f, jSONObject);
        C17158g.m28632n("state", this.f40884j, jSONObject);
        C17158g.m28632n(ConstantsKt.CODE_VERIFIER, this.f40885k, jSONObject);
        C17158g.m28632n("codeVerifierChallenge", this.f40886l, jSONObject);
        C17158g.m28632n("codeVerifierChallengeMethod", this.f40887m, jSONObject);
        C17158g.m28632n("responseMode", this.f40888n, jSONObject);
        C17158g.m28630l(jSONObject, "additionalParameters", C17158g.m28626h(this.f40889o));
        return jSONObject;
    }

    /* renamed from: c */
    public final Uri mo70074c() {
        Uri.Builder appendQueryParameter = this.f40875a.f37582a.buildUpon().appendQueryParameter("redirect_uri", this.f40882h.toString()).appendQueryParameter("client_id", this.f40877c).appendQueryParameter("response_type", this.f40881g);
        C18756b.m31633a(appendQueryParameter, QueryReformulation.DISPLAY, this.f40878d);
        C18756b.m31633a(appendQueryParameter, "login_hint", this.f40879e);
        C18756b.m31633a(appendQueryParameter, ResponseConstants.PROMPT, this.f40880f);
        C18756b.m31633a(appendQueryParameter, "state", this.f40884j);
        C18756b.m31633a(appendQueryParameter, "scope", this.f40883i);
        C18756b.m31633a(appendQueryParameter, "response_mode", this.f40888n);
        if (this.f40885k != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", this.f40886l).appendQueryParameter("code_challenge_method", this.f40887m);
        }
        for (Map.Entry next : this.f40889o.entrySet()) {
            appendQueryParameter.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return appendQueryParameter.build();
    }
}
