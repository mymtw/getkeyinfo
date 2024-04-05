package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.etsy.android.push.CartRefreshDelegate;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;
import p605kk.C18117a0;
import p605kk.C18123g;
import p605kk.C18124h;
import p605kk.C18130n;
import p689ul.C18605c;
import p689ul.C18606d;
import p689ul.C18611i;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
public final class C15128x4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33972b;

    /* renamed from: c */
    public /* synthetic */ Object f33973c;

    /* renamed from: d */
    public /* synthetic */ Object f33974d;

    public /* synthetic */ C15128x4(int i, Object obj, Object obj2) {
        this.f33972b = i;
        this.f33974d = obj;
        this.f33973c = obj2;
    }

    public final void run() {
        switch (this.f33972b) {
            case 0:
                C15007j5 j5Var = (C15007j5) this.f33974d;
                Bundle bundle = (Bundle) this.f33973c;
                j5Var.mo51995g();
                j5Var.mo51946h();
                Preconditions.checkNotNull(bundle);
                String string = bundle.getString("name");
                String string2 = bundle.getString(CartRefreshDelegate.ARG_ORIGIN);
                Preconditions.checkNotEmpty(string);
                Preconditions.checkNotEmpty(string2);
                Preconditions.checkNotNull(bundle.get("value"));
                if (!((C15103u3) j5Var.f33681b).mo52321e()) {
                    ((C15103u3) j5Var.f33681b).mo52016b().f33732o.mo52237a("Conditional property not set since app measurement is disabled");
                    return;
                }
                zzkv zzkv = new zzkv(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
                try {
                    zzat m0 = ((C15103u3) j5Var.f33681b).mo52335w().mo52217m0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true);
                    ((C15103u3) j5Var.f33681b).mo52333u().mo52126l(new zzab(bundle.getString("app_id"), string2, zzkv, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), ((C15103u3) j5Var.f33681b).mo52335w().mo52217m0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true), bundle.getLong("trigger_timeout"), m0, bundle.getLong("time_to_live"), ((C15103u3) j5Var.f33681b).mo52335w().mo52217m0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 1:
                C15018k7 w = ((AppMeasurementDynamiteService) this.f33974d).zza.mo52335w();
                zzcf zzcf = (zzcf) this.f33973c;
                C15103u3 u3Var = ((AppMeasurementDynamiteService) this.f33974d).zza;
                w.mo52224x(zzcf, u3Var.f33865B != null && u3Var.f33865B.booleanValue());
                return;
            case 2:
                if (((C18123g) this.f33973c).mo69666m()) {
                    ((C18130n) this.f33974d).f39581d.mo69674u();
                    return;
                }
                try {
                    ((C18130n) this.f33974d).f39581d.mo69673t(((C18130n) this.f33974d).f39580c.then((C18123g) this.f33973c));
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        ((C18130n) this.f33974d).f39581d.mo69672s((Exception) e.getCause());
                        return;
                    } else {
                        ((C18130n) this.f33974d).f39581d.mo69672s(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((C18130n) this.f33974d).f39581d.mo69672s(e2);
                    return;
                }
            case 3:
                try {
                    ((C18117a0) this.f33973c).mo69673t(((Callable) this.f33974d).call());
                    return;
                } catch (Exception e3) {
                    ((C18117a0) this.f33973c).mo69672s(e3);
                    return;
                } catch (Throwable th) {
                    ((C18117a0) this.f33973c).mo69672s(new RuntimeException(th));
                    return;
                }
            case 4:
                synchronized (((C18611i) this.f33974d).f41099b) {
                    C18605c cVar = ((C18611i) this.f33974d).f41100c;
                    if (cVar != null) {
                        cVar.onSuccess(((C18606d) this.f33973c).mo70119f());
                    }
                }
                return;
            default:
                ((FirebaseMessaging) this.f33973c).mo59164xd74d2373((C18124h) this.f33974d);
                return;
        }
    }

    public /* synthetic */ C15128x4(Object obj, Object obj2, int i) {
        this.f33972b = i;
        this.f33973c = obj;
        this.f33974d = obj2;
    }
}
