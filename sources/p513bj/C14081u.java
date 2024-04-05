package p513bj;

import p594jh.C17912g;
import p594jh.C17986y0;

/* renamed from: bj.u */
public final class C14081u implements C14064l {

    /* renamed from: b */
    public final C14046a f31005b;

    /* renamed from: c */
    public boolean f31006c;

    /* renamed from: d */
    public long f31007d;

    /* renamed from: e */
    public long f31008e;

    /* renamed from: f */
    public C17986y0 f31009f = C17986y0.f39325d;

    public C14081u(C14082v vVar) {
        this.f31005b = vVar;
    }

    /* renamed from: a */
    public final C17986y0 mo46888a() {
        return this.f31009f;
    }

    /* renamed from: b */
    public final void mo46889b(C17986y0 y0Var) {
        if (this.f31006c) {
            mo46948d(mo46890c());
        }
        this.f31009f = y0Var;
    }

    /* renamed from: c */
    public final long mo46890c() {
        long j = this.f31007d;
        if (!this.f31006c) {
            return j;
        }
        long elapsedRealtime = this.f31005b.elapsedRealtime() - this.f31008e;
        C17986y0 y0Var = this.f31009f;
        return j + (y0Var.f39326a == 1.0f ? C17912g.m30087a(elapsedRealtime) : elapsedRealtime * ((long) y0Var.f39328c));
    }

    /* renamed from: d */
    public final void mo46948d(long j) {
        this.f31007d = j;
        if (this.f31006c) {
            this.f31008e = this.f31005b.elapsedRealtime();
        }
    }
}
