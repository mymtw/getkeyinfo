package com.paypal.android.platform.authsdk.authcommon.network.utils;

import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

public final class AuthHeaderBuilderKt {
    private static final String AUTHORIZATION_KEY = "Authorization";
    private static final String DEFAULT_STRING = "";
    public static final String PAIRING_ID = "pairing_id";
    public static final String PAYPAL_CLIENT_METADATA_ID = "paypal-client-metadata-id";

    public static final String toPayPalClientMetaDataId(String str) {
        C19383o.m32797g(str, "<this>");
        try {
            String optString = new JSONObject(str).optString(PAIRING_ID);
            C19383o.m32796f(optString, "{\n        val riskJson =…tString(PAIRING_ID)\n    }");
            return optString;
        } catch (Exception unused) {
            return "";
        }
    }
}
