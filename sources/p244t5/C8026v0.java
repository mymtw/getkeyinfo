package p244t5;

/* renamed from: t5.v0 */
public final class C8026v0 extends C7966c {
    public C8026v0(boolean z, int i, C7984h1 h1Var) {
        super(z, i, h1Var);
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        C8018s1 p = this.f17447d.mo12996i().mo20522p();
        int i = 160;
        if (this.f17446c) {
            r1Var.mo20567c(160, this.f17445b);
            r1Var.mo20566b(p.mo20509n());
            r1Var.mo20535d(p);
            return;
        }
        if (!p.mo20508l()) {
            i = 128;
        }
        r1Var.mo20567c(i, this.f17445b);
        r1Var.mo20568e(p);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        if (this.f17446c) {
            return true;
        }
        return this.f17447d.mo12996i().mo20522p().mo20508l();
    }

    /* renamed from: n */
    public final int mo20509n() {
        int n = this.f17447d.mo12996i().mo20522p().mo20509n();
        if (this.f17446c) {
            return C7974e1.m15996a(n) + C7974e1.m15998c(this.f17445b) + n;
        }
        return C7974e1.m15998c(this.f17445b) + (n - 1);
    }
}
