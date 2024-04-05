package p641on;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: on.e */
public final class C18327e {

    /* renamed from: f */
    public static final /* synthetic */ int f40231f = 0;

    /* renamed from: a */
    public JSONObject f40232a;

    /* renamed from: b */
    public JSONObject f40233b;

    /* renamed from: c */
    public Date f40234c;

    /* renamed from: d */
    public JSONArray f40235d;

    /* renamed from: e */
    public JSONObject f40236e;

    static {
        new Date(0);
    }

    public C18327e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f40233b = jSONObject;
        this.f40234c = date;
        this.f40235d = jSONArray;
        this.f40236e = jSONObject2;
        this.f40232a = jSONObject3;
    }

    /* renamed from: a */
    public static C18327e m30956a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C18327e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18327e)) {
            return false;
        }
        return this.f40232a.toString().equals(((C18327e) obj).toString());
    }

    public final int hashCode() {
        return this.f40232a.hashCode();
    }

    public final String toString() {
        return this.f40232a.toString();
    }
}
