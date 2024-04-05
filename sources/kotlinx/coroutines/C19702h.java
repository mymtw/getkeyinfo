package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import kotlin.C19394m;

/* renamed from: kotlinx.coroutines.h */
public final class C19702h extends C19705i {

    /* renamed from: b */
    public final Future<?> f43636b;

    public C19702h(ScheduledFuture scheduledFuture) {
        this.f43636b = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo72155a(Throwable th) {
        if (th != null) {
            this.f43636b.cancel(false);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72155a((Throwable) obj);
        return C19394m.f43287a;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CancelFutureOnCancel[");
        h.append(this.f43636b);
        h.append(']');
        return h.toString();
    }
}
