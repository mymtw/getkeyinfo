package p223r5;

import java.math.BigInteger;

/* renamed from: r5.z */
public final class C7779z extends C7777x {

    /* renamed from: c */
    public BigInteger f17214c;

    public C7779z(BigInteger bigInteger, C7778y yVar) {
        super(true, yVar);
        this.f17214c = bigInteger;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7779z) && ((C7779z) obj).f17214c.equals(this.f17214c) && super.equals(obj);
    }

    public final int hashCode() {
        return this.f17214c.hashCode() ^ super.hashCode();
    }
}
