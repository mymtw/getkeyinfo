package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p161k6.C7199b;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: m7.j */
public final class C7348j extends C8005o1 {

    /* renamed from: b */
    public final C7999m1 f16350b;

    /* renamed from: c */
    public final int f16351c;

    /* renamed from: d */
    public final int f16352d;

    /* renamed from: e */
    public final C7199b f16353e;

    public C7348j(int i, int i2, C7199b bVar) {
        this.f16350b = new C7999m1(0);
        this.f16351c = i;
        this.f16352d = i2;
        this.f16353e = bVar;
    }

    public C7348j(C8021t1 t1Var) {
        this.f16350b = C7999m1.m16076q(t1Var.mo20523q(0));
        this.f16351c = C7999m1.m16076q(t1Var.mo20523q(1)).mo20556s().intValue();
        this.f16352d = C7999m1.m16076q(t1Var.mo20523q(2)).mo20556s().intValue();
        this.f16353e = C7199b.m13865e(t1Var.mo20523q(3));
    }

    /* renamed from: e */
    public static C7348j m14117e(C7984h1 h1Var) {
        if (h1Var instanceof C7348j) {
            return (C7348j) h1Var;
        }
        if (h1Var != null) {
            return new C7348j(C8021t1.m16151s(h1Var));
        }
        return null;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f16350b);
        iVar.mo55343b(new C7999m1((long) this.f16351c));
        iVar.mo55343b(new C7999m1((long) this.f16352d));
        iVar.mo55343b(this.f16353e);
        return new C7976f0(iVar);
    }
}
