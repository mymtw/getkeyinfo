package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.messaging.FirebaseMessaging;
import p605kk.C18124h;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
public final class C15136y4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33992b = 0;

    /* renamed from: c */
    public /* synthetic */ Object f33993c;

    /* renamed from: d */
    public /* synthetic */ Object f33994d;

    public C15136y4(C15007j5 j5Var, Bundle bundle) {
        this.f33994d = j5Var;
        this.f33993c = bundle;
    }

    public final void run() {
        switch (this.f33992b) {
            case 0:
                C15007j5 j5Var = (C15007j5) this.f33994d;
                Bundle bundle = (Bundle) this.f33993c;
                j5Var.mo51995g();
                j5Var.mo51946h();
                Preconditions.checkNotNull(bundle);
                String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
                if (!((C15103u3) j5Var.f33681b).mo52321e()) {
                    ((C15103u3) j5Var.f33681b).mo52016b().f33732o.mo52237a("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                zzkv zzkv = new zzkv(checkNotEmpty, 0, (Object) null, "");
                try {
                    zzab zzab = r4;
                    zzab zzab2 = new zzab(bundle.getString("app_id"), "", zzkv, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzat) null, bundle.getLong("trigger_timeout"), (zzat) null, bundle.getLong("time_to_live"), ((C15103u3) j5Var.f33681b).mo52335w().mo52217m0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true));
                    ((C15103u3) j5Var.f33681b).mo52333u().mo52126l(zzab);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                ((FirebaseMessaging) this.f33993c).mo59165xd6d6bd74((C18124h) this.f33994d);
                return;
        }
    }

    public /* synthetic */ C15136y4(FirebaseMessaging firebaseMessaging, C18124h hVar) {
        this.f33993c = firebaseMessaging;
        this.f33994d = hVar;
    }
}
