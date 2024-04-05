package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.bn */
public final class C5047bn {
    public static void AFKeystoreWrapper(C4986ag agVar, C5089f fVar, String str, Context context, SharedPreferences sharedPreferences, Integer num, Throwable th) {
        C4986ag agVar2 = agVar;
        Context context2 = context;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (fVar.AFInAppEventType()) {
            if (C4986ag.valueOf == null) {
                AFLogger.valueOf("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
                return;
            }
            StringBuilder sb = new StringBuilder("[GCD-A01] Loading conversion data. Counter: ");
            sb.append(fVar.onAttributionFailureNative);
            AFLogger.valueOf(sb.toString());
            long j = sharedPreferences2.getLong("appsflyerConversionDataCacheExpiration", 0);
            if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
                AFLogger.valueOf("[GCD-E02] Cached conversion data expired");
                C4986ag.AFInAppEventParameterName(context2, "sixtyDayConversionData");
                C4986ag.valueOf(context2, "attributionId", (String) null);
                agVar.AFInAppEventParameterName(context2, "appsflyerConversionDataCacheExpiration", 0);
            }
            if (sharedPreferences2.getString("attributionId", (String) null) != null) {
                if (C4986ag.AFInAppEventType(sharedPreferences2, "appsFlyerCount", false) > 1) {
                    try {
                        Map<String, Object> valueOf = valueOf(context);
                        if (valueOf != null) {
                            try {
                                if (!valueOf.containsKey("is_first_launch")) {
                                    valueOf.put("is_first_launch", Boolean.FALSE);
                                }
                                C5055bu.valueOf(valueOf);
                            } catch (Throwable th2) {
                                AFLogger.AFKeystoreWrapper(th2.getLocalizedMessage(), th2);
                            }
                        }
                    } catch (C5048bo e) {
                        AFLogger.AFKeystoreWrapper(e.getMessage(), (Throwable) e);
                    }
                }
            } else if (th != null) {
                StringBuilder sb2 = new StringBuilder("Launch exception: ");
                sb2.append(th.getMessage());
                C5055bu.AFInAppEventType(sb2.toString());
            } else if (num.intValue() != 200) {
                C5055bu.AFInAppEventType("Launch status code: ".concat(String.valueOf(num)));
            } else {
                C5055bu buVar = new C5055bu(agVar, (Application) context.getApplicationContext(), str);
                C4986ag.AFInAppEventType(buVar.AFInAppEventType, buVar, 10, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static Map<String, Object> valueOf(Context context) throws C5048bo {
        String string = C4986ag.AFInAppEventParameterName(context).getString("attributionId", (String) null);
        if (string != null && string.length() > 0) {
            return values(string);
        }
        throw new C5048bo();
    }

    public static Map<String, Object> values(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("is_cache")) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), (Throwable) e);
            return null;
        }
    }
}
