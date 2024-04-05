package com.google.android.gms.measurement.internal;

import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
public final class C15053o6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f33733b;

    /* renamed from: c */
    public final /* synthetic */ C15114v6 f33734c;

    public C15053o6(C15114v6 v6Var, long j) {
        this.f33734c = v6Var;
        this.f33733b = j;
    }

    public final void run() {
        C15114v6 v6Var = this.f33734c;
        long j = this.f33733b;
        v6Var.mo51995g();
        v6Var.mo52352k();
        ((C15103u3) v6Var.f33681b).mo52016b().f33732o.mo52238b(Long.valueOf(j), "Activity paused, time");
        C15080r6 r6Var = v6Var.f33936g;
        C15071q6 q6Var = new C15071q6(r6Var, ((C15103u3) r6Var.f33814b.f33681b).f33885o.currentTimeMillis(), j);
        r6Var.f33813a = q6Var;
        r6Var.f33814b.f33933d.postDelayed(q6Var, NetworkRetryInterceptor.DEFAULT_RETRY_DELAY);
        if (((C15103u3) v6Var.f33681b).f33878h.mo51974q()) {
            v6Var.f33935f.f33857c.mo52168a();
        }
    }
}
