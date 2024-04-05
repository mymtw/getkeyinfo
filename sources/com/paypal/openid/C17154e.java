package com.paypal.openid;

import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p568fn.C17782b;

/* renamed from: com.paypal.openid.e */
public final class C17154e {

    /* renamed from: m */
    public static final Set<String> f37586m = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"client_id", ResponseConstants.CODE, "code_verifier", "codeVerifierChallenge", "codeVerifierChallengeMethod", "nonce", "grant_type", "redirect_uri", "refresh_token", "scope"})));

    /* renamed from: a */
    public final C17153d f37587a;

    /* renamed from: b */
    public final String f37588b;

    /* renamed from: c */
    public final String f37589c;

    /* renamed from: d */
    public final Uri f37590d;

    /* renamed from: e */
    public final String f37591e;

    /* renamed from: f */
    public final String f37592f;

    /* renamed from: g */
    public final String f37593g;

    /* renamed from: h */
    public final String f37594h;

    /* renamed from: i */
    public final String f37595i;

    /* renamed from: j */
    public final String f37596j;

    /* renamed from: k */
    public final String f37597k;

    /* renamed from: l */
    public final Map<String, String> f37598l;

    /* renamed from: com.paypal.openid.e$a */
    public static final class C17155a {

        /* renamed from: a */
        public C17153d f37599a;

        /* renamed from: b */
        public String f37600b;

        /* renamed from: c */
        public String f37601c;

        /* renamed from: d */
        public Uri f37602d;

        /* renamed from: e */
        public String f37603e;

        /* renamed from: f */
        public String f37604f;

        /* renamed from: g */
        public String f37605g;

        /* renamed from: h */
        public String f37606h;

        /* renamed from: i */
        public String f37607i;

        /* renamed from: j */
        public String f37608j;

        /* renamed from: k */
        public Map<String, String> f37609k = new LinkedHashMap();

        /* renamed from: l */
        public String f37610l;

        public C17155a(C17153d dVar, String str) {
            dVar.getClass();
            this.f37599a = dVar;
            C17782b.m29834C(str, "clientId cannot be null or empty");
            this.f37600b = str;
        }

        /* renamed from: a */
        public final C17154e mo62557a() {
            String str;
            String str2 = this.f37601c;
            if (str2 != null) {
                str = str2;
            } else if (this.f37604f != null) {
                str = "authorization_code";
            } else if (this.f37605g != null) {
                str = "refresh_token";
            } else {
                throw new IllegalStateException("grant type not specified and cannot be inferred");
            }
            if ("authorization_code".equals(str)) {
                C17782b.m29840F(this.f37604f, "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(str)) {
                C17782b.m29840F(this.f37605g, "refresh token must be specified for grant_type = refresh_token");
            }
            if (!str.equals("authorization_code") || this.f37602d != null) {
                StringBuilder h = C0072d.m201h(" Client ID: ");
                C0391c.m1061h(h, this.f37600b, " \n Grant Type ", str, " \n Redirect URI ");
                h.append(this.f37602d);
                h.append(" \n Scope ");
                h.append(this.f37603e);
                h.append(" \n Authorization Code ");
                h.append(this.f37604f);
                h.append(" \n Refresh Token ");
                h.append(this.f37605g);
                h.append(" \n Code Verifier ");
                h.append(this.f37606h);
                h.append(" \n Code Verifier Challenge ");
                h.append(this.f37607i);
                h.append(" \n Code Verifier Challenge Method ");
                h.append(this.f37608j);
                h.append(" \n Nonce : ");
                h.append(this.f37610l);
                Log.d("Authenticator", h.toString());
                return new C17154e(this.f37599a, this.f37600b, str, this.f37602d, this.f37603e, this.f37604f, this.f37605g, this.f37606h, this.f37607i, this.f37608j, this.f37610l, Collections.unmodifiableMap(this.f37609k));
            }
            throw new IllegalStateException("no redirect URI specified on token request for code exchange");
        }
    }

    public C17154e(C17153d dVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        this.f37587a = dVar;
        this.f37588b = str;
        this.f37589c = str2;
        this.f37590d = uri;
        this.f37592f = str3;
        this.f37591e = str4;
        this.f37593g = str5;
        this.f37594h = str6;
        this.f37595i = str7;
        this.f37596j = str8;
        this.f37598l = map;
        this.f37597k = str9;
    }

    /* renamed from: a */
    public static void m28614a(Comparable comparable, String str, HashMap hashMap) {
        if (comparable != null) {
            hashMap.put(str, comparable.toString());
        }
    }

    /* renamed from: b */
    public final HashMap mo62556b() {
        HashMap hashMap = new HashMap();
        hashMap.put("grant_type", this.f37589c);
        m28614a(this.f37590d, "redirect_uri", hashMap);
        m28614a(this.f37591e, ResponseConstants.CODE, hashMap);
        m28614a(this.f37593g, "refresh_token", hashMap);
        m28614a(this.f37594h, "code_verifier", hashMap);
        m28614a(this.f37595i, "codeVerifierChallenge", hashMap);
        m28614a(this.f37596j, "codeVerifierChallengeMethod", hashMap);
        m28614a(this.f37592f, "scope", hashMap);
        m28614a(this.f37597k, "nonce", hashMap);
        for (Map.Entry next : this.f37598l.entrySet()) {
            hashMap.put((String) next.getKey(), (String) next.getValue());
        }
        return hashMap;
    }
}
