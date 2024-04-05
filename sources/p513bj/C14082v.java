package p513bj;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: bj.v */
public final class C14082v implements C14046a {
    /* renamed from: a */
    public final long mo46865a() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public final C14083w mo46866b(Looper looper, Handler.Callback callback) {
        return new C14083w(new Handler(looper, callback));
    }

    /* renamed from: c */
    public final void mo46867c() {
    }

    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
