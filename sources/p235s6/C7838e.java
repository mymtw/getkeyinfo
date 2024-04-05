package p235s6;

import java.math.BigInteger;
import p209p6.C7675b;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.e */
public final class C7838e extends C7676c.C7678b {

    /* renamed from: j */
    public static final BigInteger f17301j = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: i */
    public C7844g f17302i = new C7844g(this, (C7681d) null, (C7681d) null, false);

    public C7838e() {
        super(f17301j);
        this.f17024b = new C7841f(C7675b.f17018a);
        this.f17025c = new C7841f(BigInteger.valueOf(7));
        this.f17026d = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f17027e = BigInteger.valueOf(1);
        this.f17028f = 2;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return f17301j.bitLength();
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7841f(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7844g(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7844g(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 2;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7838e();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17302i;
    }
}
