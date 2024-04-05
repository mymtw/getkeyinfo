package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.animation.C0391c;
import com.google.android.exoplayer2.drm.C14224f;
import com.google.common.base.C15781b;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p504ai.C13983i;
import p505aj.C14002i;
import p505aj.C14008o;
import p505aj.C14010p;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17912g;

/* renamed from: com.google.android.exoplayer2.drm.h */
public final class C14230h implements C14231i {

    /* renamed from: a */
    public final C14010p f31580a;

    /* renamed from: b */
    public final String f31581b;

    /* renamed from: c */
    public final boolean f31582c;

    /* renamed from: d */
    public final HashMap f31583d;

    public C14230h(String str, boolean z, C14008o.C14009a aVar) {
        C14075p.m21691c(!z || !TextUtils.isEmpty(str));
        this.f31580a = aVar;
        this.f31581b = str;
        this.f31582c = z;
        this.f31583d = new HashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        r0 = r7.toByteArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = p513bj.C14049b0.f30913a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004e, code lost:
        r8 = r6.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r8 == -1) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
        r7.write(r0, r3, r8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00e3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m22209b(p505aj.C14010p r36, java.lang.String r37, byte[] r38, java.util.Map<java.lang.String, java.lang.String> r39) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        /*
            aj.s r1 = new aj.s
            r0 = r36
            aj.o$a r0 = (p505aj.C14008o.C14009a) r0
            aj.o r2 = new aj.o
            java.lang.String r3 = r0.f30842b
            int r4 = r0.f30843c
            int r5 = r0.f30844d
            aj.q r0 = r0.f30841a
            r2.<init>(r3, r4, r5, r0)
            r1.<init>(r2)
            r19 = 0
            r17 = 0
            r13 = 0
            r8 = 0
            java.util.Collections.emptyMap()
            r15 = -1
            android.net.Uri r7 = android.net.Uri.parse(r37)
            r10 = 2
            r18 = 1
            java.lang.String r2 = "The uri must be set."
            p513bj.C14075p.m21697i(r7, r2)
            aj.i r21 = new aj.i
            r6 = r21
            r11 = r38
            r12 = r39
            r6.<init>(r7, r8, r10, r11, r12, r13, r15, r17, r18, r19)
            r3 = 0
            r5 = r3
            r4 = r21
        L_0x003e:
            aj.h r6 = new aj.h     // Catch:{ Exception -> 0x00e4 }
            r6.<init>(r1, r4)     // Catch:{ Exception -> 0x00e4 }
            int r0 = p513bj.C14049b0.f30913a     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            r7.<init>()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
        L_0x004e:
            int r8 = r6.read(r0)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            r9 = -1
            if (r8 == r9) goto L_0x005e
            r7.write(r0, r3, r8)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            goto L_0x004e
        L_0x0059:
            r0 = move-exception
            goto L_0x00de
        L_0x005c:
            r0 = move-exception
            goto L_0x0068
        L_0x005e:
            byte[] r0 = r7.toByteArray()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            int r2 = p513bj.C14049b0.f30913a     // Catch:{ Exception -> 0x00e4 }
            r6.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r0
        L_0x0068:
            int r7 = r0.responseCode     // Catch:{ all -> 0x0059 }
            r8 = 307(0x133, float:4.3E-43)
            if (r7 == r8) goto L_0x0072
            r8 = 308(0x134, float:4.32E-43)
            if (r7 != r8) goto L_0x0077
        L_0x0072:
            r7 = 5
            if (r5 >= r7) goto L_0x0077
            r7 = 1
            goto L_0x0078
        L_0x0077:
            r7 = r3
        L_0x0078:
            r8 = 0
            if (r7 != 0) goto L_0x007c
            goto L_0x0097
        L_0x007c:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r0.headerFields     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0097
            java.lang.String r9 = "Location"
            java.lang.Object r7 = r7.get(r9)     // Catch:{ all -> 0x0059 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0097
            boolean r9 = r7.isEmpty()     // Catch:{ all -> 0x0059 }
            if (r9 != 0) goto L_0x0097
            java.lang.Object r7 = r7.get(r3)     // Catch:{ all -> 0x0059 }
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0059 }
        L_0x0097:
            if (r8 == 0) goto L_0x00dd
            int r5 = r5 + 1
            long r9 = r4.f30775b     // Catch:{ all -> 0x0059 }
            int r0 = r4.f30776c     // Catch:{ all -> 0x0059 }
            byte[] r7 = r4.f30777d     // Catch:{ all -> 0x0059 }
            java.util.Map<java.lang.String, java.lang.String> r11 = r4.f30778e     // Catch:{ all -> 0x0059 }
            long r12 = r4.f30779f     // Catch:{ all -> 0x0059 }
            long r14 = r4.f30780g     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = r4.f30781h     // Catch:{ all -> 0x0059 }
            r37 = r5
            int r5 = r4.f30782i     // Catch:{ all -> 0x0059 }
            java.lang.Object r4 = r4.f30783j     // Catch:{ all -> 0x0059 }
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x0059 }
            p513bj.C14075p.m21697i(r8, r2)     // Catch:{ all -> 0x0059 }
            aj.i r16 = new aj.i     // Catch:{ all -> 0x0059 }
            r22 = r16
            r23 = r8
            r24 = r9
            r26 = r0
            r27 = r7
            r28 = r11
            r29 = r12
            r31 = r14
            r33 = r3
            r34 = r5
            r35 = r4
            r22.<init>(r23, r24, r26, r27, r28, r29, r31, r33, r34, r35)     // Catch:{ all -> 0x0059 }
            int r0 = p513bj.C14049b0.f30913a     // Catch:{ Exception -> 0x00e4 }
            r6.close()     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            r5 = r37
            r4 = r16
            r3 = 0
            goto L_0x003e
        L_0x00dd:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x00de:
            int r2 = p513bj.C14049b0.f30913a     // Catch:{ Exception -> 0x00e4 }
            r6.close()     // Catch:{ IOException -> 0x00e3 }
        L_0x00e3:
            throw r0     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            r26 = r0
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r0 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            android.net.Uri r2 = r1.f30851c
            r2.getClass()
            java.util.Map r23 = r1.mo46815d()
            long r3 = r1.f30850b
            r20 = r0
            r22 = r2
            r24 = r3
            r20.<init>(r21, r22, r23, r24, r26)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.C14230h.m22209b(aj.p, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* renamed from: a */
    public final byte[] mo47347a(UUID uuid, C14224f.C14225a aVar) throws MediaDrmCallbackException {
        UUID uuid2 = uuid;
        C14224f.C14225a aVar2 = aVar;
        String str = aVar2.f31573b;
        if (this.f31582c || TextUtils.isEmpty(str)) {
            str = this.f31581b;
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = C17912g.f38901e;
            hashMap.put("Content-Type", uuid3.equals(uuid2) ? "text/xml" : C17912g.f38899c.equals(uuid2) ? "application/json" : "application/octet-stream");
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f31583d) {
                hashMap.putAll(this.f31583d);
            }
            return m22209b(this.f31580a, str, aVar2.f31572a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        C14075p.m21697i(uri, "The uri must be set.");
        throw new MediaDrmCallbackException(new C14002i(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null), Uri.EMPTY, ImmutableMap.m25853of(), 0, new IllegalStateException("No license URL"));
    }

    /* renamed from: c */
    public final byte[] mo47348c(C14224f.C14228d dVar) throws MediaDrmCallbackException {
        String str = dVar.f31575b;
        byte[] bArr = dVar.f31574a;
        int i = C14049b0.f30913a;
        String str2 = new String(bArr, C15781b.f35562c);
        return m22209b(this.f31580a, C13983i.m21492k(str2.length() + C0391c.m1055a(str, 15), str, "&signedRequest=", str2), (byte[]) null, Collections.emptyMap());
    }
}
