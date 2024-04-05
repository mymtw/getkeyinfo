package p665rl;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: rl.i */
public final class C18491i implements C18493k {

    /* renamed from: a */
    public final /* synthetic */ Set f40731a;

    /* renamed from: b */
    public final /* synthetic */ C18497o f40732b;

    /* renamed from: c */
    public final /* synthetic */ ZipFile f40733c;

    public C18491i(HashSet hashSet, C18497o oVar, ZipFile zipFile) {
        this.f40731a = hashSet;
        this.f40732b = oVar;
        this.f40733c = zipFile;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0075 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70003a(p665rl.C18494l r5, java.io.File r6, boolean r7) throws java.io.IOException {
        /*
            r4 = this;
            java.util.Set r0 = r4.f40731a
            r0.add(r6)
            if (r7 != 0) goto L_0x007d
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            rl.o r0 = r4.f40732b
            java.lang.String r0 = r0.mo69994b()
            r1 = 0
            r7[r1] = r0
            java.lang.String r0 = r5.f40734a
            r2 = 1
            r7[r2] = r0
            r0 = 2
            rl.o r3 = r4.f40732b
            java.io.File r3 = r3.mo69993a()
            java.lang.String r3 = r3.getAbsolutePath()
            r7[r0] = r3
            r0 = 3
            java.util.zip.ZipEntry r3 = r5.f40735b
            java.lang.String r3 = r3.getName()
            r7[r0] = r3
            r0 = 4
            java.lang.String r3 = r6.getAbsolutePath()
            r7[r0] = r3
            java.lang.String r0 = "NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'"
            java.lang.String r7 = java.lang.String.format(r0, r7)
            java.lang.String r0 = "SplitCompat"
            android.util.Log.i(r0, r7)
            java.util.zip.ZipFile r7 = r4.f40733c
            java.util.zip.ZipEntry r5 = r5.f40735b
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            boolean r3 = r6.exists()
            if (r3 == 0) goto L_0x0051
            r6.delete()
        L_0x0051:
            java.io.InputStream r5 = r7.getInputStream(r5)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0076 }
            r7.<init>(r6)     // Catch:{ all -> 0x0076 }
            r6.setWritable(r1, r2)     // Catch:{ all -> 0x0071 }
            r6.setWritable(r1, r1)     // Catch:{ all -> 0x0071 }
        L_0x0060:
            int r6 = r5.read(r0)     // Catch:{ all -> 0x0071 }
            if (r6 <= 0) goto L_0x006a
            r7.write(r0, r1, r6)     // Catch:{ all -> 0x0071 }
            goto L_0x0060
        L_0x006a:
            r7.close()     // Catch:{ all -> 0x0076 }
            r5.close()
            return
        L_0x0071:
            r6 = move-exception
            r7.close()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            throw r6     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r6 = move-exception
            if (r5 == 0) goto L_0x007c
            r5.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r6
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p665rl.C18491i.mo70003a(rl.l, java.io.File, boolean):void");
    }
}
