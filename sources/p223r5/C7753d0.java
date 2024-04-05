package p223r5;

import java.math.BigInteger;

/* renamed from: r5.d0 */
public final class C7753d0 {

    /* renamed from: a */
    public BigInteger f17179a;

    /* renamed from: b */
    public BigInteger f17180b;

    /* renamed from: c */
    public BigInteger f17181c;

    public C7753d0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f17179a = bigInteger3;
        this.f17181c = bigInteger;
        this.f17180b = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7753d0)) {
            return false;
        }
        C7753d0 d0Var = (C7753d0) obj;
        return d0Var.f17181c.equals(this.f17181c) && d0Var.f17180b.equals(this.f17180b) && d0Var.f17179a.equals(this.f17179a);
    }

    public final int hashCode() {
        return (this.f17181c.hashCode() ^ this.f17180b.hashCode()) ^ this.f17179a.hashCode();
    }
}
