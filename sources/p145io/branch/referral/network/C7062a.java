package p145io.branch.referral.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import p145io.branch.referral.Branch;

/* renamed from: io.branch.referral.network.a */
public final class C7062a extends BranchRemoteInterface {

    /* renamed from: a */
    public final Branch f15717a;

    public C7062a(Branch branch) {
        this.f15717a = branch;
    }

    /* renamed from: e */
    public static String m13654e(InputStream inputStream) {
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        return sb.toString();
                    }
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        p145io.branch.referral.C7077r.m13675a("A resource conflict occurred with this request " + r13);
        r2 = new p145io.branch.referral.network.BranchRemoteInterface.C7061a((java.lang.String) null, r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0172 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c4 A[SYNTHETIC, Splitter:B:101:0x01c4] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01dc A[SYNTHETIC, Splitter:B:110:0x01dc] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0162 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0178 A[SYNTHETIC, Splitter:B:71:0x0178] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0190 A[SYNTHETIC, Splitter:B:80:0x0190] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019e A[SYNTHETIC, Splitter:B:86:0x019e] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b6 A[SYNTHETIC, Splitter:B:95:0x01b6] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p145io.branch.referral.network.BranchRemoteInterface.C7061a mo19296d(int r12, java.lang.String r13, org.json.JSONObject r14) throws p145io.branch.referral.network.BranchRemoteInterface.BranchRemoteException {
        /*
            r11 = this;
            java.lang.String r0 = "application/json"
            io.branch.referral.Branch r1 = r11.f15717a
            android.content.Context r1 = r1.f15578d
            io.branch.referral.r r1 = p145io.branch.referral.C7077r.m13677h(r1)
            r2 = 5500(0x157c, float:7.707E-42)
            java.lang.String r3 = "bnc_timeout"
            int r2 = r1.mo19319i(r2, r3)
            r3 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r4 = "bnc_connect_timeout"
            int r3 = r1.mo19319i(r3, r4)
            java.lang.String r4 = "retryNumber"
            r14.put(r4, r12)     // Catch:{ JSONException -> 0x001f }
        L_0x001f:
            r4 = 102(0x66, float:1.43E-43)
            r5 = 500(0x1f4, float:7.0E-43)
            r6 = 0
            r7 = 1
            android.net.TrafficStats.setThreadStatsTag(r4)     // Catch:{ SocketTimeoutException -> 0x01be, InterruptedIOException -> 0x0198, IOException -> 0x0172, Exception -> 0x0144 }
            java.net.URL r4 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x01be, InterruptedIOException -> 0x0198, IOException -> 0x0172, Exception -> 0x0144 }
            r4.<init>(r13)     // Catch:{ SocketTimeoutException -> 0x01be, InterruptedIOException -> 0x0198, IOException -> 0x0172, Exception -> 0x0144 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ SocketTimeoutException -> 0x01be, InterruptedIOException -> 0x0198, IOException -> 0x0172, Exception -> 0x0144 }
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ SocketTimeoutException -> 0x01be, InterruptedIOException -> 0x0198, IOException -> 0x0172, Exception -> 0x0144 }
            r4.setConnectTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r4.setReadTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r4.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r4.setDoOutput(r7)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            io.branch.referral.Defines$Jsonkey r2 = p145io.branch.referral.Defines$Jsonkey.QRCodeTag     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r3 = r2.getKey()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            boolean r3 = r13.contains(r3)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r8 = "Accept"
            java.lang.String r9 = "Content-Type"
            if (r3 == 0) goto L_0x005a
            java.lang.String r0 = "application/x-www-form-urlencoded"
            r4.setRequestProperty(r9, r0)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r0 = "image/*"
            r4.setRequestProperty(r8, r0)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            goto L_0x0060
        L_0x005a:
            r4.setRequestProperty(r9, r0)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r4.setRequestProperty(r8, r0)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
        L_0x0060:
            java.lang.String r0 = "POST"
            r4.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r0.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r3 = r14.toString()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r0.write(r3)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r0.flush()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r0.close()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            io.branch.referral.Defines$HeaderKey r0 = p145io.branch.referral.Defines$HeaderKey.RequestId     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r0 = r0.getKey()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r0 = r4.getHeaderField(r0)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            io.branch.referral.Defines$HeaderKey r3 = p145io.branch.referral.Defines$HeaderKey.SendCloseRequest     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r3 = r3.getKey()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r3 = r4.getHeaderField(r3)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            if (r3 == 0) goto L_0x00a4
            io.branch.referral.Branch r8 = r11.f15717a     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            boolean r9 = r8.f15585k     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            if (r9 != 0) goto L_0x00a4
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r8.f15585k = r3     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            goto L_0x00a4
        L_0x009e:
            r12 = move-exception
            goto L_0x01e5
        L_0x00a1:
            r12 = move-exception
            goto L_0x0146
        L_0x00a4:
            int r3 = r4.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            if (r3 < r5) goto L_0x00c7
            int r8 = r1.mo19325o()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            if (r12 >= r8) goto L_0x00c7
            int r0 = r1.mo19326p()     // Catch:{ InterruptedException -> 0x00b9 }
            long r2 = (long) r0     // Catch:{ InterruptedException -> 0x00b9 }
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x00b9 }
            goto L_0x00bd
        L_0x00b9:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
        L_0x00bd:
            int r12 = r12 + 1
            io.branch.referral.network.BranchRemoteInterface$a r12 = r11.mo19296d(r12, r13, r14)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r4.disconnect()
            return r12
        L_0x00c7:
            r8 = 200(0xc8, float:2.8E-43)
            if (r3 == r8) goto L_0x00df
            java.io.InputStream r8 = r4.getErrorStream()     // Catch:{ FileNotFoundException -> 0x011b }
            if (r8 == 0) goto L_0x00df
            io.branch.referral.network.BranchRemoteInterface$a r2 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ FileNotFoundException -> 0x011b }
            java.io.InputStream r8 = r4.getErrorStream()     // Catch:{ FileNotFoundException -> 0x011b }
            java.lang.String r8 = m13654e(r8)     // Catch:{ FileNotFoundException -> 0x011b }
            r2.<init>(r8, r3)     // Catch:{ FileNotFoundException -> 0x011b }
            goto L_0x0134
        L_0x00df:
            java.lang.String r2 = r2.getKey()     // Catch:{ FileNotFoundException -> 0x011b }
            boolean r2 = r13.contains(r2)     // Catch:{ FileNotFoundException -> 0x011b }
            if (r2 == 0) goto L_0x010d
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ FileNotFoundException -> 0x011b }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ FileNotFoundException -> 0x011b }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x011b }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x011b }
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x011b }
            r10 = 100
            r2.compress(r9, r10, r8)     // Catch:{ FileNotFoundException -> 0x011b }
            byte[] r2 = r8.toByteArray()     // Catch:{ FileNotFoundException -> 0x011b }
            r8 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r8)     // Catch:{ FileNotFoundException -> 0x011b }
            io.branch.referral.network.BranchRemoteInterface$a r8 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ FileNotFoundException -> 0x011b }
            r8.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x011b }
            r2 = r8
            goto L_0x0134
        L_0x010d:
            io.branch.referral.network.BranchRemoteInterface$a r2 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ FileNotFoundException -> 0x011b }
            java.io.InputStream r8 = r4.getInputStream()     // Catch:{ FileNotFoundException -> 0x011b }
            java.lang.String r8 = m13654e(r8)     // Catch:{ FileNotFoundException -> 0x011b }
            r2.<init>(r8, r3)     // Catch:{ FileNotFoundException -> 0x011b }
            goto L_0x0134
        L_0x011b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r8 = "A resource conflict occurred with this request "
            r2.append(r8)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r2.append(r13)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            p145io.branch.referral.C7077r.m13675a(r2)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            io.branch.referral.network.BranchRemoteInterface$a r2 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r2.<init>(r6, r3)     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
        L_0x0134:
            r2.f15716c = r0     // Catch:{ SocketTimeoutException -> 0x013e, InterruptedIOException -> 0x013c, IOException -> 0x013a, Exception -> 0x00a1 }
            r4.disconnect()
            return r2
        L_0x013a:
            r6 = r4
            goto L_0x0172
        L_0x013c:
            r6 = r4
            goto L_0x0198
        L_0x013e:
            r6 = r4
            goto L_0x01be
        L_0x0141:
            r12 = move-exception
            goto L_0x01e4
        L_0x0144:
            r12 = move-exception
            r4 = r6
        L_0x0146:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r13.<init>()     // Catch:{ all -> 0x009e }
            java.lang.String r14 = "Exception: "
            r13.append(r14)     // Catch:{ all -> 0x009e }
            java.lang.String r14 = r12.getMessage()     // Catch:{ all -> 0x009e }
            r13.append(r14)     // Catch:{ all -> 0x009e }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x009e }
            p145io.branch.referral.C7077r.m13675a(r13)     // Catch:{ all -> 0x009e }
            boolean r12 = r12 instanceof android.os.NetworkOnMainThreadException     // Catch:{ all -> 0x009e }
            if (r12 == 0) goto L_0x0167
            java.lang.String r12 = "Branch Error: Don't call our synchronous methods on the main thread!!!"
            p145io.branch.referral.C7077r.m13675a(r12)     // Catch:{ all -> 0x009e }
        L_0x0167:
            io.branch.referral.network.BranchRemoteInterface$a r12 = new io.branch.referral.network.BranchRemoteInterface$a     // Catch:{ all -> 0x009e }
            r12.<init>(r6, r5)     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x0171
            r4.disconnect()
        L_0x0171:
            return r12
        L_0x0172:
            int r0 = r1.mo19325o()     // Catch:{ all -> 0x0141 }
            if (r12 >= r0) goto L_0x0190
            int r0 = r1.mo19326p()     // Catch:{ InterruptedException -> 0x0181 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0181 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0181 }
            goto L_0x0185
        L_0x0181:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0141 }
        L_0x0185:
            int r12 = r12 + r7
            io.branch.referral.network.BranchRemoteInterface$a r12 = r11.mo19296d(r12, r13, r14)     // Catch:{ all -> 0x0141 }
            if (r6 == 0) goto L_0x018f
            r6.disconnect()
        L_0x018f:
            return r12
        L_0x0190:
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r12 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x0141 }
            r13 = -113(0xffffffffffffff8f, float:NaN)
            r12.<init>(r13)     // Catch:{ all -> 0x0141 }
            throw r12     // Catch:{ all -> 0x0141 }
        L_0x0198:
            int r0 = r1.mo19325o()     // Catch:{ all -> 0x0141 }
            if (r12 >= r0) goto L_0x01b6
            int r0 = r1.mo19326p()     // Catch:{ InterruptedException -> 0x01a7 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x01a7 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x01a7 }
            goto L_0x01ab
        L_0x01a7:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0141 }
        L_0x01ab:
            int r12 = r12 + r7
            io.branch.referral.network.BranchRemoteInterface$a r12 = r11.mo19296d(r12, r13, r14)     // Catch:{ all -> 0x0141 }
            if (r6 == 0) goto L_0x01b5
            r6.disconnect()
        L_0x01b5:
            return r12
        L_0x01b6:
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r12 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x0141 }
            r13 = -120(0xffffffffffffff88, float:NaN)
            r12.<init>(r13)     // Catch:{ all -> 0x0141 }
            throw r12     // Catch:{ all -> 0x0141 }
        L_0x01be:
            int r0 = r1.mo19325o()     // Catch:{ all -> 0x0141 }
            if (r12 >= r0) goto L_0x01dc
            int r0 = r1.mo19326p()     // Catch:{ InterruptedException -> 0x01cd }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x01cd }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x01cd }
            goto L_0x01d1
        L_0x01cd:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0141 }
        L_0x01d1:
            int r12 = r12 + r7
            io.branch.referral.network.BranchRemoteInterface$a r12 = r11.mo19296d(r12, r13, r14)     // Catch:{ all -> 0x0141 }
            if (r6 == 0) goto L_0x01db
            r6.disconnect()
        L_0x01db:
            return r12
        L_0x01dc:
            io.branch.referral.network.BranchRemoteInterface$BranchRemoteException r12 = new io.branch.referral.network.BranchRemoteInterface$BranchRemoteException     // Catch:{ all -> 0x0141 }
            r13 = -111(0xffffffffffffff91, float:NaN)
            r12.<init>(r13)     // Catch:{ all -> 0x0141 }
            throw r12     // Catch:{ all -> 0x0141 }
        L_0x01e4:
            r4 = r6
        L_0x01e5:
            if (r4 == 0) goto L_0x01ea
            r4.disconnect()
        L_0x01ea:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.network.C7062a.mo19296d(int, java.lang.String, org.json.JSONObject):io.branch.referral.network.BranchRemoteInterface$a");
    }
}
