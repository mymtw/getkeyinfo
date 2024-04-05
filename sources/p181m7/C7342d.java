package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p191n7.C7486a;
import p191n7.C7487b;
import p191n7.C7489d;
import p191n7.C7490e;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: m7.d */
public final class C7342d extends C8005o1 {

    /* renamed from: b */
    public int f16321b;

    /* renamed from: c */
    public int f16322c;

    /* renamed from: d */
    public byte[] f16323d;

    /* renamed from: e */
    public byte[] f16324e;

    /* renamed from: f */
    public byte[] f16325f;

    /* renamed from: g */
    public byte[] f16326g;

    /* renamed from: h */
    public byte[] f16327h;

    public C7342d(int i, int i2, C7487b bVar, C7490e eVar, C7489d dVar, C7489d dVar2, C7486a aVar) {
        this.f16321b = i;
        this.f16322c = i2;
        int i3 = bVar.f16693b;
        this.f16323d = new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >>> 24)};
        this.f16324e = eVar.mo19842e();
        this.f16325f = aVar.mo19825a();
        this.f16326g = dVar.mo19835a();
        this.f16327h = dVar2.mo19835a();
    }

    public C7342d(C8021t1 t1Var) {
        this.f16321b = ((C7999m1) t1Var.mo20523q(0)).mo20556s().intValue();
        this.f16322c = ((C7999m1) t1Var.mo20523q(1)).mo20556s().intValue();
        this.f16323d = ((C8008p1) t1Var.mo20523q(2)).mo20541v();
        this.f16324e = ((C8008p1) t1Var.mo20523q(3)).mo20541v();
        this.f16326g = ((C8008p1) t1Var.mo20523q(4)).mo20541v();
        this.f16327h = ((C8008p1) t1Var.mo20523q(5)).mo20541v();
        this.f16325f = ((C8008p1) t1Var.mo20523q(6)).mo20541v();
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1((long) this.f16321b));
        iVar.mo55343b(new C7999m1((long) this.f16322c));
        iVar.mo55343b(new C7964b0(this.f16323d));
        iVar.mo55343b(new C7964b0(this.f16324e));
        iVar.mo55343b(new C7964b0(this.f16326g));
        iVar.mo55343b(new C7964b0(this.f16327h));
        iVar.mo55343b(new C7964b0(this.f16325f));
        return new C7976f0(iVar);
    }
}
