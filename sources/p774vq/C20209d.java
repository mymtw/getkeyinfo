package p774vq;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import p775wq.C20218a;

/* renamed from: vq.d */
public final class C20209d implements C20218a {

    /* renamed from: a */
    public byte[] f44807a;

    /* renamed from: b */
    public String f44808b = null;

    /* renamed from: c */
    public Uri f44809c;

    /* renamed from: d */
    public Map<String, String> f44810d;

    public C20209d() throws Exception {
        new C20217l();
        this.f44810d = new HashMap();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo74454a(byte[] r9) {
        /*
            r8 = this;
            java.lang.Class<vq.d> r9 = p774vq.C20209d.class
            r0 = -1
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            android.net.Uri r3 = r8.f44809c     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r3 = 60000(0xea60, float:8.4078E-41)
            r2.setReadTimeout(r3)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r2.setConnectTimeout(r3)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r3 = "GET"
            r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            javax.net.ssl.HostnameVerifier r3 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r2.setHostnameVerifier(r3)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.f44810d     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
        L_0x0034:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r2.setRequestProperty(r5, r4)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            goto L_0x0034
        L_0x0054:
            int r3 = r2.getResponseCode()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "correlation-id"
            java.lang.String r4 = r2.getHeaderField(r4)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r8.f44808b = r4     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 0
            if (r3 != r4) goto L_0x008d
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x008b }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x008b }
            r6.<init>()     // Catch:{ Exception -> 0x008b }
        L_0x0077:
            int r7 = r4.read(r1)     // Catch:{ Exception -> 0x008b }
            if (r7 == r0) goto L_0x0081
            r6.write(r1, r5, r7)     // Catch:{ Exception -> 0x008b }
            goto L_0x0077
        L_0x0081:
            byte[] r1 = r6.toByteArray()     // Catch:{ Exception -> 0x008b }
            r8.f44807a = r1     // Catch:{ Exception -> 0x008b }
            r1 = r4
            goto L_0x0091
        L_0x0089:
            r1 = r4
            goto L_0x00b3
        L_0x008b:
            r1 = move-exception
            goto L_0x00a5
        L_0x008d:
            byte[] r4 = new byte[r5]     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r8.f44807a = r4     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
        L_0x0091:
            p770sq.C20171d.m34478b(r9, r1)
            r2.disconnect()
            return r3
        L_0x0098:
            r0 = move-exception
            goto L_0x00b3
        L_0x009a:
            r3 = move-exception
            r4 = r1
            r1 = r3
            goto L_0x00a5
        L_0x009e:
            r0 = move-exception
            r2 = r1
            goto L_0x00b3
        L_0x00a1:
            r2 = move-exception
            r4 = r1
            r1 = r2
            r2 = r4
        L_0x00a5:
            p773uq.C20205a.m34555b(r1, r9)     // Catch:{ all -> 0x00b1 }
            p770sq.C20171d.m34478b(r9, r4)
            if (r2 == 0) goto L_0x00b0
            r2.disconnect()
        L_0x00b0:
            return r0
        L_0x00b1:
            r0 = move-exception
            goto L_0x0089
        L_0x00b3:
            p770sq.C20171d.m34478b(r9, r1)
            if (r2 == 0) goto L_0x00bb
            r2.disconnect()
        L_0x00bb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p774vq.C20209d.mo74454a(byte[]):int");
    }

    /* renamed from: b */
    public final String mo74455b() {
        return this.f44808b;
    }

    /* renamed from: c */
    public final void mo74456c(HashMap hashMap) {
        this.f44810d = hashMap;
    }

    /* renamed from: d */
    public final void mo74457d(Uri uri) {
        this.f44809c = uri;
    }

    /* renamed from: e */
    public final byte[] mo74458e() {
        return this.f44807a;
    }
}
