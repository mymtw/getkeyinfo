package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.Serializable;
import p305z7.C8458a;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.c */
public final class C6238c implements C8458a, Serializable {

    /* renamed from: a */
    public static final C6238c f13645a = new C6238c("DEF");

    /* renamed from: b */
    private final String f13646b;

    public C6238c(String str) {
        if (str != null) {
            this.f13646b = str;
            return;
        }
        throw new IllegalArgumentException("The compression algorithm name must not be null");
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C6238c) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f13646b.hashCode();
    }

    public String toJSONString() {
        StringBuilder h = C0072d.m201h("\"");
        h.append(JSONObject.escape(this.f13646b));
        h.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return h.toString();
    }

    public String toString() {
        return this.f13646b;
    }
}
