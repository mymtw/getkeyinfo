package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p267v7.C8212a;

/* renamed from: m7.n */
public final class C7352n extends C8005o1 {

    /* renamed from: b */
    public final byte[] f16368b;

    /* renamed from: c */
    public final byte[] f16369c;

    public C7352n(C8021t1 t1Var) {
        if (C7999m1.m16076q(t1Var.mo20523q(0)).mo20556s().equals(BigInteger.valueOf(0))) {
            this.f16368b = C8212a.m16504k(C8008p1.m16103q(t1Var.mo20523q(1)).mo20541v());
            this.f16369c = C8212a.m16504k(C8008p1.m16103q(t1Var.mo20523q(2)).mo20541v());
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public C7352n(byte[] bArr, byte[] bArr2) {
        this.f16368b = C8212a.m16504k(bArr);
        this.f16369c = C8212a.m16504k(bArr2);
    }

    /* renamed from: g */
    public final byte[] mo19619g() {
        return C8212a.m16504k(this.f16368b);
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1(0));
        iVar.mo55343b(new C7964b0(this.f16368b));
        iVar.mo55343b(new C7964b0(this.f16369c));
        return new C7976f0(iVar);
    }
}
