package com.cardinalcommerce.shared.p065cs.p069e;

import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.cardinalcommerce.shared.cs.e.g */
public class C6274g implements Serializable {

    /* renamed from: a */
    public final String f13792a;

    /* renamed from: b */
    public final boolean f13793b;

    /* renamed from: c */
    private final String f13794c;

    /* renamed from: d */
    private final String f13795d;

    public C6274g(JSONObject jSONObject) {
        this.f13794c = jSONObject.optString("name");
        this.f13792a = jSONObject.optString("id");
        this.f13793b = jSONObject.optBoolean("criticalityIndicator", true);
        this.f13795d = jSONObject.optString("data");
    }

    /* renamed from: a */
    public String mo17797a() {
        return this.f13794c;
    }

    /* renamed from: b */
    public String mo17798b() {
        return this.f13792a;
    }

    /* renamed from: c */
    public String mo17799c() {
        return this.f13795d;
    }
}
