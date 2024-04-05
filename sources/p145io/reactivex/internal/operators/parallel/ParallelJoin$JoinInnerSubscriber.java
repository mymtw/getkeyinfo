package p145io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p503zp.C13972h;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber */
final class ParallelJoin$JoinInnerSubscriber<T> extends AtomicReference<Subscription> implements C8056i<T> {
    private static final long serialVersionUID = 8410034718427740355L;
    public final int limit;
    public final ParallelJoin$JoinSubscriptionBase<T> parent;
    public final int prefetch;
    public long produced;
    public volatile C13972h<T> queue;

    public ParallelJoin$JoinInnerSubscriber(ParallelJoin$JoinSubscriptionBase<T> parallelJoin$JoinSubscriptionBase, int i) {
        this.parent = parallelJoin$JoinSubscriptionBase;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public boolean cancel() {
        return SubscriptionHelper.cancel(this);
    }

    public C13972h<T> getQueue() {
        C13972h<T> hVar = this.queue;
        if (hVar != null) {
            return hVar;
        }
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        this.queue = spscArrayQueue;
        return spscArrayQueue;
    }

    public void onComplete() {
        this.parent.onComplete();
    }

    public void onError(Throwable th) {
        this.parent.onError(th);
    }

    public void onNext(T t) {
        this.parent.onNext(this, t);
    }

    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, (long) this.prefetch);
    }

    public void request(long j) {
        long j2 = this.produced + j;
        if (j2 >= ((long) this.limit)) {
            this.produced = 0;
            ((Subscription) get()).request(j2);
            return;
        }
        this.produced = j2;
    }

    public void requestOne() {
        long j = this.produced + 1;
        if (j == ((long) this.limit)) {
            this.produced = 0;
            ((Subscription) get()).request(j);
            return;
        }
        this.produced = j;
    }
}
