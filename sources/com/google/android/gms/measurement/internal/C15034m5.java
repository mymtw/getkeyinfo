package com.google.android.gms.measurement.internal;

import androidx.appcompat.app.C0164l;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.m5 */
public final class C15034m5 implements Runnable {

    /* renamed from: b */
    public final URL f33682b;

    /* renamed from: c */
    public final /* synthetic */ C15043n5 f33683c;

    /* renamed from: d */
    public final C0164l f33684d;

    public C15034m5(C15043n5 n5Var, String str, URL url, C0164l lVar) {
        this.f33683c = n5Var;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(lVar);
        this.f33682b = url;
        this.f33684d = lVar;
    }

    /* renamed from: a */
    public final void mo52247a(int i, IOException iOException, byte[] bArr, Map map) {
        ((C15103u3) this.f33683c.f33681b).mo52015a().mo52308o(new C15025l5(this, i, iOException, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[SYNTHETIC, Splitter:B:26:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.n5 r0 = r10.f33683c
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()
            r0.mo52304k()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.n5 r2 = r10.f33683c     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            java.net.URL r3 = r10.f33682b     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            if (r4 == 0) goto L_0x0086
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            r3.setDefaultUseCaches(r0)     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            com.google.android.gms.measurement.internal.o4 r4 = r2.f33681b     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            r4.getClass()     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            r2.getClass()     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            r3.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0084, all -> 0x0082 }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x007f, all -> 0x007c }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0070 }
            r5.<init>()     // Catch:{ all -> 0x0070 }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ all -> 0x0070 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x006e }
        L_0x0056:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x006e }
            if (r8 <= 0) goto L_0x0060
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x006e }
            goto L_0x0056
        L_0x0060:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x006e }
            r6.close()     // Catch:{ IOException -> 0x007a, all -> 0x0078 }
            r3.disconnect()
            r10.mo52247a(r2, r1, r0, r4)
            return
        L_0x006e:
            r0 = move-exception
            goto L_0x0072
        L_0x0070:
            r0 = move-exception
            r6 = r1
        L_0x0072:
            if (r6 == 0) goto L_0x0077
            r6.close()     // Catch:{ IOException -> 0x007a, all -> 0x0078 }
        L_0x0077:
            throw r0     // Catch:{ IOException -> 0x007a, all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            goto L_0x0094
        L_0x007a:
            r0 = move-exception
            goto L_0x00a3
        L_0x007c:
            r0 = move-exception
            r4 = r1
            goto L_0x0094
        L_0x007f:
            r0 = move-exception
            r4 = r1
            goto L_0x00a3
        L_0x0082:
            r2 = move-exception
            goto L_0x0090
        L_0x0084:
            r2 = move-exception
            goto L_0x009f
        L_0x0086:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch:{ IOException -> 0x009d, all -> 0x008e }
            throw r2     // Catch:{ IOException -> 0x009d, all -> 0x008e }
        L_0x008e:
            r2 = move-exception
            r3 = r1
        L_0x0090:
            r4 = r1
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x0094:
            if (r3 == 0) goto L_0x0099
            r3.disconnect()
        L_0x0099:
            r10.mo52247a(r2, r1, r1, r4)
            throw r0
        L_0x009d:
            r2 = move-exception
            r3 = r1
        L_0x009f:
            r4 = r1
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x00a3:
            if (r3 == 0) goto L_0x00a8
            r3.disconnect()
        L_0x00a8:
            r10.mo52247a(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15034m5.run():void");
    }
}
