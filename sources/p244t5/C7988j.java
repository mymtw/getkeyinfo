package p244t5;

import com.google.android.play.core.appupdate.C15567i;
import java.util.Enumeration;

/* renamed from: t5.j */
public final class C7988j extends C8021t1 {
    public C7988j() {
    }

    public C7988j(C15567i iVar) {
        super(iVar);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20570h(48);
        r1Var.mo20570h(128);
        Enumeration w = mo20524w();
        while (w.hasMoreElements()) {
            r1Var.mo20535d((C7984h1) w.nextElement());
        }
        r1Var.mo20570h(0);
        r1Var.mo20570h(0);
    }

    /* renamed from: n */
    public final int mo20509n() {
        Enumeration w = mo20524w();
        int i = 0;
        while (w.hasMoreElements()) {
            i += ((C7984h1) w.nextElement()).mo12996i().mo20509n();
        }
        return i + 2 + 2;
    }
}
