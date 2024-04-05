package p291y3;

import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: y3.f */
public abstract class C8381f extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    public final Uri f18373a;

    /* renamed from: b */
    public boolean f18374b = false;

    public C8381f(Uri uri) {
        this.f18373a = uri;
    }

    /* renamed from: a */
    public abstract void mo20964a(Exception exc);

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r3 == null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f A[SYNTHETIC, Splitter:B:31:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091 A[SYNTHETIC, Splitter:B:41:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
            r8 = this;
            java.lang.Void[] r9 = (java.lang.Void[]) r9
            java.lang.String r9 = "Bitly SDK failed to close reader"
            java.lang.String r0 = "BitlySDK"
            r1 = 1
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            android.net.Uri r4 = r8.f18373a     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0074, all -> 0x0071 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            java.io.InputStream r7 = r3.getInputStream()     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r6.<init>(r7)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r5.<init>(r6)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r4.<init>(r5)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0069 }
            r5.<init>()     // Catch:{ Exception -> 0x0069 }
        L_0x0031:
            java.lang.String r6 = r4.readLine()     // Catch:{ Exception -> 0x0069 }
            if (r6 == 0) goto L_0x003b
            r5.append(r6)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0031
        L_0x003b:
            y3.g r6 = new y3.g     // Catch:{ Exception -> 0x0069 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0069 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0069 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0069 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0069 }
            int r5 = r6.f18375a     // Catch:{ Exception -> 0x0069 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r5 == r7) goto L_0x0051
            r8.f18374b = r1     // Catch:{ Exception -> 0x0069 }
        L_0x0051:
            r5 = r8
            y3.e r5 = (p291y3.C8380e) r5     // Catch:{ Exception -> 0x0069 }
            java.lang.String r7 = "Bitly SDK parsing JSON response and calling handler"
            android.util.Log.d(r0, r7)     // Catch:{ Exception -> 0x0069 }
            y3.b$a r5 = r5.f18369c     // Catch:{ Exception -> 0x0069 }
            if (r5 == 0) goto L_0x0060
            r5.mo18908a(r6)     // Catch:{ Exception -> 0x0069 }
        L_0x0060:
            r4.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0089
        L_0x0064:
            r1 = move-exception
            android.util.Log.e(r0, r9, r1)
            goto L_0x0089
        L_0x0069:
            r5 = move-exception
            goto L_0x0078
        L_0x006b:
            r1 = move-exception
            goto L_0x008f
        L_0x006d:
            r4 = move-exception
            r5 = r4
            r4 = r2
            goto L_0x0078
        L_0x0071:
            r1 = move-exception
            r3 = r2
            goto L_0x008f
        L_0x0074:
            r3 = move-exception
            r5 = r3
            r3 = r2
            r4 = r3
        L_0x0078:
            r8.f18374b = r1     // Catch:{ all -> 0x008d }
            r8.mo20964a(r5)     // Catch:{ all -> 0x008d }
            if (r4 == 0) goto L_0x0087
            r4.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r1 = move-exception
            android.util.Log.e(r0, r9, r1)
        L_0x0087:
            if (r3 == 0) goto L_0x008c
        L_0x0089:
            r3.disconnect()
        L_0x008c:
            return r2
        L_0x008d:
            r1 = move-exception
            r2 = r4
        L_0x008f:
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r2 = move-exception
            android.util.Log.e(r0, r9, r2)
        L_0x0099:
            if (r3 == 0) goto L_0x009e
            r3.disconnect()
        L_0x009e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p291y3.C8381f.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
