package p235s6;

import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.y1 */
public final class C7900y1 extends C7676c.C7678b {

    /* renamed from: j */
    public static final BigInteger f17359j = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: i */
    public C7825a2 f17360i = new C7825a2(this, (C7681d) null, (C7681d) null, false);

    public C7900y1() {
        super(f17359j);
        this.f17024b = new C7903z1(new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f17025c = new C7903z1(new BigInteger(1, C8260c.m16545a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f17026d = new BigInteger(1, C8260c.m16545a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f17027e = BigInteger.valueOf(1);
        this.f17028f = 2;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return f17359j.bitLength();
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7903z1(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7825a2(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7825a2(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 2;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7900y1();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17360i;
    }
}
