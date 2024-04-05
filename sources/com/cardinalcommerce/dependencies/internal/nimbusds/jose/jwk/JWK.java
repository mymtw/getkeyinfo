package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import p118g8.C6895b;
import p305z7.C8458a;

public abstract class JWK implements C8458a, Serializable {

    /* renamed from: a */
    private final C6247d f13684a;

    /* renamed from: b */
    private final C6248e f13685b;

    /* renamed from: c */
    private final Set<C6246c> f13686c;

    /* renamed from: d */
    private final C6236a f13687d;

    /* renamed from: e */
    private final String f13688e;

    /* renamed from: f */
    private final URI f13689f;
    @Deprecated

    /* renamed from: g */
    private final Base64URL f13690g;

    /* renamed from: h */
    private Base64URL f13691h;

    /* renamed from: i */
    private final List<Base64> f13692i;

    /* renamed from: j */
    private final List<X509Certificate> f13693j;

    /* renamed from: k */
    private final KeyStore f13694k;

    public JWK(C6247d dVar, C6248e eVar, Set<C6246c> set, C6236a aVar, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        if (dVar != null) {
            this.f13684a = dVar;
            Map<C6248e, Set<C6246c>> map = C6895b.f15275a;
            if ((eVar == null || set == null) ? true : C6895b.f15275a.get(eVar).containsAll(set)) {
                this.f13685b = eVar;
                this.f13686c = set;
                this.f13687d = aVar;
                this.f13688e = str;
                this.f13689f = uri;
                this.f13690g = base64URL;
                this.f13691h = base64URL2;
                if (list == null || !list.isEmpty()) {
                    this.f13692i = list;
                    try {
                        this.f13693j = C0114h.m325w(list);
                        this.f13694k = keyStore;
                    } catch (ParseException e) {
                        StringBuilder h = C0072d.m201h("Invalid X.509 certificate chain \"x5c\": ");
                        h.append(e.getMessage());
                        throw new IllegalArgumentException(h.toString(), e);
                    }
                } else {
                    throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
                }
            } else {
                throw new IllegalArgumentException("The key use \"use\" and key options \"key_opts\" parameters are not consistent, see RFC 7517, section 4.3");
            }
        } else {
            throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
    }

    /* renamed from: b */
    public static JWK m12522b(JSONObject jSONObject) {
        C6247d a = C6247d.m12528a((String) C19382n.m32756l(jSONObject, "kty", String.class));
        if (a == C6247d.f13695a) {
            return ECKey.m12512a(jSONObject);
        }
        if (a == C6247d.f13696b) {
            return C6251i.m12538a(jSONObject);
        }
        if (a == C6247d.f13697c) {
            return C6250h.m12535a(jSONObject);
        }
        if (a == C6247d.f13698d) {
            return C6249g.m12532a(jSONObject);
        }
        throw new ParseException("Unsupported key type \"kty\" parameter: " + a, 0);
    }

    /* renamed from: c */
    public abstract boolean mo17729c();

    /* renamed from: d */
    public JSONObject mo17730d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("kty", this.f13684a.mo17738a());
        C6248e eVar = this.f13685b;
        if (eVar != null) {
            jSONObject.put("use", eVar.mo17742a());
        }
        if (this.f13686c != null) {
            JSONArray jSONArray = new JSONArray();
            for (C6246c a : this.f13686c) {
                jSONArray.add(a.mo17736a());
            }
            jSONObject.put("key_ops", jSONArray);
        }
        C6236a aVar = this.f13687d;
        if (aVar != null) {
            jSONObject.put("alg", aVar.mo17701a());
        }
        String str = this.f13688e;
        if (str != null) {
            jSONObject.put("kid", str);
        }
        URI uri = this.f13689f;
        if (uri != null) {
            jSONObject.put("x5u", uri.toString());
        }
        Base64URL base64URL = this.f13690g;
        if (base64URL != null) {
            jSONObject.put("x5t", base64URL.toString());
        }
        Base64URL base64URL2 = this.f13691h;
        if (base64URL2 != null) {
            jSONObject.put("x5t#S256", base64URL2.toString());
        }
        if (this.f13692i != null) {
            JSONArray jSONArray2 = new JSONArray();
            for (Base64 base64 : this.f13692i) {
                jSONArray2.add(base64.toString());
            }
            jSONObject.put("x5c", jSONArray2);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public List<X509Certificate> mo17734e() {
        List<X509Certificate> list = this.f13693j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWK)) {
            return false;
        }
        JWK jwk = (JWK) obj;
        return Objects.equals(this.f13684a, jwk.f13684a) && Objects.equals(this.f13685b, jwk.f13685b) && Objects.equals(this.f13686c, jwk.f13686c) && Objects.equals(this.f13687d, jwk.f13687d) && Objects.equals(this.f13688e, jwk.f13688e) && Objects.equals(this.f13689f, jwk.f13689f) && Objects.equals(this.f13690g, jwk.f13690g) && Objects.equals(this.f13691h, jwk.f13691h) && Objects.equals(this.f13692i, jwk.f13692i) && Objects.equals(this.f13694k, jwk.f13694k);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f13684a, this.f13685b, this.f13686c, this.f13687d, this.f13688e, this.f13689f, this.f13690g, this.f13691h, this.f13692i, this.f13694k});
    }

    public String toJSONString() {
        return mo17730d().toString();
    }

    public String toString() {
        return mo17730d().toString();
    }
}
