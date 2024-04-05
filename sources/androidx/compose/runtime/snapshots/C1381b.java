package androidx.compose.runtime.snapshots;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.snapshots.b */
public final class C1381b extends C1379a {

    /* renamed from: l */
    public final C1379a f3021l;

    /* renamed from: m */
    public boolean f3022m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1381b(int i, SnapshotIdSet snapshotIdSet, C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2, C1379a aVar) {
        super(i, snapshotIdSet, lVar, lVar2);
        C19383o.m32797g(snapshotIdSet, "invalid");
        C19383o.m32797g(aVar, ResponseConstants.PARENT);
        this.f3021l = aVar;
        aVar.mo5931j(this);
    }

    /* renamed from: c */
    public final void mo5930c() {
        if (!this.f3028c) {
            super.mo5930c();
            if (!this.f3022m) {
                this.f3022m = true;
                this.f3021l.mo5932k(this);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: t */
    public final androidx.compose.runtime.snapshots.C1387g mo5935t() {
        /*
            r9 = this;
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l
            boolean r1 = r0.f3016k
            if (r1 != 0) goto L_0x0107
            boolean r1 = r0.f3028c
            if (r1 == 0) goto L_0x000c
            goto L_0x0107
        L_0x000c:
            java.util.Set<androidx.compose.runtime.snapshots.w> r1 = r9.f3012g
            int r2 = r9.f3027b
            if (r1 == 0) goto L_0x001b
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r0.mo5997e()
            java.util.HashMap r0 = androidx.compose.runtime.snapshots.SnapshotKt.m2904c(r0, r9, r3)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.m2905d(r9)     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x005b
            int r4 = r1.size()     // Catch:{ all -> 0x0104 }
            if (r4 != 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            androidx.compose.runtime.snapshots.a r4 = r9.f3021l     // Catch:{ all -> 0x0104 }
            int r4 = r4.mo5996d()     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.a r5 = r9.f3021l     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r5 = r5.mo5997e()     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.g r0 = r9.mo5992v(r4, r0, r5)     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.g$b r4 = androidx.compose.runtime.snapshots.C1387g.C1389b.f3030a     // Catch:{ all -> 0x0104 }
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r0, r4)     // Catch:{ all -> 0x0104 }
            if (r4 != 0) goto L_0x0045
            monitor-exit(r3)
            return r0
        L_0x0045:
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l     // Catch:{ all -> 0x0104 }
            java.util.Set r0 = r0.mo5991u()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x0057
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0104 }
            r0.<init>()     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.a r4 = r9.f3021l     // Catch:{ all -> 0x0104 }
            r4.mo5994x(r0)     // Catch:{ all -> 0x0104 }
        L_0x0057:
            r0.addAll(r1)     // Catch:{ all -> 0x0104 }
            goto L_0x005e
        L_0x005b:
            r9.mo6000a()     // Catch:{ all -> 0x0104 }
        L_0x005e:
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l     // Catch:{ all -> 0x0104 }
            int r0 = r0.mo5996d()     // Catch:{ all -> 0x0104 }
            if (r0 >= r2) goto L_0x006b
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l     // Catch:{ all -> 0x0104 }
            r0.mo5990s()     // Catch:{ all -> 0x0104 }
        L_0x006b:
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r0.mo5997e()     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r1.mo5945c(r2)     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r9.f3013h     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r1.mo5944a(r4)     // Catch:{ all -> 0x0104 }
            r0.mo6003q(r1)     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l     // Catch:{ all -> 0x0104 }
            r0.mo5993w(r2)     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l     // Catch:{ all -> 0x0104 }
            int r1 = r9.f3029d     // Catch:{ all -> 0x0104 }
            r2 = -1
            r9.f3029d = r2     // Catch:{ all -> 0x0104 }
            if (r1 < 0) goto L_0x009f
            int[] r2 = r0.f3014i     // Catch:{ all -> 0x0104 }
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r2, r4)     // Catch:{ all -> 0x0104 }
            int r4 = r2.length     // Catch:{ all -> 0x0104 }
            int r5 = r4 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x0104 }
            r2[r4] = r1     // Catch:{ all -> 0x0104 }
            r0.f3014i = r2     // Catch:{ all -> 0x0104 }
            goto L_0x00a2
        L_0x009f:
            r0.getClass()     // Catch:{ all -> 0x0104 }
        L_0x00a2:
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r9.f3013h     // Catch:{ all -> 0x0104 }
            r0.getClass()     // Catch:{ all -> 0x0104 }
            java.lang.String r2 = "snapshots"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)     // Catch:{ all -> 0x0104 }
            monitor-enter(r3)     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.f3013h     // Catch:{ all -> 0x0101 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r2.mo5947g(r1)     // Catch:{ all -> 0x0101 }
            r0.f3013h = r1     // Catch:{ all -> 0x0101 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0101 }
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l     // Catch:{ all -> 0x0104 }
            int[] r1 = r9.f3014i     // Catch:{ all -> 0x0104 }
            r0.getClass()     // Catch:{ all -> 0x0104 }
            java.lang.String r2 = "handles"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)     // Catch:{ all -> 0x0104 }
            int r2 = r1.length     // Catch:{ all -> 0x0104 }
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x00cd
            r2 = r5
            goto L_0x00ce
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            if (r2 == 0) goto L_0x00d1
            goto L_0x00f0
        L_0x00d1:
            int[] r2 = r0.f3014i     // Catch:{ all -> 0x0104 }
            int r6 = r2.length     // Catch:{ all -> 0x0104 }
            if (r6 != 0) goto L_0x00d8
            r6 = r5
            goto L_0x00d9
        L_0x00d8:
            r6 = r4
        L_0x00d9:
            if (r6 == 0) goto L_0x00de
            r0.f3014i = r1     // Catch:{ all -> 0x0104 }
            goto L_0x00f0
        L_0x00de:
            int r6 = r2.length     // Catch:{ all -> 0x0104 }
            int r7 = r1.length     // Catch:{ all -> 0x0104 }
            int r8 = r6 + r7
            int[] r2 = java.util.Arrays.copyOf(r2, r8)     // Catch:{ all -> 0x0104 }
            java.lang.System.arraycopy(r1, r4, r2, r6, r7)     // Catch:{ all -> 0x0104 }
            java.lang.String r1 = "result"
            kotlin.jvm.internal.C19383o.m32796f(r2, r1)     // Catch:{ all -> 0x0104 }
            r0.f3014i = r2     // Catch:{ all -> 0x0104 }
        L_0x00f0:
            monitor-exit(r3)
            r9.f3016k = r5
            boolean r0 = r9.f3022m
            if (r0 != 0) goto L_0x00fe
            r9.f3022m = r5
            androidx.compose.runtime.snapshots.a r0 = r9.f3021l
            r0.mo5932k(r9)
        L_0x00fe:
            androidx.compose.runtime.snapshots.g$b r0 = androidx.compose.runtime.snapshots.C1387g.C1389b.f3030a
            return r0
        L_0x0101:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            throw r0     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0107:
            androidx.compose.runtime.snapshots.g$a r0 = new androidx.compose.runtime.snapshots.g$a
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1381b.mo5935t():androidx.compose.runtime.snapshots.g");
    }
}
