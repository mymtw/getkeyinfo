package p345eg;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: eg.b */
public final class C12699b {

    /* renamed from: a */
    public static final LinkedHashMap f27980a = new LinkedHashMap();

    /* renamed from: b */
    public static SharedPreferences f27981b;

    /* renamed from: c */
    public static final AtomicBoolean f27982c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final C12699b f27983d = new C12699b();

    /* renamed from: a */
    public static final void m20372a(String str, String str2) {
        Class<C12699b> cls = C12699b.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(str, "pathID");
                C19383o.m32797g(str2, "predictedEvent");
                if (!f27982c.get()) {
                    f27983d.mo45469c();
                }
                LinkedHashMap linkedHashMap = f27980a;
                linkedHashMap.put(str, str2);
                SharedPreferences sharedPreferences = f27981b;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", C12869i0.m20552H(C19294b0.m32568y0(linkedHashMap))).apply();
                } else {
                    C19383o.m32805o("shardPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|(1:8)|16|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m20373b(android.view.View r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "text"
            java.lang.Class<eg.b> r1 = p345eg.C12699b.class
            boolean r2 = p401mg.C13080a.m20762b(r1)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            return r3
        L_0x000c:
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)     // Catch:{ all -> 0x003c }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x003c }
            r2.<init>()     // Catch:{ all -> 0x003c }
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x0033 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0033 }
            r5.<init>()     // Catch:{ JSONException -> 0x0033 }
        L_0x001c:
            if (r4 == 0) goto L_0x002e
            java.lang.Class r0 = r4.getClass()     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ JSONException -> 0x0033 }
            r5.put(r0)     // Catch:{ JSONException -> 0x0033 }
            android.view.ViewGroup r4 = com.facebook.appevents.codeless.internal.C12225d.m20060i(r4)     // Catch:{ JSONException -> 0x0033 }
            goto L_0x001c
        L_0x002e:
            java.lang.String r4 = "classname"
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x003c }
            java.lang.String r4 = p365hg.C12869i0.m20560P(r4)     // Catch:{ all -> 0x003c }
            return r4
        L_0x003c:
            r4 = move-exception
            p401mg.C13080a.m20761a(r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p345eg.C12699b.m20373b(android.view.View, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final void mo45469c() {
        String str = "";
        if (!C13080a.m20762b(this)) {
            try {
                AtomicBoolean atomicBoolean = f27982c;
                if (!atomicBoolean.get()) {
                    SharedPreferences sharedPreferences = C13418j.m21106b().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                    C19383o.m32796f(sharedPreferences, "FacebookSdk.getApplicati…RE, Context.MODE_PRIVATE)");
                    f27981b = sharedPreferences;
                    LinkedHashMap linkedHashMap = f27980a;
                    String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", str);
                    if (string != null) {
                        str = string;
                    }
                    linkedHashMap.putAll(C12869i0.m20549E(str));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
