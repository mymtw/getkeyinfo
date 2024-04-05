package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AppsFlyerProperties;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.aj */
public abstract class C5001aj implements Runnable {
    public static String AFKeystoreWrapper = null;
    private static long AppsFlyer2dXConversionCallback = 0;
    private static char[] getLevel = null;
    private static int onAppOpenAttributionNative = 1;
    private static int onInstallConversionDataLoadedNative;
    private static String valueOf = "v2";
    public final String AFInAppEventParameterName;
    private final C4986ag AFInAppEventType;
    private final Context AFLogger$LogLevel;
    public final String AFVersionDeclaration = UUID.randomUUID().toString();
    public final Map<String, Object> init = AFKeystoreWrapper();
    public String values;

    static {
        AFInAppEventType();
        StringBuilder sb = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb.append(valueOf);
        AFKeystoreWrapper = sb.toString();
        int i = onInstallConversionDataLoadedNative + 39;
        onAppOpenAttributionNative = i % 128;
        int i2 = i % 2;
    }

    public C5001aj(C4986ag agVar, Context context, String str) {
        this.AFInAppEventType = agVar;
        this.AFLogger$LogLevel = context;
        this.AFInAppEventParameterName = str;
    }

    public static void AFInAppEventType() {
        getLevel = new char[]{'A', 2614, 5261, 7843, 10537, 13303, 15758, 18513, 21236, 23717, 26450, 28949};
        AppsFlyer2dXConversionCallback = -6360653961166648752L;
    }

    private Map<String, Object> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.4.3");
        hashMap.put("counter", Integer.valueOf(C4986ag.AFInAppEventType(C4986ag.AFInAppEventParameterName(this.AFLogger$LogLevel), "appsFlyerCount", false)));
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        try {
            hashMap.put("app_version_name", this.AFLogger$LogLevel.getPackageManager().getPackageInfo(this.AFLogger$LogLevel.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("app_id", this.AFLogger$LogLevel.getPackageName());
        hashMap.put("platformextension", new C5005an().AFInAppEventParameterName());
        int i = onInstallConversionDataLoadedNative + 125;
        onAppOpenAttributionNative = i % 128;
        if ((i % 2 == 0 ? '0' : 'O') != '0') {
            return hashMap;
        }
        throw null;
    }

    private static String values(int i, char c, int i2) {
        int i3 = onAppOpenAttributionNative + 89;
        onInstallConversionDataLoadedNative = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                return new String(cArr);
            }
            cArr[i5] = (char) ((int) ((((long) getLevel[i + i5]) ^ (((long) i5) * AppsFlyer2dXConversionCallback)) ^ ((long) c)));
            i5++;
            int i6 = onAppOpenAttributionNative + 7;
            onInstallConversionDataLoadedNative = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void AFInAppEventType(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, valueOf);
        String join = TextUtils.join("⁣", arrayList.toArray());
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getDevKey());
        sb.append(this.AFVersionDeclaration);
        sb.append(valueOf);
        httpsURLConnection.setRequestProperty(values(ViewConfiguration.getJumpTapTimeout() >> 16, (char) ExpandableListView.getPackedPositionType(0), 12 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), C4985af.values(join, sb.toString()));
        int i = onAppOpenAttributionNative + 71;
        onInstallConversionDataLoadedNative = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r7.valueOf()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "oneLinkUrl: "
            java.lang.String r2 = r3.concat(r2)
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r2)
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0070 }
            r2.<init>(r1)     // Catch:{ all -> 0x0070 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x0070 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "content-type"
            java.lang.String r4 = "application/json"
            r2.setRequestProperty(r3, r4)     // Catch:{ all -> 0x0070 }
            r3 = 3000(0xbb8, float:4.204E-42)
            r2.setReadTimeout(r3)     // Catch:{ all -> 0x0070 }
            r2.setConnectTimeout(r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = r7.AFInAppEventParameterName     // Catch:{ all -> 0x0070 }
            r2.setRequestMethod(r3)     // Catch:{ all -> 0x0070 }
            r7.valueOf(r2)     // Catch:{ all -> 0x0070 }
            int r3 = r2.getResponseCode()     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = com.appsflyer.internal.C4986ag.AFInAppEventType((java.net.HttpURLConnection) r2)     // Catch:{ all -> 0x0070 }
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 1
            if (r3 != r4) goto L_0x0044
            r4 = r5
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            if (r4 == r5) goto L_0x006a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "Response code = "
            r0.<init>(r4)     // Catch:{ all -> 0x0068 }
            r0.append(r3)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = " content = "
            r0.append(r3)     // Catch:{ all -> 0x0068 }
            r0.append(r2)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0068 }
            int r1 = onAppOpenAttributionNative
            int r1 = r1 + 21
            int r3 = r1 % 128
            onInstallConversionDataLoadedNative = r3
            int r1 = r1 % 2
            goto L_0x0099
        L_0x0068:
            r0 = move-exception
            goto L_0x0074
        L_0x006a:
            java.lang.String r3 = "Status 200 ok"
            com.appsflyer.AFLogger.AFInAppEventType(r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0099
        L_0x0070:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
        L_0x0074:
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Error while calling "
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r3, (java.lang.Throwable) r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " stacktrace: "
            r3.append(r1)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x0099:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 96
            if (r1 == 0) goto L_0x00a3
            r1 = r3
            goto L_0x00a5
        L_0x00a3:
            r1 = 48
        L_0x00a5:
            if (r1 == r3) goto L_0x00b8
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Connection error: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r0)
            r7.values()
            return
        L_0x00b8:
            int r0 = onAppOpenAttributionNative
            int r0 = r0 + 55
            int r1 = r0 % 128
            onInstallConversionDataLoadedNative = r1
            int r0 = r0 % 2
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Connection call succeeded: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.AFInAppEventType(r0)
            r7.values(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5001aj.run():void");
    }

    public abstract String valueOf();

    public abstract void valueOf(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    public abstract void values();

    public abstract void values(String str);
}
