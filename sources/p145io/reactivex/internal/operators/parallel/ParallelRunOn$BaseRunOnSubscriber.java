package p145io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.parallel.ParallelRunOn$BaseRunOnSubscriber */
abstract class ParallelRunOn$BaseRunOnSubscriber<T> extends AtomicInteger implements C8056i<T>, Subscription, Runnable {
    private static final long serialVersionUID = 9222303586456402150L;
    public volatile boolean cancelled;
    public int consumed;
    public volatile boolean done;
    public Throwable error;
    public final int limit;
    public final int prefetch;
    public final SpscArrayQueue<T> queue;
    public final AtomicLong requested = new AtomicLong();
    public Subscription upstream;
    public final C8066r.C8069c worker;

    public ParallelRunOn$BaseRunOnSubscriber(int i, SpscArrayQueue<T> spscArrayQueue, C8066r.C8069c cVar) {
        this.prefetch = i;
        this.queue = spscArrayQueue;
        this.limit = i - (i >> 2);
        this.worker = cVar;
    }

    public final void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    public final void onComplete() {
        if (!this.done) {
            this.done = true;
            schedule();
        }
    }

    public final void onError(Throwable th) {
        if (this.done) {
            C18981a.m32123b(th);
            return;
        }
        this.error = th;
        this.done = true;
        schedule();
    }

    public final void onNext(T t) {
        if (!this.done) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
                return;
            }
            schedule();
        }
    }

    public abstract /* synthetic */ void onSubscribe(Subscription subscription);

    public final void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this.requested, j);
            schedule();
        }
    }

    public final void schedule() {
        if (getAndIncrement() == 0) {
            this.worker.mo20652a(this);
        }
    }
}
