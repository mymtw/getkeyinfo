package p004a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C3422l;
import p090e3.C6712a;

/* renamed from: a3.f */
public final class C0032f extends C0026c<Boolean> {

    /* renamed from: i */
    public static final String f71i = C3422l.m8214e("StorageNotLowTracker");

    public C0032f(Context context, C6712a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final Object mo57a() {
        Intent registerReceiver = this.f61b.registerReceiver((BroadcastReceiver) null, mo58e());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: e */
    public final IntentFilter mo58e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: f */
    public final void mo59f(Intent intent) {
        if (intent.getAction() != null) {
            C3422l.m8213c().mo12926a(f71i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                mo63b(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                mo63b(Boolean.TRUE);
            }
        }
    }
}
