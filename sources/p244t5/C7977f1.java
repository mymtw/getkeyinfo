package p244t5;

import p267v7.C8212a;

/* renamed from: t5.f1 */
public final class C7977f1 extends C8018s1 {

    /* renamed from: c */
    public static final byte[] f17459c = {-1};

    /* renamed from: d */
    public static final byte[] f17460d = {0};

    /* renamed from: e */
    public static final C7977f1 f17461e = new C7977f1(false);

    /* renamed from: f */
    public static final C7977f1 f17462f = new C7977f1(true);

    /* renamed from: b */
    public final byte[] f17463b;

    public C7977f1(boolean z) {
        this.f17463b = z ? f17459c : f17460d;
    }

    public C7977f1(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if (b == 0) {
                this.f17463b = f17460d;
            } else if ((b & 255) == 255) {
                this.f17463b = f17459c;
            } else {
                this.f17463b = C8212a.m16504k(bArr);
            }
        } else {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(1, this.f17463b);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        return (s1Var instanceof C7977f1) && this.f17463b[0] == ((C7977f1) s1Var).f17463b[0];
    }

    public final int hashCode() {
        return this.f17463b[0];
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return 3;
    }

    public final String toString() {
        return this.f17463b[0] != 0 ? "TRUE" : "FALSE";
    }
}
