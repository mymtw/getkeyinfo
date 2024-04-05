package com.google.android.gms.common.api.internal;

final class zza implements Runnable {
    public final /* synthetic */ LifecycleCallback zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzb zzc;

    public zza(zzb zzb2, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzb2;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    public final void run() {
        zzb zzb2 = this.zzc;
        if (zzb2.zzc > 0) {
            this.zza.onCreate(zzb2.zzd != null ? zzb2.zzd.getBundle(this.zzb) : null);
        }
        if (this.zzc.zzc >= 2) {
            this.zza.onStart();
        }
        if (this.zzc.zzc >= 3) {
            this.zza.onResume();
        }
        if (this.zzc.zzc >= 4) {
            this.zza.onStop();
        }
        if (this.zzc.zzc >= 5) {
            this.zza.onDestroy();
        }
    }
}
