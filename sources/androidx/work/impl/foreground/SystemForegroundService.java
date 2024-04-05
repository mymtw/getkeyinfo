package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.C3422l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C3409a;
import java.util.UUID;
import p023b3.C3474b;
import p079d3.C6628a;
import p090e3.C6713b;
import p252u2.C8121c;
import p252u2.C8129j;

public class SystemForegroundService extends LifecycleService implements C3409a.C3410a {
    private static final String TAG = C3422l.m8214e("SystemFgService");
    private static SystemForegroundService sForegroundService = null;
    public C3409a mDispatcher;
    private Handler mHandler;
    private boolean mIsShutdown;
    public NotificationManager mNotificationManager;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    public class C3406a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f7963b;

        /* renamed from: c */
        public final /* synthetic */ Notification f7964c;

        /* renamed from: d */
        public final /* synthetic */ int f7965d;

        public C3406a(int i, Notification notification, int i2) {
            this.f7963b = i;
            this.f7964c = notification;
            this.f7965d = i2;
        }

        public final void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f7963b, this.f7964c, this.f7965d);
            } else {
                SystemForegroundService.this.startForeground(this.f7963b, this.f7964c);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    public class C3407b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f7967b;

        /* renamed from: c */
        public final /* synthetic */ Notification f7968c;

        public C3407b(int i, Notification notification) {
            this.f7967b = i;
            this.f7968c = notification;
        }

        public final void run() {
            SystemForegroundService.this.mNotificationManager.notify(this.f7967b, this.f7968c);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    public class C3408c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f7970b;

        public C3408c(int i) {
            this.f7970b = i;
        }

        public final void run() {
            SystemForegroundService.this.mNotificationManager.cancel(this.f7970b);
        }
    }

    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    private void initializeDispatcher() {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        C3409a aVar = new C3409a(getApplicationContext());
        this.mDispatcher = aVar;
        if (aVar.f7982k != null) {
            C3422l.m8213c().mo12927b(C3409a.f7972l, "A callback already exists.", new Throwable[0]);
        } else {
            aVar.f7982k = this;
        }
    }

    public void cancelNotification(int i) {
        this.mHandler.post(new C3408c(i));
    }

    public void notify(int i, Notification notification) {
        this.mHandler.post(new C3407b(i, notification));
    }

    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    public void onDestroy() {
        super.onDestroy();
        C3409a aVar = this.mDispatcher;
        aVar.f7982k = null;
        synchronized (aVar.f7976e) {
            aVar.f7981j.mo20961c();
        }
        C8121c cVar = aVar.f7974c.f17766f;
        synchronized (cVar.f17740l) {
            cVar.f17739k.remove(aVar);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            C3422l.m8213c().mo12928d(TAG, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            C3409a aVar = this.mDispatcher;
            aVar.f7982k = null;
            synchronized (aVar.f7976e) {
                aVar.f7981j.mo20961c();
            }
            C8121c cVar = aVar.f7974c.f17766f;
            synchronized (cVar.f17740l) {
                cVar.f17739k.remove(aVar);
            }
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        C3409a aVar2 = this.mDispatcher;
        aVar2.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C3422l.m8213c().mo12928d(C3409a.f7972l, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = aVar2.f7974c.f17763c;
            ((C6713b) aVar2.f7975d).mo18901a(new C3474b(aVar2, workDatabase, stringExtra));
            aVar2.mo12893d(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            aVar2.mo12893d(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            C3422l.m8213c().mo12928d(C3409a.f7972l, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            C8129j jVar = aVar2.f7974c;
            UUID fromString = UUID.fromString(stringExtra2);
            jVar.getClass();
            ((C6713b) jVar.f17764d).mo18901a(new C6628a(jVar, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            C3422l.m8213c().mo12928d(C3409a.f7972l, "Stopping foreground service", new Throwable[0]);
            C3409a.C3410a aVar3 = aVar2.f7982k;
            if (aVar3 == null) {
                return 3;
            }
            aVar3.stop();
            return 3;
        }
    }

    public void startForeground(int i, int i2, Notification notification) {
        this.mHandler.post(new C3406a(i, notification, i2));
    }

    public void stop() {
        this.mIsShutdown = true;
        C3422l.m8213c().mo12926a(TAG, "All commands completed.", new Throwable[0]);
        stopForeground(true);
        sForegroundService = null;
        stopSelf();
    }
}
