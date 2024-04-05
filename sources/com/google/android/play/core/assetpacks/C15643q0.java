package com.google.android.play.core.assetpacks;

import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15714z;

/* renamed from: com.google.android.play.core.assetpacks.q0 */
public final class C15643q0 {

    /* renamed from: g */
    public static final C15032m3 f35285g = new C15032m3("ExtractChunkTaskHandler");

    /* renamed from: a */
    public final byte[] f35286a = new byte[8192];

    /* renamed from: b */
    public final C15583b0 f35287b;

    /* renamed from: c */
    public final C15714z f35288c;

    /* renamed from: d */
    public final C15714z f35289d;

    /* renamed from: e */
    public final C15671x0 f35290e;

    /* renamed from: f */
    public final C15581a2 f35291f;

    public C15643q0(C15583b0 b0Var, C15714z zVar, C15714z zVar2, C15671x0 x0Var, C15581a2 a2Var) {
        this.f35287b = b0Var;
        this.f35288c = zVar;
        this.f35289d = zVar2;
        this.f35290e = x0Var;
        this.f35291f = a2Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:74|75|155|156|157|158) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x03e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00b5 */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0310 A[SYNTHETIC, Splitter:B:130:0x0310] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03dc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c2 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fa A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0245 A[Catch:{ all -> 0x01eb }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:123:0x0300=Splitter:B:123:0x0300, B:157:0x03e2=Splitter:B:157:0x03e2} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55477a(com.google.android.play.core.assetpacks.C15639p0 r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            com.google.android.play.core.assetpacks.j2 r0 = new com.google.android.play.core.assetpacks.j2
            com.google.android.play.core.assetpacks.b0 r10 = r1.f35287b
            java.lang.Object r3 = r2.f29575b
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            int r12 = r2.f35272c
            long r13 = r2.f35273d
            java.lang.String r15 = r2.f35275f
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r10.getClass()
            java.io.File r3 = new java.io.File
            java.io.File r4 = new java.io.File
            java.io.File r5 = new java.io.File
            java.io.File r6 = r10.mo55377c(r11, r12, r13)
            java.lang.String r7 = "_slices"
            r5.<init>(r6, r7)
            java.lang.String r6 = "_metadata"
            r4.<init>(r5, r6)
            r3.<init>(r4, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x003f
            r3.mkdirs()
        L_0x003f:
            r11 = 2
            r12 = 0
            r13 = 1
            r14 = 3
            java.io.InputStream r3 = r2.f35281l     // Catch:{ IOException -> 0x03e3 }
            int r4 = r2.f35276g     // Catch:{ IOException -> 0x03e3 }
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r4 == r13) goto L_0x004d
            r9 = r3
            goto L_0x0053
        L_0x004d:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x03e3 }
            r4.<init>(r3, r15)     // Catch:{ IOException -> 0x03e3 }
            r9 = r4
        L_0x0053:
            int r3 = r2.f35277h     // Catch:{ all -> 0x03dd }
            r16 = 0
            if (r3 <= 0) goto L_0x01be
            com.google.android.play.core.assetpacks.i0 r3 = r0.mo55433b()     // Catch:{ all -> 0x03dd }
            int r4 = r3.f35190e     // Catch:{ all -> 0x03dd }
            int r5 = r2.f35277h     // Catch:{ all -> 0x03dd }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x019e
            int r4 = r3.f35186a     // Catch:{ all -> 0x03dd }
            if (r4 == r13) goto L_0x0122
            if (r4 == r11) goto L_0x00ce
            if (r4 != r14) goto L_0x00b6
            com.google.android.gms.measurement.internal.m3 r4 = f35285g     // Catch:{ all -> 0x03dd }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x03dd }
            r4.mo52242b(r5, r6)     // Catch:{ all -> 0x03dd }
            long r3 = r3.f35188c     // Catch:{ all -> 0x03dd }
            java.io.File r5 = r0.mo55434c()     // Catch:{ all -> 0x03dd }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x03dd }
            java.lang.String r7 = "rw"
            r6.<init>(r5, r7)     // Catch:{ all -> 0x03dd }
            r6.seek(r3)     // Catch:{ all -> 0x00b1 }
        L_0x0086:
            byte[] r3 = r0.f35210a     // Catch:{ all -> 0x00b1 }
            int r3 = r9.read(r3)     // Catch:{ all -> 0x00b1 }
            if (r3 <= 0) goto L_0x0093
            byte[] r4 = r0.f35210a     // Catch:{ all -> 0x00b1 }
            r6.write(r4, r12, r3)     // Catch:{ all -> 0x00b1 }
        L_0x0093:
            if (r3 == r15) goto L_0x0086
            r6.close()     // Catch:{ all -> 0x03dd }
            int r3 = r2.f35277h     // Catch:{ all -> 0x03dd }
            int r3 = r3 + r13
            int r4 = r2.f35278i     // Catch:{ all -> 0x03dd }
            if (r3 != r4) goto L_0x00a1
            r3 = r13
            goto L_0x00a2
        L_0x00a1:
            r3 = r12
        L_0x00a2:
            if (r3 == 0) goto L_0x00a7
            r10 = r9
            goto L_0x0190
        L_0x00a7:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x03dd }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f29574a     // Catch:{ all -> 0x03dd }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x03dd }
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x00b1:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x00b6:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x03dd }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x03dd }
            int r3 = r3.f35186a     // Catch:{ all -> 0x03dd }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03dd }
            r4[r12] = r3     // Catch:{ all -> 0x03dd }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x03dd }
            int r4 = r2.f29574a     // Catch:{ all -> 0x03dd }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x03dd }
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x00ce:
            com.google.android.gms.measurement.internal.m3 r3 = f35285g     // Catch:{ all -> 0x03dd }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x03dd }
            r3.mo52242b(r4, r5)     // Catch:{ all -> 0x03dd }
            com.google.android.play.core.assetpacks.b0 r3 = r1.f35287b     // Catch:{ all -> 0x03dd }
            java.lang.Object r4 = r2.f29575b     // Catch:{ all -> 0x03dd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x03dd }
            int r5 = r2.f35272c     // Catch:{ all -> 0x03dd }
            long r6 = r2.f35273d     // Catch:{ all -> 0x03dd }
            java.lang.String r8 = r2.f35275f     // Catch:{ all -> 0x03dd }
            r3.getClass()     // Catch:{ all -> 0x03dd }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x03dd }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x03dd }
            java.io.File r15 = new java.io.File     // Catch:{ all -> 0x03dd }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x03dd }
            java.io.File r3 = r3.mo55377c(r4, r5, r6)     // Catch:{ all -> 0x03dd }
            java.lang.String r4 = "_slices"
            r11.<init>(r3, r4)     // Catch:{ all -> 0x03dd }
            java.lang.String r3 = "_metadata"
            r15.<init>(r11, r3)     // Catch:{ all -> 0x03dd }
            r10.<init>(r15, r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r3 = "checkpoint_ext.dat"
            r14.<init>(r10, r3)     // Catch:{ all -> 0x03dd }
            boolean r3 = r14.exists()     // Catch:{ all -> 0x03dd }
            if (r3 == 0) goto L_0x0118
            java.io.SequenceInputStream r3 = new java.io.SequenceInputStream     // Catch:{ all -> 0x03dd }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x03dd }
            r4.<init>(r14)     // Catch:{ all -> 0x03dd }
            r3.<init>(r4, r9)     // Catch:{ all -> 0x03dd }
            r10 = r9
            r9 = r3
            goto L_0x01c0
        L_0x0118:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x03dd }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f29574a     // Catch:{ all -> 0x03dd }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x03dd }
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x0122:
            com.google.android.gms.measurement.internal.m3 r4 = f35285g     // Catch:{ all -> 0x03dd }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x03dd }
            java.lang.String r6 = r3.f35187b     // Catch:{ all -> 0x03dd }
            r5[r12] = r6     // Catch:{ all -> 0x03dd }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo52242b(r6, r5)     // Catch:{ all -> 0x03dd }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x03dd }
            java.lang.String r5 = r3.f35187b     // Catch:{ all -> 0x03dd }
            r4.<init>(r5)     // Catch:{ all -> 0x03dd }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x03dd }
            if (r5 == 0) goto L_0x0193
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x03dd }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x03dd }
            long r6 = r3.f35188c     // Catch:{ all -> 0x03dd }
            r5.seek(r6)     // Catch:{ all -> 0x03dd }
            long r6 = r3.f35189d     // Catch:{ all -> 0x03dd }
        L_0x014a:
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x03dd }
            int r3 = (int) r10     // Catch:{ all -> 0x03dd }
            byte[] r8 = r1.f35286a     // Catch:{ all -> 0x03dd }
            int r8 = r9.read(r8, r12, r3)     // Catch:{ all -> 0x03dd }
            int r8 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x03dd }
            if (r8 <= 0) goto L_0x0162
            byte[] r10 = r1.f35286a     // Catch:{ all -> 0x03dd }
            r5.write(r10, r12, r8)     // Catch:{ all -> 0x03dd }
        L_0x0162:
            long r10 = (long) r8     // Catch:{ all -> 0x03dd }
            long r10 = r6 - r10
            r6 = 0
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0170
            if (r8 > 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            r6 = r10
            goto L_0x014a
        L_0x0170:
            long r6 = r5.length()     // Catch:{ all -> 0x03dd }
            r5.close()     // Catch:{ all -> 0x03dd }
            if (r8 == r3) goto L_0x01be
            com.google.android.gms.measurement.internal.m3 r3 = f35285g     // Catch:{ all -> 0x03dd }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ all -> 0x03dd }
            r3.mo52242b(r5, r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x03dd }
            int r14 = r2.f35277h     // Catch:{ all -> 0x03dd }
            r3 = r0
            r5 = r6
            r7 = r10
            r10 = r9
            r9 = r14
            r3.mo55436e(r4, r5, r7, r9)     // Catch:{ all -> 0x01eb }
        L_0x0190:
            r9 = r16
            goto L_0x01c0
        L_0x0193:
            r10 = r9
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f29574a     // Catch:{ all -> 0x01eb }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x01eb }
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x019e:
            r10 = r9
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x01eb }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01eb }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01eb }
            r7[r12] = r5     // Catch:{ all -> 0x01eb }
            int r3 = r3.f35190e     // Catch:{ all -> 0x01eb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01eb }
            r7[r13] = r3     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = java.lang.String.format(r4, r7)     // Catch:{ all -> 0x01eb }
            int r4 = r2.f29574a     // Catch:{ all -> 0x01eb }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x01eb }
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x01be:
            r10 = r9
            r9 = r10
        L_0x01c0:
            if (r9 == 0) goto L_0x0300
            com.google.android.play.core.assetpacks.l0 r3 = new com.google.android.play.core.assetpacks.l0     // Catch:{ all -> 0x01eb }
            r3.<init>(r9)     // Catch:{ all -> 0x01eb }
            com.google.android.play.core.assetpacks.b0 r4 = r1.f35287b     // Catch:{ all -> 0x01eb }
            java.lang.Object r5 = r2.f29575b     // Catch:{ all -> 0x01eb }
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18     // Catch:{ all -> 0x01eb }
            int r5 = r2.f35272c     // Catch:{ all -> 0x01eb }
            long r6 = r2.f35273d     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = r2.f35275f     // Catch:{ all -> 0x01eb }
            r17 = r4
            r19 = r5
            r20 = r6
            r22 = r8
            java.io.File r4 = r17.mo55383k(r18, r19, r20, r22)     // Catch:{ all -> 0x01eb }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x01eb }
            if (r5 != 0) goto L_0x01ee
            r4.mkdirs()     // Catch:{ all -> 0x01eb }
            goto L_0x01ee
        L_0x01eb:
            r0 = move-exception
            goto L_0x03df
        L_0x01ee:
            com.google.android.play.core.assetpacks.j0 r5 = r3.mo55445a()     // Catch:{ all -> 0x01eb }
            boolean r6 = r5.f35202d     // Catch:{ all -> 0x01eb }
            if (r6 != 0) goto L_0x0245
            boolean r6 = r3.f35232f     // Catch:{ all -> 0x01eb }
            if (r6 != 0) goto L_0x0245
            int r6 = r5.mo55423a()     // Catch:{ all -> 0x01eb }
            if (r6 != 0) goto L_0x0202
            r6 = r13
            goto L_0x0203
        L_0x0202:
            r6 = r12
        L_0x0203:
            if (r6 == 0) goto L_0x023d
            boolean r6 = r5.mo55476g()     // Catch:{ all -> 0x01eb }
            if (r6 != 0) goto L_0x023d
            byte[] r6 = r5.f35204f     // Catch:{ all -> 0x01eb }
            r0.mo55439h(r6)     // Catch:{ all -> 0x01eb }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x01eb }
            java.lang.String r7 = r5.f35199a     // Catch:{ all -> 0x01eb }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x01eb }
            java.io.File r7 = r6.getParentFile()     // Catch:{ all -> 0x01eb }
            r7.mkdirs()     // Catch:{ all -> 0x01eb }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x01eb }
            r7.<init>(r6)     // Catch:{ all -> 0x01eb }
            byte[] r6 = r1.f35286a     // Catch:{ all -> 0x01eb }
            r8 = 8192(0x2000, float:1.14794E-41)
            int r6 = r3.read(r6, r12, r8)     // Catch:{ all -> 0x01eb }
        L_0x022b:
            if (r6 <= 0) goto L_0x0239
            byte[] r11 = r1.f35286a     // Catch:{ all -> 0x01eb }
            r7.write(r11, r12, r6)     // Catch:{ all -> 0x01eb }
            byte[] r6 = r1.f35286a     // Catch:{ all -> 0x01eb }
            int r6 = r3.read(r6, r12, r8)     // Catch:{ all -> 0x01eb }
            goto L_0x022b
        L_0x0239:
            r7.close()     // Catch:{ all -> 0x01eb }
            goto L_0x0247
        L_0x023d:
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = r5.f35204f     // Catch:{ all -> 0x01eb }
            r0.mo55440i(r3, r6)     // Catch:{ all -> 0x01eb }
            goto L_0x0247
        L_0x0245:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0247:
            boolean r6 = r3.f35231e     // Catch:{ all -> 0x01eb }
            if (r6 != 0) goto L_0x024f
            boolean r6 = r3.f35232f     // Catch:{ all -> 0x01eb }
            if (r6 == 0) goto L_0x01ee
        L_0x024f:
            boolean r4 = r3.f35232f     // Catch:{ all -> 0x01eb }
            if (r4 == 0) goto L_0x0261
            com.google.android.gms.measurement.internal.m3 r4 = f35285g     // Catch:{ all -> 0x01eb }
            java.lang.String r6 = "Writing central directory metadata."
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ all -> 0x01eb }
            r4.mo52242b(r6, r7)     // Catch:{ all -> 0x01eb }
            byte[] r4 = r5.f35204f     // Catch:{ all -> 0x01eb }
            r0.mo55440i(r9, r4)     // Catch:{ all -> 0x01eb }
        L_0x0261:
            int r4 = r2.f35277h     // Catch:{ all -> 0x01eb }
            int r4 = r4 + r13
            int r6 = r2.f35278i     // Catch:{ all -> 0x01eb }
            if (r4 != r6) goto L_0x026a
            r4 = r13
            goto L_0x026b
        L_0x026a:
            r4 = r12
        L_0x026b:
            if (r4 != 0) goto L_0x0300
            boolean r4 = r5.f35202d     // Catch:{ all -> 0x01eb }
            if (r4 == 0) goto L_0x0283
            com.google.android.gms.measurement.internal.m3 r3 = f35285g     // Catch:{ all -> 0x01eb }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x01eb }
            r3.mo52242b(r4, r6)     // Catch:{ all -> 0x01eb }
            byte[] r3 = r5.f35204f     // Catch:{ all -> 0x01eb }
            int r4 = r2.f35277h     // Catch:{ all -> 0x01eb }
            r0.mo55437f(r4, r3)     // Catch:{ all -> 0x01eb }
            goto L_0x0300
        L_0x0283:
            boolean r4 = r3.f35232f     // Catch:{ all -> 0x01eb }
            if (r4 == 0) goto L_0x0296
            com.google.android.gms.measurement.internal.m3 r3 = f35285g     // Catch:{ all -> 0x01eb }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x01eb }
            r3.mo52242b(r4, r5)     // Catch:{ all -> 0x01eb }
            int r3 = r2.f35277h     // Catch:{ all -> 0x01eb }
            r0.mo55435d(r3)     // Catch:{ all -> 0x01eb }
            goto L_0x0300
        L_0x0296:
            int r4 = r5.f35201c     // Catch:{ all -> 0x01eb }
            if (r4 != 0) goto L_0x02e3
            com.google.android.gms.measurement.internal.m3 r4 = f35285g     // Catch:{ all -> 0x01eb }
            java.lang.String r6 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch:{ all -> 0x01eb }
            r4.mo52242b(r6, r7)     // Catch:{ all -> 0x01eb }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x01eb }
            com.google.android.play.core.assetpacks.b0 r6 = r1.f35287b     // Catch:{ all -> 0x01eb }
            java.lang.Object r7 = r2.f29575b     // Catch:{ all -> 0x01eb }
            r18 = r7
            java.lang.String r18 = (java.lang.String) r18     // Catch:{ all -> 0x01eb }
            int r7 = r2.f35272c     // Catch:{ all -> 0x01eb }
            long r8 = r2.f35273d     // Catch:{ all -> 0x01eb }
            java.lang.String r11 = r2.f35275f     // Catch:{ all -> 0x01eb }
            r17 = r6
            r19 = r7
            r20 = r8
            r22 = r11
            java.io.File r6 = r17.mo55383k(r18, r19, r20, r22)     // Catch:{ all -> 0x01eb }
            boolean r7 = r6.exists()     // Catch:{ all -> 0x01eb }
            if (r7 != 0) goto L_0x02c8
            r6.mkdirs()     // Catch:{ all -> 0x01eb }
        L_0x02c8:
            java.lang.String r7 = r5.f35199a     // Catch:{ all -> 0x01eb }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x01eb }
            long r5 = r5.f35200b     // Catch:{ all -> 0x01eb }
            long r7 = r3.f35230d     // Catch:{ all -> 0x01eb }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x01eb }
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x02db
            goto L_0x02f4
        L_0x02db:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x01eb }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x01eb }
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x02e3:
            com.google.android.gms.measurement.internal.m3 r4 = f35285g     // Catch:{ all -> 0x01eb }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x01eb }
            r4.mo52242b(r5, r6)     // Catch:{ all -> 0x01eb }
            java.io.File r4 = r0.mo55434c()     // Catch:{ all -> 0x01eb }
            long r5 = r4.length()     // Catch:{ all -> 0x01eb }
        L_0x02f4:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x01eb }
            long r7 = r3.f35230d     // Catch:{ all -> 0x01eb }
            int r9 = r2.f35277h     // Catch:{ all -> 0x01eb }
            r3 = r0
            r3.mo55436e(r4, r5, r7, r9)     // Catch:{ all -> 0x01eb }
        L_0x0300:
            r10.close()     // Catch:{ IOException -> 0x03e3 }
            int r3 = r2.f35277h
            int r4 = r3 + 1
            int r5 = r2.f35278i
            if (r4 != r5) goto L_0x030d
            r4 = r13
            goto L_0x030e
        L_0x030d:
            r4 = r12
        L_0x030e:
            if (r4 == 0) goto L_0x032f
            r0.mo55438g(r3)     // Catch:{ IOException -> 0x0314 }
            goto L_0x032f
        L_0x0314:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.m3 r0 = f35285g
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r3.getMessage()
            r4[r12] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r0.mo52243c(r5, r4)
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            int r2 = r2.f29574a
            r0.<init>(r4, r3, r2)
            throw r0
        L_0x032f:
            com.google.android.gms.measurement.internal.m3 r0 = f35285g
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f35277h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r12] = r4
            java.lang.String r4 = r2.f35275f
            r3[r13] = r4
            java.lang.Object r4 = r2.f29575b
            java.lang.String r4 = (java.lang.String) r4
            r5 = 2
            r3[r5] = r4
            int r4 = r2.f29574a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo52245e(r4, r3)
            com.google.android.play.core.internal.z r0 = r1.f35288c
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.y2 r0 = (com.google.android.play.core.assetpacks.C15677y2) r0
            int r3 = r2.f29574a
            java.lang.Object r4 = r2.f29575b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r2.f35275f
            int r6 = r2.f35277h
            r0.mo55466c(r4, r3, r6, r5)
            java.io.InputStream r0 = r2.f35281l     // Catch:{ IOException -> 0x0370 }
            r0.close()     // Catch:{ IOException -> 0x0370 }
            goto L_0x038d
        L_0x0370:
            com.google.android.gms.measurement.internal.m3 r0 = f35285g
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f35277h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r12] = r3
            java.lang.String r3 = r2.f35275f
            r4[r13] = r3
            java.lang.Object r3 = r2.f29575b
            java.lang.String r3 = (java.lang.String) r3
            r5 = 2
            r4[r5] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo52246f(r3, r4)
        L_0x038d:
            int r0 = r2.f35280k
            r3 = 3
            if (r0 != r3) goto L_0x03dc
            com.google.android.play.core.internal.z r0 = r1.f35289d
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.y r0 = (com.google.android.play.core.assetpacks.C15674y) r0
            java.lang.Object r3 = r2.f29575b
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            long r9 = r2.f35279j
            r5 = 3
            r6 = 0
            com.google.android.play.core.assetpacks.x0 r3 = r1.f35290e
            monitor-enter(r3)
            int r7 = r2.f35277h     // Catch:{ all -> 0x03d9 }
            double r7 = (double) r7     // Catch:{ all -> 0x03d9 }
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 + r11
            int r11 = r2.f35278i     // Catch:{ all -> 0x03d9 }
            double r11 = (double) r11     // Catch:{ all -> 0x03d9 }
            double r11 = r7 / r11
            java.util.HashMap r7 = r3.f35400a     // Catch:{ all -> 0x03d9 }
            java.lang.Double r8 = java.lang.Double.valueOf(r11)     // Catch:{ all -> 0x03d9 }
            r7.put(r4, r8)     // Catch:{ all -> 0x03d9 }
            monitor-exit(r3)
            r13 = 1
            java.lang.String r14 = r2.f35274e
            com.google.android.play.core.assetpacks.a2 r3 = r1.f35291f
            java.lang.Object r2 = r2.f29575b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r15 = r3.mo55371a(r2)
            r7 = r9
            com.google.android.play.core.assetpacks.g0 r2 = com.google.android.play.core.assetpacks.AssetPackState.m25234h(r4, r5, r6, r7, r9, r11, r13, r14, r15)
            android.os.Handler r3 = r0.f35417o
            com.google.android.gms.measurement.internal.c5 r4 = new com.google.android.gms.measurement.internal.c5
            r5 = 2
            r4.<init>((java.lang.Object) r0, (java.lang.Object) r2, (int) r5)
            r3.post(r4)
            return
        L_0x03d9:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x03dc:
            return
        L_0x03dd:
            r0 = move-exception
            r10 = r9
        L_0x03df:
            r10.close()     // Catch:{ all -> 0x03e2 }
        L_0x03e2:
            throw r0     // Catch:{ IOException -> 0x03e3 }
        L_0x03e3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.m3 r3 = f35285g
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r12] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.mo52243c(r5, r4)
            com.google.android.play.core.assetpacks.zzck r3 = new com.google.android.play.core.assetpacks.zzck
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f35277h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r12] = r5
            java.lang.String r5 = r2.f35275f
            r4[r13] = r5
            java.lang.Object r5 = r2.f29575b
            java.lang.String r5 = (java.lang.String) r5
            r6 = 2
            r4[r6] = r5
            int r5 = r2.f29574a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f29574a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15643q0.mo55477a(com.google.android.play.core.assetpacks.p0):void");
    }
}
