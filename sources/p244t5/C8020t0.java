package p244t5;

import com.google.android.play.core.appupdate.C15567i;
import java.util.Enumeration;

/* renamed from: t5.t0 */
public final class C8020t0 extends C8021t1 {

    /* renamed from: c */
    public int f17504c = -1;

    public C8020t0() {
    }

    public C8020t0(C15567i iVar) {
        super(iVar);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        C8014r1 g = r1Var.mo20536g();
        int z = mo20571z();
        r1Var.mo20570h(48);
        r1Var.mo20566b(z);
        Enumeration w = mo20524w();
        while (w.hasMoreElements()) {
            g.mo20535d((C7984h1) w.nextElement());
        }
    }

    /* renamed from: n */
    public final int mo20509n() {
        int z = mo20571z();
        return C7974e1.m15996a(z) + 1 + z;
    }

    /* renamed from: z */
    public final int mo20571z() {
        if (this.f17504c < 0) {
            int i = 0;
            Enumeration w = mo20524w();
            while (w.hasMoreElements()) {
                i += ((C7984h1) w.nextElement()).mo12996i().mo20522p().mo20509n();
            }
            this.f17504c = i;
        }
        return this.f17504c;
    }
}
