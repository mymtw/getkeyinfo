package com.paypal.pyplcheckout.extensions;

import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;

public final class JSONObjectExtensionsKt {
    public static final Object getOrNull(JSONObject jSONObject, String str) {
        C19383o.m32797g(jSONObject, "<this>");
        C19383o.m32797g(str, "key");
        try {
            return jSONObject.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final <V> void putOrOmit(JSONObject jSONObject, String str, V v) {
        C19383o.m32797g(jSONObject, "<this>");
        C19383o.m32797g(str, "key");
        if (v != null) {
            jSONObject.put(str, v);
        }
    }
}
