package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C15064q implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f33759b;

    /* renamed from: c */
    public final /* synthetic */ long f33760c;

    /* renamed from: d */
    public final /* synthetic */ C14985h1 f33761d;

    public C15064q(C14985h1 h1Var, String str, long j) {
        this.f33761d = h1Var;
        this.f33759b = str;
        this.f33760c = j;
    }

    public final void run() {
        C14985h1 h1Var = this.f33761d;
        String str = this.f33759b;
        long j = this.f33760c;
        h1Var.mo51995g();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) h1Var.f33551d.getOrDefault(str, null);
        if (num != null) {
            C15061p5 n = ((C15103u3) h1Var.f33681b).mo52332t().mo52348n(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                h1Var.f33551d.remove(str);
                Long l = (Long) h1Var.f33550c.getOrDefault(str, null);
                if (l == null) {
                    ((C15103u3) h1Var.f33681b).mo52016b().f33724g.mo52237a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    h1Var.f33550c.remove(str);
                    h1Var.mo52088l(str, j - longValue, n);
                }
                if (h1Var.f33551d.isEmpty()) {
                    long j2 = h1Var.f33552e;
                    if (j2 == 0) {
                        ((C15103u3) h1Var.f33681b).mo52016b().f33724g.mo52237a("First ad exposure time was never set");
                        return;
                    }
                    h1Var.mo52087k(j - j2, n);
                    h1Var.f33552e = 0;
                    return;
                }
                return;
            }
            h1Var.f33551d.put(str, Integer.valueOf(intValue));
            return;
        }
        ((C15103u3) h1Var.f33681b).mo52016b().f33724g.mo52238b(str, "Call to endAdUnitExposure for unknown ad unit id");
    }
}
