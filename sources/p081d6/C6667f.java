package p081d6;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import java.util.Enumeration;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: d6.f */
public final class C6667f extends C8005o1 {

    /* renamed from: b */
    public BigInteger f14716b;

    /* renamed from: c */
    public BigInteger f14717c;

    public C6667f(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f14716b = bigInteger;
        this.f14717c = bigInteger2;
    }

    public C6667f(C8021t1 t1Var) {
        if (t1Var.mo20525y() == 2) {
            Enumeration w = t1Var.mo20524w();
            this.f14716b = C7999m1.m16076q(w.nextElement()).mo20558v();
            this.f14717c = C7999m1.m16076q(w.nextElement()).mo20558v();
            return;
        }
        StringBuilder h = C0072d.m201h("Bad sequence size: ");
        h.append(t1Var.mo20525y());
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1(this.f14716b));
        iVar.mo55343b(new C7999m1(this.f14717c));
        return new C7976f0(iVar);
    }
}
