package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.b */
abstract class C6237b extends C6239d {

    /* renamed from: a */
    private final URI f13638a;

    /* renamed from: b */
    private final JWK f13639b;

    /* renamed from: c */
    private final URI f13640c;

    /* renamed from: d */
    private final Base64URL f13641d;

    /* renamed from: e */
    private final Base64URL f13642e;

    /* renamed from: f */
    private final List<Base64> f13643f;

    /* renamed from: g */
    private final String f13644g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6237b(C6236a aVar, C6241f fVar, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, Map<String, Object> map, Base64URL base64URL3) {
        super(aVar, fVar, str, set, map, base64URL3);
        List<Base64> list2 = list;
        this.f13638a = uri;
        this.f13639b = jwk;
        this.f13640c = uri2;
        this.f13641d = base64URL;
        this.f13642e = base64URL2;
        this.f13643f = list2 != null ? Collections.unmodifiableList(new ArrayList(list2)) : null;
        this.f13644g = str2;
    }

    /* renamed from: a */
    public List<Base64> mo17677a() {
        return this.f13643f;
    }

    /* renamed from: b */
    public JSONObject mo17678b() {
        JSONObject b = super.mo17678b();
        URI uri = this.f13638a;
        if (uri != null) {
            b.put("jku", uri.toString());
        }
        JWK jwk = this.f13639b;
        if (jwk != null) {
            b.put("jwk", jwk.mo17730d());
        }
        URI uri2 = this.f13640c;
        if (uri2 != null) {
            b.put("x5u", uri2.toString());
        }
        Base64URL base64URL = this.f13641d;
        if (base64URL != null) {
            b.put("x5t", base64URL.toString());
        }
        Base64URL base64URL2 = this.f13642e;
        if (base64URL2 != null) {
            b.put("x5t#S256", base64URL2.toString());
        }
        List<Base64> list = this.f13643f;
        if (list != null && !list.isEmpty()) {
            b.put("x5c", this.f13643f);
        }
        String str = this.f13644g;
        if (str != null) {
            b.put("kid", str);
        }
        return b;
    }
}
