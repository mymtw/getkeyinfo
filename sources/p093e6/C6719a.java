package p093e6;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import java.util.Enumeration;
import p152j6.C7146d;
import p244t5.C7964b0;
import p244t5.C7966c;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7992k0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8012r;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p267v7.C8214b;

/* renamed from: e6.a */
public final class C6719a extends C8005o1 {

    /* renamed from: b */
    public C8021t1 f14813b;

    public C6719a() {
        throw null;
    }

    public C6719a(int i, BigInteger bigInteger, C8012r rVar, C7146d dVar) {
        byte[] b = C8214b.m16508b((i + 7) / 8, bigInteger);
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1(1));
        iVar.mo55343b(new C7964b0(b));
        iVar.mo55343b(new C7992k0(true, 0, dVar));
        if (rVar != null) {
            iVar.mo55343b(new C7992k0(true, 1, rVar));
        }
        this.f14813b = new C7976f0(iVar);
    }

    public C6719a(C8021t1 t1Var) {
        this.f14813b = t1Var;
    }

    /* renamed from: e */
    public static C6719a m13110e(C8018s1 s1Var) {
        if (s1Var instanceof C6719a) {
            return (C6719a) s1Var;
        }
        if (s1Var != null) {
            return new C6719a(C8021t1.m16151s(s1Var));
        }
        return null;
    }

    /* renamed from: g */
    public final BigInteger mo18903g() {
        return new BigInteger(1, ((C8008p1) this.f14813b.mo20523q(1)).mo20541v());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        return this.f14813b;
    }

    /* renamed from: l */
    public final C8012r mo18904l() {
        C8018s1 s1Var;
        Enumeration w = this.f14813b.mo20524w();
        while (true) {
            if (!w.hasMoreElements()) {
                s1Var = null;
                break;
            }
            C7984h1 h1Var = (C7984h1) w.nextElement();
            if (h1Var instanceof C7966c) {
                C7966c cVar = (C7966c) h1Var;
                if (cVar.f17445b == 1) {
                    s1Var = cVar.mo20528s();
                    s1Var.getClass();
                    break;
                }
            }
        }
        return (C8012r) s1Var;
    }
}
