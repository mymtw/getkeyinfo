package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;
import p193o.C7494b;

/* renamed from: com.google.android.gms.measurement.internal.s2 */
public final class C15085s2 implements Runnable {

    /* renamed from: b */
    public final URL f33820b;

    /* renamed from: c */
    public final byte[] f33821c;

    /* renamed from: d */
    public final C15067q2 f33822d;

    /* renamed from: e */
    public final String f33823e;

    /* renamed from: f */
    public final Map<String, String> f33824f;

    /* renamed from: g */
    public final /* synthetic */ C15094t2 f33825g;

    public C15085s2(C15094t2 t2Var, String str, URL url, byte[] bArr, C7494b bVar, C15067q2 q2Var) {
        this.f33825g = t2Var;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(q2Var);
        this.f33820b = url;
        this.f33821c = bArr;
        this.f33822d = q2Var;
        this.f33823e = str;
        this.f33824f = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe A[SYNTHETIC, Splitter:B:40:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130 A[SYNTHETIC, Splitter:B:61:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0173 A[SYNTHETIC, Splitter:B:73:0x0173] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.t2 r1 = r13.f33825g
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo52015a()
            r1.mo52304k()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.t2 r3 = r13.f33825g     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            java.net.URL r4 = r13.f33820b     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            if (r5 == 0) goto L_0x0121
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            com.google.android.gms.measurement.internal.o4 r5 = r3.f33681b     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            r5.getClass()     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            r3.getClass()     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.f33824f     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            if (r5 == 0) goto L_0x006b
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
        L_0x004f:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            if (r6 == 0) goto L_0x006b
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            goto L_0x004f
        L_0x006b:
            byte[] r5 = r13.f33821c     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            if (r5 == 0) goto L_0x00b8
            com.google.android.gms.measurement.internal.t2 r5 = r13.f33825g     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            com.google.android.gms.measurement.internal.f7 r5 = r5.f34048c     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            com.google.android.gms.measurement.internal.h7 r5 = r5.f33492h     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r5)     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            byte[] r6 = r13.f33821c     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            byte[] r5 = r5.mo52111K(r6)     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            com.google.android.gms.measurement.internal.t2 r6 = r13.f33825g     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            com.google.android.gms.measurement.internal.o4 r6 = r6.f33681b     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            com.google.android.gms.measurement.internal.o2 r6 = r6.mo52016b()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            com.google.android.gms.measurement.internal.m2 r6 = r6.f33732o     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            int r7 = r5.length     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.lang.String r8 = "Uploading data. size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            r6.mo52238b(r9, r8)     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            r4.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            r4.connect()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            r3.write(r5)     // Catch:{ IOException -> 0x00b5, all -> 0x00af }
            r3.close()     // Catch:{ IOException -> 0x00b5, all -> 0x00af }
            goto L_0x00b8
        L_0x00af:
            r5 = move-exception
            r9 = r1
            r12 = r2
            r2 = r3
            goto L_0x012e
        L_0x00b5:
            r5 = move-exception
            goto L_0x016d
        L_0x00b8:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x011c, all -> 0x0117 }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x0111, all -> 0x010d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00fa }
            r3.<init>()     // Catch:{ all -> 0x00fa }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00fa }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00f8 }
        L_0x00cd:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00f8 }
            if (r7 <= 0) goto L_0x00d7
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00f8 }
            goto L_0x00cd
        L_0x00d7:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00f8 }
            r5.close()     // Catch:{ IOException -> 0x0107, all -> 0x0102 }
            r4.disconnect()
            com.google.android.gms.measurement.internal.t2 r0 = r13.f33825g
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()
            com.google.android.gms.measurement.internal.r2 r1 = new com.google.android.gms.measurement.internal.r2
            java.lang.String r6 = r13.f33823e
            com.google.android.gms.measurement.internal.q2 r7 = r13.f33822d
            r9 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01a7
        L_0x00f8:
            r1 = move-exception
            goto L_0x00fc
        L_0x00fa:
            r1 = move-exception
            r5 = r2
        L_0x00fc:
            if (r5 == 0) goto L_0x0101
            r5.close()     // Catch:{ IOException -> 0x0107, all -> 0x0102 }
        L_0x0101:
            throw r1     // Catch:{ IOException -> 0x0107, all -> 0x0102 }
        L_0x0102:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x012e
        L_0x0107:
            r1 = move-exception
            r10 = r1
            r9 = r8
            r12 = r11
            goto L_0x0171
        L_0x010d:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x012e
        L_0x0111:
            r1 = move-exception
            r10 = r1
            r12 = r2
            r9 = r8
            goto L_0x0171
        L_0x0117:
            r3 = move-exception
            r9 = r1
            r12 = r2
            r5 = r3
            goto L_0x012e
        L_0x011c:
            r3 = move-exception
            r9 = r1
            r12 = r2
            r10 = r3
            goto L_0x0171
        L_0x0121:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
            throw r3     // Catch:{ IOException -> 0x0169, all -> 0x0129 }
        L_0x0129:
            r3 = move-exception
            r5 = r3
            r9 = r1
            r4 = r2
            r12 = r4
        L_0x012e:
            if (r2 == 0) goto L_0x014a
            r2.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x014a
        L_0x0134:
            r1 = move-exception
            com.google.android.gms.measurement.internal.t2 r2 = r13.f33825g
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g
            java.lang.String r3 = r13.f33823e
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r3)
            r2.mo52239c(r3, r0, r1)
        L_0x014a:
            if (r4 == 0) goto L_0x014f
            r4.disconnect()
        L_0x014f:
            com.google.android.gms.measurement.internal.t2 r0 = r13.f33825g
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()
            com.google.android.gms.measurement.internal.r2 r1 = new com.google.android.gms.measurement.internal.r2
            java.lang.String r7 = r13.f33823e
            com.google.android.gms.measurement.internal.q2 r8 = r13.f33822d
            r10 = 0
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.mo52308o(r1)
            throw r5
        L_0x0169:
            r3 = move-exception
            r5 = r3
            r3 = r2
            r4 = r3
        L_0x016d:
            r9 = r1
            r12 = r2
            r2 = r3
            r10 = r5
        L_0x0171:
            if (r2 == 0) goto L_0x018d
            r2.close()     // Catch:{ IOException -> 0x0177 }
            goto L_0x018d
        L_0x0177:
            r1 = move-exception
            com.google.android.gms.measurement.internal.t2 r2 = r13.f33825g
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g
            java.lang.String r3 = r13.f33823e
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r3)
            r2.mo52239c(r3, r0, r1)
        L_0x018d:
            if (r4 == 0) goto L_0x0192
            r4.disconnect()
        L_0x0192:
            com.google.android.gms.measurement.internal.t2 r0 = r13.f33825g
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()
            com.google.android.gms.measurement.internal.r2 r1 = new com.google.android.gms.measurement.internal.r2
            java.lang.String r7 = r13.f33823e
            com.google.android.gms.measurement.internal.q2 r8 = r13.f33822d
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x01a7:
            r0.mo52308o(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15085s2.run():void");
    }
}
