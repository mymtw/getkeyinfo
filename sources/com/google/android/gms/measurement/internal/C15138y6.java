package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C14673i0;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
public final class C15138y6 extends C14928a7 {

    /* renamed from: e */
    public final AlarmManager f33998e = ((AlarmManager) ((C15103u3) this.f33681b).f33872b.getSystemService("alarm"));

    /* renamed from: f */
    public C15130x6 f33999f;

    /* renamed from: g */
    public Integer f34000g;

    public C15138y6(C14973f7 f7Var) {
        super(f7Var);
    }

    /* renamed from: j */
    public final void mo51944j() {
        AlarmManager alarmManager = this.f33998e;
        if (alarmManager != null) {
            alarmManager.cancel(mo52370m());
        }
        JobScheduler jobScheduler = (JobScheduler) ((C15103u3) this.f33681b).f33872b.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(mo52369l());
        }
    }

    /* renamed from: k */
    public final void mo52368k() {
        mo51942h();
        ((C15103u3) this.f33681b).mo52016b().f33732o.mo52237a("Unscheduling upload");
        AlarmManager alarmManager = this.f33998e;
        if (alarmManager != null) {
            alarmManager.cancel(mo52370m());
        }
        mo52371n().mo52168a();
        JobScheduler jobScheduler = (JobScheduler) ((C15103u3) this.f33681b).f33872b.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(mo52369l());
        }
    }

    /* renamed from: l */
    public final int mo52369l() {
        if (this.f34000g == null) {
            String valueOf = String.valueOf(((C15103u3) this.f33681b).f33872b.getPackageName());
            this.f34000g = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f34000g.intValue();
    }

    /* renamed from: m */
    public final PendingIntent mo52370m() {
        Context context = ((C15103u3) this.f33681b).f33872b;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C14673i0.f32875a);
    }

    /* renamed from: n */
    public final C15010k mo52371n() {
        if (this.f33999f == null) {
            this.f33999f = new C15130x6(this, this.f34048c.f33497m);
        }
        return this.f33999f;
    }
}
