package p209p6;

import androidx.compose.runtime.C1353o0;
import androidx.work.C3436p;
import com.google.protobuf.C16910l;
import java.math.BigInteger;
import p245t6.C8039a;

/* renamed from: p6.f */
public final class C7692f extends C3436p {

    /* renamed from: a */
    public final C7676c f17057a;

    /* renamed from: b */
    public final C8039a f17058b;

    public C7692f(C7676c cVar, C8039a aVar) {
        if (cVar == null || cVar.f17026d == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f17057a = cVar;
        this.f17058b = aVar;
    }

    /* renamed from: n */
    public final C7686e mo12959n(C7686e eVar, BigInteger bigInteger) {
        if (this.f17057a.mo20086m(eVar.f17048a)) {
            BigInteger[] a = this.f17058b.mo20597a(bigInteger.mod(eVar.f17048a.f17026d));
            boolean z = false;
            BigInteger bigInteger2 = a[0];
            BigInteger bigInteger3 = a[1];
            C1353o0 a2 = this.f17058b.mo20596a();
            this.f17058b.mo20598b();
            boolean z2 = bigInteger2.signum() < 0;
            if (bigInteger3.signum() < 0) {
                z = true;
            }
            BigInteger abs = bigInteger2.abs();
            BigInteger abs2 = bigInteger3.abs();
            int max = Math.max(2, Math.min(16, C16910l.m28287a(Math.max(abs.bitLength(), abs2.bitLength()))));
            C7676c cVar = eVar.f17048a;
            C7700n c = C16910l.m28289c(eVar, max);
            C7686e i = eVar.mo20130i((C7681d) a2.f2952b);
            cVar.mo20083j(i, "bc_wnaf", new C7701o(c, a2));
            C7700n b = C16910l.m28288b(eVar);
            C7700n b2 = C16910l.m28288b(i);
            return C7674a.m14732a(z2 ? b.f17074b : b.f17073a, z2 ? b.f17073a : b.f17074b, C16910l.m28290d(max, abs), z ? b2.f17074b : b2.f17073a, z ? b2.f17073a : b2.f17074b, C16910l.m28290d(max, abs2));
        }
        throw new IllegalStateException();
    }
}
