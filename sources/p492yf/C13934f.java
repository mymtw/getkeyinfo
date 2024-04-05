package p492yf;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import org.json.JSONObject;
import p312ag.C8528e;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: yf.f */
public final class C13934f {

    /* renamed from: a */
    public static SharedPreferences f30638a;

    /* renamed from: b */
    public static final CopyOnWriteArraySet f30639b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final ConcurrentHashMap f30640c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final C13934f f30641d = new C13934f();

    /* renamed from: d */
    public static final boolean m21455d() {
        Class<C13934f> cls = C13934f.class;
        if (C13080a.m20762b(cls)) {
            return false;
        }
        try {
            f30641d.mo46758f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f30638a;
            if (sharedPreferences != null) {
                long j = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0);
                if (j != 0 && currentTimeMillis - j < ((long) 86400)) {
                    return false;
                }
                SharedPreferences sharedPreferences2 = f30638a;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                C19383o.m32805o("sharedPreferences");
                throw null;
            }
            C19383o.m32805o("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return false;
        }
    }

    /* renamed from: e */
    public static final void m21456e(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        C13934f fVar;
        Class<C13934f> cls = C13934f.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(concurrentHashMap, "purchaseDetailsMap");
                C19383o.m32797g(concurrentHashMap2, "skuDetailsMap");
                fVar = f30641d;
                fVar.mo46758f();
                LinkedHashMap c = fVar.mo46757c(fVar.mo46755a(concurrentHashMap), concurrentHashMap2);
                if (!C13080a.m20762b(fVar)) {
                    for (Map.Entry entry : c.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (!(str == null || str2 == null)) {
                            C8528e.m16935c(str, str2, false);
                        }
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: a */
    public final HashMap mo46755a(ConcurrentHashMap concurrentHashMap) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C19383o.m32797g(concurrentHashMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : C19294b0.m32568y0(concurrentHashMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f30640c.containsKey(string)) {
                            concurrentHashMap.remove(str);
                        } else {
                            CopyOnWriteArraySet copyOnWriteArraySet = f30639b;
                            copyOnWriteArraySet.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f30638a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f30639b).apply();
                return new HashMap(concurrentHashMap);
            }
            C19383o.m32805o("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo46756b() {
        if (!C13080a.m20762b(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = f30638a;
                if (sharedPreferences != null) {
                    long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                    if (j == 0) {
                        SharedPreferences sharedPreferences2 = f30638a;
                        if (sharedPreferences2 != null) {
                            sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else {
                            C19383o.m32805o("sharedPreferences");
                            throw null;
                        }
                    } else if (currentTimeMillis - j > ((long) 604800)) {
                        for (Map.Entry entry : C19294b0.m32568y0(f30640c).entrySet()) {
                            String str = (String) entry.getKey();
                            long longValue = ((Number) entry.getValue()).longValue();
                            if (currentTimeMillis - longValue > ((long) 86400)) {
                                CopyOnWriteArraySet copyOnWriteArraySet = f30639b;
                                copyOnWriteArraySet.remove(str + ';' + longValue);
                                f30640c.remove(str);
                            }
                        }
                        SharedPreferences sharedPreferences3 = f30638a;
                        if (sharedPreferences3 != null) {
                            sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f30639b).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else {
                            C19383o.m32805o("sharedPreferences");
                            throw null;
                        }
                    }
                } else {
                    C19383o.m32805o("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final LinkedHashMap mo46757c(HashMap hashMap, ConcurrentHashMap concurrentHashMap) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C19383o.m32797g(hashMap, "purchaseDetailsMap");
            C19383o.m32797g(concurrentHashMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) concurrentHashMap.get((String) entry.getKey());
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= ((long) 86400)) {
                            if (jSONObject2 != null) {
                                String jSONObject3 = jSONObject.toString();
                                C19383o.m32796f(jSONObject3, "purchaseDetail.toString()");
                                String jSONObject4 = jSONObject2.toString();
                                C19383o.m32796f(jSONObject4, "skuDetail.toString()");
                                linkedHashMap.put(jSONObject3, jSONObject4);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* renamed from: f */
    public final void mo46758f() {
        if (!C13080a.m20762b(this)) {
            try {
                SharedPreferences sharedPreferences = C13418j.m21106b().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
                SharedPreferences sharedPreferences2 = C13418j.m21106b().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
                if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                    sharedPreferences.edit().clear().apply();
                    sharedPreferences2.edit().clear().apply();
                }
                SharedPreferences sharedPreferences3 = C13418j.m21106b().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
                C19383o.m32796f(sharedPreferences3, "getApplicationContext().…RE, Context.MODE_PRIVATE)");
                f30638a = sharedPreferences3;
                CopyOnWriteArraySet copyOnWriteArraySet = f30639b;
                Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet();
                }
                copyOnWriteArraySet.addAll(stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    List y1 = C19459m.m33056y1((String) it.next(), new String[]{";"}, 2, 2);
                    f30640c.put(y1.get(0), Long.valueOf(Long.parseLong((String) y1.get(1))));
                }
                mo46756b();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
