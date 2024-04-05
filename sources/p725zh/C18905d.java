package p725zh;

import p513bj.C14049b0;
import p644ph.C18364t;
import p644ph.C18367u;

/* renamed from: zh.d */
public final class C18905d implements C18364t {

    /* renamed from: a */
    public final C18902b f42112a;

    /* renamed from: b */
    public final int f42113b;

    /* renamed from: c */
    public final long f42114c;

    /* renamed from: d */
    public final long f42115d;

    /* renamed from: e */
    public final long f42116e;

    public C18905d(C18902b bVar, int i, long j, long j2) {
        this.f42112a = bVar;
        this.f42113b = i;
        this.f42114c = j;
        long j3 = (j2 - j) / ((long) bVar.f42107d);
        this.f42115d = j3;
        this.f42116e = mo70332a(j3);
    }

    /* renamed from: a */
    public final long mo70332a(long j) {
        return C14049b0.m21625F(j * ((long) this.f42113b), 1000000, (long) this.f42112a.f42106c);
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        long j2 = C14049b0.m21637j((((long) this.f42112a.f42106c) * j) / (((long) this.f42113b) * 1000000), 0, this.f42115d - 1);
        long j3 = (((long) this.f42112a.f42107d) * j2) + this.f42114c;
        long a = mo70332a(j2);
        C18367u uVar = new C18367u(a, j3);
        if (a >= j || j2 == this.f42115d - 1) {
            return new C18364t.C18365a(uVar, uVar);
        }
        long j4 = j2 + 1;
        return new C18364t.C18365a(uVar, new C18367u(mo70332a(j4), (((long) this.f42112a.f42107d) * j4) + this.f42114c));
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return true;
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f42116e;
    }
}
