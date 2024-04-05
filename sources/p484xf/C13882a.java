package p484xf;

import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONObject;
import p365hg.C12869i0;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: xf.a */
public final class C13882a {

    /* renamed from: a */
    public static boolean f30540a;

    /* renamed from: b */
    public static final ArrayList f30541b = new ArrayList();

    /* renamed from: c */
    public static final HashSet f30542c = new HashSet();

    /* renamed from: d */
    public static final C13882a f30543d = new C13882a();

    /* renamed from: xf.a$a */
    public static final class C13883a {

        /* renamed from: a */
        public String f30544a;

        /* renamed from: b */
        public List<String> f30545b;

        public C13883a(String str, ArrayList arrayList) {
            this.f30544a = str;
            this.f30545b = arrayList;
        }
    }

    /* renamed from: b */
    public static final void m21407b(ArrayList arrayList) {
        Class<C13882a> cls = C13882a.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(arrayList, "events");
                if (f30540a) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (f30542c.contains(((AppEvent) it.next()).getName())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo46711a() {
        if (!C13080a.m20762b(this)) {
            try {
                boolean z = false;
                C12882n f = FetchedAppSettingsManager.m20107f(C13418j.m21107c(), false);
                if (f != null) {
                    String str = f.f28411o;
                    if (str != null) {
                        if (str.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            JSONObject jSONObject = new JSONObject(str);
                            f30541b.clear();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        HashSet hashSet = f30542c;
                                        C19383o.m32796f(next, "key");
                                        hashSet.add(next);
                                    } else {
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        C19383o.m32796f(next, "key");
                                        C13883a aVar = new C13883a(next, new ArrayList());
                                        if (optJSONArray != null) {
                                            aVar.f30545b = C12869i0.m20568g(optJSONArray);
                                        }
                                        f30541b.add(aVar);
                                    }
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
