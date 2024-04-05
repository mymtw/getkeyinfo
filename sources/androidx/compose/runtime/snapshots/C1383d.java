package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.snapshots.d */
public final class C1383d extends C1385f {

    /* renamed from: e */
    public final C19857l<Object, C19394m> f3023e;

    /* renamed from: f */
    public int f3024f = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1383d(int i, SnapshotIdSet snapshotIdSet, C19857l<Object, C19394m> lVar) {
        super(i, snapshotIdSet);
        C19383o.m32797g(snapshotIdSet, "invalid");
        this.f3023e = lVar;
    }

    /* renamed from: c */
    public final void mo5930c() {
        if (!this.f3028c) {
            mo5932k(this);
            super.mo5930c();
        }
    }

    /* renamed from: f */
    public final C19857l<Object, C19394m> mo5939f() {
        return this.f3023e;
    }

    /* renamed from: g */
    public final boolean mo5940g() {
        return true;
    }

    /* renamed from: h */
    public final C19857l<Object, C19394m> mo5941h() {
        return null;
    }

    /* renamed from: j */
    public final void mo5931j(C1385f fVar) {
        C19383o.m32797g(fVar, "snapshot");
        this.f3024f++;
    }

    /* renamed from: k */
    public final void mo5932k(C1385f fVar) {
        C19383o.m32797g(fVar, "snapshot");
        int i = this.f3024f - 1;
        this.f3024f = i;
        if (i == 0) {
            mo6000a();
        }
    }

    /* renamed from: l */
    public final void mo5933l() {
    }

    /* renamed from: m */
    public final void mo5942m(C1406w wVar) {
        C19383o.m32797g(wVar, "state");
        C19857l<SnapshotIdSet, C19394m> lVar = SnapshotKt.f2987a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* renamed from: r */
    public final C1385f mo5934r(C19857l<Object, C19394m> lVar) {
        SnapshotKt.m2905d(this);
        return new NestedReadonlySnapshot(this.f3027b, this.f3026a, lVar, this);
    }
}
