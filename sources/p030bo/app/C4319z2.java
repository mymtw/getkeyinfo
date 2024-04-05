package p030bo.app;

import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.z2 */
public final class C4319z2 implements C4137r2 {

    /* renamed from: b */
    private String f9530b;

    /* renamed from: c */
    private Set<String> f9531c = new HashSet();

    public C4319z2(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f9530b = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray(ResponseConstants.BUTTONS);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f9531c.add(optJSONArray.getString(i));
            }
        }
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        if (s2Var instanceof C3549a3) {
            C3549a3 a3Var = (C3549a3) s2Var;
            if (!StringUtils.m11343d(a3Var.mo13077g()) && a3Var.mo13077g().equals(this.f9530b)) {
                return this.f9531c.size() > 0 ? !StringUtils.m11343d(a3Var.mo13076f()) && this.f9531c.contains(a3Var.mo13076f()) : StringUtils.m11343d(a3Var.mo13076f());
            }
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f9530b);
            if (this.f9531c.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f9531c) {
                    jSONArray.put(put);
                }
                jSONObject2.put(ResponseConstants.BUTTONS, jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
