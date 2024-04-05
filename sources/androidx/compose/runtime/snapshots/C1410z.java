package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.snapshots.z */
public final class C1410z extends C1379a {

    /* renamed from: l */
    public final C1379a f3064l;

    /* renamed from: m */
    public final C19857l<Object, C19394m> f3065m;

    /* renamed from: n */
    public final C19857l<Object, C19394m> f3066n;

    /* renamed from: o */
    public final boolean f3067o;

    /* renamed from: p */
    public final boolean f3068p;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r5.f3010e;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1410z(androidx.compose.runtime.snapshots.C1379a r5, p753kq.C19857l<java.lang.Object, kotlin.C19394m> r6, p753kq.C19857l<java.lang.Object, kotlin.C19394m> r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.f2982f
            if (r5 == 0) goto L_0x0008
            kq.l<java.lang.Object, kotlin.m> r1 = r5.f3010e
            if (r1 != 0) goto L_0x0012
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r1 = androidx.compose.runtime.snapshots.SnapshotKt.f2995i
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            kq.l<java.lang.Object, kotlin.m> r1 = r1.f3010e
        L_0x0012:
            kq.l r1 = androidx.compose.runtime.snapshots.SnapshotKt.m2911j(r6, r1, r8)
            if (r5 == 0) goto L_0x001c
            kq.l<java.lang.Object, kotlin.m> r2 = r5.f3011f
            if (r2 != 0) goto L_0x0026
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r2 = androidx.compose.runtime.snapshots.SnapshotKt.f2995i
            java.lang.Object r2 = r2.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2
            kq.l<java.lang.Object, kotlin.m> r2 = r2.f3011f
        L_0x0026:
            kq.l r2 = androidx.compose.runtime.snapshots.SnapshotKt.m2903b(r7, r2)
            r3 = 0
            r4.<init>(r3, r0, r1, r2)
            r4.f3064l = r5
            r4.f3065m = r6
            r4.f3066n = r7
            r4.f3067o = r8
            r4.f3068p = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1410z.<init>(androidx.compose.runtime.snapshots.a, kq.l, kq.l, boolean, boolean):void");
    }

    /* renamed from: A */
    public final C1379a mo6101A() {
        C1379a aVar = this.f3064l;
        if (aVar != null) {
            return aVar;
        }
        GlobalSnapshot globalSnapshot = SnapshotKt.f2995i.get();
        C19383o.m32796f(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    /* renamed from: c */
    public final void mo5930c() {
        C1379a aVar;
        this.f3028c = true;
        if (this.f3068p && (aVar = this.f3064l) != null) {
            aVar.mo5930c();
        }
    }

    /* renamed from: d */
    public final int mo5996d() {
        return mo6101A().mo5996d();
    }

    /* renamed from: e */
    public final SnapshotIdSet mo5997e() {
        return mo6101A().mo5997e();
    }

    /* renamed from: g */
    public final boolean mo5940g() {
        return mo6101A().mo5940g();
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
        mo6101A().mo5933l();
    }

    /* renamed from: m */
    public final void mo5942m(C1406w wVar) {
        C19383o.m32797g(wVar, "state");
        mo6101A().mo5942m(wVar);
    }

    /* renamed from: p */
    public final void mo6002p(int i) {
        C1399p.m3000a();
        throw null;
    }

    /* renamed from: q */
    public final void mo6003q(SnapshotIdSet snapshotIdSet) {
        C19383o.m32797g(snapshotIdSet, "value");
        C1399p.m3000a();
        throw null;
    }

    /* renamed from: r */
    public final C1385f mo5934r(C19857l<Object, C19394m> lVar) {
        C19857l<Object, C19394m> j = SnapshotKt.m2911j(lVar, this.f3010e, true);
        return !this.f3067o ? SnapshotKt.m2908g(mo6101A().mo5934r((C19857l<Object, C19394m>) null), j, true) : mo6101A().mo5934r(j);
    }

    /* renamed from: t */
    public final C1387g mo5935t() {
        return mo6101A().mo5935t();
    }

    /* renamed from: u */
    public final Set<C1406w> mo5991u() {
        return mo6101A().mo5991u();
    }

    /* renamed from: x */
    public final void mo5994x(HashSet hashSet) {
        C1399p.m3000a();
        throw null;
    }

    /* renamed from: y */
    public final C1379a mo5936y(C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2) {
        C19857l<Object, C19394m> j = SnapshotKt.m2911j(lVar, this.f3010e, true);
        C19857l b = SnapshotKt.m2903b(lVar2, this.f3011f);
        return !this.f3067o ? new C1410z(mo6101A().mo5936y((C19857l<Object, C19394m>) null, b), j, b, false, true) : mo6101A().mo5936y(j, b);
    }
}
