package p517bn;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;

@KeepForSdk
/* renamed from: bn.x */
public final class C14133x {

    /* renamed from: e */
    public static C14133x f31133e;

    /* renamed from: a */
    public String f31134a = null;

    /* renamed from: b */
    public Boolean f31135b = null;

    /* renamed from: c */
    public Boolean f31136c = null;

    /* renamed from: d */
    public final ArrayDeque f31137d = new ArrayDeque();

    /* renamed from: a */
    public static synchronized C14133x m21880a() {
        C14133x xVar;
        synchronized (C14133x.class) {
            if (f31133e == null) {
                f31133e = new C14133x();
            }
            xVar = f31133e;
        }
        return xVar;
    }

    /* renamed from: b */
    public final boolean mo47026b(Context context) {
        if (this.f31136c == null) {
            this.f31136c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f31135b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f31136c.booleanValue();
    }

    /* renamed from: c */
    public final boolean mo47027c(Context context) {
        if (this.f31135b == null) {
            this.f31135b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f31135b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f31135b.booleanValue();
    }
}
