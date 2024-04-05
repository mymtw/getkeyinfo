package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C3422l;
import p252u2.C8129j;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String TAG = C3422l.m8214e("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C3422l.m8213c().mo12926a(TAG, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        try {
            C8129j e = C8129j.m16345e(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            e.getClass();
            synchronized (C8129j.f17760l) {
                e.f17769i = goAsync;
                if (e.f17768h) {
                    goAsync.finish();
                    e.f17769i = null;
                }
            }
        } catch (IllegalStateException e2) {
            C3422l.m8213c().mo12927b(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
