package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p161k6.C7199b;
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

/* renamed from: m7.b */
public final class C7340b extends C8005o1 {

    /* renamed from: b */
    public int f16311b;

    /* renamed from: c */
    public int f16312c;

    /* renamed from: d */
    public byte[] f16313d;

    /* renamed from: e */
    public byte[] f16314e;

    /* renamed from: f */
    public byte[] f16315f;

    /* renamed from: g */
    public C7199b f16316g;

    public C7340b(int i, int i2, C7487b bVar, C7490e eVar, C7489d dVar, C7199b bVar2) {
        this.f16311b = i;
        this.f16312c = i2;
        int i3 = bVar.f16693b;
        this.f16313d = new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >>> 24)};
        this.f16314e = eVar.mo19842e();
        this.f16315f = dVar.mo19835a();
        this.f16316g = bVar2;
    }

    public C7340b(C8021t1 t1Var) {
        this.f16311b = ((C7999m1) t1Var.mo20523q(0)).mo20556s().intValue();
        this.f16312c = ((C7999m1) t1Var.mo20523q(1)).mo20556s().intValue();
        this.f16313d = ((C8008p1) t1Var.mo20523q(2)).mo20541v();
        this.f16314e = ((C8008p1) t1Var.mo20523q(3)).mo20541v();
        this.f16315f = ((C8008p1) t1Var.mo20523q(4)).mo20541v();
        this.f16316g = C7199b.m13865e(t1Var.mo20523q(5));
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1((long) this.f16311b));
        iVar.mo55343b(new C7999m1((long) this.f16312c));
        iVar.mo55343b(new C7964b0(this.f16313d));
        iVar.mo55343b(new C7964b0(this.f16314e));
        iVar.mo55343b(new C7964b0(this.f16315f));
        iVar.mo55343b(this.f16316g);
        return new C7976f0(iVar);
    }
}
