package com.google.android.play.core.assetpacks;

import com.google.android.gms.measurement.internal.C15032m3;
import p614ll.C18200b;

/* renamed from: com.google.android.play.core.assetpacks.i1 */
public final class C15612i1 {

    /* renamed from: e */
    public static final C15032m3 f35191e = new C15032m3("ExtractorTaskFinder");

    /* renamed from: a */
    public final C15608h1 f35192a;

    /* renamed from: b */
    public final C15583b0 f35193b;

    /* renamed from: c */
    public final C15619k0 f35194c;

    /* renamed from: d */
    public final C18200b f35195d;

    public C15612i1(C15608h1 h1Var, C15583b0 b0Var, C15619k0 k0Var, C18200b bVar) {
        this.f35192a = h1Var;
        this.f35193b = b0Var;
        this.f35194c = k0Var;
        this.f35195d = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.u1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.play.core.assetpacks.u1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.s1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.play.core.assetpacks.s1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.google.android.play.core.assetpacks.m2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.google.android.play.core.assetpacks.m2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: com.google.android.play.core.assetpacks.f2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: com.google.android.play.core.assetpacks.f2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: com.google.android.play.core.assetpacks.m2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: com.google.android.play.core.assetpacks.s1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: com.google.android.play.core.assetpacks.u1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: com.google.android.play.core.assetpacks.f2} */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r0 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        f35191e.mo52242b("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r7.f35121a), r7.f35123c.f35103a);
        r14 = r7.f35121a;
        r8 = r7.f35123c;
        r10 = new com.google.android.play.core.assetpacks.C15660u1(r8.f35104b, r8.f35103a, r14, r7.f35122b, r8.f35105c);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0265 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x038f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0362 A[LOOP:10: B:104:0x0362->B:169:0x0362, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0280 A[Catch:{ IOException -> 0x010e, all -> 0x0427 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p461uf.C13518l mo55421a() {
        /*
            r32 = this;
            r1 = r32
            com.google.android.play.core.assetpacks.h1 r0 = r1.f35192a     // Catch:{ all -> 0x0427 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f35175f     // Catch:{ all -> 0x0427 }
            r0.lock()     // Catch:{ all -> 0x0427 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0427 }
            r2.<init>()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.h1 r0 = r1.f35192a     // Catch:{ all -> 0x0427 }
            java.util.HashMap r0 = r0.f35174e     // Catch:{ all -> 0x0427 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0427 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0427 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0427 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.e1 r3 = (com.google.android.play.core.assetpacks.C15596e1) r3     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r4 = r3.f35123c     // Catch:{ all -> 0x0427 }
            int r4 = r4.f35106d     // Catch:{ all -> 0x0427 }
            boolean r4 = kotlinx.coroutines.C19543e0.m33341w0(r4)     // Catch:{ all -> 0x0427 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0427 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0427 }
            if (r0 == 0) goto L_0x003f
            com.google.android.play.core.assetpacks.h1 r0 = r1.f35192a
            r3 = 0
            goto L_0x041d
        L_0x003f:
            ll.b r0 = r1.f35195d     // Catch:{ all -> 0x0427 }
            boolean r0 = r0.mo69733a()     // Catch:{ all -> 0x0427 }
            r4 = 0
            r5 = 1
            r6 = 2
            if (r0 == 0) goto L_0x00ba
            com.google.android.play.core.assetpacks.b0 r0 = r1.f35193b     // Catch:{ all -> 0x0427 }
            java.util.HashMap r0 = r0.mo55386n()     // Catch:{ all -> 0x0427 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0054:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0427 }
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.e1 r8 = (com.google.android.play.core.assetpacks.C15596e1) r8     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r8.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r9.f35103a     // Catch:{ all -> 0x0427 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x0427 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0427 }
            if (r9 == 0) goto L_0x0054
            com.google.android.play.core.assetpacks.d1 r10 = r8.f35123c     // Catch:{ all -> 0x0427 }
            long r10 = r10.f35104b     // Catch:{ all -> 0x0427 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0427 }
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0054
            com.google.android.gms.measurement.internal.m3 r0 = f35191e     // Catch:{ all -> 0x0427 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0427 }
            int r9 = r8.f35121a     // Catch:{ all -> 0x0427 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0427 }
            r7[r4] = r9     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r8.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r9.f35103a     // Catch:{ all -> 0x0427 }
            r7[r5] = r9     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = "Found promote pack task for session %s with pack %s."
            r0.mo52242b(r9, r7)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.f2 r0 = new com.google.android.play.core.assetpacks.f2     // Catch:{ all -> 0x0427 }
            int r11 = r8.f35121a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r7 = r8.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r14 = r7.f35103a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.b0 r7 = r1.f35193b     // Catch:{ all -> 0x0427 }
            r7.getClass()     // Catch:{ all -> 0x0427 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0427 }
            java.io.File r7 = r7.mo55378d()     // Catch:{ all -> 0x0427 }
            r9.<init>(r7, r14)     // Catch:{ all -> 0x0427 }
            long r9 = com.google.android.play.core.assetpacks.C15583b0.m25254b(r9, r5)     // Catch:{ all -> 0x0427 }
            int r15 = (int) r9     // Catch:{ all -> 0x0427 }
            int r7 = r8.f35122b     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r8 = r8.f35123c     // Catch:{ all -> 0x0427 }
            long r12 = r8.f35104b     // Catch:{ all -> 0x0427 }
            r10 = r0
            r16 = r7
            r10.<init>(r11, r12, r14, r15, r16)     // Catch:{ all -> 0x0427 }
            goto L_0x00b8
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            if (r0 != 0) goto L_0x0421
        L_0x00ba:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0427 }
        L_0x00be:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0427 }
            if (r7 == 0) goto L_0x012d
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.e1 r7 = (com.google.android.play.core.assetpacks.C15596e1) r7     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.b0 r8 = r1.f35193b     // Catch:{ IOException -> 0x010e }
            com.google.android.play.core.assetpacks.d1 r9 = r7.f35123c     // Catch:{ IOException -> 0x010e }
            java.lang.String r10 = r9.f35103a     // Catch:{ IOException -> 0x010e }
            int r11 = r7.f35122b     // Catch:{ IOException -> 0x010e }
            long r12 = r9.f35104b     // Catch:{ IOException -> 0x010e }
            int r8 = r8.mo55380h(r10, r11, r12)     // Catch:{ IOException -> 0x010e }
            com.google.android.play.core.assetpacks.d1 r9 = r7.f35123c     // Catch:{ IOException -> 0x010e }
            java.util.List r9 = r9.f35108f     // Catch:{ IOException -> 0x010e }
            int r9 = r9.size()     // Catch:{ IOException -> 0x010e }
            if (r8 != r9) goto L_0x00be
            com.google.android.gms.measurement.internal.m3 r0 = f35191e     // Catch:{ all -> 0x0427 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0427 }
            int r9 = r7.f35121a     // Catch:{ all -> 0x0427 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0427 }
            r8[r4] = r9     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r9.f35103a     // Catch:{ all -> 0x0427 }
            r8[r5] = r9     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo52242b(r9, r8)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.u1 r0 = new com.google.android.play.core.assetpacks.u1     // Catch:{ all -> 0x0427 }
            int r14 = r7.f35121a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r8 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r13 = r8.f35103a     // Catch:{ all -> 0x0427 }
            int r15 = r7.f35122b     // Catch:{ all -> 0x0427 }
            long r11 = r8.f35104b     // Catch:{ all -> 0x0427 }
            java.lang.String r7 = r8.f35105c     // Catch:{ all -> 0x0427 }
            r10 = r0
            r16 = r7
            r10.<init>(r11, r13, r14, r15, r16)     // Catch:{ all -> 0x0427 }
            goto L_0x012e
        L_0x010e:
            r0 = move-exception
            com.google.android.play.core.assetpacks.zzck r2 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x0427 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0427 }
            int r6 = r7.f35121a     // Catch:{ all -> 0x0427 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0427 }
            r3[r4] = r6     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r4 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r4 = r4.f35103a     // Catch:{ all -> 0x0427 }
            r3[r5] = r4     // Catch:{ all -> 0x0427 }
            java.lang.String r4 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0427 }
            int r4 = r7.f35121a     // Catch:{ all -> 0x0427 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0427 }
            throw r2     // Catch:{ all -> 0x0427 }
        L_0x012d:
            r0 = 0
        L_0x012e:
            if (r0 != 0) goto L_0x0421
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0134:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0427 }
            r8 = 3
            if (r7 == 0) goto L_0x01b6
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.e1 r7 = (com.google.android.play.core.assetpacks.C15596e1) r7     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r7.f35123c     // Catch:{ all -> 0x0427 }
            int r10 = r9.f35106d     // Catch:{ all -> 0x0427 }
            boolean r10 = kotlinx.coroutines.C19543e0.m33341w0(r10)     // Catch:{ all -> 0x0427 }
            if (r10 == 0) goto L_0x0134
            java.util.List r9 = r9.f35108f     // Catch:{ all -> 0x0427 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0151:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0427 }
            if (r10 == 0) goto L_0x0134
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.f1 r10 = (com.google.android.play.core.assetpacks.C15600f1) r10     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.b0 r11 = r1.f35193b     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r12 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r13 = r12.f35103a     // Catch:{ all -> 0x0427 }
            int r14 = r7.f35122b     // Catch:{ all -> 0x0427 }
            long r5 = r12.f35104b     // Catch:{ all -> 0x0427 }
            java.lang.String r15 = r10.f35133a     // Catch:{ all -> 0x0427 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.mo55384l(r12, r13, r14, r16)     // Catch:{ all -> 0x0427 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0427 }
            if (r5 == 0) goto L_0x01b3
            com.google.android.gms.measurement.internal.m3 r0 = f35191e     // Catch:{ all -> 0x0427 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0427 }
            int r6 = r7.f35121a     // Catch:{ all -> 0x0427 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0427 }
            r5[r4] = r6     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r6 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r6 = r6.f35103a     // Catch:{ all -> 0x0427 }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x0427 }
            java.lang.String r6 = r10.f35133a     // Catch:{ all -> 0x0427 }
            r9 = 2
            r5[r9] = r6     // Catch:{ all -> 0x0427 }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo52242b(r6, r5)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.s1 r0 = new com.google.android.play.core.assetpacks.s1     // Catch:{ all -> 0x0427 }
            int r5 = r7.f35121a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r6 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r6.f35103a     // Catch:{ all -> 0x0427 }
            int r7 = r7.f35122b     // Catch:{ all -> 0x0427 }
            long r11 = r6.f35104b     // Catch:{ all -> 0x0427 }
            java.lang.String r6 = r10.f35133a     // Catch:{ all -> 0x0427 }
            r17 = r0
            r18 = r11
            r20 = r9
            r21 = r5
            r22 = r7
            r23 = r6
            r17.<init>(r18, r20, r21, r22, r23)     // Catch:{ all -> 0x0427 }
            goto L_0x01b7
        L_0x01b3:
            r5 = 1
            r6 = 2
            goto L_0x0151
        L_0x01b6:
            r0 = 0
        L_0x01b7:
            if (r0 != 0) goto L_0x0421
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0427 }
        L_0x01bd:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0427 }
            if (r5 == 0) goto L_0x0240
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.e1 r5 = (com.google.android.play.core.assetpacks.C15596e1) r5     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r6 = r5.f35123c     // Catch:{ all -> 0x0427 }
            int r7 = r6.f35106d     // Catch:{ all -> 0x0427 }
            boolean r7 = kotlinx.coroutines.C19543e0.m33341w0(r7)     // Catch:{ all -> 0x0427 }
            if (r7 == 0) goto L_0x01bd
            java.util.List r6 = r6.f35108f     // Catch:{ all -> 0x0427 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0427 }
        L_0x01d9:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0427 }
            if (r7 == 0) goto L_0x01bd
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.f1 r7 = (com.google.android.play.core.assetpacks.C15600f1) r7     // Catch:{ all -> 0x0427 }
            boolean r9 = r1.mo55422b(r5, r7)     // Catch:{ all -> 0x0427 }
            if (r9 == 0) goto L_0x01d9
            com.google.android.play.core.assetpacks.b0 r10 = r1.f35193b     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r5.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r11 = r9.f35103a     // Catch:{ all -> 0x0427 }
            int r12 = r5.f35122b     // Catch:{ all -> 0x0427 }
            long r13 = r9.f35104b     // Catch:{ all -> 0x0427 }
            java.lang.String r15 = r7.f35133a     // Catch:{ all -> 0x0427 }
            java.io.File r9 = r10.mo55383k(r11, r12, r13, r15)     // Catch:{ all -> 0x0427 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0427 }
            if (r9 == 0) goto L_0x01d9
            com.google.android.gms.measurement.internal.m3 r0 = f35191e     // Catch:{ all -> 0x0427 }
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ all -> 0x0427 }
            int r9 = r5.f35121a     // Catch:{ all -> 0x0427 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0427 }
            r6[r4] = r9     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r5.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r9.f35103a     // Catch:{ all -> 0x0427 }
            r10 = 1
            r6[r10] = r9     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r7.f35133a     // Catch:{ all -> 0x0427 }
            r10 = 2
            r6[r10] = r9     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo52242b(r9, r6)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.m2 r0 = new com.google.android.play.core.assetpacks.m2     // Catch:{ all -> 0x0427 }
            int r6 = r5.f35121a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r5.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r10 = r9.f35103a     // Catch:{ all -> 0x0427 }
            int r5 = r5.f35122b     // Catch:{ all -> 0x0427 }
            long r11 = r9.f35104b     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r7.f35133a     // Catch:{ all -> 0x0427 }
            java.lang.String r7 = r7.f35134b     // Catch:{ all -> 0x0427 }
            r17 = r0
            r18 = r6
            r19 = r10
            r20 = r5
            r21 = r11
            r23 = r9
            r24 = r7
            r17.<init>(r18, r19, r20, r21, r23, r24)     // Catch:{ all -> 0x0427 }
            goto L_0x0241
        L_0x0240:
            r0 = 0
        L_0x0241:
            if (r0 != 0) goto L_0x0421
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0247:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0427 }
            r6 = 4
            if (r0 == 0) goto L_0x033f
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0427 }
            r7 = r0
            com.google.android.play.core.assetpacks.e1 r7 = (com.google.android.play.core.assetpacks.C15596e1) r7     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r0 = r7.f35123c     // Catch:{ all -> 0x0427 }
            int r9 = r0.f35106d     // Catch:{ all -> 0x0427 }
            boolean r9 = kotlinx.coroutines.C19543e0.m33341w0(r9)     // Catch:{ all -> 0x0427 }
            if (r9 == 0) goto L_0x0247
            java.util.List r0 = r0.f35108f     // Catch:{ all -> 0x0427 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0265:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0427 }
            if (r0 == 0) goto L_0x0247
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0427 }
            r10 = r0
            com.google.android.play.core.assetpacks.f1 r10 = (com.google.android.play.core.assetpacks.C15600f1) r10     // Catch:{ all -> 0x0427 }
            int r0 = r10.f35138f     // Catch:{ all -> 0x0427 }
            r11 = 1
            if (r0 == r11) goto L_0x027d
            r11 = 2
            if (r0 != r11) goto L_0x027b
            goto L_0x027d
        L_0x027b:
            r0 = r4
            goto L_0x027e
        L_0x027d:
            r0 = 1
        L_0x027e:
            if (r0 != 0) goto L_0x0265
            com.google.android.play.core.assetpacks.j2 r0 = new com.google.android.play.core.assetpacks.j2     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.b0 r11 = r1.f35193b     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r12 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r13 = r12.f35103a     // Catch:{ all -> 0x0427 }
            int r14 = r7.f35122b     // Catch:{ all -> 0x0427 }
            r16 = r9
            long r8 = r12.f35104b     // Catch:{ all -> 0x0427 }
            java.lang.String r12 = r10.f35133a     // Catch:{ all -> 0x0427 }
            r17 = r0
            r18 = r11
            r19 = r13
            r20 = r14
            r21 = r8
            r23 = r12
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x0427 }
            int r0 = r0.mo55432a()     // Catch:{ IOException -> 0x02a4 }
            goto L_0x02b3
        L_0x02a4:
            r0 = move-exception
            r8 = r0
            com.google.android.gms.measurement.internal.m3 r0 = f35191e     // Catch:{ all -> 0x0427 }
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x0427 }
            r11[r4] = r8     // Catch:{ all -> 0x0427 }
            java.lang.String r8 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo52243c(r8, r11)     // Catch:{ all -> 0x0427 }
            r0 = r4
        L_0x02b3:
            r8 = -1
            if (r0 == r8) goto L_0x0339
            java.util.List r8 = r10.f35136d     // Catch:{ all -> 0x0427 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.b1 r8 = (com.google.android.play.core.assetpacks.C15584b1) r8     // Catch:{ all -> 0x0427 }
            boolean r8 = r8.f35069a     // Catch:{ all -> 0x0427 }
            if (r8 == 0) goto L_0x0339
            com.google.android.gms.measurement.internal.m3 r5 = f35191e     // Catch:{ all -> 0x0427 }
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0427 }
            int r9 = r10.f35137e     // Catch:{ all -> 0x0427 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0427 }
            r8[r4] = r9     // Catch:{ all -> 0x0427 }
            int r9 = r7.f35121a     // Catch:{ all -> 0x0427 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0427 }
            r11 = 1
            r8[r11] = r9     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r9.f35103a     // Catch:{ all -> 0x0427 }
            r11 = 2
            r8[r11] = r9     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r10.f35133a     // Catch:{ all -> 0x0427 }
            r11 = 3
            r8[r11] = r9     // Catch:{ all -> 0x0427 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0427 }
            r8[r6] = r9     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r5.mo52242b(r9, r8)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.k0 r5 = r1.f35194c     // Catch:{ all -> 0x0427 }
            int r8 = r7.f35121a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r9.f35103a     // Catch:{ all -> 0x0427 }
            java.lang.String r11 = r10.f35133a     // Catch:{ all -> 0x0427 }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r31 = r5.mo55442a(r9, r8, r0, r11)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.p0 r5 = new com.google.android.play.core.assetpacks.p0     // Catch:{ all -> 0x0427 }
            int r8 = r7.f35121a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r9 = r7.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r11 = r9.f35103a     // Catch:{ all -> 0x0427 }
            int r12 = r7.f35122b     // Catch:{ all -> 0x0427 }
            long r13 = r9.f35104b     // Catch:{ all -> 0x0427 }
            java.lang.String r9 = r9.f35105c     // Catch:{ all -> 0x0427 }
            java.lang.String r15 = r10.f35133a     // Catch:{ all -> 0x0427 }
            int r3 = r10.f35137e     // Catch:{ all -> 0x0427 }
            java.util.List r10 = r10.f35136d     // Catch:{ all -> 0x0427 }
            int r27 = r10.size()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r7 = r7.f35123c     // Catch:{ all -> 0x0427 }
            r16 = r5
            long r4 = r7.f35107e     // Catch:{ all -> 0x0427 }
            int r7 = r7.f35106d     // Catch:{ all -> 0x0427 }
            r17 = r16
            r18 = r8
            r19 = r11
            r20 = r12
            r21 = r13
            r23 = r9
            r24 = r15
            r25 = r3
            r26 = r0
            r28 = r4
            r30 = r7
            r17.<init>(r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31)     // Catch:{ all -> 0x0427 }
            r5 = r16
            goto L_0x0340
        L_0x0339:
            r9 = r16
            r4 = 0
            r8 = 3
            goto L_0x0265
        L_0x033f:
            r5 = 0
        L_0x0340:
            if (r5 != 0) goto L_0x041a
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0346:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0427 }
            if (r2 == 0) goto L_0x040d
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.e1 r2 = (com.google.android.play.core.assetpacks.C15596e1) r2     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r3 = r2.f35123c     // Catch:{ all -> 0x0427 }
            int r4 = r3.f35106d     // Catch:{ all -> 0x0427 }
            boolean r4 = kotlinx.coroutines.C19543e0.m33341w0(r4)     // Catch:{ all -> 0x0427 }
            if (r4 == 0) goto L_0x0346
            java.util.List r3 = r3.f35108f     // Catch:{ all -> 0x0427 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0362:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0427 }
            if (r4 == 0) goto L_0x0346
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.f1 r4 = (com.google.android.play.core.assetpacks.C15600f1) r4     // Catch:{ all -> 0x0427 }
            int r5 = r4.f35138f     // Catch:{ all -> 0x0427 }
            r7 = 1
            if (r5 == r7) goto L_0x0379
            r7 = 2
            if (r5 != r7) goto L_0x0377
            goto L_0x0379
        L_0x0377:
            r5 = 0
            goto L_0x037a
        L_0x0379:
            r5 = 1
        L_0x037a:
            if (r5 == 0) goto L_0x0362
            java.util.List r5 = r4.f35136d     // Catch:{ all -> 0x0427 }
            r7 = 0
            java.lang.Object r5 = r5.get(r7)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.b1 r5 = (com.google.android.play.core.assetpacks.C15584b1) r5     // Catch:{ all -> 0x0427 }
            boolean r5 = r5.f35069a     // Catch:{ all -> 0x0427 }
            if (r5 == 0) goto L_0x0362
            boolean r5 = r1.mo55422b(r2, r4)     // Catch:{ all -> 0x0427 }
            if (r5 != 0) goto L_0x0362
            com.google.android.gms.measurement.internal.m3 r0 = f35191e     // Catch:{ all -> 0x0427 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0427 }
            int r5 = r4.f35138f     // Catch:{ all -> 0x0427 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0427 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0427 }
            int r5 = r2.f35121a     // Catch:{ all -> 0x0427 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0427 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r5 = r2.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r5 = r5.f35103a     // Catch:{ all -> 0x0427 }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x0427 }
            java.lang.String r5 = r4.f35133a     // Catch:{ all -> 0x0427 }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x0427 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo52242b(r5, r3)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.k0 r0 = r1.f35194c     // Catch:{ all -> 0x0427 }
            int r3 = r2.f35121a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r5 = r2.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r5 = r5.f35103a     // Catch:{ all -> 0x0427 }
            java.lang.String r6 = r4.f35133a     // Catch:{ all -> 0x0427 }
            r9 = 0
            android.os.ParcelFileDescriptor$AutoCloseInputStream r30 = r0.mo55442a(r5, r3, r9, r6)     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d2 r0 = new com.google.android.play.core.assetpacks.d2     // Catch:{ all -> 0x0427 }
            int r3 = r2.f35121a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r5 = r2.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r5 = r5.f35103a     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.b0 r6 = r1.f35193b     // Catch:{ all -> 0x0427 }
            r6.getClass()     // Catch:{ all -> 0x0427 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0427 }
            java.io.File r6 = r6.mo55378d()     // Catch:{ all -> 0x0427 }
            r7.<init>(r6, r5)     // Catch:{ all -> 0x0427 }
            r10 = 1
            long r6 = com.google.android.play.core.assetpacks.C15583b0.m25254b(r7, r10)     // Catch:{ all -> 0x0427 }
            int r6 = (int) r6     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.b0 r7 = r1.f35193b     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r8 = r2.f35123c     // Catch:{ all -> 0x0427 }
            java.lang.String r8 = r8.f35103a     // Catch:{ all -> 0x0427 }
            long r21 = r7.mo55381i(r8)     // Catch:{ all -> 0x0427 }
            int r7 = r2.f35122b     // Catch:{ all -> 0x0427 }
            com.google.android.play.core.assetpacks.d1 r2 = r2.f35123c     // Catch:{ all -> 0x0427 }
            long r8 = r2.f35104b     // Catch:{ all -> 0x0427 }
            int r2 = r4.f35138f     // Catch:{ all -> 0x0427 }
            java.lang.String r10 = r4.f35133a     // Catch:{ all -> 0x0427 }
            long r11 = r4.f35135c     // Catch:{ all -> 0x0427 }
            r17 = r0
            r18 = r3
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r8
            r26 = r2
            r27 = r10
            r28 = r11
            r17.<init>(r18, r19, r20, r21, r23, r24, r26, r27, r28, r30)     // Catch:{ all -> 0x0427 }
            goto L_0x040e
        L_0x040d:
            r0 = 0
        L_0x040e:
            if (r0 == 0) goto L_0x0413
            com.google.android.play.core.assetpacks.h1 r2 = r1.f35192a
            goto L_0x0423
        L_0x0413:
            com.google.android.play.core.assetpacks.h1 r0 = r1.f35192a
            r0.mo55410b()
            r2 = 0
            return r2
        L_0x041a:
            com.google.android.play.core.assetpacks.h1 r0 = r1.f35192a
            r3 = r5
        L_0x041d:
            r0.mo55410b()
            return r3
        L_0x0421:
            com.google.android.play.core.assetpacks.h1 r2 = r1.f35192a
        L_0x0423:
            r2.mo55410b()
            return r0
        L_0x0427:
            r0 = move-exception
            com.google.android.play.core.assetpacks.h1 r2 = r1.f35192a
            r2.mo55410b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15612i1.mo55421a():uf.l");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x006b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo55422b(com.google.android.play.core.assetpacks.C15596e1 r9, com.google.android.play.core.assetpacks.C15600f1 r10) {
        /*
            r8 = this;
            com.google.android.play.core.assetpacks.j2 r0 = new com.google.android.play.core.assetpacks.j2
            com.google.android.play.core.assetpacks.b0 r0 = r8.f35193b
            com.google.android.play.core.assetpacks.d1 r1 = r9.f35123c
            java.lang.String r2 = r1.f35103a
            int r9 = r9.f35122b
            long r3 = r1.f35104b
            java.lang.String r10 = r10.f35133a
            r0.getClass()
            java.io.File r1 = new java.io.File
            java.io.File r5 = new java.io.File
            java.io.File r6 = new java.io.File
            java.io.File r7 = new java.io.File
            java.io.File r9 = r0.mo55377c(r2, r9, r3)
            java.lang.String r0 = "_slices"
            r7.<init>(r9, r0)
            java.lang.String r9 = "_metadata"
            r6.<init>(r7, r9)
            r5.<init>(r6, r10)
            java.lang.String r9 = "checkpoint.dat"
            r1.<init>(r5, r9)
            boolean r9 = r1.exists()
            r10 = 0
            if (r9 != 0) goto L_0x0037
            goto L_0x0078
        L_0x0037:
            r9 = 1
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x006c }
            java.util.Properties r1 = new java.util.Properties     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            r1.load(r0)     // Catch:{ all -> 0x0067 }
            r0.close()     // Catch:{ IOException -> 0x006c }
            java.lang.String r0 = "fileStatus"
            java.lang.String r2 = r1.getProperty(r0)
            if (r2 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.m3 r9 = com.google.android.play.core.assetpacks.C15617j2.f35209h
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "Slice checkpoint file corrupt while checking if extraction finished."
            r9.mo52243c(r1, r0)
            goto L_0x0078
        L_0x005a:
            java.lang.String r0 = r1.getProperty(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 4
            if (r0 != r1) goto L_0x0078
            r10 = r9
            goto L_0x0078
        L_0x0067:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r1     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.m3 r1 = com.google.android.play.core.assetpacks.C15617j2.f35209h
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r10] = r0
            java.lang.String r0 = "Could not read checkpoint while checking if extraction finished. %s"
            r1.mo52243c(r0, r9)
        L_0x0078:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15612i1.mo55422b(com.google.android.play.core.assetpacks.e1, com.google.android.play.core.assetpacks.f1):boolean");
    }
}
