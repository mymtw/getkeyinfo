package p244t5;

import p267v7.C8212a;

/* renamed from: t5.k1 */
public class C7993k1 extends C8018s1 {

    /* renamed from: b */
    public byte[] f17482b;

    public C7993k1(byte[] bArr) {
        this.f17482b = bArr;
    }

    /* renamed from: e */
    public void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(24, this.f17482b);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C7993k1)) {
            return false;
        }
        return C8212a.m16500g(this.f17482b, ((C7993k1) s1Var).f17482b);
    }

    public final int hashCode() {
        return C8212a.m16495b(this.f17482b);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public int mo20509n() {
        int length = this.f17482b.length;
        return C7974e1.m15996a(length) + 1 + length;
    }

    /* renamed from: o */
    public final C8018s1 mo20521o() {
        return new C8028w(this.f17482b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r0[r3];
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20548q(int r3) {
        /*
            r2 = this;
            byte[] r0 = r2.f17482b
            int r1 = r0.length
            if (r1 <= r3) goto L_0x0011
            byte r3 = r0[r3]
            r0 = 48
            if (r3 < r0) goto L_0x0011
            r0 = 57
            if (r3 > r0) goto L_0x0011
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C7993k1.mo20548q(int):boolean");
    }

    /* renamed from: s */
    public final boolean mo20549s() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f17482b;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: v */
    public final boolean mo20550v() {
        return mo20548q(12) && mo20548q(13);
    }

    /* renamed from: w */
    public final boolean mo20551w() {
        return mo20548q(10) && mo20548q(11);
    }
}
