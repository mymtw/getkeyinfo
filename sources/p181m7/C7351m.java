package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import p244t5.C7964b0;
import p244t5.C7966c;
import p244t5.C7976f0;
import p244t5.C7992k0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p267v7.C8212a;

/* renamed from: m7.m */
public final class C7351m extends C8005o1 {

    /* renamed from: b */
    public final int f16362b;

    /* renamed from: c */
    public final byte[] f16363c;

    /* renamed from: d */
    public final byte[] f16364d;

    /* renamed from: e */
    public final byte[] f16365e;

    /* renamed from: f */
    public final byte[] f16366f;

    /* renamed from: g */
    public final byte[] f16367g;

    public C7351m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f16362b = i;
        this.f16363c = C8212a.m16504k(bArr);
        this.f16364d = C8212a.m16504k(bArr2);
        this.f16365e = C8212a.m16504k(bArr3);
        this.f16366f = C8212a.m16504k(bArr4);
        this.f16367g = C8212a.m16504k(bArr5);
    }

    public C7351m(C8021t1 t1Var) {
        if (!C7999m1.m16076q(t1Var.mo20523q(0)).mo20556s().equals(BigInteger.valueOf(0))) {
            throw new IllegalArgumentException("unknown version of sequence");
        } else if (t1Var.mo20525y() == 2 || t1Var.mo20525y() == 3) {
            C8021t1 s = C8021t1.m16151s(t1Var.mo20523q(1));
            this.f16362b = C7999m1.m16076q(s.mo20523q(0)).mo20556s().intValue();
            this.f16363c = C8212a.m16504k(C8008p1.m16103q(s.mo20523q(1)).mo20541v());
            this.f16364d = C8212a.m16504k(C8008p1.m16103q(s.mo20523q(2)).mo20541v());
            this.f16365e = C8212a.m16504k(C8008p1.m16103q(s.mo20523q(3)).mo20541v());
            this.f16366f = C8212a.m16504k(C8008p1.m16103q(s.mo20523q(4)).mo20541v());
            if (t1Var.mo20525y() == 3) {
                this.f16367g = C8212a.m16504k(C8008p1.m16104s(C7966c.m15971q(t1Var.mo20523q(2)), true).mo20541v());
            } else {
                this.f16367g = null;
            }
        } else {
            throw new IllegalArgumentException("key sequence wrong size");
        }
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1(0));
        C15567i iVar2 = new C15567i(2);
        iVar2.mo55343b(new C7999m1((long) this.f16362b));
        iVar2.mo55343b(new C7964b0(this.f16363c));
        iVar2.mo55343b(new C7964b0(this.f16364d));
        iVar2.mo55343b(new C7964b0(this.f16365e));
        iVar2.mo55343b(new C7964b0(this.f16366f));
        iVar.mo55343b(new C7976f0(iVar2));
        iVar.mo55343b(new C7992k0(true, 0, new C7964b0(this.f16367g)));
        return new C7976f0(iVar);
    }
}
