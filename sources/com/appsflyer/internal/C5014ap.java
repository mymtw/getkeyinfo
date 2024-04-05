package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.ap */
public final class C5014ap {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject AFInAppEventType(java.lang.String r5) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x008b }
            r1.<init>(r5)     // Catch:{ all -> 0x008b }
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "disableProxy"
            r3 = 0
            boolean r5 = r5.getBoolean(r2, r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "monitor"
            boolean r2 = r1.optBoolean(r2, r3)     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x002c
            if (r5 != 0) goto L_0x002c
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x0026
            com.appsflyer.internal.ak r5 = new com.appsflyer.internal.ak     // Catch:{ all -> 0x0088 }
            r5.<init>()     // Catch:{ all -> 0x0088 }
            com.appsflyer.internal.C5002ak.AFInAppEventType = r5     // Catch:{ all -> 0x0088 }
        L_0x0026:
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0088 }
            r5.AFKeystoreWrapper()     // Catch:{ all -> 0x0088 }
            goto L_0x004c
        L_0x002c:
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x0037
            com.appsflyer.internal.ak r5 = new com.appsflyer.internal.ak     // Catch:{ all -> 0x0088 }
            r5.<init>()     // Catch:{ all -> 0x0088 }
            com.appsflyer.internal.C5002ak.AFInAppEventType = r5     // Catch:{ all -> 0x0088 }
        L_0x0037:
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0088 }
            r5.AFInAppEventType()     // Catch:{ all -> 0x0088 }
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x0047
            com.appsflyer.internal.ak r5 = new com.appsflyer.internal.ak     // Catch:{ all -> 0x0088 }
            r5.<init>()     // Catch:{ all -> 0x0088 }
            com.appsflyer.internal.C5002ak.AFInAppEventType = r5     // Catch:{ all -> 0x0088 }
        L_0x0047:
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x0088 }
            r5.valueOf()     // Catch:{ all -> 0x0088 }
        L_0x004c:
            java.lang.String r5 = "ol_id"
            boolean r5 = r1.has(r5)     // Catch:{ all -> 0x0088 }
            if (r5 == 0) goto L_0x00b4
            java.lang.String r5 = "ol_scheme"
            java.lang.String r5 = r1.optString(r5, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "ol_domain"
            java.lang.String r2 = r1.optString(r2, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "ol_ver"
            java.lang.String r0 = r1.optString(r3, r0)     // Catch:{ all -> 0x0088 }
            if (r5 == 0) goto L_0x0071
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = "onelinkScheme"
            r3.set((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0088 }
        L_0x0071:
            if (r2 == 0) goto L_0x007c
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "onelinkDomain"
            r5.set((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0088 }
        L_0x007c:
            if (r0 == 0) goto L_0x00b4
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "onelinkVersion"
            r5.set((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0088 }
            goto L_0x00b4
        L_0x0088:
            r5 = move-exception
            r0 = r1
            goto L_0x008c
        L_0x008b:
            r5 = move-exception
        L_0x008c:
            java.lang.String r1 = r5.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r1, (java.lang.Throwable) r5)
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType
            if (r5 != 0) goto L_0x009e
            com.appsflyer.internal.ak r5 = new com.appsflyer.internal.ak
            r5.<init>()
            com.appsflyer.internal.C5002ak.AFInAppEventType = r5
        L_0x009e:
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType
            r5.AFInAppEventType()
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType
            if (r5 != 0) goto L_0x00ae
            com.appsflyer.internal.ak r5 = new com.appsflyer.internal.ak
            r5.<init>()
            com.appsflyer.internal.C5002ak.AFInAppEventType = r5
        L_0x00ae:
            com.appsflyer.internal.ak r5 = com.appsflyer.internal.C5002ak.AFInAppEventType
            r5.valueOf()
            r1 = r0
        L_0x00b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5014ap.AFInAppEventType(java.lang.String):org.json.JSONObject");
    }
}
