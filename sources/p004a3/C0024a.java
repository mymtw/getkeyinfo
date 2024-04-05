package p004a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C3422l;
import com.etsy.android.lib.models.ResponseConstants;
import p090e3.C6712a;

/* renamed from: a3.a */
public final class C0024a extends C0026c<Boolean> {

    /* renamed from: i */
    public static final String f54i = C3422l.m8214e("BatteryChrgTracker");

    public C0024a(Context context, C6712a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final Object mo57a() {
        Intent registerReceiver = this.f61b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C3422l.m8213c().mo12927b(f54i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra(ResponseConstants.STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final IntentFilter mo58e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r7.equals("android.os.action.DISCHARGING") == false) goto L_0x0026;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59f(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f54i
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r7
            java.lang.String r5 = "Received %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.mo12926a(r1, r3, r5)
            r0 = -1
            int r1 = r7.hashCode()
            switch(r1) {
                case -1886648615: goto L_0x0047;
                case -54942926: goto L_0x003e;
                case 948344062: goto L_0x0033;
                case 1019184907: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r2 = r0
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r2 = 3
            goto L_0x0051
        L_0x0033:
            java.lang.String r1 = "android.os.action.CHARGING"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            r2 = 2
            goto L_0x0051
        L_0x003e:
            java.lang.String r1 = "android.os.action.DISCHARGING"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0047:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0050
            goto L_0x0026
        L_0x0050:
            r2 = r4
        L_0x0051:
            switch(r2) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0061;
                case 2: goto L_0x005b;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x006c
        L_0x0055:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.mo63b(r7)
            goto L_0x006c
        L_0x005b:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.mo63b(r7)
            goto L_0x006c
        L_0x0061:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.mo63b(r7)
            goto L_0x006c
        L_0x0067:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.mo63b(r7)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004a3.C0024a.mo59f(android.content.Intent):void");
    }
}
