package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class GlobalSnapshot extends C1379a {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GlobalSnapshot(int r6, androidx.compose.runtime.snapshots.SnapshotIdSet r7) {
        /*
            r5 = this;
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c
            monitor-enter(r0)
            java.util.ArrayList r1 = androidx.compose.runtime.snapshots.SnapshotKt.f2994h     // Catch:{ all -> 0x0033 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0033 }
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L_0x0013
            java.util.ArrayList r1 = kotlin.collections.C19327t.m32661q1(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0014
        L_0x0013:
            r1 = r4
        L_0x0014:
            if (r1 == 0) goto L_0x002d
            int r2 = r1.size()     // Catch:{ all -> 0x0033 }
            if (r2 != r3) goto L_0x0022
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0033 }
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            kq.l r2 = (p753kq.C19857l) r2     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x002e
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r2 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch:{ all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x002e
        L_0x002d:
            r2 = r4
        L_0x002e:
            monitor-exit(r0)
            r5.<init>(r6, r7, r4, r2)
            return
        L_0x0033:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    /* renamed from: c */
    public final void mo5930c() {
        synchronized (SnapshotKt.f2989c) {
            int i = this.f3029d;
            if (i >= 0) {
                SnapshotKt.m2920s(i);
                this.f3029d = -1;
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: j */
    public final void mo5931j(C1385f fVar) {
        C19383o.m32797g(fVar, "snapshot");
        C1399p.m3000a();
        throw null;
    }

    /* renamed from: k */
    public final void mo5932k(C1385f fVar) {
        C19383o.m32797g(fVar, "snapshot");
        C1399p.m3000a();
        throw null;
    }

    /* renamed from: l */
    public final void mo5933l() {
        SnapshotKt.m2902a();
    }

    /* renamed from: r */
    public final C1385f mo5934r(C19857l<Object, C19394m> lVar) {
        GlobalSnapshot$takeNestedSnapshot$1 globalSnapshot$takeNestedSnapshot$1 = new GlobalSnapshot$takeNestedSnapshot$1(lVar);
        C19857l<SnapshotIdSet, C19394m> lVar2 = SnapshotKt.f2987a;
        return (C1385f) SnapshotKt.m2907f(new SnapshotKt$takeNewSnapshot$1(globalSnapshot$takeNestedSnapshot$1));
    }

    /* renamed from: t */
    public final C1387g mo5935t() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    /* renamed from: y */
    public final C1379a mo5936y(C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2) {
        GlobalSnapshot$takeNestedMutableSnapshot$1 globalSnapshot$takeNestedMutableSnapshot$1 = new GlobalSnapshot$takeNestedMutableSnapshot$1(lVar, lVar2);
        C19857l<SnapshotIdSet, C19394m> lVar3 = SnapshotKt.f2987a;
        return (C1379a) ((C1385f) SnapshotKt.m2907f(new SnapshotKt$takeNewSnapshot$1(globalSnapshot$takeNestedMutableSnapshot$1)));
    }
}
