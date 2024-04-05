package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C1339j1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.snapshots.f */
public abstract class C1385f {

    /* renamed from: a */
    public SnapshotIdSet f3026a;

    /* renamed from: b */
    public int f3027b;

    /* renamed from: c */
    public boolean f3028c;

    /* renamed from: d */
    public int f3029d;

    /* renamed from: androidx.compose.runtime.snapshots.f$a */
    public static final class C1386a {
        /* renamed from: a */
        public static Object m2992a(C19846a aVar, C19857l lVar) {
            C1385f fVar;
            C1385f i;
            C19383o.m32797g(aVar, "block");
            if (lVar == null) {
                return aVar.invoke();
            }
            C1385f fVar2 = (C1385f) SnapshotKt.f2988b.mo5886c();
            if (fVar2 == null || (fVar2 instanceof C1379a)) {
                fVar = new C1410z(fVar2 instanceof C1379a ? (C1379a) fVar2 : null, lVar, (C19857l<Object, C19394m>) null, true, false);
            } else if (lVar == null) {
                return aVar.invoke();
            } else {
                fVar = fVar2.mo5934r(lVar);
            }
            try {
                i = fVar.mo6001i();
                Object invoke = aVar.invoke();
                C1385f.m2974o(i);
                fVar.mo5930c();
                return invoke;
            } catch (Throwable th) {
                fVar.mo5930c();
                throw th;
            }
        }
    }

    public C1385f(int i, SnapshotIdSet snapshotIdSet) {
        int i2;
        int i3;
        int i4;
        this.f3026a = snapshotIdSet;
        this.f3027b = i;
        if (i != 0) {
            SnapshotIdSet e = mo5997e();
            C19857l<SnapshotIdSet, C19394m> lVar = SnapshotKt.f2987a;
            C19383o.m32797g(e, "invalid");
            int[] iArr = e.f2986e;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = e.f2984c;
                if (j != 0) {
                    i4 = e.f2985d;
                    i3 = C18263b.m30860p(j);
                } else {
                    long j2 = e.f2983b;
                    if (j2 != 0) {
                        i4 = e.f2985d + 64;
                        i3 = C18263b.m30860p(j2);
                    }
                }
                i = i4 + i3;
            }
            synchronized (SnapshotKt.f2989c) {
                i2 = SnapshotKt.f2992f.mo6004a(i);
            }
        } else {
            i2 = -1;
        }
        this.f3029d = i2;
    }

    /* renamed from: o */
    public static void m2974o(C1385f fVar) {
        SnapshotKt.f2988b.mo5887d(fVar);
    }

    /* renamed from: a */
    public final void mo6000a() {
        synchronized (SnapshotKt.f2989c) {
            mo5988b();
            mo5989n();
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: b */
    public void mo5988b() {
        SnapshotKt.f2990d = SnapshotKt.f2990d.mo5945c(mo5996d());
    }

    /* renamed from: c */
    public void mo5930c() {
        this.f3028c = true;
        synchronized (SnapshotKt.f2989c) {
            int i = this.f3029d;
            if (i >= 0) {
                SnapshotKt.m2920s(i);
                this.f3029d = -1;
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: d */
    public int mo5996d() {
        return this.f3027b;
    }

    /* renamed from: e */
    public SnapshotIdSet mo5997e() {
        return this.f3026a;
    }

    /* renamed from: f */
    public abstract C19857l<Object, C19394m> mo5939f();

    /* renamed from: g */
    public abstract boolean mo5940g();

    /* renamed from: h */
    public abstract C19857l<Object, C19394m> mo5941h();

    /* renamed from: i */
    public final C1385f mo6001i() {
        C1339j1 j1Var = SnapshotKt.f2988b;
        C1385f fVar = (C1385f) j1Var.mo5886c();
        j1Var.mo5887d(this);
        return fVar;
    }

    /* renamed from: j */
    public abstract void mo5931j(C1385f fVar);

    /* renamed from: k */
    public abstract void mo5932k(C1385f fVar);

    /* renamed from: l */
    public abstract void mo5933l();

    /* renamed from: m */
    public abstract void mo5942m(C1406w wVar);

    /* renamed from: n */
    public void mo5989n() {
        int i = this.f3029d;
        if (i >= 0) {
            SnapshotKt.m2920s(i);
            this.f3029d = -1;
        }
    }

    /* renamed from: p */
    public void mo6002p(int i) {
        this.f3027b = i;
    }

    /* renamed from: q */
    public void mo6003q(SnapshotIdSet snapshotIdSet) {
        C19383o.m32797g(snapshotIdSet, "<set-?>");
        this.f3026a = snapshotIdSet;
    }

    /* renamed from: r */
    public abstract C1385f mo5934r(C19857l<Object, C19394m> lVar);
}
