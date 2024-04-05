package p209p6;

import java.math.BigInteger;
import p149j3.C7107h;
import p209p6.C7676c;

/* renamed from: p6.k */
public final class C7697k {

    /* renamed from: a */
    public static final BigInteger f17064a;

    /* renamed from: b */
    public static final BigInteger f17065b = C7675b.f17020c.negate();

    /* renamed from: c */
    public static final C7107h[] f17066c;

    /* renamed from: d */
    public static final byte[][] f17067d = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};

    /* renamed from: e */
    public static final C7107h[] f17068e;

    /* renamed from: f */
    public static final byte[][] f17069f = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};

    static {
        BigInteger bigInteger = C7675b.f17019b;
        BigInteger negate = bigInteger.negate();
        f17064a = negate;
        BigInteger negate2 = C7675b.f17021d.negate();
        BigInteger bigInteger2 = C7675b.f17018a;
        f17066c = new C7107h[]{null, new C7107h(2, bigInteger, bigInteger2), null, new C7107h(2, negate2, negate), null, new C7107h(2, negate, negate), null, new C7107h(2, bigInteger, negate), null};
        f17068e = new C7107h[]{null, new C7107h(2, bigInteger, bigInteger2), null, new C7107h(2, negate2, bigInteger), null, new C7107h(2, negate, bigInteger), null, new C7107h(2, bigInteger, bigInteger), null};
    }

    /* renamed from: a */
    public static C7696j m14900a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i) {
        int i2 = ((i + 5) / 2) + 10;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i2) - 2) + b));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i3 = i2 - 10;
        BigInteger shiftRight = add.shiftRight(i3);
        if (add.testBit(i3 - 1)) {
            shiftRight = shiftRight.add(C7675b.f17019b);
        }
        return new C7696j(10, shiftRight);
    }

    /* renamed from: b */
    public static BigInteger[] m14901b(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b == 1 || b == -1) {
            if (z) {
                bigInteger = C7675b.f17020c;
                bigInteger2 = BigInteger.valueOf((long) b);
            } else {
                bigInteger = C7675b.f17018a;
                bigInteger2 = C7675b.f17019b;
            }
            int i2 = 1;
            while (i2 < i) {
                i2++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    /* renamed from: c */
    public static BigInteger[] m14902c(C7676c.C7677a aVar) {
        int i;
        if (aVar.mo20091r()) {
            int a = aVar.mo20072a();
            int intValue = aVar.f17024b.mo20092a().intValue();
            byte b = (byte) (intValue == 0 ? -1 : 1);
            BigInteger bigInteger = aVar.f17027e;
            if (bigInteger != null) {
                if (bigInteger.equals(C7675b.f17020c)) {
                    i = 1;
                } else if (bigInteger.equals(C7675b.f17022e)) {
                    i = 2;
                }
                BigInteger[] b2 = m14901b(b, (a + 3) - intValue, false);
                if (b == 1) {
                    b2[0] = b2[0].negate();
                    b2[1] = b2[1].negate();
                }
                BigInteger bigInteger2 = C7675b.f17019b;
                return new BigInteger[]{bigInteger2.add(b2[1]).shiftRight(i), bigInteger2.add(b2[0]).shiftRight(i).negate()};
            }
            throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }
}
