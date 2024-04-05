package p469vf;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.json.JSONObject;
import p401mg.C13080a;

/* renamed from: vf.d */
public final class C13791d {

    /* renamed from: d */
    public static final CopyOnWriteArraySet f30351d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public static final C13792a f30352e = new C13792a();

    /* renamed from: a */
    public final List<String> f30353a;

    /* renamed from: b */
    public final String f30354b;

    /* renamed from: c */
    public final String f30355c;

    /* renamed from: vf.d$a */
    public static final class C13792a {
        /* renamed from: a */
        public static void m21344a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    C19383o.m32796f(optString, "k");
                    if (!(optString.length() == 0)) {
                        CopyOnWriteArraySet a = C13791d.m21342a();
                        C19383o.m32796f(next, "key");
                        List y1 = C19459m.m33056y1(optString, new String[]{","}, 0, 6);
                        C19383o.m32796f(optString2, "v");
                        a.add(new C13791d(next, y1, optString2));
                    }
                }
            }
        }
    }

    public C13791d() {
        throw null;
    }

    public C13791d(String str, List list, String str2) {
        this.f30354b = str;
        this.f30355c = str2;
        this.f30353a = list;
    }

    /* renamed from: a */
    public static final /* synthetic */ CopyOnWriteArraySet m21342a() {
        Class<C13791d> cls = C13791d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return f30351d;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo46654b() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            return this.f30354b;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
