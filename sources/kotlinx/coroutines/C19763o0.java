package kotlinx.coroutines;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: kotlinx.coroutines.o0 */
public final class C19763o0 implements C19766p0 {

    /* renamed from: b */
    public final Future<?> f43722b;

    public C19763o0(ScheduledFuture scheduledFuture) {
        this.f43722b = scheduledFuture;
    }

    public final void dispose() {
        this.f43722b.cancel(false);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DisposableFutureHandle[");
        h.append(this.f43722b);
        h.append(']');
        return h.toString();
    }
}
