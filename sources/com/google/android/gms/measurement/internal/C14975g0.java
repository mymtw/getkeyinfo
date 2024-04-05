package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g0 */
public final class C14975g0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33512b;

    /* renamed from: c */
    public final /* synthetic */ long f33513c;

    /* renamed from: d */
    public final /* synthetic */ C14968f2 f33514d;

    public /* synthetic */ C14975g0(C14968f2 f2Var, long j, int i) {
        this.f33512b = i;
        this.f33514d = f2Var;
        this.f33513c = j;
    }

    public final void run() {
        switch (this.f33512b) {
            case 0:
                ((C14985h1) this.f33514d).mo52089m(this.f33513c);
                return;
            case 1:
                ((C15007j5) this.f33514d).mo52154p(this.f33513c, true);
                ((C15103u3) ((C15007j5) this.f33514d).f33681b).mo52333u().mo52137x(new AtomicReference());
                return;
            default:
                C15114v6 v6Var = (C15114v6) this.f33514d;
                long j = this.f33513c;
                v6Var.mo51995g();
                v6Var.mo52352k();
                ((C15103u3) v6Var.f33681b).mo52016b().f33732o.mo52238b(Long.valueOf(j), "Activity resumed, time");
                if (((C15103u3) v6Var.f33681b).f33878h.mo51974q() || ((C15103u3) v6Var.f33681b).mo52330q().f33312q.mo52354b()) {
                    C15098t6 t6Var = v6Var.f33935f;
                    t6Var.f33858d.mo51995g();
                    t6Var.f33857c.mo52168a();
                    t6Var.f33855a = j;
                    t6Var.f33856b = j;
                }
                C15080r6 r6Var = v6Var.f33936g;
                r6Var.f33814b.mo51995g();
                C15071q6 q6Var = r6Var.f33813a;
                if (q6Var != null) {
                    r6Var.f33814b.f33933d.removeCallbacks(q6Var);
                }
                ((C15103u3) r6Var.f33814b.f33681b).mo52330q().f33312q.mo52353a(false);
                C15106u6 u6Var = v6Var.f33934e;
                u6Var.f33902a.mo51995g();
                if (((C15103u3) u6Var.f33902a.f33681b).mo52321e()) {
                    u6Var.mo52339b(((C15103u3) u6Var.f33902a.f33681b).f33885o.currentTimeMillis(), false);
                    return;
                }
                return;
        }
    }
}
