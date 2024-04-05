package p235s6;

import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: s6.a */
public final class C7822a extends C7676c.C7678b {

    /* renamed from: j */
    public static final BigInteger f17282j = new BigInteger(1, C8260c.m16545a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: i */
    public C7864m1 f17283i = new C7864m1(this, (C7681d) null, (C7681d) null, false);

    public C7822a() {
        super(f17282j);
        this.f17024b = new C7881s0(new BigInteger(1, C8260c.m16545a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f17025c = new C7881s0(new BigInteger(1, C8260c.m16545a("E87579C11079F43DD824993C2CEE5ED3")));
        this.f17026d = new BigInteger(1, C8260c.m16545a("FFFFFFFE0000000075A30D1B9038A115"));
        this.f17027e = BigInteger.valueOf(1);
        this.f17028f = 2;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return f17282j.bitLength();
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7881s0(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7864m1(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7864m1(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 2;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7822a();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17283i;
    }
}
