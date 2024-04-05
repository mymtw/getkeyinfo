package p275w6;

import java.math.BigInteger;

/* renamed from: w6.f */
public final class C8257f implements C8252a {

    /* renamed from: a */
    public final BigInteger f18092a;

    public C8257f(BigInteger bigInteger) {
        this.f18092a = bigInteger;
    }

    /* renamed from: a */
    public final BigInteger mo20857a() {
        return this.f18092a;
    }

    /* renamed from: b */
    public final int mo20858b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8257f)) {
            return false;
        }
        return this.f18092a.equals(((C8257f) obj).f18092a);
    }

    public final int hashCode() {
        return this.f18092a.hashCode();
    }
}
