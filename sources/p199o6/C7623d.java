package p199o6;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import p209p6.C7676c;
import p209p6.C7686e;

/* renamed from: o6.d */
public class C7623d implements AlgorithmParameterSpec {

    /* renamed from: a */
    public C7676c f16910a;

    /* renamed from: b */
    public byte[] f16911b;

    /* renamed from: c */
    public C7686e f16912c;

    /* renamed from: d */
    public BigInteger f16913d;

    /* renamed from: e */
    public BigInteger f16914e;

    public C7623d(C7676c.C7679c cVar, C7686e eVar, BigInteger bigInteger) {
        this.f16910a = cVar;
        this.f16912c = eVar.mo20140s();
        this.f16913d = bigInteger;
        this.f16914e = BigInteger.valueOf(1);
        this.f16911b = null;
    }

    public C7623d(C7676c cVar, C7686e eVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f16910a = cVar;
        this.f16912c = eVar.mo20140s();
        this.f16913d = bigInteger;
        this.f16914e = bigInteger2;
        this.f16911b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7623d)) {
            return false;
        }
        C7623d dVar = (C7623d) obj;
        return this.f16910a.mo20086m(dVar.f16910a) && this.f16912c.mo20124e(dVar.f16912c);
    }

    public final int hashCode() {
        return this.f16910a.hashCode() ^ this.f16912c.hashCode();
    }
}
