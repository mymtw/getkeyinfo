package p517bn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: bn.e0 */
public final class C14111e0 implements Runnable {

    /* renamed from: g */
    public static final Object f31084g = new Object();

    /* renamed from: h */
    public static Boolean f31085h;

    /* renamed from: i */
    public static Boolean f31086i;

    /* renamed from: b */
    public final Context f31087b;

    /* renamed from: c */
    public final C14129t f31088c;

    /* renamed from: d */
    public final PowerManager.WakeLock f31089d;

    /* renamed from: e */
    public final C14109d0 f31090e;

    /* renamed from: f */
    public final long f31091f;

    /* renamed from: bn.e0$a */
    public class C14112a extends BroadcastReceiver {

        /* renamed from: a */
        public C14111e0 f31092a;

        public C14112a(C14111e0 e0Var) {
            this.f31092a = e0Var;
        }

        /* renamed from: a */
        public final void mo46990a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            C14111e0.this.f31087b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            C14111e0 e0Var = this.f31092a;
            if (e0Var != null) {
                if (e0Var.mo46988d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    C14111e0 e0Var2 = this.f31092a;
                    e0Var2.f31090e.f31079f.schedule(e0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f31092a = null;
                }
            }
        }
    }

    public C14111e0(C14109d0 d0Var, Context context, C14129t tVar, long j) {
        this.f31090e = d0Var;
        this.f31087b = context;
        this.f31091f = j;
        this.f31088c = tVar;
        this.f31089d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: a */
    public static boolean m21848a(Context context) {
        boolean booleanValue;
        synchronized (f31084g) {
            Boolean bool = f31086i;
            Boolean valueOf = Boolean.valueOf(bool == null ? m21849b("android.permission.ACCESS_NETWORK_STATE", bool, context) : bool.booleanValue());
            f31086i = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: b */
    public static boolean m21849b(String str, Boolean bool, Context context) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        Log.d("FirebaseMessaging", sb.toString());
        return false;
    }

    /* renamed from: c */
    public static boolean m21850c(Context context) {
        boolean booleanValue;
        synchronized (f31084g) {
            Boolean bool = f31085h;
            Boolean valueOf = Boolean.valueOf(bool == null ? m21849b("android.permission.WAKE_LOCK", bool, context) : bool.booleanValue());
            f31085h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: d */
    public final synchronized boolean mo46988d() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f31087b.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x00e2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0041, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r3 = java.lang.String.valueOf(r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00a7, code lost:
        if (r3.length() != 0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00a9, code lost:
        r3 = "Failed to sync topics. Won't retry sync. ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ae, code lost:
        r3 = new java.lang.String("Failed to sync topics. Won't retry sync. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00b3, code lost:
        android.util.Log.e("FirebaseMessaging", r3);
        r3 = r6.f31090e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00b8, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r3.f31080g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00c2, code lost:
        if (m21850c(r6.f31087b) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r6.f31089d.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00ca, code lost:
        android.util.Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x00d7, code lost:
        if (m21850c(r6.f31087b) != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r6.f31089d.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x00df, code lost:
        android.util.Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"Wakelock"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "TopicsSyncTask's wakelock was already released due to timeout."
            java.lang.String r1 = "FirebaseMessaging"
            android.content.Context r2 = r6.f31087b
            boolean r2 = m21850c(r2)
            if (r2 == 0) goto L_0x0013
            android.os.PowerManager$WakeLock r2 = r6.f31089d
            long r3 = p517bn.C14104b.f31060a
            r2.acquire(r3)
        L_0x0013:
            r2 = 0
            bn.d0 r3 = r6.f31090e     // Catch:{ IOException -> 0x0041 }
            r4 = 1
            monitor-enter(r3)     // Catch:{ IOException -> 0x0041 }
            r3.f31080g = r4     // Catch:{ all -> 0x0096 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            bn.t r3 = r6.f31088c     // Catch:{ IOException -> 0x0041 }
            boolean r3 = r3.mo47012c()     // Catch:{ IOException -> 0x0041 }
            if (r3 != 0) goto L_0x0043
            bn.d0 r3 = r6.f31090e     // Catch:{ IOException -> 0x0041 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0041 }
            r3.f31080g = r2     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            android.content.Context r2 = r6.f31087b
            boolean r2 = m21850c(r2)
            if (r2 == 0) goto L_0x003a
            android.os.PowerManager$WakeLock r2 = r6.f31089d     // Catch:{ RuntimeException -> 0x0037 }
            r2.release()     // Catch:{ RuntimeException -> 0x0037 }
            return
        L_0x0037:
            android.util.Log.i(r1, r0)
        L_0x003a:
            return
        L_0x003b:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            throw r4     // Catch:{ IOException -> 0x0041 }
        L_0x003e:
            r2 = move-exception
            goto L_0x00d1
        L_0x0041:
            r3 = move-exception
            goto L_0x0099
        L_0x0043:
            android.content.Context r3 = r6.f31087b     // Catch:{ IOException -> 0x0041 }
            boolean r3 = m21848a(r3)     // Catch:{ IOException -> 0x0041 }
            if (r3 == 0) goto L_0x006b
            boolean r3 = r6.mo46988d()     // Catch:{ IOException -> 0x0041 }
            if (r3 != 0) goto L_0x006b
            bn.e0$a r3 = new bn.e0$a     // Catch:{ IOException -> 0x0041 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0041 }
            r3.mo46990a()     // Catch:{ IOException -> 0x0041 }
            android.content.Context r2 = r6.f31087b
            boolean r2 = m21850c(r2)
            if (r2 == 0) goto L_0x006a
            android.os.PowerManager$WakeLock r2 = r6.f31089d     // Catch:{ RuntimeException -> 0x0067 }
            r2.release()     // Catch:{ RuntimeException -> 0x0067 }
            return
        L_0x0067:
            android.util.Log.i(r1, r0)
        L_0x006a:
            return
        L_0x006b:
            bn.d0 r3 = r6.f31090e     // Catch:{ IOException -> 0x0041 }
            boolean r3 = r3.mo46986g()     // Catch:{ IOException -> 0x0041 }
            if (r3 == 0) goto L_0x007d
            bn.d0 r3 = r6.f31090e     // Catch:{ IOException -> 0x0041 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0041 }
            r3.f31080g = r2     // Catch:{ all -> 0x007a }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            goto L_0x0084
        L_0x007a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            throw r4     // Catch:{ IOException -> 0x0041 }
        L_0x007d:
            bn.d0 r3 = r6.f31090e     // Catch:{ IOException -> 0x0041 }
            long r4 = r6.f31091f     // Catch:{ IOException -> 0x0041 }
            r3.mo46987h(r4)     // Catch:{ IOException -> 0x0041 }
        L_0x0084:
            android.content.Context r2 = r6.f31087b
            boolean r2 = m21850c(r2)
            if (r2 == 0) goto L_0x00cd
            android.os.PowerManager$WakeLock r2 = r6.f31089d     // Catch:{ RuntimeException -> 0x0092 }
            r2.release()     // Catch:{ RuntimeException -> 0x0092 }
            return
        L_0x0092:
            android.util.Log.i(r1, r0)
            return
        L_0x0096:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0041 }
            throw r4     // Catch:{ IOException -> 0x0041 }
        L_0x0099:
            java.lang.String r4 = "Failed to sync topics. Won't retry sync. "
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x003e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x003e }
            int r5 = r3.length()     // Catch:{ all -> 0x003e }
            if (r5 == 0) goto L_0x00ae
            java.lang.String r3 = r4.concat(r3)     // Catch:{ all -> 0x003e }
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x003e }
            r3.<init>(r4)     // Catch:{ all -> 0x003e }
        L_0x00b3:
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x003e }
            bn.d0 r3 = r6.f31090e     // Catch:{ all -> 0x003e }
            monitor-enter(r3)     // Catch:{ all -> 0x003e }
            r3.f31080g = r2     // Catch:{ all -> 0x00ce }
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            android.content.Context r2 = r6.f31087b
            boolean r2 = m21850c(r2)
            if (r2 == 0) goto L_0x00cd
            android.os.PowerManager$WakeLock r2 = r6.f31089d     // Catch:{ RuntimeException -> 0x00ca }
            r2.release()     // Catch:{ RuntimeException -> 0x00ca }
            return
        L_0x00ca:
            android.util.Log.i(r1, r0)
        L_0x00cd:
            return
        L_0x00ce:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r2     // Catch:{ all -> 0x003e }
        L_0x00d1:
            android.content.Context r3 = r6.f31087b
            boolean r3 = m21850c(r3)
            if (r3 == 0) goto L_0x00e2
            android.os.PowerManager$WakeLock r3 = r6.f31089d     // Catch:{ RuntimeException -> 0x00df }
            r3.release()     // Catch:{ RuntimeException -> 0x00df }
            goto L_0x00e2
        L_0x00df:
            android.util.Log.i(r1, r0)
        L_0x00e2:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p517bn.C14111e0.run():void");
    }
}
