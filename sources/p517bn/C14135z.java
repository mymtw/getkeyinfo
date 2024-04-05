package p517bn;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bn.z */
public final class C14135z implements Runnable {

    /* renamed from: b */
    public final long f31143b;

    /* renamed from: c */
    public final PowerManager.WakeLock f31144c;

    /* renamed from: d */
    public final FirebaseMessaging f31145d;

    @VisibleForTesting
    /* renamed from: bn.z$a */
    public static class C14136a extends BroadcastReceiver {

        /* renamed from: a */
        public C14135z f31146a;

        public C14136a(C14135z zVar) {
            this.f31146a = zVar;
        }

        /* renamed from: a */
        public final void mo47032a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f31146a.mo47028a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final void onReceive(Context context, Intent intent) {
            C14135z zVar = this.f31146a;
            if (zVar != null && zVar.mo47029b()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                C14135z zVar2 = this.f31146a;
                zVar2.f31145d.enqueueTaskWithDelaySeconds(zVar2, 0);
                this.f31146a.mo47028a().unregisterReceiver(this);
                this.f31146a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    @VisibleForTesting
    public C14135z(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f31145d = firebaseMessaging;
        this.f31143b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo47028a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f31144c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    public final Context mo47028a() {
        return this.f31145d.getApplicationContext();
    }

    /* renamed from: b */
    public final boolean mo47029b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo47028a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    /* renamed from: c */
    public final boolean mo47030c() throws IOException {
        boolean z = true;
        try {
            if (this.f31145d.blockingGetToken() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", sb.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        if (C14133x.m21880a().mo47027c(mo47028a())) {
            this.f31144c.acquire();
        }
        try {
            this.f31145d.setSyncScheduledOrRunning(true);
            if (!this.f31145d.isGmsCorePresent()) {
                this.f31145d.setSyncScheduledOrRunning(false);
                if (!C14133x.m21880a().mo47027c(mo47028a())) {
                    return;
                }
            } else if (!C14133x.m21880a().mo47026b(mo47028a()) || mo47029b()) {
                if (mo47030c()) {
                    this.f31145d.setSyncScheduledOrRunning(false);
                } else {
                    this.f31145d.syncWithDelaySecondsInternal(this.f31143b);
                }
                if (!C14133x.m21880a().mo47027c(mo47028a())) {
                    return;
                }
            } else {
                new C14136a(this).mo47032a();
                if (!C14133x.m21880a().mo47027c(mo47028a())) {
                    return;
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseMessaging", sb.toString());
            this.f31145d.setSyncScheduledOrRunning(false);
            if (!C14133x.m21880a().mo47027c(mo47028a())) {
                return;
            }
        } catch (Throwable th) {
            if (C14133x.m21880a().mo47027c(mo47028a())) {
                this.f31144c.release();
            }
            throw th;
        }
        this.f31144c.release();
    }
}
