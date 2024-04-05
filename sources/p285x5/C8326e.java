package p285x5;

import com.google.android.play.core.appupdate.C15567i;
import p244t5.C7959a;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: x5.e */
public final class C8326e extends C8005o1 {

    /* renamed from: b */
    public C7959a f18279b;

    /* renamed from: c */
    public C7959a f18280c;

    /* renamed from: d */
    public C7959a f18281d;

    public C8326e(C7959a aVar, C7959a aVar2) {
        this.f18279b = aVar;
        this.f18280c = aVar2;
        this.f18281d = null;
    }

    public C8326e(C7959a aVar, C7959a aVar2, C7959a aVar3) {
        this.f18279b = aVar;
        this.f18280c = aVar2;
        this.f18281d = aVar3;
    }

    public C8326e(C8021t1 t1Var) {
        this.f18279b = (C7959a) t1Var.mo20523q(0);
        this.f18280c = (C7959a) t1Var.mo20523q(1);
        if (t1Var.mo20525y() > 2) {
            this.f18281d = (C7959a) t1Var.mo20523q(2);
        }
    }

    /* renamed from: e */
    public static C8326e m16621e(C7984h1 h1Var) {
        if (h1Var instanceof C8326e) {
            return (C8326e) h1Var;
        }
        if (h1Var != null) {
            return new C8326e(C8021t1.m16151s(h1Var));
        }
        return null;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f18279b);
        iVar.mo55343b(this.f18280c);
        C7959a aVar = this.f18281d;
        if (aVar != null) {
            iVar.mo55343b(aVar);
        }
        return new C7976f0(iVar);
    }
}
