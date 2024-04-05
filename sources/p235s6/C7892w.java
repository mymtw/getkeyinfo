package p235s6;

import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.w */
public final class C7892w extends C7676c.C7677a {

    /* renamed from: j */
    public C7895x f17351j = new C7895x(this, (C7681d) null, (C7681d) null, false);

    public C7892w() {
        super(131, 2, 3, 8);
        this.f17024b = new C7889v(new BigInteger(1, C8260c.m16545a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f17025c = new C7889v(new BigInteger(1, C8260c.m16545a("0217C05610884B63B9C6C7291678F9D341")));
        this.f17026d = new BigInteger(1, C8260c.m16545a("0400000000000000023123953A9464B54D"));
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
        return new C7895x(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7895x(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 6;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7892w();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17351j;
    }

    /* renamed from: r */
    public final boolean mo20091r() {
        return false;
    }
}
