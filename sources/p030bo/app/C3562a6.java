package p030bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.a6 */
public abstract class C3562a6 implements C4137r2 {

    /* renamed from: c */
    private static final String f8217c = BrazeLogger.m11287i(C3562a6.class);

    /* renamed from: b */
    public C3595c f8218b;

    public C3562a6(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new C4320z3(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(new C4245v3(arrayList2));
        }
        this.f8218b = new C3595c(arrayList);
    }

    /* renamed from: a */
    public boolean mo13074a(C4173s2 s2Var) {
        return this.f8218b.mo13074a(s2Var);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f8218b.forJsonPut());
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            BrazeLogger.m11286h(f8217c, "Caught exception creating Json.", e);
        }
        return jSONObject;
    }
}
