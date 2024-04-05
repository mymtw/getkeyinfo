package p030bo.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

/* renamed from: bo.app.n6 */
public abstract class C4008n6 extends C3935l6 {

    /* renamed from: h */
    private Map<String, String> f8969h = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4008n6(JSONObject jSONObject) {
        super(jSONObject);
        C19383o.m32797g(jSONObject, "json");
    }

    /* renamed from: a */
    public void mo13781a(Map<String, String> map) {
        C19383o.m32797g(map, "remoteAssetToLocalAssetPaths");
        this.f8969h = new HashMap(map);
    }

    public abstract /* synthetic */ Object forJsonPut();

    /* renamed from: y */
    public Map<String, String> mo13782y() {
        return C19294b0.m32568y0(this.f8969h);
    }
}
