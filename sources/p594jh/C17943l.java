package p594jh;

import p513bj.C14064l;
import p513bj.C14081u;
import p513bj.C14082v;

/* renamed from: jh.l */
public final class C17943l implements C14064l {

    /* renamed from: b */
    public final C14081u f39124b;

    /* renamed from: c */
    public final C17944a f39125c;

    /* renamed from: d */
    public C17904d1 f39126d;

    /* renamed from: e */
    public C14064l f39127e;

    /* renamed from: f */
    public boolean f39128f = true;

    /* renamed from: g */
    public boolean f39129g;

    /* renamed from: jh.l$a */
    public interface C17944a {
    }

    public C17943l(C17944a aVar, C14082v vVar) {
        this.f39125c = aVar;
        this.f39124b = new C14081u(vVar);
    }

    /* renamed from: a */
    public final C17986y0 mo46888a() {
        C14064l lVar = this.f39127e;
        return lVar != null ? lVar.mo46888a() : this.f39124b.f31009f;
    }

    /* renamed from: b */
    public final void mo46889b(C17986y0 y0Var) {
        C14064l lVar = this.f39127e;
        if (lVar != null) {
            lVar.mo46889b(y0Var);
            y0Var = this.f39127e.mo46888a();
        }
        this.f39124b.mo46889b(y0Var);
    }

    /* renamed from: c */
    public final long mo46890c() {
        if (this.f39128f) {
            return this.f39124b.mo46890c();
        }
        C14064l lVar = this.f39127e;
        lVar.getClass();
        return lVar.mo46890c();
    }
}
