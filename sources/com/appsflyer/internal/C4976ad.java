package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ad */
public final class C4976ad implements Runnable {
    private static String AFInAppEventType = null;
    private static String AFKeystoreWrapper = "https://%ssdk-services.%s/validate-android-signature";
    /* access modifiers changed from: private */
    public WeakReference<Context> AFInAppEventParameterName;
    private String AFLogger$LogLevel;
    /* access modifiers changed from: private */
    public Map<String, String> AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String valueOf;
    private String values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(C4986ag.values);
        sb.append("/androidevent?buildnumber=6.4.3&app_id=");
        AFInAppEventType = sb.toString();
    }

    public C4976ad(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFInAppEventParameterName = new WeakReference<>(context);
        this.values = str;
        this.valueOf = str2;
        this.AFLogger$LogLevel = str4;
        this.AppsFlyer2dXConversionCallback = str5;
        this.getLevel = str6;
        this.AFVersionDeclaration = map;
        this.init = str3;
    }

    private static HttpURLConnection AFInAppEventType(C5059by byVar) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(byVar.onInstallConversionFailureNative);
        AFLogger.valueOf(sb.toString());
        byVar.onAppOpenAttribution = AppsFlyerLib.getInstance().isStopped();
        return new C4985af(byVar).AFInAppEventParameterName();
    }

    public final void run() {
        String str = this.values;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.AFInAppEventParameterName.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.valueOf);
                    hashMap.put("sig-data", this.AFLogger$LogLevel);
                    hashMap.put("signature", this.init);
                    final HashMap hashMap2 = new HashMap(hashMap);
                    new Thread(new Runnable() {
                        public final void run() {
                            C4976ad adVar = C4976ad.this;
                            C4976ad.valueOf(adVar, hashMap2, adVar.AFVersionDeclaration, C4976ad.this.AFInAppEventParameterName);
                        }
                    }).start();
                    hashMap.put("dev_key", this.values);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    String string = AppsFlyerProperties.getInstance().getString("advertiserId");
                    if (string != null) {
                        hashMap.put("advertiserId", string);
                    }
                    String jSONObject = new JSONObject(hashMap).toString();
                    String format = String.format(AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()});
                    if (C5002ak.AFInAppEventType == null) {
                        C5002ak.AFInAppEventType = new C5002ak();
                    }
                    C5002ak.AFInAppEventType.valueOf("server_request", format, jSONObject);
                    HttpURLConnection AFInAppEventType2 = AFInAppEventType((C5059by) new C5065ce().AFInAppEventType(hashMap).AFKeystoreWrapper(format));
                    int i = -1;
                    if (AFInAppEventType2 != null) {
                        i = AFInAppEventType2.getResponseCode();
                    }
                    C4986ag.AFInAppEventType();
                    String AFInAppEventType3 = C4986ag.AFInAppEventType(AFInAppEventType2);
                    if (C5002ak.AFInAppEventType == null) {
                        C5002ak.AFInAppEventType = new C5002ak();
                    }
                    C5002ak.AFInAppEventType.valueOf("server_response", format, String.valueOf(i), AFInAppEventType3);
                    JSONObject jSONObject2 = new JSONObject(AFInAppEventType3);
                    jSONObject2.put(ResponseConstants.CODE, i);
                    if (i == 200) {
                        StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                        sb.append(jSONObject2.toString());
                        AFLogger.AFInAppEventType(sb.toString());
                        valueOf(jSONObject2.optBoolean("result"), this.AFLogger$LogLevel, this.AppsFlyer2dXConversionCallback, this.getLevel, jSONObject2.toString());
                    } else {
                        AFLogger.AFInAppEventType("Failed Validate request");
                        valueOf(false, this.AFLogger$LogLevel, this.AppsFlyer2dXConversionCallback, this.getLevel, jSONObject2.toString());
                    }
                    if (AFInAppEventType2 != null) {
                        AFInAppEventType2.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    private static void valueOf(boolean z, String str, String str2, String str3, String str4) {
        if (C4986ag.AFInAppEventParameterName != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.valueOf(sb.toString());
            if (z) {
                AFLogger.valueOf("Validate in app purchase success: ".concat(String.valueOf(str4)));
                C4986ag.AFInAppEventParameterName.onValidateInApp();
                return;
            }
            AFLogger.valueOf("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = C4986ag.AFInAppEventParameterName;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    public static /* synthetic */ void valueOf(C4976ad adVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            C4965ab.AFKeystoreWrapper((Context) weakReference.get()).valueOf();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFInAppEventType, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()}));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            String string = C4986ag.AFInAppEventParameterName((Context) weakReference.get()).getString("referrer", "");
            C5066cf cfVar = new C5066cf((Context) weakReference.get());
            cfVar.init = adVar.values;
            cfVar.AFVersionDeclaration = string;
            C4986ag AFInAppEventType2 = C4986ag.AFInAppEventType();
            Map<String, Object> values2 = AFInAppEventType2.values((C5089f) cfVar);
            values2.put(ResponseConstants.PRICE, adVar.AppsFlyer2dXConversionCallback);
            values2.put("currency", adVar.getLevel);
            values2.put("receipt_data", map);
            if (map2 != null) {
                values2.put("extra_prms", map2);
            }
            values2.putAll(AFInAppEventType2.AFInAppEventParameterName());
            String jSONObject = new JSONObject(values2).toString();
            if (C5002ak.AFInAppEventType == null) {
                C5002ak.AFInAppEventType = new C5002ak();
            }
            C5002ak.AFInAppEventType.valueOf("server_request", obj, jSONObject);
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection AFInAppEventType3 = AFInAppEventType((C5059by) cfVar.AFInAppEventType(values2).AFKeystoreWrapper(obj));
                int i = -1;
                if (AFInAppEventType3 != null) {
                    i = AFInAppEventType3.getResponseCode();
                }
                String AFInAppEventType4 = C4986ag.AFInAppEventType(AFInAppEventType3);
                if (C5002ak.AFInAppEventType == null) {
                    C5002ak.AFInAppEventType = new C5002ak();
                }
                C5002ak.AFInAppEventType.valueOf("server_response", obj, String.valueOf(i), AFInAppEventType4);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(i);
                sb2.append(": ");
                sb2.append(new JSONObject(AFInAppEventType4).toString());
                AFLogger.AFInAppEventType(sb2.toString());
                if (AFInAppEventType3 != null) {
                    AFInAppEventType3.disconnect();
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }
}
