package p235s6;

import androidx.work.C3436p;
import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p209p6.C7704r;
import p276w7.C8260c;

/* renamed from: s6.c0 */
public final class C7831c0 extends C7676c.C7677a {

    /* renamed from: j */
    public C7835d0 f17295j = new C7835d0(this, (C7681d) null, (C7681d) null, false);

    public C7831c0() {
        super(163, 3, 6, 7);
        C7827b0 b0Var = new C7827b0(BigInteger.valueOf(1));
        this.f17024b = b0Var;
        this.f17025c = b0Var;
        this.f17026d = new BigInteger(1, C8260c.m16545a("04000000000000000000020108A2E0CC0D99F8A5EF"));
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
        return new C7835d0(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7835d0(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 6;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7831c0();
    }

    /* renamed from: o */
    public final C3436p mo20088o() {
        return new C7704r();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17295j;
    }

    /* renamed from: r */
    public final boolean mo20091r() {
        return true;
    }
}
