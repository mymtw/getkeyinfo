package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.Serializable;
import p305z7.C8458a;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.a */
public class C6236a implements C8458a, Serializable {

    /* renamed from: a */
    public static final C6236a f13635a = new C6236a("none", C6255m.REQUIRED);

    /* renamed from: b */
    private final String f13636b;

    /* renamed from: c */
    private final C6255m f13637c;

    public C6236a(String str) {
        this(str, (C6255m) null);
    }

    public C6236a(String str, C6255m mVar) {
        if (str != null) {
            this.f13636b = str;
            this.f13637c = mVar;
            return;
        }
        throw new IllegalArgumentException("The algorithm name must not be null");
    }

    /* renamed from: a */
    public static C6236a m12482a(String str) {
        if (str == null) {
            return null;
        }
        return new C6236a(str);
    }

    /* renamed from: a */
    public final String mo17701a() {
        return this.f13636b;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C6236a) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return this.f13636b.hashCode();
    }

    public final String toJSONString() {
        StringBuilder h = C0072d.m201h("\"");
        h.append(JSONObject.escape(this.f13636b));
        h.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return h.toString();
    }

    public final String toString() {
        return this.f13636b;
    }
}
