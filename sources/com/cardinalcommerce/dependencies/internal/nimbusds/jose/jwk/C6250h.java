package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.google.android.play.core.appupdate.C15562d;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.C19382n;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.h */
public final class C6250h extends JWK {

    /* renamed from: a */
    private final Base64URL f13710a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6250h(Base64URL base64URL, C6248e eVar, Set<C6246c> set, C6236a aVar, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(C6247d.f13697c, eVar, set, aVar, str, uri, base64URL2, base64URL3, list, keyStore);
        Base64URL base64URL4 = base64URL;
        if (base64URL4 != null) {
            this.f13710a = base64URL4;
            return;
        }
        throw new IllegalArgumentException("The key value must not be null");
    }

    /* renamed from: a */
    public static C6250h m12535a(JSONObject jSONObject) {
        if (C6247d.f13697c.equals(C15562d.m25189a(jSONObject))) {
            try {
                return new C6250h(C19382n.m32768r0(jSONObject, "k"), C15562d.m25198l(jSONObject), C15562d.m25201q(jSONObject), C15562d.m25163A(jSONObject), C15562d.m25166D(jSONObject), C19382n.m32737Y(jSONObject, "x5u"), C19382n.m32768r0(jSONObject, "x5t"), C19382n.m32768r0(jSONObject, "x5t#S256"), C15562d.m25176N(jSONObject), (KeyStore) null);
            } catch (IllegalArgumentException e) {
                throw new ParseException(e.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be oct", 0);
        }
    }

    /* renamed from: c */
    public boolean mo17729c() {
        return true;
    }

    /* renamed from: d */
    public JSONObject mo17730d() {
        JSONObject d = super.mo17730d();
        d.put("k", this.f13710a.toString());
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6250h) && super.equals(obj)) {
            return Objects.equals(this.f13710a, ((C6250h) obj).f13710a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f13710a});
    }
}
