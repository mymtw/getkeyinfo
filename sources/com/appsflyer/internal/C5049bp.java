package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.C5030b;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.bp */
public final class C5049bp extends C5056bv {
    private static String onDeepLinkingNative;
    private final SharedPreferences onAppOpenAttributionNative;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(C4986ag.AFKeystoreWrapper);
        onDeepLinkingNative = sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5049bp(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = onDeepLinkingNative
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.appsflyer.AppsFlyerLib r3 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r3 = r3.getHostPrefix()
            r4 = 0
            r2[r4] = r3
            com.appsflyer.internal.ag r3 = com.appsflyer.internal.C4986ag.AFInAppEventType()
            java.lang.String r3 = r3.getHostName()
            r4 = 1
            r2[r4] = r3
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.lang.String r1 = r10.getPackageName()
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.content.SharedPreferences r10 = com.appsflyer.internal.C4986ag.AFInAppEventParameterName((android.content.Context) r10)
            r9.onAppOpenAttributionNative = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5049bp.<init>(android.content.Context):void");
    }

    public static boolean AFInAppEventType(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            if (C4964aa.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", (Uri) null, context, FirebaseMessagingServiceListener.class))) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    private void AFKeystoreWrapper(C4972ac acVar) {
        this.onAppOpenAttributionNative.edit().putString("afUninstallToken", acVar.AFInAppEventType).putLong("afUninstallToken_received_time", acVar.values).putBoolean("afUninstallToken_queued", acVar.AFInAppEventType()).apply();
    }

    public static boolean values(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }

    public C4972ac AFInAppEventParameterName() {
        String string;
        String string2;
        String string3 = this.onAppOpenAttributionNative.getString("afUninstallToken", (String) null);
        long j = this.onAppOpenAttributionNative.getLong("afUninstallToken_received_time", 0);
        boolean z = this.onAppOpenAttributionNative.getBoolean("afUninstallToken_queued", false);
        this.onAppOpenAttributionNative.edit().putBoolean("afUninstallToken_queued", false).apply();
        if (string3 == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string2.split(",");
            string3 = split[split.length - 1];
        }
        if (j == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split2 = string.split(",");
            if (split2.length >= 2) {
                try {
                    j = Long.parseLong(split2[split2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (string3 != null) {
            return new C4972ac(string3, j, z);
        }
        return null;
    }

    public void valueOf(String str) {
        Application application = this.values;
        final C4986ag AFInAppEventType = C4986ag.AFInAppEventType();
        if (AFInAppEventType.AFKeystoreWrapper()) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (devKey == null) {
            AFLogger.AppsFlyer2dXConversionCallback("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(application.getPackageName(), 0);
            this.AFInAppEventParameterName.put("app_version_code", Integer.toString(packageInfo.versionCode));
            this.AFInAppEventParameterName.put("app_version_name", packageInfo.versionName);
            this.AFInAppEventParameterName.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            this.AFInAppEventParameterName.put("installDate", C4986ag.AFInAppEventParameterName(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), j));
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Exception while collecting application version info.", th);
        }
        C4986ag.AFKeystoreWrapper((Context) application, (Map<String, ? super String>) this.AFInAppEventParameterName);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            this.AFInAppEventParameterName.put("appUserId", string);
        }
        try {
            this.AFInAppEventParameterName.put("model", Build.MODEL);
            this.AFInAppEventParameterName.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.AFKeystoreWrapper("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            this.AFInAppEventParameterName.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        C5030b.C5031e.C5032a AFKeystoreWrapper = C5115z.AFKeystoreWrapper(application.getContentResolver());
        if (AFKeystoreWrapper != null) {
            this.AFInAppEventParameterName.put("amazon_aid", AFKeystoreWrapper.AFKeystoreWrapper);
            this.AFInAppEventParameterName.put("amazon_aid_limit", String.valueOf(AFKeystoreWrapper.valueOf));
        }
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string2 != null) {
            this.AFInAppEventParameterName.put("advertiserId", string2);
        }
        this.AFInAppEventParameterName.put("devkey", devKey);
        this.AFInAppEventParameterName.put("uid", C5003al.AFInAppEventParameterName(new WeakReference(application)));
        this.AFInAppEventParameterName.put("af_gcm_token", str);
        this.AFInAppEventParameterName.put("launch_counter", Integer.toString(C4986ag.AFInAppEventType(this.onAppOpenAttributionNative, "appsFlyerCount", false)));
        this.AFInAppEventParameterName.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String AFInAppEventType2 = AFInAppEventType.AFInAppEventType((Context) application);
        if (AFInAppEventType2 != null) {
            this.AFInAppEventParameterName.put(AppsFlyerProperties.CHANNEL, AFInAppEventType2);
        }
        new Thread(new Runnable() {
            public final void run() {
                try {
                    C5049bp bpVar = C5049bp.this;
                    bpVar.onAppOpenAttribution = AFInAppEventType.isStopped();
                    HttpURLConnection AFInAppEventParameterName = new C4985af(bpVar).AFInAppEventParameterName();
                    if (AFInAppEventParameterName != null) {
                        if (AFInAppEventParameterName.getResponseCode() == 200) {
                            C5049bp.AFInAppEventParameterName(C5049bp.this);
                        }
                        AFInAppEventParameterName.disconnect();
                    }
                } catch (Throwable th) {
                    AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                }
            }
        }).start();
    }

    public final void AFInAppEventType(String str) {
        if (str != null) {
            AFLogger.AFInAppEventType("Firebase Refreshed Token = ".concat(str));
            C4972ac AFInAppEventParameterName = AFInAppEventParameterName();
            if (AFInAppEventParameterName == null || !str.equals(AFInAppEventParameterName.AFInAppEventType)) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = C4986ag.valueOf(this.onAppOpenAttributionNative) && (AFInAppEventParameterName == null || currentTimeMillis - AFInAppEventParameterName.values > TimeUnit.SECONDS.toMillis(2));
                AFKeystoreWrapper(new C4972ac(str, currentTimeMillis, !z));
                if (z) {
                    valueOf(str);
                }
            }
        }
    }

    public static /* synthetic */ void AFInAppEventParameterName(C5049bp bpVar) {
        bpVar.onAppOpenAttributionNative.edit().putBoolean("sentRegisterRequestToAF", true).apply();
        AFLogger.valueOf("Successfully registered for Uninstall Tracking");
    }
}
