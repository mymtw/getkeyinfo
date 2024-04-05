package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.p013v4.media.C0069a;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p605kk.C18124h;

/* renamed from: com.google.firebase.messaging.c */
public final class C16588c implements ServiceConnection {

    /* renamed from: b */
    public final Context f36801b;

    /* renamed from: c */
    public final Intent f36802c;

    /* renamed from: d */
    public final ScheduledExecutorService f36803d;

    /* renamed from: e */
    public final ArrayDeque f36804e = new ArrayDeque();

    /* renamed from: f */
    public C16586b f36805f;

    /* renamed from: g */
    public boolean f36806g = false;

    /* renamed from: com.google.firebase.messaging.c$a */
    public static class C16589a {

        /* renamed from: a */
        public final Intent f36807a;

        /* renamed from: b */
        public final C18124h<Void> f36808b = new C18124h<>();

        public C16589a(Intent intent) {
            this.f36807a = intent;
        }
    }

    public C16588c(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f36801b = applicationContext;
        this.f36802c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f36803d = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public final synchronized void mo59203a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f36804e.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            C16586b bVar = this.f36805f;
            if (bVar == null || !bVar.isBinderAlive()) {
                mo59204b();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f36805f.mo59202a((C16589a) this.f36804e.poll());
        }
    }

    /* renamed from: b */
    public final void mo59204b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z = this.f36806g;
            StringBuilder g = C0069a.m176g(39, "binder is dead. start connection? ");
            g.append(!z);
            Log.d("FirebaseMessaging", g.toString());
        }
        if (!this.f36806g) {
            this.f36806g = true;
            try {
                if (!ConnectionTracker.getInstance().bindService(this.f36801b, this.f36802c, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f36806g = false;
                    while (!this.f36804e.isEmpty()) {
                        ((C16589a) this.f36804e.poll()).f36808b.mo69680d(null);
                    }
                }
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.f36806g = false;
        if (!(iBinder instanceof C16586b)) {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(iBinder)));
            while (!this.f36804e.isEmpty()) {
                ((C16589a) this.f36804e.poll()).f36808b.mo69680d(null);
            }
            return;
        }
        this.f36805f = (C16586b) iBinder;
        mo59203a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        mo59203a();
    }
}
