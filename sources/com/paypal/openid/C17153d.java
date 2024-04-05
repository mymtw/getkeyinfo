package com.paypal.openid;

import android.net.Uri;
import android.support.p013v4.media.C0072d;
import com.paypal.openid.AuthorizationServiceDiscovery;
import org.json.JSONException;
import org.json.JSONObject;
import p568fn.C17782b;

/* renamed from: com.paypal.openid.d */
public final class C17153d {

    /* renamed from: a */
    public final Uri f37582a;

    /* renamed from: b */
    public final Uri f37583b;

    /* renamed from: c */
    public final Uri f37584c;

    /* renamed from: d */
    public final AuthorizationServiceDiscovery f37585d;

    public C17153d(Uri uri, Uri uri2, Uri uri3) {
        uri.getClass();
        this.f37582a = uri;
        uri2.getClass();
        this.f37583b = uri2;
        this.f37584c = uri3;
        this.f37585d = null;
    }

    /* renamed from: a */
    public static C17153d m28612a(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new NullPointerException("json object cannot be null");
        } else if (jSONObject.has("discoveryDoc")) {
            try {
                return new C17153d(new AuthorizationServiceDiscovery(jSONObject.optJSONObject("discoveryDoc")));
            } catch (AuthorizationServiceDiscovery.MissingArgumentException e) {
                StringBuilder h = C0072d.m201h("Missing required field in discovery doc: ");
                h.append(e.getMissingField());
                throw new JSONException(h.toString());
            }
        } else {
            C17782b.m29832B(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
            C17782b.m29832B(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
            return new C17153d(C17158g.m28624f("authorizationEndpoint", jSONObject), C17158g.m28624f("tokenEndpoint", jSONObject), C17158g.m28625g("registrationEndpoint", jSONObject));
        }
    }

    /* renamed from: b */
    public final JSONObject mo62555b() {
        JSONObject jSONObject = new JSONObject();
        C17158g.m28628j("authorizationEndpoint", this.f37582a.toString(), jSONObject);
        C17158g.m28628j("tokenEndpoint", this.f37583b.toString(), jSONObject);
        Uri uri = this.f37584c;
        if (uri != null) {
            C17158g.m28628j("registrationEndpoint", uri.toString(), jSONObject);
        }
        AuthorizationServiceDiscovery authorizationServiceDiscovery = this.f37585d;
        if (authorizationServiceDiscovery != null) {
            C17158g.m28630l(jSONObject, "discoveryDoc", authorizationServiceDiscovery.f37542a);
        }
        return jSONObject;
    }

    public C17153d(AuthorizationServiceDiscovery authorizationServiceDiscovery) {
        this.f37585d = authorizationServiceDiscovery;
        this.f37582a = (Uri) authorizationServiceDiscovery.mo62544a(AuthorizationServiceDiscovery.f37538b);
        this.f37583b = (Uri) authorizationServiceDiscovery.mo62544a(AuthorizationServiceDiscovery.f37539c);
        this.f37584c = (Uri) authorizationServiceDiscovery.mo62544a(AuthorizationServiceDiscovery.f37540d);
    }
}
