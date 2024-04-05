package p152j6;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import p244t5.C7959a;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: j6.j */
public final class C7152j extends C8005o1 implements C7153k {

    /* renamed from: b */
    public C7959a f15882b;

    /* renamed from: c */
    public C8018s1 f15883c;

    public C7152j(int i, int i2, int i3, int i4) {
        this.f15882b = C7153k.f15912y0;
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1((long) i));
        if (i3 == 0) {
            if (i4 == 0) {
                iVar.mo55343b(C7153k.f15913z0);
                iVar.mo55343b(new C7999m1((long) i2));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i3 <= i2 || i4 <= i3) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            iVar.mo55343b(C7153k.f15884A0);
            C15567i iVar2 = new C15567i(2);
            iVar2.mo55343b(new C7999m1((long) i2));
            iVar2.mo55343b(new C7999m1((long) i3));
            iVar2.mo55343b(new C7999m1((long) i4));
            iVar.mo55343b(new C7976f0(iVar2));
        }
        this.f15883c = new C7976f0(iVar);
    }

    public C7152j(BigInteger bigInteger) {
        this.f15882b = C7153k.f15911x0;
        this.f15883c = new C7999m1(bigInteger);
    }

    public C7152j(C8021t1 t1Var) {
        this.f15882b = C7959a.m15938q(t1Var.mo20523q(0));
        this.f15883c = t1Var.mo20523q(1).mo12996i();
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f15882b);
        iVar.mo55343b(this.f15883c);
        return new C7976f0(iVar);
    }
}
