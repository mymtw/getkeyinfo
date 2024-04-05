package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.appsflyer.internal.bu */
public final class C5055bu implements Runnable {
    private static String valueOf = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> values = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
    private final String AFInAppEventParameterName;
    public final ScheduledExecutorService AFInAppEventType;
    private final Application AFKeystoreWrapper;
    private final C4986ag AFLogger$LogLevel;
    private final int AFVersionDeclaration;
    private final AtomicInteger AppsFlyer2dXConversionCallback;

    public C5055bu(C4986ag agVar, Application application, String str) {
        if (C5097l.AFInAppEventType == null) {
            C5097l.AFInAppEventType = new C5097l();
        }
        this.AFInAppEventType = C5097l.AFInAppEventType.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = agVar;
        this.AFKeystoreWrapper = application;
        this.AFInAppEventParameterName = str;
        this.AFVersionDeclaration = 0;
    }

    public static void AFInAppEventType(String str) {
        if (C4986ag.valueOf != null) {
            AFLogger.valueOf("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            C4986ag.valueOf.onConversionDataFail(str);
        }
    }

    public static void valueOf(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb.append(map.toString());
        AFLogger.valueOf(sb.toString());
        C4986ag.valueOf.onConversionDataSuccess(map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6 A[Catch:{ all -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0114 A[Catch:{ bo -> 0x026d, all -> 0x0296 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0132 A[Catch:{ bo -> 0x026d, all -> 0x0296 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a0 A[Catch:{ bo -> 0x026d, all -> 0x0296 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x029e A[Catch:{ all -> 0x02d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ad A[Catch:{ all -> 0x02d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c2 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "is_first_launch"
            java.lang.String r2 = "af_siteid"
            java.lang.String r3 = r1.AFInAppEventParameterName
            if (r3 == 0) goto L_0x02dc
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0012
            goto L_0x02dc
        L_0x0012:
            com.appsflyer.internal.ag r3 = r1.AFLogger$LogLevel
            boolean r3 = r3.isStopped()
            if (r3 == 0) goto L_0x0025
            java.lang.String r0 = "[GCD-E03] 'isStopTracking' enabled"
            com.appsflyer.AFLogger.valueOf(r0)
            java.lang.String r0 = "'isStopTracking' enabled"
            AFInAppEventType(r0)
            return
        L_0x0025:
            java.util.concurrent.atomic.AtomicInteger r3 = r1.AppsFlyer2dXConversionCallback
            r3.incrementAndGet()
            r3 = 0
            r6 = 2
            android.app.Application r7 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x0299 }
            if (r7 != 0) goto L_0x0040
            java.lang.String r0 = "[GCD-E06] Context null"
            com.appsflyer.AFLogger.valueOf(r0)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "Context null"
            AFInAppEventType(r0)     // Catch:{ all -> 0x0299 }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            return
        L_0x0040:
            com.appsflyer.internal.ag r8 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x0299 }
            java.lang.String r9 = r8.AFInAppEventType((android.content.Context) r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = r8.values((android.content.Context) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0299 }
            java.lang.String r8 = ""
            r9 = 1
            r10 = 0
            if (r7 == 0) goto L_0x0070
            java.util.List<java.lang.String> r11 = values     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = r7.toLowerCase()     // Catch:{ all -> 0x0299 }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x0299 }
            if (r11 != 0) goto L_0x0063
            java.lang.String r11 = "-"
            java.lang.String r7 = r11.concat(r7)     // Catch:{ all -> 0x0299 }
            goto L_0x0071
        L_0x0063:
            java.lang.String r11 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ all -> 0x0299 }
            r12[r10] = r7     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = java.lang.String.format(r11, r12)     // Catch:{ all -> 0x0299 }
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r7)     // Catch:{ all -> 0x0299 }
        L_0x0070:
            r7 = r8
        L_0x0071:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0299 }
            r11.<init>()     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = valueOf     // Catch:{ all -> 0x0299 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0299 }
            com.appsflyer.AppsFlyerLib r14 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ all -> 0x0299 }
            java.lang.String r14 = r14.getHostPrefix()     // Catch:{ all -> 0x0299 }
            r13[r10] = r14     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.ag r14 = com.appsflyer.internal.C4986ag.AFInAppEventType()     // Catch:{ all -> 0x0299 }
            java.lang.String r14 = r14.getHostName()     // Catch:{ all -> 0x0299 }
            r13[r9] = r14     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = java.lang.String.format(r12, r13)     // Catch:{ all -> 0x0299 }
            r11.append(r12)     // Catch:{ all -> 0x0299 }
            android.app.Application r12 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ all -> 0x0299 }
            r11.append(r12)     // Catch:{ all -> 0x0299 }
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = "?devkey="
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = r1.AFInAppEventParameterName     // Catch:{ all -> 0x0299 }
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = "&device_id="
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0299 }
            android.app.Application r12 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x0299 }
            r7.<init>(r12)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = com.appsflyer.internal.C5003al.AFInAppEventParameterName(r7)     // Catch:{ all -> 0x0299 }
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.ak r11 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0299 }
            if (r11 != 0) goto L_0x00cd
            com.appsflyer.internal.ak r11 = new com.appsflyer.internal.ak     // Catch:{ all -> 0x0299 }
            r11.<init>()     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.C5002ak.AFInAppEventType = r11     // Catch:{ all -> 0x0299 }
        L_0x00cd:
            com.appsflyer.internal.ak r11 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = "server_request"
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch:{ all -> 0x0299 }
            r11.valueOf(r12, r7, r8)     // Catch:{ all -> 0x0299 }
            java.lang.String r8 = "[GCD-B01] URL: "
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r8 = r8.concat(r11)     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.C5004am.AFInAppEventType(r8)     // Catch:{ all -> 0x0299 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0299 }
            java.net.URL r8 = new java.net.URL     // Catch:{ all -> 0x0299 }
            r8.<init>(r7)     // Catch:{ all -> 0x0299 }
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ all -> 0x0299 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ all -> 0x0299 }
            java.lang.String r3 = "GET"
            r8.setRequestMethod(r3)     // Catch:{ all -> 0x0296 }
            r3 = 10000(0x2710, float:1.4013E-41)
            r8.setConnectTimeout(r3)     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = "Connection"
            java.lang.String r13 = "close"
            r8.setRequestProperty(r3, r13)     // Catch:{ all -> 0x0296 }
            r8.connect()     // Catch:{ all -> 0x0296 }
            int r3 = r8.getResponseCode()     // Catch:{ all -> 0x0296 }
            java.lang.String r13 = com.appsflyer.internal.C4986ag.AFInAppEventType((java.net.HttpURLConnection) r8)     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.ak r14 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0296 }
            if (r14 != 0) goto L_0x011b
            com.appsflyer.internal.ak r14 = new com.appsflyer.internal.ak     // Catch:{ all -> 0x0296 }
            r14.<init>()     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.C5002ak.AFInAppEventType = r14     // Catch:{ all -> 0x0296 }
        L_0x011b:
            com.appsflyer.internal.ak r14 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0296 }
            java.lang.String r15 = "server_response"
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ all -> 0x0296 }
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0296 }
            r4[r10] = r5     // Catch:{ all -> 0x0296 }
            r4[r9] = r13     // Catch:{ all -> 0x0296 }
            r14.valueOf(r15, r7, r4)     // Catch:{ all -> 0x0296 }
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 404(0x194, float:5.66E-43)
            if (r3 == r4) goto L_0x0160
            if (r3 != r5) goto L_0x0135
            goto L_0x0160
        L_0x0135:
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x013d
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 < r0) goto L_0x0151
        L_0x013d:
            int r0 = r1.AFVersionDeclaration     // Catch:{ all -> 0x0296 }
            if (r0 >= r6) goto L_0x0151
            com.appsflyer.internal.bu r0 = new com.appsflyer.internal.bu     // Catch:{ all -> 0x0296 }
            r0.<init>(r1)     // Catch:{ all -> 0x0296 }
            java.util.concurrent.ScheduledExecutorService r2 = r0.AFInAppEventType     // Catch:{ all -> 0x0296 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0296 }
            r4 = 10
            com.appsflyer.internal.C4986ag.AFInAppEventType(r2, r0, r4, r3)     // Catch:{ all -> 0x0296 }
            goto L_0x028d
        L_0x0151:
            java.lang.String r0 = "Error connection to server: "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0296 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x0296 }
            AFInAppEventType(r0)     // Catch:{ all -> 0x0296 }
            goto L_0x028d
        L_0x0160:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0296 }
            r4.<init>()     // Catch:{ all -> 0x0296 }
            java.lang.String r7 = "net"
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0296 }
            long r14 = r14 - r11
            r4.put(r7, r14)     // Catch:{ all -> 0x0296 }
            java.lang.String r7 = "retries"
            int r11 = r1.AFVersionDeclaration     // Catch:{ all -> 0x0296 }
            r4.put(r7, r11)     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.ag r7 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.au r7 = r7.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0296 }
            java.lang.String r11 = "gcd"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0296 }
            android.content.SharedPreferences r7 = r7.AFInAppEventParameterName     // Catch:{ all -> 0x0296 }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ all -> 0x0296 }
            android.content.SharedPreferences$Editor r4 = r7.putString(r11, r4)     // Catch:{ all -> 0x0296 }
            r4.apply()     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = "Attribution data: "
            java.lang.String r7 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = r4.concat(r7)     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.C5004am.AFInAppEventType(r4)     // Catch:{ all -> 0x0296 }
            int r4 = r13.length()     // Catch:{ all -> 0x0296 }
            if (r4 <= 0) goto L_0x028d
            java.util.Map r4 = com.appsflyer.internal.C5047bn.values(r13)     // Catch:{ all -> 0x0296 }
            java.lang.String r7 = "iscache"
            java.lang.Object r7 = r4.get(r7)     // Catch:{ all -> 0x0296 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0296 }
            if (r3 != r5) goto L_0x01c6
            java.lang.String r3 = "error_reason"
            r4.remove(r3)     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = "status_code"
            r4.remove(r3)     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = "af_status"
            java.lang.String r5 = "Organic"
            r4.put(r3, r5)     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = "af_message"
            java.lang.String r5 = "organic install"
            r4.put(r3, r5)     // Catch:{ all -> 0x0296 }
        L_0x01c6:
            if (r7 == 0) goto L_0x01db
            boolean r3 = r7.booleanValue()     // Catch:{ all -> 0x0296 }
            if (r3 != 0) goto L_0x01db
            com.appsflyer.internal.ag r3 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x0296 }
            android.app.Application r5 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x0296 }
            java.lang.String r7 = "appsflyerConversionDataCacheExpiration"
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0296 }
            r3.AFInAppEventParameterName((android.content.Context) r5, (java.lang.String) r7, (long) r11)     // Catch:{ all -> 0x0296 }
        L_0x01db:
            boolean r3 = r4.containsKey(r2)     // Catch:{ all -> 0x0296 }
            java.lang.String r5 = "[Invite] Detected App-Invite via channel: "
            java.lang.String r7 = "af_channel"
            if (r3 == 0) goto L_0x0210
            boolean r3 = r4.containsKey(r7)     // Catch:{ all -> 0x0296 }
            if (r3 == 0) goto L_0x01ff
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0296 }
            r3.<init>(r5)     // Catch:{ all -> 0x0296 }
            java.lang.Object r11 = r4.get(r7)     // Catch:{ all -> 0x0296 }
            r3.append(r11)     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0296 }
            com.appsflyer.AFLogger.valueOf(r3)     // Catch:{ all -> 0x0296 }
            goto L_0x0210
        L_0x01ff:
            java.lang.String r3 = "[CrossPromotion] App was installed via %s's Cross Promotion"
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x0296 }
            java.lang.Object r12 = r4.get(r2)     // Catch:{ all -> 0x0296 }
            r11[r10] = r12     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = java.lang.String.format(r3, r11)     // Catch:{ all -> 0x0296 }
            com.appsflyer.AFLogger.valueOf(r3)     // Catch:{ all -> 0x0296 }
        L_0x0210:
            boolean r2 = r4.containsKey(r2)     // Catch:{ all -> 0x0296 }
            if (r2 == 0) goto L_0x0229
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0296 }
            r2.<init>(r5)     // Catch:{ all -> 0x0296 }
            java.lang.Object r3 = r4.get(r7)     // Catch:{ all -> 0x0296 }
            r2.append(r3)     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0296 }
            com.appsflyer.AFLogger.valueOf(r2)     // Catch:{ all -> 0x0296 }
        L_0x0229:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0296 }
            r4.put(r0, r2)     // Catch:{ all -> 0x0296 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0296 }
            r2.<init>(r4)     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = "attributionId"
            if (r2 == 0) goto L_0x0241
            android.app.Application r5 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.C4986ag.valueOf(r5, r3, r2)     // Catch:{ all -> 0x0296 }
            goto L_0x0246
        L_0x0241:
            android.app.Application r2 = r1.AFKeystoreWrapper     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.C4986ag.valueOf(r2, r3, r13)     // Catch:{ all -> 0x0296 }
        L_0x0246:
            com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.internal.C4986ag.valueOf     // Catch:{ all -> 0x0296 }
            if (r2 == 0) goto L_0x028d
            java.util.concurrent.atomic.AtomicInteger r2 = r1.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0296 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0296 }
            if (r2 > r9) goto L_0x028d
            android.app.Application r2 = r1.AFKeystoreWrapper     // Catch:{ bo -> 0x026d }
            java.util.Map r2 = com.appsflyer.internal.C5047bn.valueOf(r2)     // Catch:{ bo -> 0x026d }
            android.app.Application r3 = r1.AFKeystoreWrapper     // Catch:{ bo -> 0x026d }
            android.content.SharedPreferences r3 = com.appsflyer.internal.C4986ag.AFInAppEventParameterName((android.content.Context) r3)     // Catch:{ bo -> 0x026d }
            java.lang.String r5 = "sixtyDayConversionData"
            boolean r3 = r3.getBoolean(r5, r10)     // Catch:{ bo -> 0x026d }
            if (r3 != 0) goto L_0x026b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ bo -> 0x026d }
            r2.put(r0, r3)     // Catch:{ bo -> 0x026d }
        L_0x026b:
            r4 = r2
            goto L_0x0273
        L_0x026d:
            r0 = move-exception
            java.lang.String r2 = "Exception while trying to fetch attribution data. "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0296 }
        L_0x0273:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = "[GCD-A02] Calling onConversionDataSuccess with:\n"
            r0.<init>(r2)     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0296 }
            r0.append(r2)     // Catch:{ all -> 0x0296 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0296 }
            com.appsflyer.AFLogger.valueOf(r0)     // Catch:{ all -> 0x0296 }
            com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.internal.C4986ag.valueOf     // Catch:{ all -> 0x0296 }
            r0.onConversionDataSuccess(r4)     // Catch:{ all -> 0x0296 }
        L_0x028d:
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            r8.disconnect()
            goto L_0x02c5
        L_0x0296:
            r0 = move-exception
            r3 = r8
            goto L_0x029a
        L_0x0299:
            r0 = move-exception
        L_0x029a:
            int r2 = r1.AFVersionDeclaration     // Catch:{ all -> 0x02d0 }
            if (r2 >= r6) goto L_0x02ad
            com.appsflyer.internal.bu r2 = new com.appsflyer.internal.bu     // Catch:{ all -> 0x02d0 }
            r2.<init>(r1)     // Catch:{ all -> 0x02d0 }
            java.util.concurrent.ScheduledExecutorService r4 = r2.AFInAppEventType     // Catch:{ all -> 0x02d0 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02d0 }
            r6 = 10
            com.appsflyer.internal.C4986ag.AFInAppEventType(r4, r2, r6, r5)     // Catch:{ all -> 0x02d0 }
            goto L_0x02b4
        L_0x02ad:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02d0 }
            AFInAppEventType(r2)     // Catch:{ all -> 0x02d0 }
        L_0x02b4:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02d0 }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x02d0 }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            if (r3 == 0) goto L_0x02c5
            r3.disconnect()
        L_0x02c5:
            java.util.concurrent.ScheduledExecutorService r0 = r1.AFInAppEventType
            r0.shutdown()
            java.lang.String r0 = "[GCD-A03] Server retrieving attempt finished"
            com.appsflyer.AFLogger.valueOf(r0)
            return
        L_0x02d0:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicInteger r2 = r1.AppsFlyer2dXConversionCallback
            r2.decrementAndGet()
            if (r3 == 0) goto L_0x02db
            r3.disconnect()
        L_0x02db:
            throw r0
        L_0x02dc:
            java.lang.String r0 = "[GCD-E05] AppsFlyer dev key is missing"
            com.appsflyer.AFLogger.valueOf(r0)
            java.lang.String r0 = "AppsFlyer dev key is missing"
            AFInAppEventType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5055bu.run():void");
    }

    private C5055bu(C5055bu buVar) {
        if (C5097l.AFInAppEventType == null) {
            C5097l.AFInAppEventType = new C5097l();
        }
        this.AFInAppEventType = C5097l.AFInAppEventType.AFInAppEventType();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = buVar.AFLogger$LogLevel;
        this.AFKeystoreWrapper = buVar.AFKeystoreWrapper;
        this.AFInAppEventParameterName = buVar.AFInAppEventParameterName;
        this.AFVersionDeclaration = buVar.AFVersionDeclaration + 1;
    }
}
