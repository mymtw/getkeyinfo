package p026b6;

import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import java.util.Enumeration;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: b6.a */
public final class C3480a extends C8005o1 {

    /* renamed from: b */
    public C7999m1 f8102b;

    /* renamed from: c */
    public C7999m1 f8103c;

    public C3480a(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f8102b = new C7999m1(bigInteger);
        this.f8103c = new C7999m1(bigInteger2);
    }

    public C3480a(C8021t1 t1Var) {
        Enumeration w = t1Var.mo20524w();
        this.f8102b = (C7999m1) w.nextElement();
        this.f8103c = (C7999m1) w.nextElement();
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f8102b);
        iVar.mo55343b(this.f8103c);
        return new C7976f0(iVar);
    }
}
