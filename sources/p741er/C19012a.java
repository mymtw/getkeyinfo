package p741er;

import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import okhttp3.C19994o;
import p756lr.C19897i;

/* renamed from: er.a */
public final class C19012a {

    /* renamed from: a */
    public long f42362a = ((long) PrimitiveArrayBuilder.MAX_CHUNK_SIZE);

    /* renamed from: b */
    public final C19897i f42363b;

    public C19012a(C19897i iVar) {
        this.f42363b = iVar;
    }

    /* renamed from: a */
    public final C19994o mo70462a() {
        C19994o.C19995a aVar = new C19994o.C19995a();
        while (true) {
            String C = this.f42363b.mo72710C(this.f42362a);
            this.f42362a -= (long) C.length();
            if (C.length() == 0) {
                return aVar.mo72961d();
            }
            aVar.mo72959b(C);
        }
    }
}
