package p030bo.app;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.t3 */
public final class C4211t3 implements C4137r2 {
    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        return s2Var instanceof C4234u3;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "open");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
