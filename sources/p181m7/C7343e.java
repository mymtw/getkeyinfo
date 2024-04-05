package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p191n7.C7486a;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: m7.e */
public final class C7343e extends C8005o1 {

    /* renamed from: b */
    public final int f16328b;

    /* renamed from: c */
    public final int f16329c;

    /* renamed from: d */
    public final C7486a f16330d;

    public C7343e(int i, int i2, C7486a aVar) {
        this.f16328b = i;
        this.f16329c = i2;
        this.f16330d = new C7486a(aVar);
    }

    public C7343e(C8021t1 t1Var) {
        this.f16328b = ((C7999m1) t1Var.mo20523q(0)).mo20556s().intValue();
        this.f16329c = ((C7999m1) t1Var.mo20523q(1)).mo20556s().intValue();
        this.f16330d = new C7486a(((C8008p1) t1Var.mo20523q(2)).mo20541v());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1((long) this.f16328b));
        iVar.mo55343b(new C7999m1((long) this.f16329c));
        iVar.mo55343b(new C7964b0(this.f16330d.mo19825a()));
        return new C7976f0(iVar);
    }
}
