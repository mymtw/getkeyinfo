package p244t5;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.C6147i;
import java.util.Enumeration;

/* renamed from: t5.n */
public final class C8000n extends C7966c {
    public C8000n(boolean z, int i, C7984h1 h1Var) {
        super(z, i, h1Var);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        Enumeration enumeration;
        r1Var.mo20567c(160, this.f17445b);
        r1Var.mo20570h(128);
        if (!this.f17446c) {
            C7984h1 h1Var = this.f17447d;
            if (h1Var instanceof C8008p1) {
                enumeration = h1Var instanceof C7981h ? ((C7981h) h1Var).mo20542w() : new C7981h(((C8008p1) h1Var).mo20541v()).mo20542w();
            } else if (h1Var instanceof C8021t1) {
                enumeration = ((C8021t1) h1Var).mo20524w();
            } else if (h1Var instanceof C8027v1) {
                enumeration = ((C8027v1) h1Var).mo20578s();
            } else {
                StringBuilder h = C0072d.m201h("not implemented: ");
                h.append(this.f17447d.getClass().getName());
                throw new C6147i(h.toString());
            }
            while (enumeration.hasMoreElements()) {
                r1Var.mo20535d((C7984h1) enumeration.nextElement());
            }
        } else {
            r1Var.mo20535d(this.f17447d);
        }
        r1Var.mo20570h(0);
        r1Var.mo20570h(0);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        if (this.f17446c) {
            return true;
        }
        return this.f17447d.mo12996i().mo20521o().mo20508l();
    }

    /* renamed from: n */
    public final int mo20509n() {
        int n = this.f17447d.mo12996i().mo20509n();
        if (this.f17446c) {
            return C7974e1.m15996a(n) + C7974e1.m15998c(this.f17445b) + n;
        }
        return C7974e1.m15998c(this.f17445b) + (n - 1);
    }
}
