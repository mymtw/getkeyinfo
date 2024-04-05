package p223r5;

import java.math.BigInteger;
import p209p6.C7675b;
import p209p6.C7676c;
import p209p6.C7686e;
import p267v7.C8212a;

/* renamed from: r5.g0 */
public class C7759g0 implements C7675b {

    /* renamed from: f */
    public C7676c f17188f;

    /* renamed from: g */
    public byte[] f17189g;

    /* renamed from: h */
    public C7686e f17190h;

    /* renamed from: i */
    public BigInteger f17191i;

    /* renamed from: j */
    public BigInteger f17192j;

    public C7759g0(C7676c.C7679c cVar, C7686e eVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(cVar, eVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public C7759g0(C7676c cVar, C7686e eVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("curve");
        } else if (bigInteger != null) {
            this.f17188f = cVar;
            this.f17190h = m15005a(cVar, eVar);
            this.f17191i = bigInteger;
            this.f17192j = bigInteger2;
            this.f17189g = C8212a.m16504k(bArr);
        } else {
            throw new NullPointerException("n");
        }
    }

    /* renamed from: a */
    public static C7686e m15005a(C7676c cVar, C7686e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Point has null value");
        } else if (cVar.mo20086m(eVar.f17048a)) {
            C7686e s = cVar.mo20080h(eVar).mo20140s();
            if (s.mo20141t()) {
                throw new IllegalArgumentException("Point at infinity");
            } else if (s.mo20126f(false, true)) {
                return s;
            } else {
                throw new IllegalArgumentException("Point not on curve");
            }
        } else {
            throw new IllegalArgumentException("Point must be on the same curve");
        }
    }

    /* renamed from: b */
    public final byte[] mo20320b() {
        return C8212a.m16504k(this.f17189g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7759g0)) {
            return false;
        }
        C7759g0 g0Var = (C7759g0) obj;
        return this.f17188f.mo20086m(g0Var.f17188f) && this.f17190h.mo20124e(g0Var.f17190h) && this.f17191i.equals(g0Var.f17191i) && this.f17192j.equals(g0Var.f17192j);
    }

    public final int hashCode() {
        return (((((this.f17188f.hashCode() * 37) ^ this.f17190h.hashCode()) * 37) ^ this.f17191i.hashCode()) * 37) ^ this.f17192j.hashCode();
    }
}
