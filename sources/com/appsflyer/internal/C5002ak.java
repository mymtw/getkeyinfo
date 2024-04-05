package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.editable.EditableListing;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.appsflyer.internal.ak */
public final class C5002ak {
    public static C5002ak AFInAppEventType;
    public boolean AFInAppEventParameterName = (true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false));
    private Map<String, Object> AFKeystoreWrapper;
    private String AppsFlyer2dXConversionCallback = EditableListing.LISTING_ID_DEVICE_DRAFT;
    private int getLevel = 0;
    private boolean init = false;
    private boolean valueOf = true;
    private List<String> values = new ArrayList();

    private synchronized void AFInAppEventType(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.AFKeystoreWrapper.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.AFKeystoreWrapper.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.AFKeystoreWrapper.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.AFKeystoreWrapper.put("preInstall", str4);
        }
    }

    private boolean getLevel() {
        if (this.AFInAppEventParameterName) {
            return this.valueOf || this.init;
        }
        return false;
    }

    private synchronized void init() {
        this.values = new ArrayList();
        this.getLevel = 0;
    }

    public final synchronized Map<String, Object> AFInAppEventParameterName() {
        this.AFKeystoreWrapper.put("data", this.values);
        init();
        return this.AFKeystoreWrapper;
    }

    public final synchronized void AFKeystoreWrapper(String str) {
        this.AppsFlyer2dXConversionCallback = str;
    }

    public final boolean AFLogger$LogLevel() {
        return this.init;
    }

    public final synchronized void valueOf() {
        valueOf("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.init = false;
        this.valueOf = false;
    }

    public final synchronized void values() {
        this.AFKeystoreWrapper = null;
        AFInAppEventType = null;
    }

    public final synchronized void AFKeystoreWrapper() {
        this.init = true;
        valueOf("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    private synchronized void values(String str, String str2, String str3) {
        try {
            this.AFKeystoreWrapper.put("brand", Build.BRAND);
            this.AFKeystoreWrapper.put("model", Build.MODEL);
            this.AFKeystoreWrapper.put("platform", "Android");
            this.AFKeystoreWrapper.put("platform_version", Build.VERSION.RELEASE);
            if (str != null && str.length() > 0) {
                this.AFKeystoreWrapper.put("advertiserId", str);
            }
            if (str2 != null && str2.length() > 0) {
                this.AFKeystoreWrapper.put("imei", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFKeystoreWrapper.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        try {
            this.AFKeystoreWrapper.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.AFKeystoreWrapper.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFKeystoreWrapper.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.AFKeystoreWrapper.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    public static String[] AFKeystoreWrapper(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[(stackTraceElementArr.length + 1)];
        strArr[0] = str;
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            strArr[i] = stackTraceElementArr[i].toString();
        }
        return strArr;
    }

    public final synchronized void AFInAppEventType() {
        this.valueOf = false;
        init();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void valueOf(java.lang.String r4, java.lang.String r5, java.lang.String... r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.getLevel()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0091
            int r0 = r3.getLevel     // Catch:{ all -> 0x0093 }
            r1 = 98304(0x18000, float:1.37753E-40)
            if (r0 < r1) goto L_0x0010
            goto L_0x0091
        L_0x0010:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = ", "
            java.lang.String r6 = android.text.TextUtils.join(r2, r6)     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0051
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r2.<init>()     // Catch:{ all -> 0x008f }
            r2.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " "
            r2.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008f }
            long r0 = r0.getId()     // Catch:{ all -> 0x008f }
            r2.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " _/AppsFlyer_6.4.3 ["
            r2.append(r0)     // Catch:{ all -> 0x008f }
            r2.append(r4)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "] "
            r2.append(r4)     // Catch:{ all -> 0x008f }
            r2.append(r5)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = " "
            r2.append(r4)     // Catch:{ all -> 0x008f }
            r2.append(r6)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x008f }
            goto L_0x007d
        L_0x0051:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r4.<init>()     // Catch:{ all -> 0x008f }
            r4.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " "
            r4.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008f }
            long r0 = r0.getId()     // Catch:{ all -> 0x008f }
            r4.append(r0)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = " "
            r4.append(r0)     // Catch:{ all -> 0x008f }
            r4.append(r5)     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "/AppsFlyer_6.4.3 "
            r4.append(r5)     // Catch:{ all -> 0x008f }
            r4.append(r6)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x008f }
        L_0x007d:
            java.util.List<java.lang.String> r5 = r3.values     // Catch:{ all -> 0x008f }
            r5.add(r4)     // Catch:{ all -> 0x008f }
            int r5 = r3.getLevel     // Catch:{ all -> 0x008f }
            int r4 = r4.length()     // Catch:{ all -> 0x008f }
            int r4 = r4 << 1
            int r5 = r5 + r4
            r3.getLevel = r5     // Catch:{ all -> 0x008f }
            monitor-exit(r3)
            return
        L_0x008f:
            monitor-exit(r3)
            return
        L_0x0091:
            monitor-exit(r3)
            return
        L_0x0093:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5002ak.valueOf(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x006e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void values(java.lang.String r7, android.content.pm.PackageManager r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = "remote_debug_static_data"
            java.lang.String r2 = r0.getString(r1)     // Catch:{ all -> 0x0087 }
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x007c }
            r7.<init>(r2)     // Catch:{ all -> 0x007c }
            java.util.Map r7 = com.appsflyer.internal.C5100n.AFInAppEventParameterName((org.json.JSONObject) r7)     // Catch:{ all -> 0x007c }
            r6.AFKeystoreWrapper = r7     // Catch:{ all -> 0x007c }
            goto L_0x007c
        L_0x0019:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0087 }
            r2.<init>()     // Catch:{ all -> 0x0087 }
            r6.AFKeystoreWrapper = r2     // Catch:{ all -> 0x0087 }
            com.appsflyer.internal.ag r2 = com.appsflyer.internal.C4986ag.AFInAppEventType()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "advertiserId"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = r2.getLevel     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r2.AFLogger$LogLevel     // Catch:{ all -> 0x0087 }
            r6.values(r3, r4, r2)     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "6.4.3."
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = com.appsflyer.internal.C4986ag.AFInAppEventType     // Catch:{ all -> 0x0087 }
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r0.getDevKey()     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = "KSAppsFlyerId"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "uid"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x0087 }
            r6.valueOf(r2, r3, r4, r5)     // Catch:{ all -> 0x0087 }
            r2 = 0
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r7, r2)     // Catch:{ all -> 0x006e }
            int r8 = r8.versionCode     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "channel"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x006e }
            java.lang.String r3 = "preInstallName"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x006e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x006e }
            r6.AFInAppEventType(r7, r8, r2, r3)     // Catch:{ all -> 0x006e }
        L_0x006e:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0087 }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x0087 }
            r7.<init>(r8)     // Catch:{ all -> 0x0087 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0087 }
            r0.set((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x0087 }
        L_0x007c:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x0087 }
            java.lang.String r8 = "launch_counter"
            java.lang.String r0 = r6.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0087 }
            r7.put(r8, r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r6)
            return
        L_0x0087:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5002ak.values(java.lang.String, android.content.pm.PackageManager):void");
    }
}
