package com.google.android.play.core.assetpacks;

import com.google.android.gms.measurement.internal.C15032m3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import p614ll.C18200b;

/* renamed from: com.google.android.play.core.assetpacks.a2 */
public final class C15581a2 {

    /* renamed from: d */
    public static final C15032m3 f35062d = new C15032m3("PackMetadataManager");

    /* renamed from: a */
    public final C15583b0 f35063a;

    /* renamed from: b */
    public final C15589c2 f35064b;

    /* renamed from: c */
    public final C18200b f35065c;

    public C15581a2(C15583b0 b0Var, C15589c2 c2Var, C18200b bVar) {
        this.f35063a = b0Var;
        this.f35064b = c2Var;
        this.f35065c = bVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo55371a(java.lang.String r9) {
        /*
            r8 = this;
            ll.b r0 = r8.f35065c
            boolean r0 = r0.mo69733a()
            if (r0 == 0) goto L_0x0073
            com.google.android.play.core.assetpacks.b0 r0 = r8.f35063a
            r0.getClass()
            r1 = 1
            r2 = 0
            java.lang.String r0 = r0.mo55385m(r9)     // Catch:{ IOException -> 0x0017 }
            if (r0 == 0) goto L_0x0017
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            goto L_0x0073
        L_0x001b:
            com.google.android.play.core.assetpacks.c2 r0 = r8.f35064b
            int r0 = r0.mo55388a()
            com.google.android.play.core.assetpacks.b0 r3 = r8.f35063a
            long r4 = r3.mo55381i(r9)
            java.io.File r6 = new java.io.File
            java.io.File r7 = new java.io.File
            java.io.File r3 = r3.mo55382j(r9, r0, r4)
            java.lang.String r4 = "_metadata"
            r7.<init>(r3, r4)
            java.lang.String r3 = "properties.dat"
            r6.<init>(r7, r3)
            boolean r3 = r6.exists()     // Catch:{ IOException -> 0x0068 }
            if (r3 != 0) goto L_0x0044
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0068 }
            goto L_0x0062
        L_0x0044:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0068 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0068 }
            java.util.Properties r4 = new java.util.Properties     // Catch:{ all -> 0x0063 }
            r4.<init>()     // Catch:{ all -> 0x0063 }
            r4.load(r3)     // Catch:{ all -> 0x0063 }
            r3.close()     // Catch:{ IOException -> 0x0068 }
            java.lang.String r3 = "moduleVersionTag"
            java.lang.String r3 = r4.getProperty(r3)     // Catch:{ IOException -> 0x0068 }
            if (r3 != 0) goto L_0x0061
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0068 }
            goto L_0x0062
        L_0x0061:
            r9 = r3
        L_0x0062:
            return r9
        L_0x0063:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            com.google.android.gms.measurement.internal.m3 r0 = f35062d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            java.lang.String r9 = "Failed to read pack version tag for pack %s"
            r0.mo52243c(r9, r1)
        L_0x0073:
            java.lang.String r9 = ""
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15581a2.mo55371a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final void mo55372b(String str, int i, long j, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        C15583b0 b0Var = this.f35063a;
        b0Var.getClass();
        File file = new File(new File(b0Var.mo55382j(str, i, j), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
