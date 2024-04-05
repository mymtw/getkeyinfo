package p235s6;

import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.y */
public final class C7898y extends C7676c.C7677a {

    /* renamed from: j */
    public C7901z f17357j = new C7901z(this, (C7681d) null, (C7681d) null, false);

    public C7898y() {
        super(131, 2, 3, 8);
        this.f17024b = new C7889v(new BigInteger(1, C8260c.m16545a("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.f17025c = new C7889v(new BigInteger(1, C8260c.m16545a("04B8266A46C55657AC734CE38F018F2192")));
        this.f17026d = new BigInteger(1, C8260c.m16545a("0400000000000000016954A233049BA98F"));
        this.f17027e = BigInteger.valueOf(2);
        this.f17028f = 6;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return 131;
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7889v(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7901z(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7901z(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 6;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7898y();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17357j;
    }

    /* renamed from: r */
    public final boolean mo20091r() {
        return false;
    }
}
