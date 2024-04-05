package p145io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase */
abstract class ParallelJoin$JoinSubscriptionBase<T> extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = 3100232009247827843L;
    public volatile boolean cancelled;
    public final AtomicInteger done = new AtomicInteger();
    public final C20024c<? super T> downstream;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final AtomicLong requested = new AtomicLong();
    public final ParallelJoin$JoinInnerSubscriber<T>[] subscribers;

    public ParallelJoin$JoinSubscriptionBase(C20024c<? super T> cVar, int i, int i2) {
        this.downstream = cVar;
        ParallelJoin$JoinInnerSubscriber<T>[] parallelJoin$JoinInnerSubscriberArr = new ParallelJoin$JoinInnerSubscriber[i];
        for (int i3 = 0; i3 < i; i3++) {
            parallelJoin$JoinInnerSubscriberArr[i3] = new ParallelJoin$JoinInnerSubscriber<>(this, i2);
        }
        this.subscribers = parallelJoin$JoinInnerSubscriberArr;
        this.done.lazySet(i);
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                cleanup();
            }
        }
    }

    public void cancelAll() {
        for (ParallelJoin$JoinInnerSubscriber<T> cancel : this.subscribers) {
            cancel.cancel();
        }
    }

    public void cleanup() {
        for (ParallelJoin$JoinInnerSubscriber<T> parallelJoin$JoinInnerSubscriber : this.subscribers) {
            parallelJoin$JoinInnerSubscriber.queue = null;
        }
    }

    public abstract void drain();

    public abstract void onComplete();

    public abstract void onError(Throwable th);

    public abstract void onNext(ParallelJoin$JoinInnerSubscriber<T> parallelJoin$JoinInnerSubscriber, T t);

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            drain();
        }
    }
}
