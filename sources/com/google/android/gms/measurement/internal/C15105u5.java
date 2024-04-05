package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
public final class C15105u5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C15061p5 f33899b;

    /* renamed from: c */
    public final /* synthetic */ long f33900c;

    /* renamed from: d */
    public final /* synthetic */ C15113v5 f33901d;

    public C15105u5(C15113v5 v5Var, C15061p5 p5Var, long j) {
        this.f33901d = v5Var;
        this.f33899b = p5Var;
        this.f33900c = j;
    }

    public final void run() {
        this.f33901d.mo52347m(this.f33899b, false, this.f33900c);
        C15113v5 v5Var = this.f33901d;
        v5Var.f33924f = null;
        C14999i6 u = ((C15103u3) v5Var.f33681b).mo52333u();
        u.mo51995g();
        u.mo51946h();
        u.mo52133s(new C14952d4(1, u, (Object) null));
    }
}
