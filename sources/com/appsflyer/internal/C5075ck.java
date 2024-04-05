package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;

/* renamed from: com.appsflyer.internal.ck */
public final class C5075ck extends C5063cc {
    public C5075ck(Runnable runnable) {
        super("samsung", runnable);
    }

    public final void AFInAppEventType(Context context) {
        AFKeystoreWrapper(context, new C5019at<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") {
            private static void AFInAppEventType(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                    map.put(str, string);
                }
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
                if (r2 != null) goto L_0x00d3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d1, code lost:
                if (r2 == null) goto L_0x00d6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d3, code lost:
                r2.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d6, code lost:
                r0 = r10.AFInAppEventParameterName.getPackageManager().resolveContentProvider(r10.AFInAppEventType, 128).packageName;
                r10.values.AFInAppEventParameterName.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.C4964aa.valueOf(r10.AFInAppEventParameterName, r0)));
                r10.values.AFInAppEventParameterName.put("api_ver_name", com.appsflyer.internal.C4964aa.AFInAppEventParameterName(r10.AFInAppEventParameterName, r0));
                r10.values.AFKeystoreWrapper();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0111, code lost:
                return r10.values.AFInAppEventParameterName;
             */
            /* renamed from: AFKeystoreWrapper */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.Map<java.lang.String, java.lang.Object> values() {
                /*
                    r10 = this;
                    java.lang.String r0 = "FEATURE_NOT_SUPPORTED"
                    java.lang.String r1 = "response"
                    r2 = 0
                    android.content.Context r3 = r10.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    android.content.ContentResolver r4 = r3.getContentResolver()     // Catch:{ Exception -> 0x00c2 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r5 = "content://"
                    r3.<init>(r5)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r5 = r10.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    r3.append(r5)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c2 }
                    android.net.Uri r5 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x00c2 }
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00c2 }
                    if (r2 == 0) goto L_0x00b4
                    boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x00c2 }
                    if (r3 == 0) goto L_0x00ac
                    com.appsflyer.internal.ck r3 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "OK"
                    r3.put(r1, r4)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "referrer"
                    com.appsflyer.internal.ck r4 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    AFInAppEventType(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "click_ts"
                    com.appsflyer.internal.ck r4 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    AFKeystoreWrapper(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "install_begin_ts"
                    com.appsflyer.internal.ck r4 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    AFKeystoreWrapper(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "install_end_ts"
                    com.appsflyer.internal.ck r4 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    AFKeystoreWrapper(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "organic_keywords"
                    com.appsflyer.internal.ck r4 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    AFInAppEventType(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "attr_type"
                    com.appsflyer.internal.ck r4 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    AFInAppEventType(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x00c2 }
                    r3.<init>()     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "instant"
                    int r5 = r2.getColumnIndex(r4)     // Catch:{ Exception -> 0x00c2 }
                    r6 = -1
                    if (r5 == r6) goto L_0x008d
                    java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x00c2 }
                    if (r5 == 0) goto L_0x008d
                    boolean r5 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x00c2 }
                    r3.put(r4, r5)     // Catch:{ Exception -> 0x00c2 }
                L_0x008d:
                    java.lang.String r4 = "click_server_ts"
                    AFKeystoreWrapper(r4, r3, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "install_begin_server_ts"
                    AFKeystoreWrapper(r4, r3, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "install_version"
                    AFInAppEventType(r4, r3, r2)     // Catch:{ Exception -> 0x00c2 }
                    boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x00c2 }
                    if (r4 != 0) goto L_0x00bd
                    com.appsflyer.internal.ck r4 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r5 = "custom"
                    r4.put(r5, r3)     // Catch:{ Exception -> 0x00c2 }
                    goto L_0x00bd
                L_0x00ac:
                    com.appsflyer.internal.ck r3 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    r3.put(r1, r0)     // Catch:{ Exception -> 0x00c2 }
                    goto L_0x00bd
                L_0x00b4:
                    com.appsflyer.internal.ck r3 = com.appsflyer.internal.C5075ck.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventParameterName     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "SERVICE_UNAVAILABLE"
                    r3.put(r1, r4)     // Catch:{ Exception -> 0x00c2 }
                L_0x00bd:
                    if (r2 == 0) goto L_0x00d6
                    goto L_0x00d3
                L_0x00c0:
                    r0 = move-exception
                    goto L_0x0112
                L_0x00c2:
                    r3 = move-exception
                    com.appsflyer.internal.ck r4 = com.appsflyer.internal.C5075ck.this     // Catch:{ all -> 0x00c0 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x00c0 }
                    r4.put(r1, r0)     // Catch:{ all -> 0x00c0 }
                    java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x00c0 }
                    com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r0, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00c0 }
                    if (r2 == 0) goto L_0x00d6
                L_0x00d3:
                    r2.close()
                L_0x00d6:
                    android.content.Context r0 = r10.AFInAppEventParameterName
                    android.content.pm.PackageManager r0 = r0.getPackageManager()
                    java.lang.String r1 = r10.AFInAppEventType
                    r2 = 128(0x80, float:1.794E-43)
                    android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r1, r2)
                    java.lang.String r0 = r0.packageName
                    com.appsflyer.internal.ck r1 = com.appsflyer.internal.C5075ck.this
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r1.AFInAppEventParameterName
                    android.content.Context r2 = r10.AFInAppEventParameterName
                    long r2 = com.appsflyer.internal.C4964aa.valueOf((android.content.Context) r2, (java.lang.String) r0)
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    java.lang.String r3 = "api_ver"
                    r1.put(r3, r2)
                    com.appsflyer.internal.ck r1 = com.appsflyer.internal.C5075ck.this
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r1.AFInAppEventParameterName
                    android.content.Context r2 = r10.AFInAppEventParameterName
                    java.lang.String r0 = com.appsflyer.internal.C4964aa.AFInAppEventParameterName(r2, r0)
                    java.lang.String r2 = "api_ver_name"
                    r1.put(r2, r0)
                    com.appsflyer.internal.ck r0 = com.appsflyer.internal.C5075ck.this
                    r0.AFKeystoreWrapper()
                    com.appsflyer.internal.ck r0 = com.appsflyer.internal.C5075ck.this
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.AFInAppEventParameterName
                    return r0
                L_0x0112:
                    if (r2 == 0) goto L_0x0117
                    r2.close()
                L_0x0117:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5075ck.C50765.values():java.util.Map");
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1) {
                    long j = cursor.getLong(columnIndex);
                    if (j != 0) {
                        map.put(str, Long.valueOf(j));
                    }
                }
            }
        });
    }
}
