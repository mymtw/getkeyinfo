package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C14973f7;
import com.google.android.gms.measurement.internal.C15017k6;
import com.google.android.gms.measurement.internal.C15026l6;
import com.google.android.gms.measurement.internal.C15035m6;
import com.google.android.gms.measurement.internal.C15044n6;
import com.google.android.gms.measurement.internal.C15049o2;
import com.google.android.gms.measurement.internal.C15103u3;
import com.google.android.gms.measurement.internal.zzgn;

public final class AppMeasurementService extends Service implements C15035m6 {
    private C15044n6<AppMeasurementService> zza;

    private final C15044n6<AppMeasurementService> zzd() {
        if (this.zza == null) {
            this.zza = new C15044n6<>(this);
        }
        return this.zza;
    }

    public IBinder onBind(Intent intent) {
        C15044n6<AppMeasurementService> zzd = zzd();
        if (intent == null) {
            zzd.mo52268c().f33724g.mo52237a("onBind called with null intent");
            return null;
        }
        zzd.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgn(C14973f7.m24288O(zzd.f33709a), (String) null);
        }
        zzd.mo52268c().f33727j.mo52238b(action, "onBind received unknown action");
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C15103u3.m24641r(zzd().f33709a, (zzcl) null, (Long) null).mo52016b().f33732o.mo52237a("Local AppMeasurementService is starting up");
    }

    public void onDestroy() {
        C15103u3.m24641r(zzd().f33709a, (zzcl) null, (Long) null).mo52016b().f33732o.mo52237a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        zzd().mo52266a(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C15044n6<AppMeasurementService> zzd = zzd();
        C15049o2 b = C15103u3.m24641r(zzd.f33709a, (zzcl) null, (Long) null).mo52016b();
        if (intent == null) {
            b.f33727j.mo52237a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        b.f33732o.mo52239c(Integer.valueOf(i2), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        C15017k6 k6Var = new C15017k6(zzd, i2, b, intent);
        C14973f7 O = C14973f7.m24288O(zzd.f33709a);
        O.mo52015a().mo52308o(new C15026l6(O, (Runnable) k6Var));
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        zzd().mo52267b(intent);
        return true;
    }

    public final void zza(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    public final void zzb(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final boolean zzc(int i) {
        return stopSelfResult(i);
    }
}
