package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.facebook.login.LoginStatusClient;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class zzr extends GmsClientSupervisor {
    /* access modifiers changed from: private */
    public final HashMap<zzn, zzo> zzb = new HashMap<>();
    /* access modifiers changed from: private */
    public final Context zzc;
    /* access modifiers changed from: private */
    public volatile Handler zzd;
    private final zzq zze;
    /* access modifiers changed from: private */
    public final ConnectionTracker zzf;
    private final long zzg;
    /* access modifiers changed from: private */
    public final long zzh;

    public zzr(Context context, Looper looper) {
        zzq zzq = new zzq(this, (zzp) null);
        this.zze = zzq;
        this.zzc = context.getApplicationContext();
        this.zzd = new zzi(looper, zzq);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = LoginStatusClient.DEFAULT_TOAST_DURATION_MS;
        this.zzh = 300000;
    }

    public final void zza(zzn zzn, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzo zzo = this.zzb.get(zzn);
            if (zzo == null) {
                String zzn2 = zzn.toString();
                StringBuilder sb = new StringBuilder(zzn2.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(zzn2);
                throw new IllegalStateException(sb.toString());
            } else if (zzo.zzh(serviceConnection)) {
                zzo.zzf(serviceConnection, str);
                if (zzo.zzi()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zzn), this.zzg);
                }
            } else {
                String zzn3 = zzn.toString();
                StringBuilder sb2 = new StringBuilder(zzn3.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(zzn3);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean zzc(zzn zzn, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zzj;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzo zzo = this.zzb.get(zzn);
            if (zzo == null) {
                zzo = new zzo(this, zzn);
                zzo.zzd(serviceConnection, serviceConnection, str);
                zzo.zze(str, executor);
                this.zzb.put(zzn, zzo);
            } else {
                this.zzd.removeMessages(0, zzn);
                if (!zzo.zzh(serviceConnection)) {
                    zzo.zzd(serviceConnection, serviceConnection, str);
                    int zza = zzo.zza();
                    if (zza == 1) {
                        serviceConnection.onServiceConnected(zzo.zzb(), zzo.zzc());
                    } else if (zza == 2) {
                        zzo.zze(str, executor);
                    }
                } else {
                    String zzn2 = zzn.toString();
                    StringBuilder sb = new StringBuilder(zzn2.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(zzn2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            zzj = zzo.zzj();
        }
        return zzj;
    }

    public final void zzi(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new zzi(looper, this.zze);
        }
    }
}
