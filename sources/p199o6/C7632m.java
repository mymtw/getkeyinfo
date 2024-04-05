package p199o6;

import java.math.BigInteger;

/* renamed from: o6.m */
public final class C7632m {

    /* renamed from: a */
    public BigInteger f16921a;

    /* renamed from: b */
    public BigInteger f16922b;

    /* renamed from: c */
    public BigInteger f16923c;

    public C7632m(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f16921a = bigInteger;
        this.f16922b = bigInteger2;
        this.f16923c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7632m)) {
            return false;
        }
        C7632m mVar = (C7632m) obj;
        return this.f16923c.equals(mVar.f16923c) && this.f16921a.equals(mVar.f16921a) && this.f16922b.equals(mVar.f16922b);
    }

    public final int hashCode() {
        return (this.f16923c.hashCode() ^ this.f16921a.hashCode()) ^ this.f16922b.hashCode();
    }
}
