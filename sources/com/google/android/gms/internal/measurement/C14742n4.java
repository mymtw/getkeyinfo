package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
public abstract class C14742n4<T> {

    /* renamed from: f */
    public static final Object f32962f = new Object();

    /* renamed from: g */
    public static volatile C14853w3 f32963g;

    /* renamed from: h */
    public static final AtomicInteger f32964h = new AtomicInteger();

    /* renamed from: a */
    public final C14716l4 f32965a;

    /* renamed from: b */
    public final String f32966b;

    /* renamed from: c */
    public final T f32967c;

    /* renamed from: d */
    public volatile int f32968d = -1;

    /* renamed from: e */
    public volatile T f32969e;

    static {
        new AtomicReference();
    }

    public /* synthetic */ C14742n4(C14716l4 l4Var, String str, Object obj) {
        if (l4Var.f32931a != null) {
            this.f32965a = l4Var;
            this.f32966b = str;
            this.f32967c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    public abstract Object mo50558a(String str);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ca A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00da A[Catch:{ all -> 0x0062 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo50725b() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f32964h
            int r0 = r0.get()
            int r1 = r7.f32968d
            if (r1 >= r0) goto L_0x0132
            monitor-enter(r7)
            int r1 = r7.f32968d     // Catch:{ all -> 0x0062 }
            if (r1 >= r0) goto L_0x012e
            com.google.android.gms.internal.measurement.w3 r1 = f32963g     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0128
            com.google.android.gms.internal.measurement.l4 r2 = r7.f32965a     // Catch:{ all -> 0x0062 }
            r2.getClass()     // Catch:{ all -> 0x0062 }
            android.content.Context r2 = r1.f33143a     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.c4 r2 = com.google.android.gms.internal.measurement.C14599c4.m23393a(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.mo50406b(r3)     // Catch:{ all -> 0x0062 }
            r3 = 0
            if (r2 == 0) goto L_0x0065
            java.util.regex.Pattern r4 = com.google.android.gms.internal.measurement.C14841v3.f33121b     // Catch:{ all -> 0x0062 }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x0062 }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            com.google.android.gms.internal.measurement.l4 r5 = r7.f32965a     // Catch:{ all -> 0x0062 }
            r5.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = r7.f32966b     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0062 }
            int r6 = r5.length()     // Catch:{ all -> 0x0062 }
            if (r6 == 0) goto L_0x0058
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0062 }
            goto L_0x005e
        L_0x0058:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0062 }
            r5.<init>(r4)     // Catch:{ all -> 0x0062 }
            r4 = r5
        L_0x005e:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0062 }
            goto L_0x00a2
        L_0x0062:
            r0 = move-exception
            goto L_0x0130
        L_0x0065:
            com.google.android.gms.internal.measurement.l4 r2 = r7.f32965a     // Catch:{ all -> 0x0062 }
            android.net.Uri r2 = r2.f32931a     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0125
            android.content.Context r4 = r1.f33143a     // Catch:{ all -> 0x0062 }
            boolean r2 = com.google.android.gms.internal.measurement.C14625e4.m23510a(r4, r2)     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0087
            com.google.android.gms.internal.measurement.l4 r2 = r7.f32965a     // Catch:{ all -> 0x0062 }
            r2.getClass()     // Catch:{ all -> 0x0062 }
            android.content.Context r2 = r1.f33143a     // Catch:{ all -> 0x0062 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.l4 r4 = r7.f32965a     // Catch:{ all -> 0x0062 }
            android.net.Uri r4 = r4.f32931a     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.z3 r2 = com.google.android.gms.internal.measurement.C14889z3.m24204a(r2, r4)     // Catch:{ all -> 0x0062 }
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            if (r2 == 0) goto L_0x00a2
            com.google.android.gms.internal.measurement.l4 r4 = r7.f32965a     // Catch:{ all -> 0x0062 }
            r4.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = r7.f32966b     // Catch:{ all -> 0x0062 }
            java.util.Map r2 = r2.mo51008b()     // Catch:{ all -> 0x0062 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r7.mo50558a(r2)     // Catch:{ all -> 0x0062 }
            goto L_0x00a3
        L_0x00a2:
            r2 = r3
        L_0x00a3:
            if (r2 == 0) goto L_0x00a6
            goto L_0x00cc
        L_0x00a6:
            com.google.android.gms.internal.measurement.l4 r2 = r7.f32965a     // Catch:{ all -> 0x0062 }
            boolean r2 = r2.f32932b     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x00c7
            android.content.Context r2 = r1.f33143a     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.c4 r2 = com.google.android.gms.internal.measurement.C14599c4.m23393a(r2)     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.l4 r4 = r7.f32965a     // Catch:{ all -> 0x0062 }
            boolean r4 = r4.f32932b     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x00ba
            r4 = r3
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r4 = r7.f32966b     // Catch:{ all -> 0x0062 }
        L_0x00bc:
            java.lang.String r2 = r2.mo50406b(r4)     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r7.mo50558a(r2)     // Catch:{ all -> 0x0062 }
            goto L_0x00c8
        L_0x00c7:
            r2 = r3
        L_0x00c8:
            if (r2 != 0) goto L_0x00cc
            T r2 = r7.f32967c     // Catch:{ all -> 0x0062 }
        L_0x00cc:
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.zzhz<com.google.android.gms.internal.measurement.d4>> r1 = r1.f33144b     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.zzhz r1 = (com.google.android.gms.internal.measurement.zzhz) r1     // Catch:{ all -> 0x0062 }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0120
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.d4 r1 = (com.google.android.gms.internal.measurement.C14612d4) r1     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.l4 r2 = r7.f32965a     // Catch:{ all -> 0x0062 }
            android.net.Uri r2 = r2.f32931a     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = r7.f32966b     // Catch:{ all -> 0x0062 }
            r1.getClass()     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0117
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = r1.f32803a     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0062 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x00fa
            goto L_0x0117
        L_0x00fa:
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = ""
            int r4 = r2.length()     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x010b
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0062 }
            goto L_0x0110
        L_0x010b:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0062 }
            r2.<init>(r3)     // Catch:{ all -> 0x0062 }
        L_0x0110:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0062 }
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0062 }
        L_0x0117:
            if (r3 != 0) goto L_0x011c
            T r2 = r7.f32967c     // Catch:{ all -> 0x0062 }
            goto L_0x0120
        L_0x011c:
            java.lang.Object r2 = r7.mo50558a(r3)     // Catch:{ all -> 0x0062 }
        L_0x0120:
            r7.f32969e = r2     // Catch:{ all -> 0x0062 }
            r7.f32968d = r0     // Catch:{ all -> 0x0062 }
            goto L_0x012e
        L_0x0125:
            o.b r0 = com.google.android.gms.internal.measurement.C14755o4.f33017a     // Catch:{ all -> 0x0062 }
            throw r3     // Catch:{ all -> 0x0062 }
        L_0x0128:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0062 }
            r0.<init>(r2)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x012e:
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            goto L_0x0132
        L_0x0130:
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            throw r0
        L_0x0132:
            T r0 = r7.f32969e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14742n4.mo50725b():java.lang.Object");
    }
}
