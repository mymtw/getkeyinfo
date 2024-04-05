package p081d6;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import java.util.Enumeration;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: d6.e */
public final class C6666e extends C8005o1 {

    /* renamed from: b */
    public BigInteger f14706b;

    /* renamed from: c */
    public BigInteger f14707c;

    /* renamed from: d */
    public BigInteger f14708d;

    /* renamed from: e */
    public BigInteger f14709e;

    /* renamed from: f */
    public BigInteger f14710f;

    /* renamed from: g */
    public BigInteger f14711g;

    /* renamed from: h */
    public BigInteger f14712h;

    /* renamed from: i */
    public BigInteger f14713i;

    /* renamed from: j */
    public BigInteger f14714j;

    /* renamed from: k */
    public C8021t1 f14715k;

    public C6666e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.f14715k = null;
        this.f14706b = BigInteger.valueOf(0);
        this.f14707c = bigInteger;
        this.f14708d = bigInteger2;
        this.f14709e = bigInteger3;
        this.f14710f = bigInteger4;
        this.f14711g = bigInteger5;
        this.f14712h = bigInteger6;
        this.f14713i = bigInteger7;
        this.f14714j = bigInteger8;
    }

    public C6666e(C8021t1 t1Var) {
        this.f14715k = null;
        Enumeration w = t1Var.mo20524w();
        BigInteger s = ((C7999m1) w.nextElement()).mo20556s();
        if (s.intValue() == 0 || s.intValue() == 1) {
            this.f14706b = s;
            this.f14707c = ((C7999m1) w.nextElement()).mo20556s();
            this.f14708d = ((C7999m1) w.nextElement()).mo20556s();
            this.f14709e = ((C7999m1) w.nextElement()).mo20556s();
            this.f14710f = ((C7999m1) w.nextElement()).mo20556s();
            this.f14711g = ((C7999m1) w.nextElement()).mo20556s();
            this.f14712h = ((C7999m1) w.nextElement()).mo20556s();
            this.f14713i = ((C7999m1) w.nextElement()).mo20556s();
            this.f14714j = ((C7999m1) w.nextElement()).mo20556s();
            if (w.hasMoreElements()) {
                this.f14715k = (C8021t1) w.nextElement();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for RSA private key");
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1(this.f14706b));
        iVar.mo55343b(new C7999m1(this.f14707c));
        iVar.mo55343b(new C7999m1(this.f14708d));
        iVar.mo55343b(new C7999m1(this.f14709e));
        iVar.mo55343b(new C7999m1(this.f14710f));
        iVar.mo55343b(new C7999m1(this.f14711g));
        iVar.mo55343b(new C7999m1(this.f14712h));
        iVar.mo55343b(new C7999m1(this.f14713i));
        iVar.mo55343b(new C7999m1(this.f14714j));
        C8021t1 t1Var = this.f14715k;
        if (t1Var != null) {
            iVar.mo55343b(t1Var);
        }
        return new C7976f0(iVar);
    }
}
