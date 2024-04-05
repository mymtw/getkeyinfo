package p116g6;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import p244t5.C7966c;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C7992k0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: g6.b */
public final class C6884b extends C8005o1 {

    /* renamed from: b */
    public BigInteger f15236b = BigInteger.valueOf(0);

    /* renamed from: c */
    public C6883a f15237c;

    /* renamed from: d */
    public C7999m1 f15238d;

    /* renamed from: e */
    public C8008p1 f15239e;

    /* renamed from: f */
    public C7999m1 f15240f;

    /* renamed from: g */
    public C8008p1 f15241g;

    public C6884b(C8021t1 t1Var) {
        int i = 0;
        if (t1Var.mo20523q(0) instanceof C7966c) {
            C7966c cVar = (C7966c) t1Var.mo20523q(0);
            if (!cVar.f17446c || cVar.f17445b != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.f15236b = C7999m1.m16076q(cVar).mo20556s();
            i = 1;
        }
        C7984h1 q = t1Var.mo20523q(i);
        this.f15237c = q instanceof C6883a ? (C6883a) q : q != null ? new C6883a(C8021t1.m16151s(q)) : null;
        int i2 = i + 1;
        this.f15238d = C7999m1.m16076q(t1Var.mo20523q(i2));
        int i3 = i2 + 1;
        this.f15239e = C8008p1.m16103q(t1Var.mo20523q(i3));
        int i4 = i3 + 1;
        this.f15240f = C7999m1.m16076q(t1Var.mo20523q(i4));
        this.f15241g = C8008p1.m16103q(t1Var.mo20523q(i4 + 1));
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        if (this.f15236b.compareTo(BigInteger.valueOf(0)) != 0) {
            iVar.mo55343b(new C7992k0(true, 0, new C7999m1(this.f15236b)));
        }
        iVar.mo55343b(this.f15237c);
        iVar.mo55343b(this.f15238d);
        iVar.mo55343b(this.f15239e);
        iVar.mo55343b(this.f15240f);
        iVar.mo55343b(this.f15241g);
        return new C7976f0(iVar);
    }
}
