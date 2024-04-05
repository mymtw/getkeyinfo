package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
public final class C14927a6 extends C15010k {

    /* renamed from: e */
    public final /* synthetic */ C14999i6 f33274e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14927a6(C14999i6 i6Var, C15051o4 o4Var) {
        super(o4Var);
        this.f33274e = i6Var;
    }

    /* renamed from: b */
    public final void mo51941b() {
        C14999i6 i6Var = this.f33274e;
        i6Var.mo51995g();
        if (i6Var.mo52127m()) {
            ((C15103u3) i6Var.f33681b).mo52016b().f33732o.mo52237a("Inactivity, disconnecting from the service");
            i6Var.mo52136w();
        }
    }
}
