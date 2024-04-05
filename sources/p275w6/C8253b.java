package p275w6;

import java.math.BigInteger;

/* renamed from: w6.b */
public abstract class C8253b {

    /* renamed from: a */
    public static final C8257f f18087a = new C8257f(BigInteger.valueOf(2));

    /* renamed from: b */
    public static final C8257f f18088b = new C8257f(BigInteger.valueOf(3));

    /* renamed from: a */
    public static C8255d m16538a(int[] iArr) {
        if (iArr[0] == 0) {
            int i = 1;
            while (i < iArr.length) {
                if (iArr[i] > iArr[i - 1]) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
                }
            }
            return new C8255d(f18087a, new C8254c(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }
}
