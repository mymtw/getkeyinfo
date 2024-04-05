package com.paypal.openid;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.foundation.layout.C0761x;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.login.LoginFragment;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.openid.C17154e;
import com.paypal.openid.ClientAuthentication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p568fn.C17782b;
import p684to.C18571d;
import p684to.C18572e;

/* renamed from: com.paypal.openid.a */
public final class C17148a {

    /* renamed from: a */
    public String f37556a;

    /* renamed from: b */
    public String f37557b;

    /* renamed from: c */
    public C17153d f37558c;

    /* renamed from: d */
    public C17149b f37559d;

    /* renamed from: e */
    public C17156f f37560e;

    /* renamed from: f */
    public RegistrationResponse f37561f;

    /* renamed from: g */
    public AuthorizationException f37562g;

    public C17148a() {
    }

    public C17148a(C17153d dVar) {
        this.f37558c = dVar;
    }

    /* renamed from: b */
    public static C17148a m28604b(String str) {
        String r0;
        String str2 = str;
        C17782b.m29834C(str2, "jsonStr cannot be null or empty");
        JSONObject jSONObject = new JSONObject(str2);
        C17148a aVar = new C17148a();
        aVar.f37556a = C17158g.m28621c("refreshToken", jSONObject);
        aVar.f37557b = C17158g.m28621c("scope", jSONObject);
        if (jSONObject.has("config")) {
            aVar.f37558c = C17153d.m28612a(jSONObject.getJSONObject("config"));
        }
        if (jSONObject.has("mAuthorizationException")) {
            aVar.f37562g = AuthorizationException.fromJson(jSONObject.getJSONObject("mAuthorizationException"));
        }
        if (jSONObject.has("lastAuthorizationResponse")) {
            aVar.f37559d = C17149b.m28607a(jSONObject.getJSONObject("lastAuthorizationResponse"));
        }
        if (jSONObject.has("mLastTokenResponse")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("mLastTokenResponse");
            HashSet hashSet = C17156f.f37611j;
            if (jSONObject2.has(LoginFragment.EXTRA_REQUEST)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(LoginFragment.EXTRA_REQUEST);
                Set<String> set = C17154e.f37586m;
                C17782b.m29840F(jSONObject3, "json object cannot be null");
                C17154e.C17155a aVar2 = new C17154e.C17155a(C17153d.m28612a(jSONObject3.getJSONObject("configuration")), C17158g.m28620b("clientId", jSONObject3));
                Uri g = C17158g.m28625g("redirectUri", jSONObject3);
                if (g != null) {
                    C17782b.m29840F(g.getScheme(), "redirectUri must have a scheme");
                }
                aVar2.f37602d = g;
                String b = C17158g.m28620b(ConstantsKt.GRANT_TYPE, jSONObject3);
                C17782b.m29834C(b, "grantType cannot be null or empty");
                aVar2.f37601c = b;
                String c = C17158g.m28621c("refreshToken", jSONObject3);
                if (c != null) {
                    C17782b.m29834C(c, "refresh token cannot be empty if defined");
                }
                aVar2.f37605g = c;
                String c2 = C17158g.m28621c("authorizationCode", jSONObject3);
                C17782b.m29842H("authorization code must not be empty", c2);
                aVar2.f37604f = c2;
                aVar2.f37609k = C18572e.m31324a(C17158g.m28623e("additionalParameters", jSONObject3), C17154e.f37586m);
                if (jSONObject3.has("scope")) {
                    List asList = Arrays.asList(TextUtils.split(C17158g.m28620b("scope", jSONObject3), " "));
                    LinkedHashSet linkedHashSet = new LinkedHashSet(asList.size());
                    linkedHashSet.addAll(asList);
                    aVar2.f37603e = C0761x.m1741r0(linkedHashSet);
                }
                C17154e a = aVar2.mo62557a();
                Collections.emptyMap();
                String c3 = C17158g.m28621c("token_type", jSONObject2);
                if (c3 != null) {
                    C17782b.m29834C(c3, "token type must not be empty if defined");
                }
                String c4 = C17158g.m28621c(AccessToken.ACCESS_TOKEN_KEY, jSONObject2);
                if (c4 != null) {
                    C17782b.m29834C(c4, "access token cannot be empty if specified");
                }
                Long a2 = C17158g.m28619a("expires_at", jSONObject2);
                String c5 = C17158g.m28621c(AuthenticationToken.AUTHENTICATION_TOKEN_KEY, jSONObject2);
                if (c5 != null) {
                    C17782b.m29834C(c5, "id token must not be empty if defined");
                }
                String c6 = C17158g.m28621c("refresh_token", jSONObject2);
                if (c6 != null) {
                    C17782b.m29834C(c6, "refresh token must not be empty if defined");
                }
                String c7 = C17158g.m28621c("scope", jSONObject2);
                if (TextUtils.isEmpty(c7)) {
                    r0 = null;
                } else {
                    String[] split = c7.split(" +");
                    if (split == null) {
                        split = new String[0];
                    }
                    r0 = C0761x.m1741r0(Arrays.asList(split));
                }
                String str3 = r0;
                String c8 = C17158g.m28621c("risk_visitor_id", jSONObject2);
                if (c8 != null) {
                    C17782b.m29834C(c8, "risk visitor id must not be empty if defined");
                }
                aVar.f37560e = new C17156f(a, c3, c4, a2, c5, c6, str3, c8, C18572e.m31324a(C17158g.m28623e("additionalParameters", jSONObject2), C17156f.f37611j));
            } else {
                throw new IllegalArgumentException("token request not provided and not found in JSON");
            }
        }
        if (jSONObject.has("lastRegistrationResponse")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("lastRegistrationResponse");
            HashSet hashSet2 = RegistrationResponse.f37545j;
            C17782b.m29840F(jSONObject4, "json cannot be null");
            if (jSONObject4.has(LoginFragment.EXTRA_REQUEST)) {
                JSONObject jSONObject5 = jSONObject4.getJSONObject(LoginFragment.EXTRA_REQUEST);
                Set<String> set2 = C18571d.f40891i;
                C17782b.m29840F(jSONObject5, "json must not be null");
                if (jSONObject5.has("redirect_uris")) {
                    JSONArray jSONArray = jSONObject5.getJSONArray("redirect_uris");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            Object obj = jSONArray.get(i);
                            obj.getClass();
                            arrayList.add(Uri.parse(obj.toString()));
                        }
                    }
                    C17153d a3 = C17153d.m28612a(jSONObject5.getJSONObject("configuration"));
                    new ArrayList();
                    Collections.emptyMap();
                    C17782b.m29832B(!arrayList.isEmpty(), "redirectUriValues cannot be null");
                    String c9 = C17158g.m28621c("subject_type", jSONObject5);
                    List d = C17158g.m28622d("response_types", jSONObject5);
                    List d2 = C17158g.m28622d("grant_types", jSONObject5);
                    Map a4 = C18572e.m31324a(C17158g.m28623e("additionalParameters", jSONObject5), C18571d.f40891i);
                    List unmodifiableList = Collections.unmodifiableList(arrayList);
                    if (d != null) {
                        d = Collections.unmodifiableList(d);
                    }
                    C18571d dVar = new C18571d(a3, unmodifiableList, d, d2 == null ? d2 : Collections.unmodifiableList(d2), c9, Collections.unmodifiableMap(a4));
                    Collections.emptyMap();
                    String b2 = C17158g.m28620b("client_id", jSONObject4);
                    C17782b.m29834C(b2, "client ID cannot be null or empty");
                    aVar.f37561f = new RegistrationResponse(dVar, b2, C17158g.m28619a("client_id_issued_at", jSONObject4), C17158g.m28621c("client_secret", jSONObject4), C17158g.m28619a("client_secret_expires_at", jSONObject4), C17158g.m28621c("registration_access_token", jSONObject4), C17158g.m28625g("registration_client_uri", jSONObject4), C17158g.m28621c("token_endpoint_auth_method", jSONObject4), C18572e.m31324a(C17158g.m28623e("additionalParameters", jSONObject4), RegistrationResponse.f37545j));
                } else {
                    throw new JSONException("field \"redirect_uris\" not found in json object");
                }
            } else {
                throw new IllegalArgumentException("registration request not found in JSON");
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo62549a() {
        RegistrationResponse registrationResponse = this.f37561f;
        String str = null;
        if ((registrationResponse != null ? registrationResponse.f37549d : null) != null) {
            String str2 = registrationResponse.f37553h;
            if (str2 == null) {
                if (registrationResponse != null) {
                    str = registrationResponse.f37549d;
                }
                if (str == null) {
                    throw new NullPointerException("mClientSecret cannot be null");
                }
                return;
            }
            char c = 65535;
            switch (str2.hashCode()) {
                case -2034587045:
                    if (str2.equals("client_secret_post")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3387192:
                    if (str2.equals("none")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1338964435:
                    if (str2.equals("client_secret_basic")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (registrationResponse != null) {
                        str = registrationResponse.f37549d;
                    }
                    if (str == null) {
                        throw new NullPointerException("clientSecret cannot be null");
                    }
                    return;
                case 1:
                    return;
                case 2:
                    if (registrationResponse != null) {
                        str = registrationResponse.f37549d;
                    }
                    if (str == null) {
                        throw new NullPointerException("mClientSecret cannot be null");
                    }
                    return;
                default:
                    throw new ClientAuthentication.UnsupportedAuthenticationMethod(this.f37561f.f37553h);
            }
        }
    }

    /* renamed from: c */
    public final String mo62550c() {
        JSONObject jSONObject = new JSONObject();
        C17158g.m28632n("refreshToken", this.f37556a, jSONObject);
        C17158g.m28632n("scope", this.f37557b, jSONObject);
        C17153d dVar = this.f37558c;
        if (dVar != null) {
            C17158g.m28630l(jSONObject, "config", dVar.mo62555b());
        }
        AuthorizationException authorizationException = this.f37562g;
        if (authorizationException != null) {
            C17158g.m28630l(jSONObject, "mAuthorizationException", authorizationException.toJson());
        }
        C17149b bVar = this.f37559d;
        if (bVar != null) {
            C17158g.m28630l(jSONObject, "lastAuthorizationResponse", bVar.mo62551b());
        }
        C17156f fVar = this.f37560e;
        if (fVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            C17154e eVar = fVar.f37612a;
            eVar.getClass();
            JSONObject jSONObject3 = new JSONObject();
            C17158g.m28630l(jSONObject3, "configuration", eVar.f37587a.mo62555b());
            C17158g.m28628j("clientId", eVar.f37588b, jSONObject3);
            C17158g.m28628j(ConstantsKt.GRANT_TYPE, eVar.f37589c, jSONObject3);
            C17158g.m28633o(jSONObject3, "redirectUri", eVar.f37590d);
            C17158g.m28632n("scope", eVar.f37592f, jSONObject3);
            C17158g.m28632n("authorizationCode", eVar.f37591e, jSONObject3);
            C17158g.m28632n("refreshToken", eVar.f37593g, jSONObject3);
            C17158g.m28630l(jSONObject3, "additionalParameters", C17158g.m28626h(eVar.f37598l));
            C17158g.m28630l(jSONObject2, LoginFragment.EXTRA_REQUEST, jSONObject3);
            C17158g.m28632n("token_type", fVar.f37613b, jSONObject2);
            C17158g.m28632n(AccessToken.ACCESS_TOKEN_KEY, fVar.f37614c, jSONObject2);
            C17158g.m28631m(fVar.f37615d, "expires_at", jSONObject2);
            C17158g.m28632n(AuthenticationToken.AUTHENTICATION_TOKEN_KEY, fVar.f37616e, jSONObject2);
            C17158g.m28632n("refresh_token", fVar.f37617f, jSONObject2);
            C17158g.m28632n("scope", fVar.f37618g, jSONObject2);
            C17158g.m28632n("risk_visitor_id", fVar.f37619h, jSONObject2);
            C17158g.m28630l(jSONObject2, "additionalParameters", C17158g.m28626h(fVar.f37620i));
            C17158g.m28630l(jSONObject, "mLastTokenResponse", jSONObject2);
        }
        RegistrationResponse registrationResponse = this.f37561f;
        if (registrationResponse != null) {
            JSONObject jSONObject4 = new JSONObject();
            C18571d dVar2 = registrationResponse.f37546a;
            dVar2.getClass();
            JSONObject jSONObject5 = new JSONObject();
            C17158g.m28629k(jSONObject5, "redirect_uris", C17158g.m28634p(dVar2.f40893b));
            C17158g.m28628j("application_type", dVar2.f40894c, jSONObject5);
            List<String> list = dVar2.f40895d;
            if (list != null) {
                C17158g.m28629k(jSONObject5, "response_types", C17158g.m28634p(list));
            }
            List<String> list2 = dVar2.f40896e;
            if (list2 != null) {
                C17158g.m28629k(jSONObject5, "grant_types", C17158g.m28634p(list2));
            }
            C17158g.m28632n("subject_type", dVar2.f40897f, jSONObject5);
            C17158g.m28632n("token_endpoint_auth_method", dVar2.f40898g, jSONObject5);
            C17158g.m28630l(jSONObject5, "configuration", dVar2.f40892a.mo62555b());
            C17158g.m28630l(jSONObject5, "additionalParameters", C17158g.m28626h(dVar2.f40899h));
            C17158g.m28630l(jSONObject4, LoginFragment.EXTRA_REQUEST, jSONObject5);
            C17158g.m28628j("client_id", registrationResponse.f37547b, jSONObject4);
            C17158g.m28631m(registrationResponse.f37548c, "client_id_issued_at", jSONObject4);
            C17158g.m28632n("client_secret", registrationResponse.f37549d, jSONObject4);
            C17158g.m28631m(registrationResponse.f37550e, "client_secret_expires_at", jSONObject4);
            C17158g.m28632n("registration_access_token", registrationResponse.f37551f, jSONObject4);
            C17158g.m28633o(jSONObject4, "registration_client_uri", registrationResponse.f37552g);
            C17158g.m28632n("token_endpoint_auth_method", registrationResponse.f37553h, jSONObject4);
            C17158g.m28630l(jSONObject4, "additionalParameters", C17158g.m28626h(registrationResponse.f37554i));
            C17158g.m28630l(jSONObject, "lastRegistrationResponse", jSONObject4);
        }
        return jSONObject.toString();
    }
}
