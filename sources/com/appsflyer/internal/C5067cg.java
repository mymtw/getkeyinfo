package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.appsflyer.AFLogger;
import com.etsy.android.lib.models.PaymentMethod;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.cg */
public class C5067cg extends C5072cj {
    public final Map<String, Object> valueOf = new HashMap();

    public C5067cg(Runnable runnable) {
        super(PaymentMethod.TYPE_GOOGLE_WALLET, runnable);
    }

    private static boolean valueOf(Context context) {
        C4986ag.AFInAppEventType();
        if (C4986ag.AFInAppEventType(C4986ag.AFInAppEventParameterName(context), "appsFlyerCount", false) > 0) {
            AFLogger.AFKeystoreWrapper("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            if (C4964aa.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.valueOf("Install referrer is allowed");
                return true;
            }
            AFLogger.valueOf("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.AFKeystoreWrapper("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    public final void AFInAppEventType(final Context context) {
        if (valueOf(context)) {
            valueOf();
            try {
                final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.valueOf("Connecting to Install Referrer Library...");
                build.startConnection(new InstallReferrerStateListener() {
                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.valueOf("Install Referrer service disconnected");
                    }

                    /* JADX WARNING: Can't wrap try/catch for region: R(11:17|(1:19)|20|21|22|23|25|26|27|28|(1:30)) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x012c */
                    /* JADX WARNING: Removed duplicated region for block: B:30:0x0132 A[Catch:{ all -> 0x0147 }] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onInstallReferrerSetupFinished(int r9) {
                        /*
                            r8 = this;
                            java.lang.String r0 = "instant"
                            java.lang.String r1 = "ReferrerClient: InstallReferrer is not ready"
                            java.lang.String r2 = "err"
                            com.appsflyer.internal.cg r3 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.valueOf
                            java.lang.String r4 = java.lang.String.valueOf(r9)
                            java.lang.String r5 = "code"
                            r3.put(r5, r4)
                            com.appsflyer.internal.cg r3 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventParameterName
                            android.content.Context r4 = r3
                            java.lang.String r5 = "com.android.vending"
                            long r6 = com.appsflyer.internal.C4964aa.valueOf((android.content.Context) r4, (java.lang.String) r5)
                            java.lang.Long r4 = java.lang.Long.valueOf(r6)
                            java.lang.String r6 = "api_ver"
                            r3.put(r6, r4)
                            com.appsflyer.internal.cg r3 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventParameterName
                            android.content.Context r4 = r3
                            java.lang.String r4 = com.appsflyer.internal.C4964aa.AFInAppEventParameterName(r4, r5)
                            java.lang.String r5 = "api_ver_name"
                            r3.put(r5, r4)
                            r3 = -1
                            java.lang.String r4 = "response"
                            if (r9 == r3) goto L_0x0168
                            if (r9 == 0) goto L_0x007e
                            r0 = 1
                            if (r9 == r0) goto L_0x006e
                            r0 = 2
                            if (r9 == r0) goto L_0x005e
                            r0 = 3
                            if (r9 == r0) goto L_0x004e
                            java.lang.String r9 = "responseCode not found."
                            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r9)
                            goto L_0x0176
                        L_0x004e:
                            java.lang.String r9 = "InstallReferrer DEVELOPER_ERROR"
                            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r9)
                            com.appsflyer.internal.cg r9 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.AFInAppEventParameterName
                            java.lang.String r0 = "DEVELOPER_ERROR"
                            r9.put(r4, r0)
                            goto L_0x0176
                        L_0x005e:
                            java.lang.String r9 = "InstallReferrer FEATURE_NOT_SUPPORTED"
                            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r9)
                            com.appsflyer.internal.cg r9 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.AFInAppEventParameterName
                            java.lang.String r0 = "FEATURE_NOT_SUPPORTED"
                            r9.put(r4, r0)
                            goto L_0x0176
                        L_0x006e:
                            com.appsflyer.internal.cg r9 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.AFInAppEventParameterName
                            java.lang.String r0 = "SERVICE_UNAVAILABLE"
                            r9.put(r4, r0)
                            java.lang.String r9 = "InstallReferrer not supported"
                            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r9)
                            goto L_0x0176
                        L_0x007e:
                            com.appsflyer.internal.cg r9 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.AFInAppEventParameterName
                            java.lang.String r3 = "OK"
                            r9.put(r4, r3)
                            java.lang.String r9 = "InstallReferrer connected"
                            com.appsflyer.AFLogger.valueOf(r9)     // Catch:{ all -> 0x0147 }
                            com.android.installreferrer.api.InstallReferrerClient r9 = r0     // Catch:{ all -> 0x0147 }
                            boolean r9 = r9.isReady()     // Catch:{ all -> 0x0147 }
                            if (r9 == 0) goto L_0x013c
                            com.android.installreferrer.api.InstallReferrerClient r9 = r0     // Catch:{ all -> 0x0147 }
                            com.android.installreferrer.api.ReferrerDetails r9 = r9.getInstallReferrer()     // Catch:{ all -> 0x0147 }
                            java.lang.String r1 = r9.getInstallReferrer()     // Catch:{ all -> 0x0147 }
                            if (r1 == 0) goto L_0x00b2
                            com.appsflyer.internal.cg r3 = com.appsflyer.internal.C5067cg.this     // Catch:{ all -> 0x0147 }
                            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.valueOf     // Catch:{ all -> 0x0147 }
                            java.lang.String r4 = "val"
                            r3.put(r4, r1)     // Catch:{ all -> 0x0147 }
                            com.appsflyer.internal.cg r3 = com.appsflyer.internal.C5067cg.this     // Catch:{ all -> 0x0147 }
                            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventParameterName     // Catch:{ all -> 0x0147 }
                            java.lang.String r4 = "referrer"
                            r3.put(r4, r1)     // Catch:{ all -> 0x0147 }
                        L_0x00b2:
                            long r3 = r9.getReferrerClickTimestampSeconds()     // Catch:{ all -> 0x0147 }
                            com.appsflyer.internal.cg r1 = com.appsflyer.internal.C5067cg.this     // Catch:{ all -> 0x0147 }
                            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.valueOf     // Catch:{ all -> 0x0147 }
                            java.lang.String r5 = "clk"
                            java.lang.String r6 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0147 }
                            r1.put(r5, r6)     // Catch:{ all -> 0x0147 }
                            com.appsflyer.internal.cg r1 = com.appsflyer.internal.C5067cg.this     // Catch:{ all -> 0x0147 }
                            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.AFInAppEventParameterName     // Catch:{ all -> 0x0147 }
                            java.lang.String r5 = "click_ts"
                            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0147 }
                            r1.put(r5, r3)     // Catch:{ all -> 0x0147 }
                            long r3 = r9.getInstallBeginTimestampSeconds()     // Catch:{ all -> 0x0147 }
                            com.appsflyer.internal.cg r1 = com.appsflyer.internal.C5067cg.this     // Catch:{ all -> 0x0147 }
                            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.valueOf     // Catch:{ all -> 0x0147 }
                            java.lang.String r5 = "install"
                            java.lang.String r6 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0147 }
                            r1.put(r5, r6)     // Catch:{ all -> 0x0147 }
                            com.appsflyer.internal.cg r1 = com.appsflyer.internal.C5067cg.this     // Catch:{ all -> 0x0147 }
                            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.AFInAppEventParameterName     // Catch:{ all -> 0x0147 }
                            java.lang.String r5 = "install_begin_ts"
                            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0147 }
                            r1.put(r5, r3)     // Catch:{ all -> 0x0147 }
                            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0147 }
                            r1.<init>()     // Catch:{ all -> 0x0147 }
                            boolean r3 = r9.getGooglePlayInstantParam()     // Catch:{ NoSuchMethodError -> 0x0109 }
                            com.appsflyer.internal.cg r4 = com.appsflyer.internal.C5067cg.this     // Catch:{ NoSuchMethodError -> 0x0109 }
                            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.valueOf     // Catch:{ NoSuchMethodError -> 0x0109 }
                            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ NoSuchMethodError -> 0x0109 }
                            r4.put(r0, r5)     // Catch:{ NoSuchMethodError -> 0x0109 }
                            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ NoSuchMethodError -> 0x0109 }
                            r1.put(r0, r3)     // Catch:{ NoSuchMethodError -> 0x0109 }
                        L_0x0109:
                            java.lang.String r0 = "click_server_ts"
                            long r3 = r9.getReferrerClickTimestampServerSeconds()     // Catch:{ NoSuchMethodError -> 0x012c }
                            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ NoSuchMethodError -> 0x012c }
                            r1.put(r0, r3)     // Catch:{ NoSuchMethodError -> 0x012c }
                            java.lang.String r0 = "install_begin_server_ts"
                            long r3 = r9.getInstallBeginTimestampServerSeconds()     // Catch:{ NoSuchMethodError -> 0x012c }
                            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ NoSuchMethodError -> 0x012c }
                            r1.put(r0, r3)     // Catch:{ NoSuchMethodError -> 0x012c }
                            java.lang.String r0 = "install_version"
                            java.lang.String r9 = r9.getInstallVersion()     // Catch:{ NoSuchMethodError -> 0x012c }
                            r1.put(r0, r9)     // Catch:{ NoSuchMethodError -> 0x012c }
                        L_0x012c:
                            boolean r9 = r1.isEmpty()     // Catch:{ all -> 0x0147 }
                            if (r9 != 0) goto L_0x0176
                            com.appsflyer.internal.cg r9 = com.appsflyer.internal.C5067cg.this     // Catch:{ all -> 0x0147 }
                            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.AFInAppEventParameterName     // Catch:{ all -> 0x0147 }
                            java.lang.String r0 = "google_custom"
                            r9.put(r0, r1)     // Catch:{ all -> 0x0147 }
                            goto L_0x0176
                        L_0x013c:
                            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r1)     // Catch:{ all -> 0x0147 }
                            com.appsflyer.internal.cg r9 = com.appsflyer.internal.C5067cg.this     // Catch:{ all -> 0x0147 }
                            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.valueOf     // Catch:{ all -> 0x0147 }
                            r9.put(r2, r1)     // Catch:{ all -> 0x0147 }
                            goto L_0x0176
                        L_0x0147:
                            r9 = move-exception
                            java.lang.String r0 = "Failed to get install referrer: "
                            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
                            java.lang.String r1 = r9.getMessage()
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r0)
                            com.appsflyer.internal.cg r0 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.valueOf
                            java.lang.String r9 = r9.getMessage()
                            r0.put(r2, r9)
                            goto L_0x0176
                        L_0x0168:
                            java.lang.String r9 = "InstallReferrer SERVICE_DISCONNECTED"
                            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r9)
                            com.appsflyer.internal.cg r9 = com.appsflyer.internal.C5067cg.this
                            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.AFInAppEventParameterName
                            java.lang.String r0 = "SERVICE_DISCONNECTED"
                            r9.put(r4, r0)
                        L_0x0176:
                            java.lang.String r9 = "Install Referrer collected locally"
                            com.appsflyer.AFLogger.valueOf(r9)
                            com.appsflyer.internal.cg r9 = com.appsflyer.internal.C5067cg.this
                            r9.AFKeystoreWrapper()
                            com.android.installreferrer.api.InstallReferrerClient r9 = r0
                            r9.endConnection()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5067cg.C50681.onInstallReferrerSetupFinished(int):void");
                    }
                });
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper("referrerClient -> startConnection", th);
            }
        }
    }
}
