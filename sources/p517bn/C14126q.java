package p517bn;

import java.util.concurrent.Callable;

/* renamed from: bn.q */
public final /* synthetic */ class C14126q implements Callable {

    /* renamed from: b */
    public /* synthetic */ C14127r f31118b;

    public /* synthetic */ C14126q(C14127r rVar) {
        this.f31118b = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r3.read() != -1) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r3 = new byte[2147483639];
        r6 = 2147483639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r6 <= 0) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        r8 = (byte[]) r5.remove();
        r9 = java.lang.Math.min(r6, r8.length);
        java.lang.System.arraycopy(r8, 0, r3, 2147483639 - r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r6 = r6 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            bn.r r0 = r14.f31118b
            java.net.URL r1 = r0.f31119b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Starting download of: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "FirebaseMessaging"
            android.util.Log.i(r2, r1)
            java.net.URL r1 = r0.f31119b
            java.net.URLConnection r1 = r1.openConnection()
            int r3 = r1.getContentLength()
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r3 > r4) goto L_0x0109
            java.io.InputStream r1 = r1.getInputStream()
            r0.f31121d = r1     // Catch:{ all -> 0x0102 }
            int r3 = p687uj.C18591g.f41061a     // Catch:{ all -> 0x0102 }
            uj.f r3 = new uj.f     // Catch:{ all -> 0x0102 }
            r3.<init>(r1)     // Catch:{ all -> 0x0102 }
            java.util.ArrayDeque r5 = new java.util.ArrayDeque     // Catch:{ all -> 0x0102 }
            r6 = 20
            r5.<init>(r6)     // Catch:{ all -> 0x0102 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r7 = 0
            r8 = r7
        L_0x0039:
            r9 = -1
            r10 = 2147483639(0x7ffffff7, float:NaN)
            if (r8 >= r10) goto L_0x0087
            int r10 = r10 - r8
            int r10 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x0102 }
            byte[] r11 = new byte[r10]     // Catch:{ all -> 0x0102 }
            r5.add(r11)     // Catch:{ all -> 0x0102 }
            r12 = r7
        L_0x004a:
            if (r12 >= r10) goto L_0x006e
            int r13 = r10 - r12
            int r13 = r3.read(r11, r12, r13)     // Catch:{ all -> 0x0102 }
            if (r13 != r9) goto L_0x006b
            byte[] r3 = new byte[r8]     // Catch:{ all -> 0x0102 }
            r6 = r8
        L_0x0057:
            if (r6 <= 0) goto L_0x00a4
            java.lang.Object r9 = r5.remove()     // Catch:{ all -> 0x0102 }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0102 }
            int r10 = r9.length     // Catch:{ all -> 0x0102 }
            int r10 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x0102 }
            int r11 = r8 - r6
            java.lang.System.arraycopy(r9, r7, r3, r11, r10)     // Catch:{ all -> 0x0102 }
            int r6 = r6 - r10
            goto L_0x0057
        L_0x006b:
            int r12 = r12 + r13
            int r8 = r8 + r13
            goto L_0x004a
        L_0x006e:
            long r9 = (long) r6     // Catch:{ all -> 0x0102 }
            long r9 = r9 + r9
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x007b
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0039
        L_0x007b:
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0085
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0039
        L_0x0085:
            int r6 = (int) r9     // Catch:{ all -> 0x0102 }
            goto L_0x0039
        L_0x0087:
            int r3 = r3.read()     // Catch:{ all -> 0x0102 }
            if (r3 != r9) goto L_0x00fa
            byte[] r3 = new byte[r10]     // Catch:{ all -> 0x0102 }
            r6 = r10
        L_0x0090:
            if (r6 <= 0) goto L_0x00a4
            java.lang.Object r8 = r5.remove()     // Catch:{ all -> 0x0102 }
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x0102 }
            int r9 = r8.length     // Catch:{ all -> 0x0102 }
            int r9 = java.lang.Math.min(r6, r9)     // Catch:{ all -> 0x0102 }
            int r11 = r10 - r6
            java.lang.System.arraycopy(r8, r7, r3, r11, r9)     // Catch:{ all -> 0x0102 }
            int r6 = r6 - r9
            goto L_0x0090
        L_0x00a4:
            r1.close()
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x00bf
            java.net.URL r1 = r0.f31119b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r1 = r1.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r1 = r1 + 34
            r5.<init>(r1)
        L_0x00bf:
            int r1 = r3.length
            if (r1 > r4) goto L_0x00f2
            int r1 = r3.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r7, r1)
            if (r1 == 0) goto L_0x00e0
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L_0x00df
            java.net.URL r0 = r0.f31119b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Successfully downloaded image: "
            java.lang.String r0 = r3.concat(r0)
            android.util.Log.d(r2, r0)
        L_0x00df:
            return r1
        L_0x00e0:
            java.io.IOException r1 = new java.io.IOException
            java.net.URL r0 = r0.f31119b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Failed to decode image: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x00f2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Image exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0102 }
            java.lang.String r2 = "input is too large to fit in a byte array"
            r0.<init>(r2)     // Catch:{ all -> 0x0102 }
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r0 = move-exception
            if (r1 == 0) goto L_0x0108
            r1.close()     // Catch:{ all -> 0x0108 }
        L_0x0108:
            throw r0
        L_0x0109:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Content-Length exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p517bn.C14126q.call():java.lang.Object");
    }
}
