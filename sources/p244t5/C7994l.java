package p244t5;

import com.google.android.play.core.appupdate.C15567i;
import java.util.Enumeration;

/* renamed from: t5.l */
public final class C7994l extends C8027v1 {
    public C7994l() {
    }

    public C7994l(C15567i iVar) {
        super(iVar, false);
    }

    public C7994l(C8018s1 s1Var) {
        super(s1Var);
    }

    public C7994l(C7984h1[] h1VarArr) {
        super(h1VarArr);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20570h(49);
        r1Var.mo20570h(128);
        Enumeration s = mo20578s();
        while (s.hasMoreElements()) {
            r1Var.mo20535d((C7984h1) s.nextElement());
        }
        r1Var.mo20570h(0);
        r1Var.mo20570h(0);
    }

    /* renamed from: n */
    public final int mo20509n() {
        Enumeration s = mo20578s();
        int i = 0;
        while (s.hasMoreElements()) {
            i += ((C7984h1) s.nextElement()).mo12996i().mo20509n();
        }
        return i + 2 + 2;
    }
}
