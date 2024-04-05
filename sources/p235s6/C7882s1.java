package p235s6;

import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.s1 */
public final class C7882s1 extends C7676c.C7678b {

    /* renamed from: j */
    public static final BigInteger f17341j = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: i */
    public C7888u1 f17342i = new C7888u1(this, (C7681d) null, (C7681d) null, false);

    public C7882s1() {
        super(f17341j);
        this.f17024b = new C7885t1(new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f17025c = new C7885t1(new BigInteger(1, C8260c.m16545a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.f17026d = new BigInteger(1, C8260c.m16545a("0100000000000000000000351EE786A818F3A1A16B"));
        this.f17027e = BigInteger.valueOf(1);
        this.f17028f = 2;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return f17341j.bitLength();
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7885t1(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7888u1(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7888u1(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 2;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7882s1();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17342i;
    }
}
