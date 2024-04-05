package p492yf;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.appevents.iap.C12226x362beb25;
import com.facebook.appevents.iap.C12227x362beb26;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p312ag.C8528e;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: yf.a */
public final class C13922a {

    /* renamed from: a */
    public static final String f30590a = C13922a.class.getCanonicalName();

    /* renamed from: b */
    public static final AtomicBoolean f30591b = new AtomicBoolean(false);

    /* renamed from: c */
    public static Boolean f30592c;

    /* renamed from: d */
    public static Boolean f30593d;

    /* renamed from: e */
    public static C12226x362beb25 f30594e;

    /* renamed from: f */
    public static C12227x362beb26 f30595f;

    /* renamed from: g */
    public static Intent f30596g;

    /* renamed from: h */
    public static Object f30597h;

    /* renamed from: i */
    public static final C13922a f30598i = new C13922a();

    /* renamed from: a */
    public static final void m21429a(C13922a aVar, Context context, ArrayList arrayList, boolean z) {
        aVar.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    C19383o.m32796f(string, "sku");
                    C19383o.m32796f(str, "purchase");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e) {
                    Log.e(f30590a, "Error parsing in-app purchase data.", e);
                }
            }
            Object obj = f30597h;
            HashMap<String, Method> hashMap2 = C13933e.f30632a;
            Class<C13933e> cls = C13933e.class;
            LinkedHashMap linkedHashMap = null;
            if (!C13080a.m20762b(cls)) {
                try {
                    C19383o.m32797g(context, ResponseConstants.CONTEXT);
                    LinkedHashMap k = C13933e.f30637f.mo46753k(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (!k.containsKey(str2)) {
                            arrayList3.add(str2);
                        }
                    }
                    k.putAll(C13933e.f30637f.mo46750h(context, arrayList3, obj, z));
                    linkedHashMap = k;
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getValue();
                String str4 = (String) hashMap.get((String) entry.getKey());
                if (str4 != null) {
                    C8528e.m16935c(str4, str3, z);
                }
            }
        }
    }

    /* renamed from: b */
    public static final void m21430b() {
        f30598i.getClass();
        if (f30592c == null) {
            Boolean valueOf = Boolean.valueOf(C13938i.m21464a("com.android.vending.billing.IInAppBillingService$Stub") != null);
            f30592c = valueOf;
            if (!C19383o.m32792b(valueOf, Boolean.FALSE)) {
                f30593d = Boolean.valueOf(C13938i.m21464a("com.android.billingclient.api.ProxyBillingActivity") != null);
                HashMap<String, Method> hashMap = C13933e.f30632a;
                Class<C13933e> cls = C13933e.class;
                if (!C13080a.m20762b(cls)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = C13933e.f30635d;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j > ((long) 604800)) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        C13080a.m20761a(cls, th);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                C19383o.m32796f(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
                f30596g = intent;
                f30594e = new C12226x362beb25();
                f30595f = new C12227x362beb26();
            }
        }
        if (!C19383o.m32792b(f30592c, Boolean.FALSE) && C8528e.m16933a()) {
            f30598i.getClass();
            if (f30591b.compareAndSet(false, true)) {
                Context b = C13418j.m21106b();
                if (b instanceof Application) {
                    Application application = (Application) b;
                    C12227x362beb26 inAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2 = f30595f;
                    if (inAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2 != null) {
                        application.registerActivityLifecycleCallbacks(inAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2);
                        Intent intent2 = f30596g;
                        if (intent2 != null) {
                            C12226x362beb25 inAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1 = f30594e;
                            if (inAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1 != null) {
                                b.bindService(intent2, inAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1, 1);
                            } else {
                                C19383o.m32805o("serviceConnection");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("intent");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("callbacks");
                        throw null;
                    }
                }
            }
        }
    }
}
