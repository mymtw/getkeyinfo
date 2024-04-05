package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.measurement.internal.C15111v3;
import com.google.firebase.messaging.C16586b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p276w7.C8261d;
import p517bn.C14108d;
import p517bn.C14114f0;
import p605kk.C18123g;
import p605kk.C18124h;
import p605kk.C18126j;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    private Binder binder;
    public final ExecutorService executor;
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    public class C16581a implements C16586b.C16587a {
        public C16581a() {
        }
    }

    public EnhancedIntentService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            synchronized (C14114f0.f31097b) {
                if (C14114f0.f31098c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    C14114f0.f31098c.mo69578c();
                }
            }
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* access modifiers changed from: private */
    public C18123g<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C18126j.m30617e((Object) null);
        }
        C18124h hVar = new C18124h();
        this.executor.execute(new C15111v3(this, 1, intent, hVar));
        return hVar.f39566a;
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    /* renamed from: lambda$onStartCommand$1$com-google-firebase-messaging-EnhancedIntentService */
    public /* synthetic */ void mo59146x83fa35aa(Intent intent, C18123g gVar) {
        finishTask(intent);
    }

    /* renamed from: lambda$processIntent$0$com-google-firebase-messaging-EnhancedIntentService */
    public /* synthetic */ void mo59147x624ce8b2(Intent intent, C18124h hVar) {
        try {
            handleIntent(intent);
        } finally {
            hVar.mo69678b(null);
        }
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new C16586b(new C16581a());
        }
        return this.binder;
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        C18123g<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.mo69667n()) {
            finishTask(intent);
            return 2;
        }
        processIntent.mo69655b(C14108d.f31071b, new C8261d(this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
