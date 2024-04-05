package com.paypal.openid;

import android.net.Uri;
import androidx.appcompat.widget.C0326j;
import com.paypal.openid.C17158g;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class AuthorizationServiceDiscovery {

    /* renamed from: b */
    public static final C17158g.C17160b f37538b = new C17158g.C17160b("authorization_endpoint");

    /* renamed from: c */
    public static final C17158g.C17160b f37539c = new C17158g.C17160b("token_endpoint");

    /* renamed from: d */
    public static final C17158g.C17160b f37540d = new C17158g.C17160b("registration_endpoint");

    /* renamed from: e */
    public static final List<String> f37541e = Arrays.asList(new String[]{"issuer", "authorization_endpoint", "jwks_uri", "response_types_supported", "subject_types_supported", "id_token_signing_alg_values_supported"});

    /* renamed from: a */
    public final JSONObject f37542a;

    public static class MissingArgumentException extends Exception {

        /* renamed from: a */
        private String f37543a;

        public MissingArgumentException(String str) {
            super(C0326j.m864i("Missing mandatory configuration field: ", str));
            this.f37543a = str;
        }

        public String getMissingField() {
            return this.f37543a;
        }
    }

    static {
        Arrays.asList(new String[]{"authorization_code", "implicit"});
        Collections.singletonList("client_secret_basic");
        Collections.singletonList("normal");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthorizationServiceDiscovery(org.json.JSONObject r3) {
        /*
            r2 = this;
            r2.<init>()
            r3.getClass()
            r2.f37542a = r3
            java.util.List<java.lang.String> r3 = f37541e
            java.util.Iterator r3 = r3.iterator()
        L_0x000e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r1 = r2.f37542a
            boolean r1 = r1.has(r0)
            if (r1 == 0) goto L_0x002b
            org.json.JSONObject r1 = r2.f37542a
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x002b
            goto L_0x000e
        L_0x002b:
            com.paypal.openid.AuthorizationServiceDiscovery$MissingArgumentException r3 = new com.paypal.openid.AuthorizationServiceDiscovery$MissingArgumentException
            r3.<init>(r0)
            throw r3
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.openid.AuthorizationServiceDiscovery.<init>(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final Object mo62544a(C17158g.C17160b bVar) {
        JSONObject jSONObject = this.f37542a;
        try {
            return !jSONObject.has(bVar.f37630a) ? bVar.f37631b : Uri.parse(jSONObject.getString(bVar.f37630a));
        } catch (JSONException e) {
            throw new IllegalStateException("unexpected JSONException", e);
        }
    }
}
