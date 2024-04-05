package p009a8;

import com.cardinalcommerce.dependencies.internal.minidev.json.p062b.C6232i;
import java.io.IOException;
import p039c8.C4447c;
import p039c8.C4449e;
import p305z7.C8465g;

/* renamed from: a8.a */
public final class C0042a {

    /* renamed from: a */
    public C0046d f101a;

    static {
        System.getProperty("JSON_SMART_SIMPLE");
    }

    /* renamed from: a */
    public final Object mo71a(String str) {
        if (this.f101a == null) {
            this.f101a = new C0046d(640);
        }
        C0046d dVar = this.f101a;
        dVar.getClass();
        C4447c cVar = C8465g.f18490c.f9741a;
        C4449e eVar = cVar.f9743a;
        dVar.f127x = str;
        dVar.f126w = str.length();
        dVar.f112f = -1;
        try {
            dVar.mo81j();
            Object g = dVar.mo78g(cVar);
            if (dVar.f118l) {
                if (!dVar.f119m) {
                    dVar.mo84m();
                }
                if (dVar.f107a != 26) {
                    throw new C6232i(dVar.f112f - 1, 1, Character.valueOf(dVar.f107a));
                }
            }
            dVar.f111e = null;
            dVar.f110d = null;
            return g;
        } catch (IOException e) {
            throw new C6232i(dVar.f112f, e);
        }
    }
}
