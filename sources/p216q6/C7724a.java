package p216q6;

import androidx.compose.foundation.layout.C0761x;
import androidx.work.C3436p;
import java.math.BigInteger;
import p209p6.C7676c;
import p209p6.C7681d;
import p209p6.C7686e;
import p276w7.C8260c;

/* renamed from: q6.a */
public final class C7724a extends C7676c.C7678b {

    /* renamed from: j */
    public static final BigInteger f17134j = C3436p.m8228B(C0761x.f1561e);

    /* renamed from: i */
    public C7726c f17135i = new C7726c(this, (C7681d) null, (C7681d) null, false);

    public C7724a() {
        super(f17134j);
        this.f17024b = new C7725b(new BigInteger(1, C8260c.m16545a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.f17025c = new C7725b(new BigInteger(1, C8260c.m16545a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.f17026d = new BigInteger(1, C8260c.m16545a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f17027e = BigInteger.valueOf(8);
        this.f17028f = 4;
    }

    /* renamed from: a */
    public final int mo20072a() {
        return f17134j.bitLength();
    }

    /* renamed from: b */
    public final C7681d mo20073b(BigInteger bigInteger) {
        return new C7725b(bigInteger);
    }

    /* renamed from: f */
    public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
        return new C7726c(this, dVar, dVar2, z);
    }

    /* renamed from: g */
    public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
        return new C7726c(this, dVar, dVar2, dVarArr, z);
    }

    /* renamed from: l */
    public final boolean mo20085l(int i) {
        return i == 4;
    }

    /* renamed from: n */
    public final C7676c mo20087n() {
        return new C7724a();
    }

    /* renamed from: p */
    public final C7686e mo20089p() {
        return this.f17135i;
    }
}
