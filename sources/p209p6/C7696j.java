package p209p6;

import java.math.BigInteger;

/* renamed from: p6.j */
public final class C7696j {

    /* renamed from: a */
    public final BigInteger f17062a;

    /* renamed from: b */
    public final int f17063b;

    public C7696j(int i, BigInteger bigInteger) {
        if (i >= 0) {
            this.f17062a = bigInteger;
            this.f17063b = i;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    /* renamed from: a */
    public final C7696j mo20162a(C7696j jVar) {
        if (this.f17063b == jVar.f17063b) {
            return new C7696j(this.f17063b, this.f17062a.add(jVar.f17062a));
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    /* renamed from: b */
    public final int mo20163b(BigInteger bigInteger) {
        return this.f17062a.compareTo(bigInteger.shiftLeft(this.f17063b));
    }

    /* renamed from: c */
    public final C7696j mo20164c(C7696j jVar) {
        return mo20162a(new C7696j(jVar.f17063b, jVar.f17062a.negate()));
    }

    /* renamed from: d */
    public final BigInteger mo20165d() {
        BigInteger bigInteger = C7675b.f17019b;
        C7696j jVar = new C7696j(1, bigInteger);
        int i = this.f17063b;
        if (i >= 0) {
            if (i != 1) {
                jVar = new C7696j(i, bigInteger.shiftLeft(i - 1));
            }
            C7696j a = mo20162a(jVar);
            return a.f17062a.shiftRight(a.f17063b);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7696j)) {
            return false;
        }
        C7696j jVar = (C7696j) obj;
        return this.f17062a.equals(jVar.f17062a) && this.f17063b == jVar.f17063b;
    }

    public final int hashCode() {
        return this.f17062a.hashCode() ^ this.f17063b;
    }

    public final String toString() {
        int i = this.f17063b;
        if (i == 0) {
            return this.f17062a.toString();
        }
        BigInteger shiftRight = this.f17062a.shiftRight(i);
        BigInteger subtract = this.f17062a.subtract(shiftRight.shiftLeft(this.f17063b));
        if (this.f17062a.signum() == -1) {
            subtract = C7675b.f17019b.shiftLeft(this.f17063b).subtract(subtract);
        }
        if (shiftRight.signum() == -1 && !subtract.equals(C7675b.f17018a)) {
            shiftRight = shiftRight.add(C7675b.f17019b);
        }
        String bigInteger = shiftRight.toString();
        char[] cArr = new char[this.f17063b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i2 = this.f17063b - length;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = '0';
        }
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i2 + i4] = bigInteger2.charAt(i4);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
