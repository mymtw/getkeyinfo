package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.bj */
public final class C5042bj {
    private final int AFKeystoreWrapper;

    public C5042bj(int i) {
        this.AFKeystoreWrapper = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventType(java.net.HttpURLConnection r5, boolean r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "Could not read connection response from: "
            r1 = 0
            if (r6 == 0) goto L_0x000a
            java.io.InputStream r6 = r5.getInputStream()     // Catch:{ IOException -> 0x008b, Exception -> 0x005a, all -> 0x0057 }
            goto L_0x000e
        L_0x000a:
            java.io.InputStream r6 = r5.getErrorStream()     // Catch:{ IOException -> 0x008b, Exception -> 0x005a, all -> 0x0057 }
        L_0x000e:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = ""
            return r5
        L_0x0013:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008b, Exception -> 0x005a, all -> 0x0057 }
            r2.<init>()     // Catch:{ IOException -> 0x008b, Exception -> 0x005a, all -> 0x0057 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x008b, Exception -> 0x005a, all -> 0x0057 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x008b, Exception -> 0x005a, all -> 0x0057 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0053, Exception -> 0x004f, all -> 0x004b }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0053, Exception -> 0x004f, all -> 0x004b }
            r1 = 1
        L_0x0023:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x0047, Exception -> 0x0043, all -> 0x0040 }
            if (r4 == 0) goto L_0x0035
            if (r1 != 0) goto L_0x0030
            r1 = 10
            r2.append(r1)     // Catch:{ IOException -> 0x0047, Exception -> 0x0043, all -> 0x0040 }
        L_0x0030:
            r2.append(r4)     // Catch:{ IOException -> 0x0047, Exception -> 0x0043, all -> 0x0040 }
            r1 = 0
            goto L_0x0023
        L_0x0035:
            java.lang.String r5 = r2.toString()     // Catch:{ IOException -> 0x0047, Exception -> 0x0043, all -> 0x0040 }
            r3.close()
            r6.close()
            return r5
        L_0x0040:
            r5 = move-exception
            r2 = r6
            goto L_0x004d
        L_0x0043:
            r1 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x0051
        L_0x0047:
            r1 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x0055
        L_0x004b:
            r5 = move-exception
            r2 = r1
        L_0x004d:
            r1 = r3
            goto L_0x00a6
        L_0x004f:
            r6 = move-exception
            r2 = r1
        L_0x0051:
            r1 = r3
            goto L_0x005c
        L_0x0053:
            r6 = move-exception
            r2 = r1
        L_0x0055:
            r1 = r3
            goto L_0x008d
        L_0x0057:
            r5 = move-exception
            r2 = r1
            goto L_0x00a6
        L_0x005a:
            r6 = move-exception
            r2 = r1
        L_0x005c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r3.<init>(r0)     // Catch:{ all -> 0x00a5 }
            java.net.URL r5 = r5.getURL()     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a5 }
            r3.append(r5)     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x00a5 }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r5, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00a5 }
            com.appsflyer.internal.bq r5 = new com.appsflyer.internal.bq     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "Could not read connection response: "
            r0.<init>(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = r6.getMessage()     // Catch:{ all -> 0x00a5 }
            r0.append(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a5 }
            r5.<init>(r0, r6)     // Catch:{ all -> 0x00a5 }
            throw r5     // Catch:{ all -> 0x00a5 }
        L_0x008b:
            r6 = move-exception
            r2 = r1
        L_0x008d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r3.<init>(r0)     // Catch:{ all -> 0x00a5 }
            java.net.URL r5 = r5.getURL()     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a5 }
            r3.append(r5)     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x00a5 }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r5, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00a5 }
            throw r6     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r5 = move-exception
        L_0x00a6:
            if (r1 == 0) goto L_0x00ab
            r1.close()
        L_0x00ab:
            if (r2 == 0) goto L_0x00b0
            r2.close()
        L_0x00b0:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5042bj.AFInAppEventType(java.net.HttpURLConnection, boolean):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9 A[Catch:{ all -> 0x00a3, all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.C5041bi<java.lang.String> valueOf(com.appsflyer.internal.C5107v r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "HTTP: url: "
            r1.<init>(r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = r7.AFInAppEventType     // Catch:{ all -> 0x00f6 }
            r1.append(r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f6 }
            com.appsflyer.AFLogger.valueOf(r1)     // Catch:{ all -> 0x00f6 }
            byte[] r1 = r7.values     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "HTTP: data: "
            r1.<init>(r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00f6 }
            byte[] r3 = r7.values     // Catch:{ all -> 0x00f6 }
            r2.<init>(r3)     // Catch:{ all -> 0x00f6 }
            r1.append(r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f6 }
            com.appsflyer.AFLogger.valueOf(r1)     // Catch:{ all -> 0x00f6 }
        L_0x0030:
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = r7.AFInAppEventType     // Catch:{ all -> 0x00f6 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f6 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x00f6 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = r7.valueOf     // Catch:{ all -> 0x00f3 }
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x00f3 }
            int r2 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00f3 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x00f3 }
            int r2 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00f3 }
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = "application/json"
            java.lang.String r3 = "Content-Type"
            r1.addRequestProperty(r3, r2)     // Catch:{ all -> 0x00f3 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.AFKeystoreWrapper     // Catch:{ all -> 0x00f3 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00f3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00f3 }
        L_0x005d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00f3 }
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00f3 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00f3 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00f3 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00f3 }
            r1.setRequestProperty(r4, r3)     // Catch:{ all -> 0x00f3 }
            goto L_0x005d
        L_0x0079:
            byte[] r7 = r7.values     // Catch:{ all -> 0x00f3 }
            r2 = 1
            if (r7 == 0) goto L_0x00ad
            r1.setDoOutput(r2)     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = "Content-Length"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r4.<init>()     // Catch:{ all -> 0x00f3 }
            int r5 = r7.length     // Catch:{ all -> 0x00f3 }
            r4.append(r5)     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00f3 }
            r1.setRequestProperty(r3, r4)     // Catch:{ all -> 0x00f3 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00a6 }
            java.io.OutputStream r4 = r1.getOutputStream()     // Catch:{ all -> 0x00a6 }
            r3.<init>(r4)     // Catch:{ all -> 0x00a6 }
            r3.write(r7)     // Catch:{ all -> 0x00a3 }
            r3.close()     // Catch:{ all -> 0x00f3 }
            goto L_0x00ad
        L_0x00a3:
            r7 = move-exception
            r0 = r3
            goto L_0x00a7
        L_0x00a6:
            r7 = move-exception
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()     // Catch:{ all -> 0x00f3 }
        L_0x00ac:
            throw r7     // Catch:{ all -> 0x00f3 }
        L_0x00ad:
            int r7 = r1.getResponseCode()     // Catch:{ all -> 0x00f3 }
            int r0 = r7 / 100
            r3 = 2
            if (r0 != r3) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            java.lang.String r0 = AFInAppEventType(r1, r2)     // Catch:{ all -> 0x00f3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "HTTP: response code: "
            r3.<init>(r4)     // Catch:{ all -> 0x00f3 }
            r3.append(r7)     // Catch:{ all -> 0x00f3 }
            java.lang.String r7 = " "
            r3.append(r7)     // Catch:{ all -> 0x00f3 }
            java.lang.String r7 = r1.getResponseMessage()     // Catch:{ all -> 0x00f3 }
            r3.append(r7)     // Catch:{ all -> 0x00f3 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x00f3 }
            com.appsflyer.AFLogger.valueOf(r7)     // Catch:{ all -> 0x00f3 }
            java.lang.String r7 = "HTTP: response body: "
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r7 = r7.concat(r3)     // Catch:{ all -> 0x00f3 }
            com.appsflyer.AFLogger.valueOf(r7)     // Catch:{ all -> 0x00f3 }
            com.appsflyer.internal.bi r7 = new com.appsflyer.internal.bi     // Catch:{ all -> 0x00f3 }
            int r3 = r1.getResponseCode()     // Catch:{ all -> 0x00f3 }
            r7.<init>(r0, r3, r2)     // Catch:{ all -> 0x00f3 }
            r1.disconnect()
            return r7
        L_0x00f3:
            r7 = move-exception
            r0 = r1
            goto L_0x00f7
        L_0x00f6:
            r7 = move-exception
        L_0x00f7:
            if (r0 == 0) goto L_0x00fc
            r0.disconnect()
        L_0x00fc:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5042bj.valueOf(com.appsflyer.internal.v):com.appsflyer.internal.bi");
    }
}
