package p030bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.d4 */
public final class C3623d4 extends C3562a6 {

    /* renamed from: e */
    private static final String f8338e = BrazeLogger.m11287i(C3623d4.class);

    /* renamed from: d */
    private String f8339d;

    public C3623d4(JSONObject jSONObject) {
        super(jSONObject);
        this.f8339d = jSONObject.getJSONObject("data").getString(ResponseConstants.PRODUCT_ID);
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        if (!(s2Var instanceof C3604c4) || StringUtils.m11343d(this.f8339d)) {
            return false;
        }
        C3604c4 c4Var = (C3604c4) s2Var;
        if (!StringUtils.m11343d(c4Var.mo13164f()) && c4Var.mo13164f().equals(this.f8339d)) {
            return super.mo13074a(s2Var);
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject e = super.forJsonPut();
        try {
            e.put("type", "purchase_property");
            JSONObject jSONObject = e.getJSONObject("data");
            jSONObject.put(ResponseConstants.PRODUCT_ID, this.f8339d);
            e.put("data", jSONObject);
        } catch (JSONException e2) {
            BrazeLogger.m11286h(f8338e, "Caught exception creating Json.", e2);
        }
        return e;
    }
}
