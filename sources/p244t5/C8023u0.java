package p244t5;

import com.google.android.play.core.appupdate.C15567i;
import java.util.Enumeration;

/* renamed from: t5.u0 */
public final class C8023u0 extends C8027v1 {

    /* renamed from: d */
    public int f17508d = -1;

    public C8023u0() {
    }

    public C8023u0(C15567i iVar) {
        super(iVar, false);
    }

    public C8023u0(C8018s1 s1Var) {
        super(s1Var);
    }

    public C8023u0(C7984h1[] h1VarArr) {
        super(h1VarArr);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        C8014r1 g = r1Var.mo20536g();
        int y = mo20575y();
        r1Var.mo20570h(49);
        r1Var.mo20566b(y);
        Enumeration s = mo20578s();
        while (s.hasMoreElements()) {
            g.mo20535d((C7984h1) s.nextElement());
        }
    }

    /* renamed from: n */
    public final int mo20509n() {
        int y = mo20575y();
        return C7974e1.m15996a(y) + 1 + y;
    }

    /* renamed from: y */
    public final int mo20575y() {
        if (this.f17508d < 0) {
            int i = 0;
            Enumeration s = mo20578s();
            while (s.hasMoreElements()) {
                i += ((C7984h1) s.nextElement()).mo12996i().mo20522p().mo20509n();
            }
            this.f17508d = i;
        }
        return this.f17508d;
    }
}
