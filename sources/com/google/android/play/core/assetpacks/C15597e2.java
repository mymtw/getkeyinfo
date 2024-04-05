package com.google.android.play.core.assetpacks;

import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15714z;

/* renamed from: com.google.android.play.core.assetpacks.e2 */
public final class C15597e2 {

    /* renamed from: c */
    public static final C15032m3 f35124c = new C15032m3("PatchSliceTaskHandler");

    /* renamed from: a */
    public final C15583b0 f35125a;

    /* renamed from: b */
    public final C15714z f35126b;

    public C15597e2(C15583b0 b0Var, C15714z zVar) {
        this.f35125a = b0Var;
        this.f35126b = zVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00c5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55398a(com.google.android.play.core.assetpacks.C15593d2 r15) {
        /*
            r14 = this;
            com.google.android.play.core.assetpacks.b0 r0 = r14.f35125a
            java.lang.Object r1 = r15.f29575b
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r15.f35109c
            long r3 = r15.f35110d
            java.io.File r0 = r0.mo55382j(r1, r2, r3)
            com.google.android.play.core.assetpacks.b0 r1 = r14.f35125a
            java.lang.Object r2 = r15.f29575b
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r15.f35109c
            long r4 = r15.f35110d
            java.lang.String r6 = r15.f35114h
            java.io.File r7 = new java.io.File
            r1.getClass()
            java.io.File r8 = new java.io.File
            java.io.File r1 = r1.mo55382j(r2, r3, r4)
            java.lang.String r2 = "_metadata"
            r8.<init>(r1, r2)
            r7.<init>(r8, r6)
            r1 = 2
            r2 = 1
            r3 = 0
            java.io.InputStream r4 = r15.f35116j     // Catch:{ IOException -> 0x00c6 }
            int r5 = r15.f35113g     // Catch:{ IOException -> 0x00c6 }
            if (r5 == r1) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x00c6 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r5.<init>(r4, r6)     // Catch:{ IOException -> 0x00c6 }
            r4 = r5
        L_0x003f:
            com.google.android.play.core.assetpacks.e0 r5 = new com.google.android.play.core.assetpacks.e0     // Catch:{ all -> 0x00c1 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x00c1 }
            com.google.android.play.core.assetpacks.b0 r8 = r14.f35125a     // Catch:{ all -> 0x00c1 }
            java.lang.Object r0 = r15.f29575b     // Catch:{ all -> 0x00c1 }
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00c1 }
            int r10 = r15.f35111e     // Catch:{ all -> 0x00c1 }
            long r11 = r15.f35112f     // Catch:{ all -> 0x00c1 }
            java.lang.String r13 = r15.f35114h     // Catch:{ all -> 0x00c1 }
            java.io.File r0 = r8.mo55383k(r9, r10, r11, r13)     // Catch:{ all -> 0x00c1 }
            boolean r6 = r0.exists()     // Catch:{ all -> 0x00c1 }
            if (r6 != 0) goto L_0x005e
            r0.mkdirs()     // Catch:{ all -> 0x00c1 }
        L_0x005e:
            com.google.android.play.core.assetpacks.j2 r13 = new com.google.android.play.core.assetpacks.j2     // Catch:{ all -> 0x00c1 }
            com.google.android.play.core.assetpacks.b0 r7 = r14.f35125a     // Catch:{ all -> 0x00c1 }
            java.lang.Object r6 = r15.f29575b     // Catch:{ all -> 0x00c1 }
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00c1 }
            int r9 = r15.f35111e     // Catch:{ all -> 0x00c1 }
            long r10 = r15.f35112f     // Catch:{ all -> 0x00c1 }
            java.lang.String r12 = r15.f35114h     // Catch:{ all -> 0x00c1 }
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x00c1 }
            com.google.android.play.core.assetpacks.w0 r6 = new com.google.android.play.core.assetpacks.w0     // Catch:{ all -> 0x00c1 }
            r6.<init>(r0, r13)     // Catch:{ all -> 0x00c1 }
            long r7 = r15.f35115i     // Catch:{ all -> 0x00c1 }
            com.google.android.play.core.internal.C15711w.m25543a(r5, r4, r6, r7)     // Catch:{ all -> 0x00c1 }
            r13.mo55438g(r3)     // Catch:{ all -> 0x00c1 }
            r4.close()     // Catch:{ IOException -> 0x00c6 }
            com.google.android.gms.measurement.internal.m3 r0 = f35124c
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f35114h
            r4[r3] = r5
            java.lang.Object r5 = r15.f29575b
            java.lang.String r5 = (java.lang.String) r5
            r4[r2] = r5
            java.lang.String r5 = "Patching and extraction finished for slice %s of pack %s."
            r0.mo52245e(r5, r4)
            com.google.android.play.core.internal.z r0 = r14.f35126b
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.y2 r0 = (com.google.android.play.core.assetpacks.C15677y2) r0
            int r4 = r15.f29574a
            java.lang.Object r5 = r15.f29575b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r15.f35114h
            r0.mo55466c(r5, r4, r3, r6)
            java.io.InputStream r0 = r15.f35116j     // Catch:{ IOException -> 0x00ad }
            r0.close()     // Catch:{ IOException -> 0x00ad }
            return
        L_0x00ad:
            com.google.android.gms.measurement.internal.m3 r0 = f35124c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r15.f35114h
            r1[r3] = r4
            java.lang.Object r15 = r15.f29575b
            java.lang.String r15 = (java.lang.String) r15
            r1[r2] = r15
            java.lang.String r15 = "Could not close file for slice %s of pack %s."
            r0.mo52246f(r15, r1)
            return
        L_0x00c1:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            throw r0     // Catch:{ IOException -> 0x00c6 }
        L_0x00c6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.m3 r4 = f35124c
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r0.getMessage()
            r5[r3] = r6
            java.lang.String r6 = "IOException during patching %s."
            r4.mo52243c(r6, r5)
            com.google.android.play.core.assetpacks.zzck r4 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f35114h
            r1[r3] = r5
            java.lang.Object r3 = r15.f29575b
            java.lang.String r3 = (java.lang.String) r3
            r1[r2] = r3
            java.lang.String r2 = "Error patching slice %s of pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r15 = r15.f29574a
            r4.<init>(r1, r0, r15)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15597e2.mo55398a(com.google.android.play.core.assetpacks.d2):void");
    }
}
