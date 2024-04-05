package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.Serializable;
import p305z7.C8458a;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.f */
public final class C6241f implements C8458a, Serializable {

    /* renamed from: a */
    public static final C6241f f13656a = new C6241f("JOSE");

    /* renamed from: b */
    public static final C6241f f13657b = new C6241f("JOSE+JSON");

    /* renamed from: c */
    public static final C6241f f13658c = new C6241f("JWT");

    /* renamed from: d */
    private final String f13659d;

    public C6241f(String str) {
        if (str != null) {
            this.f13659d = str;
            return;
        }
        throw new IllegalArgumentException("The object type must not be null");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6241f) && this.f13659d.toLowerCase().equals(((C6241f) obj).f13659d.toLowerCase());
    }

    public int hashCode() {
        return this.f13659d.toLowerCase().hashCode();
    }

    public String toJSONString() {
        StringBuilder h = C0072d.m201h("\"");
        h.append(JSONObject.escape(this.f13659d));
        h.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return h.toString();
    }

    public String toString() {
        return this.f13659d;
    }
}
