package p774vq;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import p775wq.C20218a;

/* renamed from: vq.e */
public final class C20210e implements C20218a {

    /* renamed from: a */
    public final C20217l f44811a = new C20217l();

    /* renamed from: b */
    public byte[] f44812b;

    /* renamed from: c */
    public String f44813c = null;

    /* renamed from: d */
    public Uri f44814d;

    /* renamed from: e */
    public Map<String, String> f44815e = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo74454a(byte[] r10) {
        /*
            r9 = this;
            java.lang.Class<vq.e> r0 = p774vq.C20210e.class
            r1 = -1
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00c0, all -> 0x00bc }
            android.net.Uri r4 = r9.f44814d     // Catch:{ Exception -> 0x00c0, all -> 0x00bc }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c0, all -> 0x00bc }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00c0, all -> 0x00bc }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x00c0, all -> 0x00bc }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ Exception -> 0x00c0, all -> 0x00bc }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setReadTimeout(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r3.setConnectTimeout(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            javax.net.ssl.HostnameVerifier r4 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r3.setHostnameVerifier(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r4 = "POST"
            r3.setRequestMethod(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            vq.l r4 = r9.f44811a     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r3.setSSLSocketFactory(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r4 = 1
            r3.setDoOutput(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            int r4 = r10.length     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r3.setFixedLengthStreamingMode(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r9.f44815e     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
        L_0x0041:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r3.setRequestProperty(r6, r5)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            goto L_0x0041
        L_0x0061:
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r4.write(r10)     // Catch:{ Exception -> 0x00b4 }
            r4.flush()     // Catch:{ Exception -> 0x00b4 }
            int r10 = r3.getResponseCode()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = "correlation-id"
            java.lang.String r5 = r3.getHeaderField(r5)     // Catch:{ Exception -> 0x00b4 }
            r9.f44813c = r5     // Catch:{ Exception -> 0x00b4 }
            r5 = 200(0xc8, float:2.8E-43)
            r6 = 0
            if (r10 != r5) goto L_0x00a6
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00b4 }
            java.io.InputStream r7 = r3.getInputStream()     // Catch:{ Exception -> 0x00b4 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x00b4 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            r7.<init>()     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
        L_0x008e:
            int r8 = r5.read(r2)     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            if (r8 == r1) goto L_0x0098
            r7.write(r2, r6, r8)     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            goto L_0x008e
        L_0x0098:
            byte[] r2 = r7.toByteArray()     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            r9.f44812b = r2     // Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
            r2 = r5
            goto L_0x00aa
        L_0x00a0:
            r10 = move-exception
            r2 = r5
            goto L_0x00d3
        L_0x00a3:
            r10 = move-exception
            r2 = r5
            goto L_0x00c3
        L_0x00a6:
            byte[] r5 = new byte[r6]     // Catch:{ Exception -> 0x00b4 }
            r9.f44812b = r5     // Catch:{ Exception -> 0x00b4 }
        L_0x00aa:
            p770sq.C20171d.m34478b(r0, r2)
            p770sq.C20171d.m34478b(r0, r4)
            r3.disconnect()
            return r10
        L_0x00b4:
            r10 = move-exception
            goto L_0x00c3
        L_0x00b6:
            r10 = move-exception
            r4 = r2
            goto L_0x00d3
        L_0x00b9:
            r10 = move-exception
            r4 = r2
            goto L_0x00c3
        L_0x00bc:
            r10 = move-exception
            r3 = r2
            r4 = r3
            goto L_0x00d3
        L_0x00c0:
            r10 = move-exception
            r3 = r2
            r4 = r3
        L_0x00c3:
            p773uq.C20205a.m34555b(r10, r0)     // Catch:{ all -> 0x00d2 }
            p770sq.C20171d.m34478b(r0, r2)
            p770sq.C20171d.m34478b(r0, r4)
            if (r3 == 0) goto L_0x00d1
            r3.disconnect()
        L_0x00d1:
            return r1
        L_0x00d2:
            r10 = move-exception
        L_0x00d3:
            p770sq.C20171d.m34478b(r0, r2)
            p770sq.C20171d.m34478b(r0, r4)
            if (r3 == 0) goto L_0x00de
            r3.disconnect()
        L_0x00de:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p774vq.C20210e.mo74454a(byte[]):int");
    }

    /* renamed from: b */
    public final String mo74455b() {
        return this.f44813c;
    }

    /* renamed from: c */
    public final void mo74456c(HashMap hashMap) {
        this.f44815e = hashMap;
    }

    /* renamed from: d */
    public final void mo74457d(Uri uri) {
        this.f44814d = uri;
    }

    /* renamed from: e */
    public final byte[] mo74458e() {
        return this.f44812b;
    }
}
