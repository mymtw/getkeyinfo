package p253u3;

import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u3.r */
public final class C8154r {

    /* renamed from: a */
    public JSONObject f17901a = new JSONObject();

    /* renamed from: b */
    public HashSet f17902b = new HashSet();

    /* renamed from: a */
    public final void mo20790a(Object obj, String str) {
        if (C8156t.m16412c(str)) {
            C8149n.f17874c.mo20767c("u3.r", String.format("Attempting to perform operation %s with a null or empty string property, ignoring", new Object[]{"$append"}));
        } else if (obj == null) {
            C8149n.f17874c.mo20767c("u3.r", String.format("Attempting to perform operation %s with null value for property %s, ignoring", new Object[]{"$append", str}));
        } else if (this.f17901a.has("$clearAll")) {
            C8149n.f17874c.mo20767c("u3.r", String.format("This Identify already contains a $clearAll operation, ignoring operation %s", new Object[]{"$append"}));
        } else if (this.f17902b.contains(str)) {
            C8149n.f17874c.mo20767c("u3.r", String.format("Already used property %s in previous operation, ignoring operation %s", new Object[]{str, "$append"}));
        } else {
            try {
                if (!this.f17901a.has("$append")) {
                    this.f17901a.put("$append", new JSONObject());
                }
                this.f17901a.getJSONObject("$append").put(str, obj);
                this.f17902b.add(str);
            } catch (JSONException e) {
                C8149n.f17874c.mo20765a("u3.r", e.toString());
            }
        }
    }
}
