package p223r5;

import java.math.BigInteger;

/* renamed from: r5.f0 */
public final class C7757f0 extends C7751c0 {

    /* renamed from: d */
    public static final BigInteger f17184d = BigInteger.valueOf(1);

    /* renamed from: e */
    public static final BigInteger f17185e = BigInteger.valueOf(2);

    /* renamed from: c */
    public BigInteger f17186c;

    public C7757f0(BigInteger bigInteger, C7753d0 d0Var) {
        super(d0Var, false);
        if (d0Var != null) {
            BigInteger bigInteger2 = f17185e;
            if (bigInteger2.compareTo(bigInteger) > 0 || d0Var.f17181c.subtract(bigInteger2).compareTo(bigInteger) < 0 || !f17184d.equals(bigInteger.modPow(d0Var.f17180b, d0Var.f17181c))) {
                throw new IllegalArgumentException("y value does not appear to be in correct group");
            }
        }
        this.f17186c = bigInteger;
    }
}
