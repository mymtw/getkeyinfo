package p223r5;

import java.math.BigInteger;

/* renamed from: r5.a0 */
public final class C7747a0 extends C7777x {

    /* renamed from: d */
    public static final BigInteger f17171d = BigInteger.valueOf(1);

    /* renamed from: e */
    public static final BigInteger f17172e = BigInteger.valueOf(2);

    /* renamed from: c */
    public BigInteger f17173c;

    public C7747a0(BigInteger bigInteger, C7778y yVar) {
        super(false, yVar);
        if (bigInteger != null) {
            BigInteger bigInteger2 = f17172e;
            if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(yVar.f17208b.subtract(bigInteger2)) > 0) {
                throw new IllegalArgumentException("invalid DH public key");
            }
            BigInteger bigInteger3 = yVar.f17209c;
            if (bigInteger3 == null || f17171d.equals(bigInteger.modPow(bigInteger3, yVar.f17208b))) {
                this.f17173c = bigInteger;
                return;
            }
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
        throw new NullPointerException("y value cannot be null");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7747a0) && ((C7747a0) obj).f17173c.equals(this.f17173c) && super.equals(obj);
    }

    public final int hashCode() {
        return this.f17173c.hashCode() ^ super.hashCode();
    }
}
