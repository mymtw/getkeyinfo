package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import androidx.work.C3422l;
import androidx.work.impl.background.systemalarm.C3401d;
import java.util.HashMap;
import java.util.WeakHashMap;
import p079d3.C6641m;

public class SystemAlarmService extends LifecycleService implements C3401d.C3404c {
    private static final String TAG = C3422l.m8214e("SystemAlarmService");
    private C3401d mDispatcher;
    private boolean mIsShutdown;

    private void initializeDispatcher() {
        C3401d dVar = new C3401d(this);
        this.mDispatcher = dVar;
        if (dVar.f7957k != null) {
            C3422l.m8213c().mo12927b(C3401d.f7947l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.f7957k = this;
        }
    }

    public void onAllCommandsCompleted() {
        this.mIsShutdown = true;
        C3422l.m8213c().mo12926a(TAG, "All commands completed in dispatcher", new Throwable[0]);
        String str = C6641m.f14654a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = C6641m.f14655b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C3422l.m8213c().mo12929f(C6641m.f14654a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        initializeDispatcher();
        this.mIsShutdown = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mIsShutdown = true;
        this.mDispatcher.mo12875c();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            C3422l.m8213c().mo12928d(TAG, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.mDispatcher.mo12875c();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.mo12873a(i2, intent);
        return 3;
    }
}
