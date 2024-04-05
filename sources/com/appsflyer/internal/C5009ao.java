package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.C5030b;
import com.appsflyer.internal.C5072cj;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ao */
public final class C5009ao extends C5056bv {
    private static String onConversionDataFail = "https://%sdlsdk.%s/v1.0/android/";
    public static long onDeepLinkingNative;
    private final JSONObject AppsFlyerConversionListener = new JSONObject();
    public int onAppOpenAttributionNative;
    private boolean onAttributionFailure;
    private final List<C5072cj> onConversionDataSuccess = new ArrayList();
    private int onDeepLinking;
    private int onResponseError;
    private final C5021au onResponseErrorNative;
    private final CountDownLatch onResponseNative = new CountDownLatch(1);

    /* renamed from: com.appsflyer.internal.ao$5 */
    public static /* synthetic */ class C50135 {
        public static final /* synthetic */ int[] values;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appsflyer.internal.cj$e[] r0 = com.appsflyer.internal.C5072cj.C5074e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                values = r0
                com.appsflyer.internal.cj$e r1 = com.appsflyer.internal.C5072cj.C5074e.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = values     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.cj$e r1 = com.appsflyer.internal.C5072cj.C5074e.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5009ao.C50135.<clinit>():void");
        }
    }

    public C5009ao(Context context, C5021au auVar) {
        super((String) null, onConversionDataFail, Boolean.FALSE, Boolean.TRUE, (Boolean) null, context);
        this.onResponseErrorNative = auVar;
    }

    /* access modifiers changed from: private */
    public void valueOf(C5072cj cjVar) {
        if (AFKeystoreWrapper(cjVar)) {
            this.onConversionDataSuccess.add(cjVar);
            this.onResponseNative.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(cjVar.getClass().getSimpleName());
            AFLogger.valueOf(sb.toString());
            return;
        }
        int i = this.onDeepLinking + 1;
        this.onDeepLinking = i;
        if (i == this.onResponseError) {
            this.onResponseNative.countDown();
        }
    }

    public final void AFKeystoreWrapper(DeepLinkResult deepLinkResult) {
        try {
            this.AppsFlyerConversionListener.put(ResponseConstants.STATUS, deepLinkResult.getStatus().toString());
            this.AppsFlyerConversionListener.put("timeout_value", onDeepLinkingNative);
        } catch (JSONException unused) {
        }
        C5021au auVar = this.onResponseErrorNative;
        auVar.AFInAppEventParameterName.edit().putString("ddl", this.AppsFlyerConversionListener.toString()).apply();
        C5015aq.AFKeystoreWrapper(deepLinkResult);
    }

    private boolean AFInAppEventParameterName() {
        List list = (List) this.AFInAppEventParameterName.get("referrers");
        if ((list != null ? list.size() : 0) >= this.onResponseError || this.AFInAppEventParameterName.containsKey("referrers")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ec A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AFInAppEventType(android.content.Context r9) {
        /*
            r8 = this;
            int r0 = r8.onAppOpenAttributionNative
            r1 = 1
            int r0 = r0 + r1
            r8.onAppOpenAttributionNative = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[DDL] Preparing request "
            r0.<init>(r2)
            int r2 = r8.onAppOpenAttributionNative
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.valueOf(r0)
            int r0 = r8.onAppOpenAttributionNative
            if (r0 != r1) goto L_0x00ae
            com.appsflyer.internal.ag r0 = com.appsflyer.internal.C4986ag.AFInAppEventType()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.AFInAppEventParameterName
            boolean r3 = com.appsflyer.internal.C4986ag.valueOf((android.content.Context) r9)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "is_first"
            r2.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.AFInAppEventParameterName
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getLanguage()
            r3.append(r4)
            java.lang.String r4 = "-"
            r3.append(r4)
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "lang"
            r2.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.AFInAppEventParameterName
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r4 = "os"
            r2.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.AFInAppEventParameterName
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r4 = "type"
            r2.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.AFInAppEventParameterName
            java.lang.String r3 = r0.getAppsFlyerUID(r9)
            java.lang.String r4 = "request_id"
            r2.put(r4, r3)
            com.appsflyer.internal.o r0 = r0.onDeepLinkingNative
            if (r0 == 0) goto L_0x0087
            java.lang.String[] r0 = r0.AFInAppEventType
            if (r0 == 0) goto L_0x0087
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.AFInAppEventParameterName
            java.lang.String r3 = "sharing_filter"
            r2.put(r3, r0)
        L_0x0087:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.appsflyer.internal.b$e$a r0 = com.appsflyer.internal.C5115z.AFKeystoreWrapper(r9, r0)
            java.util.Map r0 = r8.AFInAppEventType((com.appsflyer.internal.C5030b.C5031e.C5032a) r0)
            com.appsflyer.internal.b$e$a r2 = com.appsflyer.internal.C5115z.AFInAppEventParameterName(r9)
            java.util.Map r2 = r8.AFInAppEventType((com.appsflyer.internal.C5030b.C5031e.C5032a) r2)
            if (r0 == 0) goto L_0x00a5
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.AFInAppEventParameterName
            java.lang.String r4 = "gaid"
            r3.put(r4, r0)
        L_0x00a5:
            if (r2 == 0) goto L_0x00ae
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.AFInAppEventParameterName
            java.lang.String r3 = "oaid"
            r0.put(r3, r2)
        L_0x00ae:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.AFInAppEventParameterName
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            r2.<init>(r4, r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "UTC"
            java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r5)
            r2.setTimeZone(r5)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r3)
            java.lang.String r2 = r2.format(r5)
            java.lang.String r3 = "timestamp"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.AFInAppEventParameterName
            int r2 = r8.onAppOpenAttributionNative
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "request_count"
            r0.put(r4, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.appsflyer.internal.cj> r2 = r8.onConversionDataSuccess
            java.util.Iterator r2 = r2.iterator()
        L_0x00ec:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0129
            java.lang.Object r4 = r2.next()
            com.appsflyer.internal.cj r4 = (com.appsflyer.internal.C5072cj) r4
            com.appsflyer.internal.cj$e r5 = r4.AFKeystoreWrapper
            com.appsflyer.internal.cj$e r6 = com.appsflyer.internal.C5072cj.C5074e.FINISHED
            if (r5 != r6) goto L_0x0122
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r6 = r4.AFInAppEventParameterName
            java.lang.String r7 = "referrer"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0122
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName
            java.lang.String r7 = "source"
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            r5.put(r7, r4)
            java.lang.String r4 = "value"
            r5.put(r4, r6)
            goto L_0x0123
        L_0x0122:
            r5 = 0
        L_0x0123:
            if (r5 == 0) goto L_0x00ec
            r0.add(r5)
            goto L_0x00ec
        L_0x0129:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0136
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.AFInAppEventParameterName
            java.lang.String r4 = "referrers"
            r2.put(r4, r0)
        L_0x0136:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getDevKey()
            java.lang.String r2 = r8.onInstallConversionFailureNative
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            com.appsflyer.AppsFlyerLib r6 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r6 = r6.getHostPrefix()
            r4[r5] = r6
            com.appsflyer.internal.ag r5 = com.appsflyer.internal.C4986ag.AFInAppEventType()
            java.lang.String r5 = r5.getHostName()
            r4[r1] = r5
            java.lang.String r1 = java.lang.String.format(r2, r4)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r9 = r9.getPackageName()
            android.net.Uri$Builder r9 = r1.appendPath(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.AFInAppEventParameterName
            java.lang.Object r2 = r2.get(r3)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = com.appsflyer.internal.C4985af.values(r1, r0)
            java.lang.String r1 = "af_sig"
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r1, r0)
            java.lang.String r0 = com.appsflyer.internal.C4986ag.values
            java.lang.String r1 = "sdk_version"
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r1, r0)
            android.net.Uri r9 = r9.build()
            java.lang.String r9 = r9.toString()
            r8.AFKeystoreWrapper(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5009ao.AFInAppEventType(android.content.Context):void");
    }

    private static boolean AFKeystoreWrapper(C5072cj cjVar) {
        Long l = (Long) cjVar.AFInAppEventParameterName.get("click_ts");
        if (l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    private Map<String, Object> AFInAppEventType(final C5030b.C5031e.C5032a aVar) {
        Boolean bool;
        boolean z = false;
        if (!(aVar == null || aVar.AFKeystoreWrapper == null || ((bool = aVar.valueOf) != null && bool.booleanValue()))) {
            z = true;
        }
        if (z) {
            return new HashMap<String, Object>() {
                {
                    put("type", "unhashed");
                    put("value", C5030b.C5031e.C5032a.this.AFKeystoreWrapper);
                }
            };
        }
        return null;
    }

    public static /* synthetic */ void AFInAppEventType(C5009ao aoVar) {
        ArrayList arrayList = new ArrayList();
        for (C5072cj cjVar : C4986ag.AFInAppEventType().init) {
            if (!(cjVar == null || cjVar.AFKeystoreWrapper == C5072cj.C5074e.NOT_STARTED)) {
                arrayList.add(cjVar);
            }
        }
        aoVar.onResponseError = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C5072cj cjVar2 = (C5072cj) it.next();
            int i = C50135.values[cjVar2.AFKeystoreWrapper.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(cjVar2.AFInAppEventParameterName.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.valueOf(sb.toString());
                aoVar.valueOf(cjVar2);
            } else if (i == 2) {
                cjVar2.addObserver(new Observer() {
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb = new StringBuilder("[DDL] ");
                        sb.append(cjVar2.AFInAppEventParameterName.get("source"));
                        sb.append(" referrer collected via observer");
                        AFLogger.valueOf(sb.toString());
                        C5009ao.this.valueOf((C5072cj) observable);
                    }
                });
            }
        }
    }

    public static /* synthetic */ DeepLinkResult AFInAppEventType(C5009ao aoVar, Context context) throws IOException, JSONException, InterruptedException {
        DeepLink deepLink;
        while (true) {
            long currentTimeMillis = System.currentTimeMillis();
            if (aoVar.onAppOpenAttributionNative == 1) {
                aoVar.AppsFlyerConversionListener.put("from_fg", currentTimeMillis - aoVar.onResponseErrorNative.AFInAppEventParameterName.getLong("fg_ts", 0));
            }
            HttpURLConnection AFInAppEventParameterName = new C4985af(aoVar).AFInAppEventParameterName();
            JSONArray optJSONArray = aoVar.AppsFlyerConversionListener.optJSONArray("net");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            optJSONArray.put(aoVar.onAppOpenAttributionNative - 1, currentTimeMillis2 - currentTimeMillis);
            aoVar.AppsFlyerConversionListener.put("net", optJSONArray);
            if (AFInAppEventParameterName.getResponseCode() == 200) {
                C4986ag.AFInAppEventType();
                JSONObject jSONObject = new JSONObject(C4986ag.AFInAppEventType(AFInAppEventParameterName));
                aoVar.onAttributionFailure = jSONObject.optBoolean("is_second_ping", true);
                if (!jSONObject.optBoolean("found")) {
                    deepLink = null;
                } else {
                    deepLink = DeepLink.AFKeystoreWrapper(jSONObject.optJSONObject("click_event"));
                    deepLink.AFInAppEventParameterName.put("is_deferred", true);
                }
                if (deepLink != null) {
                    return new DeepLinkResult(deepLink, (DeepLinkResult.Error) null);
                }
                if (aoVar.onAppOpenAttributionNative <= 1 && aoVar.AFInAppEventParameterName() && aoVar.onAttributionFailure) {
                    AFLogger.valueOf("[DDL] Waiting for referrers...");
                    aoVar.onResponseNative.await();
                    aoVar.AppsFlyerConversionListener.put("rfr_wait", System.currentTimeMillis() - currentTimeMillis2);
                    if (aoVar.onDeepLinking == aoVar.onResponseError) {
                        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
                    }
                    aoVar.AFInAppEventType(context);
                }
            } else {
                StringBuilder sb = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb.append(AFInAppEventParameterName.getResponseCode());
                AFLogger.valueOf(sb.toString());
                return new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
    }
}
