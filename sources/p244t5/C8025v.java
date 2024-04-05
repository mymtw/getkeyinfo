package p244t5;

import p267v7.C8212a;
import p267v7.C8217e;

/* renamed from: t5.v */
public final class C8025v extends C8018s1 implements C8036y1 {

    /* renamed from: b */
    public final byte[] f17509b;

    public C8025v(byte[] bArr) {
        this.f17509b = bArr;
    }

    /* renamed from: b */
    public final String mo20515b() {
        return C8217e.m16511c(this.f17509b);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(27, this.f17509b);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C8025v)) {
            return false;
        }
        return C8212a.m16500g(this.f17509b, ((C8025v) s1Var).f17509b);
    }

    public final int hashCode() {
        return C8212a.m16495b(this.f17509b);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17509b.length) + 1 + this.f17509b.length;
    }

    public final String toString() {
        return mo20515b();
    }
}
