package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C14969f3;
import com.google.android.gms.measurement.internal.C14978g3;
import com.google.android.gms.measurement.internal.C15049o2;
import com.google.android.gms.measurement.internal.C15103u3;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C14969f3 {
    private C14978g3 zza;

    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    public void doStartService(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new C14978g3(this);
        }
        C14978g3 g3Var = this.zza;
        g3Var.getClass();
        C15049o2 b = C15103u3.m24641r(context, (zzcl) null, (Long) null).mo52016b();
        if (intent == null) {
            b.f33727j.mo52237a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        b.f33732o.mo52238b(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b.f33732o.mo52237a("Starting wakeful intent.");
            g3Var.f33527a.doStartService(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            b.f33727j.mo52237a("Install Referrer Broadcasts are deprecated");
        }
    }
}
