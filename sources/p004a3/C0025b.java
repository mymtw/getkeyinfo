package p004a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C3422l;
import com.etsy.android.lib.models.ResponseConstants;
import p090e3.C6712a;

/* renamed from: a3.b */
public final class C0025b extends C0026c<Boolean> {

    /* renamed from: i */
    public static final String f55i = C3422l.m8214e("BatteryNotLowTracker");

    public C0025b(Context context, C6712a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final Object mo57a() {
        Intent registerReceiver = this.f61b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C3422l.m8213c().mo12927b(f55i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra(ResponseConstants.STATUS, -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra(ResponseConstants.SCALE, -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final IntentFilter mo58e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: f */
    public final void mo59f(Intent intent) {
        if (intent.getAction() != null) {
            C3422l.m8213c().mo12926a(f55i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                mo63b(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                mo63b(Boolean.FALSE);
            }
        }
    }
}
