package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p161k6.C7199b;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: m7.h */
public final class C7346h extends C8005o1 {

    /* renamed from: b */
    public final C7999m1 f16345b;

    /* renamed from: c */
    public final C7199b f16346c;

    public C7346h(C7199b bVar) {
        this.f16345b = new C7999m1(0);
        this.f16346c = bVar;
    }

    public C7346h(C8021t1 t1Var) {
        this.f16345b = C7999m1.m16076q(t1Var.mo20523q(0));
        this.f16346c = C7199b.m13865e(t1Var.mo20523q(1));
    }

    /* renamed from: e */
    public static final C7346h m14113e(C7984h1 h1Var) {
        if (h1Var instanceof C7346h) {
            return (C7346h) h1Var;
        }
        if (h1Var != null) {
            return new C7346h(C8021t1.m16151s(h1Var));
        }
        return null;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f16345b);
        iVar.mo55343b(this.f16346c);
        return new C7976f0(iVar);
    }
}
