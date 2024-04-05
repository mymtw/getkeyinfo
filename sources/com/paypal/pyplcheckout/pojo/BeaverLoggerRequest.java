package com.paypal.pyplcheckout.pojo;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

public final class BeaverLoggerRequest {
    private final JSONObject data;
    private final Map<String, String> headers;
    private final String url;

    public BeaverLoggerRequest(String str, Map<String, String> map, JSONObject jSONObject) {
        C19383o.m32797g(str, "url");
        C19383o.m32797g(map, "headers");
        C19383o.m32797g(jSONObject, "data");
        this.url = str;
        this.headers = map;
        this.data = jSONObject;
    }

    public static /* synthetic */ BeaverLoggerRequest copy$default(BeaverLoggerRequest beaverLoggerRequest, String str, Map<String, String> map, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beaverLoggerRequest.url;
        }
        if ((i & 2) != 0) {
            map = beaverLoggerRequest.headers;
        }
        if ((i & 4) != 0) {
            jSONObject = beaverLoggerRequest.data;
        }
        return beaverLoggerRequest.copy(str, map, jSONObject);
    }

    public final String component1() {
        return this.url;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final JSONObject component3() {
        return this.data;
    }

    public final BeaverLoggerRequest copy(String str, Map<String, String> map, JSONObject jSONObject) {
        C19383o.m32797g(str, "url");
        C19383o.m32797g(map, "headers");
        C19383o.m32797g(jSONObject, "data");
        return new BeaverLoggerRequest(str, map, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeaverLoggerRequest)) {
            return false;
        }
        BeaverLoggerRequest beaverLoggerRequest = (BeaverLoggerRequest) obj;
        return C19383o.m32792b(this.url, beaverLoggerRequest.url) && C19383o.m32792b(this.headers, beaverLoggerRequest.headers) && C19383o.m32792b(this.data, beaverLoggerRequest.data);
    }

    public final JSONObject getData() {
        return this.data;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.headers.hashCode();
        return this.data.hashCode() + ((hashCode + (this.url.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.url;
        Map<String, String> map = this.headers;
        JSONObject jSONObject = this.data;
        return "BeaverLoggerRequest(url=" + str + ", headers=" + map + ", data=" + jSONObject + ")";
    }
}
