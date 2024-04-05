package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.d2 */
public final class C14950d2<V> {

    /* renamed from: g */
    public static final Object f33338g = new Object();

    /* renamed from: a */
    public final String f33339a;

    /* renamed from: b */
    public final C14941c2<V> f33340b;

    /* renamed from: c */
    public final V f33341c;

    /* renamed from: d */
    public final V f33342d;

    /* renamed from: e */
    public final Object f33343e = new Object();

    /* renamed from: f */
    public volatile V f33344f = null;

    public /* synthetic */ C14950d2(String str, Object obj, Object obj2, C14941c2 c2Var) {
        this.f33339a = str;
        this.f33341c = obj;
        this.f33342d = obj2;
        this.f33340b = c2Var;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0041 */
    /* renamed from: a */
    public final V mo51978a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f33343e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            tq.a r4 = p514bk.C14088a.f31025f
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = f33338g
            monitor-enter(r4)
            boolean r0 = p772tq.C20203a.m34524G()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x001f
            V r0 = r3.f33344f     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x001b
            V r0 = r3.f33341c     // Catch:{ all -> 0x0065 }
            goto L_0x001d
        L_0x001b:
            V r0 = r3.f33344f     // Catch:{ all -> 0x0065 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            return r0
        L_0x001f:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            java.util.List<com.google.android.gms.measurement.internal.d2<?>> r4 = com.google.android.gms.measurement.internal.C14959e2.f33393a     // Catch:{ SecurityException -> 0x0053 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0053 }
        L_0x0026:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0053 }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0053 }
            com.google.android.gms.measurement.internal.d2 r0 = (com.google.android.gms.measurement.internal.C14950d2) r0     // Catch:{ SecurityException -> 0x0053 }
            boolean r1 = p772tq.C20203a.m34524G()     // Catch:{ SecurityException -> 0x0053 }
            if (r1 != 0) goto L_0x004b
            r1 = 0
            com.google.android.gms.measurement.internal.c2<V> r2 = r0.f33340b     // Catch:{ IllegalStateException -> 0x0041 }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0041 }
        L_0x0041:
            java.lang.Object r2 = f33338g     // Catch:{ SecurityException -> 0x0053 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0053 }
            r0.f33344f = r1     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            goto L_0x0026
        L_0x0048:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r4     // Catch:{ SecurityException -> 0x0053 }
        L_0x004b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0053 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0053 }
            throw r4     // Catch:{ SecurityException -> 0x0053 }
        L_0x0053:
            com.google.android.gms.measurement.internal.c2<V> r4 = r3.f33340b
            if (r4 != 0) goto L_0x005a
            V r4 = r3.f33341c
            return r4
        L_0x005a:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0062, IllegalStateException -> 0x005f }
            return r4
        L_0x005f:
            V r4 = r3.f33341c
            return r4
        L_0x0062:
            V r4 = r3.f33341c
            return r4
        L_0x0065:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            throw r0
        L_0x0068:
            V r4 = r3.f33341c
            return r4
        L_0x006b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14950d2.mo51978a(java.lang.Object):java.lang.Object");
    }
}
