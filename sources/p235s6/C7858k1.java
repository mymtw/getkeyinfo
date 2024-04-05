package p235s6;

import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.k1 */
public final class C7858k1 extends C7676c.C7677a {

    /* renamed from: k */
    public static final C7849h1 f17318k;

    /* renamed from: l */
    public static final C7849h1 f17319l;

    /* renamed from: j */
    public C7861l1 f17320j = new C7861l1(this, (C7681d) null, (C7681d) null, false);

    static {
        C7849h1 h1Var = new C7849h1(new BigInteger(1, C8260c.m16545a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f17318k = h1Var;
        f17319l = (C7849h1) h1Var.mo20106o();
    }

    public C7858k1() {
        super(571, 2, 5, 10);
        this.f17024b = new C7849h1(BigInteger.valueOf(1));
        this.f17025c = f17318k;
        this.f17026d = new BigInteger(1, C8260c.m16545a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.f17027e = BigInteger.valueOf(2);
        this.f17028f = 6;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return 571;
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7849h1(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7861l1(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7861l1(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 6;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7858k1();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17320j;
    }

    /* renamed from: r */
    public final boolean mo20091r() {
        return false;
    }
}
