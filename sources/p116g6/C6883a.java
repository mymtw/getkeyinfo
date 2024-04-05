package p116g6;

import com.google.android.play.core.appupdate.C15567i;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: g6.a */
public final class C6883a extends C8005o1 {

    /* renamed from: b */
    public int f15232b;

    /* renamed from: c */
    public int f15233c;

    /* renamed from: d */
    public int f15234d;

    /* renamed from: e */
    public int f15235e;

    public C6883a(C8021t1 t1Var) {
        this.f15232b = C7999m1.m16076q(t1Var.mo20523q(0)).mo20558v().intValue();
        if (t1Var.mo20523q(1) instanceof C7999m1) {
            this.f15233c = ((C7999m1) t1Var.mo20523q(1)).mo20558v().intValue();
        } else if (t1Var.mo20523q(1) instanceof C8021t1) {
            C8021t1 s = C8021t1.m16151s(t1Var.mo20523q(1));
            this.f15233c = C7999m1.m16076q(s.mo20523q(0)).mo20558v().intValue();
            this.f15234d = C7999m1.m16076q(s.mo20523q(1)).mo20558v().intValue();
            this.f15235e = C7999m1.m16076q(s.mo20523q(2)).mo20558v().intValue();
        } else {
            throw new IllegalArgumentException("object parse error");
        }
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C7984h1 h1Var;
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1((long) this.f15232b));
        if (this.f15234d == 0) {
            h1Var = new C7999m1((long) this.f15233c);
        } else {
            C15567i iVar2 = new C15567i(2);
            iVar2.mo55343b(new C7999m1((long) this.f15233c));
            iVar2.mo55343b(new C7999m1((long) this.f15234d));
            iVar2.mo55343b(new C7999m1((long) this.f15235e));
            h1Var = new C7976f0(iVar2);
        }
        iVar.mo55343b(h1Var);
        return new C7976f0(iVar);
    }
}
