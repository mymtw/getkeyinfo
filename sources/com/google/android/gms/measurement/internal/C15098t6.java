package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14695j9;
import org.apache.commons.lang3.time.DateUtils;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
public final class C15098t6 {
    @VisibleForTesting

    /* renamed from: a */
    public long f33855a;
    @VisibleForTesting

    /* renamed from: b */
    public long f33856b;

    /* renamed from: c */
    public final C15089s6 f33857c;

    /* renamed from: d */
    public final /* synthetic */ C15114v6 f33858d;

    public C15098t6(C15114v6 v6Var) {
        this.f33858d = v6Var;
        this.f33857c = new C15089s6(this, (C15103u3) v6Var.f33681b);
        long elapsedRealtime = ((C15103u3) v6Var.f33681b).f33885o.elapsedRealtime();
        this.f33855a = elapsedRealtime;
        this.f33856b = elapsedRealtime;
    }

    /* renamed from: a */
    public final boolean mo52319a(long j, boolean z, boolean z2) {
        this.f33858d.mo51995g();
        this.f33858d.mo51946h();
        C14695j9.f32897c.f32898b.zza().zza();
        if (!((C15103u3) this.f33858d.f33681b).f33878h.mo51973p((String) null, C14959e2.f33410i0)) {
            ((C15103u3) this.f33858d.f33681b).mo52330q().f33310o.mo52364b(((C15103u3) this.f33858d.f33681b).f33885o.currentTimeMillis());
        } else if (((C15103u3) this.f33858d.f33681b).mo52321e()) {
            ((C15103u3) this.f33858d.f33681b).mo52330q().f33310o.mo52364b(((C15103u3) this.f33858d.f33681b).f33885o.currentTimeMillis());
        }
        long j2 = j - this.f33855a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f33856b;
                this.f33856b = j;
            }
            ((C15103u3) this.f33858d.f33681b).mo52016b().f33732o.mo52238b(Long.valueOf(j2), "Recording user engagement, ms");
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C15018k7.m24481s(((C15103u3) this.f33858d.f33681b).mo52332t().mo52348n(!((C15103u3) this.f33858d.f33681b).f33878h.mo51974q()), bundle, true);
            C14947d dVar = ((C15103u3) this.f33858d.f33681b).f33878h;
            C14950d2<Boolean> d2Var = C14959e2.f33387U;
            if (!dVar.mo51973p((String) null, d2Var) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!((C15103u3) this.f33858d.f33681b).f33878h.mo51973p((String) null, d2Var) || !z2) {
                ((C15103u3) this.f33858d.f33681b).mo52331s().mo52151m("auto", bundle, "_e");
            }
            this.f33855a = j;
            this.f33857c.mo52168a();
            this.f33857c.mo52169c(DateUtils.MILLIS_PER_HOUR);
            return true;
        }
        ((C15103u3) this.f33858d.f33681b).mo52016b().f33732o.mo52238b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
        return false;
    }
}
