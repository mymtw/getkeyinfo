package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C3422l;
import androidx.work.C3424m;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import p252u2.C8129j;

public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String TAG = C3422l.m8214e("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C3422l.m8213c().mo12926a(TAG, "Requesting diagnostics", new Throwable[0]);
            try {
                C8129j e = C8129j.m16345e(context);
                e.getClass();
                e.mo12962c(Collections.singletonList((C3424m) new C3424m.C3425a(DiagnosticsWorker.class).mo12964a()));
            } catch (IllegalStateException e2) {
                C3422l.m8213c().mo12927b(TAG, "WorkManager is not initialized", e2);
            }
        }
    }
}
