package p030bo.app;

import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONObject;
import p005a4.C0035b;

/* renamed from: bo.app.y3 */
public final class C4298y3 implements C0035b<JSONArray>, C3637e2 {

    /* renamed from: b */
    private final JSONObject f9478b;

    /* renamed from: c */
    private final JSONArray f9479c;

    public C4298y3(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "userObject");
        this.f9478b = jSONObject;
        this.f9479c = new JSONArray().put(jSONObject);
    }

    /* renamed from: e */
    public boolean mo13244e() {
        if (this.f9478b.length() == 0) {
            return true;
        }
        return this.f9478b.length() == 1 && this.f9478b.has("user_id");
    }

    /* renamed from: v */
    public JSONArray forJsonPut() {
        JSONArray jSONArray = this.f9479c;
        C19383o.m32796f(jSONArray, "jsonArrayForJsonPut");
        return jSONArray;
    }

    /* renamed from: w */
    public final JSONObject mo14211w() {
        return this.f9478b;
    }
}
