package p223r5;

import java.math.BigInteger;

/* renamed from: r5.y */
public final class C7778y {

    /* renamed from: a */
    public BigInteger f17207a;

    /* renamed from: b */
    public BigInteger f17208b;

    /* renamed from: c */
    public BigInteger f17209c;

    /* renamed from: d */
    public BigInteger f17210d;

    /* renamed from: e */
    public int f17211e;

    /* renamed from: f */
    public int f17212f;

    /* renamed from: g */
    public C7749b0 f17213g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7778y(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, (BigInteger) null, (i != 0 && i < 160) ? i : 160, i, (BigInteger) null, (C7749b0) null);
    }

    public C7778y(BigInteger bigInteger, BigInteger bigInteger2) {
        this(0, bigInteger, bigInteger2);
    }

    public C7778y(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, C7749b0 b0Var) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            } else if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i <= bigInteger.bitLength()) {
            this.f17207a = bigInteger2;
            this.f17208b = bigInteger;
            this.f17209c = bigInteger3;
            this.f17211e = i;
            this.f17212f = i2;
            this.f17210d = bigInteger4;
            this.f17213g = b0Var;
            return;
        }
        throw new IllegalArgumentException("unsafe p value so small specific l required");
    }

    public C7778y(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, C7749b0 b0Var) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, b0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7778y)) {
            return false;
        }
        C7778y yVar = (C7778y) obj;
        BigInteger bigInteger = this.f17209c;
        if (bigInteger != null) {
            if (!bigInteger.equals(yVar.f17209c)) {
                return false;
            }
        } else if (yVar.f17209c != null) {
            return false;
        }
        return yVar.f17208b.equals(this.f17208b) && yVar.f17207a.equals(this.f17207a);
    }

    public final int hashCode() {
        int hashCode = this.f17208b.hashCode() ^ this.f17207a.hashCode();
        BigInteger bigInteger = this.f17209c;
        return hashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
