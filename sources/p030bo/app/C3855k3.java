package p030bo.app;

import com.braze.support.BrazeLogger;
import java.util.List;
import org.json.JSONArray;

/* renamed from: bo.app.k3 */
public abstract class C3855k3 implements C3548a2 {

    /* renamed from: c */
    private static final String f8735c = BrazeLogger.m11287i(C3855k3.class);

    /* renamed from: b */
    public final List<C3548a2> f8736b;

    public C3855k3(List<C3548a2> list) {
        this.f8736b = list;
    }

    /* renamed from: e */
    public JSONArray forJsonPut() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3548a2 forJsonPut : this.f8736b) {
                jSONArray.put(forJsonPut.forJsonPut());
            }
        } catch (Exception e) {
            BrazeLogger.m11286h(f8735c, "Caught exception creating Json.", e);
        }
        return jSONArray;
    }
}
