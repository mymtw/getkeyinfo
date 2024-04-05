package p693vh;

import p218q8.C7728a;
import p513bj.C14049b0;
import p644ph.C18364t;
import p644ph.C18367u;

/* renamed from: vh.b */
public final class C18637b implements C18640e {

    /* renamed from: a */
    public final long f41154a;

    /* renamed from: b */
    public final C7728a f41155b;

    /* renamed from: c */
    public final C7728a f41156c;

    /* renamed from: d */
    public long f41157d;

    public C18637b(long j, long j2, long j3) {
        this.f41157d = j;
        this.f41154a = j3;
        C7728a aVar = new C7728a();
        this.f41155b = aVar;
        C7728a aVar2 = new C7728a();
        this.f41156c = aVar2;
        aVar.mo20204a(0);
        aVar2.mo20204a(j2);
    }

    /* renamed from: a */
    public final boolean mo70150a(long j) {
        C7728a aVar = this.f41155b;
        return j - aVar.mo20205b(aVar.f17139a - 1) < 100000;
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        int d = C14049b0.m21631d(this.f41155b, j);
        long b = this.f41155b.mo20205b(d);
        C18367u uVar = new C18367u(b, this.f41156c.mo20205b(d));
        if (b != j) {
            C7728a aVar = this.f41155b;
            if (d != aVar.f17139a - 1) {
                int i = d + 1;
                return new C18364t.C18365a(uVar, new C18367u(aVar.mo20205b(i), this.f41156c.mo20205b(i)));
            }
        }
        return new C18364t.C18365a(uVar, uVar);
    }

    /* renamed from: e */
    public final long mo70148e() {
        return this.f41154a;
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return true;
    }

    /* renamed from: h */
    public final long mo70149h(long j) {
        return this.f41155b.mo20205b(C14049b0.m21631d(this.f41156c, j));
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f41157d;
    }
}
