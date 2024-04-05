package p030bo.app;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.u5 */
public final class C4236u5 implements C4137r2 {
    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        return s2Var instanceof C4249v5;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "test");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
