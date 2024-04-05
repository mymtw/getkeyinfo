package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C3376c;
import androidx.work.C3422l;
import androidx.work.NetworkType;
import java.util.List;
import p034c3.C4391o;

public abstract class ConstraintProxy extends BroadcastReceiver {
    private static final String TAG = C3422l.m8214e("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static void updateAll(Context context, List<C4391o> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (C4391o oVar : list) {
            C3376c cVar = oVar.f9653j;
            z |= cVar.f7885d;
            z2 |= cVar.f7883b;
            z3 |= cVar.f7886e;
            z4 |= cVar.f7882a != NetworkType.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        C3422l.m8213c().mo12926a(TAG, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        String str = C3398a.f7928e;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
