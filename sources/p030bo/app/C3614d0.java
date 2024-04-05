package p030bo.app;

import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.d0 */
public final class C3614d0 implements C4137r2 {

    /* renamed from: b */
    private String f8320b;

    public C3614d0(JSONObject jSONObject) {
        this.f8320b = jSONObject.getJSONObject("data").getString(ResponseConstants.EVENT_NAME);
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        if (!(s2Var instanceof C3633e0)) {
            return false;
        }
        C3633e0 e0Var = (C3633e0) s2Var;
        return !StringUtils.m11343d(e0Var.mo13237f()) && e0Var.mo13237f().equals(this.f8320b);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ResponseConstants.EVENT_NAME, this.f8320b);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
