package p291y3;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: y3.g */
public final class C8382g {

    /* renamed from: a */
    public int f18375a;

    /* renamed from: b */
    public String f18376b;

    /* renamed from: c */
    public String f18377c;

    /* renamed from: d */
    public String f18378d;

    /* renamed from: e */
    public String f18379e;

    public C8382g(JSONObject jSONObject) throws JSONException {
        this.f18375a = jSONObject.optInt("status_code");
        this.f18376b = jSONObject.optString("status_txt");
        if (jSONObject.optJSONObject("data") != null) {
            this.f18377c = jSONObject.getJSONObject("data").optString("url");
            this.f18378d = jSONObject.getJSONObject("data").optString("long_url");
            if (jSONObject.optJSONObject("data").optJSONObject("deeplink") != null) {
                this.f18379e = jSONObject.getJSONObject("data").getJSONObject("deeplink").optString("applink");
            }
        }
    }
}
