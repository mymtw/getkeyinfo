package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p248tp.C8056i;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRepeat$RepeatSubscriber */
final class FlowableRepeat$RepeatSubscriber<T> extends AtomicInteger implements C8056i<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    public final C20024c<? super T> downstream;
    public long produced;
    public long remaining;

    /* renamed from: sa */
    public final SubscriptionArbiter f42650sa;
    public final C20023b<? extends T> source;

    public FlowableRepeat$RepeatSubscriber(C20024c<? super T> cVar, long j, SubscriptionArbiter subscriptionArbiter, C20023b<? extends T> bVar) {
        this.downstream = cVar;
        this.f42650sa = subscriptionArbiter;
        this.source = bVar;
        this.remaining = j;
    }

    public void onComplete() {
        long j = this.remaining;
        if (j != Long.MAX_VALUE) {
            this.remaining = j - 1;
        }
        if (j != 0) {
            subscribeNext();
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        this.f42650sa.setSubscription(subscription);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.f42650sa.isCancelled()) {
                long j = this.produced;
                if (j != 0) {
                    this.produced = 0;
                    this.f42650sa.produced(j);
                }
                this.source.subscribe(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
