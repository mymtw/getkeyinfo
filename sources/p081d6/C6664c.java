package p081d6;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import java.util.Enumeration;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: d6.c */
public final class C6664c extends C8005o1 {

    /* renamed from: b */
    public C7999m1 f14696b;

    /* renamed from: c */
    public C7999m1 f14697c;

    /* renamed from: d */
    public C7999m1 f14698d;

    public C6664c(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f14696b = new C7999m1(bigInteger);
        this.f14697c = new C7999m1(bigInteger2);
        this.f14698d = i != 0 ? new C7999m1((long) i) : null;
    }

    public C6664c(C8021t1 t1Var) {
        Enumeration w = t1Var.mo20524w();
        this.f14696b = C7999m1.m16076q(w.nextElement());
        this.f14697c = C7999m1.m16076q(w.nextElement());
        this.f14698d = w.hasMoreElements() ? (C7999m1) w.nextElement() : null;
    }

    /* renamed from: g */
    public final BigInteger mo18833g() {
        return this.f14696b.mo20558v();
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f14696b);
        iVar.mo55343b(this.f14697c);
        if (mo18835m() != null) {
            iVar.mo55343b(this.f14698d);
        }
        return new C7976f0(iVar);
    }

    /* renamed from: l */
    public final BigInteger mo18834l() {
        return this.f14697c.mo20558v();
    }

    /* renamed from: m */
    public final BigInteger mo18835m() {
        C7999m1 m1Var = this.f14698d;
        if (m1Var == null) {
            return null;
        }
        return m1Var.mo20558v();
    }
}
