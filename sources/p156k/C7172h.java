package p156k;

import android.app.PendingIntent;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;

/* renamed from: k.h */
public final class C7172h {

    /* renamed from: a */
    public final ICustomTabsCallback f15947a;

    /* renamed from: b */
    public final PendingIntent f15948b;

    public C7172h(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f15947a = iCustomTabsCallback;
        this.f15948b = pendingIntent;
    }

    /* renamed from: a */
    public final IBinder mo19461a() {
        ICustomTabsCallback iCustomTabsCallback = this.f15947a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7172h)) {
            return false;
        }
        C7172h hVar = (C7172h) obj;
        PendingIntent pendingIntent = hVar.f15948b;
        PendingIntent pendingIntent2 = this.f15948b;
        boolean z = true;
        boolean z2 = pendingIntent2 == null;
        if (pendingIntent != null) {
            z = false;
        }
        if (z2 != z) {
            return false;
        }
        return pendingIntent2 != null ? pendingIntent2.equals(pendingIntent) : mo19461a().equals(hVar.mo19461a());
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f15948b;
        return pendingIntent != null ? pendingIntent.hashCode() : mo19461a().hashCode();
    }
}
