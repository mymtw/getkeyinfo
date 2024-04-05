package p223r5;

import java.math.BigInteger;

/* renamed from: r5.m */
public final class C7766m {

    /* renamed from: a */
    public BigInteger f17195a;

    /* renamed from: b */
    public BigInteger f17196b;

    /* renamed from: c */
    public BigInteger f17197c;

    public C7766m(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f17195a = bigInteger;
        this.f17196b = bigInteger2;
        this.f17197c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7766m)) {
            return false;
        }
        C7766m mVar = (C7766m) obj;
        return mVar.f17195a.equals(this.f17195a) && mVar.f17196b.equals(this.f17196b) && mVar.f17197c.equals(this.f17197c);
    }

    public final int hashCode() {
        return (this.f17195a.hashCode() ^ this.f17196b.hashCode()) ^ this.f17197c.hashCode();
    }
}
