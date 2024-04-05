package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14578a9;

/* renamed from: com.google.android.gms.measurement.internal.u6 */
public final class C15106u6 {

    /* renamed from: a */
    public final /* synthetic */ C15114v6 f33902a;

    public C15106u6(C15114v6 v6Var) {
        this.f33902a = v6Var;
    }

    /* renamed from: a */
    public final void mo52338a() {
        this.f33902a.mo51995g();
        if (((C15103u3) this.f33902a.f33681b).mo52330q().mo51959q(((C15103u3) this.f33902a.f33681b).f33885o.currentTimeMillis())) {
            ((C15103u3) this.f33902a.f33681b).mo52330q().f33307l.mo52353a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ((C15103u3) this.f33902a.f33681b).mo52016b().f33732o.mo52237a("Detected application was in foreground");
                mo52340c(((C15103u3) this.f33902a.f33681b).f33885o.currentTimeMillis(), false);
            }
        }
    }

    /* renamed from: b */
    public final void mo52339b(long j, boolean z) {
        this.f33902a.mo51995g();
        this.f33902a.mo52352k();
        if (((C15103u3) this.f33902a.f33681b).mo52330q().mo51959q(j)) {
            ((C15103u3) this.f33902a.f33681b).mo52330q().f33307l.mo52353a(true);
        }
        ((C15103u3) this.f33902a.f33681b).mo52330q().f33310o.mo52364b(j);
        if (((C15103u3) this.f33902a.f33681b).mo52330q().f33307l.mo52354b()) {
            mo52340c(j, z);
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    public final void mo52340c(long j, boolean z) {
        this.f33902a.mo51995g();
        if (((C15103u3) this.f33902a.f33681b).mo52321e()) {
            ((C15103u3) this.f33902a.f33681b).mo52330q().f33310o.mo52364b(j);
            ((C15103u3) this.f33902a.f33681b).mo52016b().f33732o.mo52238b(Long.valueOf(((C15103u3) this.f33902a.f33681b).f33885o.elapsedRealtime()), "Session started, time");
            Long valueOf = Long.valueOf(j / 1000);
            ((C15103u3) this.f33902a.f33681b).mo52331s().mo52160v("auto", j, valueOf, "_sid");
            ((C15103u3) this.f33902a.f33681b).mo52330q().f33307l.mo52353a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (((C15103u3) this.f33902a.f33681b).f33878h.mo51973p((String) null, C14959e2.f33400d0) && z) {
                bundle.putLong("_aib", 1);
            }
            ((C15103u3) this.f33902a.f33681b).mo52331s().mo52152n("auto", "_s", bundle, j);
            C14578a9.f32745c.f32746b.zza().zza();
            if (((C15103u3) this.f33902a.f33681b).f33878h.mo51973p((String) null, C14959e2.f33408h0)) {
                String a = ((C15103u3) this.f33902a.f33681b).mo52330q().f33315t.mo51937a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    ((C15103u3) this.f33902a.f33681b).mo52331s().mo52152n("auto", "_ssr", bundle2, j);
                }
            }
        }
    }
}
