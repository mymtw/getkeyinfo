package p244t5;

import com.google.android.play.core.appupdate.C15567i;
import java.util.Enumeration;

/* renamed from: t5.h0 */
public final class C7983h0 extends C8027v1 {

    /* renamed from: d */
    public int f17470d = -1;

    public C7983h0() {
    }

    public C7983h0(C15567i iVar) {
        super(iVar, true);
    }

    public C7983h0(C15567i iVar, int i) {
        super(iVar, false);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        C7970d0 a = r1Var.mo20534a();
        int y = mo20545y();
        r1Var.mo20570h(49);
        r1Var.mo20566b(y);
        Enumeration s = mo20578s();
        while (s.hasMoreElements()) {
            a.mo20535d((C7984h1) s.nextElement());
        }
    }

    /* renamed from: n */
    public final int mo20509n() {
        int y = mo20545y();
        return C7974e1.m15996a(y) + 1 + y;
    }

    /* renamed from: y */
    public final int mo20545y() {
        if (this.f17470d < 0) {
            int i = 0;
            Enumeration s = mo20578s();
            while (s.hasMoreElements()) {
                i += ((C7984h1) s.nextElement()).mo12996i().mo20521o().mo20509n();
            }
            this.f17470d = i;
        }
        return this.f17470d;
    }
}
