package p665rl;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: rl.m */
public final class C18495m {

    /* renamed from: b */
    public static final Pattern f40736b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    public final C18487e f40737a;

    public C18495m(C18487e eVar) throws IOException {
        this.f40737a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f7 A[SYNTHETIC, Splitter:B:33:0x00f7] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m31206b(p665rl.C18497o r13, p665rl.C18492j r14) throws java.io.IOException {
        /*
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00f3 }
            java.io.File r1 = r13.mo69993a()     // Catch:{ IOException -> 0x00f3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r13 = r13.mo69994b()     // Catch:{ IOException -> 0x00f1 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x00f1 }
            r1.<init>()     // Catch:{ IOException -> 0x00f1 }
            java.util.Enumeration r2 = r0.entries()     // Catch:{ IOException -> 0x00f1 }
        L_0x0016:
            boolean r3 = r2.hasMoreElements()     // Catch:{ IOException -> 0x00f1 }
            r4 = 2
            java.lang.String r5 = "SplitCompat"
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x006a
            java.lang.Object r3 = r2.nextElement()     // Catch:{ IOException -> 0x00f1 }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r8 = r3.getName()     // Catch:{ IOException -> 0x00f1 }
            java.util.regex.Pattern r9 = f40736b     // Catch:{ IOException -> 0x00f1 }
            java.util.regex.Matcher r8 = r9.matcher(r8)     // Catch:{ IOException -> 0x00f1 }
            boolean r9 = r8.matches()     // Catch:{ IOException -> 0x00f1 }
            if (r9 == 0) goto L_0x0016
            java.lang.String r9 = r8.group(r7)     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r8 = r8.group(r4)     // Catch:{ IOException -> 0x00f1 }
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x00f1 }
            r10[r6] = r13     // Catch:{ IOException -> 0x00f1 }
            r10[r7] = r8     // Catch:{ IOException -> 0x00f1 }
            r10[r4] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r4 = "NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'"
            java.lang.String r4 = java.lang.String.format(r4, r10)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r4)     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object r4 = r1.get(r9)     // Catch:{ IOException -> 0x00f1 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ IOException -> 0x00f1 }
            if (r4 != 0) goto L_0x0061
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x00f1 }
            r4.<init>()     // Catch:{ IOException -> 0x00f1 }
            r1.put(r9, r4)     // Catch:{ IOException -> 0x00f1 }
        L_0x0061:
            rl.l r5 = new rl.l     // Catch:{ IOException -> 0x00f1 }
            r5.<init>(r3, r8)     // Catch:{ IOException -> 0x00f1 }
            r4.add(r5)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0016
        L_0x006a:
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ IOException -> 0x00f1 }
            r13.<init>()     // Catch:{ IOException -> 0x00f1 }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x00f1 }
            int r3 = r2.length     // Catch:{ IOException -> 0x00f1 }
            r8 = r6
        L_0x0073:
            if (r8 >= r3) goto L_0x00e1
            r9 = r2[r8]     // Catch:{ IOException -> 0x00f1 }
            boolean r10 = r1.containsKey(r9)     // Catch:{ IOException -> 0x00f1 }
            if (r10 == 0) goto L_0x00d1
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x00f1 }
            r10[r6] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = "NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI"
            java.lang.String r10 = java.lang.String.format(r11, r10)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r10)     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object r10 = r1.get(r9)     // Catch:{ IOException -> 0x00f1 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ IOException -> 0x00f1 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x00f1 }
        L_0x0094:
            boolean r11 = r10.hasNext()     // Catch:{ IOException -> 0x00f1 }
            if (r11 == 0) goto L_0x00de
            java.lang.Object r11 = r10.next()     // Catch:{ IOException -> 0x00f1 }
            rl.l r11 = (p665rl.C18494l) r11     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r12 = r11.f40734a     // Catch:{ IOException -> 0x00f1 }
            boolean r12 = r13.containsKey(r12)     // Catch:{ IOException -> 0x00f1 }
            if (r12 == 0) goto L_0x00ba
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = r11.f40734a     // Catch:{ IOException -> 0x00f1 }
            r12[r6] = r11     // Catch:{ IOException -> 0x00f1 }
            r12[r7] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = "NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI"
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r11)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0094
        L_0x00ba:
            java.lang.String r12 = r11.f40734a     // Catch:{ IOException -> 0x00f1 }
            r13.put(r12, r11)     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = r11.f40734a     // Catch:{ IOException -> 0x00f1 }
            r12[r6] = r11     // Catch:{ IOException -> 0x00f1 }
            r12[r7] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = "NativeLibraryExtractor: using library %s for ABI %s"
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r11)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0094
        L_0x00d1:
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x00f1 }
            r10[r6] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r9 = "NativeLibraryExtractor: there are no native libraries for supported ABI %s"
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r9)     // Catch:{ IOException -> 0x00f1 }
        L_0x00de:
            int r8 = r8 + 1
            goto L_0x0073
        L_0x00e1:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ IOException -> 0x00f1 }
            java.util.Collection r13 = r13.values()     // Catch:{ IOException -> 0x00f1 }
            r1.<init>(r13)     // Catch:{ IOException -> 0x00f1 }
            r14.mo70004a(r0, r1)     // Catch:{ IOException -> 0x00f1 }
            r0.close()     // Catch:{ IOException -> 0x00f1 }
            return
        L_0x00f1:
            r13 = move-exception
            goto L_0x00f5
        L_0x00f3:
            r13 = move-exception
            r0 = 0
        L_0x00f5:
            if (r0 == 0) goto L_0x00fa
            r0.close()     // Catch:{ IOException -> 0x00fa }
        L_0x00fa:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p665rl.C18495m.m31206b(rl.o, rl.j):void");
    }

    /* renamed from: a */
    public final HashSet mo70005a() throws IOException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        HashSet a = this.f40737a.mo69999a();
        C18487e eVar = this.f40737a;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        File file = new File(eVar.mo70002g(), "native-libraries");
        C18487e.m31195e(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C18497o) it2.next()).mo69994b().equals(str)) {
                        break;
                    }
                } else {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{str}));
                    C18487e eVar2 = this.f40737a;
                    eVar2.getClass();
                    File file3 = new File(eVar2.mo70002g(), "native-libraries");
                    C18487e.m31195e(file3);
                    File d = C18487e.m31194d(file3, str);
                    C18487e.m31195e(d);
                    C18487e.m31193c(d);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = a.iterator();
        while (it3.hasNext()) {
            C18497o oVar = (C18497o) it3.next();
            HashSet hashSet2 = new HashSet();
            m31206b(oVar, new C18490h(this, hashSet2, oVar));
            C18487e eVar3 = this.f40737a;
            String b = oVar.mo69994b();
            eVar3.getClass();
            HashSet hashSet3 = new HashSet();
            File file4 = new File(eVar3.mo70002g(), "native-libraries");
            C18487e.m31195e(file4);
            File d2 = C18487e.m31194d(file4, b);
            C18487e.m31195e(d2);
            File[] listFiles2 = d2.listFiles();
            if (listFiles2 != null) {
                for (File file5 : listFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{file6.getAbsolutePath(), oVar.mo69994b(), oVar.mo69993a().getAbsolutePath()}));
                    C18487e eVar4 = this.f40737a;
                    eVar4.getClass();
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(eVar4.mo70002g(), "native-libraries");
                    C18487e.m31195e(file7);
                    if (parentFile.equals(file7)) {
                        C18487e.m31193c(file6);
                    } else {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* renamed from: c */
    public final void mo70006c(C18497o oVar, HashSet hashSet, C18493k kVar) throws IOException {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C18494l lVar = (C18494l) it.next();
            C18487e eVar = this.f40737a;
            String b = oVar.mo69994b();
            String str = lVar.f40734a;
            eVar.getClass();
            File file = new File(eVar.mo70002g(), "native-libraries");
            C18487e.m31195e(file);
            File d = C18487e.m31194d(file, b);
            C18487e.m31195e(d);
            File d2 = C18487e.m31194d(d, str);
            boolean z = true;
            if (!d2.exists() || d2.length() != lVar.f40735b.getSize() || !(!d2.canWrite())) {
                z = false;
            }
            kVar.mo70003a(lVar, d2, z);
        }
    }
}
