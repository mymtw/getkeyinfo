package p275w6;

import java.math.BigInteger;

/* renamed from: w6.d */
public final class C8255d implements C8256e {

    /* renamed from: a */
    public final C8252a f18090a;

    /* renamed from: b */
    public final C8254c f18091b;

    public C8255d(C8257f fVar, C8254c cVar) {
        this.f18090a = fVar;
        this.f18091b = cVar;
    }

    /* renamed from: a */
    public final BigInteger mo20857a() {
        return this.f18090a.mo20857a();
    }

    /* renamed from: b */
    public final int mo20858b() {
        int b = this.f18090a.mo20858b();
        int[] iArr = this.f18091b.f18089a;
        return iArr[iArr.length - 1] * b;
    }

    /* renamed from: c */
    public final C8254c mo20861c() {
        return this.f18091b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8255d)) {
            return false;
        }
        C8255d dVar = (C8255d) obj;
        return this.f18090a.equals(dVar.f18090a) && this.f18091b.equals(dVar.f18091b);
    }

    public final int hashCode() {
        return this.f18090a.hashCode() ^ Integer.rotateLeft(this.f18091b.hashCode(), 16);
    }
}
