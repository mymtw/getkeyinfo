package p030bo.app;

import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.b4 */
public final class C3590b4 implements C4137r2 {

    /* renamed from: b */
    public String f8252b;

    public C3590b4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null && !optJSONObject.isNull(ResponseConstants.PRODUCT_ID)) {
            this.f8252b = optJSONObject.optString(ResponseConstants.PRODUCT_ID, (String) null);
        }
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        if (!(s2Var instanceof C3604c4)) {
            return false;
        }
        if (StringUtils.m11343d(this.f8252b)) {
            return true;
        }
        C3604c4 c4Var = (C3604c4) s2Var;
        return !StringUtils.m11343d(c4Var.mo13164f()) && c4Var.mo13164f().equals(this.f8252b);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f8252b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(ResponseConstants.PRODUCT_ID, this.f8252b);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
