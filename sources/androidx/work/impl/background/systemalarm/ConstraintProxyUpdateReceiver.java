package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.C3422l;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p079d3.C6634g;
import p090e3.C6713b;
import p252u2.C8129j;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String ACTION = "androidx.work.impl.background.systemalarm.UpdateProxies";
    public static final String KEY_BATTERY_CHARGING_PROXY_ENABLED = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    public static final String KEY_BATTERY_NOT_LOW_PROXY_ENABLED = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    public static final String KEY_NETWORK_STATE_PROXY_ENABLED = "KEY_NETWORK_STATE_PROXY_ENABLED";
    public static final String KEY_STORAGE_NOT_LOW_PROXY_ENABLED = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    public static final String TAG = C3422l.m8214e("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class C3397a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Intent f7925b;

        /* renamed from: c */
        public final /* synthetic */ Context f7926c;

        /* renamed from: d */
        public final /* synthetic */ BroadcastReceiver.PendingResult f7927d;

        public C3397a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f7925b = intent;
            this.f7926c = context;
            this.f7927d = pendingResult;
        }

        public final void run() {
            try {
                boolean booleanExtra = this.f7925b.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_BATTERY_NOT_LOW_PROXY_ENABLED, false);
                boolean booleanExtra2 = this.f7925b.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_BATTERY_CHARGING_PROXY_ENABLED, false);
                boolean booleanExtra3 = this.f7925b.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_STORAGE_NOT_LOW_PROXY_ENABLED, false);
                boolean booleanExtra4 = this.f7925b.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_NETWORK_STATE_PROXY_ENABLED, false);
                C3422l.m8213c().mo12926a(ConstraintProxyUpdateReceiver.TAG, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C6634g.m13017a(this.f7926c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C6634g.m13017a(this.f7926c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C6634g.m13017a(this.f7926c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C6634g.m13017a(this.f7926c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f7927d.finish();
            }
        }
    }

    public static Intent newConstraintProxyUpdateIntent(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(ACTION);
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra(KEY_BATTERY_NOT_LOW_PROXY_ENABLED, z).putExtra(KEY_BATTERY_CHARGING_PROXY_ENABLED, z2).putExtra(KEY_STORAGE_NOT_LOW_PROXY_ENABLED, z3).putExtra(KEY_NETWORK_STATE_PROXY_ENABLED, z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!ACTION.equals(action)) {
            C3422l.m8213c().mo12926a(TAG, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        ((C6713b) C8129j.m16345e(context).f17764d).mo18901a(new C3397a(intent, context, goAsync()));
    }
}
