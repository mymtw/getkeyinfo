package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
public abstract class C14928a7 extends C15146z6 {

    /* renamed from: d */
    public boolean f33275d;

    public C14928a7(C14973f7 f7Var) {
        super(f7Var);
        this.f34048c.f33502r++;
    }

    /* renamed from: h */
    public final void mo51942h() {
        if (!this.f33275d) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: i */
    public final void mo51943i() {
        if (!this.f33275d) {
            mo51944j();
            this.f34048c.f33503s++;
            this.f33275d = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: j */
    public abstract void mo51944j();
}
