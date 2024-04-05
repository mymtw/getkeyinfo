package com.bugsnag.android;

import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.c0 */
public final class C5725c0 implements C5731d0 {

    /* renamed from: a */
    public final C5935y f12173a;

    /* renamed from: b */
    public final C5816o1 f12174b;

    public C5725c0(C5938z zVar, C5816o1 o1Var) {
        this.f12173a = zVar;
        this.f12174b = o1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        kotlin.reflect.C19421p.m32917E(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        kotlin.reflect.C19421p.m32917E(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d3, code lost:
        kotlin.reflect.C19421p.m32917E(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d6, code lost:
        throw r12;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.HttpURLConnection m11504e(java.net.URL r11, byte[] r12, java.util.Map r13) {
        /*
            java.net.URLConnection r11 = r11.openConnection()
            if (r11 == 0) goto L_0x00d7
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11
            r0 = 1
            r11.setDoOutput(r0)
            int r1 = r12.length
            r11.setFixedLengthStreamingMode(r1)
            r1 = 0
            java.lang.String r2 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "sha1 "
            r3.<init>(r4)     // Catch:{ all -> 0x0085 }
            java.security.DigestOutputStream r4 = new java.security.DigestOutputStream     // Catch:{ all -> 0x0085 }
            com.bugsnag.android.u1 r5 = new com.bugsnag.android.u1     // Catch:{ all -> 0x0085 }
            r5.<init>()     // Catch:{ all -> 0x0085 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0085 }
            r5 = 8192(0x2000, float:1.14794E-41)
            boolean r6 = r4 instanceof java.io.BufferedOutputStream     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x0032
            r5 = r4
            java.io.BufferedOutputStream r5 = (java.io.BufferedOutputStream) r5     // Catch:{ all -> 0x007e }
            goto L_0x0038
        L_0x0032:
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x007e }
            r6.<init>(r4, r5)     // Catch:{ all -> 0x007e }
            r5 = r6
        L_0x0038:
            r5.write(r12)     // Catch:{ all -> 0x0077 }
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0077 }
            kotlin.reflect.C19421p.m32917E(r5, r1)     // Catch:{ all -> 0x007e }
            byte[] r2 = r2.digest()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "shaDigest.digest()"
            kotlin.jvm.internal.C19383o.m32793c(r2, r5)     // Catch:{ all -> 0x007e }
            int r5 = r2.length     // Catch:{ all -> 0x007e }
            r6 = 0
            r7 = r6
        L_0x004c:
            if (r7 >= r5) goto L_0x006d
            byte r8 = r2[r7]     // Catch:{ all -> 0x007e }
            java.lang.String r9 = "%02x"
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ all -> 0x007e }
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)     // Catch:{ all -> 0x007e }
            r10[r6] = r8     // Catch:{ all -> 0x007e }
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r10, r0)     // Catch:{ all -> 0x007e }
            java.lang.String r8 = java.lang.String.format(r9, r8)     // Catch:{ all -> 0x007e }
            java.lang.String r9 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C19383o.m32796f(r8, r9)     // Catch:{ all -> 0x007e }
            r3.append(r8)     // Catch:{ all -> 0x007e }
            int r7 = r7 + 1
            goto L_0x004c
        L_0x006d:
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x007e }
            kotlin.reflect.C19421p.m32917E(r4, r1)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0085 }
            goto L_0x0096
        L_0x0077:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r2 = move-exception
            kotlin.reflect.C19421p.m32917E(r5, r0)     // Catch:{ all -> 0x007e }
            throw r2     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r2 = move-exception
            kotlin.reflect.C19421p.m32917E(r4, r0)     // Catch:{ all -> 0x0085 }
            throw r2     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)
            java.lang.Throwable r0 = kotlin.Result.m35483exceptionOrNullimpl(r0)
            r0.getClass()
            r0 = r1
        L_0x0096:
            if (r0 == 0) goto L_0x009d
            java.lang.String r2 = "Bugsnag-Integrity"
            r11.addRequestProperty(r2, r0)
        L_0x009d:
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x00a5:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00a5
            r11.addRequestProperty(r2, r0)
            goto L_0x00a5
        L_0x00c3:
            java.io.OutputStream r13 = r11.getOutputStream()
            r13.write(r12)     // Catch:{ all -> 0x00d0 }
            kotlin.m r12 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00d0 }
            kotlin.reflect.C19421p.m32917E(r13, r1)
            return r11
        L_0x00d0:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r12 = move-exception
            kotlin.reflect.C19421p.m32917E(r13, r11)
            throw r12
        L_0x00d7:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r12 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5725c0.m11504e(java.net.URL, byte[], java.util.Map):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    public final DeliveryStatus mo16485a(C5728c2 c2Var, C5747g0 g0Var) {
        C19383o.m32798h(c2Var, "payload");
        DeliveryStatus c = mo16487c(g0Var.f12255a, c2Var, (Map) g0Var.f12256b);
        C5816o1 o1Var = this.f12174b;
        o1Var.mo16606f("Session API request finished with status " + c);
        return c;
    }

    /* renamed from: b */
    public final DeliveryStatus mo16486b(C5922v0 v0Var, C5747g0 g0Var) {
        DeliveryStatus c = mo16487c(g0Var.f12255a, v0Var, (Map) g0Var.f12256b);
        C5816o1 o1Var = this.f12174b;
        o1Var.mo16606f("Error API request finished with status " + c);
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053 A[Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061, all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056 A[Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061, all -> 0x005f }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bugsnag.android.DeliveryStatus mo16487c(java.lang.String r4, com.bugsnag.android.C5748g1.C5749a r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r3 = this;
            java.lang.String r0 = "urlString"
            kotlin.jvm.internal.C19383o.m32798h(r4, r0)
            java.lang.String r0 = "streamable"
            kotlin.jvm.internal.C19383o.m32798h(r5, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C19383o.m32798h(r6, r0)
            r0 = 1
            android.net.TrafficStats.setThreadStatsTag(r0)
            com.bugsnag.android.y r1 = r3.f12173a
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.mo1129d()
            if (r1 != 0) goto L_0x0020
            com.bugsnag.android.DeliveryStatus r4 = com.bugsnag.android.DeliveryStatus.UNDELIVERED
            return r4
        L_0x0020:
            r1 = 0
            byte[] r5 = p628nj.C18263b.m30853l0(r5)     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
            java.net.URL r2 = new java.net.URL     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
            r2.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
            java.net.HttpURLConnection r1 = m11504e(r2, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
            int r4 = r1.getResponseCode()     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r5 <= r4) goto L_0x0037
            goto L_0x003e
        L_0x0037:
            r5 = 299(0x12b, float:4.19E-43)
            if (r5 < r4) goto L_0x003e
            com.bugsnag.android.DeliveryStatus r5 = com.bugsnag.android.DeliveryStatus.DELIVERED     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
            goto L_0x0058
        L_0x003e:
            r5 = 400(0x190, float:5.6E-43)
            if (r5 <= r4) goto L_0x0043
            goto L_0x0050
        L_0x0043:
            r5 = 499(0x1f3, float:6.99E-43)
            if (r5 < r4) goto L_0x0050
            r5 = 408(0x198, float:5.72E-43)
            if (r4 == r5) goto L_0x0050
            r5 = 429(0x1ad, float:6.01E-43)
            if (r4 == r5) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 == 0) goto L_0x0056
            com.bugsnag.android.DeliveryStatus r5 = com.bugsnag.android.DeliveryStatus.FAILURE     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
            goto L_0x0058
        L_0x0056:
            com.bugsnag.android.DeliveryStatus r5 = com.bugsnag.android.DeliveryStatus.UNDELIVERED     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
        L_0x0058:
            r3.mo16488d(r4, r1, r5)     // Catch:{ OutOfMemoryError -> 0x0081, IOException -> 0x0071, Exception -> 0x0061 }
            r1.disconnect()
            return r5
        L_0x005f:
            r4 = move-exception
            goto L_0x0091
        L_0x0061:
            r4 = move-exception
            com.bugsnag.android.o1 r5 = r3.f12174b     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "Unexpected error delivering payload"
            r5.mo16602b(r6, r4)     // Catch:{ all -> 0x005f }
            com.bugsnag.android.DeliveryStatus r4 = com.bugsnag.android.DeliveryStatus.FAILURE     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0070
            r1.disconnect()
        L_0x0070:
            return r4
        L_0x0071:
            r4 = move-exception
            com.bugsnag.android.o1 r5 = r3.f12174b     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "IOException encountered in request"
            r5.mo16602b(r6, r4)     // Catch:{ all -> 0x005f }
            com.bugsnag.android.DeliveryStatus r4 = com.bugsnag.android.DeliveryStatus.UNDELIVERED     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0080
            r1.disconnect()
        L_0x0080:
            return r4
        L_0x0081:
            r4 = move-exception
            com.bugsnag.android.o1 r5 = r3.f12174b     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "Encountered OOM delivering payload, falling back to persist on disk"
            r5.mo16602b(r6, r4)     // Catch:{ all -> 0x005f }
            com.bugsnag.android.DeliveryStatus r4 = com.bugsnag.android.DeliveryStatus.UNDELIVERED     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0090
            r1.disconnect()
        L_0x0090:
            return r4
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.disconnect()
        L_0x0096:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5725c0.mo16487c(java.lang.String, com.bugsnag.android.g1$a, java.util.Map):com.bugsnag.android.DeliveryStatus");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.reflect.C19421p.m32917E(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00db, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        kotlin.reflect.C19421p.m32917E(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        throw r7;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16488d(int r6, java.net.HttpURLConnection r7, com.bugsnag.android.DeliveryStatus r8) {
        /*
            r5 = this;
            java.lang.String r0 = ", "
            com.bugsnag.android.o1 r1 = r5.f12174b     // Catch:{ all -> 0x003c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003c }
            r2.<init>()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "Request completed with code "
            r2.append(r3)     // Catch:{ all -> 0x003c }
            r2.append(r6)     // Catch:{ all -> 0x003c }
            r2.append(r0)     // Catch:{ all -> 0x003c }
            java.lang.String r6 = "message: "
            r2.append(r6)     // Catch:{ all -> 0x003c }
            java.lang.String r6 = r7.getResponseMessage()     // Catch:{ all -> 0x003c }
            r2.append(r6)     // Catch:{ all -> 0x003c }
            r2.append(r0)     // Catch:{ all -> 0x003c }
            java.lang.String r6 = "headers: "
            r2.append(r6)     // Catch:{ all -> 0x003c }
            java.util.Map r6 = r7.getHeaderFields()     // Catch:{ all -> 0x003c }
            r2.append(r6)     // Catch:{ all -> 0x003c }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x003c }
            r1.mo16606f(r6)     // Catch:{ all -> 0x003c }
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x003c }
            kotlin.Result.m35480constructorimpl(r6)     // Catch:{ all -> 0x003c }
            goto L_0x0044
        L_0x003c:
            r6 = move-exception
            kotlin.Result$Failure r6 = androidx.compose.foundation.layout.C0761x.m1673J(r6)
            kotlin.Result.m35480constructorimpl(r6)
        L_0x0044:
            r6 = 0
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.InputStream r1 = r7.getInputStream()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "conn.inputStream"
            kotlin.jvm.internal.C19383o.m32793c(r1, r2)     // Catch:{ all -> 0x0090 }
            java.nio.charset.Charset r2 = kotlin.text.C19446a.f43373b     // Catch:{ all -> 0x0090 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0090 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0090 }
            boolean r1 = r3 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x005e
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch:{ all -> 0x0090 }
            goto L_0x0064
        L_0x005e:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0090 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0090 }
            r3 = r1
        L_0x0064:
            com.bugsnag.android.o1 r1 = r5.f12174b     // Catch:{ all -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r2.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = "Received request response: "
            r2.append(r4)     // Catch:{ all -> 0x0089 }
            java.lang.String r4 = kotlinx.coroutines.C19543e0.m33313f0(r3)     // Catch:{ all -> 0x0089 }
            r2.append(r4)     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0089 }
            r1.mo16604d(r2)     // Catch:{ all -> 0x0089 }
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0089 }
            kotlin.reflect.C19421p.m32917E(r3, r6)     // Catch:{ all -> 0x0090 }
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0090 }
            kotlin.Result.m35480constructorimpl(r1)     // Catch:{ all -> 0x0090 }
            goto L_0x0098
        L_0x0089:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r2 = move-exception
            kotlin.reflect.C19421p.m32917E(r3, r1)     // Catch:{ all -> 0x0090 }
            throw r2     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r1 = move-exception
            kotlin.Result$Failure r1 = androidx.compose.foundation.layout.C0761x.m1673J(r1)
            kotlin.Result.m35480constructorimpl(r1)
        L_0x0098:
            com.bugsnag.android.DeliveryStatus r1 = com.bugsnag.android.DeliveryStatus.DELIVERED     // Catch:{ all -> 0x00e6 }
            if (r8 == r1) goto L_0x00e0
            java.io.InputStream r7 = r7.getErrorStream()     // Catch:{ all -> 0x00e6 }
            java.lang.String r8 = "conn.errorStream"
            kotlin.jvm.internal.C19383o.m32793c(r7, r8)     // Catch:{ all -> 0x00e6 }
            java.nio.charset.Charset r8 = kotlin.text.C19446a.f43373b     // Catch:{ all -> 0x00e6 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x00e6 }
            r1.<init>(r7, r8)     // Catch:{ all -> 0x00e6 }
            boolean r7 = r1 instanceof java.io.BufferedReader     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x00b3
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ all -> 0x00e6 }
            goto L_0x00b9
        L_0x00b3:
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x00e6 }
            r7.<init>(r1, r0)     // Catch:{ all -> 0x00e6 }
            r1 = r7
        L_0x00b9:
            com.bugsnag.android.o1 r7 = r5.f12174b     // Catch:{ all -> 0x00d9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r8.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "Request error details: "
            r8.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = kotlinx.coroutines.C19543e0.m33313f0(r1)     // Catch:{ all -> 0x00d9 }
            r8.append(r0)     // Catch:{ all -> 0x00d9 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00d9 }
            r7.mo16608h(r8)     // Catch:{ all -> 0x00d9 }
            kotlin.m r7 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00d9 }
            kotlin.reflect.C19421p.m32917E(r1, r6)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e0
        L_0x00d9:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00db }
        L_0x00db:
            r7 = move-exception
            kotlin.reflect.C19421p.m32917E(r1, r6)     // Catch:{ all -> 0x00e6 }
            throw r7     // Catch:{ all -> 0x00e6 }
        L_0x00e0:
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00e6 }
            kotlin.Result.m35480constructorimpl(r6)     // Catch:{ all -> 0x00e6 }
            goto L_0x00ee
        L_0x00e6:
            r6 = move-exception
            kotlin.Result$Failure r6 = androidx.compose.foundation.layout.C0761x.m1673J(r6)
            kotlin.Result.m35480constructorimpl(r6)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5725c0.mo16488d(int, java.net.HttpURLConnection, com.bugsnag.android.DeliveryStatus):void");
    }
}
