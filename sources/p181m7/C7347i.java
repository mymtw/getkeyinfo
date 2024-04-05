package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p161k6.C7199b;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: m7.i */
public final class C7347i extends C8005o1 {

    /* renamed from: b */
    public final C7999m1 f16347b;

    /* renamed from: c */
    public final int f16348c;

    /* renamed from: d */
    public final C7199b f16349d;

    public C7347i(int i, C7199b bVar) {
        this.f16347b = new C7999m1(0);
        this.f16348c = i;
        this.f16349d = bVar;
    }

    public C7347i(C8021t1 t1Var) {
        this.f16347b = C7999m1.m16076q(t1Var.mo20523q(0));
        this.f16348c = C7999m1.m16076q(t1Var.mo20523q(1)).mo20556s().intValue();
        this.f16349d = C7199b.m13865e(t1Var.mo20523q(2));
    }

    /* renamed from: e */
    public static C7347i m14115e(C7984h1 h1Var) {
        if (h1Var instanceof C7347i) {
            return (C7347i) h1Var;
        }
        if (h1Var != null) {
            return new C7347i(C8021t1.m16151s(h1Var));
        }
        return null;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f16347b);
        iVar.mo55343b(new C7999m1((long) this.f16348c));
        iVar.mo55343b(this.f16349d);
        return new C7976f0(iVar);
    }
}
