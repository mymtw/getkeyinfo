package androidx.compose.runtime.snapshots;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class NestedReadonlySnapshot extends C1385f {

    /* renamed from: e */
    public final C1385f f2980e;

    /* renamed from: f */
    public final C19857l<Object, C19394m> f2981f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot(int i, SnapshotIdSet snapshotIdSet, C19857l<Object, C19394m> lVar, C1385f fVar) {
        super(i, snapshotIdSet);
        C19383o.m32797g(snapshotIdSet, "invalid");
        C19383o.m32797g(fVar, ResponseConstants.PARENT);
        this.f2980e = fVar;
        fVar.mo5931j(this);
        if (lVar != null) {
            C19857l<Object, C19394m> f = fVar.mo5939f();
            if (f != null) {
                lVar = new NestedReadonlySnapshot$readObserver$1$1$1(lVar, f);
            }
        } else {
            lVar = fVar.mo5939f();
        }
        this.f2981f = lVar;
    }

    /* renamed from: c */
    public final void mo5930c() {
        if (!this.f3028c) {
            if (this.f3027b != this.f2980e.mo5996d()) {
                mo6000a();
            }
            this.f2980e.mo5932k(this);
            super.mo5930c();
        }
    }

    /* renamed from: f */
    public final C19857l<Object, C19394m> mo5939f() {
        return this.f2981f;
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
    }

    /* renamed from: m */
    public final void mo5942m(C1406w wVar) {
        C19383o.m32797g(wVar, "state");
        C19857l<SnapshotIdSet, C19394m> lVar = SnapshotKt.f2987a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* renamed from: r */
    public final C1385f mo5934r(C19857l lVar) {
        return new NestedReadonlySnapshot(this.f3027b, this.f3026a, lVar, this.f2980e);
    }
}
