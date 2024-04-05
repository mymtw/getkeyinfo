package com.paypal.android.platform.authsdk.authcommon.utils;

import com.etsy.android.lib.models.ResponseConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;
import org.json.JSONObject;

public final class StringUtilsKt {
    public static final String DEFAULT_ENCODING = "UTF-8";
    private static final String FILTERED_VERSION_NAME_PATTERN = "(\\d+(\\.\\d+){1,2}).*";

    public static final String encodeParameters(Map<String, String> map) {
        C19383o.m32797g(map, ResponseConstants.PARAMS);
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (Map.Entry next : map.entrySet()) {
            sb.append(str);
            sb.append(encodeString((String) next.getKey()));
            sb.append('=');
            sb.append(encodeString((String) next.getValue()));
            str = "&";
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "encodedParams.toString()");
        return sb2;
    }

    public static final String encodeString(String str) {
        C19383o.m32797g(str, "string");
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final String getFilteredVersion(String str) {
        C19383o.m32797g(str, ResponseConstants.VERSION);
        return new Regex(FILTERED_VERSION_NAME_PATTERN).replace((CharSequence) str, "$1");
    }

    public static final String toJsonDataId(String str, String str2) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, "id");
        try {
            String optString = new JSONObject(str).optString(str2);
            C19383o.m32796f(optString, "{\n        val dataJson =…aJson.optString(id)\n    }");
            return optString;
        } catch (Exception unused) {
            return "";
        }
    }
}
