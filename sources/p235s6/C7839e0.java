package p235s6;

import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.e0 */
public final class C7839e0 extends C7676c.C7677a {

    /* renamed from: j */
    public C7842f0 f17303j = new C7842f0(this, (C7681d) null, (C7681d) null, false);

    public C7839e0() {
        super(163, 3, 6, 7);
        this.f17024b = new C7827b0(new BigInteger(1, C8260c.m16545a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f17025c = new C7827b0(new BigInteger(1, C8260c.m16545a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.f17026d = new BigInteger(1, C8260c.m16545a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.f17027e = BigInteger.valueOf(2);
        this.f17028f = 6;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return 163;
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7827b0(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7842f0(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7842f0(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 6;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7839e0();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17303j;
    }

    /* renamed from: r */
    public final boolean mo20091r() {
        return false;
    }
}
