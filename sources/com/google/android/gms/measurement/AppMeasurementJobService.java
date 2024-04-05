package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C14973f7;
import com.google.android.gms.measurement.internal.C15026l6;
import com.google.android.gms.measurement.internal.C15035m6;
import com.google.android.gms.measurement.internal.C15044n6;
import com.google.android.gms.measurement.internal.C15049o2;
import com.google.android.gms.measurement.internal.C15103u3;
import com.google.android.gms.measurement.internal.C15145z5;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C15035m6 {
    private C15044n6<AppMeasurementJobService> zza;

    private final C15044n6<AppMeasurementJobService> zzd() {
        if (this.zza == null) {
            this.zza = new C15044n6<>(this);
        }
        return this.zza;
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

    public boolean onStartJob(JobParameters jobParameters) {
        C15044n6<AppMeasurementJobService> zzd = zzd();
        C15049o2 b = C15103u3.m24641r(zzd.f33709a, (zzcl) null, (Long) null).mo52016b();
        String string = jobParameters.getExtras().getString(ResponseConstants.ACTION);
        b.f33732o.mo52238b(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        C15145z5 z5Var = new C15145z5((C15044n6) zzd, b, jobParameters);
        C14973f7 O = C14973f7.m24288O(zzd.f33709a);
        O.mo52015a().mo52308o(new C15026l6(O, (Runnable) z5Var));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        zzd().mo52267b(intent);
        return true;
    }

    public final void zza(Intent intent) {
    }

    @TargetApi(24)
    public final void zzb(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final boolean zzc(int i) {
        throw new UnsupportedOperationException();
    }
}
