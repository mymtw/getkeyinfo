package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12831b;
import p365hg.C12845c0;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13501b;
import p461uf.C13523p;

public final class AppEventsLoggerUtility {

    /* renamed from: a */
    public static final HashMap f27306a = C19294b0.m32561r0(new Pair(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new Pair(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static final JSONObject m20070a(GraphAPIActivityType graphAPIActivityType, C12831b bVar, String str, boolean z, Context context) throws JSONException {
        C19383o.m32797g(graphAPIActivityType, "activityType");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f27306a.get(graphAPIActivityType));
        if (!C13501b.f29541d) {
            Log.w(C13501b.f29538a, "initStore should have been called before calling setUserID");
            C13501b.f29542e.getClass();
            C13501b.m21264a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = C13501b.f29539b;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = C13501b.f29540c;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            int i = C12869i0.f28368a;
            FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
            if (!FeatureManager.m20100c(feature)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z);
            String str3 = C13418j.f29381a;
            jSONObject.put("advertiser_id_collection_enabled", C13442y.m21139b());
            if (bVar != null) {
                if (FeatureManager.m20100c(feature)) {
                    C12869i0 i0Var = C12869i0.f28375h;
                    if (Build.VERSION.SDK_INT >= 31) {
                        i0Var.getClass();
                        if (C12869i0.m20545A(context)) {
                            if (!bVar.f28326e) {
                                jSONObject.put("anon_id", str);
                            }
                        }
                    } else {
                        i0Var.getClass();
                    }
                    jSONObject.put("anon_id", str);
                }
                if (bVar.f28324c != null) {
                    if (FeatureManager.m20100c(feature)) {
                        C12869i0 i0Var2 = C12869i0.f28375h;
                        if (Build.VERSION.SDK_INT >= 31) {
                            i0Var2.getClass();
                            if (C12869i0.m20545A(context)) {
                                if (!bVar.f28326e) {
                                    jSONObject.put("attribution", bVar.f28324c);
                                }
                            }
                        } else {
                            i0Var2.getClass();
                        }
                        jSONObject.put("attribution", bVar.f28324c);
                    } else {
                        jSONObject.put("attribution", bVar.f28324c);
                    }
                }
                if (bVar.mo45613a() != null) {
                    jSONObject.put("advertiser_id", bVar.mo45613a());
                    jSONObject.put("advertiser_tracking_enabled", !bVar.f28326e);
                }
                if (!bVar.f28326e) {
                    String str4 = C13523p.f29584a;
                    Class<C13523p> cls = C13523p.class;
                    String str5 = null;
                    if (!C13080a.m20762b(cls)) {
                        try {
                            if (!C13523p.f29586c.get()) {
                                C13523p.f29589f.mo46183b();
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.putAll(C13523p.f29587d);
                            hashMap.putAll(C13523p.f29589f.mo46182a());
                            str5 = C12869i0.m20552H(hashMap);
                        } catch (Throwable th) {
                            C13080a.m20761a(cls, th);
                        }
                    }
                    if (!(str5.length() == 0)) {
                        jSONObject.put("ud", str5);
                    }
                }
                String str6 = bVar.f28325d;
                if (str6 != null) {
                    jSONObject.put("installer_package", str6);
                }
            }
            try {
                C12869i0.m20559O(context, jSONObject);
            } catch (Exception e) {
                C12845c0.f28334f.mo45627c(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
            }
            JSONObject o = C12869i0.m20576o();
            if (o != null) {
                Iterator<String> keys = o.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, o.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th2) {
            C13501b.f29539b.readLock().unlock();
            throw th2;
        }
    }
}
