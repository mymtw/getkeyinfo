package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p161k6.C7199b;
import p191n7.C7486a;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: m7.c */
public final class C7341c extends C8005o1 {

    /* renamed from: b */
    public final int f16317b;

    /* renamed from: c */
    public final int f16318c;

    /* renamed from: d */
    public final C7486a f16319d;

    /* renamed from: e */
    public final C7199b f16320e;

    public C7341c(int i, int i2, C7486a aVar, C7199b bVar) {
        this.f16317b = i;
        this.f16318c = i2;
        this.f16319d = new C7486a(aVar.mo19825a());
        this.f16320e = bVar;
    }

    public C7341c(C8021t1 t1Var) {
        this.f16317b = ((C7999m1) t1Var.mo20523q(0)).mo20556s().intValue();
        this.f16318c = ((C7999m1) t1Var.mo20523q(1)).mo20556s().intValue();
        this.f16319d = new C7486a(((C8008p1) t1Var.mo20523q(2)).mo20541v());
        this.f16320e = C7199b.m13865e(t1Var.mo20523q(3));
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1((long) this.f16317b));
        iVar.mo55343b(new C7999m1((long) this.f16318c));
        iVar.mo55343b(new C7964b0(this.f16319d.mo19825a()));
        iVar.mo55343b(this.f16320e);
        return new C7976f0(iVar);
    }
}
