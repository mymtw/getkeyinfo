package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p762or.C20023b;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenReceiver */
final class FlowableRepeatWhen$WhenReceiver<T, U> extends AtomicInteger implements C8056i<Object>, Subscription {
    private static final long serialVersionUID = 2827772011130406689L;
    public final AtomicLong requested = new AtomicLong();
    public final C20023b<T> source;
    public FlowableRepeatWhen$WhenSourceSubscriber<T, U> subscriber;
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();

    public FlowableRepeatWhen$WhenReceiver(C20023b<T> bVar) {
        this.source = bVar;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
    }

    public void onComplete() {
        this.subscriber.cancel();
        this.subscriber.downstream.onComplete();
    }

    public void onError(Throwable th) {
        this.subscriber.cancel();
        this.subscriber.downstream.onError(th);
    }

    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.source.subscribe(this.subscriber);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
    }

    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }
}
