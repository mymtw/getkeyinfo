package p244t5;

import com.google.android.play.core.appupdate.C15567i;
import java.util.Enumeration;

/* renamed from: t5.f0 */
public final class C7976f0 extends C8021t1 {

    /* renamed from: c */
    public int f17458c = -1;

    public C7976f0() {
    }

    public C7976f0(C15567i iVar) {
        super(iVar);
    }

    public C7976f0(C7984h1[] h1VarArr) {
        super(h1VarArr);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        C7970d0 a = r1Var.mo20534a();
        int z = mo20539z();
        r1Var.mo20570h(48);
        r1Var.mo20566b(z);
        Enumeration w = mo20524w();
        while (w.hasMoreElements()) {
            a.mo20535d((C7984h1) w.nextElement());
        }
    }

    /* renamed from: n */
    public final int mo20509n() {
        int z = mo20539z();
        return C7974e1.m15996a(z) + 1 + z;
    }

    /* renamed from: z */
    public final int mo20539z() {
        if (this.f17458c < 0) {
            int i = 0;
            Enumeration w = mo20524w();
            while (w.hasMoreElements()) {
                i += ((C7984h1) w.nextElement()).mo12996i().mo20521o().mo20509n();
            }
            this.f17458c = i;
        }
        return this.f17458c;
    }
}
