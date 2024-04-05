package p235s6;

import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.b */
public final class C7826b extends C7676c.C7678b {

    /* renamed from: j */
    public static final BigInteger f17288j = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: i */
    public C7834d f17289i = new C7834d(this, (C7681d) null, (C7681d) null, false);

    public C7826b() {
        super(f17288j);
        this.f17024b = new C7830c(new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f17025c = new C7830c(new BigInteger(1, C8260c.m16545a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.f17026d = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f17027e = BigInteger.valueOf(1);
        this.f17028f = 2;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return f17288j.bitLength();
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7830c(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7834d(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7834d(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 2;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7826b();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17289i;
    }
}
