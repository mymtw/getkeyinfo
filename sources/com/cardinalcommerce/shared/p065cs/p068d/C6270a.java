package com.cardinalcommerce.shared.p065cs.p068d;

import android.os.AsyncTask;
import com.cardinalcommerce.shared.p065cs.p067b.C6266a;
import java.io.DataOutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.HashMap;

/* renamed from: com.cardinalcommerce.shared.cs.d.a */
public class C6270a extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    private String f13744a;

    /* renamed from: b */
    private HttpURLConnection f13745b;

    /* renamed from: c */
    private DataOutputStream f13746c;

    /* renamed from: d */
    private OutputStreamWriter f13747d;

    /* renamed from: e */
    private int f13748e;

    /* renamed from: f */
    private int f13749f;

    /* renamed from: g */
    private HashMap<String, String> f13750g = new HashMap<>();

    /* renamed from: h */
    private C6271b f13751h;

    /* renamed from: i */
    private byte[] f13752i;

    /* renamed from: j */
    private String f13753j;

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x018a A[SYNTHETIC, Splitter:B:103:0x018a] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0198 A[SYNTHETIC, Splitter:B:109:0x0198] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a6 A[SYNTHETIC, Splitter:B:115:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ba A[SYNTHETIC, Splitter:B:125:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01c8 A[SYNTHETIC, Splitter:B:131:0x01c8] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01d6 A[SYNTHETIC, Splitter:B:137:0x01d6] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01ec A[SYNTHETIC, Splitter:B:148:0x01ec] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01fa A[SYNTHETIC, Splitter:B:154:0x01fa] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0208 A[SYNTHETIC, Splitter:B:160:0x0208] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128 A[SYNTHETIC, Splitter:B:59:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0136 A[SYNTHETIC, Splitter:B:65:0x0136] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0144 A[SYNTHETIC, Splitter:B:71:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0159 A[SYNTHETIC, Splitter:B:81:0x0159] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0167 A[SYNTHETIC, Splitter:B:87:0x0167] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0175 A[SYNTHETIC, Splitter:B:93:0x0175] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x011a=Splitter:B:53:0x011a, B:75:0x014b=Splitter:B:75:0x014b, B:97:0x017c=Splitter:B:97:0x017c, B:119:0x01ac=Splitter:B:119:0x01ac} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void doInBackground(java.lang.Void... r7) {
        /*
            r6 = this;
            java.lang.String r7 = "Accept"
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "charset"
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.String r4 = r6.f13744a     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r3.<init>(r4)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r6.f13745b = r3     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.String r4 = "POST"
            r3.setRequestMethod(r4)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.HttpURLConnection r3 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r6.f13750g     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r3.setRequestProperty(r0, r4)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.HttpURLConnection r0 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r6.f13750g     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r0.setRequestProperty(r7, r3)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.HttpURLConnection r7 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            int r0 = r6.f13748e     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.setReadTimeout(r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.HttpURLConnection r7 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            int r0 = r6.f13749f     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.setConnectTimeout(r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r6.f13750g     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            boolean r7 = r7.containsKey(r1)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            if (r7 == 0) goto L_0x0058
            java.net.HttpURLConnection r7 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r6.f13750g     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.setRequestProperty(r1, r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
        L_0x0058:
            com.cardinalcommerce.shared.cs.d.b r7 = r6.f13751h     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            com.cardinalcommerce.shared.cs.d.b r0 = com.cardinalcommerce.shared.p065cs.p068d.C6271b.JOSE     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            if (r7 != r0) goto L_0x0076
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.HttpURLConnection r0 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.<init>(r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r6.f13746c = r7     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            byte[] r0 = r6.f13752i     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.write(r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.io.DataOutputStream r7 = r6.f13746c     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.flush()     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            goto L_0x008d
        L_0x0076:
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.HttpURLConnection r0 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.<init>(r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r6.f13747d = r7     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.String r0 = r6.f13753j     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.write(r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.io.OutputStreamWriter r7 = r6.f13747d     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.flush()     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
        L_0x008d:
            java.net.HttpURLConnection r7 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            int r7 = r7.getResponseCode()     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 != r0) goto L_0x00df
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.net.HttpURLConnection r1 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r0.<init>(r1)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7.<init>(r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ProtocolException -> 0x00d9, MalformedURLException -> 0x00d3, SocketTimeoutException -> 0x00cd, IOException -> 0x00c8, all -> 0x00c3 }
            r0.<init>()     // Catch:{ ProtocolException -> 0x00d9, MalformedURLException -> 0x00d3, SocketTimeoutException -> 0x00cd, IOException -> 0x00c8, all -> 0x00c3 }
        L_0x00ac:
            java.lang.String r1 = r7.readLine()     // Catch:{ ProtocolException -> 0x00d9, MalformedURLException -> 0x00d3, SocketTimeoutException -> 0x00cd, IOException -> 0x00c8, all -> 0x00c3 }
            if (r1 == 0) goto L_0x00bb
            r0.append(r1)     // Catch:{ ProtocolException -> 0x00d9, MalformedURLException -> 0x00d3, SocketTimeoutException -> 0x00cd, IOException -> 0x00c8, all -> 0x00c3 }
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch:{ ProtocolException -> 0x00d9, MalformedURLException -> 0x00d3, SocketTimeoutException -> 0x00cd, IOException -> 0x00c8, all -> 0x00c3 }
            goto L_0x00ac
        L_0x00bb:
            java.lang.String r0 = r0.toString()     // Catch:{ ProtocolException -> 0x00d9, MalformedURLException -> 0x00d3, SocketTimeoutException -> 0x00cd, IOException -> 0x00c8, all -> 0x00c3 }
            r6.mo17213a((java.lang.String) r0)     // Catch:{ ProtocolException -> 0x00d9, MalformedURLException -> 0x00d3, SocketTimeoutException -> 0x00cd, IOException -> 0x00c8, all -> 0x00c3 }
            goto L_0x00eb
        L_0x00c3:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L_0x01e3
        L_0x00c8:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x011a
        L_0x00cd:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x014b
        L_0x00d3:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x017c
        L_0x00d9:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x01ac
        L_0x00df:
            java.lang.String r7 = "ACS not reachable"
            java.net.HttpURLConnection r0 = r6.f13745b     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            int r0 = r0.getResponseCode()     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r6.mo17214a((java.lang.String) r7, (int) r0)     // Catch:{ ProtocolException -> 0x01aa, MalformedURLException -> 0x017a, SocketTimeoutException -> 0x0149, IOException -> 0x0118, all -> 0x0115 }
            r7 = r2
        L_0x00eb:
            java.net.HttpURLConnection r0 = r6.f13745b
            if (r0 == 0) goto L_0x00f2
            r0.disconnect()
        L_0x00f2:
            if (r7 == 0) goto L_0x00fe
            r7.close()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x00fe
        L_0x00f8:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x00fe:
            java.io.OutputStreamWriter r7 = r6.f13747d
            if (r7 == 0) goto L_0x010c
            r7.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x010c
        L_0x0106:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x010c:
            java.io.DataOutputStream r7 = r6.f13746c
            if (r7 == 0) goto L_0x01e0
            r7.close()     // Catch:{ IOException -> 0x01da }
            goto L_0x01e0
        L_0x0115:
            r7 = move-exception
            goto L_0x01e3
        L_0x0118:
            r7 = move-exception
            r0 = r2
        L_0x011a:
            com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION     // Catch:{ all -> 0x01e1 }
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r1)     // Catch:{ all -> 0x01e1 }
            java.net.HttpURLConnection r7 = r6.f13745b
            if (r7 == 0) goto L_0x0126
            r7.disconnect()
        L_0x0126:
            if (r0 == 0) goto L_0x0132
            r0.close()     // Catch:{ IOException -> 0x012c }
            goto L_0x0132
        L_0x012c:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x0132:
            java.io.OutputStreamWriter r7 = r6.f13747d
            if (r7 == 0) goto L_0x0140
            r7.close()     // Catch:{ IOException -> 0x013a }
            goto L_0x0140
        L_0x013a:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x0140:
            java.io.DataOutputStream r7 = r6.f13746c
            if (r7 == 0) goto L_0x01e0
            r7.close()     // Catch:{ IOException -> 0x01da }
            goto L_0x01e0
        L_0x0149:
            r7 = move-exception
            r0 = r2
        L_0x014b:
            com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.SOCKET_TIMEOUT_EXCEPTION     // Catch:{ all -> 0x01e1 }
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r1)     // Catch:{ all -> 0x01e1 }
            java.net.HttpURLConnection r7 = r6.f13745b
            if (r7 == 0) goto L_0x0157
            r7.disconnect()
        L_0x0157:
            if (r0 == 0) goto L_0x0163
            r0.close()     // Catch:{ IOException -> 0x015d }
            goto L_0x0163
        L_0x015d:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x0163:
            java.io.OutputStreamWriter r7 = r6.f13747d
            if (r7 == 0) goto L_0x0171
            r7.close()     // Catch:{ IOException -> 0x016b }
            goto L_0x0171
        L_0x016b:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x0171:
            java.io.DataOutputStream r7 = r6.f13746c
            if (r7 == 0) goto L_0x01e0
            r7.close()     // Catch:{ IOException -> 0x01da }
            goto L_0x01e0
        L_0x017a:
            r7 = move-exception
            r0 = r2
        L_0x017c:
            com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.MALFORMED_URL_EXCEPTION     // Catch:{ all -> 0x01e1 }
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r1)     // Catch:{ all -> 0x01e1 }
            java.net.HttpURLConnection r7 = r6.f13745b
            if (r7 == 0) goto L_0x0188
            r7.disconnect()
        L_0x0188:
            if (r0 == 0) goto L_0x0194
            r0.close()     // Catch:{ IOException -> 0x018e }
            goto L_0x0194
        L_0x018e:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x0194:
            java.io.OutputStreamWriter r7 = r6.f13747d
            if (r7 == 0) goto L_0x01a2
            r7.close()     // Catch:{ IOException -> 0x019c }
            goto L_0x01a2
        L_0x019c:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x01a2:
            java.io.DataOutputStream r7 = r6.f13746c
            if (r7 == 0) goto L_0x01e0
            r7.close()     // Catch:{ IOException -> 0x01da }
            goto L_0x01e0
        L_0x01aa:
            r7 = move-exception
            r0 = r2
        L_0x01ac:
            com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.PROTOCOL_EXCEPTION     // Catch:{ all -> 0x01e1 }
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r1)     // Catch:{ all -> 0x01e1 }
            java.net.HttpURLConnection r7 = r6.f13745b
            if (r7 == 0) goto L_0x01b8
            r7.disconnect()
        L_0x01b8:
            if (r0 == 0) goto L_0x01c4
            r0.close()     // Catch:{ IOException -> 0x01be }
            goto L_0x01c4
        L_0x01be:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x01c4:
            java.io.OutputStreamWriter r7 = r6.f13747d
            if (r7 == 0) goto L_0x01d2
            r7.close()     // Catch:{ IOException -> 0x01cc }
            goto L_0x01d2
        L_0x01cc:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x01d2:
            java.io.DataOutputStream r7 = r6.f13746c
            if (r7 == 0) goto L_0x01e0
            r7.close()     // Catch:{ IOException -> 0x01da }
            goto L_0x01e0
        L_0x01da:
            r7 = move-exception
            com.cardinalcommerce.shared.cs.b.a r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r7, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r0)
        L_0x01e0:
            return r2
        L_0x01e1:
            r7 = move-exception
            r2 = r0
        L_0x01e3:
            java.net.HttpURLConnection r0 = r6.f13745b
            if (r0 == 0) goto L_0x01ea
            r0.disconnect()
        L_0x01ea:
            if (r2 == 0) goto L_0x01f6
            r2.close()     // Catch:{ IOException -> 0x01f0 }
            goto L_0x01f6
        L_0x01f0:
            r0 = move-exception
            com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r0, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r1)
        L_0x01f6:
            java.io.OutputStreamWriter r0 = r6.f13747d
            if (r0 == 0) goto L_0x0204
            r0.close()     // Catch:{ IOException -> 0x01fe }
            goto L_0x0204
        L_0x01fe:
            r0 = move-exception
            com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r0, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r1)
        L_0x0204:
            java.io.DataOutputStream r0 = r6.f13746c
            if (r0 == 0) goto L_0x0212
            r0.close()     // Catch:{ IOException -> 0x020c }
            goto L_0x0212
        L_0x020c:
            r0 = move-exception
            com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION
            r6.mo17212a((java.lang.Exception) r0, (com.cardinalcommerce.shared.p065cs.p067b.C6266a) r1)
        L_0x0212:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.p065cs.p068d.C6270a.doInBackground(java.lang.Void[]):java.lang.Void");
    }

    /* renamed from: a */
    public void mo17212a(Exception exc, C6266a aVar) {
    }

    /* renamed from: a */
    public void mo17213a(String str) {
    }

    /* renamed from: a */
    public void mo17214a(String str, int i) {
    }

    /* renamed from: a */
    public void mo17766a(String str, String str2, int i) {
        this.f13744a = str;
        this.f13751h = C6271b.JSON;
        this.f13748e = i;
        this.f13749f = i;
        this.f13753j = str2;
        this.f13750g.put("Content-Type", "application/json");
        this.f13750g.put("Accept", "application/json");
    }

    /* renamed from: a */
    public void mo17767a(String str, byte[] bArr, int i) {
        this.f13744a = str;
        this.f13752i = bArr;
        this.f13751h = C6271b.JOSE;
        this.f13748e = i;
        this.f13749f = i;
        HashMap<String, String> hashMap = new HashMap<>();
        this.f13750g = hashMap;
        hashMap.put("Content-Type", "application/jose;charset=utf-8");
        this.f13750g.put("Accept", "application/jose");
        this.f13750g.put("charset", "UTF-8");
    }
}
