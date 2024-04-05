package p145io.reactivex.internal.subscriptions;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.subscriptions.BooleanSubscription */
public final class BooleanSubscription extends AtomicBoolean implements Subscription {
    private static final long serialVersionUID = -8127758972444290902L;

    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("BooleanSubscription(cancelled=");
        h.append(get());
        h.append(")");
        return h.toString();
    }
}
