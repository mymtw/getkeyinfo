package p244t5;

import p267v7.C8212a;
import p267v7.C8217e;

/* renamed from: t5.o0 */
public final class C8004o0 extends C8018s1 implements C8036y1 {

    /* renamed from: b */
    public final byte[] f17495b;

    public C8004o0(byte[] bArr) {
        this.f17495b = bArr;
    }

    /* renamed from: b */
    public final String mo20515b() {
        return C8217e.m16511c(this.f17495b);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(26, this.f17495b);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C8004o0)) {
            return false;
        }
        return C8212a.m16500g(this.f17495b, ((C8004o0) s1Var).f17495b);
    }

    public final int hashCode() {
        return C8212a.m16495b(this.f17495b);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17495b.length) + 1 + this.f17495b.length;
    }

    public final String toString() {
        return mo20515b();
    }
}
