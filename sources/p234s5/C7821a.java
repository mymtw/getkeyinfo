package p234s5;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import p081d6.C6662a;
import p081d6.C6665d;
import p081d6.C6666e;
import p152j6.C7146d;
import p152j6.C7148f;
import p152j6.C7153k;
import p161k6.C7199b;
import p161k6.C7202e;
import p223r5.C7748b;
import p223r5.C7750c;
import p223r5.C7753d0;
import p223r5.C7754e;
import p223r5.C7755e0;
import p223r5.C7758g;
import p223r5.C7759g0;
import p223r5.C7761h0;
import p223r5.C7770q;
import p223r5.C7771r;
import p223r5.C7772s;
import p223r5.C7773t;
import p223r5.C7775v;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C7999m1;
import p244t5.C8027v1;
import p244t5.C8037z;
import p267v7.C8212a;
import p285x5.C8322a;
import p285x5.C8326e;
import p293y5.C8395a;

/* renamed from: s5.a */
public final class C7821a {

    /* renamed from: a */
    public static HashSet f17281a;

    static {
        HashSet hashSet = new HashSet(5);
        f17281a = hashSet;
        hashSet.add(C8322a.f18262g);
        f17281a.add(C8322a.f18263h);
        f17281a.add(C8322a.f18264i);
        f17281a.add(C8322a.f18265j);
        f17281a.add(C8322a.f18266k);
    }

    /* renamed from: a */
    public static C6662a m15080a(C7770q qVar, C8027v1 v1Var) {
        C7146d dVar;
        if (qVar instanceof C7771r) {
            C7199b bVar = new C7199b(C6665d.f14699p0, C8037z.f17524b);
            ((C7772s) qVar).getClass();
            return new C6662a(bVar, new C6666e((BigInteger) null, (BigInteger) null, (BigInteger) null, (BigInteger) null, (BigInteger) null, (BigInteger) null, (BigInteger) null, (BigInteger) null), v1Var, (byte[]) null);
        } else if (qVar instanceof C7755e0) {
            C7753d0 d0Var = (C7753d0) ((C7755e0) qVar).f17177b;
            new C7199b(C7153k.f15909Z0, new C7202e(d0Var.f17181c, d0Var.f17180b, d0Var.f17179a));
            new C7999m1((BigInteger) null);
            throw null;
        } else if (qVar instanceof C7750c) {
            C7759g0 g0Var = ((C7750c) qVar).f17170b;
            if (g0Var == null) {
                new C7146d(C8037z.f17524b);
                throw null;
            } else if (g0Var instanceof C7761h0) {
                C7761h0 h0Var = (C7761h0) g0Var;
                if (f17281a.contains(new C8326e((C7959a) null, (C7959a) null, (C7959a) null).f18279b)) {
                    C7959a aVar = C8322a.f18256a;
                    throw null;
                }
                throw null;
            } else {
                if (g0Var instanceof C7748b) {
                    dVar = new C7146d(((C7748b) g0Var).f17174k);
                    g0Var.f17191i.bitLength();
                } else {
                    C7146d dVar2 = new C7146d(new C7148f(g0Var.f17188f, g0Var.f17190h, g0Var.f17191i, g0Var.f17192j, g0Var.mo20320b()));
                    g0Var.f17191i.bitLength();
                    dVar = dVar2;
                }
                new C7199b(C7153k.f15885B0, dVar);
                g0Var.f17190h.mo20121b((BigInteger) null);
                throw null;
            }
        } else if (qVar instanceof C7775v) {
            C7775v vVar = (C7775v) qVar;
            return new C6662a(new C7199b(C8395a.f18404b), new C7964b0(C8212a.m16504k(vVar.f17204b)), v1Var, C8212a.m16504k(vVar.mo20326a().f17205b));
        } else if (qVar instanceof C7773t) {
            C7773t tVar = (C7773t) qVar;
            return new C6662a(new C7199b(C8395a.f18403a), new C7964b0(C8212a.m16504k(tVar.f17202b)), v1Var, C8212a.m16504k(tVar.mo20325a().f17203b));
        } else if (qVar instanceof C7758g) {
            C7758g gVar = (C7758g) qVar;
            return new C6662a(new C7199b(C8395a.f18406d), new C7964b0(C8212a.m16504k(gVar.f17187b)), v1Var, C8212a.m16504k(gVar.mo20319a().f17193b));
        } else if (qVar instanceof C7754e) {
            C7754e eVar = (C7754e) qVar;
            return new C6662a(new C7199b(C8395a.f18405c), new C7964b0(C8212a.m16504k(eVar.f17182b)), v1Var, C8212a.m16504k(eVar.mo20318a().f17183b));
        } else {
            throw new IOException("key parameters not recognized");
        }
    }
}
