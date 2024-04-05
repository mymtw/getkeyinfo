package p030bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.f0 */
public final class C3660f0 extends C3562a6 {

    /* renamed from: e */
    private static final String f8401e = BrazeLogger.m11287i(C3660f0.class);

    /* renamed from: d */
    private String f8402d;

    public C3660f0(JSONObject jSONObject) {
        super(jSONObject);
        this.f8402d = jSONObject.getJSONObject("data").getString(ResponseConstants.EVENT_NAME);
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        if (!(s2Var instanceof C3633e0)) {
            return false;
        }
        C3633e0 e0Var = (C3633e0) s2Var;
        if (StringUtils.m11343d(e0Var.mo13237f()) || !e0Var.mo13237f().equals(this.f8402d)) {
            return false;
        }
        return super.mo13074a(s2Var);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject e = super.forJsonPut();
        try {
            e.put("type", "custom_event_property");
            JSONObject jSONObject = e.getJSONObject("data");
            jSONObject.put(ResponseConstants.EVENT_NAME, this.f8402d);
            e.put("data", jSONObject);
        } catch (JSONException e2) {
            BrazeLogger.m11286h(f8401e, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e2);
        }
        return e;
    }
}
