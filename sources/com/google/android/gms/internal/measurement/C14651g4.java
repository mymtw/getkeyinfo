package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.g4 */
public final /* synthetic */ class C14651g4 implements C14768p4 {

    /* renamed from: b */
    public final /* synthetic */ Context f32848b;

    public /* synthetic */ C14651g4(Context context) {
        this.f32848b = context;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0133 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() {
        /*
            r13 = this;
            java.lang.String r0 = "HermeticFileOverrides"
            android.content.Context r1 = r13.f32848b
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C14742n4.f32962f
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r3 = android.os.Build.TAGS
            java.lang.String r4 = "eng"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = "userdebug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "test-keys"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.internal.measurement.zzhz r0 = com.google.android.gms.internal.measurement.zzhz.zzc()
            goto L_0x0142
        L_0x0032:
            boolean r2 = r1.isDeviceProtectedStorage()
            if (r2 != 0) goto L_0x003c
            android.content.Context r1 = r1.createDeviceProtectedStorageContext()
        L_0x003c:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0143 }
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r5 = "phenotype_hermetic"
            java.io.File r1 = r1.getDir(r5, r3)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r5 = "overrides.txt"
            r4.<init>(r1, r5)     // Catch:{ RuntimeException -> 0x0061 }
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0143 }
            if (r1 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.zzhz r1 = com.google.android.gms.internal.measurement.zzhz.zzd(r4)     // Catch:{ all -> 0x0143 }
            goto L_0x006b
        L_0x005c:
            com.google.android.gms.internal.measurement.zzhz r1 = com.google.android.gms.internal.measurement.zzhz.zzc()     // Catch:{ all -> 0x0143 }
            goto L_0x006b
        L_0x0061:
            r1 = move-exception
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r0, r4, r1)     // Catch:{ all -> 0x0143 }
            com.google.android.gms.internal.measurement.zzhz r1 = com.google.android.gms.internal.measurement.zzhz.zzc()     // Catch:{ all -> 0x0143 }
        L_0x006b:
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x0143 }
            if (r4 == 0) goto L_0x013b
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0143 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0143 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0134 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0134 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0134 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0134 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0134 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0134 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x012f }
            r5.<init>()     // Catch:{ all -> 0x012f }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x012f }
            r6.<init>()     // Catch:{ all -> 0x012f }
        L_0x0090:
            java.lang.String r7 = r4.readLine()     // Catch:{ all -> 0x012f }
            if (r7 == 0) goto L_0x0104
            java.lang.String r8 = " "
            r9 = 3
            java.lang.String[] r8 = r7.split(r8, r9)     // Catch:{ all -> 0x012f }
            int r10 = r8.length     // Catch:{ all -> 0x012f }
            if (r10 == r9) goto L_0x00b6
            java.lang.String r8 = "Invalid: "
            int r9 = r7.length()     // Catch:{ all -> 0x012f }
            if (r9 == 0) goto L_0x00ad
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x012f }
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x012f }
            r7.<init>(r8)     // Catch:{ all -> 0x012f }
        L_0x00b2:
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x012f }
            goto L_0x0090
        L_0x00b6:
            r7 = r8[r3]     // Catch:{ all -> 0x012f }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x012f }
            r9.<init>(r7)     // Catch:{ all -> 0x012f }
            r7 = 1
            r7 = r8[r7]     // Catch:{ all -> 0x012f }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x012f }
            r10.<init>(r7)     // Catch:{ all -> 0x012f }
            java.lang.String r7 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x012f }
            r10 = 2
            r11 = r8[r10]     // Catch:{ all -> 0x012f }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ all -> 0x012f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x012f }
            if (r11 != 0) goto L_0x00ec
            r8 = r8[r10]     // Catch:{ all -> 0x012f }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x012f }
            r10.<init>(r8)     // Catch:{ all -> 0x012f }
            java.lang.String r11 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x012f }
            int r8 = r11.length()     // Catch:{ all -> 0x012f }
            r12 = 1024(0x400, float:1.435E-42)
            if (r8 < r12) goto L_0x00e9
            if (r11 != r10) goto L_0x00ec
        L_0x00e9:
            r6.put(r10, r11)     // Catch:{ all -> 0x012f }
        L_0x00ec:
            boolean r8 = r5.containsKey(r9)     // Catch:{ all -> 0x012f }
            if (r8 != 0) goto L_0x00fa
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x012f }
            r8.<init>()     // Catch:{ all -> 0x012f }
            r5.put(r9, r8)     // Catch:{ all -> 0x012f }
        L_0x00fa:
            java.lang.Object r8 = r5.get(r9)     // Catch:{ all -> 0x012f }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x012f }
            r8.put(r7, r11)     // Catch:{ all -> 0x012f }
            goto L_0x0090
        L_0x0104:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x012f }
            int r3 = r1.length()     // Catch:{ all -> 0x012f }
            int r3 = r3 + 7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r6.<init>(r3)     // Catch:{ all -> 0x012f }
            java.lang.String r3 = "Parsed "
            r6.append(r3)     // Catch:{ all -> 0x012f }
            r6.append(r1)     // Catch:{ all -> 0x012f }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x012f }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x012f }
            com.google.android.gms.internal.measurement.d4 r0 = new com.google.android.gms.internal.measurement.d4     // Catch:{ all -> 0x012f }
            r0.<init>(r5)     // Catch:{ all -> 0x012f }
            r4.close()     // Catch:{ IOException -> 0x0134 }
            com.google.android.gms.internal.measurement.zzhz r0 = com.google.android.gms.internal.measurement.zzhz.zzd(r0)     // Catch:{ all -> 0x0143 }
            goto L_0x013f
        L_0x012f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0133 }
        L_0x0133:
            throw r0     // Catch:{ IOException -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0143 }
            r1.<init>(r0)     // Catch:{ all -> 0x0143 }
            throw r1     // Catch:{ all -> 0x0143 }
        L_0x013b:
            com.google.android.gms.internal.measurement.zzhz r0 = com.google.android.gms.internal.measurement.zzhz.zzc()     // Catch:{ all -> 0x0143 }
        L_0x013f:
            android.os.StrictMode.setThreadPolicy(r2)
        L_0x0142:
            return r0
        L_0x0143:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14651g4.zza():java.lang.Object");
    }
}
