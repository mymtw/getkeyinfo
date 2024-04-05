package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19382n;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.d */
public abstract class C6239d implements Serializable {

    /* renamed from: k */
    public static final Map<String, Object> f13647k = Collections.unmodifiableMap(new HashMap());

    /* renamed from: a */
    private final C6236a f13648a;

    /* renamed from: b */
    private final C6241f f13649b;

    /* renamed from: c */
    private final String f13650c;

    /* renamed from: d */
    private final Set<String> f13651d;

    /* renamed from: e */
    private final Map<String, Object> f13652e;

    /* renamed from: g */
    private final Base64URL f13653g;

    public C6239d(C6236a aVar, C6241f fVar, String str, Set<String> set, Map<String, Object> map, Base64URL base64URL) {
        if (aVar != null) {
            this.f13648a = aVar;
            this.f13649b = fVar;
            this.f13650c = str;
            this.f13651d = set != null ? Collections.unmodifiableSet(new HashSet(set)) : null;
            this.f13652e = map != null ? Collections.unmodifiableMap(new HashMap(map)) : f13647k;
            this.f13653g = base64URL;
            return;
        }
        throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
    }

    /* renamed from: a */
    public static C6236a m12486a(JSONObject jSONObject) {
        String str = (String) C19382n.m32756l(jSONObject, "alg", String.class);
        if (str != null) {
            C6236a aVar = C6236a.f13635a;
            return str.equals(aVar.mo17701a()) ? aVar : jSONObject.containsKey("enc") ? JWEAlgorithm.m12451b(str) : JWSAlgorithm.m12472b(str);
        }
        throw new ParseException("Missing \"alg\" in header JSON object", 0);
    }

    /* renamed from: a */
    public Object mo17708a(String str) {
        return this.f13652e.get(str);
    }

    /* renamed from: b */
    public JSONObject mo17678b() {
        JSONObject jSONObject = new JSONObject(this.f13652e);
        jSONObject.put("alg", this.f13648a.toString());
        C6241f fVar = this.f13649b;
        if (fVar != null) {
            jSONObject.put("typ", fVar.toString());
        }
        String str = this.f13650c;
        if (str != null) {
            jSONObject.put("cty", str);
        }
        Set<String> set = this.f13651d;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String add : this.f13651d) {
                jSONArray.add(add);
            }
            jSONObject.put("crit", jSONArray);
        }
        return jSONObject;
    }

    /* renamed from: c */
    public C6236a mo17679c() {
        return this.f13648a;
    }

    /* renamed from: d */
    public Set<String> mo17709d() {
        return this.f13651d;
    }

    /* renamed from: e */
    public Base64URL mo17710e() {
        Base64URL base64URL = this.f13653g;
        return base64URL == null ? Base64URL.m12550b(toString()) : base64URL;
    }

    public String toString() {
        return mo17678b().toString();
    }
}
