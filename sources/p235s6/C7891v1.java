package p235s6;

import java.math.BigInteger;
import p209p6.C7675b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.v1 */
public final class C7891v1 extends C7676c.C7678b {

    /* renamed from: j */
    public static final BigInteger f17349j = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: i */
    public C7897x1 f17350i = new C7897x1(this, (C7681d) null, (C7681d) null, false);

    public C7891v1() {
        super(f17349j);
        this.f17024b = new C7894w1(C7675b.f17018a);
        this.f17025c = new C7894w1(BigInteger.valueOf(3));
        this.f17026d = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.f17027e = BigInteger.valueOf(1);
        this.f17028f = 2;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return f17349j.bitLength();
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7894w1(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7897x1(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7897x1(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 2;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7891v1();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17350i;
    }
}
