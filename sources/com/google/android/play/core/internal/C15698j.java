package com.google.android.play.core.internal;

import java.util.List;
import p673sl.C18531k;

/* renamed from: com.google.android.play.core.internal.j */
public final class C15698j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ List f35475b;

    /* renamed from: c */
    public final /* synthetic */ C18531k f35476c;

    /* renamed from: d */
    public final /* synthetic */ C15699k f35477d;

    public C15698j(C15699k kVar, List list, C18531k kVar2) {
        this.f35477d = kVar;
        this.f35475b = list;
        this.f35476c = kVar2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0231 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x017d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0182 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0234 A[Catch:{ all -> 0x0183, all -> 0x0231, Exception -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "SplitCompat"
            r3 = 6
            com.google.android.play.core.internal.k r0 = r1.f35477d     // Catch:{ Exception -> 0x0284 }
            com.google.android.play.core.internal.m r0 = r0.f35480c     // Catch:{ Exception -> 0x0284 }
            java.util.List r5 = r1.f35475b     // Catch:{ Exception -> 0x0284 }
            r0.getClass()     // Catch:{ Exception -> 0x0284 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0284 }
        L_0x0012:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0284 }
            java.lang.String r7 = "split_id"
            r8 = 1
            r9 = 0
            java.lang.String r10 = ".apk"
            java.lang.String r11 = "verified-splits"
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0284 }
            android.content.Intent r6 = (android.content.Intent) r6     // Catch:{ Exception -> 0x0284 }
            java.lang.String r6 = r6.getStringExtra(r7)     // Catch:{ Exception -> 0x0284 }
            rl.e r12 = r0.f35483a     // Catch:{ Exception -> 0x0284 }
            r12.getClass()     // Catch:{ Exception -> 0x0284 }
            java.io.File r13 = new java.io.File     // Catch:{ Exception -> 0x0284 }
            java.io.File r12 = r12.mo70002g()     // Catch:{ Exception -> 0x0284 }
            r13.<init>(r12, r11)     // Catch:{ Exception -> 0x0284 }
            p665rl.C18487e.m31195e(r13)     // Catch:{ Exception -> 0x0284 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0284 }
            java.lang.String r6 = r6.concat(r10)     // Catch:{ Exception -> 0x0284 }
            java.io.File r6 = p665rl.C18487e.m31194d(r13, r6)     // Catch:{ Exception -> 0x0284 }
            boolean r6 = r6.exists()     // Catch:{ Exception -> 0x0284 }
            if (r6 != 0) goto L_0x0012
            r0 = r9
            goto L_0x0050
        L_0x004f:
            r0 = r8
        L_0x0050:
            if (r0 == 0) goto L_0x00a5
            com.google.android.play.core.internal.k r0 = r1.f35477d
            sl.k r4 = r1.f35476c
            r5 = -12
            android.content.Context r0 = r0.f35478a     // Catch:{ Exception -> 0x0090 }
            android.content.Context r6 = r0.getApplicationContext()     // Catch:{ Exception -> 0x0090 }
            if (r6 == 0) goto L_0x0061
            r0 = r6
        L_0x0061:
            boolean r0 = p665rl.C18483a.m31187c(r0, r8)     // Catch:{ Exception -> 0x0090 }
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "Emulating splits failed."
            android.util.Log.e(r2, r0)
            sl.m r0 = r4.f40796d
            sl.b r2 = r4.f40793a
            android.os.Handler r4 = r0.f40802g
            sl.l r6 = new sl.l
            r6.<init>(r0, r2, r3, r5)
            r4.post(r6)
            goto L_0x00a4
        L_0x007b:
            java.lang.String r0 = "Splits installed."
            android.util.Log.i(r2, r0)
            sl.m r0 = r4.f40796d
            sl.b r2 = r4.f40793a
            r3 = 5
            android.os.Handler r4 = r0.f40802g
            sl.l r5 = new sl.l
            r5.<init>(r0, r2, r3, r9)
            r4.post(r5)
            goto L_0x00a4
        L_0x0090:
            r0 = move-exception
            java.lang.String r6 = "Error emulating splits."
            android.util.Log.e(r2, r6, r0)
            sl.m r0 = r4.f40796d
            sl.b r2 = r4.f40793a
            android.os.Handler r4 = r0.f40802g
            sl.l r6 = new sl.l
            r6.<init>(r0, r2, r3, r5)
            r4.post(r6)
        L_0x00a4:
            return
        L_0x00a5:
            com.google.android.play.core.internal.k r0 = r1.f35477d
            java.util.List r5 = r1.f35475b
            sl.k r6 = r1.f35476c
            r0.getClass()
            java.io.RandomAccessFile r13 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0238 }
            rl.e r14 = r0.f35479b     // Catch:{ Exception -> 0x0238 }
            r14.getClass()     // Catch:{ Exception -> 0x0238 }
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x0238 }
            java.io.File r14 = r14.mo70002g()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r4 = "lock.tmp"
            r15.<init>(r14, r4)     // Catch:{ Exception -> 0x0238 }
            java.lang.String r4 = "rw"
            r13.<init>(r15, r4)     // Catch:{ Exception -> 0x0238 }
            java.nio.channels.FileChannel r4 = r13.getChannel()     // Catch:{ Exception -> 0x0238 }
            r13 = 0
            java.nio.channels.FileLock r14 = r4.tryLock()     // Catch:{ OverlappingFileLockException -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
            r14 = r13
        L_0x00d0:
            if (r14 == 0) goto L_0x0232
            java.lang.String r13 = "Copying splits."
            android.util.Log.i(r2, r13)     // Catch:{ Exception -> 0x021c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x021c }
        L_0x00db:
            boolean r13 = r5.hasNext()     // Catch:{ Exception -> 0x021c }
            java.lang.String r15 = "unverified-splits"
            if (r13 == 0) goto L_0x0189
            java.lang.Object r13 = r5.next()     // Catch:{ Exception -> 0x021c }
            android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ Exception -> 0x021c }
            java.lang.String r17 = r13.getStringExtra(r7)     // Catch:{ Exception -> 0x021c }
            android.content.Context r3 = r0.f35478a     // Catch:{ Exception -> 0x021c }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x021c }
            android.net.Uri r13 = r13.getData()     // Catch:{ Exception -> 0x021c }
            java.lang.String r12 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r13, r12)     // Catch:{ Exception -> 0x021c }
            rl.e r12 = r0.f35479b     // Catch:{ Exception -> 0x021c }
            r12.getClass()     // Catch:{ Exception -> 0x021c }
            java.io.File r13 = new java.io.File     // Catch:{ Exception -> 0x021c }
            java.io.File r12 = r12.mo70002g()     // Catch:{ Exception -> 0x021c }
            r13.<init>(r12, r15)     // Catch:{ Exception -> 0x021c }
            p665rl.C18487e.m31195e(r13)     // Catch:{ Exception -> 0x021c }
            java.lang.String r12 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x021c }
            java.lang.String r12 = r12.concat(r10)     // Catch:{ Exception -> 0x021c }
            java.io.File r12 = p665rl.C18487e.m31194d(r13, r12)     // Catch:{ Exception -> 0x021c }
            boolean r13 = r12.exists()     // Catch:{ Exception -> 0x021c }
            if (r13 == 0) goto L_0x012d
            long r18 = r12.length()     // Catch:{ Exception -> 0x021c }
            long r20 = r3.getLength()     // Catch:{ Exception -> 0x021c }
            int r13 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r13 == 0) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            boolean r13 = r12.exists()     // Catch:{ Exception -> 0x021c }
            if (r13 != 0) goto L_0x0186
        L_0x0133:
            rl.e r13 = r0.f35479b     // Catch:{ Exception -> 0x021c }
            r13.getClass()     // Catch:{ Exception -> 0x021c }
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x021c }
            java.io.File r13 = r13.mo70002g()     // Catch:{ Exception -> 0x021c }
            r15.<init>(r13, r11)     // Catch:{ Exception -> 0x021c }
            p665rl.C18487e.m31195e(r15)     // Catch:{ Exception -> 0x021c }
            java.lang.String r13 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x021c }
            java.lang.String r13 = r13.concat(r10)     // Catch:{ Exception -> 0x021c }
            java.io.File r13 = p665rl.C18487e.m31194d(r15, r13)     // Catch:{ Exception -> 0x021c }
            boolean r13 = r13.exists()     // Catch:{ Exception -> 0x021c }
            if (r13 != 0) goto L_0x0186
            java.io.BufferedInputStream r13 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x021c }
            java.io.FileInputStream r3 = r3.createInputStream()     // Catch:{ Exception -> 0x021c }
            r13.<init>(r3)     // Catch:{ Exception -> 0x021c }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x017e }
            r3.<init>(r12)     // Catch:{ all -> 0x017e }
            r12 = 4096(0x1000, float:5.74E-42)
            byte[] r12 = new byte[r12]     // Catch:{ all -> 0x0179 }
        L_0x0168:
            int r15 = r13.read(r12)     // Catch:{ all -> 0x0179 }
            if (r15 <= 0) goto L_0x0172
            r3.write(r12, r9, r15)     // Catch:{ all -> 0x0179 }
            goto L_0x0168
        L_0x0172:
            r3.close()     // Catch:{ all -> 0x017e }
            r13.close()     // Catch:{ Exception -> 0x021c }
            goto L_0x0186
        L_0x0179:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x017d }
        L_0x017d:
            throw r0     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0182 }
        L_0x0182:
            throw r0     // Catch:{ Exception -> 0x021c }
        L_0x0183:
            r0 = move-exception
            goto L_0x022c
        L_0x0186:
            r3 = 6
            goto L_0x00db
        L_0x0189:
            java.lang.String r3 = "Splits copied."
            android.util.Log.i(r2, r3)     // Catch:{ Exception -> 0x021c }
            rl.e r3 = r0.f35479b     // Catch:{ IOException -> 0x0215 }
            r3.getClass()     // Catch:{ IOException -> 0x0215 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0215 }
            java.io.File r3 = r3.mo70002g()     // Catch:{ IOException -> 0x0215 }
            r5.<init>(r3, r15)     // Catch:{ IOException -> 0x0215 }
            p665rl.C18487e.m31195e(r5)     // Catch:{ IOException -> 0x0215 }
            java.io.File[] r3 = r5.listFiles()     // Catch:{ IOException -> 0x0215 }
            com.google.android.play.core.internal.m r5 = r0.f35480c     // Catch:{ Exception -> 0x020c }
            boolean r5 = r5.mo55529b(r3)     // Catch:{ Exception -> 0x020c }
            if (r5 == 0) goto L_0x0206
            com.google.android.play.core.internal.m r5 = r0.f35480c     // Catch:{ Exception -> 0x020c }
            boolean r3 = r5.mo55528a(r3)     // Catch:{ Exception -> 0x020c }
            if (r3 == 0) goto L_0x0206
            rl.e r3 = r0.f35479b     // Catch:{ IOException -> 0x01ff }
            r3.getClass()     // Catch:{ IOException -> 0x01ff }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x01ff }
            java.io.File r3 = r3.mo70002g()     // Catch:{ IOException -> 0x01ff }
            r5.<init>(r3, r15)     // Catch:{ IOException -> 0x01ff }
            p665rl.C18487e.m31195e(r5)     // Catch:{ IOException -> 0x01ff }
            java.io.File[] r3 = r5.listFiles()     // Catch:{ IOException -> 0x01ff }
            java.util.Arrays.sort(r3)     // Catch:{ IOException -> 0x01ff }
            int r5 = r3.length     // Catch:{ IOException -> 0x01ff }
        L_0x01cc:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x01f7
            r7 = r3[r5]     // Catch:{ IOException -> 0x01ff }
            r7.setWritable(r9, r8)     // Catch:{ IOException -> 0x01ff }
            r7.setWritable(r9, r9)     // Catch:{ IOException -> 0x01ff }
            r7 = r3[r5]     // Catch:{ IOException -> 0x01ff }
            rl.e r10 = r0.f35479b     // Catch:{ IOException -> 0x01ff }
            r10.getClass()     // Catch:{ IOException -> 0x01ff }
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x01ff }
            java.io.File r10 = r10.mo70002g()     // Catch:{ IOException -> 0x01ff }
            r12.<init>(r10, r11)     // Catch:{ IOException -> 0x01ff }
            p665rl.C18487e.m31195e(r12)     // Catch:{ IOException -> 0x01ff }
            java.lang.String r10 = r7.getName()     // Catch:{ IOException -> 0x01ff }
            java.io.File r10 = p665rl.C18487e.m31194d(r12, r10)     // Catch:{ IOException -> 0x01ff }
            r7.renameTo(r10)     // Catch:{ IOException -> 0x01ff }
            goto L_0x01cc
        L_0x01f7:
            java.lang.String r0 = "Splits verified."
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x0183 }
            r16 = r9
            goto L_0x0224
        L_0x01ff:
            r0 = move-exception
            java.lang.String r3 = "Cannot write verified split."
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0183 }
            goto L_0x0222
        L_0x0206:
            java.lang.String r0 = "Split verification failed."
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0183 }
            goto L_0x0212
        L_0x020c:
            r0 = move-exception
            java.lang.String r3 = "Error verifying splits."
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0183 }
        L_0x0212:
            r16 = -11
            goto L_0x0224
        L_0x0215:
            r0 = move-exception
            java.lang.String r3 = "Cannot access directory for unverified splits."
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0183 }
            goto L_0x0222
        L_0x021c:
            r0 = move-exception
            java.lang.String r3 = "Error copying splits."
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0183 }
        L_0x0222:
            r16 = -13
        L_0x0224:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0183 }
            r14.release()     // Catch:{ all -> 0x0183 }
            goto L_0x0232
        L_0x022c:
            if (r4 == 0) goto L_0x0231
            r4.close()     // Catch:{ all -> 0x0231 }
        L_0x0231:
            throw r0     // Catch:{ Exception -> 0x0238 }
        L_0x0232:
            if (r4 == 0) goto L_0x0244
            r4.close()     // Catch:{ Exception -> 0x0238 }
            goto L_0x0244
        L_0x0238:
            r0 = move-exception
            java.lang.String r3 = "Error locking files."
            android.util.Log.e(r2, r3, r0)
            r2 = -13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
        L_0x0244:
            if (r13 != 0) goto L_0x0247
            goto L_0x0283
        L_0x0247:
            int r0 = r13.intValue()
            if (r0 != 0) goto L_0x0270
            android.content.Intent r0 = r6.f40794b
            java.lang.String r2 = "triggered_from_app_after_verification"
            boolean r0 = r0.getBooleanExtra(r2, r9)
            if (r0 != 0) goto L_0x0264
            android.content.Intent r0 = r6.f40794b
            r0.putExtra(r2, r8)
            android.content.Context r0 = r6.f40795c
            android.content.Intent r2 = r6.f40794b
            r0.sendBroadcast(r2)
            goto L_0x0283
        L_0x0264:
            sl.m r0 = r6.f40796d
            com.google.android.gms.measurement.internal.m3 r0 = r0.f40209a
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = "Splits copied and verified more than once."
            r0.mo52243c(r3, r2)
            goto L_0x0283
        L_0x0270:
            int r0 = r13.intValue()
            sl.m r2 = r6.f40796d
            sl.b r3 = r6.f40793a
            android.os.Handler r4 = r2.f40802g
            sl.l r5 = new sl.l
            r6 = 6
            r5.<init>(r2, r3, r6, r0)
            r4.post(r5)
        L_0x0283:
            return
        L_0x0284:
            r0 = move-exception
            java.lang.String r3 = "Error checking verified files."
            android.util.Log.e(r2, r3, r0)
            sl.k r0 = r1.f35476c
            sl.m r2 = r0.f40796d
            sl.b r0 = r0.f40793a
            android.os.Handler r3 = r2.f40802g
            sl.l r4 = new sl.l
            r5 = 6
            r6 = -11
            r4.<init>(r2, r0, r5, r6)
            r3.post(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C15698j.run():void");
    }
}
