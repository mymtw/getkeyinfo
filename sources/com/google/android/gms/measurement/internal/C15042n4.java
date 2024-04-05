package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
public abstract class C15042n4 extends C15033m4 {

    /* renamed from: c */
    public boolean f33708c;

    public C15042n4(C15103u3 u3Var) {
        super(u3Var);
        ((C15103u3) this.f33681b).f33869F++;
    }

    /* renamed from: h */
    public abstract boolean mo51952h();

    /* renamed from: i */
    public final void mo52264i() {
        if (!this.f33708c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo52265j() {
        if (this.f33708c) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo51952h()) {
            ((C15103u3) this.f33681b).f33870G.incrementAndGet();
            this.f33708c = true;
        }
    }
}
