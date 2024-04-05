package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

public final class zzfc implements ServiceConnection {
    public final /* synthetic */ C14960e3 zza;
    /* access modifiers changed from: private */
    public final String zzb;

    public zzfc(C14960e3 e3Var, String str) {
        this.zza = e3Var;
        this.zzb = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                zzbr zzb2 = zzbq.zzb(iBinder);
                if (zzb2 == null) {
                    this.zza.f33444a.mo52016b().f33727j.mo52237a("Install Referrer Service implementation was not found");
                    return;
                }
                this.zza.f33444a.mo52016b().f33732o.mo52237a("Install Referrer Service connected");
                this.zza.f33444a.mo52015a().mo52308o(new C14951d3(this, 0, zzb2, this));
            } catch (RuntimeException e) {
                this.zza.f33444a.mo52016b().f33727j.mo52238b(e, "Exception occurred while calling Install Referrer API");
            }
        } else {
            this.zza.f33444a.mo52016b().f33727j.mo52237a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.f33444a.mo52016b().f33732o.mo52237a("Install Referrer Service disconnected");
    }
}
