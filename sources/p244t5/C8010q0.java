package p244t5;

/* renamed from: t5.q0 */
public final class C8010q0 extends C8038z0 {
    public C8010q0(int i, byte[] bArr) {
        super(i, bArr);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        byte[] bArr = this.f17527b;
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) this.f17528c;
        System.arraycopy(bArr, 0, bArr2, 1, length - 1);
        r1Var.mo20569f(3, bArr2);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17527b.length + 1) + 1 + this.f17527b.length + 1;
    }
}
