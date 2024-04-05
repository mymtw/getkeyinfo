package p517bn;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import p605kk.C18124h;

/* renamed from: bn.v */
public final /* synthetic */ class C14131v implements Runnable {

    /* renamed from: b */
    public /* synthetic */ Context f31128b;

    /* renamed from: c */
    public /* synthetic */ boolean f31129c;

    /* renamed from: d */
    public /* synthetic */ C18124h f31130d;

    public /* synthetic */ C14131v(Context context, boolean z, C18124h hVar) {
        this.f31128b = context;
        this.f31129c = z;
        this.f31130d = hVar;
    }

    public final void run() {
        Context context = this.f31128b;
        boolean z = this.f31129c;
        C18124h hVar = this.f31130d;
        try {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                String valueOf = String.valueOf(context.getPackageName());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "error configuring notification delegate for package ".concat(valueOf) : new String("error configuring notification delegate for package "));
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
            }
        } finally {
            hVar.mo69680d(null);
        }
    }
}
