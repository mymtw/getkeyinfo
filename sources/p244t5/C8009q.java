package p244t5;

/* renamed from: t5.q */
public final class C8009q extends C8018s1 implements C8036y1 {

    /* renamed from: b */
    public final char[] f17500b;

    public C8009q(char[] cArr) {
        this.f17500b = cArr;
    }

    /* renamed from: b */
    public final String mo20515b() {
        return new String(this.f17500b);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20570h(30);
        r1Var.mo20566b(this.f17500b.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.f17500b;
            if (i != cArr.length) {
                char c = cArr[i];
                r1Var.mo20570h((byte) (c >> 8));
                r1Var.mo20570h((byte) c);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C8009q)) {
            return false;
        }
        char[] cArr = this.f17500b;
        char[] cArr2 = ((C8009q) s1Var).f17500b;
        if (cArr != cArr2) {
            if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
                return false;
            }
            for (int i = 0; i != cArr.length; i++) {
                if (cArr[i] != cArr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        char[] cArr = this.f17500b;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return (this.f17500b.length * 2) + C7974e1.m15996a(this.f17500b.length * 2) + 1;
    }

    public final String toString() {
        return mo20515b();
    }
}
