package p199o6;

import java.security.spec.AlgorithmParameterSpec;
import p180m6.C7337a;
import p244t5.C7959a;
import p285x5.C8324c;
import p285x5.C8325d;
import p285x5.C8326e;

/* renamed from: o6.k */
public final class C7630k implements C7337a, AlgorithmParameterSpec {

    /* renamed from: a */
    public C7632m f16917a;

    /* renamed from: b */
    public String f16918b;

    /* renamed from: c */
    public String f16919c;

    /* renamed from: d */
    public String f16920d;

    public C7630k() {
        throw null;
    }

    public C7630k(String str, String str2, String str3) {
        C8325d dVar;
        try {
            dVar = (C8325d) C8324c.f18271b.get(new C7959a(str));
        } catch (IllegalArgumentException unused) {
            C7959a aVar = (C7959a) C8324c.f18270a.get(str);
            if (aVar != null) {
                str = aVar.f17434b;
                dVar = (C8325d) C8324c.f18271b.get(aVar);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            this.f16917a = new C7632m(dVar.f18276c.mo20558v(), dVar.f18277d.mo20558v(), dVar.f18278e.mo20558v());
            this.f16918b = str;
            this.f16919c = str2;
            this.f16920d = str3;
            return;
        }
        throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
    }

    /* renamed from: a */
    public static C7630k m14650a(C8326e eVar) {
        C7959a aVar = eVar.f18281d;
        return aVar != null ? new C7630k(eVar.f18279b.f17434b, eVar.f18280c.f17434b, aVar.f17434b) : new C7630k(eVar.f18279b.f17434b, eVar.f18280c.f17434b, (String) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7630k)) {
            return false;
        }
        C7630k kVar = (C7630k) obj;
        if (!this.f16917a.equals(kVar.f16917a) || !this.f16919c.equals(kVar.f16919c)) {
            return false;
        }
        String str = this.f16920d;
        String str2 = kVar.f16920d;
        return str == str2 || (str != null && str.equals(str2));
    }

    public final int hashCode() {
        int hashCode = this.f16917a.hashCode() ^ this.f16919c.hashCode();
        String str = this.f16920d;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }
}
