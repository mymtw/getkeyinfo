package p244t5;

import p267v7.C8212a;
import p267v7.C8217e;

/* renamed from: t5.d */
public final class C7969d extends C8018s1 {

    /* renamed from: b */
    public byte[] f17451b;

    public C7969d(byte[] bArr) {
        this.f17451b = bArr;
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20570h(23);
        int length = this.f17451b.length;
        r1Var.mo20566b(length);
        for (int i = 0; i != length; i++) {
            r1Var.mo20570h(this.f17451b[i]);
        }
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C7969d)) {
            return false;
        }
        return C8212a.m16500g(this.f17451b, ((C7969d) s1Var).f17451b);
    }

    public final int hashCode() {
        return C8212a.m16495b(this.f17451b);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        int length = this.f17451b.length;
        return C7974e1.m15996a(length) + 1 + length;
    }

    public final String toString() {
        return C8217e.m16511c(this.f17451b);
    }
}
