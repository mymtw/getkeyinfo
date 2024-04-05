package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.snapshots.a0 */
public final class C1380a0 extends C1385f {

    /* renamed from: e */
    public final C1385f f3017e;

    /* renamed from: f */
    public final boolean f3018f = false;

    /* renamed from: g */
    public final boolean f3019g;

    /* renamed from: h */
    public final C19857l<Object, C19394m> f3020h;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r3 = r3.mo5939f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1380a0(androidx.compose.runtime.snapshots.C1385f r3, p753kq.C19857l r4, boolean r5) {
        /*
            r2 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.f2982f
            r1 = 0
            r2.<init>(r1, r0)
            r2.f3017e = r3
            r2.f3018f = r1
            r2.f3019g = r5
            if (r3 == 0) goto L_0x0014
            kq.l r3 = r3.mo5939f()
            if (r3 != 0) goto L_0x001e
        L_0x0014:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r3 = androidx.compose.runtime.snapshots.SnapshotKt.f2995i
            java.lang.Object r3 = r3.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r3 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r3
            kq.l<java.lang.Object, kotlin.m> r3 = r3.f3010e
        L_0x001e:
            kq.l r3 = androidx.compose.runtime.snapshots.SnapshotKt.m2911j(r4, r3, r1)
            r2.f3020h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1380a0.<init>(androidx.compose.runtime.snapshots.f, kq.l, boolean):void");
    }

    /* renamed from: c */
    public final void mo5930c() {
        C1385f fVar;
        this.f3028c = true;
        if (this.f3019g && (fVar = this.f3017e) != null) {
            fVar.mo5930c();
        }
    }

    /* renamed from: d */
    public final int mo5996d() {
        return mo5998s().mo5996d();
    }

    /* renamed from: e */
    public final SnapshotIdSet mo5997e() {
        return mo5998s().mo5997e();
    }

    /* renamed from: f */
    public final C19857l<Object, C19394m> mo5939f() {
        return this.f3020h;
    }

    /* renamed from: g */
    public final boolean mo5940g() {
        return mo5998s().mo5940g();
    }

    /* renamed from: h */
    public final C19857l<Object, C19394m> mo5941h() {
        return null;
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
        mo5998s().mo5933l();
    }

    /* renamed from: m */
    public final void mo5942m(C1406w wVar) {
        C19383o.m32797g(wVar, "state");
        mo5998s().mo5942m(wVar);
    }

    /* renamed from: r */
    public final C1385f mo5934r(C19857l<Object, C19394m> lVar) {
        C19857l<Object, C19394m> j = SnapshotKt.m2911j(lVar, this.f3020h, true);
        return !this.f3018f ? SnapshotKt.m2908g(mo5998s().mo5934r((C19857l<Object, C19394m>) null), j, true) : mo5998s().mo5934r(j);
    }

    /* renamed from: s */
    public final C1385f mo5998s() {
        C1385f fVar = this.f3017e;
        if (fVar != null) {
            return fVar;
        }
        GlobalSnapshot globalSnapshot = SnapshotKt.f2995i.get();
        C19383o.m32796f(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }
}
