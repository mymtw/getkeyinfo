package p245t6;

import androidx.compose.runtime.C1353o0;
import java.math.BigInteger;
import p209p6.C7675b;
import p209p6.C7676c;

/* renamed from: t6.b */
public final class C8040b implements C8039a {

    /* renamed from: a */
    public final C8041c f17529a;

    /* renamed from: b */
    public final C1353o0 f17530b;

    public C8040b(C7676c.C7678b bVar, C8041c cVar) {
        this.f17529a = cVar;
        this.f17530b = new C1353o0((Object) bVar.mo20073b(cVar.f17531a));
    }

    /* renamed from: b */
    public static BigInteger m16212b(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(C7675b.f17019b);
        }
        return z ? shiftRight.negate() : shiftRight;
    }

    /* renamed from: a */
    public final C1353o0 mo20596a() {
        return this.f17530b;
    }

    /* renamed from: a */
    public final BigInteger[] mo20597a(BigInteger bigInteger) {
        C8041c cVar = this.f17529a;
        int i = cVar.f17538h;
        BigInteger b = m16212b(bigInteger, cVar.f17536f, i);
        BigInteger b2 = m16212b(bigInteger, this.f17529a.f17537g, i);
        C8041c cVar2 = this.f17529a;
        return new BigInteger[]{bigInteger.subtract(b.multiply(cVar2.f17532b).add(b2.multiply(cVar2.f17534d))), b.multiply(cVar2.f17533c).add(b2.multiply(cVar2.f17535e)).negate()};
    }

    /* renamed from: b */
    public final void mo20598b() {
    }
}
