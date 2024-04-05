package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b3 */
public abstract class C14933b3 extends C14968f2 {

    /* renamed from: c */
    public boolean f33280c;

    public C14933b3(C15103u3 u3Var) {
        super(u3Var);
        ((C15103u3) this.f33681b).f33869F++;
    }

    /* renamed from: h */
    public final void mo51946h() {
        if (!this.f33280c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: i */
    public final void mo51947i() {
        if (this.f33280c) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo51948j()) {
            ((C15103u3) this.f33681b).f33870G.incrementAndGet();
            this.f33280c = true;
        }
    }

    /* renamed from: j */
    public abstract boolean mo51948j();
}
