package p030bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.f4 */
public final class C3669f4 implements C4137r2 {

    /* renamed from: b */
    private String f8420b;

    public C3669f4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null && !optJSONObject.isNull("campaign_id")) {
            this.f8420b = optJSONObject.optString("campaign_id", (String) null);
        }
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        if (!(s2Var instanceof C3691g4)) {
            return false;
        }
        if (StringUtils.m11343d(this.f8420b)) {
            return true;
        }
        C3691g4 g4Var = (C3691g4) s2Var;
        return !StringUtils.m11343d(g4Var.mo13331f()) && g4Var.mo13331f().equals(this.f8420b);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.f8420b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.f8420b);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
