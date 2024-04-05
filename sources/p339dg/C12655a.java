package p339dg;

import android.util.Log;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p365hg.C12869i0;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: dg.a */
public final class C12655a {

    /* renamed from: a */
    public static boolean f27914a;

    /* renamed from: b */
    public static final String f27915b = C12655a.class.getCanonicalName();

    /* renamed from: c */
    public static final ArrayList f27916c = new ArrayList();

    /* renamed from: d */
    public static final CopyOnWriteArraySet f27917d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public static final C12655a f27918e = new C12655a();

    /* renamed from: dg.a$a */
    public static final class C12656a {

        /* renamed from: a */
        public String f27919a;

        /* renamed from: b */
        public Map<String, String> f27920b;

        public C12656a(String str, HashMap hashMap) {
            this.f27919a = str;
            this.f27920b = hashMap;
        }
    }

    /* renamed from: a */
    public final String mo45434a(String str, String str2) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            Iterator it = new ArrayList(f27916c).iterator();
            while (it.hasNext()) {
                C12656a aVar = (C12656a) it.next();
                if (aVar != null) {
                    if (C19383o.m32792b(str, aVar.f27919a)) {
                        for (String next : aVar.f27920b.keySet()) {
                            if (C19383o.m32792b(str2, next)) {
                                return aVar.f27920b.get(next);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            Log.w(f27915b, "getMatchedRuleType failed", e);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo45435b() {
        String str;
        if (!C13080a.m20762b(this)) {
            try {
                boolean z = false;
                C12882n f = FetchedAppSettingsManager.m20107f(C13418j.m21107c(), false);
                if (f != null && (str = f.f28411o) != null) {
                    if (str.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        JSONObject jSONObject = new JSONObject(str);
                        f27916c.clear();
                        f27917d.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                                C19383o.m32796f(next, "key");
                                C12656a aVar = new C12656a(next, new HashMap());
                                if (optJSONObject != null) {
                                    aVar.f27920b = C12869i0.m20570i(optJSONObject);
                                    f27916c.add(aVar);
                                }
                                if (jSONObject2.has("process_event_name")) {
                                    f27917d.add(aVar.f27919a);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
