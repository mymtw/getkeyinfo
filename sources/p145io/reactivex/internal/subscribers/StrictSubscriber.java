package p145io.reactivex.internal.subscribers;

import android.support.p013v4.media.C0073e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8056i;
import p514bk.C14088a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.subscribers.StrictSubscriber */
public class StrictSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription {
    private static final long serialVersionUID = -4945028590049415624L;
    public volatile boolean done;
    public final C20024c<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicBoolean once = new AtomicBoolean();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    public StrictSubscriber(C20024c<? super T> cVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    public void onComplete() {
        this.done = true;
        C14088a.m21790s(this.downstream, this, this.error);
    }

    public void onError(Throwable th) {
        this.done = true;
        C14088a.m21792u(this.downstream, th, this, this.error);
    }

    public void onNext(T t) {
        C14088a.m21794w(this.downstream, t, this, this.error);
    }

    public void onSubscribe(Subscription subscription) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
            return;
        }
        subscription.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(C0073e.m205e("§3.9 violated: positive request amount required but it was ", j)));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }
}
