package com.bugsnag.android;

import com.bugsnag.android.C5742f0;

/* renamed from: com.bugsnag.android.e0 */
public final class C5736e0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C5922v0 f12213b;

    /* renamed from: c */
    public final /* synthetic */ C5908s0 f12214c;

    /* renamed from: d */
    public final /* synthetic */ C5742f0 f12215d;

    public C5736e0(C5742f0 f0Var, C5922v0 v0Var, C5908s0 s0Var) {
        this.f12215d = f0Var;
        this.f12213b = v0Var;
        this.f12214c = s0Var;
    }

    public final void run() {
        C5742f0 f0Var = this.f12215d;
        C5922v0 v0Var = this.f12213b;
        C5908s0 s0Var = this.f12214c;
        f0Var.f12233b.mo16604d("DeliveryDelegate#deliverPayloadInternal() - attempting event delivery");
        int i = C5742f0.C5743a.f12239a[f0Var.f12235d.f12325o.mo16486b(v0Var, f0Var.f12235d.mo16544a(v0Var)).ordinal()];
        if (i == 1) {
            f0Var.f12233b.mo16606f("Sent 1 new event to Bugsnag");
        } else if (i == 2) {
            f0Var.f12233b.mo16608h("Could not send event(s) to Bugsnag, saving to disk to send later");
            f0Var.f12234c.mo16495g(s0Var);
        } else if (i == 3) {
            f0Var.f12233b.mo16608h("Problem sending event to Bugsnag");
        }
    }
}
