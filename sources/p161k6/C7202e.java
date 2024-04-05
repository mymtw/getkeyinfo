package p161k6;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15567i;
import java.math.BigInteger;
import java.util.Enumeration;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: k6.e */
public final class C7202e extends C8005o1 {

    /* renamed from: b */
    public C7999m1 f15985b;

    /* renamed from: c */
    public C7999m1 f15986c;

    /* renamed from: d */
    public C7999m1 f15987d;

    public C7202e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f15985b = new C7999m1(bigInteger);
        this.f15986c = new C7999m1(bigInteger2);
        this.f15987d = new C7999m1(bigInteger3);
    }

    public C7202e(C8021t1 t1Var) {
        if (t1Var.mo20525y() == 3) {
            Enumeration w = t1Var.mo20524w();
            this.f15985b = C7999m1.m16076q(w.nextElement());
            this.f15986c = C7999m1.m16076q(w.nextElement());
            this.f15987d = C7999m1.m16076q(w.nextElement());
            return;
        }
        StringBuilder h = C0072d.m201h("Bad sequence size: ");
        h.append(t1Var.mo20525y());
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f15985b);
        iVar.mo55343b(this.f15986c);
        iVar.mo55343b(this.f15987d);
        return new C7976f0(iVar);
    }
}
